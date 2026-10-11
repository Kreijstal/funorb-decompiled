/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    private int field_a;
    private int field_c;
    private int field_f;
    private int field_j;
    private int field_l;
    static String field_i;
    private int field_e;
    private int field_b;
    private int field_g;
    static String field_h;
    private int field_k;
    private int field_d;
    private int field_m;

    public static void a(int param0) {
        if (param0 >= -85) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          tf.a(101, (java.applet.Applet) null);
        }
        field_i = null;
        field_h = null;
    }

    final void d(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_14_0;
        boolean stackIn_14_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = EscapeVector.field_A;
        em.a(0, 0, 640, 480, 0, 64);
        if (mj.field_d >= 20) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = -mj.field_d + 20;
        }
        var2 = stackIn_3_0;
        if (var2 < 20) {
          stackIn_6_0 = (-var2 + 20) * 160 / 20;
        } else {
          stackIn_6_0 = 0;
        }
        var3 = stackIn_6_0;
        if (mj.a((byte) 122)) {
          var4 = 20 + dn.a(0) / 2;
          var5 = 15 + ea.d((byte) -96) / 2;
          eh.a(var3, 320 - var4, 240 - var5, 6320248, 0, var5 + 241, -3, 321 + var4, 12110032, 3160124, 2 * var2);
          en.c(0);
          return;
        }
        eh.a(var3, this.field_d - 6, this.field_f - 12, 6320248, 0, 24 * ch.field_a.field_k + this.field_f + 12, -3, 6 + this.field_a, 12110032, 3160124, var2 * 2);
        var4Lifetime1 = this.field_f;
        var5Lifetime1 = 0;
        if (param0 <= 124) {
          return;
        }
        while (var5Lifetime1 < ch.field_a.field_k) {
          stackIn_13_1 = -19868;
          stackIn_13_2 = var4Lifetime1;
          if (var5Lifetime1 != ch.field_a.field_h) {
            stackIn_14_0 = this;
            stackIn_14_3 = false;
          } else {
            stackIn_14_0 = this;
            stackIn_14_3 = true;
          }
          this.a(stackIn_13_1, stackIn_13_2, stackIn_14_3, var5Lifetime1);
          var4Lifetime1 += 24;
          var5Lifetime1++;
        }
        return;
    }

    private final int a(int param0, boolean param1) {
        int stackIn_10_0 = 0;
        int var3_int;
        Object var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        if (this.field_j == param0) {
          var3_int = (fh.field_g.b(oi.field_N) + fh.field_g.b(ee.field_d)) / 2;
          var4 = (-68 + var3_int) / 2;
          return 2 * -(var4 - fh.field_g.b(oi.field_N));
        }
        if (this.field_c == param0) {
          var3_intLifetime1 = (fh.field_g.b(oi.field_N) + fh.field_g.b(ee.field_d)) / 2;
          var4Lifetime1 = (-68 + var3_intLifetime1) / 2;
          return -(-fh.field_g.b(ee.field_d) + var4Lifetime1) * 2;
        }
        if (param0 == this.field_k) {
          var3_intLifetime2 = fh.field_g.b(nk.field_s);
          var4Lifetime2 = (fh.field_g.b(rh.field_J) + fh.field_g.b(nb.field_d)) / 2;
          var5 = (var3_intLifetime2 - var4Lifetime2) / 2;
          var6 = (var5 + fh.field_g.b(rh.field_J)) * 2;
          var7 = 2 * (fh.field_g.b(nb.field_d) + var5);
          stackIn_10_0 = (var7 >= var6) ? var7 : var6;
          return stackIn_10_0;
        }
        var3 = null;
        if (param0 == 0) {
          var3 = kb.field_g;
        }
        if (this.field_l == param0) {
          var3 = tc.field_o;
        }
        if (this.field_b == param0) {
          var3 = mc.field_a;
        }
        if (param0 == this.field_g) {
          var3 = h.field_O;
        }
        if (param0 == this.field_m) {
          var3 = an.field_b;
        }
        if (param1) {
          tf.b((byte) 111);
        }
        if (this.field_e == param0) {
          var3 = oa.field_q;
        }
        return fh.field_g.b((String) (var3));
    }

    final void a(byte param0) {
        boolean discarded$1 = false;
        int var3;
        var3 = EscapeVector.field_A;
        do {
          if (!pn.p(-105)) {
            if (param0 != -75) {
              this.b(true, -119);
            }
            ch.field_a.a(0, this.field_d, this.field_f, 24, this.field_a);
            discarded$1 = this.a(true, 123);
            return;
          }
          if (nk.field_n == 13) {
            da.field_c = null;
            return;
          }
          ch.field_a.c((byte) 6);
        } while (!this.a(false, 122));
        return;
    }

    private final boolean a(boolean param0, int param1) {
        int discarded$0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_79_0 = 0;
        boolean stackIn_99_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        o var8;
        int var9;
        o var10;
        o var11;
        o var12;
        o var13;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var9 = EscapeVector.field_A;
        if (ch.field_a.field_e) {
          rk.field_e.a(oa.field_w, 100, 1536 * qm.field_c / 64, 8192);
        }
        if (ch.field_a.field_h == 0 &&
          ch.field_a.b((byte) -18)) {
          bc.field_d = true;
          s.field_E = true;
          da.field_c = null;
          return true;
        }
        if (ch.field_a.field_h == this.field_l &&
          ch.field_a.b((byte) -18)) {
          ac.b(112);
          ma.field_a.field_Jb = true;
          ma.field_a.field_Cb = true;
          ma.field_a.x((byte) 68);
          da.field_c = null;
          bc.field_d = true;
          s.field_E = true;
          return true;
        }
        if (ch.field_a.field_h == this.field_b &&
          ch.field_a.b((byte) -18)) {
          ek.a(ch.field_a.field_j, false);
          return true;
        }
        if (this.field_g == ch.field_a.field_h &&
          ch.field_a.b((byte) -18)) {
          ma.field_a.j(256);
          return true;
        }
        if (ch.field_a.field_h == this.field_j) {
          if (ch.field_a.g(13) &&
            qm.field_c > 0) {
            qm.field_c = qm.field_c - 8;
            if (qm.field_c < 0) {
              qm.field_c = 0;
            }
            ce.d(8192);
          }
          if (ch.field_a.b(-98) &&
            64 > qm.field_c) {
            qm.field_c = qm.field_c + 8;
            if (qm.field_c > 64) {
              qm.field_c = 64;
            }
            ce.d(8192);
          }
          if (ch.field_a.d(-10809)) {
            qm.field_c = 0;
            ce.d(8192);
          }
          if (ch.field_a.e(0)) {
            qm.field_c = 64;
            ce.d(8192);
          }
          if (!ch.field_a.a(false)) {
            if (ch.field_a.b((byte) -18)) {
              ce.d(8192);
            }
          } else {
            var3 = fh.field_g.b(oi.field_N);
            var4 = fh.field_g.b(ee.field_d);
            stackIn_39_0 = (var3 > var4) ? var3 : var4;
            var5 = stackIn_39_0;
            var6 = 320 + (var5 - 68) / 2;
            var7 = -var6 - (2 - dh.field_d);
            if (var7 < 0) {
              var7 = 0;
            } else {
              if (var7 > 64) {
                var7 = 64;
              }
            }
            if (ch.field_a.b((byte) -18) ||
              var7 != qm.field_c) {
              qm.field_c = var7;
              ce.d(8192);
            }
          }
        }
        if (param1 < 121) {
          discarded$0 = this.c((byte) -39);
        }
        if (this.field_c == ch.field_a.field_h) {
          if (ch.field_a.g(115) &&
            0 < kc.field_b) {
            kc.field_b = kc.field_b - 8;
            if (0 > kc.field_b) {
              kc.field_b = 0;
            }
            var10 = ni.field_N;
            if (var10 != null) {
              var10.d(kc.field_b * kn.field_b / 64);
            }
          }
          if (ch.field_a.b(-98) &&
            kc.field_b < 64) {
            kc.field_b = kc.field_b + 8;
            if (64 < kc.field_b) {
              kc.field_b = 64;
            }
            var11 = ni.field_N;
            if (var11 != null) {
              var11.d(kn.field_b * kc.field_b / 64);
            }
          }
          if (ch.field_a.d(-10809)) {
            kc.field_b = 0;
            var12 = ni.field_N;
            if (var12 != null) {
              var12.d(kn.field_b * kc.field_b / 64);
            }
          }
          if (ch.field_a.e(0)) {
            kc.field_b = 64;
            var13 = ni.field_N;
            if (var13 != null) {
              var13.d(kc.field_b * kn.field_b / 64);
            }
          }
          if (ch.field_a.a(false)) {
            var3Lifetime1 = fh.field_g.b(oi.field_N);
            var4Lifetime1 = fh.field_g.b(ee.field_d);
            stackIn_79_0 = (var3Lifetime1 <= var4Lifetime1) ? var4Lifetime1 : var3Lifetime1;
            var5Lifetime1 = stackIn_79_0;
            var6Lifetime1 = 320 + (var5Lifetime1 - 68) / 2;
            var7Lifetime1 = -2 - (var6Lifetime1 - dh.field_d);
            if (var7Lifetime1 >= 0) {
              if (var7Lifetime1 > 64) {
                var7Lifetime1 = 64;
              }
            } else {
              var7Lifetime1 = 0;
            }
            kc.field_b = var7Lifetime1;
            var8 = ni.field_N;
            if (var8 != null) {
              var8.d(kn.field_b * kc.field_b / 64);
            }
          }
        }
        if (ch.field_a.field_h == this.field_m &&
          ch.field_a.b((byte) -18)) {
          if (df.field_d != null) {
            ri.a(-25123);
          } else {
            eo.a(24, param0);
          }
          ch.field_a.a(-1, true, 4767999);
        }
        if (ch.field_a.field_h == this.field_k && (ch.field_a.b(false) ||
          ch.field_a.f(23518))) {
          stackIn_99_0 = !(nf.field_r);
          nf.field_r = stackIn_99_0;
          rk.field_e.a(oa.field_w, 100, qm.field_c * 1536 / 64, 8192);
        }
        if (this.field_e != ch.field_a.field_h) {
          return false;
        }
        if (!ch.field_a.b((byte) -18)) {
          return false;
        }
        ma.field_a.field_Jb = true;
        ma.field_a.x((byte) -48);
        bc.field_d = true;
        da.field_c = null;
        s.field_E = true;
        return true;
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_6_0 = null;
          String stackIn_12_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = EscapeVector.field_A;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (sd.a(param1, "getcookies", -29155));
              var5 = bb.a(-128, var4, ';');
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_6_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (oh.field_p != null) {
              stackIn_12_0 = oh.field_p;
              return stackIn_12_0;
            }
            if (param0 != -1) {
              tf.b((byte) -31);
            }
            stackIn_16_0 = param1.getParameter("settings");
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("tf.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 != 320) {
          this.a((byte) 11);
        }
        ch.field_a.a(ch.field_a.a((byte) 119, this.field_f, dh.field_d, 24, this.field_a, bj.field_y, this.field_d), param0, param1 + 4767679);
    }

    private final int c(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = EscapeVector.field_A;
        var2 = 0;
        for (var3 = 0; var3 < ch.field_a.field_k; var3++) {
          var4 = this.a(var3, false);
          if (var2 < var4) {
            var2 = var4;
          }
        }
        var4Lifetime1 = 35 / ((param0 - 14) / 50);
        return var2;
    }

    tf() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int var2;
        int var3;
        oe var5;
        var5 = ma.field_a;
        var2 = 1;
        if (0 <= var5.field_Pb) {
          this.field_l = -2;
        } else {
          incrementValue$0 = var2;
          var2++;
          this.field_l = incrementValue$0;
        }
        incrementValue$1 = var2;
        var2++;
        this.field_b = incrementValue$1;
        if (var5.field_fc != 3 &&
          var5.field_Pb >= 0) {
          incrementValue$2 = var2;
          var2++;
          this.field_g = incrementValue$2;
        } else {
          this.field_g = -2;
        }
        int incrementValue$3 = var2;
        var2++;
        this.field_j = incrementValue$3;
        int incrementValue$4 = var2;
        var2++;
        this.field_c = incrementValue$4;
        if (s.field_x > 0) {
          incrementValue$5 = var2;
          var2++;
          this.field_m = incrementValue$5;
        } else {
          this.field_m = -2;
        }
        if (var5.field_Pb >= 0 &&
          var5.field_rc) {
          incrementValue$6 = var2;
          var2++;
          this.field_k = incrementValue$6;
        } else {
          this.field_k = -2;
        }
        int incrementValue$7 = var2;
        var2++;
        this.field_e = incrementValue$7;
        this.field_f = 240 - var2 * 12;
        ch.field_a = new wc(var2);
        this.b(false, 320);
        var3 = this.c((byte) -56);
        this.field_d = -10 + (-(var3 / 2) + 320);
        this.field_a = 10 + (320 + var3 / 2);
    }

    final static String b(byte param0) {
        if (param0 != 0) {
          tf.a(-60);
        }
        return om.field_g.c(false);
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        ih stackIn_31_0 = null;
        String stackIn_32_1 = null;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        mj.field_b.g();
        em.d();
        stackIn_3_0 = (!param2) ? 7899280 : 16777215;
        var5 = stackIn_3_0;
        var6 = mj.field_b.field_A / 2;
        if (param0 != -19868) {
          return;
        }
        if (0 == param3) {
          fh.field_g.c(kb.field_g, var6, 22, var5, -1);
        }
        if (param3 == this.field_l) {
          fh.field_g.c(tc.field_o, var6, 22, var5, -1);
        }
        if (param3 == this.field_b) {
          fh.field_g.c(mc.field_a, var6, 22, var5, -1);
        }
        if (param3 == this.field_g) {
          fh.field_g.c(h.field_O, var6, 22, var5, -1);
        }
        if (param3 == this.field_j) {
          var7 = fh.field_g.b(oi.field_N);
          var8 = fh.field_g.b(ee.field_d);
          stackIn_19_0 = (var8 < var7) ? var7 : var8;
          var9 = stackIn_19_0;
          var10 = var6 + (var9 - 68) / 2;
          fh.field_g.b(oi.field_N, var10, 22, var5, -1);
          r.a(var10, 13202, 4, qm.field_c, var5);
        }
        if (param3 == this.field_c) {
          var7Lifetime1 = fh.field_g.b(oi.field_N);
          var8Lifetime1 = fh.field_g.b(ee.field_d);
          stackIn_24_0 = (var8Lifetime1 >= var7Lifetime1) ? var8Lifetime1 : var7Lifetime1;
          var9Lifetime1 = stackIn_24_0;
          var10Lifetime1 = (-68 + var9Lifetime1) / 2 + var6;
          fh.field_g.b(ee.field_d, var10Lifetime1, 22, var5, -1);
          r.a(var10Lifetime1, 13202, 4, kc.field_b, var5);
        }
        if (this.field_m == param3) {
          fh.field_g.c(an.field_b, var6, 22, var5, -1);
        }
        if (param3 == this.field_k) {
          var7Lifetime2 = fh.field_g.b(nk.field_s);
          var8Lifetime2 = (fh.field_g.b(rh.field_J) + fh.field_g.b(nb.field_d)) / 2;
          var9Lifetime2 = var6 + (var7Lifetime2 - var8Lifetime2) / 2;
          fh.field_g.b(nk.field_s, var9Lifetime2, 22, var5, -1);
          stackIn_31_0 = fh.field_g;
          if (nf.field_r) {
            stackIn_32_1 = rh.field_J;
          } else {
            stackIn_32_1 = nb.field_d;
          }
          ((ih) (Object) stackIn_31_0).a(stackIn_32_1, var9Lifetime2, 22, var5, -1);
        }
        if (param3 == this.field_e) {
          fh.field_g.c(oa.field_q, var6, 22, var5, -1);
        }
        md.field_D.a(107);
        cf.a(mj.field_b, true, 1);
        mj.field_b.h(5267536);
        mj.field_b.e((-mj.field_b.field_A + 640) / 2, param1);
    }

    static {
        field_i = "Extract the crate";
    }
}
