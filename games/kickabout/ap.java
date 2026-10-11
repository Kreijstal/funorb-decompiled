/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap extends js {
    private gr field_n;
    int field_h;
    boolean field_A;
    nu field_o;
    private boolean field_D;
    boolean field_v;
    private int field_E;
    private boolean field_y;
    int[] field_z;
    private hs field_r;
    nu field_i;
    private up[] field_k;
    nu field_m;
    boolean field_g;
    boolean field_q;
    int field_B;
    static kj field_w;
    boolean field_s;
    boolean field_t;
    private boolean field_u;
    static tf field_j;
    static ah field_p;
    static String field_x;
    static ut field_l;

    final void f(int param0) {
        if (!this.field_t) {
          throw new IllegalStateException();
        }
        if (!this.e(-2) &&
          !this.field_o.field_R[this.field_h].field_s) {
          this.a(-16046, 2);
        }
        int var2 = 63 / ((33 - param0) / 49);
    }

    final boolean d(byte param0) {
        int var2 = -114 % ((19 - param0) / 39);
        return this.field_r instanceof ol;
    }

    final static void a(byte param0, sj param1) {
        int var3_int = 0;
        vn[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        var8 = Kickabout.field_G;
        try {
          sk.a(param0 - 15, 5, 1);
          var9 = new String[]{"tank", "striker", "specialist", "scout", "keeper"};
          for (var3_int = 0; var3_int < 5; var3_int++) {
            iw.field_m[var3_int] = vn.a(param1, "", "Characters/" + var9[var3_int] + "_body");
            for (var4 = 0; var4 < 5; var4++) {
              wj.field_v[var3_int][var4] = vn.a(param1, "", "Characters/" + var9[var3_int] + "_head_0" + (var4 + 1));
            }
            kb.field_B[var3_int] = o.a(107, new vn(new vn[]{iw.field_m[var3_int], wj.field_v[var3_int][0]}, 2));
          }
          sk.a(param0 + 111, 5, 2);
          var3 = new vn[9];
          var3[0] = vn.a(param1, "", "balls/skin_football");
          var3[1] = vn.a(param1, "", "balls/skin_beachball");
          var3[2] = vn.a(param1, "", "balls/skin_basketball");
          var3[3] = vn.a(param1, "", "balls/skin_atom");
          var3[4] = vn.a(param1, "", "balls/skin_tennisball");
          var3[5] = vn.a(param1, "", "balls/sphere");
          var3[8] = vn.a(param1, "", "balls/sphere_halloween");
          var3[6] = vn.a(param1, "", "balls/planet2");
          var3[7] = vn.a(param1, "", "balls/asteroid_craters_3");
          sk.a(-104, 5, 3);
          if (param0 != -34) {
            ap.a(true);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < 9; var4Lifetime1++) {
            if (var4Lifetime1 == 7) {
              var5 = new int[]{1000, -1000, 45, 532};
              var6 = var5[0] * t.field_o[0] >> 16;
              var7 = var5[0] * t.field_f[0] >> 16;
              qo.field_l[var4Lifetime1] = var3[var4Lifetime1].b(var5[2], var5[3], var6, var5[1], var7);
            } else {
              qo.field_l[var4Lifetime1] = (eg) (var3[var4Lifetime1].a(110, 131072, 1, 1, 1));
            }
          }
          sk.a(72, 5, 4);
          gw.field_f[0] = vn.a(param1, "", "fans/fan_01");
          gw.field_f[1] = vn.a(param1, "", "fans/fan_02");
          gw.field_f[2] = vn.a(param1, "", "fans/fan_03");
          gw.field_f[3] = vn.a(param1, "", "fans/fan_04");
          gw.field_f[4] = vn.a(param1, "", "fans/fan_05");
          of.field_f = vn.a(param1, "", "characters/torso");
          es.field_k = vn.a(param1, "", "characters/keeper_body_halloween");
          qd.field_j = new vn[5];
          for (var4Lifetime2 = 0; 5 > var4Lifetime2; var4Lifetime2++) {
            qd.field_j[var4Lifetime2] = vn.a(param1, "", "characters/" + var9[var4Lifetime2] + "_head_halloween");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ap.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean f(byte param0) {
        boolean stackIn_16_0 = false;
        if (this.field_o.field_u != 4) {
          return false;
        }
        if (param0 != 29) {
          this.f((byte) -25);
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.e(-2) &&
          this.field_o.field_R[this.field_h].d(3511) &&
          wt.field_x >= 0 &&
          us.field_j >= 0 &&
          wt.field_x < 640 &&
          us.field_j < 480 && (((va) (this.field_r)).b((byte) -82) ||
          !kl.b(640))) {
          stackIn_16_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_16_0 = false;
        }
        return stackIn_16_0;
    }

    private final boolean b(byte param0) {
        js var3;
        boolean stackIn_6_0 = false;
        if (param0 != -73) {
          var3 = (js) null;
          this.a(9, true, -127, (js) null);
        }
        stackIn_6_0 = (this.e(-2)) && (this.field_A);
        return stackIn_6_0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          if (param1 != 0) {
            field_w = (kj) null;
          }
          try {
            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
            param0.getAppletContext().showDocument(qr.a(param0, var2, param1 ^ 3), "_top");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, boolean param1) {
        int var5 = 0;
        int stackIn_18_0 = 0;
        int var3;
        int var4;
        int var6;
        int var7;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        var3 = -26 % ((38 - param0) / 60);
        if (!param1 &&
          !this.field_t) {
          return;
        }
        if (wh.field_q) {
          return;
        }
        if (!this.field_u) {
          return;
        }
        if (this.field_o.field_u == 4) {
          ((va) (this.field_r)).g(0);
        }
        this.field_o.a((byte) -87);
        this.field_o.field_E.b(22997);
        this.field_o.d(4);
        if (this.field_t) {
          this.field_i.d(4);
        }
        ie.g(-128);
        re.b(101);
        this.field_r.a(true);
        this.field_r.a(-117, param1);
        if (this.field_t &&
          !pq.field_K) {
          if (this.e(-2)) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = this.g(64);
          }
          var4 = stackIn_18_0;
          for (var5 = 0; var5 < this.field_o.field_I; var5++) {
            this.a(var4, 20700, var5);
          }
          this.field_o.a(this.field_i, this.field_h, var4, -6);
        }
        ve.q(-28033);
        if (this.field_E > 0) {
          this.field_E = this.field_E - 16;
        }
        if (!this.field_t) {
          if (2 == this.field_o.field_u &&
            this.field_o.field_C.a((byte) 107)) {
            var7 = 0;
            var4Lifetime1 = var7;
            while (var7 < 2) {
              this.field_o.field_r[var7] = this.field_o.field_C.field_k[var7];
              var7++;
            }
            this.b(26415, 3);
          }
          if (this.field_o.field_u == 3 &&
            this.field_o.field_o.a(-127, 0)) {
            this.b(26415, 4);
          }
        }
    }

    ap(boolean param0, up[] param1, String[] param2, int param3, boolean param4, boolean param5, int param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11, boolean param12, int param13, gr param14) {
        super(-1);
        int var17 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var16 = null;
        RuntimeException var16_ref = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        this.field_B = -1;
        this.field_g = true;
        try {
          stackIn_4_1 = (param11);
          this.field_D = stackIn_4_1;
          this.field_k = param1;
          this.field_h = param3;
          stackIn_7_1 = (param0);
          this.field_t = stackIn_7_1;
          stackIn_10_1 = (param12);
          this.field_y = stackIn_10_1;
          stackIn_13_1 = (param5);
          this.field_q = stackIn_13_1;
          this.field_B = param13;
          stackIn_16_1 = (param10);
          this.field_A = stackIn_16_1;
          this.field_n = param14;
          bt.field_e = false;
          stackIn_19_1 = (param4);
          this.field_s = stackIn_19_1;
          var21 = ha.field_F;
          var20 = var21;
          var19 = var20;
          var16 = var19;
          for (var17 = 0; var17 < 8; var17++) {
            var21[var17] = 0;
          }
          this.field_z = new int[param2.length];
          this.field_o = new nu(param2, param6, param7, param8, param9, this.field_A, this.field_D, this.field_y, this.field_s);
          if (this.field_t) {
            this.field_i = new nu(this.field_o);
            this.field_m = new nu(this.field_o);
          } else {
            this.field_o.field_p = true;
          }
          hv.a(rq.field_E, -448);
          nc.a(this.field_o, (byte) -85, this.field_h, this.field_t);
          this.field_u = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16_ref = decompiledCaughtException;
          stackIn_29_0 = var16_ref;
          stackIn_29_1 = new StringBuilder().append("ap.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void h(int param0) {
        if (param0 != 9) {
          this.a(true, 17);
        }
        if (null != this.field_r) {
          iw.a(-44, rk.field_h);
          hr.a((byte) -48);
          this.a(-5, false);
          ta.e(122);
          this.field_E = 256;
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 18) {
          this.c(27);
        }
        ji.k(0);
        if (this.e(param1 ^ -20)) {
          return;
        }
        if (!this.field_t) {
          ng.a(0, 115);
          jm.a(18, param0, -2);
        }
    }

    final void c(byte param0) {
        if (param0 != 80) {
          return;
        }
        if (!this.field_u) {
          return;
        }
        if (this.field_t &&
          this.field_o.field_u != 0) {
          this.field_r.a(150, param0 ^ 17789);
          return;
        }
    }

    final tf e(byte param0) {
        int var2 = -22 % ((param0 + 66) / 57);
        if (!this.d((byte) -59)) {
          return null;
        }
        return ((ol) (this.field_r)).h(-19510);
    }

    final void a(int param0, ml param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 != -21573) {
            return;
          }
          for (var3_int = 0; this.field_o.field_I > var3_int; var3_int++) {
            this.field_z[var3_int] = param1.a((byte) 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ap.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        gt var5;
        Object var6;
        gt var7;
        var7 = this.field_o.field_R[param2];
        var5 = this.field_i.field_R[param2];
        if (var7.a(-93, var5, param0, this.field_h)) {
          return;
        }
        var6 = null;
        if (param1 != 20700) {
          return;
        }
        if (!var7.field_v &&
          var5.field_v) {
          if (!var7.field_s &&
            var5.field_s) {
            var6 = r.field_e;
          } else {
            var6 = mr.field_F;
          }
        } else if (!var7.field_s &&
          var5.field_s) {
          var6 = nn.field_L;
        } else {
          if (!var7.field_q &&
            var5.field_q) {
            var6 = wc.field_q;
          }
        }
        if (var6 != null) {
          gm.a(vo.$cfr$intArgs$a$53ce4ab4c593(-18, (String) (var6), new String[]{this.field_o.field_S[param2]}), false, (byte) -108);
        }
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -21660) {
          this.field_q = true;
        }
        stackIn_6_0 = (this.b((byte) -73)) && (this.field_v);
        return stackIn_6_0;
    }

    private final void a(int param0, int[] param1, boolean param2, int[] param3, int[] param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = -param0 + 1;
          var7 = je.field_g[param4[var6_int]].a(-1) ? 1 : 0;
          if (param2) {
            return;
          }
          var8 = je.field_g[param4[param0]].a(-1) ? 1 : 0;
          if (var7 == 0) {
            stackIn_5_0 = param1[var6_int];
          } else {
            stackIn_5_0 = param3[var6_int];
          }
          var9 = stackIn_5_0;
          if (var8 == 0) {
            stackIn_8_0 = param1[param0];
          } else {
            stackIn_8_0 = param3[param0];
          }
          var10 = stackIn_8_0;
          if (Math.abs((15 & var10) - (15 & var9)) <= 1 &&
            (var10 & 16) == (16 & var9)) {
            var11 = var10 ^ 16;
            if (var8 == 0) {
              param1[param0] = var11;
              return;
            }
            param3[param0] = var11;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ap.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        try {
          if (param2 > -28) {
            this.c((byte) 62);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ap.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          sj var2 = (sj) null;
          ap.a((byte) 13, (sj) null);
        }
        field_l = null;
        field_j = null;
        field_x = null;
        field_w = null;
    }

    final void a(int param0, hn param1, byte param2, int param3) {
        if (!this.d((byte) -68)) {
          return;
        }
        try {
          ((ol) (this.field_r)).a(1, param1, param0, param3);
          if (param2 > -71) {
            this.field_v = true;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ap.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_24_0 = 0;
        uo var3_ref_uo;
        la[] var3_ref_la__;
        int var3;
        int var4;
        la var5;
        int var6;
        la[] var7;
        la[] var8;
        int var4Lifetime1;
        int var4Lifetime2;
        la[] var3_ref_la__Lifetime1;
        la var5Lifetime1;
        var6 = Kickabout.field_G;
        if (param0 != ~this.field_o.field_u) {
          ru.a(true, (byte) -114);
          ru.a(false, (byte) -114);
        }
        if (!this.field_u) {
          var3_ref_uo = pb.field_C;
          var4 = 90 + ((hu) ((Object) var3_ref_uo)).a(bm.field_K) >> 1;
          on.a(320 - var4, 223, var4 + var4, 34, 6, 65793, 128);
          ((hu) ((Object) var3_ref_uo)).d(bm.field_K, 320, 246, 16777215, -1);
          return;
        }
        this.field_r.e(1);
        if ((1 & fa.field_j) != 0) {
          var7 = this.field_o.field_B;
          var3_ref_la__ = var7;
          for (var4Lifetime1 = 0; var7.length > var4Lifetime1; var4Lifetime1++) {
            var5 = var7[var4Lifetime1];
            var5.a(-2943, 16777215);
          }
        }
        if ((fa.field_j & 2) != 0) {
          var8 = this.field_o.field_x;
          var3_ref_la__Lifetime1 = var8;
          for (var4Lifetime2 = 0; var4Lifetime2 < var8.length; var4Lifetime2++) {
            var5Lifetime1 = var8[var4Lifetime2];
            var5Lifetime1.a(-2943, 16711680);
          }
        }
        us.g((byte) -121);
        if (0 < this.field_E) {
          rk.field_h.b(0, 0, this.field_E);
        }
        if (!ja.field_O) {
          if (this.field_r instanceof va) {
            stackIn_24_0 = (((va) (this.field_r)).field_l) ? 1 : 0;
          } else {
            stackIn_24_0 = 0;
          }
          var3 = stackIn_24_0;
          ql.a((byte) 96, var3 != 0, this.field_z);
        }
        mf.b(-109);
    }

    private final void d(int param0) {
        if (0 == this.field_o.field_u) {
          this.field_r = (hs) ((Object) new wb(this.field_o, this.field_h, this.field_t));
        }
        if (param0 == ~this.field_o.field_u) {
          this.field_r = (hs) ((Object) new fk(this.field_o, this.field_h, this.field_t));
        }
        if (this.field_o.field_u == 2) {
          this.field_r = (hs) ((Object) new lr(this.field_o, this.field_h, this.field_t));
        }
        if (this.field_o.field_u == 3) {
          this.field_r = (hs) ((Object) new bf(this.field_o, this.field_h, this.field_t, this.field_k));
        }
        if (this.field_o.field_u == 4) {
          this.field_r = (hs) ((Object) new va(this.field_o, this.field_h, this.field_i, this.field_t, this.field_s));
        }
        if (this.field_o.field_u == 5) {
          this.field_r = (hs) ((Object) new ol(this.field_o, this.field_h, this.field_t));
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != -16046) {
          field_x = (String) null;
        }
        if (this.field_t) {
          or.field_d.b(75, (byte) 112);
          or.field_d.a(118, param1);
        }
    }

    final void a(byte param0, tf param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_r instanceof va) {
            ((va) (this.field_r)).a(param1, (byte) -82);
          }
          if (param0 >= -111) {
            this.field_n = (gr) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ap.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var3Lifetime1;
        if (param0 != 26415) {
          this.a(false, -22);
        }
        this.field_u = true;
        this.h(9);
        this.field_o.a(param1, (byte) -81);
        this.d(-2);
        this.field_o.field_v = -1;
        if (2 == this.field_o.field_u) {
          this.field_o.a(mf.a(2, 1, (byte) 0), -127);
        }
        if (this.field_o.field_u == 3) {
          for (var3 = 0; 4 > var3; var3++) {
            this.field_o.field_i[1][var3] = 1;
          }
          for (var3Lifetime1 = 0; 4 > var3Lifetime1; var3Lifetime1++) {
            this.field_o.field_o.a(this.field_n, this.field_k, (byte) -85, var3Lifetime1, 1);
          }
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        if (13 == param0) {
          var4 = 1;
          if (this.field_t) {
            var4 = 2;
            if (this.field_A) {
              var4 = 3;
            }
            if (!this.e(-2) &&
              this.field_o.field_u != 5 &&
              this.field_o.field_R[this.field_h].d(3511)) {
              jm.a(var4, false, -2);
              return true;
            }
            var4 = 5;
            if (this.field_A) {
              var4 = 6;
            }
          }
          jm.a(var4, false, -2);
          return true;
        }
        if (param0 == il.field_h) {
          bt.field_e = !bt.field_e ? true : false;
        }
        if (param1 > -5) {
          return false;
        }
        if (param0 == tt.field_b) {
          vl.field_d = !vl.field_d ? true : false;
        }
        if (!this.field_u) {
          return false;
        }
        return this.field_r.a(param2, 1670, param0);
    }

    final void a(int param0) {
        if (this.field_r instanceof va) {
          ((va) (this.field_r)).m(-105);
        }
        int var2 = 109 / ((param0 - 6) / 37);
    }

    private final int g(int param0) {
        if (param0 < 16) {
          field_l = (ut) null;
        }
        return 5 + this.field_z[this.field_h] / 20;
    }

    final void a(byte param0, ml param1) {
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ch var6_ref_ch = null;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var3_intLifetime1;
        var7 = Kickabout.field_G;
        try {
          this.field_u = true;
          this.h(9);
          this.field_i.a(param1, this.field_h, param0 ^ -18);
          this.field_m.a(this.field_i, (byte) 77);
          if (this.field_i.field_u > 0) {
            stackIn_4_0 = 1;
            if (this.e(param0 ^ 17)) {
              stackIn_5_1 = 0;
            } else {
              stackIn_5_1 = this.field_i.field_g[this.field_h].field_p;
            }
            var3_int = stackIn_4_0 - stackIn_5_1;
            this.a(var3_int, this.field_i.field_d, false, this.field_i.field_Q, this.field_i.field_H);
          }
          this.field_o.a(this.field_i, (byte) 122);
          this.d(-2);
          if (param0 != -17) {
            this.field_n = (gr) null;
          }
          if (this.field_o.field_u > 0 &&
            this.field_o.field_u < 5 && (rm.field_C != this.field_o.field_m ||
            ih.field_c != this.field_o.field_t ||
            !vi.field_n)) {
            sb.a(true, (byte) -125, this.field_o.field_m, this.field_o.field_t);
          }
          if (5 == this.field_o.field_u &&
            param1.h((byte) -113) == 1) {
            ((ol) (this.field_r)).field_u = new int[2];
            ((ol) (this.field_r)).field_u[0] = param1.h((byte) -113);
            ((ol) (this.field_r)).field_u[1] = param1.h((byte) -116);
            var3_intLifetime1 = param1.h((byte) -125);
            ((ol) (this.field_r)).field_k = new int[var3_intLifetime1];
            for (var4 = 0; var3_intLifetime1 > var4; var4++) {
              ((ol) (this.field_r)).field_k[var4] = param1.h((byte) -109);
            }
            ((ol) (this.field_r)).field_bb.b(22997);
            ((ol) (this.field_r)).field_q.b(22997);
            var4Lifetime1 = param1.a((byte) 81);
            for (var5 = 0; var4Lifetime1 > var5; var5++) {
              var6_ref_ch = new ch();
              var6_ref_ch.a(param1, (byte) -79);
              if (0 != var6_ref_ch.field_f) {
                ((ol) (this.field_r)).field_q.a(var6_ref_ch, 3);
              } else {
                ((ol) (this.field_r)).field_bb.a(var6_ref_ch, 3);
              }
            }
            var3_intLifetime1 = param1.h((byte) -120);
            ((ol) (this.field_r)).field_p = new int[var3_intLifetime1][4];
            ((ol) (this.field_r)).field_ab = new int[var3_intLifetime1][4];
            for (var5Lifetime1 = 0; var3_intLifetime1 > var5Lifetime1; var5Lifetime1++) {
              for (var6 = 0; var6 < 4; var6++) {
                ((ol) (this.field_r)).field_p[var5Lifetime1][var6] = param1.i(-95);
              }
            }
            for (var5Lifetime2 = 0; var5Lifetime2 < var3_intLifetime1; var5Lifetime2++) {
              for (var6Lifetime1 = 0; var6Lifetime1 < 4; var6Lifetime1++) {
                ((ol) (this.field_r)).field_ab[var5Lifetime2][var6Lifetime1] = param1.i(-98);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("ap.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != -2) {
          this.field_i = (nu) null;
        }
        return this.field_h == -2 ? true : false;
    }

    final void c(int param0) {
        if (param0 > -10) {
          tf var3 = (tf) null;
          this.a((byte) -89, (tf) null);
        }
        if (!this.field_t) {
          throw new IllegalStateException();
        }
        if (!this.e(-2) &&
          !this.field_o.field_R[this.field_h].field_s) {
          this.a(-16046, 1);
        }
    }

    static {
        field_w = new kj(2);
        field_j = new tf();
        field_p = null;
        field_x = "OK";
    }
}
