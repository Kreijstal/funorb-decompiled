/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends ql {
    private we[] field_h;
    private v field_k;
    private v field_e;
    static volatile int field_l;
    private v field_f;
    static boolean field_d;
    static bd[][] field_i;
    private v[] field_g;
    private v field_j;
    private oj[] field_m;

    final String a(boolean param0) {
        if (param0) {
          oj var3 = (oj) null;
          this.a((oj) null, (byte) 32);
        }
        if (ha.field_t == 10) {
          return ac.field_f;
        }
        return aa.field_c;
    }

    final static void a(p param0, int param1, int[] param2, boolean param3) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_138_2 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_141_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        double var16 = 0.0;
        double var18 = 0.0;
        Object var20 = null;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        int var35 = 0;
        int var36_int = 0;
        p var36 = null;
        int var37 = 0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        double var43 = 0.0;
        double var45 = 0.0;
        int var47 = 0;
        int var48 = 0;
        double var49 = 0.0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        oj var55 = null;
        oj var56 = null;
        p var57 = null;
        int var35Lifetime1;
        var53 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param3) {
            var54 = (int[]) null;
            pa.a((p) null, -67, (int[]) null, true);
          }
          var6 = param0.field_i;
          var7 = param0.field_c;
          if (0 == param0.field_e) {
            var9 = param0.field_l.field_f + (double)param0.field_j.field_e;
            var11 = param0.field_l.field_a + (double)param0.field_j.field_g;
            var13 = 0;
            var14 = 0;
            if (param0.field_i != 20) {
              stackIn_10_0 = (32 == param0.field_i) ? 1 : 0;
            } else {
              stackIn_10_0 = 1;
            }
            var15 = stackIn_10_0;
            param2[param1] = 0;
            while (true) {
              var14++;
              param0.field_l.a(2, (byte) 94, param0.field_c);
              param0.a(8573);
              if (param2[param0.field_j.b(-4)] == 2) {
                var13 = 1;
                param0.field_e = 1;
                if (param0.field_i == 32) {
                  param0.field_i = -1;
                } else {
                  param0.field_i = 33;
                  param0.field_c = (double)di.a(var11, 124, var9, param0.field_c);
                }
              } else {
                if (18 == param0.field_i &&
                  var14 >= 70) {
                  param0.field_i = -1;
                  param0.field_e = 1;
                }
              }
              if (param0.field_e == 0) {
                if (var15 == 0) {
                  continue;
                }
                if (10 > var14) {
                  continue;
                }
              }
              param2[param1] = 3;
              var16 = (double)param0.field_j.field_e + param0.field_l.field_f;
              var18 = (double)param0.field_j.field_g + param0.field_l.field_a;
              if (var13 != 0) {
                var18 = 0.5 + ((double)param0.field_j.field_g + param0.field_l.field_a);
                var16 = (double)param0.field_j.field_e + param0.field_l.field_f + 0.5;
              }
              var20 = null;
              var21 = (-var18 + var11) * (-var18 + var11) + (var9 - var16) * (-var16 + var9);
              for (var35 = 1; var35 < rc.field_e; var35++) {
                boolean decompiledFrameRemainder1 = true;
                var56 = re.field_n[var35];
                var20 = var56;
                var20 = var56;
                var37 = var56.field_i;
                if (var56.field_I > 0 && (var37 < 10 ||
                  var37 >= 18)) {
                  var38 = 1.0;
                  var40 = 1.0;
                  if (var37 == 20) {
                    var40 = 0.5;
                    var38 = 0.5;
                  }
                  if ((var37 == 10 ||
                    var37 == 129 ||
                    131 == var37 ||
                    var37 == 133 ||
                    var37 == 11 ||
                    var37 == 129 ||
                    var37 == 131 ||
                    var37 == 133) &&
                    (decompiledFrameRemainder1 = (var56.field_h != 0))) {
                    var40 = 0.5;
                  }
                  if (decompiledFrameRemainder1) {
                    var31 = var56.field_l.field_f + (double)var56.field_j.field_e;
                    var33 = (double)var56.field_j.field_g + var56.field_l.field_a;
                    if (var37 == 24 ||
                      var37 == 4) {
                      var33 = var33 + 1.0;
                      var31 = var31 + 1.0;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var25 = -var40 + var33;
                    var29 = var33 + var40;
                    var23 = var31 - var38;
                    var27 = var31 + var38;
                    var42 = 0;
                    if (var56.field_u != null) {
                      var43 = -var9 + var16;
                      var45 = var18 - var11;
                      var47 = -(var56.field_u.field_z >> 1) + (int)(var31 * 24.0);
                      var48 = -(var56.field_u.field_A >> 1) + (int)(var33 * 24.0);
                      var49 = 0.0;
                      while (1.0 > var49) {
                        if (var42 != 0) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var51 = (int)(24.0 * (var9 + var43 * var49));
                        var52 = (int)((var49 * var45 + var11) * 24.0);
                        stackIn_59_0 = (!var56.field_u.d(var47, var48, var51, var52)) ? 0 : 1;
                        var42 = stackIn_59_0;
                        if (var42 != 0) {
                          var9 = var9 + var43 * var49;
                          var11 = var11 + var45 * var49;
                        }
                        var49 = var49 + 0.05;
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      if (!fb.a(var25, (byte) 43, var29, var16, var23, var11, var27, var18, var9)) {
                        stackIn_69_0 = (fb.a(var29, (byte) 43, var25, var16, var23, var11, var27, var18, var9)) ? 1 : 0;
                      } else {
                        stackIn_69_0 = 1;
                      }
                      var42 = stackIn_69_0;
                    }
                    if (var42 != 0) {
                      var4_double = (-var31 + var9) * (-var31 + var9) + (-var33 + var11) * (var11 - var33);
                      if (var21 > var4_double) {
                        var20 = var56;
                        var21 = var4_double;
                      }
                    }
                  }
                }
              }
              if (var20 == null) {
                var55 = (oj) null;
                nh.a((oj) null, -29966);
                break;
              }
              stackIn_81_0 = (((oj) (var20)).field_I <= 0) ? 0 : 1;
              var35Lifetime1 = stackIn_81_0;
              if (((oj) (var20)).a(var6, -125)) {
                if (((oj) (var20)).field_i != 5 &&
                  ((oj) (var20)).field_i != 22) {
                  var36_int = var6;
                  if (18 == var36_int) {
                    ((oj) (var20)).field_K = var7;
                    ((oj) (var20)).field_I = ((oj) (var20)).field_I - 4;
                    ((oj) (var20)).field_t = 5;
                  } else {
                    if (var36_int != 23) {
                      if (var36_int != 20) {
                        ((oj) (var20)).field_I = ((oj) (var20)).field_I - 1;
                      } else {
                        ((oj) (var20)).field_I = ((oj) (var20)).field_I - 2;
                      }
                    } else {
                      ((oj) (var20)).field_I = ((oj) (var20)).field_I - 8;
                      u.a(17, param0.field_j, true, 16, param0.field_l, 4);
                    }
                  }
                  if (((oj) (var20)).field_b &&
                    ((oj) (var20)).field_I > 0) {
                    tk.a(8, jc.field_c, 1, true);
                  }
                }
                if (((oj) (var20)).field_b) {
                  fieldTemp$0 = ib.field_c;
                  ib.field_c = ib.field_c + 1;
                  var57 = jn.field_F[fieldTemp$0];
                  var36 = var57;
                  var36.field_i = 36;
                  var57.field_j.a((byte) 46, ((oj) (var20)).field_j);
                  var57.field_l.a(((oj) (var20)).field_l, -28860);
                  var57.field_l.field_a = var57.field_l.field_a - 0.5;
                  var57.field_l.field_f = var57.field_l.field_f - 0.5;
                  var36.field_c = var7;
                  if (((oj) (var20)).field_i == 4 ||
                    ((oj) (var20)).field_i == 24) {
                    var57.field_l.field_a = var57.field_l.field_a + 1.0;
                    var57.field_l.field_f = var57.field_l.field_f + 1.0;
                  }
                  var57.field_l.a(15, (byte) 94, var7);
                  var57.a(8573);
                  var36.field_e = 8;
                }
              }
              ((oj) (var20)).field_F = 255;
              param0.field_e = 1;
              if (0 > ((oj) (var20)).field_I) {
                ((oj) (var20)).field_I = 0;
              }
              if (null != ((oj) (var20)).field_u) {
                param0.field_l.field_f = var9 - (double)(int)var9;
                param0.field_l.field_a = var11 - (double)(int)var11;
                param0.field_j.field_g = (int)var11;
                param0.field_j.field_e = (int)var9;
                param0.field_l.b(var21 * 2.0, param0.field_c, 105);
              } else {
                param0.b((byte) 117);
                param0.field_c = 255.0 * Math.random();
                param0.field_j.field_g = ((oj) (var20)).field_j.field_g;
                param0.field_j.field_e = ((oj) (var20)).field_j.field_e;
                param0.field_l.field_f = -0.5 + (((oj) (var20)).field_l.field_f + Math.random());
                param0.field_l.field_a = ((oj) (var20)).field_l.field_a + Math.random() - 0.5;
              }
              if (((oj) (var20)).field_I <= 0) {
                if (((oj) (var20)).field_b &&
                  var35Lifetime1 != 0 &&
                  ((oj) (var20)).field_i != 27) {
                  if (var6 == 18) {
                    dupTemp$1 = al.field_U[0] + 1;
                    al.field_U[0] = dupTemp$1;
                    if (dupTemp$1 == 30) {
                      ti.a(250, (byte) -123, 5);
                    }
                  } else {
                    al.field_U[5] = al.field_U[5] + 1;
                  }
                }
                param0.field_i = 3;
              }
              nh.a((oj) (var20), -29966);
              if (((oj) (var20)).field_i != 5 &&
                !((oj) (var20)).b(6) &&
                ((oj) (var20)).field_i != 22) {
                break;
              }
              if (uj.field_l != 1) {
                break;
              }
              eh.field_c.a(lm.field_A[11], 100, uh.field_i);
              break;
            }
          }
          if (param0.field_e > 0) {
            param0.field_e = param0.field_e + 1;
          }
          if (param0.field_e > 32) {
            param0.field_i = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_137_0 = var4;
          stackIn_137_1 = new StringBuilder().append("pa.V(");
          if (param0 == null) {
            stackIn_138_2 = "null";
          } else {
            stackIn_138_2 = "{...}";
          }
          stackIn_140_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_138_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_141_2 = "null";
          } else {
            stackIn_141_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_137_0), ((StringBuilder) (Object) stackIn_140_1).append(stackIn_141_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, p param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_int = -113 % ((param0 - 36) / 63);
          for (var4 = 0; var4 < this.field_g.length; var4++) {
            this.field_g[var4].field_a = 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pa.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_i = (bd[][]) null;
        if (param0 <= 118) {
          en var2 = (en) null;
          pa.a((byte) 6, (short[]) null, 99, (en) null);
        }
    }

    final static bd[] h(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        bd[] var1 = new bd[sc.field_c];
        for (var2 = 0; var2 < sc.field_c; var2++) {
          var3 = sf.field_X[var2] * hd.field_r[var2];
          var4 = ja.field_e[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = bf.field_d[ua.a((int) var4[var6], 255)];
          }
          var1[var2] = new bd(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], var5);
        }
        if (param0 != 14) {
          field_d = true;
        }
        uj.d(param0 + 101);
        return var1;
    }

    final void e(int param0) {
        oc[] var2;
        int var3;
        int var4;
        int var8;
        oc[] var9;
        oc[] var5;
        int var6;
        oc var7;
        int var10;
        int var4Lifetime1;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var9 = new oc[5];
        var2 = var9;
        var9[0] = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        var9[1] = new oc(ln.field_a.field_v[6], ln.field_a.field_v[7]);
        var9[2] = new oc(ln.field_a.field_v[8], ln.field_a.field_v[9]);
        var9[3] = new oc(ln.field_a.field_v[16], ln.field_a.field_v[17]);
        var9[4] = new oc(ln.field_a.field_v[18], ln.field_a.field_v[19]);
        this.field_m = new oj[5];
        var3 = 0;
        this.field_g = new v[this.field_m.length];
        for (var4 = 0; el.field_j > var4; var4++) {
          if (od.a(mm.field_m[var4].field_i, 1)) {
            var5 = var9;
            var6 = 0;
            while (var6 < var5.length) {
              var7 = var5[var6];
              if (nj.a(mm.field_m[var4].field_j, var7, -28835) > 1) {
                var6++;
                continue;
              }
              mm.field_m[var4].field_N = true;
              this.field_m[var3] = mm.field_m[var4];
              this.field_g[var3] = new v(ch.field_b, 0, 0);
              var3++;
              break;
            }
          }
        }
        ih.field_y = new oc[6];
        ih.field_y[0] = new oc(ln.field_a.field_v[0], ln.field_a.field_v[1]);
        ih.field_y[1] = new oc(ln.field_a.field_v[4], ln.field_a.field_v[5]);
        ih.field_y[2] = new oc(ln.field_a.field_v[10], ln.field_a.field_v[11]);
        ih.field_y[3] = new oc(ln.field_a.field_v[12], ln.field_a.field_v[13]);
        ih.field_y[4] = new oc(ln.field_a.field_v[14], ln.field_a.field_v[15]);
        ih.field_y[5] = new oc(ln.field_a.field_v[20], ln.field_a.field_v[21]);
        var10 = param0;
        var4Lifetime1 = var10;
        while (var10 < 5) {
          this.field_h[var10] = new we(ih.field_y[var10 + 1]);
          var10++;
        }
        kd.a(10, param0 ^ 1);
        nh.field_E.a(-1, 8360, -1);
        this.field_j = new v(re.field_B, 0, 0, 200, false);
        this.field_j.field_l = 0;
        this.field_k = new v(jj.field_h, 0, 0, 200, false);
        this.field_k.field_l = 0;
        this.field_f = new v(ta.field_lb, 0, 0, 200, false);
        this.field_f.field_l = ih.field_y[0].field_e * 24 - 100;
        this.field_f.field_d = ih.field_y[0].field_g * 24 + 60;
        this.field_e = new v(ab.field_d, 0, 0, 200, false);
        this.field_e.field_l = 0;
    }

    final boolean b(int param0) {
        int var4 = 0;
        int var2;
        we[] var3;
        we var5;
        int var6;
        boolean stackIn_14_0 = false;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var2 = -86 / ((param0 - 38) / 53);
        if (10 != ha.field_t) {
          stackIn_14_0 = (of.field_d != dn.field_i);
          return stackIn_14_0;
        }
        if (100 >= ng.field_u) {
          return false;
        }
        var3 = this.field_h;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5.field_d.field_e >= 0) {
            var5.a((byte) -46);
          }
        }
        return false;
    }

    final void d(int param0) {
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        double stackIn_24_0 = 0.0;
        int stackIn_25_1 = 0;
        oc var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        oj var7;
        double var8_double;
        double var10;
        int var12;
        oj var13;
        int var4Lifetime1;
        int var7_intLifetime1;
        var12 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != -1) {
          return;
        }
        L0: {
          var13 = mm.field_m[0];
          var3 = var13.field_j;
          if (ha.field_t == 10) {
            nh.field_E.a(-1, 8360, -1);
            var5 = 0;
            var6 = -1;
            for (var7_int = 1; var7_int <= 5; var7_int++) {
              stackIn_10_0 = 0;
              stackIn_10_1 = ih.field_y[var7_int].field_e;
              if (stackIn_10_0 <= stackIn_10_1) {
                var4 = ih.a(var3, (byte) -110, ih.field_y[var7_int]);
                if (var4 >= 2) {
                  var5 = 1;
                } else {
                  var6 = var7_int;
                }
              }
            }
            if (var6 >= 0) {
              var7_intLifetime1 = 0;
              var8_double = (double)(1 + ih.field_y[var6].field_e);
              var10 = 0.5 + (double)ih.field_y[var6].field_g;
              if (var6 == 1) {
                var10 = var10 + 0.5;
                var7_intLifetime1 = 64;
                var8_double = var8_double - 0.5;
              }
              stackIn_24_0 = var8_double;
              if (var5 == 0) {
                stackIn_25_1 = 1;
              } else {
                stackIn_25_1 = 0;
              }
              ca.a(stackIn_24_0, stackIn_25_1, var10, true, var7_intLifetime1);
              ih.field_y[var6].field_e = -1;
            }
            if (!uf.field_h) {
              for (var8 = 0; this.field_m.length > var8; var8++) {
                var7 = this.field_m[var8];
                if (var7.field_N) {
                  if (0 >= var7.field_I) {
                    var7.field_N = false;
                  } else {
                    var4Lifetime1 = ih.a(var3, (byte) -115, var7.field_j);
                    if (var4Lifetime1 < 4) {
                      if (rh.a(var7.field_i, true)) {
                        if (var7.field_j.field_e < var3.field_e) {
                          this.field_g[var8].field_l = -this.field_g[var8].field_m - 24 + var7.field_j.field_e * 24;
                        } else {
                          this.field_g[var8].field_l = 24 + 24 * var7.field_j.field_e;
                        }
                        this.field_g[var8].field_d = -30 + var7.field_j.field_g * 24;
                      } else {
                        if (var7.field_j.field_g >= var3.field_g) {
                          this.field_g[var8].field_d = 24 * var7.field_j.field_g + this.field_g[var8].field_h;
                        } else {
                          this.field_g[var8].field_d = -this.field_g[var8].field_h - 24 + var7.field_j.field_g * 24;
                        }
                        this.field_g[var8].field_l = var7.field_j.field_e * 24 - 100;
                      }
                      this.field_g[var8].field_a = 1;
                    }
                  }
                }
              }
            }
            if (var5 != 0) {
              if (((0 == this.field_j.field_l)) &&
                (!(!uf.field_h))) {
                this.field_j.field_d = var3.field_g * 24 - 100;
                this.field_j.field_l = var3.field_e * 24;
              }
              break L0;
            }
            if (of.field_d != dn.field_i) {
              kd.a(0, 1);
              nh.field_E.a((byte) 46, ih.field_y[0]);
              this.field_k.field_d = -this.field_k.field_h + var3.field_g * 24 - 60;
              this.field_k.field_l = 24 * var3.field_e - 100;
            } else {
              if (((0 == this.field_j.field_l)) &&
                (!(!uf.field_h))) {
                this.field_j.field_d = var3.field_g * 24 - 100;
                this.field_j.field_l = var3.field_e * 24;
              }
              break L0;
            }
          }
          if (0 == this.field_j.field_l &&
            uf.field_h) {
            this.field_j.field_d = var3.field_g * 24 - 100;
            this.field_j.field_l = var3.field_e * 24;
          }
        }
        if (this.field_e.field_l == 0 &&
          kh.field_Q[7]) {
          this.field_e.field_d = -180 + var3.field_g * 24;
          this.field_e.field_l = -60 + var3.field_e * 24;
        }
        if (ha.field_t == 0) {
          super.d(-1);
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var2Lifetime1;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (uf.field_h) {
          var2 = id.field_A.a(bm.field_e[11]) + 10;
          si.a(100, 40, var2, 20, 0, 128);
          si.a(100, 40, var2, 20, 16776960);
          id.field_A.c(bm.field_e[11], 105, 55, 16776960, -1);
        }
        if (this.field_j.field_l > 0 &&
          !this.field_j.a((byte) -75)) {
          this.field_j.field_l = -1;
        }
        if (0 < this.field_k.field_l &&
          !this.field_k.a((byte) -77)) {
          this.field_k.field_l = -1;
        }
        var2Lifetime1 = 84 / ((param0 + 48) / 38);
        if (ng.field_u > 50 &&
          this.field_f.field_l > 0 &&
          !this.field_f.a((byte) -120)) {
          this.field_f.field_l = -1;
        }
        if (0 >= this.field_e.field_l) {
          for (var3 = 0; this.field_g.length > var3; var3++) {
            if (this.field_m[var3].field_I <= 0) {
              this.field_g[var3].field_a = 2;
            }
            if (this.field_g[var3].field_a == 1 &&
              !this.field_g[var3].a((byte) -112)) {
              this.field_g[var3].field_a = 0;
            }
          }
        } else {
          if (!this.field_e.a((byte) -118)) {
            this.field_e.field_l = -1;
          }
        }
    }

    final static short[] a(byte param0, short[] param1, int param2, en param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4_int = param3.a(param2, true);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new short[var4_int];
          }
          var5 = param3.a(4, true);
          var6 = (short)param3.a(16, true);
          if (var5 <= 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(var6 + param3.a(var5, true));
            }
          }
          if (param0 != 87) {
            pa.b((byte) 98, 124);
          }
          stackIn_18_0 = (short[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("pa.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final boolean a(oj param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -5) {
            this.field_g = (v[]) null;
          }
          stackIn_6_0 = (param0.field_N) && (!uf.field_h);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pa.P(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0) {
        if (!uf.field_h) {
          ti.a(233, (byte) -120, 22);
        }
        if (param0 != 0) {
          this.e(-21);
        }
    }

    final static int b(byte param0, int param1) {
        param1 = ((-1431655766 & param1) >>> 1) + (1431655765 & param1);
        param1 = (param1 >>> 2 & -214748365) + (param1 & 858993459);
        param1 = 252645135 & param1 + (param1 >>> 4);
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        if (param0 != -19) {
          return -89;
        }
        return param1 & 255;
    }

    public pa() {
        this.field_h = new we[5];
    }

    static {
        field_d = false;
        field_l = 0;
    }
}
