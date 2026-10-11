/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends bg {
    int field_z;
    private lg field_i;
    private lg field_h;
    int field_w;
    private wg field_n;
    private wg field_u;
    static String field_o;
    private boolean field_f;
    private int field_E;
    static lg field_A;
    private boolean field_y;
    static wk field_q;
    int field_x;
    private int field_s;
    static cr field_j;
    private int field_v;
    private int field_l;
    private int field_m;
    private boolean field_r;
    private int field_g;
    static cr field_k;
    private lg field_B;
    private lg field_t;
    static cr field_D;
    static int field_p;

    final void a(int param0, int param1) {
        this.field_m = param0;
        if (param1 != -25196) {
          this.field_i = (lg) null;
        }
    }

    final void a(boolean param0, int[] param1, boolean param2, boolean param3) {
        if (this.field_t == null) {
          return;
        }
        try {
          nf.field_q[2] = this.field_z;
          if (param0) {
            this.field_h = (lg) null;
          }
          nf.field_q[3] = 65535;
          nf.field_q[4] = 0;
          nf.field_q[9] = 0;
          nf.field_q[0] = this.field_w;
          nf.field_q[11] = 65535;
          nf.field_q[5] = 0;
          nf.field_q[10] = 0;
          nf.field_q[7] = 65535;
          nf.field_q[6] = 0;
          nf.field_q[1] = this.field_x;
          nf.field_q[8] = 0;
          new fc(this.field_t, 110, 1560, 10, -10, -5).a(param1, nf.field_q);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "hb.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void e(int param0) {
        if (param0 != -1) {
          return;
        }
        fh.field_t = null;
        ug.field_c = null;
    }

    final void a(boolean param0, wo param1) {
        this.field_x = param1.field_k;
        this.field_w = param1.field_E;
        if (param0) {
          return;
        }
        try {
          this.field_z = param1.field_y;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "hb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int b(byte param0) {
        int var1 = 125 % ((param0 + 11) / 49);
        return cf.field_a;
    }

    final int b(int param0) {
        if (param0 <= 97) {
          int[] var3 = (int[]) null;
          this.a(true, (int[]) null, false, false);
        }
        return this.field_m;
    }

    final lg c(byte param0) {
        lg var3 = null;
        lg var2 = null;
        lg var2Lifetime1;
        if (param0 != 4) {
          field_A = (lg) null;
        }
        if (this.field_l == 2) {
          return null;
        }
        if (this.field_l == 20) {
          return null;
        }
        if (!be.field_q) {
          var2 = new lg(fb.field_v, false, false, false, false);
          return var2;
        }
        if (null != this.field_t) {
          var3 = new lg(this.field_t, false, false, false, false);
          var2Lifetime1 = var3;
          var3.field_c = rr.field_D;
          var3.field_o = lf.field_A[6];
          var2Lifetime1.field_D = qj.field_b;
          var2Lifetime1.b();
          return var2Lifetime1;
        }
        return null;
    }

    final int c(boolean param0) {
        if (param0) {
          this.field_z = 118;
        }
        return this.field_l;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param2 <= 88) {
            hb.c(105);
          }
          var6_int = pk.a((byte) -14, cj.field_D, param4, ua.field_e);
          var7 = pk.a((byte) -14, cj.field_D, param1, ua.field_e);
          var8 = pk.a((byte) -14, ib.field_a, param5, ap.field_e);
          var9 = pk.a((byte) -14, ib.field_a, param0, ap.field_e);
          for (var10 = var6_int; var7 >= var10; var10++) {
            ki.a(-112, var8, vl.field_e[var10], var9, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "hb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        if (param0 != 2) {
          return;
        }
        field_k = null;
        field_j = null;
        field_A = null;
        field_q = null;
        field_D = null;
    }

    final void a(int param0, byte param1) {
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        int var3;
        int var4;
        if (param1 != -36) {
          this.b(true);
        }
        if (this.field_l >= 0) {
          stackIn_8_0 = (na.field_o[this.field_l] <= this.field_g) ? 1 : 0;
        } else {
          stackIn_8_0 = 1;
        }
        var3 = stackIn_8_0;
        if (var3 != 0) {
          if (25 == this.field_l &&
            param0 != 7) {
            return;
          }
          this.field_g = 0;
          this.field_n.a(ap.field_b[param0], (byte) 71);
          this.field_r = true;
          this.field_l = param0;
          return;
        }
        if (this.field_l == param0) {
          return;
        }
        if (23 == param0) {
          this.field_g = 0;
          this.field_n.a(ap.field_b[param0], (byte) 71);
          this.field_r = true;
          this.field_l = param0;
          return;
        }
        if (this.field_l != 26 &&
          13 != this.field_l &&
          this.field_l != 5 &&
          2 != this.field_l &&
          20 != this.field_l) {
          if (param0 != 2) {
            stackIn_27_0 = (param0 != 20) ? 1 : 0;
          } else {
            stackIn_27_0 = 0;
          }
          var4 = stackIn_27_0;
          if (this.field_l == 10 &&
            var4 != 0 &&
            this.field_l != 5) {
            return;
          }
          if (this.field_l == 25 &&
            7 != param0) {
            return;
          }
          if (19 == this.field_l &&
            param0 != 25) {
            return;
          }
          if (this.field_l == 22 &&
            param0 != 24 &&
            param0 != 25) {
            return;
          }
          if (this.field_l == 24 &&
            param0 != 25) {
            return;
          }
          if (this.field_l == 9 &&
            var4 != 0 &&
            7 != param0 &&
            param0 != 17 &&
            param0 != 5) {
            return;
          }
          if (this.field_l == 21 &&
            param0 != 15 &&
            param0 != 8 &&
            var4 != 0 &&
            param0 != 5 &&
            param0 != 17) {
            return;
          }
          if (this.field_l == 7 &&
            var4 != 0 &&
            param0 != 5 &&
            10 != param0 &&
            param0 != 26 &&
            param0 != 15) {
            return;
          }
          if (this.field_l == 16 &&
            var4 != 0 &&
            param0 != 5 &&
            param0 != 7) {
            return;
          }
          if (this.field_l == 11 &&
            var4 != 0 &&
            param0 != 5 &&
            param0 != 17) {
            return;
          }
          if (this.field_l == 8 &&
            7 != param0 &&
            var4 != 0 &&
            param0 != 5 &&
            param0 != 9 &&
            param0 != 17) {
            return;
          }
          if (this.field_l == 15 &&
            param0 != 7 &&
            var4 != 0 &&
            param0 != 5 &&
            16 != param0) {
            return;
          }
          if (this.field_l == 17 &&
            param0 != 7 &&
            var4 != 0 &&
            5 != param0 &&
            param0 != 18) {
            return;
          }
          if (this.field_l == 18 &&
            7 != param0 &&
            var4 != 0 &&
            param0 != 5) {
            return;
          }
          if (this.field_l == 1) {
            if (0 == param0) {
              return;
            }
            if (param0 == 4) {
              return;
            }
          }
          this.field_g = 0;
          this.field_n.a(ap.field_b[param0], (byte) 71);
          this.field_r = true;
          this.field_l = param0;
          return;
        }
    }

    final void a(wo param0, byte param1) {
        boolean stackIn_8_1 = false;
        boolean stackIn_11_1 = false;
        boolean stackIn_12_2 = false;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        String stackIn_179_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        lg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          this.field_n.c(-660903963);
          this.field_r = this.field_r | this.field_n.field_d;
          var3_int = param0.b(-1);
          if (param1 >= -36) {
            this.field_g = 92;
          }
          stackIn_8_1 = (param0.c(true)) || (9 == var3_int);
          this.field_y = stackIn_8_1;
          this.field_u.c(-660903963);
          this.field_g = this.field_g + 1;
          stackIn_11_1 = this.field_r;
          stackIn_12_2 = (this.field_y) && (this.field_u.field_d);
          this.field_r = stackIn_11_1 | stackIn_12_2;
          if (this.field_l != 2 &&
            this.field_l != 20) {
            var4 = param0.j(70);
            var5 = -this.field_s + var4;
            if (var5 < 64 &&
              var5 > -64) {
              this.field_s = var4;
            } else if ((0 >= var5 ||
              var5 >= 1024) &&
              (-1024 <= var5 ||
              -2048 >= var5)) {
              if (this.field_s != var4) {
                this.field_s = this.field_s - 64 & 2047;
                this.field_r = true;
              }
            } else {
              this.field_r = true;
              this.field_s = 64 + this.field_s & 2047;
            }
            if (this.field_E > 0) {
              this.field_E = this.field_E - 64;
              this.field_r = true;
            }
          }
          stackIn_33_0 = (param0.h(13289) == 0) ? 0 : 1;
          var4 = stackIn_33_0;
          var5 = 0;
          if (this.field_v == var3_int &&
            var3_int == 0 &&
            this.field_g == 615) {
            gm.a(16, (byte) -55);
          }
          if (var3_int != this.field_v) {
            boolean decompiledFrameRemainder0 = true;
            var8_int = var3_int;
            if (var8_int != 1) {
              if (var8_int == 4) {
                if (this.field_l != 2 &&
                  this.field_l != 20) {
                  var6 = 512;
                  this.field_s = var6 * (this.field_s / var6);
                  mj.a(this.field_w, this.field_z, this.field_E, this.field_s, nf.field_q, (byte) -63, this.field_x);
                  var7 = (param0.field_O + param0.field_c) / 10 & 1;
                  var5 = 1;
                  if (!param0.field_G &&
                    !this.field_y && (var7 == 1 ||
                    ol.field_B == 1)) {
                    gm.a(2, (byte) -55);
                    this.a(20, (byte) -36);
                    var8_int = param0.m(-1);
                    if (!param0.c(true)) {
                      if (var8_int > 0) {
                        this.field_i = vl.field_a[7][this.field_m];
                      } else {
                        if (var8_int < 0) {
                          this.field_i = vl.field_a[8][this.field_m];
                        } else {
                          this.field_i = vl.field_a[6][this.field_m];
                        }
                      }
                    } else {
                      if (var8_int != 0) {
                        if (var8_int <= 0) {
                          this.field_i = vl.field_a[9][this.field_m];
                        } else {
                          this.field_i = vl.field_a[10][this.field_m];
                        }
                      } else {
                        this.field_i = vl.field_a[12][this.field_m];
                      }
                    }
                    ll.field_e[2] = ui.field_e;
                    ll.field_e[0] = this.field_h;
                    ll.field_e[1] = this.field_i;
                    this.field_h = new lg(ll.field_e, 3);
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (param0.field_G) {
                      gm.a(6, (byte) -55);
                    } else {
                      gm.a(24, (byte) -55);
                    }
                    this.a(2, (byte) -36);
                    this.field_f = param0.field_G;
                    var8 = new lg(this.field_h, false, false, true, false);
                    var9 = nf.field_q[0];
                    var10 = nf.field_q[1];
                    nf.field_q[1] = 0;
                    var11 = nf.field_q[2];
                    nf.field_q[0] = 0;
                    nf.field_q[2] = 0;
                    var8.a(nf.field_q);
                    ll.field_e[0] = var8;
                    nf.field_q[0] = var9;
                    nf.field_q[1] = var10;
                    nf.field_q[2] = var11;
                    ll.field_e[1] = ch.field_d[this.field_m];
                    ll.field_e[2] = sl.field_u;
                    if (!this.field_f) {
                      this.field_h = new lg(ll.field_e, 3);
                    } else {
                      this.field_h = new lg(ll.field_e, 2);
                    }
                  }
                }
              } else {
                switch (var8_int) {
                  case 3:
                    ee.a(1, -109, 3);
                    var5 = 1;
                    this.a(13, (byte) -36);
                    break;
                  case 10:
                    this.a(10, (byte) -36);
                    ll.field_e[1] = qo.field_A;
                    ll.field_e[0] = this.field_h;
                    var5 = 1;
                    this.field_h = new lg(ll.field_e, 2);
                    break;
                  case 8:
                    var5 = 1;
                    this.a(23, (byte) -36);
                    this.field_h = vl.field_a[11][this.field_m];
                    break;
                  case 0:
                    if (this.field_v == 1) {
                      var5 = 1;
                      if (param0.field_X != -50) {
                        this.a(8, (byte) -36);
                      } else {
                        ee.a(0, -70, 14);
                        this.a(15, (byte) -36);
                      }
                    }
                    if (this.field_v == 7) {
                      this.d(75);
                    }
                    if (this.field_v == 4) {
                      this.d(9);
                    }
                    break;
                  case 9:
                    this.a(17, (byte) -36);
                    qg.a(1, 500, 10, 1);
                    var5 = 1;
                    break;
                  case 2:
                    ee.a(0, -85, 3);
                    var5 = 1;
                    this.a(5, (byte) -36);
                    break;
                  default:
                    break;
                }
              }
            } else {
              if (-6 == param0.field_X) {
                if (!this.field_y) {
                  gm.a(12, (byte) -55);
                }
                this.a(11, (byte) -36);
              } else {
                gm.a(11, (byte) -55);
                this.a(21, (byte) -36);
              }
              var5 = 1;
            }
            this.field_v = var3_int;
          }
          if (var3_int != 4 &&
            var3_int != 7) {
            if (var3_int != 8 &&
              var3_int != 6) {
              if (this.field_l == 17 &&
                this.field_n.a(-72)) {
                this.a(18, (byte) -36);
              }
              if (var5 == 0) {
                if (!this.field_y) {
                  mn.b(6, 2);
                } else {
                  fr.a(2, 76);
                }
                var6 = param0.m(-1);
                if (this.field_l != 20 &&
                  this.field_l != 10) {
                  if (var6 <= 0) {
                    if (0 <= var6) {
                      if (!this.field_y) {
                        this.field_h = vl.field_a[0][this.field_m];
                      } else {
                        this.field_h = vl.field_a[3][this.field_m];
                      }
                    } else {
                      if (!this.field_y) {
                        this.field_h = vl.field_a[2][this.field_m];
                      } else {
                        this.field_h = vl.field_a[5][this.field_m];
                      }
                    }
                  } else {
                    if (!this.field_y) {
                      this.field_h = vl.field_a[1][this.field_m];
                    } else {
                      this.field_h = vl.field_a[4][this.field_m];
                    }
                  }
                }
                if (this.field_l == 5 &&
                  var3_int != 2) {
                  this.field_l = -1;
                  return;
                }
                var7 = param0.c((byte) -128);
                if ((6 == this.field_l ||
                  9 == this.field_l ||
                  this.field_l == 16 ||
                  15 == this.field_l ||
                  25 == this.field_l) && param0.field_z) {
                  this.a(7, (byte) -36);
                  return;
                }
                if (var7 > -10 && (this.field_l == 15 ||
                  8 == this.field_l) && this.field_n.a(-80)) {
                  if (param0.field_X == -50) {
                    this.a(16, (byte) -36);
                    return;
                  }
                  this.a(9, (byte) -36);
                  return;
                }
                if (var7 > 0) {
                  if (-50 == param0.field_X) {
                    this.a(3, (byte) -36);
                  } else {
                    if (!this.field_y) {
                      this.a(6, (byte) -36);
                    } else {
                      this.a(4, (byte) -36);
                    }
                  }
                } else {
                  if (var4 != 0) {
                    if ((var6 <= 0 ||
                      (1 & param0.field_C) == 0) &&
                      (var6 >= 0 ||
                      0 == (param0.field_C & 2))) {
                      if (this.field_y) {
                        this.a(4, (byte) -36);
                        return;
                      }
                      this.a(0, (byte) -36);
                      return;
                    }
                    if (this.field_l < 0 ||
                      this.field_l == 0 ||
                      !(na.field_o[this.field_l] > this.field_g)) {
                      gm.a(9, (byte) -55);
                    }
                    this.a(1, (byte) -36);
                  } else {
                    if (param0.field_X == -50) {
                      this.a(12, (byte) -36);
                    } else {
                      if (!this.field_y) {
                        this.a(0, (byte) -36);
                      } else {
                        this.a(4, (byte) -36);
                      }
                    }
                  }
                }
              }
              return;
            }
            this.a(23, (byte) -36);
            this.field_h = vl.field_a[11][this.field_m];
            return;
          }
          mn.b(6, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_178_0 = var3;
          stackIn_178_1 = new StringBuilder().append("hb.U(");
          if (param0 == null) {
            stackIn_179_2 = "null";
          } else {
            stackIn_179_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_178_0), ((StringBuilder) (Object) stackIn_178_1).append(stackIn_179_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(boolean param0) {
        int var2_int = 0;
        int[] var2;
        int[] var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (this.field_h != null &&
          this.field_r) {
          this.field_r = false;
          this.field_B.field_z = 0;
          this.field_B.field_G = 0;
          if (this.field_B.field_o != null) {
            for (var2_int = this.field_B.field_o.length - 1; var2_int >= 0; var2_int--) {
              this.field_B.field_o[var2_int] = (byte) 0;
            }
          }
          this.field_B.a(this.field_h, false, false, true, false);
          var2 = this.field_B.field_d;
          var3 = this.field_B.field_q;
          if (this.field_y &&
            this.field_l != 17 &&
            this.field_l != 18 &&
            4 != this.field_l) {
            this.field_u.a(this.field_B, -875079928);
          }
          this.field_B.field_q = var3;
          this.field_B.field_d = var2;
          this.field_n.a(this.field_B, -875079928);
          this.field_B.field_d = var2;
          this.field_B.field_q = var3;
          mj.a(this.field_w, this.field_z, this.field_E, this.field_s, nf.field_q, (byte) -81, this.field_x);
          qq.a(nf.field_q, 3, eb.field_f, 3, 9);
          if (this.field_l == 5 ||
            this.field_l == 13) {
            eb.field_f[7] = 65535;
            eb.field_f[5] = 0;
            eb.field_f[6] = 0;
            eb.field_f[9] = 0;
            eb.field_f[11] = 65535;
            eb.field_f[8] = 0;
            eb.field_f[10] = 0;
            eb.field_f[4] = 0;
            eb.field_f[3] = 65535;
          }
          this.field_B.a(eb.field_f);
          this.field_t = new lg(this.field_B, true, true, param0, true);
          return;
        }
    }

    final int a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_w - param0;
        int var6 = -param1 + this.field_z;
        int var7 = -param3 + (-80 + this.field_x);
        if (param2 != 0) {
          hb.c(123);
        }
        int var8 = -20000 + (var6 * var6 + var5 * var5) + var7 * var7;
        return var8;
    }

    final int a(int param0) {
        if (param0 != 5) {
          return 52;
        }
        return this.field_x;
    }

    final void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        wo var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_t == null) {
            return;
          }
          if (this.field_t.field_z <= param3.length) {
            for (var6_int = 0; this.field_t.field_z > var6_int; var6_int++) {
              if (this.field_t.field_o[var6_int] >= 0) {
                this.field_t.field_o[var6_int] = param3[var6_int];
              }
            }
          }
          this.a(false, param1, param2, param4);
          if (param0 != -30) {
            var8 = (wo) null;
            this.a((wo) null, (byte) 88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("hb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    final void d(int param0) {
        this.field_g = 0;
        int var2 = -37 / ((-83 - param0) / 40);
        this.field_n.a(ap.field_b[0], (byte) 75);
        this.field_f = false;
        this.field_l = 0;
        this.field_v = 0;
    }

    hb() {
        this.field_B = new lg(4096, 4096, 0, true, true, true, false, false);
        this.field_n = new wg();
        this.field_u = new wg();
        this.field_u.a(ap.field_b[27], (byte) 87);
        this.field_l = -1;
        this.a(0, (byte) -36);
    }

    static {
        field_o = "To server list";
    }
}
