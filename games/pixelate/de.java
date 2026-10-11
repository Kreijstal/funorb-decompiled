/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class de {
    int field_d;
    int field_i;
    pf field_g;
    int field_a;
    static int field_j;
    int[] field_k;
    int field_l;
    static bb field_b;
    static int field_n;
    static boolean field_f;
    int field_m;
    static int field_h;
    static aa[] field_e;
    static tf field_c;

    int b(int param0, int param1) {
        if (this.field_l == 6 &&
          !jg.a((byte) 88)) {
          if (param1 < 2) {
            return this.field_d;
          }
          return this.field_i + this.field_d;
        }
        int var3 = -24 % ((-13 - param0) / 37);
        return param1 * this.field_i + this.field_d;
    }

    final static void a(int param0, int param1, int param2, tf param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        tf var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          if (t.field_e > param0) {
            param4 = param4 - (-param0 + t.field_e);
            param0 = t.field_e;
          }
          if (t.field_h < param4 + param0) {
            param4 = t.field_h - param0;
          }
          if (t.field_f > param1) {
            param7 = param7 - (-param1 + t.field_f);
            param1 = t.field_f;
          }
          if (t.field_a < param7 + param1) {
            param7 = -param1 + t.field_a;
          }
          if (param5 != -1) {
            field_f = false;
          }
          if (param4 > 0 &&
            param7 > 0) {
            var21 = param3.a();
            var30 = t.field_k;
            var10 = t.field_j;
            var11 = t.field_d;
            var29 = new int[4];
            t.a(var29);
            param3.c();
            t.d(var29[0], var29[1], var29[2], var29[3]);
            var13 = param3.field_F * param1 + param0;
            var14 = param3.field_F - param4;
            var25 = var21.field_G;
            var22 = var25;
            var15 = var22;
            for (var16 = param1; var16 < param7 + param1; var16++) {
              for (var17 = param0; param4 + param0 > var17; var17++) {
                var18 = var25[var13];
                if (var18 != 0 && (0 < var17 &&
                  var15[var13 - 1] == 0 ||
                  var16 > 0 &&
                  var15[var13 - param3.field_F] == 0 ||
                  var17 < -1 + param3.field_F &&
                  var15[var13 + 1] == 0 ||
                  !(-1 + param3.field_E <= var16) &&
                  var15[var13 + param3.field_F] == 0)) {
                  t.c(var17, var16, param6, param2);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.b(-param3.field_D, -param3.field_y);
            t.a(var30, var10, var11);
            t.b(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_42_0 = var8;
          stackIn_42_1 = new StringBuilder().append("de.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    abstract void a(int param0);

    final void a(int param0, byte param1, int param2) {
        fi.a(320, param0, param2 + 290, oc.field_S);
        if (param1 >= -82) {
          field_e = (aa[]) null;
        }
        t.a(30, param0 + 20, 580, param2 + 250, 0, 180);
        t.b(30, param0 + 20, 580, 250 + param2, 16777215, 192);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        var3 = Pixelate.field_H ? 1 : 0;
        for (var2 = 0; this.field_g.field_h > var2; var2++) {
          if (this.c(param0 - 47, var2)) {
            stackIn_7_1 = -125;
            stackIn_8_2 = (var2 == this.field_g.field_j);
            this.a((byte) stackIn_7_1, stackIn_8_2, var2);
          }
        }
        if (param0 != -71) {
          this.a(27, false);
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        if (ke.field_a == 96) {
          if (0 < this.field_g.field_j) {
            if (this.field_g.field_j != 2) {
              this.field_g.a(false, 0);
            }
          } else {
            this.field_g.a(false, 1);
          }
        }
        if (ke.field_a == 97) {
          if (this.field_g.field_j != 1) {
            if (this.field_g.field_j != 2) {
              this.field_g.a(false, 1);
            }
          } else {
            this.field_g.a(false, 0);
          }
        }
        if (ke.field_a == 99) {
          if (0 <= this.field_g.field_j &&
            this.field_g.field_j <= 1) {
            this.field_g.a(false, 2);
          } else {
            this.field_g.a(false, d.field_c);
          }
        }
        if (ke.field_a == 98) {
          if (2 == this.field_g.field_j) {
            this.field_g.a(false, d.field_c);
          } else {
            this.field_g.a(false, 2);
          }
        }
        this.field_g.b((byte) -71);
        var2 = 44 / ((param0 + 21) / 50);
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 != -1) {
          return;
        }
        field_b = null;
        field_e = null;
    }

    void a(byte param0, boolean param1, int param2) {
        if (param0 > -116) {
          this.b((byte) 11);
        }
        this.a((byte) 35, oc.field_S, param1, param2);
    }

    void a(int param0, int param1, boolean param2) {
        this.field_g.a(param2, this.a(uf.field_d, bg.field_k, -119), 17068, param1);
        nk.field_i = pa.field_b;
        if (param0 != 2) {
          field_h = -13;
        }
    }

    int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param2 > -110) {
          field_c = (tf) null;
        }
        for (var4 = 0; var4 < this.field_k.length; var4++) {
          var5 = this.b(-108, var4);
          if (this.c(-113, var4) &&
            this.a(var4, (byte) 90) <= param0 &&
            param0 < this.a(var4, false) &&
            var5 <= param1 &&
            param1 < var5 + this.a(-28071, var4)) {
            return var4;
          }
        }
        return -1;
    }

    int a(int param0, int param1) {
        if (param0 != -28071) {
          de.a((byte) -105, true);
        }
        return 30;
    }

    final void a(boolean param0) {
        if (!param0) {
          this.field_d = 59;
        }
        if (this.field_l == 5) {
          aa.field_p = null;
        }
        if (this.field_l == 6) {
          ca.field_f = null;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!param1) {
          this.field_m = -106;
        }
        this.a(we.field_o[7], oc.field_W, (byte) 109, param0);
    }

    final void a(String param0, tf param1, byte param2, boolean param3) {
        if (param2 < 98) {
          return;
        }
        try {
          this.a(param3, param0, param1, -6, 320);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "de.NA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void c(int param0) {
        bm.field_u.f(0, param0);
        rh.b((byte) -67);
    }

    int a(int param0, boolean param1) {
        if (this.field_l == 5 &&
          !jg.a((byte) 78)) {
          return 3 <= param0 ? 380 : 200 + 200 * param0;
        }
        if (param1) {
          return 50;
        }
        if (this.field_l == 6 &&
          !jg.a((byte) 77)) {
          return 2 <= param0 ? 380 : param0 * 240 + 300;
        }
        return this.field_a;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 28) {
          field_h = -12;
        }
        if (null != he.field_f) {
          he.field_f.a(param1, 0);
        }
    }

    void b(int param0) {
        if (param0 >= -35) {
          return;
        }
        if (this.field_l == 6 &&
          !jg.a((byte) 84)) {
          this.a((byte) 81);
        } else {
          this.field_g.a((byte) -48);
        }
    }

    int a(int param0, byte param1) {
        if (param1 != 90) {
          this.field_a = -74;
        }
        if (this.field_l == 5 &&
          !jg.a((byte) 125)) {
          return param0 >= 3 ? 260 : 200 * param0 + 40;
        }
        if (6 == this.field_l &&
          !jg.a((byte) 66)) {
          return 2 <= param0 ? 260 : 100 + 240 * param0;
        }
        return this.field_m;
    }

    de(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        try {
          this.field_m = param1;
          this.field_l = param0;
          this.field_i = param4;
          this.field_d = param3;
          this.field_a = param2;
          this.a(param5, (byte) -24);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "de.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void c(byte param0);

    final void a(byte param0, tf param1, boolean param2, int param3) {
        try {
          this.a(we.field_o[this.field_k[param3]], param2, param3, param1, (byte) 89);
          if (param0 != 35) {
            field_b = (bb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "de.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int[] param0, byte param1) {
        try {
          this.field_k = param0;
          this.field_g = new pf(this.field_k.length);
          if (param1 != -24) {
            this.field_d = 119;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "de.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean c(int param0, int param1) {
        if (param0 >= -112) {
          this.field_i = 64;
          return true;
        }
        return true;
    }

    final void d(byte param0) {
        this.a(120, (byte) -102, 0);
        int var2 = -125 % ((param0 - 5) / 39);
    }

    final void a(String param0, boolean param1, int param2, tf param3, byte param4) {
        int stackIn_27_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        tf[] var16 = null;
        int var17 = 0;
        var17 = Pixelate.field_H ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var6_int = this.field_k[param2];
          if (var6_int == 8) {
            if (nc.field_a != 0 &&
              0 != ti.field_t &&
              nc.field_a != 12 &&
              ti.field_t != 12) {
              if (1 != nc.field_a &&
                ti.field_t != 1) {
                if ((nc.field_a == 2 ||
                  ti.field_t == 2 ||
                  nc.field_a == 4 ||
                  ti.field_t == 4)) {
                  param0 = mg.field_k;
                }
              } else {
                param0 = mk.field_b;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              param0 = we.field_o[7];
            }
          }
          var7 = sc.field_h.c(param0);
          var8 = this.a(param2, (byte) 90);
          var9 = this.a(param2, false);
          var10 = this.b(-98, param2);
          if (var6_int == 20 ||
            21 == var6_int) {
            var7 = 120 + h.field_T;
          }
          var11 = -128 % ((param4 - 21) / 46);
          var12 = -var7 + var9 + var8 >> 1;
          var13 = this.a(-28071, param2);
          if (param1) {
            fi.a(var9 + var8 >> 1, var10 - 2, 35, param3);
          }
          stackIn_27_0 = (!param1) ? 2 : 0;
          var14 = stackIn_27_0;
          if (5 == this.field_l && (var6_int == 14 &&
            0 == of.field_a ||
            var6_int == 15 &&
            1 == of.field_a ||
            16 == var6_int &&
            of.field_a == 2)) {
            var14 = 1;
          }
          sc.field_h.a(param0, var12, var10 + sc.field_h.field_w, var14, -1);
          if (var6_int != 20 &&
            var6_int != 21) {
            return;
          }
          var12 = var12 + h.field_T;
          t.a(var12, var10 + var13 / 2 - 1, 121, 2, var14);
          if (var6_int == 20) {
            stackIn_45_0 = 120 * ia.field_h / 256;
          } else {
            stackIn_45_0 = wn.field_u * 120 / 256;
          }
          var15 = stackIn_45_0;
          var16 = rj.field_C[0].field_a;
          var16[1].f(-7 + (var12 + var15), 7 + var10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_49_0 = var6;
          stackIn_49_1 = new StringBuilder().append("de.BB(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean param0, String param1, tf param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          var6_int = 6;
          var7 = var6_int + sc.field_h.c(param1) + sn.field_m.field_A;
          var8 = param4 - var7 / 2;
          var9 = 420;
          var10 = 2;
          if (param0) {
            fi.a(param4, -7 + var9, 46, param2);
            var10 = 0;
          }
          if (param3 != -6) {
            field_n = -115;
          }
          sn.field_m.b(var8, var9);
          sc.field_h.a(param1, var6_int + var8 + sn.field_m.field_A, var9 + sc.field_h.field_w, var10, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "de.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(int param0, boolean param1, boolean param2) {
        int var6 = 0;
        if (!param1) {
          int[] var7 = (int[]) null;
          this.a((int[]) null, (byte) 12);
        }
        int var4 = param0 * 2;
        int var5 = param0 < 128 ? 0 : -256 + 2 * param0;
        if (param2) {
          var6 = var4;
          var4 = var5;
          var5 = var6;
        }
        pe.field_b.c();
        this.c(0);
        qa.field_f.a(19692);
        fi.a(pe.field_b.field_G, var4, var5);
    }

    void e(byte param0) {
        int var3;
        boolean stackIn_14_0 = false;
        var3 = Pixelate.field_H ? 1 : 0;
        if (!dj.field_c &&
          !ia.field_d) {
          while (bh.$cfr$intArgs$b$c4997cb15529(121)) {
            if (ke.field_a == 13) {
              this.c((byte) -16);
              continue;
            }
            if (bc.field_m[82] &&
              ke.field_a == 11) {
              stackIn_14_0 = !(pm.field_u);
              pm.field_u = stackIn_14_0;
              continue;
            }
            this.b(-36);
            if (-1 == this.field_g.field_j) {
              continue;
            }
            this.a(this.field_g.field_j, (byte) -114, false);
          }
          this.field_g.a(this.a(uo.field_a, ji.field_c, -125), this.a(uf.field_d, bg.field_k, -115), -1);
          if (-1 != this.field_g.field_j) {
            this.a(this.field_g.field_j, (byte) -128, true);
          }
        }
        if (param0 > -64) {
          this.field_l = -74;
        }
    }

    void a(int param0, byte param1, boolean param2) {
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_162_0 = 0;
        Object stackIn_190_0 = null;
        int stackIn_191_1 = 0;
        boolean stackIn_208_0 = false;
        int var4;
        int var5;
        int var6;
        int var7_int;
        tc var7;
        int var8;
        int var9;
        var9 = Pixelate.field_H ? 1 : 0;
        if (this.field_g.a(51)) {
          mc.a(128, -120);
        }
        var4 = this.field_k[param0];
        if (param1 > -103) {
          return;
        }
        L1: {
          var6 = var4;
          if (var6 != 0) {
            if (29 != var6) {
              if (var6 != 32) {
                if (var6 == 28) {
                  if (this.field_g.a(74)) {
                    var6 = param2 ? 1 : 0;
                    la.a(ti.field_t, 16, var6 != 0, -25528);
                  }
                } else {
                  if (1 == var6) {
                    if (!(!this.field_g.a(38))) {
                      if (jg.a((byte) 66)) {
                        ii.a(param2, 0, -4, (byte) 91, te.field_Ib);
                      } else {
                        var6 = param2 ? 1 : 0;
                        la.a(ti.field_t, -4, var6 != 0, -25528);
                      }
                    }
                    break L1;
                  }
                  if (var6 == 2) {
                    if (!(!this.field_g.a(86))) {
                      var6 = param2 ? 1 : 0;
                      stackIn_74_0 = (!gq.d(107)) ? 0 : 12;
                      la.a(stackIn_74_0, -1, var6 != 0, -25528);
                    }
                    break L1;
                  }
                  if (var6 == 7) {
                    if (!(!this.field_g.a(91))) {
                      var6 = param2 ? 1 : 0;
                      la.a(ti.field_t, 0, var6 != 0, -25528);
                    }
                    break L1;
                  }
                  if (24 == var6) {
                    if (!(!this.field_g.a(84))) {
                      var6 = param2 ? 1 : 0;
                      la.a(ti.field_t, 12, var6 != 0, -25528);
                      ce.field_a = true;
                    }
                    break L1;
                  }
                  if (var6 == 25) {
                    if (this.field_g.a(74) &&
                      this.c(-119, param0)) {
                      ((fk) (oc.field_H[7])).a(param2, 97);
                    }
                  } else {
                    if (var6 == 26) {
                      if (this.field_g.a(20) &&
                        this.c(-128, param0)) {
                        ((fk) (oc.field_H[7])).b(false, param2);
                      }
                    } else {
                      if (var6 == 22) {
                        if (this.field_g.a(23)) {
                          var6 = param2 ? 1 : 0;
                          la.a(ti.field_t, 8, var6 != 0, -25528);
                        }
                      } else {
                        if (var6 == 5) {
                          if (!(!this.field_g.a(45))) {
                            ((fk) (oc.field_H[7])).a(2, 1, param2);
                            var6 = param2 ? 1 : 0;
                            la.a(ti.field_t, 7, var6 != 0, -25528);
                          }
                          break L1;
                        }
                        if (8 != var6) {
                          if (var6 == 4) {
                            if (!(!this.field_g.a(26))) {
                              var6 = param2 ? 1 : 0;
                              la.a(ti.field_t, 6, var6 != 0, -25528);
                            }
                            break L1;
                          }
                          if (3 == var6) {
                            if (!(!this.field_g.a(62))) {
                              if (this.field_l != 9) {
                                var6 = param2 ? 1 : 0;
                                la.a(ti.field_t, 5, var6 != 0, -25528);
                              } else {
                                var6 = param2 ? 1 : 0;
                                stackIn_105_0 = (!gq.d(75)) ? 0 : 12;
                                la.a(stackIn_105_0, 5, var6 != 0, -25528);
                              }
                            }
                            break L1;
                          }
                          if (20 == var6) {
                            var5 = 0;
                            if (this.field_g.d((byte) -111) &&
                              ia.field_h > 0) {
                              var5 = 1;
                              nk.a((byte) 93, 0);
                            }
                            if (this.field_g.d(-111) &&
                              ia.field_h < 256) {
                              var5 = 1;
                              nk.a((byte) 93, 256);
                            }
                            if (this.field_g.c((byte) 35)) {
                              var6 = this.a(param0, (byte) 90) + this.a(param0, false) + (h.field_T - 120) >> 1;
                              var7_int = -var6 + uf.field_d;
                              var8 = 256 * var7_int / 120;
                              var5 = 1;
                              if (var8 <= 0) {
                                nk.a((byte) 93, 0);
                              } else {
                                if (var8 < 256) {
                                  nk.a((byte) 93, var8);
                                } else {
                                  nk.a((byte) 93, 256);
                                }
                              }
                            }
                            if (this.field_g.e(-97) &&
                              ia.field_h > 0) {
                              var5 = 1;
                              sn.e(99);
                            }
                            if (this.field_g.c(102) &&
                              ia.field_h < 256) {
                              var5 = 1;
                              tj.i(32);
                            }
                            if (var5 != 0 && (!this.field_g.c((byte) 35) ||
                              !(pa.field_b <= nk.field_i))) {
                              mc.a(128, -124);
                              nk.field_i = pa.field_b + 20;
                            }
                          } else {
                            if (var6 == 21) {
                              if (this.field_g.d((byte) -94)) {
                                jg.a(0, -114);
                              }
                              if (this.field_g.d(64)) {
                                jg.a(256, -54);
                              }
                              if (this.field_g.c((byte) 35)) {
                                var6 = -120 + (this.a(param0, (byte) 90) + (this.a(param0, false) + h.field_T)) >> 1;
                                var7_int = uf.field_d - var6;
                                var8 = var7_int * 256 / 120;
                                if (var8 <= 0) {
                                  jg.a(0, -50);
                                } else {
                                  if (256 <= var8) {
                                    jg.a(256, -63);
                                  } else {
                                    jg.a(var8, -109);
                                  }
                                }
                              }
                              if (this.field_g.e(-97)) {
                                fc.a((byte) -65);
                              }
                              if (!(!this.field_g.c(102))) {
                                eg.e(-4767);
                              }
                              break L1;
                            }
                            if (var6 == 6) {
                              if (this.field_g.a(68)) {
                                if (ib.field_f != null) {
                                  ln.a(33);
                                } else {
                                  var6 = param2 ? 1 : 0;
                                  wl.field_b = false;
                                  var7 = qj.field_e;
                                  u.a(((jl) ((Object) var7)).field_w + ((jl) ((Object) var7)).field_z, -879, ((jl) ((Object) var7)).field_w, 2, 320, 8, ab.field_c, var7, 240, bi.field_g, 8, var6 != 0);
                                }
                              }
                            } else {
                              if (var6 != 9) {
                                if (var6 == 11) {
                                  if (!(!this.field_g.a(95))) {
                                    ro.field_e.e(6);
                                    var6 = param2 ? 1 : 0;
                                    stackIn_162_0 = (!gq.d(71)) ? 0 : 12;
                                    la.a(stackIn_162_0, -1, var6 != 0, -25528);
                                  }
                                  break L1;
                                }
                                if (var6 == 13) {
                                  if (!(!this.field_g.a(117))) {
                                    if (md.field_Y) {
                                      var6 = param2 ? 1 : 0;
                                      la.a(ti.field_t, -5, var6 != 0, -25528);
                                    }
                                    if (!(!oa.field_i)) {
                                      qj.a(false, 0, 11);
                                    }
                                  }
                                  break L1;
                                }
                                switch (var6) {
                                  case 14:
                                    if (!this.field_g.a(68)) {
                                      break;
                                    }
                                    of.field_a = 0;
                                    break;
                                  case 15:
                                    if (!this.field_g.a(30)) {
                                      break;
                                    }
                                    of.field_a = 1;
                                    break;
                                  case 16:
                                    if (this.field_g.a(32)) {
                                      of.field_a = 2;
                                    }
                                    break;
                                  case 17:
                                    if (!this.field_g.a(109)) {
                                      break;
                                    }
                                    d.field_c = 0;
                                    break;
                                  case 18:
                                    if (!this.field_g.a(32)) {
                                      break;
                                    }
                                    d.field_c = 1;
                                    break;
                                  case 23:
                                    if (!this.field_g.a(106)) {
                                      break;
                                    }
                                    if (this.field_l != 10) {
                                      if (this.field_l != 8 &&
                                        this.field_l != 5 &&
                                        this.field_l != 6) {
                                        break;
                                      }
                                      gi.a(te.field_Ib, this.field_l, (byte) -126);
                                      break;
                                    }
                                    stackIn_190_0 = null;
                                    if (go.field_k == 0) {
                                      stackIn_191_1 = 5;
                                    } else {
                                      stackIn_191_1 = 9;
                                    }
                                    gi.a((String) (stackIn_190_0), stackIn_191_1, (byte) 79);
                                    break;
                                  case 33:
                                    if (this.field_g.a(40)) {
                                      ((hq) (this)).b((byte) 12, param2);
                                    }
                                    break;
                                  default:
                                    break;
                                  case 27:
                                    if (!this.field_g.a(29)) {
                                      break;
                                    }
                                    stackIn_208_0 = !(jc.field_d);
                                    jc.field_d = stackIn_208_0;
                                    if (!jc.field_d) {
                                      we.field_o[27] = ef.field_c;
                                      break;
                                    }
                                    we.field_o[27] = kl.field_d;
                                    break;
                                  case 19:
                                    if (this.field_g.a(77)) {
                                      d.a(0, ao.a(13867));
                                    }
                                    break;
                                  case 34:
                                    if (this.field_g.a(28)) {
                                      ((hq) (this)).a(param2, -116);
                                    }
                                    break;
                                }
                              } else {
                                if (this.field_g.a(96)) {
                                  ro.field_e.a(false, 250, param2);
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_g.a(59)) {
                            var6 = nc.field_a;
                            var7_int = param2 ? 1 : 0;
                            la.a(ti.field_t, var6, var7_int != 0, -25528);
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (this.field_g.a(109)) {
                  kj.a(-3 + param0, (byte) 127);
                  var6 = param2 ? 1 : 0;
                  stackIn_61_0 = (!gq.d(90)) ? 0 : 12;
                  la.a(stackIn_61_0, -3, var6 != 0, -25528);
                }
              }
            } else {
              if (this.field_g.a(6)) {
                ((op) (oc.field_H[17])).f(76);
                var6 = param2 ? 1 : 0;
                la.a(ti.field_t, 17, var6 != 0, -25528);
              }
            }
          } else {
            if (this.field_g.a(44)) {
              em.a((byte) -101);
              var6 = param2 ? 1 : 0;
              stackIn_52_0 = (gq.d(117)) ? 12 : 0;
              la.a(stackIn_52_0, -3, var6 != 0, -25528);
            }
          }
        }
    }

    static {
        field_b = new bb();
    }
}
