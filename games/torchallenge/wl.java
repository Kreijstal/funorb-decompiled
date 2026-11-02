/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    int field_h;
    private boolean field_f;
    static IntrusiveDeque field_b;
    private int field_k;
    private int field_e;
    private boolean field_g;
    static int[] field_l;
    private int field_i;
    static String field_d;
    private int field_a;
    private int field_j;
    static fe[][] field_c;

    final void c(int param0) {
        int stackIn_34_0;
        int stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        String stackIn_34_4;
        String stackIn_34_5;
        int stackIn_34_6;
        boolean stackIn_36_7 = false;
        int var2;
        long var3;
        long var5;
        int var7;
        String var8;
        String var9;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (bc.field_o != 13 &&
          !cj.field_b) {
          if (!be.field_b) {
            var2 = ea.field_e;
            if (gh.field_x) {
              var2 = (var2 - 6) * 2 + 1;
            }
            ba.field_i.b((byte) 119);
            ba.field_i.a(param0 - 46, var2);
            be.field_b = true;
          }
          if (ub.field_i) {
            SoftwareRasterizer.a(sh.field_w);
          }
          ba.field_i.a(true, 18, true, (Sprite) null, 3, df.field_R, aa.field_g, LocalizedStrings.field_u, ph.field_d);
          NodeHashTableIterator.field_j = null;
          ba.field_i.a(true, 18, true, (Sprite) null, 6, df.field_R, aa.field_g, LocalizedStrings.field_u, ph.field_d);
          ba.field_i.a(true, 18, true, (Sprite) null, 2, df.field_R, aa.field_g, LocalizedStrings.field_u, ph.field_d);
          if (ub.field_i) {
            SoftwareRasterizer.b(sh.field_w);
          }
          if (param0 != 48) {
            this.c((byte) -13);
          }
          if (!ol.field_a) {
            BufferedSocket.field_p.a(this.field_e, df.field_R, BufferedSocket.field_p.field_B, BufferedSocket.field_p.y, BufferedSocket.field_p.x, 0, 2657, BufferedSocket.field_p.field_u);
            BufferedSocket.field_p.a((byte) -126, df.field_R, this.field_e);
            lb.a(df.field_R, this.field_e, param0 ^ 119);
            if (df.field_O) {
              qh.a(GameApplet.field_o, true);
              df.field_O = false;
            }
            if (!gh.field_x) {
              if (o.field_l <= 0) {
                of.a(0, 0, (byte) 90, true, 0);
              } else {
                of.a(0, 0, (byte) 104, true, 2);
              }
            } else {
              of.a(0, 0, (byte) 55, true, 1);
            }
            if (fa.field_g >= 2) {
              var8 = "FPS:" + oh.field_e;
              tf.field_x.b(var8, 636, 80, 0, -1);
              var3 = Runtime.getRuntime().totalMemory();
              var5 = Runtime.getRuntime().freeMemory();
              var9 = (-var5 + var3) / 1024L + " kB / " + var3 / 1024L + " kB";
              tf.field_x.b(var9, 636, 100, 0, -1);
              if (g.a(84, 0)) {
                tf.field_x.b("" + qh.field_J, 636, 120, 0, -1);
              }
            }
            stackIn_34_0 = 140;
            stackIn_34_1 = ng.field_I;
            stackIn_34_2 = 320;
            stackIn_34_3 = 384;
            stackIn_34_4 = rj.field_d;
            stackIn_34_5 = pi.field_c;
            stackIn_34_6 = 127;
            stackIn_36_7 = (ui.field_b) || (ij.field_z);
            ic.$cfr$intArgs$a$ceabca3815d0(stackIn_34_0, stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, stackIn_34_5, stackIn_34_6, stackIn_36_7);
          }
          if (ol.field_a &&
            BufferedSocket.field_p != null) {
            BufferedSocket.field_p.a(aa.field_g, df.field_R, BufferedSocket.field_p.field_B, BufferedSocket.field_p.y, BufferedSocket.field_p.x, BufferedSocket.field_p.type, 2657, BufferedSocket.field_p.field_u);
            BufferedSocket.field_p.b(false, false);
            BufferedSocket.field_p.a((byte) -86, df.field_R, aa.field_g);
          }
          this.b((byte) 6);
          return;
        }
        SoftwareRasterizer.b();
    }

    final void c(byte param0) {
        if (tf.field_o > 0 &&
          !bh.field_p &&
          null == kf.field_a) {
          kf.field_a = wi.a(GameScreen.field_c, pa.field_x, new int[]{tf.field_o}, (byte) 77, 31, ac.field_d, ae.field_z, 65504, 3);
        }
        int var2 = 123 % ((param0 - 34) / 54);
    }

    final static void a(int param0, lj param1) {
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        pa var8 = null;
        int var9 = 0;
        pa var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          var8 = new pa(param1.a(-2, "", "logo.fo3d"));
          var10 = var8;
          if (param0 != -2681) {
            return;
          }
          var3 = var10.readUnsignedByte(-119);
          var10.l(8);
          ll.field_h = ue.a(-8191, var10);
          qc.field_a = new vg[var3];
          ok.field_d = new int[var3][];
          for (var4 = 0; var3 > var4; var4++) {
            qc.field_a[var4] = RandomAccessCacheFile.a(var8, (byte) -25);
          }
          var10.m(8);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5 = qc.field_a[var9];
            var5.a(6, 6, param0 + 2682, 6, 1);
            var5.b(-101);
            var6 = new int[]{var5.field_e + var5.field_p >> 1, var5.field_K + var5.field_N >> 1, var5.field_h + var5.field_B >> 1};
            ok.field_d[var9] = var6;
            var5.a((byte) 109, -var6[0], -var6[2], -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("wl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_180_0 = 0;
        boolean stackIn_182_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (!GameClientBase.p(-112)) {
          stackIn_6_0 = (UiComponent.field_o <= 0) ? 1 : 0;
        } else {
          stackIn_6_0 = 1;
        }
        var2 = stackIn_6_0;
        sf.a(16);
        ch.b(false);
        ef.field_k = ef.field_k + 1;
        qa.field_h = qa.field_h + 1;
        if (!(dk.field_a <= 4) ||
          qa.field_h % 200 == 0 &&
          !(dk.field_a <= 0) &&
          !GameKeyHandler.field_b) {
          fh.field_d = 200;
          dk.field_a = dk.field_a - 1;
        }
        if (lj.field_b > 0) {
          lj.field_b = lj.field_b - 1;
        }
        FullscreenFocusCanvas.field_c = FullscreenFocusCanvas.field_c + 1;
        de.field_d = de.field_d + 1;
        if (0 < fh.field_d) {
          fh.field_d = fh.field_d - 1;
        }
        if (hc.field_S % 32 == 0) {
          hc.field_S = 0;
        }
        if (de.field_d >= 8) {
          de.field_d = 0;
        }
        hc.field_S = hc.field_S + 1;
        if (SocketConnector.field_k <= 0) {
          this.field_j = this.field_j + 1;
          if (this.field_j > 100) {
            BufferedSocket.field_p.x = BufferedSocket.field_p.field_r;
            BufferedSocket.field_p.y = BufferedSocket.field_p.field_f;
            if (!GameClientBase.p(-114)) {
              this.c((byte) -39);
            }
            oi.a(true, true, true);
            rc.c((byte) -82);
            qh.d(true);
            sd.a(126);
            sd.b(-121);
            if (UiComponent.field_o <= 0) {
              cd.field_o = true;
            } else {
              cd.field_o = false;
            }
            o.a(6, true);
            return;
          }
        }
        BufferedSocket.field_p.x(96);
        while (kj.e((byte) 120)) {
          ac.field_d = ac.field_d ^ 1 << tf.field_o;
          pi.field_a = pi.field_a - ub.field_j;
          ae.field_z = ae.field_z ^ 1 << tf.field_o;
          al.field_z = al.field_z - 1;
          if (this.field_f &&
            nj.field_c[82] &&
            b.field_J == 11) {
            SocketConnector.field_k = 3;
            ol.field_a = true;
            ac.field_d = ac.field_d + 64;
            pi.field_a = pi.field_a + 128;
            bh.field_p = true;
          }
          if (b.field_J == 13) {
            be.a(1, (byte) -110, false);
            FullscreenFocusCanvas.field_j = true;
            return;
          }
          if (this.field_f &&
            1 == b.field_J) {
            al.field_z = al.field_z + 256;
            if (aj.field_h) {
              aj.field_h = false;
            } else {
              aj.field_h = true;
            }
            bh.field_p = true;
            ae.field_z = ae.field_z - 64;
          }
          if (this.field_f &&
            b.field_J == 2) {
            ub.field_j = ub.field_j - 32;
            pa.field_x = pa.field_x + 128;
            if (!rc.field_u) {
              rc.field_u = true;
            }
            bh.field_p = true;
          }
          if (!this.field_f) {
            continue;
          }
          if (3 != b.field_J) {
            continue;
          }
          GameScreen.field_c = GameScreen.field_c - 32;
          pi.field_f = pi.field_f + 64;
          if (!nj.field_a) {
            nj.field_a = true;
          }
          bh.field_p = true;
          rc.field_u = false;
        }
        if (this.field_f &&
          nj.field_c[19] &&
          BufferedSocket.field_p != null) {
          pi.field_a = pi.field_a - 32;
          if (DualLinkNode.field_o) {
            BufferedSocket.field_p.field_db = BufferedSocket.field_p.field_db + 1;
            DualLinkNode.field_o = false;
          }
          ac.field_d = ac.field_d + 64;
          bh.field_p = true;
        }
        if (this.field_f &&
          nj.field_c[20]) {
          bh.field_p = true;
          DualLinkNode.field_o = true;
          pi.field_f = pi.field_f - 128;
          ae.field_z = ae.field_z + 256;
        }
        if (this.field_f &&
          nj.field_c[21] &&
          null != BufferedSocket.field_p) {
          bh.field_p = true;
          al.field_z = al.field_z - 256;
          if (pg.field_s) {
            BufferedSocket.field_p.field_d = BufferedSocket.field_p.field_d + 1;
            pg.field_s = false;
          }
          GameScreen.field_c = GameScreen.field_c + 128;
        }
        if (nj.field_c[96] &&
          null != BufferedSocket.field_p) {
          BufferedSocket.field_p.field_c = true;
        }
        if (this.field_f &&
          nj.field_c[22]) {
          pg.field_s = true;
          GameScreen.field_c = GameScreen.field_c + 512;
          pi.field_f = pi.field_f - 32;
          bh.field_p = true;
        }
        if (!nj.field_c[97] &&
          !nj.field_c[96] &&
          null != BufferedSocket.field_p) {
          BufferedSocket.field_p.field_j = true;
        }
        if (nj.field_c[97] &&
          null != BufferedSocket.field_p) {
          BufferedSocket.field_p.field_N = true;
        }
        if (nj.field_c[83] ||
          nj.field_c[98] ||
          nj.field_c[ll.field_a] &&
          BufferedSocket.field_p != null) {
          BufferedSocket.field_p.field_ab = true;
          if (nj.field_c[98]) {
            BufferedSocket.field_p.field_s = true;
          }
        }
        if (this.field_f &&
          rc.field_u &&
          nj.field_a) {
          nj.field_a = false;
          al.field_z = al.field_z - 256;
          ac.field_d = ac.field_d + 128;
          hk.field_b = true;
          bh.field_p = true;
          eb.field_n = true;
          rc.field_u = false;
        }
        if (nj.field_c[99]) {
          BufferedSocket.field_p.field_n = true;
        }
        if (nj.field_c[82] ||
          nj.field_c[of.field_d]) {
          BufferedSocket.field_p.field_ib = true;
        }
        if (this.field_f &&
          nj.field_c[48]) {
          pi.field_a = pi.field_a + 1024;
          bh.field_p = true;
          GameScreen.field_c = GameScreen.field_c - 128;
          hf.a(255, 13, qb.field_d);
          qb.field_d = qb.field_d + 1;
          if (qb.field_d >= 16) {
            qb.field_d = 0;
          }
        }
        if (eb.field_n &&
          hk.field_b) {
          if (gh.field_x) {
            bi.field_f = true;
          } else {
            hk.field_b = false;
            eb.field_n = false;
          }
          oi.a(false, true, true);
          rc.c((byte) -82);
          qh.d(true);
          sd.a(126);
          sd.b(121);
          o.a(5, true);
          return;
        }
        if (param0 < 9) {
          field_d = (String) null;
        }
        ba.field_i.d(-1);
        ij.field_z = false;
        rj.field_d = null;
        eb.field_n = false;
        BufferedSocket.field_p.c((byte) 29, aa.field_g);
        if (0 < BufferedSocket.field_p.field_db) {
          ub.field_i = false;
          df.field_R = 32 * BufferedSocket.field_p.x - (-(32 * BufferedSocket.field_p.field_B / 256) - 32);
          aa.field_g = -32 + (-240 + (64 * BufferedSocket.field_p.field_u / 256 + BufferedSocket.field_p.y * 64));
          if (aa.field_g < 0) {
            aa.field_g = 0;
          }
          if (aa.field_g > -480 + 64 * ba.field_i.field_a) {
            aa.field_g = -480 + 64 * ba.field_i.field_a;
          }
          boolean decompiledFrameRemainder0 = true;
          this.field_e = aa.field_g;
          if ((BufferedSocket.field_p.field_eb &&
            !this.field_g ||
            this.field_g &&
            this.field_a <= 10) && (vj.field_c == 2 &&
            BufferedSocket.field_p.field_h == 0)) {
            if (this.field_g &&
              this.field_a <= 10) {
              this.field_a = this.field_a + 1;
            } else {
              this.field_a = 0;
              this.field_g = true;
              this.field_k = fj.a(1870096848, 1024, 6553);
              this.field_k = fj.a(1870096848, this.field_k, this.field_h << 16);
              this.field_e = aa.field_g;
            }
            aa.field_g = this.field_e - (fj.a(1870096848, this.field_k, (-this.field_a + 10) * (this.field_a + 10) << 16) >> 16);
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_g = false;
          }
          if (!gh.field_x) {
            td.field_n = PacketBuffer.field_r[ea.field_e];
            var3 = ba.field_i.field_a * 64;
            var4 = var3 - BufferedSocket.field_p.field_z;
            if (td.field_n > var4 &&
              td.field_n > 0) {
              td.field_n = td.field_n - var4;
              aa.field_g = aa.field_g + td.field_n;
              this.field_e = this.field_e + td.field_n;
              ub.field_i = true;
            }
          }
        }
        ed.a((byte) 89, aa.field_g);
        BufferedSocket.field_p.b(true, false);
        stackIn_180_0 = -73;
        stackIn_182_1 = (ui.field_b) || (ij.field_z);
        hf.$cfr$intArgs$a$759f676cf37b(stackIn_180_0, stackIn_182_1, ng.field_I, pi.field_c, rj.field_d, true);
        this.a((byte) -71);
        rc.c((byte) -82);
        if (gh.field_x &&
          bi.field_f) {
          bi.field_f = false;
          oi.a(false, true, true);
          rc.c((byte) -82);
          if (var2 != 0 &&
            !GameClientBase.p(-95)) {
            this.c((byte) 110);
          } else {
            if (!GameClientBase.p(-89) &&
              ea.field_e == 8) {
              this.c((byte) -62);
            }
          }
          qh.d(true);
          sd.a(124);
          sd.b(120);
          o.a(5, true);
        }
        if (cj.field_b) {
          bb.activeScreenId = 13;
          bc.field_o = 13;
          cj.field_b = false;
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != 10) {
          return;
        }
        try {
          le.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "wl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        int var18 = 0;
        int var7 = 0;
        int var5 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var10 = 0;
        int var8 = 0;
        int var6 = 0;
        String var3 = null;
        int var17 = 0;
        Object var20 = null;
        int var19 = TorChallenge.field_F ? 1 : 0;
        int var4 = 112 % ((param0 + 31) / 32);
        ul var20_ref = (ul) (db.field_D.first((byte) 106));
        ul var2 = var20_ref;
        int var13 = tf.field_j[0].field_x >> 2;
        Sprite[] var14 = ng.field_L;
        int var15 = var14[0].field_u;
        int var16 = var14[0].field_x;
        int var10Lifetime1;
        int var8Lifetime1;
        if (var2 != null) {
          var18 = fk.field_t;
          var7 = 220;
          var5 = tf.field_x.a(BufferedSocket.field_n[var20_ref.field_i]);
          if (80 > var18) {
            var17 = -32 + var18 / 2;
          } else {
            if (var18 < 230) {
              var17 = 8;
            } else {
              var17 = 123 - var18 / 2;
            }
          }
          var9 = var17;
          var11 = 40 + (2 * (var15 + 1) + var5);
          var12 = var13 + (var16 << 1) + 2;
          if (var11 < 200) {
            var11 = 200;
          }
          var10 = var16 + 1;
          var8 = var15;
          GzipDecoder.a(var14, var12, var11, (byte) -78, var9, var7);
          tf.field_j[var20_ref.field_i].h(var8 + var7, var10 + var9);
          var6 = 24;
          var8Lifetime1 = var15 + 40;
          var3 = BufferedSocket.field_n[var20_ref.field_i];
          var10Lifetime1 = -(var6 >> 1) + (1 + (var16 + (var13 >> 1) + 18));
          tf.field_x.c(var3, var8Lifetime1 + var7, var10Lifetime1 + var9, 0, -1);
          return;
        }
    }

    final void a(byte param0) {
        int fieldTemp$0 = 0;
        int var2 = -62 % ((-15 - param0) / 35);
        if (null != db.field_D.first((byte) 124)) {
          fieldTemp$0 = fk.field_t + 1;
          fk.field_t = fk.field_t + 1;
          if (fieldTemp$0 == 335) {
            fk.field_t = 0;
            db.field_D.pollFirst((byte) 93);
          }
          return;
        }
    }

    final static void d(int param0) {
        if (!vc.field_e) {
          cj.field_g = 20;
          cd.field_b = 0;
          aa.field_f = 80;
          vc.field_e = true;
          fh.field_b = 1;
        }
        cd.field_b = cd.field_b + 1;
        kk.field_d = cd.field_b;
        if (!(cd.field_b <= aa.field_f >> 1)) {
          bb.activeScreenId = 10;
          bc.field_o = 10;
          kk.field_d = kk.field_d - (aa.field_f >> 1);
          fh.field_b = -1;
        }
        if (param0 != 335) {
          return;
        }
        if (!(cd.field_b <= aa.field_f)) {
          cd.field_b = 0;
          cj.field_g = 0;
          kk.field_d = 0;
          vc.field_e = false;
          aa.field_f = 0;
          fh.field_b = 0;
          return;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        field_c = (fe[][]) null;
        field_l = null;
        if (param0 != 10) {
          lj var2 = (lj) null;
          wl.a(88, (lj) null);
        }
    }

    wl(int param0, int param1, boolean param2) {
        int var8 = 0;
        boolean stackIn_3_1 = false;
        int var4;
        int var5;
        int var6;
        int var7;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime2Lifetime1;
        this.field_g = false;
        this.field_e = 0;
        this.field_a = 0;
        stackIn_3_1 = !(fa.field_g < 2);
        this.field_f = stackIn_3_1;
        ae.field_z = 16;
        ui.field_b = param2;
        tf.field_o = 0;
        ac.field_d = 8;
        ef.field_k = 0;
        GameScreen.field_c = -1089027477;
        vj.field_c = param1;
        ab.field_d = 1;
        this.field_i = param0;
        pa.field_x = 32;
        gh.field_x = false;
        GzipDecoder.field_d = 0;
        ea.field_e = this.field_i;
        SocketConnector.field_k = 3;
        var4 = 5;
        for (var5 = 0; var5 < 6; var5++) {
          for (var6 = 0; var4 > var6; var6++) {
            if ((pi.field_d[vj.field_c][var5] & 1 << var6) > 0) {
              GzipDecoder.field_d = GzipDecoder.field_d + 1;
            }
          }
        }
        var5Lifetime1 = ea.field_e;
        var6Lifetime1 = ea.field_e * 4 + 32;
        if (gh.field_x) {
          var6Lifetime1 = 32;
          var5Lifetime1 = -1 + (ea.field_e - 5 << 1);
        }
        ba.field_i = new ra(var6Lifetime1, var5Lifetime1);
        if (wi.field_a == null) {
          lb.d((byte) -79);
        }
        if (null == fj.field_m) {
          PacketBuffer.c(-7668);
        }
        if (null == pa.field_z) {
          jf.m(104);
        }
        if (lj.field_j == null) {
          hl.a((byte) 50);
        }
        ve.field_a = this;
        vk.field_i = null;
        ol.field_g = ba.field_i;
        if (je.field_c[ea.field_e] != null &&
          !ol.field_a) {
          LevelDecoder.a(false, je.field_c[ea.field_e], 24233, true);
        }
        if (BufferedSocket.field_p != null) {
          aa.field_g = -32 + 64 * BufferedSocket.field_p.y + BufferedSocket.field_p.field_u * 64 / 256 - 240;
          df.field_R = 32 * BufferedSocket.field_p.field_B / 256 + 32 * BufferedSocket.field_p.x + 32;
          if (aa.field_g < 0) {
            aa.field_g = 0;
          }
          if (aa.field_g > -480 + ba.field_i.field_a * 64) {
            aa.field_g = -480 + 64 * ba.field_i.field_a;
          }
        }
        be.field_b = false;
        for (var7 = 0; 3 > var7; var7++) {
          vd.field_d[var7] = new Sprite(lh.field_C[var7], lh.field_q[var7]);
          jl.field_a[var7] = new Sprite(lh.field_C[var7], lh.field_q[var7]);
        }
        for (var7Lifetime1 = 0; var7Lifetime1 < 256; var7Lifetime1++) {
          LevelEntity.field_A[var7Lifetime1] = 65793 * var7Lifetime1;
        }
        qh.a(0, true);
        eh.field_l = 0;
        df.field_O = false;
        GameApplet.field_o = 0;
        if (GameClientBase.p(-67)) {
          jj.field_c = 0;
          vi.field_a = 0;
          for (var7Lifetime2 = 0; var7Lifetime2 < 3; var7Lifetime2++) {
            for (var8 = 0; var8 < 6; var8++) {
              pi.field_d[var7Lifetime2][var8] = 0;
            }
            k.field_b[var7Lifetime2] = 0;
            hk.field_c[var7Lifetime2] = 0;
          }
          if (hf.field_d != null) {
            for (var7Lifetime2Lifetime1 = 0; hf.field_d.length > var7Lifetime2Lifetime1; var7Lifetime2Lifetime1++) {
              hf.field_d[var7Lifetime2Lifetime1] = (byte) 0;
            }
          }
        }
        bj.a((byte) 71);
        while (null != db.field_D.first((byte) -69)) {
          db.field_D.pollFirst((byte) 101);
        }
        qh.field_J = 0;
        fk.field_t = 0;
    }

    static {
        field_d = "Email: ";
        field_c = new fe[14][3];
        field_l = new int[]{1, 1, 1, 1, 1, 2};
        field_b = new IntrusiveDeque();
    }
}
