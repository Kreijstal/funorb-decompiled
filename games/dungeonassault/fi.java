/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends qe {
    static String field_t;
    static en[] field_r;
    private tf[] field_w;
    private cn field_v;
    private kl field_z;
    private tf field_A;
    private cn field_C;
    static nh field_u;
    private rh field_s;
    private int field_B;
    private int field_y;
    static String field_x;
    private rh field_D;

    private final int a(int param0, byte param1) {
        int var3 = 120;
        if (param1 != -93) {
          return -30;
        }
        int var4 = nk.field_Fb[param0];
        if (var4 == 27) {
          var3 = of.field_j.field_y;
        }
        return var3 + this.a((byte) -4, param0);
    }

    final static java.awt.Canvas d(boolean param0) {
        if (param0) {
          String var2 = (String) null;
          fi.a(105, -61, (String) null, 118);
        }
        return cm.field_R == null ? c.field_h : (java.awt.Canvas) ((Object) cm.field_R);
    }

    private final int a(boolean param0, int param1) {
        int var3;
        if (param0) {
          return -14;
        }
        var3 = nk.field_Fb[param1];
        if (25 != var3 &&
          var3 != 24 &&
          var3 != 26) {
          if (var3 != 27) {
            return 439;
          }
          return 340;
        }
        return 260;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = DungeonAssault.field_K;
        for (var4 = 0; var4 < nk.field_Fb.length; var4++) {
          var5 = this.a(false, var4);
          if (nl.a(var4, (byte) -124) &&
            param2 >= this.a((byte) -4, var4) &&
            param2 < this.a(var4, (byte) -93) &&
            param0 >= var5 &&
            param0 < this.c(param1 - 86, var4) + var5) {
            return var4;
          }
        }
        if (param1 != 116) {
          this.f();
        }
        return -1;
    }

    private final void a(boolean param0, int param1, int param2) {
        int[] stackIn_3_0 = null;
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int var12;
        int[] var13;
        int[] var14;
        var4 = nk.field_Fb[param1];
        var5 = this.a(-13, var4);
        var6 = ne.field_c.b(var5);
        var7 = this.a((byte) -4, param1);
        var8 = this.a(param1, (byte) -93);
        var9 = this.a(false, param1);
        var10 = var8 - (-var7 + var6) >> 1;
        if (!param0) {
          stackIn_3_0 = cm.field_M;
        } else {
          stackIn_3_0 = ml.field_b;
        }
        var14 = stackIn_3_0;
        var13 = var14;
        var11 = var13;
        if (null == this.field_w[param1] ||
          var5 != this.field_w[param1].field_f ||
          this.field_w[param1].field_h != var11) {
          this.field_w[param1] = new tf(ne.field_c, var5, var14);
        }
        of.field_j.h(640 - of.field_j.field_y >> 1, var9 - 4);
        this.field_w[param1].b(var9, 32, var10);
        if (param0) {
          if (param1 != this.field_y) {
            this.b(param1, -118);
          }
          this.field_v.b(var10, var9, 64);
          var12 = (int)((1.0 + te.a(mo.field_a)) * 128.0);
          if (0 > var12) {
            var12 = 0;
          }
          if (256 < var12) {
            var12 = 256;
          }
          this.field_C.b(var10, var9, var12);
        }
        if (param2 != 0) {
          this.a(true);
        }
    }

    final void c(boolean param0) {
        int var3;
        var3 = DungeonAssault.field_K;
        super.c(param0);
        if (!kh.field_s ||
          !param0) {
          while (ha.b((byte) 47)) {
            if (mm.field_t == 13) {
              gd.a(hl.field_f, 0, hl.field_f, false);
              continue;
            }
            this.f();
            if (nk.field_Jb.field_b == -1) {
              continue;
            }
            this.b(false, 240, nk.field_Jb.field_b);
          }
          nk.field_Jb.a(-7734, this.a(hm.field_k, (byte) 116, lc.field_c), this.a(eh.field_h, (byte) 116, hj.field_S));
          if (-1 != nk.field_Jb.field_b) {
            this.b(true, 240, nk.field_Jb.field_b);
          }
        }
    }

    final void c() {
        super.c();
    }

    final void b(boolean param0) {
        super.b(param0);
        int var2 = nk.field_Jb.field_i <= 0 ? -1 : 1;
        if (nk.field_Jb.field_b != -1) {
          var2 = nk.field_Jb.field_b;
        }
        nk.field_Jb.a(false, param0, var2, this.a(eh.field_h, (byte) 116, hj.field_S));
        this.field_D = new rh(58, 394, 80, 160, 255, 197376, 240);
        this.field_s = new rh(580, 394, 80, 160, 255, 197376, 240);
        this.field_w = new tf[nk.field_Jb.field_i];
        this.field_z = new kl();
        jh.a(this.field_e);
        bf.a(false, -128);
        kn.field_e = false;
        c.a(0, 640, 0, (byte) 44);
        c.a(0, 640, 40, (byte) 44);
        vf.a(432, true, 33, 125, 48);
        vf.a(432, true, 599, 117, 48);
        vf.a(32, true, 164, -110, 8);
        vf.a(32, true, 468, -2, 8);
        un.a(41, (byte) -98, 558, 416, true);
        ad.field_e.h(41, 48);
        ad.field_e.j(-ad.field_e.field_d + 599, 48);
        ad.field_e.f(164 - ad.field_e.field_d, -ad.field_e.field_b + 40);
        ad.field_e.i(172, 40 - ad.field_e.field_b);
        ad.field_e.f(468 - ad.field_e.field_d, 40 - ad.field_e.field_b);
        ad.field_e.i(476, -ad.field_e.field_b + 40);
        jh.b();
    }

    private final int c(int param0, int param1) {
        if (param0 != 30) {
          return -57;
        }
        return 30;
    }

    final void a(boolean param0) {
        boolean stackIn_9_1 = false;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_23_0;
        boolean stackIn_23_3;
        boolean stackIn_33_1 = false;
        int var2;
        Object var3;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var2Lifetime1;
        int var2Lifetime2;
        var10 = DungeonAssault.field_K;
        super.a(param0);
        this.field_e.b(0, 0);
        am.field_a.h(320 - am.field_a.field_E / 2, 48);
        for (var2 = 0; var2 < -1 + nk.field_Jb.field_i; var2++) {
          if (nl.a(var2, (byte) -124)) {
            stackIn_9_1 = (var2 == nk.field_Jb.field_b) && (!kn.field_e);
            this.c(stackIn_9_1, -33, var2);
          }
        }
        oe.field_m.h(24, 383);
        oe.field_m.j(560, 383);
        if (!kn.field_e) {
          fi.e();
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < -1 + nk.field_Jb.field_i; var2Lifetime1++) {
          if (nl.a(var2Lifetime1, (byte) -124)) {
            stackIn_22_1 = 1;
            stackIn_22_2 = var2Lifetime1;
            if (nk.field_Jb.field_b == var2Lifetime1 &&
              !kn.field_e) {
              stackIn_23_0 = this;
              stackIn_23_3 = true;
            } else {
              stackIn_23_0 = this;
              stackIn_23_3 = false;
            }
            this.a(stackIn_22_1, stackIn_22_2, stackIn_23_3);
          }
        }
        na.field_w.a(320, 25, 1699);
        if (this.field_A == null ||
          this.field_A.field_f != ie.field_j[mo.field_e]) {
          this.field_A = new tf(ne.field_c, ie.field_j[mo.field_e], ag.field_c);
        }
        this.field_A.b(90, 32, 87);
        this.a(87, 3740, 200, en.field_a[mo.field_e], 446, 125);
        wk.a(552, bj.a(mo.field_e, 77), ne.field_c, 366, ag.field_c, 31139);
        if (kn.field_e) {
          this.field_z.a((byte) -64);
          var2Lifetime2 = nk.field_Jb.field_i - 1;
          fi.e();
          this.field_z.b(106);
          stackIn_33_1 = (nk.field_Jb.field_b == var2Lifetime2);
          this.a(stackIn_33_1, var2Lifetime2, 0);
          var3 = null;
          var4 = null;
          if (this.field_B == 2) {
            var4 = tn.a((byte) -65, this.a(-13, 26));
            var3 = sg.field_a;
          } else {
            if (1 != this.field_B) {
              if (this.field_B == 0) {
                var4 = tn.a((byte) -76, this.a(-13, 24));
                var3 = uj.field_b;
              }
            } else {
              var4 = tn.a((byte) -99, this.a(-13, 25));
              var3 = an.field_D;
            }
          }
          var5 = ne.field_c.field_E + ne.field_c.field_H;
          if (this.field_B != 0) {
            var9 = 204;
            var7 = 169;
            var8 = 306;
            var6 = 167;
          } else {
            var7 = 119;
            var9 = 254;
            var6 = 77;
            var8 = 486;
          }
          pi.a(0, (String) (var4), cm.field_M, 30 + var6, ne.field_c, var5 + var7);
          var7 = var7 + (5 + var5);
          la.field_b.a((String) (var3), 30 + var6, var7, var8 - 60, -30 + var9, 16777215, -1, 0, 0, la.field_b.field_H + la.field_b.field_E);
        }
        oh.a((byte) 36);
        this.field_D.d();
        this.field_s.d();
    }

    private final void c(boolean param0, int param1, int param2) {
        int stackIn_8_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var4 = this.a((byte) -4, param2);
        var5 = this.a(param2, (byte) -93);
        var6 = this.a(false, param2);
        var7 = this.c(30, param2);
        gf.e(-4 + var4, -6 + var6, 8 + (var5 - var4), 8 + var7, 0);
        fi.b(var4, var6 - 2, -var4 + var5, var7, 8421504, 128, 128);
        var9 = 106 % ((param1 - 71) / 37);
        var8 = nk.field_Fb[param2];
        if (var8 != 25) {
          if (var8 != 24) {
            stackIn_8_0 = (var8 == 26) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
        } else {
          stackIn_8_0 = 1;
        }
        var10 = stackIn_8_0;
        if (var10 != 0) {
          rp.a(4, -var4 + var5, (byte) 108, var4, var7, kc.field_V, -2 + var6);
        } else {
          rp.a(4, var5 - var4, (byte) 108, var4, var7, kc.field_S, var6 - 2);
        }
        fi.a(var4, var6 - 2, var5 - var4, var7, 224, 64, 3, 128);
    }

    final static void a(int param0, int param1, String param2, int param3) {
        cf dupTemp$0 = null;
        int var5 = 99 % ((3 - param1) / 34);
        ac var4 = gh.field_i[param3];
        if (var4 == null) {
          return;
        }
        try {
          dupTemp$0 = hd.a(false, param0, "da_guardian_room_" + param2);
          var4.field_a = dupTemp$0;
          var4.field_x = dupTemp$0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "fi.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int var3 = nk.field_Fb[param0];
        String var4 = this.a(-13, var3);
        int var5 = ne.field_c.b(var4);
        int var6 = ne.field_c.field_E + ne.field_c.field_H;
        if (param1 > -85) {
          return;
        }
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        ne.field_c.b(var4, 0, ne.field_c.field_H, 16760960, -1);
        jh.b();
        this.field_v = rb.a(8, var7, 16760960, (byte) 77);
        this.field_C = rb.a(16, var7, 6307840, (byte) -105);
        this.field_y = param0;
    }

    private final int a(byte param0, int param1) {
        if (param0 != -4) {
          this.a(true, -67, -118);
        }
        int var3 = nk.field_Fb[param1];
        if (var3 == 27) {
          return 640 - of.field_j.field_y >> 1;
        }
        if (var3 == 25 ||
          24 == var3 ||
          var3 == 26) {
          param1 -= 3;
        }
        return 140 * param1 + 120;
    }

    final void f() {
        int var1;
        int var2;
        int var1Lifetime1;
        int var1Lifetime2;
        int var1Lifetime2Lifetime1;
        var2 = DungeonAssault.field_K;
        if (!nk.field_Jb.b((byte) -84) &&
          !kn.field_e) {
          if (96 == mm.field_t) {
            var1 = nk.field_Jb.field_b;
            while (true) {
              var1--;
              if (var1 < 0) {
                var1 = nk.field_Jb.field_i - 1;
              }
              if (!nl.a(var1, (byte) -124)) {
                continue;
              }
              break;
            }
            nk.field_Jb.b(var1, 3);
          }
          if (mm.field_t == 97) {
            var1Lifetime1 = nk.field_Jb.field_b;
            while (true) {
              var1Lifetime1++;
              if (nk.field_Jb.field_i <= var1Lifetime1) {
                var1Lifetime1 = 0;
              }
              if (!nl.a(var1Lifetime1, (byte) -124)) {
                continue;
              }
              break;
            }
            nk.field_Jb.b(var1Lifetime1, 3);
          }
          if (6 == mo.field_e) {
            if (98 == mm.field_t) {
              var1Lifetime2 = nk.field_Jb.field_b;
              while (true) {
                var1Lifetime2 -= 3;
                if (var1Lifetime2 < 0) {
                  var1Lifetime2 = -1 + nk.field_Jb.field_i + var1Lifetime2;
                }
                if (!nl.a(var1Lifetime2, (byte) -124)) {
                  continue;
                }
                break;
              }
              nk.field_Jb.b(var1Lifetime2, 3);
            }
            if (mm.field_t == 99) {
              var1Lifetime2Lifetime1 = nk.field_Jb.field_b;
              while (true) {
                var1Lifetime2Lifetime1 += 3;
                if (var1Lifetime2Lifetime1 == 6) {
                  var1Lifetime2Lifetime1 = 0;
                }
                if (var1Lifetime2Lifetime1 >= nk.field_Jb.field_i) {
                  var1Lifetime2Lifetime1 = var1Lifetime2Lifetime1 - (-1 + nk.field_Jb.field_i);
                }
                if (!nl.a(var1Lifetime2Lifetime1, (byte) -124)) {
                  continue;
                }
                break;
              }
              nk.field_Jb.b(var1Lifetime2Lifetime1, 3);
            }
          }
        }
        nk.field_Jb.e(107);
        super.f();
    }

    public static void a(byte param0) {
        field_x = null;
        if (param0 > -99) {
          fi.a((byte) 2);
        }
        field_r = null;
        field_t = null;
        field_u = null;
    }

    private final void a(int param0, int param1, int param2, String param3, int param4, int param5) {
        int var10 = 0;
        String[] var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String var11 = null;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var12 = DungeonAssault.field_K;
        try {
          var7 = jn.a(param3, new int[]{param4}, param1 - 3847, la.field_b);
          if (param1 != 3740) {
            return;
          }
          var8 = la.field_b.field_H + param5;
          var9 = var7;
          for (var10 = 0; var9.length > var10; var10++) {
            var11 = var9[var10];
            if (param4 * 3 >> 2 <= la.field_b.b(var11)) {
              la.field_b.b(var11, param0, var8, 16777215, -1);
            } else {
              la.field_b.b(var11, param0, var8, 16777215, -1);
            }
            var8 = var8 + (la.field_b.field_E + la.field_b.field_H);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("fi.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void b(boolean param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4;
        int var9;
        int var5;
        int var6;
        int var7;
        int var8;
        var9 = DungeonAssault.field_K;
        if (param1 != 240) {
          discarded$1 = this.a(false, 31);
        }
        var4 = nk.field_Fb[param2];
        if (nk.field_Jb.c(param1 ^ 176) &&
          nl.a(param2, (byte) -124)) {
          if (var4 == 27) {
            kn.field_e = false;
          }
          if (!kn.field_e) {
            if (var4 != 25 &&
              var4 != 24 &&
              26 != var4) {
              hm.a(var4, param2, param0, param1 ^ -221);
            } else {
              if (var4 != 26) {
                if (var4 == 25) {
                  this.field_B = 1;
                } else {
                  if (24 == var4) {
                    this.field_B = 0;
                  }
                }
              } else {
                this.field_B = 2;
              }
              kn.field_e = true;
              if (!param0) {
                nk.field_Jb.field_b = 6;
              }
              if (this.field_B != 0) {
                var5 = 167;
                var6 = 154;
                var7 = 306;
                var8 = 204;
              } else {
                var6 = 104;
                var7 = 486;
                var8 = 254;
                var5 = 77;
              }
              this.field_z.a(var6, var7, var5, -23241, var8);
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int[] stackIn_5_0 = null;
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int var12;
        int[] var13;
        int[] var14;
        var4 = nk.field_Fb[param1];
        var5 = this.a(param0 ^ -14, var4);
        var6 = ne.field_c.b(var5);
        if (param0 != 1) {
          return;
        }
        var7 = this.a((byte) -4, param1);
        var8 = this.a(param1, (byte) -93);
        var9 = this.a(false, param1);
        var10 = -var6 + (var8 + var7) >> 1;
        if (param2) {
          stackIn_5_0 = ml.field_b;
        } else {
          stackIn_5_0 = cm.field_M;
        }
        var14 = stackIn_5_0;
        var13 = var14;
        var11 = var13;
        if (null == this.field_w[param1] ||
          var5 != this.field_w[param1].field_f ||
          this.field_w[param1].field_h != var11) {
          this.field_w[param1] = new tf(ne.field_c, var5, var14);
        }
        this.field_w[param1].b(var9, param0 ^ 33, var10);
        if (param2) {
          if (this.field_y != param1) {
            this.b(param1, -114);
          }
          this.field_v.b(var10, var9, 64);
          var12 = (int)(128.0 * (1.0 + te.a(mo.field_a)));
          if (var12 < 0) {
            var12 = 0;
          }
          if (var12 > 256) {
            var12 = 256;
          }
          this.field_C.b(var10, var9, var12);
        }
        return;
    }

    fi() {
        this.field_y = -1;
    }

    private final String a(int param0, int param1) {
        String var3 = ll.field_m[param1];
        if (param1 == 10 &&
          (hl.field_f == 0 || 0 == dc.field_z || hl.field_f == 12 || dc.field_z == 12 || hl.field_f == 1 || dc.field_z == 1)) {
          var3 = ll.field_m[9];
        }
        if (param0 != -13) {
          return (String) null;
        }
        return var3;
    }

    static {
        field_t = "Disarmed";
        field_r = null;
        field_x = "Not yet achieved";
    }
}
