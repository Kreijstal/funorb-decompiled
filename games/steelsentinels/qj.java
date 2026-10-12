/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    private Sentinel field_l;
    static String[] field_d;
    private int field_t;
    static sk[] field_q;
    private int field_e;
    static int[] field_a;
    private int field_p;
    static String field_i;
    private int field_n;
    static String field_j;
    static String field_m;
    static String field_u;
    static String[] field_v;
    private int field_o;
    private int field_k;
    private int field_f;
    private int field_g;
    static String field_c;
    private int field_r;
    private int field_b;
    private int field_w;
    private int field_s;
    static int field_h;

    public static void c(int param0) {
        field_u = null;
        if (param0 != 21841) {
          return;
        }
        field_v = null;
        field_d = null;
        field_a = null;
        field_m = null;
        field_c = null;
        field_j = null;
        field_i = null;
        field_q = null;
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int[] dupTemp$4 = null;
        int[] dupTemp$5 = null;
        int[] dupTemp$6 = null;
        int[] dupTemp$7 = null;
        int[] dupTemp$8 = null;
        int[] dupTemp$9 = null;
        int[] dupTemp$10 = null;
        int[] dupTemp$11 = null;
        int[] dupTemp$12 = null;
        int[] dupTemp$13 = null;
        int[] dupTemp$14 = null;
        int[] dupTemp$15 = null;
        int var2;
        int var5;
        int var2Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        if (ei.field_q == 16) {
          this.field_t = jm.field_o;
          this.field_f = -1;
          this.field_b = 0;
        }
        if (17 == ei.field_q) {
          this.field_b = 1;
          this.field_t = wb.field_g;
          this.field_f = -1;
        }
        if (ei.field_q == 18) {
          this.field_f = -1;
          this.field_b = 9;
          this.field_t = lc.field_g;
        }
        if (ei.field_q == 19) {
          this.field_f = -1;
          this.field_b = 14;
          this.field_t = qe.field_e;
        }
        if (ei.field_q == 20) {
          this.field_t = jh.field_d;
          this.field_b = 17;
          this.field_f = -1;
        }
        if (ei.field_q == 66) {
          this.field_s = this.field_b;
        }
        if (ei.field_q == 41 &&
          fc.field_e[82] &&
          this.field_s != -1) {
          for (var2 = 0; var2 < ka.field_G[o.a((byte) 84, this.field_n)][this.field_b].length; var2++) {
            ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][var2] = ka.field_G[o.a((byte) 84, this.field_n)][this.field_s][var2];
          }
          this.field_s = -1;
          qa.field_J[this.field_b].d();
          SoftwareRaster.b();
          this.field_l.field_r = this.field_b;
          this.field_l.field_J = this.field_b;
          this.field_l.f(this.field_n, param0 ^ -27248);
          this.field_l.a(128, 64, (byte) -116, rf.field_a);
          sb.field_bb.b((byte) 127);
        }
        if (ei.field_q == 65 &&
          -1 != this.field_f) {
          ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][this.field_f] = this.field_o;
          qa.field_J[this.field_b].d();
          SoftwareRaster.b();
          this.field_l.field_J = this.field_b;
          this.field_l.field_r = this.field_b;
          this.field_l.f(this.field_n, 22742);
          this.field_l.a(128, 64, (byte) -116, rf.field_a);
          sb.field_bb.b((byte) 127);
        }
        if (ei.field_q == 49) {
          this.field_p = ja.field_i;
        }
        if (ei.field_q == 70) {
          this.field_p = NodeHashTable.field_e;
        }
        if (ei.field_q == 51) {
          this.field_p = rb.field_j;
        }
        if (ei.field_q == 41) {
          var2Lifetime1 = o.a((byte) 84, this.field_n);
          System.out.println("Please send the following data to TdR so he can insert it into the game!");
          System.out.println("int[][] animation = sentinelanimations[" + var2Lifetime1 + "];");
          for (var3 = 0; var3 < 26; var3++) {
            System.out.print("animation[" + var3 + "] = new int[]{");
            for (var4 = 0; var4 < ka.field_G[var2Lifetime1][var3].length; var4++) {
              if (var4 > 0) {
                System.out.print(",");
              }
              System.out.print(ka.field_G[var2Lifetime1][var3][var4]);
            }
            System.out.println("};");
          }
        }
        if (ei.field_q == 96) {
          this.field_b = this.field_b - 1;
          this.field_f = -1;
          if (this.field_t == jm.field_o) {
            this.field_b = 0;
          }
          if (this.field_t == wb.field_g &&
            this.field_b < 1) {
            this.field_b = this.field_b + ka.field_G[o.a((byte) 84, this.field_n)][25][3];
          }
          if (this.field_t == lc.field_g &&
            9 > this.field_b) {
            this.field_b = 9;
          }
          if (this.field_t == qe.field_e &&
            this.field_b < 14) {
            this.field_b = 14;
          }
          if (jh.field_d == this.field_t &&
            this.field_b < 17) {
            this.field_b = this.field_b + ka.field_G[o.a((byte) 84, this.field_n)][25][7];
          }
        }
        if (ei.field_q == 97) {
          this.field_b = this.field_b + 1;
          this.field_f = -1;
          if (this.field_t == jm.field_o) {
            this.field_b = 0;
          }
          if (this.field_t == wb.field_g &&
            this.field_b >= ka.field_G[o.a((byte) 84, this.field_n)][25][3] + 1) {
            this.field_b = this.field_b - ka.field_G[o.a((byte) 84, this.field_n)][25][3];
          }
          if (this.field_t == lc.field_g &&
            this.field_b >= 9 + ka.field_G[o.a((byte) 84, this.field_n)][25][4]) {
            this.field_b = 8 + ka.field_G[o.a((byte) 84, this.field_n)][25][4];
          }
          if (qe.field_e == this.field_t &&
            this.field_b > 16) {
            this.field_b = 16;
          }
          if (this.field_t == jh.field_d &&
            this.field_b >= ka.field_G[o.a((byte) 84, this.field_n)][25][7] + 17) {
            this.field_b = this.field_b - ka.field_G[o.a((byte) 84, this.field_n)][25][7];
          }
        }
        if (26 == ei.field_q) {
          if (this.field_t != wb.field_g) {
            if (lc.field_g == this.field_t) {
              if (1 < ka.field_G[o.a((byte) 84, this.field_n)][25][4]) {
                dupTemp$0 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$0[4] = dupTemp$0[4] - 1;
              }
            } else {
              if (this.field_t == jh.field_d &&
                ka.field_G[o.a((byte) 84, this.field_n)][25][7] > 3) {
                dupTemp$1 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$1[7] = dupTemp$1[7] - 1;
              }
            }
          } else {
            if (ka.field_G[o.a((byte) 84, this.field_n)][25][3] > 3) {
              dupTemp$2 = ka.field_G[o.a((byte) 84, this.field_n)][25];
              dupTemp$2[3] = dupTemp$2[3] - 1;
            }
          }
        }
        if (ei.field_q == 27) {
          if (this.field_t == wb.field_g) {
            if (ka.field_G[o.a((byte) 84, this.field_n)][25][3] < 8) {
              dupTemp$3 = ka.field_G[o.a((byte) 84, this.field_n)][25];
              dupTemp$3[3] = dupTemp$3[3] + 1;
            }
          } else {
            if (this.field_t == lc.field_g) {
              if (ka.field_G[o.a((byte) 84, this.field_n)][25][4] < 5) {
                dupTemp$4 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$4[4] = dupTemp$4[4] + 1;
              }
            } else {
              if (this.field_t == jh.field_d &&
                ka.field_G[o.a((byte) 84, this.field_n)][25][7] < 8) {
                dupTemp$5 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$5[7] = dupTemp$5[7] + 1;
              }
            }
          }
        }
        if (param0 != -12986) {
          this.b(47);
        }
        if (ei.field_q == 71) {
          if (wb.field_g == this.field_t) {
            if (fc.field_e[81]) {
              if (ka.field_G[o.a((byte) 84, this.field_n)][25][1] > 1) {
                dupTemp$6 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$6[1] = dupTemp$6[1] - 1;
              }
            } else {
              if (1 < ka.field_G[o.a((byte) 84, this.field_n)][25][0]) {
                dupTemp$7 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$7[0] = dupTemp$7[0] - 1;
              }
            }
          } else {
            if (this.field_t != lc.field_g) {
              if (jh.field_d == this.field_t) {
                if (!fc.field_e[81]) {
                  if (1 < ka.field_G[o.a((byte) 84, this.field_n)][25][5]) {
                    dupTemp$8 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                    dupTemp$8[5] = dupTemp$8[5] - 1;
                  }
                } else {
                  if (ka.field_G[o.a((byte) 84, this.field_n)][25][6] > 1) {
                    dupTemp$9 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                    dupTemp$9[6] = dupTemp$9[6] - 1;
                  }
                }
              }
            } else {
              if (ka.field_G[o.a((byte) 84, this.field_n)][25][2] > 1) {
                dupTemp$10 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$10[2] = dupTemp$10[2] - 1;
              }
            }
          }
        }
        if (ei.field_q == 72) {
          if (this.field_t != wb.field_g) {
            if (lc.field_g == this.field_t) {
              if (ka.field_G[o.a((byte) 84, this.field_n)][25][2] < 100) {
                dupTemp$11 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$11[2] = dupTemp$11[2] + 1;
              }
            } else {
              if (jh.field_d == this.field_t) {
                if (!fc.field_e[81]) {
                  if (ka.field_G[o.a((byte) 84, this.field_n)][25][5] < 256) {
                    dupTemp$12 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                    dupTemp$12[5] = dupTemp$12[5] + 1;
                  }
                } else {
                  if (ka.field_G[o.a((byte) 84, this.field_n)][25][6] < 25) {
                    dupTemp$13 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                    dupTemp$13[6] = dupTemp$13[6] + 1;
                  }
                }
              }
            }
          } else {
            if (fc.field_e[81]) {
              if (ka.field_G[o.a((byte) 84, this.field_n)][25][1] < 25) {
                dupTemp$14 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$14[1] = dupTemp$14[1] + 1;
              }
            } else {
              if (ka.field_G[o.a((byte) 84, this.field_n)][25][0] < 256) {
                dupTemp$15 = ka.field_G[o.a((byte) 84, this.field_n)][25];
                dupTemp$15[0] = dupTemp$15[0] + 1;
              }
            }
          }
        }
    }

    final static void a(long param0, String param1, int param2, int param3, int param4) {
        kh.field_q = param0;
        if (param3 != -29368) {
          return;
        }
        try {
          wn.field_f = param4;
          hk.field_ic = param2;
          CachedArchiveProvider.field_t = param1;
          ob.field_v = true;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (this.field_t == jm.field_o) {
          this.field_l.field_Lb = false;
          this.field_l.field_U = 0;
          this.field_l.field_oc = 0;
        } else {
          if (wb.field_g == this.field_t) {
            this.field_l.field_oc = 0;
            this.field_l.field_Lb = false;
            this.field_l.field_Pb = 0;
            this.field_l.field_U = 1;
            if (this.field_p != ja.field_i) {
              if (this.field_p == rb.field_j) {
                this.field_l.field_mb = 0;
                this.field_e = 0;
              } else {
                this.field_k = this.field_k + 1;
                if (this.field_k > 200) {
                  this.field_k = this.field_k - 400;
                }
                this.field_e = this.field_k * (ka.field_G[o.a((byte) 84, this.field_n)][25][0] * this.field_g) / (ka.field_G[o.a((byte) 84, this.field_n)][25][1] * 10);
                this.field_e = (511 & this.field_e) - 256;
              }
            } else {
              this.field_e = 0;
            }
          } else {
            if (lc.field_g != this.field_t) {
              if (this.field_t != qe.field_e) {
                if (this.field_t == jh.field_d) {
                  this.field_l.field_Lb = false;
                  this.field_l.field_Pb = 25;
                  this.field_l.field_oc = 0;
                  this.field_l.field_U = 1;
                  if (ja.field_i == this.field_p) {
                    this.field_e = 0;
                  } else {
                    if (this.field_p == rb.field_j) {
                      this.field_l.field_mb = 0;
                      this.field_e = 0;
                    } else {
                      this.field_k = this.field_k + 1;
                      if (this.field_k > 200) {
                        this.field_k = this.field_k - 400;
                      }
                      this.field_e = this.field_k * (ka.field_G[o.a((byte) 84, this.field_n)][25][5] * this.field_g) / (10 * ka.field_G[o.a((byte) 84, this.field_n)][25][6]);
                      this.field_e = -256 + (this.field_e & 511);
                    }
                  }
                }
              } else {
                this.field_l.field_Lb = true;
                this.field_l.velocityY = this.field_l.velocityY + 1;
                this.field_l.field_oc = 0;
                if (this.field_l.velocityY > 50) {
                  this.field_l.velocityY = -50;
                }
              }
            } else {
              fieldTemp$0 = this.field_l.field_oc;
              this.field_l.field_oc = this.field_l.field_oc + 1;
              if (fieldTemp$0 >= ka.field_G[o.a((byte) 84, this.field_n)][25][2]) {
                this.field_l.field_oc = 0;
              }
              this.field_l.field_Lb = false;
            }
          }
        }
        this.field_l.g(-18, this.field_n);
        if (nc.field_d == 1 &&
          this.field_w != -1) {
          if (this.field_f != this.field_w) {
            this.field_f = this.field_w;
            this.field_o = ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][this.field_w];
          }
          ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][this.field_w] = this.field_r;
          qa.field_J[this.field_b].d();
          SoftwareRaster.b();
          this.field_l.field_r = this.field_b;
          this.field_l.field_J = this.field_b;
          this.field_l.f(this.field_n, 22742);
          this.field_l.a(128, 64, (byte) -116, rf.field_a);
          sb.field_bb.b((byte) 127);
        }
        if (param0 <= 43) {
          qj.c(117);
        }
    }

    final void d(int param0) {
        int[][] dupTemp$0 = null;
        int[] array$1 = null;
        int var2;
        int var3;
        int var4;
        int[] var5_ref_int__;
        int var5;
        int var6;
        int var7_int;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        String var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        String var28;
        String var29;
        int[] var30;
        int var2Lifetime1;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        String var7Lifetime1;
        String var7Lifetime2;
        String var7Lifetime3;
        String var7Lifetime4;
        String var7Lifetime5;
        String var7Lifetime6;
        String var7Lifetime7;
        String var7Lifetime8;
        String var7Lifetime9;
        String var7Lifetime10;
        String var7Lifetime11;
        String var7Lifetime12;
        String var7Lifetime13;
        String var7Lifetime14;
        String var7Lifetime15;
        int var8Lifetime3;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        int var8Lifetime1Lifetime3;
        int var8Lifetime2Lifetime1;
        int var8Lifetime2Lifetime2;
        int var8Lifetime2Lifetime3;
        var11 = SteelSentinels.obfuscationControl;
        if (null != ka.field_G[o.a((byte) 84, this.field_n)] &&
          ka.field_G[o.a((byte) 84, this.field_n)][25] != null) {
          SoftwareRaster.a(0, 0, 640, 380, 0);
          SoftwareRaster.a(0, 0, 640, 396);
          var4 = this.field_w;
          this.field_w = param0;
          if (this.field_l.animatedParts.length > 0) {
            var2 = 320;
            var3 = 32;
            var5_ref_int__ = ka.field_G[o.a((byte) 84, this.field_n)][this.field_b];
            if (var5_ref_int__ == null) {
              dupTemp$0 = ka.field_G[o.a((byte) 84, this.field_n)];
              array$1 = new int[2 + this.field_l.animatedParts.length];
              dupTemp$0[this.field_b] = array$1;
              var5_ref_int__ = array$1;
            }
            var6 = var5_ref_int__.length;
            if (var5_ref_int__ == null ||
              var6 != 2 + this.field_l.animatedParts.length) {
              var30 = new int[2 + this.field_l.animatedParts.length];
              var13 = var30;
              var12 = var13;
              var5_ref_int__ = var12;
              for (var8 = 0; var30.length > var8; var8++) {
                if (ka.field_G[o.a((byte) 84, this.field_n)][this.field_b].length > var8) {
                  var12[var8] = ka.field_G[o.a((byte) 84, this.field_n)][this.field_b][var8];
                }
              }
              ka.field_G[o.a((byte) 84, this.field_n)][this.field_b] = var30;
            }
            var7_int = 48;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              if (this.field_l.animatedParts.length > var8Lifetime3) {
                SoftwareRaster.d(var2, var3, 2 * var7_int, 16777215);
                SoftwareRaster.g(var2 - 3, var3 + var7_int, 7, 16777215);
                var9 = var7_int * var5_ref_int__[var8Lifetime3] / 17763 + (var7_int + var3);
                var10 = 16777215;
                if (var5_ref_int__[var8Lifetime3] == 0) {
                  var10 = 26248;
                }
                SoftwareRaster.c(var2, var9, 5, var10);
                if ((nc.field_d == 0 ||
                  var8Lifetime3 == var4) && (-5 + var2 <= oh.field_f &&
                  5 + var2 >= oh.field_f &&
                  var3 <= pi.field_c &&
                  pi.field_c <= var7_int * 2 + var3)) {
                  this.field_r = (pi.field_c - var3 - var7_int) * 17763 / var7_int;
                  this.field_w = var8Lifetime3;
                  if (fc.field_e[81]) {
                    this.field_r = 35526 * (pi.field_c - var3 - var7_int) / var7_int;
                  }
                  if (Math.abs(-var7_int + (-var3 + pi.field_c)) <= 1) {
                    this.field_r = 0;
                  }
                  if (this.field_r == 0) {
                    var10 = 26248;
                  }
                  SoftwareRaster.c(var2, var9, 6, var10);
                }
              } else {
                if (var6 - 2 != var8Lifetime3) {
                  if (var8Lifetime3 == -1 + var6) {
                    SoftwareRaster.g(var2, var3, var7_int * 2, 16777215);
                    SoftwareRaster.d(var7_int + var2, var3 - 3, 7, 16746496);
                    var9 = var7_int * var5_ref_int__[var8Lifetime3] / 2500 + var7_int + var2;
                    SoftwareRaster.c(var9, var3, 5, 16746496);
                    if ((nc.field_d == 0 ||
                      var8Lifetime3 == var4) && (oh.field_f >= var2 &&
                      var7_int * 2 + var2 >= oh.field_f &&
                      -5 + var3 <= pi.field_c &&
                      5 + var3 >= pi.field_c)) {
                      this.field_r = 2500 * (-var7_int + oh.field_f - var2) / var7_int;
                      this.field_w = var8Lifetime3;
                      if (Math.abs(-var2 + oh.field_f - var7_int) <= 1) {
                        this.field_r = 0;
                      }
                      SoftwareRaster.c(var9, var3, 6, 16746496);
                    }
                  }
                } else {
                  SoftwareRaster.d(var2, var3, 2 * var7_int, 16777215);
                  SoftwareRaster.g(-3 + var2, var3 + var7_int, 7, 16746496);
                  var9 = var7_int * var5_ref_int__[var8Lifetime3] / 2500 + var3 + var7_int;
                  SoftwareRaster.c(var2, var9, 5, 16746496);
                  if ((nc.field_d == 0 ||
                    var4 == var8Lifetime3) && (oh.field_f >= -5 + var2 &&
                    5 + var2 >= oh.field_f &&
                    pi.field_c >= var3 &&
                    var3 + 2 * var7_int >= pi.field_c)) {
                    this.field_r = (pi.field_c - var3 - var7_int) * 2500 / var7_int;
                    this.field_w = var8Lifetime3;
                    if (1 >= Math.abs(-var3 + pi.field_c - var7_int)) {
                      this.field_r = 0;
                    }
                    SoftwareRaster.c(var2, var9, 6, 16746496);
                  }
                }
              }
              var2 += 16;
            }
          }
          var2Lifetime1 = 160;
          var3Lifetime1 = 380;
          if (this.field_t == jh.field_d) {
            for (var5 = 0; var5 < 64; var5++) {
              SoftwareRaster.d(var2Lifetime1 - (64 - (1 & var5)), var3Lifetime1 - (-64 - var5 / 2), (1 & var5) + 128 + var2Lifetime1, var5 / 2 + (-128 + var3Lifetime1), 3351057);
            }
          } else {
            SoftwareRaster.a(-128 + var2Lifetime1, var3Lifetime1, 257, 64, 3351057);
          }
          var5Lifetime1 = ka.field_G[o.a((byte) 84, this.field_n)][25][0];
          var6Lifetime1 = ka.field_G[o.a((byte) 84, this.field_n)][25][1];
          if (this.field_l.field_Pb > 0) {
            var5Lifetime1 = ka.field_G[o.a((byte) 84, this.field_n)][25][5];
            var6Lifetime1 = ka.field_G[o.a((byte) 84, this.field_n)][25][6];
          }
          if (this.field_t == wb.field_g) {
            SoftwareRaster.f(var2Lifetime1, -192 + var3Lifetime1, 192, 16777215, 64);
            SoftwareRaster.f(-64 + var2Lifetime1, -192 + var3Lifetime1, 192, 16777215, 64);
            SoftwareRaster.f(var2Lifetime1 + 64, -192 + var3Lifetime1, 192, 16777215, 64);
            var7_intLifetime1 = ka.field_G[o.a((byte) 84, this.field_n)][25][3];
            SoftwareRaster.b(var2Lifetime1 - this.field_g * ((this.field_b - 1) * var5Lifetime1) / var6Lifetime1, 7 + var3Lifetime1, 7, 16777215, 255 - (this.field_b - 1) * 256 / var7_intLifetime1);
            SoftwareRaster.b(var2Lifetime1 - (var5Lifetime1 * (this.field_b - 1) * this.field_g / var6Lifetime1 + this.field_g * (var5Lifetime1 * var7_intLifetime1) / (var6Lifetime1 * 2)), var3Lifetime1 + 7, 7, 16711680, 128);
            SoftwareRaster.b(-(var5Lifetime1 * (this.field_b - var7_intLifetime1 - 1) * this.field_g / var6Lifetime1) + var2Lifetime1, var3Lifetime1 + 7, 7, 16777215, (-var7_intLifetime1 + this.field_b - 1) * 256 / var7_intLifetime1 + 255);
            SoftwareRaster.b(var2Lifetime1 - this.field_g * var5Lifetime1 * (this.field_b - (var7_intLifetime1 + 1)) / var6Lifetime1 - this.field_g * (var7_intLifetime1 * var5Lifetime1) / (var6Lifetime1 * 2), 7 + var3Lifetime1, 7, 16711680, 128);
          } else {
            if (jh.field_d != this.field_t) {
              SoftwareRaster.e(var2Lifetime1, var3Lifetime1 + 7, 7, 16777215);
            } else {
              SoftwareRaster.f(var2Lifetime1, var3Lifetime1 - 192, 192, 16777215, 64);
              SoftwareRaster.f(var2Lifetime1 - 64, var3Lifetime1 - 192, 192, 16777215, 64);
              SoftwareRaster.f(var2Lifetime1 + 64, var3Lifetime1 - 192, 192, 16777215, 64);
              var7_intLifetime1 = ka.field_G[o.a((byte) 84, this.field_n)][25][7];
              var8Lifetime1 = this.field_g * var5Lifetime1 * (this.field_b - 17) / var6Lifetime1;
              SoftwareRaster.b(-var8Lifetime1 + var2Lifetime1, var8Lifetime1 + 7 + var3Lifetime1, 7, 16777215, 255 - (this.field_b - 17) * 256 / var7_intLifetime1);
              var8Lifetime1Lifetime1 = -(this.field_g * var7_intLifetime1 * var5Lifetime1 / (var6Lifetime1 * 2)) + this.field_g * (this.field_b - 17) * var5Lifetime1 / var6Lifetime1;
              SoftwareRaster.b(-var8Lifetime1Lifetime1 + var2Lifetime1, var3Lifetime1 + (7 + var8Lifetime1Lifetime1), 7, 16711680, 128);
              var8Lifetime1Lifetime2 = (this.field_b + (-var7_intLifetime1 - 17)) * (var5Lifetime1 * this.field_g) / var6Lifetime1;
              SoftwareRaster.b(var2Lifetime1 - var8Lifetime1Lifetime2, 7 + var3Lifetime1 + var8Lifetime1Lifetime2, 7, 16777215, (-4352 + (-var7_intLifetime1 + this.field_b) * 256) / var7_intLifetime1 + 255);
              var8Lifetime1Lifetime3 = this.field_g * (-var7_intLifetime1 + this.field_b - 17) * var5Lifetime1 / var6Lifetime1 - this.field_g * (var5Lifetime1 * var7_intLifetime1) / (var6Lifetime1 * 2);
              SoftwareRaster.b(var2Lifetime1 - var8Lifetime1Lifetime3, 7 + var3Lifetime1 + var8Lifetime1Lifetime3, 7, 16711680, 128);
            }
          }
          qa.field_J[this.field_b].c(var2Lifetime1 - 128, -256 + var3Lifetime1, 256, 256);
          var2Lifetime1 += 320;
          if (this.field_t == jh.field_d) {
            for (var7_intLifetime2 = 0; var7_intLifetime2 < 64; var7_intLifetime2++) {
              SoftwareRaster.d((1 & var7_intLifetime2) + (var2Lifetime1 - 64), 64 + (var3Lifetime1 + var7_intLifetime2 / 2), 128 + (var2Lifetime1 + (1 & var7_intLifetime2)), var3Lifetime1 + (-128 + var7_intLifetime2 / 2), 3351057);
            }
          } else {
            SoftwareRaster.a(-128 + var2Lifetime1, var3Lifetime1, 257, 64, 3351057);
          }
          SoftwareRaster.c();
          if (this.field_t == wb.field_g) {
            SoftwareRaster.a(var2Lifetime1 - 128, 130, 128 + var2Lifetime1, var3Lifetime1);
            if (0 > this.field_w ||
              !(this.field_l.animatedParts.length > this.field_w)) {
              this.field_l.a(var3Lifetime1, this.field_e + var2Lifetime1, (byte) -116, rm.field_n);
            }
            if (ja.field_i == this.field_p) {
              var7_intLifetime3 = ka.field_G[o.a((byte) 84, this.field_n)][25][3];
              SoftwareRaster.f(var2Lifetime1, -192 + var3Lifetime1, 192, 16777215, 64);
              SoftwareRaster.f(var2Lifetime1 - 64, -192 + var3Lifetime1, 192, 16777215, 64);
              SoftwareRaster.f(64 + var2Lifetime1, var3Lifetime1 - 192, 192, 16777215, 64);
              SoftwareRaster.a(-128 + var2Lifetime1, 0, 128 + var2Lifetime1, 480);
              var2Lifetime1 = var2Lifetime1 - this.field_g * var5Lifetime1 * (-50 + this.field_l.field_mb) / (50 * var6Lifetime1);
              SoftwareRaster.b(var2Lifetime1 - this.field_g * (var5Lifetime1 * (this.field_l.field_r - 1)) / var6Lifetime1, 7 + var3Lifetime1, 7, 16777215, -(256 * (this.field_l.field_r - 1) / var7_intLifetime3) + 255);
              SoftwareRaster.b(-(this.field_g * (var7_intLifetime3 * var5Lifetime1) / (var6Lifetime1 * 2)) + var2Lifetime1 - var5Lifetime1 * (this.field_l.field_r - 1) * this.field_g / var6Lifetime1, 7 + var3Lifetime1, 7, 16711680, 128);
              SoftwareRaster.b(-((-var7_intLifetime3 + (this.field_l.field_r - 1)) * (var5Lifetime1 * this.field_g) / var6Lifetime1) + var2Lifetime1, 7 + var3Lifetime1, 7, 16777215, (-256 + 256 * (this.field_l.field_r - var7_intLifetime3)) / var7_intLifetime3 + 255);
              SoftwareRaster.b(var2Lifetime1 - this.field_g * (-var7_intLifetime3 + this.field_l.field_r - 1) * var5Lifetime1 / var6Lifetime1 - this.field_g * (var5Lifetime1 * var7_intLifetime3) / (2 * var6Lifetime1), 7 + var3Lifetime1, 7, 16711680, 128);
              SoftwareRaster.c();
            }
            SoftwareRaster.c();
          } else {
            if (this.field_t == jh.field_d) {
              SoftwareRaster.a(-128 + var2Lifetime1, 130, var2Lifetime1 + 128, var3Lifetime1);
              if (0 > this.field_w ||
                !(this.field_w < this.field_l.animatedParts.length)) {
                this.field_l.a(var3Lifetime1, var2Lifetime1 + this.field_e, (byte) -116, rm.field_n);
              }
              if (ja.field_i == this.field_p) {
                var7_intLifetime3 = ka.field_G[o.a((byte) 84, this.field_n)][25][7];
                SoftwareRaster.f(var2Lifetime1, var3Lifetime1 - 192, 192, 16777215, 64);
                SoftwareRaster.f(-64 + var2Lifetime1, var3Lifetime1 - 192, 192, 16777215, 64);
                SoftwareRaster.f(var2Lifetime1 + 64, -192 + var3Lifetime1, 192, 16777215, 64);
                SoftwareRaster.a(-128 + var2Lifetime1, 0, var2Lifetime1 + 128, 480);
                var2Lifetime1 = var2Lifetime1 - this.field_g * ((this.field_l.field_mb - 50) * var5Lifetime1) / (50 * var6Lifetime1);
                var3Lifetime1 = var3Lifetime1 + var5Lifetime1 * (this.field_l.field_mb - 50) * this.field_g / (var6Lifetime1 * 50);
                var8Lifetime2 = (-17 + this.field_l.field_r) * (var5Lifetime1 * this.field_g) / var6Lifetime1;
                SoftwareRaster.b(var2Lifetime1 - var8Lifetime2, 7 + var3Lifetime1 + var8Lifetime2, 7, 16777215, -((this.field_l.field_r - 17) * 256 / var7_intLifetime3) + 255);
                var8Lifetime2Lifetime1 = -(this.field_g * var5Lifetime1 * var7_intLifetime3 / (2 * var6Lifetime1)) + this.field_g * var5Lifetime1 * (this.field_l.field_r - 17) / var6Lifetime1;
                SoftwareRaster.b(-var8Lifetime2Lifetime1 + var2Lifetime1, var8Lifetime2Lifetime1 + (7 + var3Lifetime1), 7, 16711680, 128);
                var8Lifetime2Lifetime2 = var5Lifetime1 * (this.field_l.field_r - var7_intLifetime3 - 17) * this.field_g / var6Lifetime1;
                SoftwareRaster.b(-var8Lifetime2Lifetime2 + var2Lifetime1, var3Lifetime1 + 7 + var8Lifetime2Lifetime2, 7, 16777215, 255 + 256 * (this.field_l.field_r - (var7_intLifetime3 + 17)) / var7_intLifetime3);
                var8Lifetime2Lifetime3 = this.field_g * var5Lifetime1 * (-var7_intLifetime3 + (this.field_l.field_r - 17)) / var6Lifetime1 - this.field_g * (var5Lifetime1 * var7_intLifetime3) / (2 * var6Lifetime1);
                SoftwareRaster.b(var2Lifetime1 - var8Lifetime2Lifetime3, var8Lifetime2Lifetime3 + (var3Lifetime1 + 7), 7, 16711680, 128);
                SoftwareRaster.c();
              }
              SoftwareRaster.c();
            } else {
              SoftwareRaster.a(-128 + var2Lifetime1, 130, 128 + var2Lifetime1, var3Lifetime1);
              SoftwareRaster.c();
              SoftwareRaster.e(var2Lifetime1, var3Lifetime1 + 7, 7, 16777215);
            }
          }
          var14 = "";
          var7 = var14;
          var7Lifetime1 = var14;
          var15 = var14 + "Animation Editor<br>P - Print data to console<br>";
          var7Lifetime2 = var15;
          var7Lifetime3 = var15;
          var7Lifetime4 = var15;
          if (this.field_t == jm.field_o) {
            var7Lifetime4 = var15 + "<col=ffffff>";
          }
          var16 = var7Lifetime4 + "1 - Edit idle anim</col><br>";
          var7Lifetime5 = var16;
          var7Lifetime6 = var16;
          var7Lifetime7 = var16;
          if (wb.field_g == this.field_t) {
            var7Lifetime7 = var16 + "<col=ffffff>";
          }
          var17 = var7Lifetime7 + "2 - Edit walk anim</col><br>";
          var7Lifetime8 = var17;
          var7Lifetime9 = var17;
          var7Lifetime10 = var17;
          if (lc.field_g == this.field_t) {
            var7Lifetime10 = var17 + "<col=ffffff>";
          }
          var18 = var7Lifetime10 + "3 - Edit jump anim</col><br>";
          var7Lifetime11 = var18;
          var7Lifetime12 = var18;
          var7Lifetime13 = var18;
          if (qe.field_e == this.field_t) {
            var7Lifetime13 = var18 + "<col=ffffff>";
          }
          var19 = var7Lifetime13 + "4 - Edit air anim</col><br>";
          var7Lifetime14 = var19;
          if (this.field_t == jh.field_d) {
            var7Lifetime14 = var19 + "<col=ffffff>";
          }
          var20 = var7Lifetime14 + "5 - Edit climb anim</col><br>";
          var21 = var20 + "<br>Left and Right change frame<br>Use the sliders to change angles and positions.<br>C - select a frame to copy, CTRL+P - pastes a frame<br>";
          var7Lifetime15 = var21;
          if (this.field_t == wb.field_g) {
            var22 = var21 + "S - show treadmill animation<br>M - show moving animation<br>F - show still frame<br>";
            var23 = var22 + "Speed = " + var5Lifetime1 + " (<lt> and <gt> to change)<br>";
            var24 = var23 + "Frame = " + (0 + this.field_b) + " of " + ka.field_G[o.a((byte) 84, this.field_n)][25][3] + " (arrow keys to change, + and - to change max frame no)<br>";
            var7Lifetime15 = var24 + "FPS = " + ka.field_G[o.a((byte) 84, this.field_n)][25][1] + " (SHIFT + <lt> and <gt> to change)<br>";
          }
          if (this.field_t == lc.field_g) {
            var25 = var7Lifetime15 + "S - show treadmill animation<br>M - show moving animation<br>";
            var26 = var25 + "Frame = " + (1 + (this.field_b - 9)) + " of " + ka.field_G[o.a((byte) 84, this.field_n)][25][4] + " (arrow keys to change, + and - to change max frame no)<br>";
            var7Lifetime15 = var26 + "Jump Animation Time = " + ka.field_G[o.a((byte) 84, this.field_n)][25][2] / 50 + "." + ka.field_G[o.a((byte) 84, this.field_n)][25][2] / 5 % 10 + ka.field_G[o.a((byte) 84, this.field_n)][25][2] * 2 % 10 + " secs (<lt> and <gt> to change)<br>";
          }
          if (jh.field_d == this.field_t) {
            var27 = var7Lifetime15 + "S - show treadmill animation<br>M - show moving animation<br>F - show still frame<br>";
            var28 = var27 + "Speed = " + var5Lifetime1 + " (<lt> and <gt> to change)<br>";
            var29 = var28 + "Frame = " + (1 + (this.field_b - 17)) + " of " + ka.field_G[o.a((byte) 84, this.field_n)][25][7] + " (arrow keys to change, + and - to change max frame no)<br>";
            var7Lifetime15 = var29 + "FPS = " + ka.field_G[o.a((byte) 84, this.field_n)][25][6] + " (SHIFT + <lt> and <gt> to change)<br>";
          }
          dk.field_h.a(var7Lifetime15, 8, 8, 624, 100, 43724, 0, 0, 0, 12);
          return;
        }
    }

    private qj() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_i = "Loading extra data";
        field_d = new String[]{"All scores", "My scores", "Best each"};
        field_v = new String[]{"Hyper reloader", "Health plus", "Infinite energy", "Impervious", "Speed", "Quadra-plating", "Quadra-damage", "EMP weapons", "MGFN", "Rocket strike", "1-Up"};
        field_u = "ALT+<img=26> drops target lock: On";
        field_m = "Please remove <%0> from your ignore list first.";
        field_j = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_q = new sk[105];
        field_c = "ENGINEERED";
        field_h = 0;
    }
}
