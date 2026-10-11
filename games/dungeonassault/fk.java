/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends kl {
    private cn field_m;
    private cn field_u;
    private cn field_n;
    private pp field_p;
    private int field_t;
    static tb field_v;
    static String field_s;
    private int field_q;
    private pp field_o;
    static String field_r;
    private String field_w;

    final void a(lb param0, int param1) {
        int var3_int = 0;
        RuntimeException runtimeException = null;
        hb var4 = null;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          if (param1 != 83) {
            return;
          }
          for (var3_int = 0; var3_int < 8; var3_int++) {
            var4 = gm.field_d.field_a[var3_int];
            if ((var4 == null ||
              255 == var4.field_p) && (null != qd.field_c &&
              qd.field_c[var3_int])) {
              qd.field_c[var3_int] = false;
              sd.field_J = sd.field_J - 1;
            }
            if (var4 != null) {
              if (var4.field_p != 255) {
                var4.field_b = new wd(var4.field_n.field_e);
              } else {
                var4.field_b = new wd(k.field_c);
              }
            }
          }
          this.b((byte) 37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_22_0 = runtimeException;
          stackIn_22_1 = new StringBuilder().append("fk.P(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(byte param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = DungeonAssault.field_K;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param0 > -104) {
          this.field_u = (cn) null;
        }
        for (var2 = 0; var2 < 2; var2++) {
          for (var3 = 0; var3 < 4; var3++) {
            var4 = 199 + 83 * var3;
            var5 = 57 + var2 * 86;
            gf.b(var4, var5, 72, 72, 65793);
            rp.a(4, 64, (byte) 108, 4 + var4, 64, kc.field_V, var5 + 4);
          }
        }
        for (var2Lifetime1 = 0; 4 > var2Lifetime1; var2Lifetime1++) {
          var3Lifetime1 = var2Lifetime1 * 130 + 37;
          var4Lifetime1 = 227;
          gf.b(var3Lifetime1, var4Lifetime1, 96, 96, 65793);
          rp.a(4, 88, (byte) 108, 4 + var3Lifetime1, 88, kc.field_S, var4Lifetime1 + 4);
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_v = null;
        field_r = null;
        if (param0 <= 53) {
          field_r = (String) null;
        }
    }

    final static void a(byte param0, wh param1) {
        if (param1 == null) {
          lo.a(param0 ^ 13, true, (vh) null, 64, 0);
          return;
        }
        try {
          if (param0 != 121) {
            field_s = (String) null;
          }
          lo.a(85, true, param1.field_b, 64, param1.field_f);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "fk.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        int stackIn_8_0 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        int var5_int;
        int var6;
        int var7;
        int var4Lifetime1;
        var7 = DungeonAssault.field_K;
        var2 = 20;
        var3 = 1;
        for (var4 = -hf.field_Ab.field_v + var2; -hf.field_Ab.field_v < var4; var4 = var4 - hf.field_Ab.field_v) {
          var5_int = 70;
          var6 = 545;
          if (var3 == 0) {
            hf.field_Ab.g(var5_int, var4);
            hf.field_Ab.g(var6, var4);
          } else {
            hf.field_Ab.h(var5_int, var4);
            hf.field_Ab.h(var6, var4);
          }
          stackIn_8_0 = (var3 != 0) ? 0 : 1;
          var3 = stackIn_8_0;
        }
        gf.e(0, 0, 640, am.field_a.field_G + var2 - 12);
        am.field_a.h(-(am.field_a.field_E / 2) + 320, var2);
        gf.b();
        lf.field_n.c(321 - lf.field_n.field_E / 2, 60 + var2);
        lf.field_x.h(320 - lf.field_x.field_E / 2, am.field_a.field_G + (var2 - 28));
        var4Lifetime1 = -51 / ((41 - param0) / 63);
        gf.b(37 + this.field_k, 57 + this.field_j, 155, 158, 65793, 64);
        super.b(-64);
        this.e(-64);
        var5 = null;
        if (-1 != this.field_q) {
          var5 = gm.field_d.field_a[this.field_q];
        }
        qe.a(50 + this.field_k, this.field_j + 136, (hb) (var5), 0);
        if (var5 != null) {
          db.field_v.a(((hb) (var5)).field_n.field_F.toUpperCase(), 45 + this.field_k, this.field_j + 62, 139, 58, 16777215, -1, 1, 1, db.field_v.field_H);
        }
    }

    final void a(boolean param0) {
        int var3_int = 0;
        String stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        pp stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        int var2;
        hb[] var2_ref_hb__;
        hb var3;
        hb var4;
        int var5;
        hb[] var6;
        var5 = DungeonAssault.field_K;
        this.field_q = -1;
        super.a(param0);
        this.field_q = this.b(hj.field_S, 27403, eh.field_h);
        if (hh.field_s == this.field_p) {
          this.a(true, (byte) 22);
        } else {
          if (hh.field_s != this.field_o) {
            if (no.field_d != 0) {
              var2 = this.b(lc.field_c, 27403, hm.field_k);
              if (-1 != var2) {
                var3 = gm.field_d.field_a[var2];
                if (var3 != null &&
                  255 != var3.field_p) {
                  if (!qd.field_c[var2]) {
                    if (sd.field_J < 4) {
                      sd.field_J = sd.field_J + 1;
                      qd.field_c[var2] = true;
                      if (var3.field_b.field_n == var3.field_b.field_i) {
                        var3.field_b.a(62, var3.field_n.field_u);
                        if (var3.field_n.field_p != null) {
                          gd.a(64, var3.field_n.field_p);
                        }
                      }
                    }
                  } else {
                    sd.field_J = sd.field_J - 1;
                    qd.field_c[var2] = false;
                    var3.field_b.a(107, var3.field_n.field_v);
                  }
                }
              }
              stackIn_39_0 = this.field_o;
              stackIn_40_1 = (sd.field_J > 0) && (4 >= sd.field_J);
              stackIn_39_0.field_w = stackIn_40_1;
            }
          } else {
            if (0 < sd.field_J &&
              sd.field_J <= 4) {
              var6 = gm.field_d.field_a;
              var2_ref_hb__ = var6;
              for (var3_int = 0; var6.length > var3_int; var3_int++) {
                var4 = var6[var3_int];
                if (var4 != null &&
                  qd.field_c[var4.field_j]) {
                  var4.field_b.a(62, var4.field_n.field_t);
                  if (var4.field_n.field_p != null) {
                    gd.a(64, var4.field_n.field_p);
                  }
                }
              }
              stackIn_19_0 = this.field_w;
              stackIn_19_1 = this.field_t;
              stackIn_20_2 = !(param0);
              mc.a(stackIn_19_0, stackIn_19_1, stackIn_20_2, qd.field_c);
            }
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
          return;
        }
        if (mm.field_t == 13) {
          this.a(false, (byte) 22);
        } else {
          super.b(param0);
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var9 = DungeonAssault.field_K;
        var4 = 0;
        var5 = 0;
        if (param1 != 27403) {
          this.d((byte) -91);
        }
        while (var5 < 2) {
          var6 = 0;
          while (var6 < 4) {
            var7 = 199 + this.field_k + 83 * var6;
            var8 = 86 * var5 + (57 + this.field_j);
            if (var7 <= param0 &&
              var8 <= param2 &&
              var7 + 72 > param0 &&
              param2 < 72 + var8) {
              return var4;
            }
            if (var4 != 7) {
              var6++;
              var4++;
              continue;
            }
            break;
          }
          var5++;
        }
        var5Lifetime1 = this.field_k + 37;
        var6Lifetime1 = 227 + this.field_j;
        var10 = 0;
        var7Lifetime1 = var10;
        while (var10 < 8) {
          if (qd.field_c[var10]) {
            if (param0 >= var5Lifetime1 &&
              param2 >= var6Lifetime1 &&
              96 + var5Lifetime1 > param0 &&
              param2 < var6Lifetime1 + 96) {
              return var10;
            }
            var5Lifetime1 += 130;
          }
          var10++;
        }
        return -1;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0 != 84) {
                field_s = (String) null;
              }
              var2 = param1.getDocumentBase().getFile();
              var3 = var2.indexOf('?');
              var4 = "reload.ws";
              if (var3 >= 0) {
                var4 = var4 + var2.substring(var3);
              }
              var5 = new java.net.URL(param1.getCodeBase(), var4);
              param1.getAppletContext().showDocument(j.a((byte) 94, var5, param1), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("fk.O(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        hb stackIn_30_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var8 = DungeonAssault.field_K;
        if (param0 > -57) {
          this.a(false, (byte) -23);
        }
        var2 = 0;
        for (var3 = 0; var3 < 2; var3++) {
          var4 = 0;
          while (var4 < 4) {
            var5 = 83 * var4 + this.field_k + 199;
            var6 = 86 * var3 + (this.field_j + 57);
            if (gm.field_d.field_a[var2] != null) {
              gm.field_d.field_a[var2].field_b.a(60, var6 + 6, (byte) 102, var5 + 6, 60);
              qe.a(72 + (var5 - 4), -4 + (var6 + 72), 3, gm.field_d.field_a[var2], 0);
              var7 = (int)(64.0 * (te.c(mo.field_a, 10273 * var2, 0.015625) + 2.0));
              if (var7 < 0) {
                var7 = 0;
              }
              if (qd.field_c[var2]) {
                this.field_u.b(var5, var6, var7);
              }
              if (this.field_q == var2) {
                this.field_m.b(var5, var6, 64);
                this.field_n.b(var5, var6, var7);
              }
            }
            var4++;
            var2++;
          }
        }
        var3Lifetime1 = this.field_k + 37;
        var4Lifetime1 = 227 + this.field_j;
        for (var5Lifetime1 = 0; var5Lifetime1 < 8; var5Lifetime1++) {
          if (qd.field_c[var5Lifetime1] &&
            null != gm.field_d.field_a[var5Lifetime1]) {
            stackIn_30_0 = gm.field_d.field_a[var5Lifetime1];
            ((wd) (Object) stackIn_30_0.field_b).a(84, 6 + var4Lifetime1, (byte) 102, 6 + var3Lifetime1, 84);
            qe.a(var3Lifetime1 + 96 - 4, var4Lifetime1 + 96 - 4, 3, gm.field_d.field_a[var5Lifetime1], 0);
            var3Lifetime1 += 130;
          }
        }
    }

    final void c(byte param0) {
        int var4 = 0;
        int var2;
        hb[] var3;
        hb var5;
        int var6;
        var6 = DungeonAssault.field_K;
        super.c((byte) 44);
        var2 = -25 % ((-34 - param0) / 57);
        var3 = gm.field_d.field_a;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null) {
            var5.field_b.a((byte) 109, 20);
          }
        }
    }

    private final void a(boolean param0, byte param1) {
        if (param1 != 22) {
          this.b(true);
        }
        this.field_d = true;
    }

    final void b(byte param0) {
        int var3_int = 0;
        int var5 = DungeonAssault.field_K;
        int[] var6 = new int[64];
        int[] var2 = var6;
        for (var3_int = 0; var3_int < 64; var3_int++) {
          var6[var3_int] = mp.a(-2147483648, (var3_int + 24) * 65793);
        }
        cn var3 = new cn(this.field_a, this.field_i);
        cn var4 = new cn(this.field_a, this.field_i);
        this.field_l = new ph(var3, var4);
        jh.a(this.field_l);
        if (param0 != 37) {
          return;
        }
        da.a(pi.field_i, cm.field_M, this.field_a >> 1, 1917623617, (ne.field_c.field_H + 36 >> 1) + 7, ne.field_c);
        this.d((byte) -123);
        gf.b(44, 64, 141, 53, 65793);
        rp.a(4, 133, (byte) 108, 48, 45, kc.field_S, 68);
        jh.b();
    }

    fk(String param0, int param1) {
        super(40, 40, 560, 380);
        rh discarded$0 = null;
        rh discarded$1 = null;
        try {
          this.field_t = param1;
          this.field_w = param0;
          this.field_p = tn.a(140, -20 + (-jm.field_i.field_v + this.field_j) + this.field_i, ne.field_c, jm.field_i, -112, be.field_r.toUpperCase());
          this.field_o = tn.a(-jm.field_i.field_y + 500, -jm.field_i.field_v + this.field_j + (this.field_i - 20), ne.field_c, jm.field_i, -73, lk.field_P);
          this.field_f.a(this.field_p, false);
          this.field_f.a(this.field_o, false);
          this.a((lb) null, 83);
          this.field_m = mf.a(10449103, 72, 6, 72, (byte) -102);
          this.field_n = mf.a(255, 72, 12, 72, (byte) 71);
          this.field_u = mf.a(16711680, 72, 12, 72, (byte) -83);
          qd.field_c = new boolean[8];
          this.field_o.field_w = false;
          sd.field_J = 0;
          discarded$0 = new rh(58, 394, 80, 160, 16711680, 768, 249);
          discarded$1 = new rh(580, 394, 80, 160, 16711680, 768, 249);
          qh.a(-13716, this.field_o, 24);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static cn a(byte param0, cn param1, int param2, int param3) {
        int var7 = 0;
        cn stackIn_3_0 = null;
        cn stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        cn var12 = null;
        cn var13 = null;
        var11 = DungeonAssault.field_K;
        try {
          if (param0 != 36) {
            stackIn_3_0 = (cn) null;
            return stackIn_3_0;
          }
          var12 = param1.d();
          var13 = var12;
          var5 = param3 & 16711935;
          var6 = 65280 & param3;
          for (var7 = 0; var13.field_B.length > var7; var7++) {
            var8 = var12.field_B[var7];
            var9 = (63 & var8 >> 2) + (var8 >> 18 & 63) + (127 & var8 >> 9);
            var10 = 16711680 & var6 * var9 | -16711936 & var9 * var5;
            if (0 == var10 &&
              var8 != 0) {
              var10 = 65793;
            }
            var12.field_B[var7] = var10 >>> 8;
          }
          jh.a(var13);
          param1.d(-param1.field_w, -param1.field_A, -param2 + 256);
          jh.b();
          stackIn_11_0 = var13;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("fk.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_s = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_r = "Password: ";
    }
}
