/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qe {
    static int field_a;
    static int field_j;
    static int field_n;
    static int field_l;
    static cn[] field_i;
    ph field_e;
    private static int field_d;
    private static wb[] field_k;
    sa field_q;
    static int field_f;
    private static int[][] field_g;
    static int field_c;
    md field_p;
    private static int[][] field_h;
    kl field_b;
    private static cn[] field_o;
    private static int[] field_m;

    final void b() {
        rj var1 = null;
        if (this.field_p != null) {
            var1 = (rj) ((Object) this.field_p.e(-24172));
            while (var1 != null) {
                var1.b((byte) 30);
                var1 = (rj) ((Object) this.field_p.a(4));
            }
        }
        this.field_p = new md();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$1 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          if (param1 < gf.field_f) {
            break L0;
          } else {
            if (param1 < gf.field_e) {
              L1: {
                if (param0 >= gf.field_j) {
                  break L1;
                } else {
                  param2 = param2 - (gf.field_j - param0);
                  param0 = gf.field_j;
                  break L1;
                }
              }
              L2: {
                if (param0 + param2 <= gf.field_h) {
                  break L2;
                } else {
                  param2 = gf.field_h - param0;
                  break L2;
                }
              }
              var5 = 256 - param4;
              var6 = (param3 >> 16 & 255) * param4;
              var7 = (param3 >> 8 & 255) * param4;
              var8 = (param3 & 255) * param4;
              var12 = param0 + param1 * gf.field_i;
              var13 = 0;
              L3: while (true) {
                if (var13 >= param2) {
                  return;
                } else {
                  var9 = (gf.field_b[var12] >> 16 & 255) * var5;
                  var10 = (gf.field_b[var12] >> 8 & 255) * var5;
                  var11 = (gf.field_b[var12] & 255) * var5;
                  var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  incrementValue$1 = var12;
                  var12++;
                  gf.field_b[incrementValue$1] = gf.field_b[var12] & -16777216 | var14;
                  var13++;
                  continue L3;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        L0: while (true) {
          if (param5 < 0) {
            return;
          } else {
            var6 = param0[param5] >>> 25 & 255;
            if (var6 != 0) {
              param2 = param1[param5];
              param2 = 256 - (var6 * (256 - param2) >> 8);
              param3 = param0[param5];
              param4 = param3 & 65280;
              param3 = param3 & 16711935;
              param3 = param3 * param2;
              param4 = param4 * param2;
              param3 = param3 & -16711936;
              param4 = param4 & 16711680;
              param0[param5] = (param3 | param4) >>> 8 | 65793;
              param5--;
              continue L0;
            } else {
              param5--;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, h param2) {
        if (param2 != null) {
            qe.b(param0, param1, field_i, field_h, new int[]{param2.field_m, param2.field_r, param2.field_b, param2.field_o});
        } else {
            qe.b(param0, param1, field_i, field_h, new int[]{0, 0, 0, 0});
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          if (param1 < gf.field_f) {
            break L0;
          } else {
            if (param1 < gf.field_e) {
              L1: {
                if (param0 >= gf.field_j) {
                  break L1;
                } else {
                  param2 = param2 - (gf.field_j - param0);
                  param0 = gf.field_j;
                  break L1;
                }
              }
              L2: {
                if (param0 + param2 <= gf.field_h) {
                  break L2;
                } else {
                  param2 = gf.field_h - param0;
                  break L2;
                }
              }
              var6 = 256 - param4;
              var7 = (param3 >> 16 & 255) * param4;
              var8 = (param3 >> 8 & 255) * param4;
              var9 = (param3 & 255) * param4;
              param5 = param5 << 24;
              var13 = param0 + param1 * gf.field_i;
              var14 = 0;
              L3: while (true) {
                if (var14 >= param2) {
                  return;
                } else {
                  var10 = (gf.field_b[var13] >> 16 & 255) * var6;
                  var11 = (gf.field_b[var13] >> 8 & 255) * var6;
                  var12 = (gf.field_b[var13] & 255) * var6;
                  var15 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var9 + var12 >> 8);
                  incrementValue$1 = var13;
                  var13++;
                  gf.field_b[incrementValue$1] = param5 | var15;
                  var14++;
                  continue L3;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static wb[] a(hb param0, int param1) {
        int var2 = qe.a(param0, param1, field_k);
        if (var2 == 0) {
            return null;
        }
        wb[] var3 = new wb[var2];
        cj.a(field_k, 0, var3, 0, var2);
        return var3;
    }

    final static void a(int param0, int param1, int param2, wb[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wb var8 = null;
        var5 = param0 - 18;
        var6 = param1 - 18;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param4) {
            return;
          } else {
            var8 = param3[var7];
            var8.field_c.c(var5, var6, var8.field_a);
            var5 -= 16;
            var7++;
            if (var7 % param2 != 0) {
              continue L0;
            } else {
              var5 = param0 - 18;
              var6 -= 16;
              continue L0;
            }
          }
        }
    }

    final static void b(ph param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        for (var6 = param2; var6 < param4; var6++) {
            var5 = var6 * 640 + param1;
            for (var7 = param1; var7 < param3; var7++) {
                var8 = 64 + (param0.field_a.field_B[var5] & 255);
                param0.field_a.field_B[var5] = -16777216 | 6 * var8 >> 2 << 16 | var8 << 8 | var8 >> 1;
                var5++;
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        qe.a(param0, param1, param2, param4, param5, param6);
        qe.a(param0, param1 + param3 - 1, param2, param4, param5, param6);
        if (param3 >= 3) {
            qe.b(param0, param1 + 1, param3 - 2, param4, param5, param6);
            qe.b(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5, param6);
        }
    }

    final static void a(ph param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var7 = param2 * param0.field_d + param1;
        var8 = param0.field_d - (param3 - param1);
        var9 = param2;
        L0: while (true) {
          if (var9 >= param4) {
            return;
          } else {
            var10 = param1;
            L1: while (true) {
              if (var10 >= param3) {
                var9++;
                var7 = var7 + var8;
                continue L0;
              } else {
                L2: {
                  var11 = (var9 - param6) * (var9 - param6) / 480 + (var10 - param5) * (var10 - param5) / 640;
                  var12 = (int)(256.0 / (1.0 + (double)var11 * 16.0 / 640.0));
                  var12 -= 64;
                  if (var12 >= 0) {
                    break L2;
                  } else {
                    var12 = 0;
                    break L2;
                  }
                }
                var13 = param0.field_a.field_B[var7] & 255;
                var14 = 2097184 + (16711680 * var12 >>> 8 & 16711935);
                var15 = 8192 + (24576 * var12 >>> 8 & 65280);
                var14 = var14 * (256 - var13);
                var15 = var15 * (256 - var13);
                var14 = var14 & -16711936;
                var15 = var15 & 16711680;
                param0.field_a.field_B[var7] = -16777216 | (var13 >> 2) + ((var14 | var15) >>> 8);
                var10++;
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    private final static wb a(int param0, int param1, String param2, cn param3) {
        if (param0 < param1) {
            return new wb(jk.a(new String[]{param2, Integer.toString(param1 - param0)}, vc.field_b, 30496), param3, 16711680);
        }
        if (param0 <= param1) {
            return null;
        }
        return new wb(jk.a(new String[]{param2, Integer.toString(param0 - param1)}, so.field_a, 30496), param3, 65280);
    }

    void c() {
        rj var1 = null;
        this.field_e = null;
        if (this.field_b != null) {
            this.field_b.c(-121);
        }
        if (this.field_p != null) {
            var1 = (rj) ((Object) this.field_p.e(-24172));
            while (var1 != null) {
                var1.b((byte) 30);
                var1 = (rj) ((Object) this.field_p.a(4));
            }
        }
        this.field_b = null;
        this.field_p = null;
    }

    final static void a(int param0, int param1, int param2, hb param3, int param4) {
        int var5 = qe.a(param3, param4, field_k);
        qe.a(param0, param1, param2, field_k, var5);
    }

    private final static int a(hb param0, int param1, wb[] param2) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wb var8 = null;
        L0: {
          var3 = 0;
          var4 = param0.field_e;
          var5 = param0.field_g;
          var6 = param0.field_f;
          var7 = param0.field_k;
          if ((param0.field_d & 1) == 0) {
            break L0;
          } else {
            var5 = var5 << 1;
            break L0;
          }
        }
        L1: {
          if ((param0.field_d & 2) == 0) {
            break L1;
          } else {
            var7 = var7 << 1;
            break L1;
          }
        }
        L2: {
          var7 = var7 - param1;
          if (var7 >= 0) {
            break L2;
          } else {
            var7 = 0;
            break L2;
          }
        }
        L3: {
          var8 = qe.a(var4, param0.field_n.field_m, qk.field_d, ue.field_i[0]);
          if (var8 == null) {
            break L3;
          } else {
            incrementValue$8 = var3;
            var3++;
            param2[incrementValue$8] = var8;
            break L3;
          }
        }
        L4: {
          var8 = qe.a(var5, param0.field_n.field_r, dj.field_c, ue.field_i[1]);
          if (var8 == null) {
            break L4;
          } else {
            incrementValue$9 = var3;
            var3++;
            param2[incrementValue$9] = var8;
            break L4;
          }
        }
        L5: {
          var8 = qe.a(var6, param0.field_n.field_b, pm.field_n, ue.field_i[2]);
          if (var8 == null) {
            break L5;
          } else {
            incrementValue$10 = var3;
            var3++;
            param2[incrementValue$10] = var8;
            break L5;
          }
        }
        L6: {
          var8 = qe.a(var7, param0.field_n.field_o, nf.field_x, ue.field_i[3]);
          if (var8 == null) {
            break L6;
          } else {
            incrementValue$11 = var3;
            var3++;
            param2[incrementValue$11] = var8;
            break L6;
          }
        }
        L7: {
          if ((param0.field_d & 4) == 0) {
            break L7;
          } else {
            incrementValue$12 = var3;
            var3++;
            param2[incrementValue$12] = new wb(kl.field_b, ue.field_i[6], 16744703);
            break L7;
          }
        }
        L8: {
          if ((param0.field_o & 4) == 0) {
            break L8;
          } else {
            incrementValue$13 = var3;
            var3++;
            param2[incrementValue$13] = new wb(kg.field_m, ue.field_i[5], 16711680);
            break L8;
          }
        }
        L9: {
          if ((param0.field_o & 2) == 0) {
            break L9;
          } else {
            incrementValue$14 = var3;
            var3++;
            param2[incrementValue$14] = new wb(gl.field_Hb, ue.field_i[4], 16776960);
            break L9;
          }
        }
        L10: {
          if ((param0.field_o & 1) == 0) {
            break L10;
          } else {
            incrementValue$15 = var3;
            var3++;
            param2[incrementValue$15] = new wb(wi.field_nb, ue.field_i[6], 8438015);
            break L10;
          }
        }
        return var3;
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          if (param0 < gf.field_j) {
            break L0;
          } else {
            if (param0 < gf.field_h) {
              L1: {
                if (param1 >= gf.field_f) {
                  break L1;
                } else {
                  param2 = param2 - (gf.field_f - param1);
                  param1 = gf.field_f;
                  break L1;
                }
              }
              L2: {
                if (param1 + param2 <= gf.field_e) {
                  break L2;
                } else {
                  param2 = gf.field_e - param1;
                  break L2;
                }
              }
              var6 = 256 - param4;
              var7 = (param3 >> 16 & 255) * param4;
              var8 = (param3 >> 8 & 255) * param4;
              var9 = (param3 & 255) * param4;
              param5 = param5 << 24;
              var13 = param0 + param1 * gf.field_i;
              var14 = 0;
              L3: while (true) {
                if (var14 >= param2) {
                  return;
                } else {
                  var10 = (gf.field_b[var13] >> 16 & 255) * var6;
                  var11 = (gf.field_b[var13] >> 8 & 255) * var6;
                  var12 = (gf.field_b[var13] & 255) * var6;
                  var15 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var9 + var12 >> 8);
                  gf.field_b[var13] = param5 | var15;
                  var13 = var13 + gf.field_i;
                  var14++;
                  continue L3;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final boolean d() {
        if (this.field_b != null) {
            this.field_b.a(false);
            return true;
        }
        eg.a(this.field_p, true);
        return false;
    }

    final static void a(cn param0, cn param1, cn param2, cn param3, cn param4, cn param5) {
        field_o = new cn[]{param0, param1, param4, param5};
        field_i = new cn[]{param0, param1, param2, param3};
    }

    final static void a(ph param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var26 = null;
        L0: {
          L1: {
            var5 = 0;
            var11 = param2 - (field_c >> 16);
            var7 = param1 - (field_n >> 16);
            var14 = -(param4 >> 1);
            var15 = -(param3 >> 1);
            var16 = field_d & 3;
            if (var16 == 1) {
              break L1;
            } else {
              if (var16 != 3) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var5 = var5 + param3;
          var11++;
          break L0;
        }
        L2: {
          L3: {
            if (var16 == 1) {
              break L3;
            } else {
              if (var16 != 2) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          var5++;
          var7++;
          break L2;
        }
        L4: {
          var6 = 10000 + var11 * var11 + var7 * var7;
          var17 = 160 + (int)(64.0 * (1.0 + te.a(mo.field_a)));
          if (var17 <= 256) {
            break L4;
          } else {
            var17 = 256;
            break L4;
          }
        }
        var26 = param0.field_c;
        L5: while (true) {
          if (var14 >= 0) {
            var19 = param3 * param4;
            qe.a(param0.field_a.field_B, nm.field_ib, 0, 0, 0, var19 - 1);
            return;
          } else {
            var10 = var7;
            var8 = var6;
            var9 = var15;
            L6: while (true) {
              if (var9 >= 0) {
                var14++;
                var6 = var6 + (var11 + 1 << 2);
                var11 += 2;
                var5 = var5 + param3;
                continue L5;
              } else {
                L7: {
                  var12 = dd.a(var8, false);
                  var19 = var26[var5];
                  var20 = (byte)(var19 >> 16);
                  var21 = (byte)(var19 >> 8);
                  var22 = (byte)var19;
                  var13 = 64 + 5 * ((var10 * var20 + var11 * var21 + 100 * var22) * var12 * var17 >> 24);
                  if (var13 >= 64) {
                    break L7;
                  } else {
                    var13 = 64;
                    break L7;
                  }
                }
                nm.field_ib[var5] = var13;
                var5 += 2;
                var9++;
                var8 = var8 + (var10 + 1 << 2);
                var10 += 2;
                continue L6;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, ac param2) {
        if (param2 != null) {
            qe.b(param0, param1, field_o, field_g, new int[]{param2.field_A, param2.field_k, param2.field_y, param2.field_r});
        } else {
            qe.b(param0, param1, field_o, field_g, new int[]{0, 0, 0, 0});
        }
    }

    void f() {
        if (ll.field_k) {
            if (mm.field_t == 1) {
                ld.field_b = !ld.field_b ? true : false;
            }
        }
        if (this.field_b != null) {
            this.field_b.b(false);
            return;
        }
    }

    public static void a() {
        field_m = null;
        field_g = (int[][]) null;
        field_h = (int[][]) null;
        field_k = null;
        field_o = null;
        field_i = null;
    }

    void b(boolean param0) {
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var2 = new int[64];
        for (var3_int = 0; var3_int < 64; var3_int++) {
            var2[var3_int] = -2147483648 | 65793 * (24 + var3_int);
        }
        cn var3 = new cn(640, 480);
        jh.a(var3);
        int var4 = 0;
        while (var4 < 480) {
            var5 = 0;
            while (var5 < 640) {
                bf.field_d.c(var5, var4);
                var5 = var5 + bf.field_d.field_y;
            }
            var4 = var4 + bf.field_d.field_v;
        }
        var4 = 0;
        for (var5 = 0; var5 < 480; var5++) {
            var6 = 0;
            while (var6 < 640) {
                gf.field_b[var4] = -16777216 | (gf.field_b[var4] & 16579836) >>> 2;
                var6++;
                var4++;
            }
        }
        jh.b();
        int[] var11 = te.b(640, 480, 0.125);
        this.field_e = new ph(var3, var11);
        field_m = new int[307200];
        int var7 = 0;
        var6 = var7;
        while (var7 < 307200) {
            field_m[var7] = 64;
            var7++;
        }
    }

    final static void a(int param0, int param1, ai param2) {
        gf.b(param0 - 4, param1 - 4, 120, 120, 0);
        rp.a(4, 112, (byte) 108, param0, 112, kc.field_V, param1);
        if (param2 != null) {
            if (param2.field_c != null) {
                param2.field_c.a(108, param1 + 2, (byte) 102, param0 + 2, 108);
            }
            if (param2.field_f != null) {
                qe.a(param0 + 112, param1 + 112, 7, param2.field_f, param2.field_f.length);
            }
        }
    }

    final static wb[] a(ai param0, boolean param1, boolean param2, int param3) {
        int var4 = qe.a(param0, param1, param2, param3, field_k);
        wb[] var5 = new wb[var4];
        cj.a(field_k, 0, var5, 0, var4);
        return var5;
    }

    void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        sa var5 = null;
        L0: {
          if (hj.field_S == -1) {
            break L0;
          } else {
            field_f = hj.field_S << 16;
            field_l = eh.field_h << 16;
            break L0;
          }
        }
        var2 = field_f - field_n;
        var3 = field_l - field_c;
        var4 = ug.a(true, (var2 >> 12) * (var2 >> 12) + (var3 >> 12) * (var3 >> 12)) >> 6;
        if (var4 >= 0) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              var2 = var2 / var4;
              var3 = var3 / var4;
              field_a = field_a + var2;
              field_j = field_j + var3;
              field_a = field_a * 14 >> 4;
              field_j = field_j * 14 >> 4;
              break L1;
            }
          }
          L2: {
            field_n = field_n + (int)(1048576.0 * te.a(mo.field_a));
            field_c = field_c + (int)(1048576.0 * te.a(mo.field_a ^ 773223));
            field_n = field_n + field_a;
            field_c = field_c + field_j;
            if (this.field_b == null) {
              break L2;
            } else {
              this.field_b.c((byte) 72);
              break L2;
            }
          }
          L3: {
            if (this.field_q == null) {
              var5 = (sa) null;
              hm.a((sa) null, -21);
              break L3;
            } else {
              hm.a(this.field_q, -21);
              this.field_q.a(false);
              break L3;
            }
          }
          return;
        } else {
          throw new RuntimeException();
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          if (param0 < gf.field_j) {
            break L0;
          } else {
            if (param0 < gf.field_h) {
              L1: {
                if (param1 >= gf.field_f) {
                  break L1;
                } else {
                  param2 = param2 - (gf.field_f - param1);
                  param1 = gf.field_f;
                  break L1;
                }
              }
              L2: {
                if (param1 + param2 <= gf.field_e) {
                  break L2;
                } else {
                  param2 = gf.field_e - param1;
                  break L2;
                }
              }
              var5 = 256 - param4;
              var6 = (param3 >> 16 & 255) * param4;
              var7 = (param3 >> 8 & 255) * param4;
              var8 = (param3 & 255) * param4;
              var12 = param0 + param1 * gf.field_i;
              var13 = 0;
              L3: while (true) {
                if (var13 >= param2) {
                  return;
                } else {
                  var9 = (gf.field_b[var12] >> 16 & 255) * var5;
                  var10 = (gf.field_b[var12] >> 8 & 255) * var5;
                  var11 = (gf.field_b[var12] & 255) * var5;
                  var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  gf.field_b[var12] = gf.field_b[var12] & -16777216 | var14;
                  var12 = var12 + gf.field_i;
                  var13++;
                  continue L3;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gf.b(param0 - 1, param1 - 1, param2 + 2, param3 + 2, 0);
        ob.a(param0, param1, (byte) -102, param3, param2);
        qe.a(param0 + 2, param1 + 2, param2 - 4, param3 - 4, 256, 64, 4, 128);
        rp.a(5, param2 - 4, (byte) 108, param0 + 2, param3 - 4, kc.field_S, param1 + 2);
    }

    final static void a(int param0, int param1, wd param2, int[][] param3) {
        gf.b(param0 - 4, param1 - 4, 120, 120, 0);
        rp.a(4, 112, (byte) 108, param0, 112, param3, param1);
        if (param2 != null) {
            param2.a(108, param1 + 2, (byte) 102, param0 + 2, 108);
        }
    }

    final static void a(int param0, int param1, ai param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        if (param2 != null) {
            var5 = param2.field_p;
            var6 = param2.field_g;
            var7 = param2.field_r;
            var8 = param2.field_q;
            if (param3) {
                var5 = var5 + 1 >> 1;
                var6 = var6 + 1 >> 1;
            }
            var5 = var5 - param4;
            if (var5 < 0) {
                var5 = 0;
            }
            qe.a(param0, param1, field_o, field_g, new int[]{var5, var6, var7, var8});
        } else {
            qe.a(param0, param1, field_o, field_g, new int[]{0, 0, 0, 0});
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        for (var8 = 0; var8 < param6; var8++) {
            var9 = param4 - param5 * var8;
            var10 = param7 * var8 / param6;
            qe.a(param0, param1 + var8, param2, 0, var9, var10);
            qe.a(param0, param1 + param3 - 1 - var8, param2, 0, var9, var10);
            qe.b(param0 + var8, param1, param3, 0, var9, var10);
            qe.b(param0 + param2 - 1 - var8, param1, param3, 0, var9, var10);
        }
    }

    void a(boolean param0) {
    }

    private final static int a(ai param0, boolean param1, boolean param2, int param3, wb[] param4) {
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wb var10 = null;
        int var11 = 0;
        L0: {
          var5 = 0;
          var6 = param0.field_p;
          var7 = param0.field_g;
          var8 = param0.field_r;
          var9 = param0.field_q;
          if (!param2) {
            break L0;
          } else {
            var6 = var6 + 1 >> 1;
            var7 = var7 + 1 >> 1;
            break L0;
          }
        }
        L1: {
          var6 = var6 - param3;
          if (var6 >= 0) {
            break L1;
          } else {
            var6 = 0;
            break L1;
          }
        }
        L2: {
          var10 = qe.a(var6, param0.field_h.field_A, qk.field_d, ue.field_i[0]);
          if (var10 == null) {
            break L2;
          } else {
            incrementValue$7 = var5;
            var5++;
            param4[incrementValue$7] = var10;
            break L2;
          }
        }
        L3: {
          var10 = qe.a(var7, param0.field_h.field_k, dj.field_c, ue.field_i[1]);
          if (var10 == null) {
            break L3;
          } else {
            incrementValue$8 = var5;
            var5++;
            param4[incrementValue$8] = var10;
            break L3;
          }
        }
        L4: {
          var10 = qe.a(var8, param0.field_h.field_y, rk.field_a, ue.field_i[7]);
          if (var10 == null) {
            break L4;
          } else {
            incrementValue$9 = var5;
            var5++;
            param4[incrementValue$9] = var10;
            break L4;
          }
        }
        L5: {
          var10 = qe.a(var9, param0.field_h.field_r, eg.field_f, ue.field_i[8]);
          if (var10 == null) {
            break L5;
          } else {
            incrementValue$10 = var5;
            var5++;
            param4[incrementValue$10] = var10;
            break L5;
          }
        }
        L6: {
          if (!param2) {
            break L6;
          } else {
            incrementValue$11 = var5;
            var5++;
            param4[incrementValue$11] = new wb(dm.field_c, ue.field_i[6], 16744703);
            break L6;
          }
        }
        L7: {
          if (!param1) {
            break L7;
          } else {
            var11 = param0.field_h.field_g;
            if (var11 != 2) {
              L8: {
                if (var11 == 1) {
                  break L8;
                } else {
                  if (var11 != 3) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              incrementValue$12 = var5;
              var5++;
              param4[incrementValue$12] = new wb(fi.field_t, ue.field_i[4], 16777215);
              break L7;
            } else {
              incrementValue$13 = var5;
              var5++;
              param4[incrementValue$13] = new wb(ii.field_C, ue.field_i[4], 16777215);
              break L7;
            }
          }
        }
        return var5;
    }

    final static void a(int param0, int param1, hb param2) {
        L0: {
          gf.b(param0 - 4, param1 - 4, 120, 120, 0);
          rp.a(4, 112, (byte) 108, param0, 112, kc.field_S, param1);
          if (param2 == null) {
            gf.b(param0 + 2, param1 + 2, 108, 108, 0);
            break L0;
          } else {
            param2.field_b.a(108, param1 + 2, (byte) 102, param0 + 2, 108);
            if (param2.field_i == null) {
              break L0;
            } else {
              qe.a(param0 + 112, param1 + 112, 7, param2.field_i, param2.field_i.length);
              break L0;
            }
          }
        }
    }

    private final static void b(int param0, int param1, int param2, int param3, int param4, cn param5, int param6, int param7) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        qe.b(param0, param1, 16, 16, 128, 64, 2, 192);
        param5.c(param0, param1);
        if (param3 > param4) {
            param3 = param4;
        }
        int var8 = 1 + param3 * (param2 - 1) / param4;
        jm.a(4, param0 + 26, param2, -104, param1 + 6);
        int var9 = param6 & 16711935;
        int var10 = param6 & 65280;
        int var11 = param7 & 16711935;
        int var12 = param7 & 65280;
        for (var13 = 0; var13 < var8; var13++) {
            var14 = (var13 << 8) / param2;
            var15 = 256 - var14;
            param6 = var9 * var15 + var11 * var14 & -16711936;
            param7 = var10 * var15 + var12 * var14 & 16711680;
            gf.c(param0 + 26 + var13, param1 + 6, 4, (param6 | param7) >>> 8);
        }
    }

    private final static void a(int param0, int param1, cn[] param2, int[][] param3, int[] param4) {
        int var5 = 0;
        for (var5 = 0; var5 < param4.length; var5++) {
            qe.a(param0, param1 + 16 * var5, 96, param4[var5], 10, param2[var5], param3[var5][0], param3[var5][1]);
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, cn param5, int param6, int param7) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        qe.b(param0 - 16, param1, 16, 16, 128, 64, 2, 192);
        param5.c(param0 - 16, param1);
        if (param3 > param4) {
            param3 = param4;
        }
        int var8 = 1 + param3 * (param2 - 1) / param4;
        jm.a(4, param0 - 26 - param2, param2, -75, param1 + 6);
        int var9 = param6 & 16711935;
        int var10 = param6 & 65280;
        int var11 = param7 & 16711935;
        int var12 = param7 & 65280;
        for (var13 = 0; var13 < var8; var13++) {
            var14 = (var13 << 8) / param2;
            var15 = 256 - var14;
            param6 = var9 * var15 + var11 * var14 & -16711936;
            param7 = var10 * var15 + var12 * var14 & 16711680;
            gf.c(param0 - 27 - var13, param1 + 6, 4, (param6 | param7) >>> 8);
        }
    }

    final static void e() {
        int fieldTemp$1 = 0;
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var21 = null;
        L0: {
          L1: {
            var0 = 0;
            var21 = jh.field_d;
            var6 = -(field_c >> 16);
            var2 = -(field_n >> 16);
            var10 = -240;
            var11 = -320;
            fieldTemp$1 = field_d + 1;
            field_d = field_d + 1;
            var12 = fieldTemp$1 & 3;
            if (var12 == 1) {
              break L1;
            } else {
              if (var12 != 3) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var0 += 640;
          var6++;
          break L0;
        }
        L2: {
          L3: {
            if (var12 == 1) {
              break L3;
            } else {
              if (var12 != 2) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          var0++;
          var2++;
          break L2;
        }
        L4: {
          var1 = 10000 + var6 * var6 + var2 * var2;
          var13 = 160 + (int)(64.0 * (1.0 + te.a(mo.field_a)));
          if (var13 <= 256) {
            break L4;
          } else {
            var13 = 256;
            break L4;
          }
        }
        L5: while (true) {
          if (var10 >= 0) {
            var14 = 307200;
            qe.a(gf.field_b, field_m, 0, 0, 0, var14 - 1);
            return;
          } else {
            var5 = var2;
            var3 = var1;
            var4 = var11;
            L6: while (true) {
              if (var4 >= 0) {
                var10++;
                var1 = var1 + (var6 + 1 << 2);
                var6 += 2;
                var0 += 640;
                continue L5;
              } else {
                L7: {
                  var7 = dd.a(var3, false);
                  var14 = var21[var0];
                  var15 = (byte)(var14 >> 16);
                  var16 = (byte)(var14 >> 8);
                  var17 = (byte)var14;
                  var8 = 64 + 5 * ((var5 * var15 + var6 * var16 + 100 * var17) * var7 * var13 >> 24);
                  if (var8 >= 64) {
                    break L7;
                  } else {
                    var8 = 64;
                    break L7;
                  }
                }
                field_m[var0] = var8;
                var0 += 2;
                var4++;
                var3 = var3 + (var5 + 1 << 2);
                var5 += 2;
                continue L6;
              }
            }
          }
        }
    }

    private final static void b(int param0, int param1, cn[] param2, int[][] param3, int[] param4) {
        int var5 = 0;
        for (var5 = 0; var5 < param4.length; var5++) {
            qe.b(param0, param1 + 16 * var5, 96, param4[var5], 10, param2[var5], param3[var5][0], param3[var5][1]);
        }
    }

    final static void a(int param0, int param1, hb param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = 0;
        if (param2 != null) {
            var4 = param2.field_e;
            var5 = param2.field_g;
            var6 = param2.field_f;
            var7 = param2.field_k;
            if ((param2.field_d & 1) != 0) {
                var5 = var5 << 1;
            }
            if ((param2.field_d & 2) != 0) {
                var7 = var7 << 1;
            }
            var7 = var7 - param3;
            if (var7 < 0) {
                var7 = 0;
            }
            qe.b(param0, param1, field_i, field_h, new int[]{var4, var5, var6, var7});
        } else {
            qe.b(param0, param1, field_i, field_h, new int[]{0, 0, 0, 0});
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$1 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (param0 >= gf.field_j) {
            break L0;
          } else {
            param2 = param2 - (gf.field_j - param0);
            param0 = gf.field_j;
            break L0;
          }
        }
        L1: {
          if (param1 >= gf.field_f) {
            break L1;
          } else {
            param3 = param3 - (gf.field_f - param1);
            param1 = gf.field_f;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= gf.field_h) {
            break L2;
          } else {
            param2 = gf.field_h - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= gf.field_e) {
            break L3;
          } else {
            param3 = gf.field_e - param1;
            break L3;
          }
        }
        param4 = ((param4 & 16711935) * param5 >> 8 & 16711935) + ((param4 & 65280) * param5 >> 8 & 65280);
        param6 = param6 << 24;
        var7 = 256 - param5;
        var8 = gf.field_i - param2;
        var9 = param0 + param1 * gf.field_i;
        var10 = 0;
        L4: while (true) {
          if (var10 >= param3) {
            return;
          } else {
            var11 = -param2;
            L5: while (true) {
              if (var11 >= 0) {
                var9 = var9 + var8;
                var10++;
                continue L4;
              } else {
                var12 = gf.field_b[var9];
                var12 = ((var12 & 16711935) * var7 >> 8 & 16711935) + ((var12 & 65280) * var7 >> 8 & 65280);
                incrementValue$1 = var9;
                var9++;
                gf.field_b[incrementValue$1] = param6 | param4 + var12;
                var11++;
                continue L5;
              }
            }
          }
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        for (var8 = 0; var8 < param6; var8++) {
            qe.a(param0 - 1 - var8, param1 - 1 - var8, param2 + 2 + 2 * var8, param3 + 2 + 2 * var8, 0, param4 - param5 * var8, param7);
        }
    }

    static {
        field_k = new wb[32];
        field_g = new int[][]{new int[]{16716800, 16756480}, new int[]{685312, 5826816}, new int[]{10449103, 12690143}, new int[]{8086330, 12428684}};
        field_h = new int[][]{new int[]{16716800, 16756480}, new int[]{685312, 5826816}, new int[]{2188106, 7054732}, new int[]{42962, 62200}};
    }
}
