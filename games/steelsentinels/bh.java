/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static String field_i;
    int field_k;
    private int field_d;
    boolean field_r;
    int field_q;
    private boolean field_h;
    private int field_a;
    boolean field_j;
    private int field_l;
    static String field_o;
    private int field_e;
    private int field_m;
    int field_b;
    int field_g;
    private mb field_c;
    int field_n;
    private int field_p;
    static boolean field_f;

    public static void a(byte param0) {
        if (param0 > -69) {
          bh.a((byte) 39, true);
        }
        field_o = null;
        field_i = null;
    }

    final void a(byte param0, int param1, int param2, int param3, boolean param4, int param5) {
        int[] var9 = null;
        if (param0 >= -11) {
          je var10 = (je) null;
          this.a((je) null, false, -87);
        }
        int var7 = param2 + (this.field_g >> 8);
        int var8 = param5 + (this.field_q - this.field_c.field_Db * 8 >> 8);
        this.field_k = this.field_k + 1;
        if (this.field_k >= 16) {
          this.field_k = this.field_k - 16;
          var9 = pe.field_o;
          if ((255 & this.field_n >> 16) > (this.field_n & 255)) {
            var9 = pe.field_b;
            if (this.field_n >> 8 == this.field_n >> 16) {
              var9 = pe.field_q;
            }
          }
          pb.a(var7 << 4, var8 << 4, param1, var9.length - 1, var9);
          if (param4 &&
            hd.field_a < f.field_w.length) {
            f.field_w[hd.field_a] = var7;
            nj.field_U[hd.field_a] = var8;
            hd.field_a = hd.field_a + 1;
          }
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        Object var5Lifetime1;
        Object var5Lifetime2;
        if (param2 != -49) {
          return;
        }
        if (null != kc.field_y) {
          var3 = kc.field_y.a(-2, param1);
          if (0 != var3) {
            if (2 == var3 &&
              kc.field_y.field_S != null &&
              !kc.field_y.field_S.equals("")) {
              if (91 == kc.field_y.field_S.charAt(0)) {
                var4 = kc.field_y.field_S;
                var5 = var4;
                var5Lifetime2 = var4;
              } else {
                var7 = (CharSequence) ((Object) kc.field_y.field_S);
                var4 = ui.a(1, var7);
              }
              var5Lifetime1 = null;
              if (ol.field_bc == 0) {
                var5Lifetime1 = lj.a(var4, (byte) -79, param0);
              }
              if (ol.field_bc == 1) {
                var5Lifetime1 = nl.a(var4, param0, true);
              }
              if (ol.field_bc == 2) {
                var5Lifetime1 = dd.a(param0, (byte) 55, var4);
              }
              if (3 == ol.field_bc) {
                var5Lifetime1 = rn.a(var4, param0, var4, true);
              }
              if (var5Lifetime1 != null) {
                var6 = (String) null;
                sj.a((String) null, (String) (var5Lifetime1), 0, (byte) 21, var4, 2);
              }
              ol.field_bc = -1;
              kc.field_y = null;
            } else {
              ol.field_bc = -1;
              kc.field_y = null;
            }
          }
        }
    }

    private final void a(boolean param0, je param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          var3_int = param1.field_u - this.field_g >> 4;
          var4 = -this.field_q + param1.field_y >> 4;
          if (!param0) {
            return;
          }
          var5 = ik.a(var4 * var4 + var3_int * var3_int, -1);
          if (var5 > 0) {
            var6 = 32 * this.field_c.field_Fb;
            if (5 > this.field_c.field_Fb) {
              var6 = 16 * this.field_c.field_cb;
            }
            if (var6 > 640) {
              var6 = 640;
            }
            if (this.field_j) {
              if (this.field_c.field_cb >= 15) {
                stackIn_13_0 = 15;
              } else {
                stackIn_13_0 = this.field_c.field_cb;
              }
              var6 = stackIn_13_0 * 32;
            }
            if (this.field_r &&
              this.field_c.field_Fb * 32 > var6) {
              var6 = 32 * this.field_c.field_Fb;
            }
            if (var5 / 2 < var6) {
              var6 = var5 / 2;
            }
            this.field_m = var6 * var4 / var5;
            this.field_d = 0;
            this.field_l = var6 * var3_int / var5;
            this.field_r = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("bh.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        int var1 = di.field_g;
        if (10 != var1) {
          if (var1 == -1) {
            return false;
          }
          return true;
        }
        return 0 == ge.field_j ? true : false;
    }

    final je a(je param0, boolean param1, int param2) {
        int stackIn_18_0 = 0;
        hd stackIn_18_1 = null;
        boolean stackIn_19_2 = false;
        int stackIn_106_0 = 0;
        hd stackIn_130_0 = null;
        boolean stackIn_131_1 = false;
        int stackIn_145_0 = 0;
        boolean stackIn_152_1 = false;
        int stackIn_189_0 = 0;
        hd stackIn_189_1 = null;
        boolean stackIn_190_2 = false;
        int stackIn_200_1 = 0;
        int stackIn_204_1 = 0;
        Object stackIn_209_0;
        int stackIn_209_1;
        int stackIn_209_2;
        int[] stackIn_209_3;
        Object stackIn_210_0;
        int stackIn_210_4;
        boolean stackIn_224_1 = false;
        Object stackIn_229_0 = null;
        Object stackIn_232_0 = null;
        StringBuilder stackIn_232_1 = null;
        String stackIn_233_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4 = null;
        int var5 = 0;
        int var6_int = 0;
        je var6 = null;
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
        int var18 = 0;
        ee var19 = null;
        je var6Lifetime1;
        je var6Lifetime2;
        int var7Lifetime1;
        var18 = SteelSentinels.field_G;
        try {
          var4 = null;
          if (this.field_q < -120000 &&
            this.field_m < 0) {
            this.field_m = this.field_m * 15 / 16;
          }
          if ((this.field_c.field_xc.field_ab.b(48) != 4 ||
            (this.field_c.field_xc.field_r & 1) == 0) &&
            this.field_p >= 0) {
            this.field_p = this.field_p + 1;
          }
          var5 = this.field_g;
          this.field_g = this.field_g + this.field_l;
          if (!param1) {
            this.field_m = 127;
          }
          this.field_q = this.field_q + this.field_m;
          if (this.field_r &&
            this.field_m < 0) {
            this.field_m = 0;
          }
          if (this.field_r &&
            this.field_c.field_xc.field_ab.b(91) != 4) {
            stackIn_18_0 = -50000;
            stackIn_18_1 = this.field_c.field_xc.field_ab;
            stackIn_19_2 = !(param1);
            var6_int = stackIn_18_0 + (-((hd) (Object) stackIn_18_1).a(stackIn_19_2, this.field_g >> 4) << 4);
            if (this.field_q > var6_int &&
              this.field_m > 100) {
              this.field_m = this.field_m - 25;
              if (this.field_m < 500) {
                this.field_m = 500;
              }
              if (this.field_p > 0) {
                this.field_p = -this.field_p;
              }
            }
          }
          var6 = (je) (this.field_c.field_B.e(13058));
          while (var6 != null) {
            boolean decompiledFrameRemainder0 = true;
            if ((!this.field_r ||
              var6.field_s == 6 ||
              this.field_r &&
              var6.field_s == 3 &&
              this.field_p < 0) && param2 == var6.field_x) {
              if (var6.field_s == 3) {
                if (!this.field_j ||
                  !(this.field_c.field_cb <= 0) ||
                  !(this.field_c.field_Fb <= 0) &&
                  this.field_r) {
                  if (!this.field_j) {
                    this.field_d = 0;
                  } else {
                    this.a(true, var6);
                    this.field_r = false;
                  }
                }
                var4 = var6;
              } else {
                if (var6.field_s == 0) {
                  if (var6.field_u > this.field_g) {
                    this.field_b = 1;
                  } else {
                    this.field_b = -1;
                  }
                  var4 = var6;
                } else {
                  if ((6 == var6.field_s)) {
                    var7 = this.field_d;
                    this.field_d = var6.field_A;
                    if (0 > this.field_d ||
                      this.field_d > 1) {
                      this.field_d = -1;
                    }
                    if ((var7 != this.field_d)) {
                      this.field_a = 0;
                    }
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!this.field_r &&
                -100 + var6.field_r + ka.field_G[o.a((byte) 84, this.field_c.field_Zb.field_N)][25][2] == -1 + param2 &&
                var6.field_s == 3 &&
                !this.field_j) {
                this.field_a = 0;
                this.a(param1, var6);
              }
            }
            var6 = (je) (this.field_c.field_B.a((byte) -59));
          }
          var6Lifetime1 = (je) (this.field_c.field_Ec.e(13058));
          while (var6Lifetime1 != null) {
            if (!this.field_r &&
              var6Lifetime1.field_x == param2) {
              if (var6Lifetime1.field_s == 3) {
                var4 = var6Lifetime1;
                if (!this.field_j ||
                  !(0 >= this.field_c.field_cb)) {
                  if (this.field_j) {
                    this.a(true, var6Lifetime1);
                  } else {
                    this.field_d = 0;
                  }
                }
              } else if (0 != var6Lifetime1.field_s) {
                if (6 == var6Lifetime1.field_s) {
                  this.field_d = var6Lifetime1.field_A;
                }
              } else {
                var4 = var6Lifetime1;
                if (this.field_g < var6Lifetime1.field_u) {
                  this.field_b = 1;
                } else {
                  this.field_b = -1;
                }
              }
            } else {
              if (!this.field_r &&
                var6Lifetime1.field_r - 100 + ka.field_G[o.a((byte) 84, this.field_c.field_Zb.field_N)][25][2] == param2 - 1 &&
                3 == var6Lifetime1.field_s) {
                if (this.field_j) {
                  var6Lifetime1 = (je) (this.field_c.field_Ec.a((byte) -45));
                  continue;
                }
                this.field_a = 0;
                this.a(true, var6Lifetime1);
              }
            }
            var6Lifetime1 = (je) (this.field_c.field_Ec.a((byte) -45));
          }
          var6Lifetime2 = (je) (this.field_c.field_B.e(13058));
          while (var6Lifetime2 != null) {
            if (~param2 == ~var6Lifetime2.field_x &&
              var6Lifetime2.field_s == 0) {
              if (var6Lifetime2.field_u <= this.field_g) {
                this.field_b = -1;
              } else {
                this.field_b = 1;
              }
              if (this.field_d != 0 &&
                this.field_b != this.field_d) {
                this.field_d = 0;
              }
            }
            var6Lifetime2 = (je) (this.field_c.field_B.a((byte) -46));
          }
          if (param0 != null) {
            stackIn_106_0 = ~param0.field_x;
            if (stackIn_106_0 == ~param2) {
              if (param0.field_s == 3) {
                if (!this.field_j ||
                  !(0 >= this.field_c.field_cb) ||
                  this.field_r) {
                  this.a(true, param0);
                }
              } else {
                if (param0.field_s == 0) {
                  if (param0.field_u > this.field_g) {
                    this.field_b = 1;
                  } else {
                    this.field_b = -1;
                  }
                  var4 = param0;
                  if (sn.field_n) {
                    sn.field_n = false;
                    pm.field_db.g(6);
                    this.a(param0, (byte) 43);
                  }
                } else {
                  if (param0.field_s != 0) {
                    cf.field_q = -1;
                    l.field_g = -1;
                  } else {
                    if (this.field_g < param0.field_u) {
                      this.field_b = 1;
                    } else {
                      this.field_b = -1;
                    }
                    var4 = param0;
                    if (sn.field_n) {
                      sn.field_n = false;
                      this.a(param0, (byte) 35);
                    }
                  }
                }
              }
              var4 = param0;
            }
          }
          var19 = this.field_c.field_xc;
          var7Lifetime1 = var19.field_ab.a((byte) -119, this.field_g >> 4) << 4;
          stackIn_130_0 = var19.field_ab;
          stackIn_131_1 = !(param1);
          var8 = ((hd) (Object) stackIn_130_0).a(stackIn_131_1, this.field_g >> 4) << 4;
          var9 = var19.field_ab.b((byte) 124, this.field_g >> 4) << 4;
          var10 = var7Lifetime1;
          if (!this.field_h &&
            var8 != var9) {
            var10 = var8;
          }
          var11 = -this.field_q;
          if (var11 + 4000 < var10 &&
            !this.field_h) {
            this.field_g = var5;
            this.field_l = 0;
          }
          if (this.field_m >= 0) {
            stackIn_145_0 = (var11 <= var10) ? 1 : 0;
          } else {
            stackIn_145_0 = 0;
          }
          var12 = stackIn_145_0;
          if (var12 != 0) {
            if (Math.abs(this.field_m) > Math.abs(this.field_l)) {
              this.field_l = 0;
            } else {
              if (this.field_c.i(28, -27)) {
                this.field_l = this.field_l * 7 / 10;
              } else {
                if (this.field_l < 0) {
                  this.field_l = -(9 * -this.field_l / 10);
                }
                if (this.field_l > 0) {
                  this.field_l = this.field_l * 9 / 10;
                }
              }
            }
            if (!var19.field_j) {
              if (this.field_d != 0 &&
                !this.field_h) {
                stackIn_189_0 = 250;
                stackIn_189_1 = var19.field_ab;
                stackIn_190_2 = !(param1);
                if (stackIn_189_0 < ((hd) (Object) stackIn_189_1).a(stackIn_190_2, this.field_d * 10 + (this.field_g >> 4)) + (this.field_q >> 4)) {
                  this.field_d = 0;
                }
              }
              if (this.field_d != 0) {
                this.field_b = this.field_d;
                if (this.field_a > 0) {
                  this.field_a = this.field_a - 1;
                }
                if (this.field_h) {
                  if (var19.field_ab.a((byte) -106, (this.field_g >> 4) + this.field_b * 10) <= 5 + (-this.field_q >> 4)) {
                    stackIn_204_1 = this.field_a;
                  } else {
                    stackIn_204_1 = 50;
                  }
                  this.field_a = stackIn_204_1;
                } else {
                  if (var19.field_ab.a(false, (this.field_g >> 4) + 10 * this.field_b) > (-this.field_q >> 4) + 5) {
                    stackIn_200_1 = 50;
                  } else {
                    stackIn_200_1 = this.field_a;
                  }
                  this.field_a = stackIn_200_1;
                }
                if (39 != this.field_c.field_rc) {
                  stackIn_209_0 = this;
                  stackIn_209_1 = this.field_g;
                  stackIn_209_2 = this.field_b;
                  stackIn_209_3 = ka.field_G[o.a((byte) 84, this.field_c.field_Zb.field_N)][25];
                  if (0 == this.field_a) {
                    stackIn_210_0 = this;
                    stackIn_210_4 = 0;
                  } else {
                    stackIn_210_0 = this;
                    stackIn_210_4 = 5;
                  }
                  this.field_g = stackIn_209_1 + stackIn_209_2 * (stackIn_209_3[stackIn_210_4] * 3);
                } else {
                  this.field_g = this.field_g + 500 * this.field_b;
                }
              }
            }
            var13 = -var19.field_ab.a((byte) -113, this.field_g >> 4) << 4;
            var14 = -var19.field_ab.b((byte) 122, this.field_g >> 4) << 4;
            var15 = -var19.field_ab.a(false, this.field_g >> 4) << 4;
            var16 = var13;
            if (!this.field_h &&
              var14 != var15) {
              var16 = var15;
            }
            var12 = 0;
            var17 = 1024;
            if (this.field_q - var16 <= 4000) {
              if (var16 - var17 <= this.field_q) {
                var12 = 1;
                this.field_q = var16;
              }
            } else {
              this.field_g = var5;
              this.field_l = 0;
            }
            stackIn_224_1 = (var13 != var15) && (var15 < this.field_q);
            this.field_h = stackIn_224_1;
            if (var12 != 0) {
              this.field_m = 0;
            } else {
              this.field_l = this.field_b * this.field_e;
              this.field_m = this.field_m + var19.field_z;
            }
            this.field_j = false;
            this.field_r = false;
          } else {
            this.field_m = this.field_m + var19.field_z;
            if (this.field_r) {
              this.field_m = this.field_m - var19.field_z * 3 / 4;
            }
            this.field_a = 0;
            this.field_j = true;
            var13 = -var19.field_ab.a((byte) -103, this.field_g >> 4) << 4;
            var14 = -var19.field_ab.a(false, this.field_g >> 4) << 4;
            var15 = -var19.field_ab.b((byte) 125, this.field_g >> 4) << 4;
            stackIn_152_1 = (var14 != var13) && (var14 < this.field_q);
            this.field_h = stackIn_152_1;
            if (this.field_h) {
              if (var15 != var14) {
                if (var15 > this.field_q) {
                  this.field_h = false;
                  this.field_q = var14;
                } else {
                  var15 = var15 + (this.field_c.field_Db << 4);
                  if (this.field_q < var15 &&
                    var19.b(this.field_g, -5)) {
                    if (var19.field_ab.a(false, var5 >> 4) == var19.field_ab.b((byte) 119, var5 >> 4)) {
                      this.field_m = this.field_m / 2;
                      this.field_l = -this.field_l / 2;
                      this.field_g = var5;
                    } else {
                      if (this.field_m < 0) {
                        this.field_m = -this.field_m / 2;
                      }
                      this.field_q = var15;
                    }
                  }
                }
              }
              if (this.field_q > var13) {
                this.field_q = var13;
              }
            } else {
              if (var14 == var15) {
                if (var13 < this.field_q) {
                  this.field_l = this.field_l / 2;
                  this.field_m = this.field_m - 5;
                  this.field_q = var13;
                }
              } else {
                if (var14 < this.field_q) {
                  this.field_m = this.field_m - 5;
                  this.field_q = var14;
                  this.field_l = this.field_l / 2;
                }
              }
            }
          }
          stackIn_229_0 = var4;
          return (je) (stackIn_229_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_232_0 = var4;
          stackIn_232_1 = new StringBuilder().append("bh.H(");
          if (param0 == null) {
            stackIn_233_2 = "null";
          } else {
            stackIn_233_2 = "{...}";
          }
          throw ci.a((Throwable) (stackIn_232_0), ((StringBuilder) (Object) stackIn_232_1).append(stackIn_233_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(je param0, byte param1) {
        nk[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        nk[] var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = SteelSentinels.field_G;
        try {
          if (this.field_g >= param0.field_u) {
            this.field_b = -1;
          } else {
            this.field_b = 1;
          }
          if (this.field_c.field_Zb == null) {
            return;
          }
          if (param1 <= 0) {
            this.field_c = (mb) null;
          }
          var6 = this.field_c.field_Zb.a(0, this.field_c, new nk[]{}, this.field_b * param0.field_B, param0.field_A);
          var3 = var6;
          this.field_c.field_Zb.a(param0.field_B * this.field_b, -86, param0.field_A);
          this.field_c.field_Zb.b((byte) -128, this.field_g, this.field_b, this.field_q);
          var4 = 0;
          while (var4 < var6.length) {
            this.a(true, var6[var4], param0);
            var4 = var6.length;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("bh.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        if (kc.field_y != null) {
          kc.field_y.a(param1, (byte) 127);
        }
        if (param0 != -115) {
          field_o = (String) null;
        }
    }

    final wl a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        wl stackIn_147_0 = null;
        mb stackIn_148_1 = null;
        int var8;
        int var9;
        int var10;
        double var11_double;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19_int;
        wl var19;
        int var20;
        int var21;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var21 = SteelSentinels.field_G;
        if ((18 == param0 ||
          param0 == 29 ||
          param0 == 43 ||
          param0 == 21 ||
          34 == param0 ||
          47 == param0 ||
          param0 == 52) && this.field_c.field_Vb != null) {
          param2 = this.field_c.field_Vb.field_hc;
          param6 = -(this.field_c.field_Vb.field_Db << 3) + this.field_c.field_Vb.field_Gb;
          var9 = param2 - this.field_g;
          var10 = -param4 + param6;
          if (var9 >= 0) {
            this.field_b = 1;
          } else {
            this.field_b = -1;
          }
          if (this.field_b != this.field_d) {
            this.field_d = 0;
          }
          var11_double = Math.atan2((double)var9, (double)(-var10));
          param3 = (int)(65536.0 * var11_double / 6.283185307179586);
          if (0 <= this.field_b) {
            if (param3 < -16384) {
              param3 = param3 + 65536;
            }
          } else {
            if (param3 > 16384) {
              param3 = param3 - 65536;
            }
          }
        }
        var8 = 2;
        var9Lifetime1 = -this.field_g + param2;
        if (var9Lifetime1 < 0) {
          this.field_b = -1;
        } else {
          this.field_b = 1;
        }
        var10Lifetime1 = param6 - this.field_q;
        if (this.field_b != this.field_d) {
          this.field_d = 0;
        }
        var11 = 0;
        var11Lifetime1 = param5;
        var12 = 0;
        if (param0 == 17) {
          var8 = 5;
        }
        var12Lifetime1 = param4;
        if (18 == param0) {
          var8 = 0;
        }
        if (param0 == 19) {
          var8 = 1;
        }
        if (param0 == 20) {
          var8 = 6;
        }
        if (21 == param0) {
          var8 = 4;
        }
        if (22 == param0) {
          var8 = 7;
        }
        if (23 == param0) {
          var8 = 3;
        }
        if (param0 == 24) {
          var8 = 2;
        }
        if (param0 == 25) {
          var8 = 2;
        }
        if (26 == param0) {
          var8 = 2;
        }
        if (param0 == 27) {
          var8 = 4;
        }
        if (param0 == 38) {
          var8 = 4;
        }
        if (param0 == 28) {
          var8 = 5;
        }
        if (param0 == 29) {
          var8 = 0;
        }
        if (param0 == 30) {
          var8 = 1;
        }
        if (param0 == 31) {
          var8 = 1;
        }
        if (param0 == 32) {
          var8 = 1;
        }
        if (param0 == 33) {
          var8 = 6;
        }
        if (param0 == 34) {
          var8 = 4;
        }
        if (35 == param0) {
          var8 = 7;
        }
        if (param0 == 36) {
          var8 = 2;
        }
        if (param0 == 37) {
          var8 = 2;
        }
        if (param0 == 46) {
          var8 = 6;
        }
        if (param0 == 43) {
          var8 = 0;
        }
        if (param0 == 44) {
          var8 = 1;
        }
        if (param0 == 47) {
          var8 = 4;
        }
        if (param0 == 45) {
          var8 = 1;
        }
        if (48 == param0) {
          var8 = 7;
        }
        if (param0 == 52) {
          var8 = 4;
        }
        if (param0 == 51) {
          var8 = 3;
        }
        if (param0 == 50) {
          var8 = 2;
        }
        if (param0 == 49) {
          var8 = 2;
        }
        var13 = (int)(10.0 * Math.sqrt((double)(var9Lifetime1 / 100 * var9Lifetime1 + var10Lifetime1 / 100 * var10Lifetime1)));
        var14 = 192;
        var15 = 0;
        var16 = 4;
        var17 = 45;
        if (param0 == 18) {
          var17 -= 20;
        }
        if (param0 == 29) {
          var17 -= 10;
        }
        if (param1 <= 18) {
          this.a((byte) 116, 50, 70, -127, false, -106);
        }
        if (param0 == 43) {
          var17 -= 5;
        }
        var18 = 1;
        if (var8 == 5) {
          var15 = 7;
          var17 = 45;
        }
        if (var8 == 1) {
          var15 = 1;
          var14 = 256;
          var17 = 5000;
          var16 = 0;
          var18 = 32;
          if (param0 != 19) {
            if (param0 == 31 ||
              param0 == 45) {
              var14 = cl.a(param3, 48);
            }
          } else {
            var15 = 20;
          }
        }
        if (var8 == 7) {
          var17 = 5000;
          var16 = 0;
          var18 = 250;
          var15 = 6;
          var14 = 192;
        }
        if (var8 == 2) {
          var14 = 16;
          var17 = 5000;
          var16 = 0;
          var15 = 2;
          var18 = 250;
        }
        if (var8 == 3) {
          var17 = 5000;
          var15 = 3;
          var18 = 250;
          var16 = 20;
          var14 = 16;
        }
        if (var8 == 4) {
          var17 = 5;
          var18 = 1;
          var16 = 32;
          var15 = 4;
          var14 = 256;
        }
        var9Lifetime2 = jh.a(param3 >> 3, 4096) * 100 >> 16;
        if (var13 < 1) {
          var13 = 1;
        }
        if (6 == var8) {
          var16 = 32;
          var15 = 5;
          var14 = 512;
          var17 = 5;
          var18 = 1;
        }
        var10Lifetime2 = -kg.a(param3 >> 3, (byte) -101) * 100 >> 16;
        var13Lifetime1 = 100;
        if (null != ie.field_f[param0 - 17]) {
          var19_int = ie.field_f[param0 - 17][0];
          var20 = ie.field_f[param0 - 17][1];
          var12Lifetime1 = var12Lifetime1 - var20 * (var10Lifetime2 * 32) / var13Lifetime1;
          var11Lifetime1 = var11Lifetime1 - var20 * (var9Lifetime2 * 32) / var13Lifetime1;
          var12Lifetime1 = var12Lifetime1 + 32 * (this.field_b * var9Lifetime2) * var19_int / var13Lifetime1;
          var11Lifetime1 = var11Lifetime1 - 32 * (this.field_b * var10Lifetime2 * var19_int) / var13Lifetime1;
        }
        var19 = new wl(var11Lifetime1, var12Lifetime1, var14 * var9Lifetime2 / var13Lifetime1, var14 * var10Lifetime2 / var13Lifetime1, var17, var16, var15, this.field_c.field_xc, this.field_c, 0, var18, param0 - 17);
        var19.field_K = var11Lifetime1 + var9Lifetime2 * 100;
        var19.field_S = 100 * var10Lifetime2 + var12Lifetime1;
        if (var8 == 3) {
          var19.field_S = param6;
          var19.field_K = param2;
        }
        stackIn_147_0 = var19;
        if (var19.field_X != null) {
          stackIn_148_1 = var19.field_X.field_Vb;
        } else {
          stackIn_148_1 = null;
        }
        stackIn_147_0.field_nb = stackIn_148_1;
        var19.field_fb = null;
        var19.field_V = true;
        var19.field_I = true;
        return var19;
    }

    private final void a(boolean param0, nk param1, je param2) {
        wl stackIn_151_0 = null;
        mb stackIn_152_1 = null;
        wl stackIn_154_0 = null;
        boolean stackIn_155_1 = false;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        String stackIn_162_2 = null;
        StringBuilder stackIn_164_1 = null;
        String stackIn_165_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7_double = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        wl var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var17 = SteelSentinels.field_G;
        try {
          if ((param1.field_N == 18 ||
            param1.field_N == 29 ||
            param1.field_N == 43 ||
            param1.field_N == 21 ||
            param1.field_N == 34 ||
            param1.field_N == 47 ||
            param1.field_N == 52) &&
            null != this.field_c.field_Vb) {
            param2.field_u = this.field_c.field_Vb.field_hc;
            param2.field_y = -(this.field_c.field_Vb.field_Db << 3) + this.field_c.field_Vb.field_Gb;
            var5 = -this.field_g + param2.field_u;
            var6 = -param1.field_V + param2.field_y;
            if (0 > var5) {
              this.field_b = -1;
            } else {
              this.field_b = 1;
            }
            if (this.field_b != this.field_d) {
              this.field_d = 0;
            }
            var7_double = Math.atan2((double)var5, (double)(-var6));
            param2.field_B = (int)(var7_double * 65536.0 / 6.283185307179586);
            if (this.field_b < 0) {
              if (param2.field_B > 16384) {
                param2.field_B = param2.field_B - 65536;
              }
            } else {
              if (param2.field_B < -16384) {
                param2.field_B = param2.field_B + 65536;
              }
            }
            if (param1.field_K > this.field_b * param2.field_B) {
              param2.field_B = this.field_b * param1.field_K;
            }
            if (param1.field_W < param2.field_B * this.field_b) {
              param2.field_B = this.field_b * param1.field_W;
            }
          }
          var4_int = 2;
          var5Lifetime1 = -this.field_g + param2.field_u;
          var6Lifetime1 = param2.field_y - this.field_q;
          if (var5Lifetime1 >= 0) {
            this.field_b = 1;
          } else {
            this.field_b = -1;
          }
          if (this.field_b != this.field_d) {
            this.field_d = 0;
          }
          var7 = 0;
          var8 = 0;
          if (param1 == null) {
            return;
          }
          if (param1.field_N == 17) {
            var4_int = 5;
          }
          var8Lifetime1 = param1.field_V;
          var7Lifetime1 = param1.field_T;
          if (param1.field_N == 18) {
            var4_int = 0;
          }
          if (19 == param1.field_N) {
            var4_int = 1;
          }
          if (param1.field_N == 20) {
            var4_int = 6;
          }
          if (param1.field_N == 21) {
            var4_int = 4;
          }
          if (param1.field_N == 22) {
            var4_int = 7;
          }
          if (param1.field_N == 23) {
            var4_int = 3;
          }
          if (param1.field_N == 24) {
            var4_int = 2;
          }
          if (param1.field_N == 25) {
            var4_int = 2;
          }
          if (param1.field_N == 26) {
            var4_int = 2;
          }
          if (param1.field_N == 27) {
            var4_int = 4;
          }
          if (38 == param1.field_N) {
            var4_int = 4;
          }
          if (param1.field_N == 28) {
            var4_int = 5;
          }
          if (29 == param1.field_N) {
            var4_int = 0;
          }
          if (param1.field_N == 30) {
            var4_int = 1;
          }
          if (param1.field_N == 31) {
            var4_int = 1;
          }
          if (32 == param1.field_N) {
            var4_int = 1;
          }
          if (param1.field_N == 33) {
            var4_int = 6;
          }
          if (param1.field_N == 34) {
            var4_int = 4;
          }
          if (35 == param1.field_N) {
            var4_int = 7;
          }
          if (param1.field_N == 36) {
            var4_int = 2;
          }
          if (param1.field_N == 37) {
            var4_int = 2;
          }
          if (param1.field_N == 46) {
            var4_int = 6;
          }
          if (param1.field_N == 43) {
            var4_int = 0;
          }
          if (param1.field_N == 44) {
            var4_int = 1;
          }
          if (param1.field_N == 47) {
            var4_int = 4;
          }
          if (param1.field_N == 45) {
            var4_int = 1;
          }
          if (48 == param1.field_N) {
            var4_int = 7;
          }
          if (param1.field_N == 52) {
            var4_int = 4;
          }
          if (param1.field_N == 51) {
            var4_int = 3;
          }
          if (param1.field_N == 50) {
            var4_int = 2;
          }
          if (param1.field_N == 49) {
            var4_int = 2;
          }
          var9 = 10 * (int)Math.sqrt((double)(var6Lifetime1 / 100 * var6Lifetime1 + var5Lifetime1 / 100 * var5Lifetime1));
          var10 = 192;
          var11 = 0;
          var12 = 4;
          var13 = 45;
          if (18 == param1.field_N) {
            var13 -= 20;
          }
          if (param1.field_N == 29) {
            var13 -= 10;
          }
          if (param1.field_N == 43) {
            var13 -= 5;
          }
          var14 = 1;
          if (var4_int == 5) {
            var13 = 45;
            var11 = 7;
          }
          if (var4_int == 1) {
            var10 = 256;
            var11 = 1;
            var12 = 0;
            if (param1.field_N == 19) {
              var11 = 20;
            } else {
              if (param1.field_N == 31 ||
                param1.field_N == 45) {
                var10 = cl.a(param2.field_B, -127);
              }
            }
            var13 = 5000;
            var14 = 32;
          }
          if (7 == var4_int) {
            var14 = 250;
            var11 = 6;
            var12 = 0;
            var10 = 192;
            var13 = 5000;
          }
          if (var4_int == 2) {
            var12 = 0;
            var14 = 250;
            var13 = 5000;
            var11 = 2;
            var10 = 16;
          }
          if (var4_int == 3) {
            var13 = 5000;
            var14 = 250;
            var11 = 3;
            var12 = 20;
            var10 = 16;
          }
          if (4 == var4_int) {
            var13 = 5;
            var14 = 1;
            var10 = 256;
            var12 = 32;
            var11 = 4;
          }
          if (1 > var9) {
            var9 = 1;
          }
          var5Lifetime2 = jh.a(param2.field_B >> 3, 4096) * 100 >> 16;
          if (var4_int == 6) {
            var12 = 32;
            var10 = 512;
            var11 = 5;
            var13 = 5;
            var14 = 1;
          }
          var6Lifetime2 = -kg.a(param2.field_B >> 3, (byte) -87) * 100 >> 16;
          var9Lifetime1 = 100;
          if (null != ie.field_f[-17 + param1.field_N]) {
            var15_int = -param1.field_G + ie.field_f[param1.field_N - 17][0];
            var16 = ie.field_f[-17 + param1.field_N][1] - param1.field_E;
            var7Lifetime1 = var7Lifetime1 - var16 * var5Lifetime2 * 32 / var9Lifetime1;
            var8Lifetime1 = var8Lifetime1 - var16 * (var6Lifetime2 * 32) / var9Lifetime1;
            var8Lifetime1 = var8Lifetime1 + 32 * (this.field_b * var15_int * var5Lifetime2) / var9Lifetime1;
            var7Lifetime1 = var7Lifetime1 - 32 * var15_int * var6Lifetime2 * this.field_b / var9Lifetime1;
          }
          var15 = new wl(var7Lifetime1, var8Lifetime1, var10 * var5Lifetime2 / var9Lifetime1, var6Lifetime2 * var10 / var9Lifetime1, var13, var12, var11, this.field_c.field_xc, this.field_c, 0, var14, param1.field_N - 17);
          var15.field_S = 100 * var6Lifetime2 + var8Lifetime1;
          var15.field_K = var5Lifetime2 * 100 + var7Lifetime1;
          stackIn_151_0 = var15;
          if (var15.field_X != null) {
            stackIn_152_1 = var15.field_X.field_Vb;
          } else {
            stackIn_152_1 = null;
          }
          stackIn_151_0.field_nb = stackIn_152_1;
          var15.field_fb = null;
          stackIn_154_0 = var15;
          stackIn_155_1 = (param0);
          stackIn_154_0.field_V = stackIn_155_1;
          if (var4_int == 3) {
            var15.field_S = param2.field_y;
            var15.field_K = param2.field_u;
          }
          pm.field_db.a(3, var15);
          cf.field_q = var15.field_A - this.field_q;
          l.field_g = -this.field_g + var15.field_U;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_161_0 = var4;
          stackIn_161_1 = new StringBuilder().append("bh.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_162_2 = "null";
          } else {
            stackIn_162_2 = "{...}";
          }
          stackIn_164_1 = ((StringBuilder) (Object) stackIn_161_1).append(stackIn_162_2).append(',');
          if (param2 == null) {
            stackIn_165_2 = "null";
          } else {
            stackIn_165_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_161_0), ((StringBuilder) (Object) stackIn_164_1).append(stackIn_165_2).append(')').toString());
        }
    }

    bh(mb param0) {
        try {
          this.field_c = param0;
          this.field_g = this.field_c.field_hc;
          this.field_d = this.field_c.field_U;
          this.field_p = this.field_c.field_Qb;
          this.field_l = this.field_c.field_K;
          this.field_j = this.field_c.field_Lb;
          this.field_h = this.field_c.field_u;
          this.field_a = this.field_c.field_Pb;
          this.field_r = this.field_c.field_pc;
          this.field_b = this.field_c.field_E;
          this.field_q = this.field_c.field_Gb;
          this.field_n = 16777215;
          this.field_m = this.field_c.field_ab;
          this.field_e = ka.field_G[o.a((byte) 84, this.field_c.field_Zb.field_N)][25][0];
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1 = (re.field_Z - 640) / 2;
        int var2 = an.field_h * an.field_h;
        int var3 = -(je.field_t * je.field_t) + var2;
        mg.field_Ub.a(param0 ^ 0, 90, -210 + (pb.field_j - 4), -(199 * var3 / var2) + var1, 199);
        pc.field_q.a(param0 ^ param0, 0, -4 + (-120 + pb.field_j), 438 * var3 / var2 + (202 + var1), 438);
    }

    final static int a(int[] param0, int param1, nk param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.field_G;
        try {
          var3_int = 0;
          var4 = param2.i(-121);
          var5 = 0;
          for (var6 = 0; var4 > var6; var6++) {
            if (10 == param0[var6]) {
              var3_int += 100;
            }
            if (param0[var6] == 11) {
              var3_int += 200;
            }
            if (param0[var6] == 12) {
              var3_int += 500;
            }
            if (13 == param0[var6]) {
              var3_int += 1000;
            }
            if (param0[var6] == 34) {
              var5 = 1;
            }
            if (param0[var6] == 14) {
              var3_int += 2000;
            }
          }
          if (var5 != 0) {
            var3_int += 3800;
          }
          if (param1 == 10) {
            stackIn_25_0 = var3_int;
            return stackIn_25_0;
          }
          stackIn_23_0 = 78;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("bh.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void a(int param0, je param1, int param2, int param3, int param4) {
        try {
          if (param3 != -1) {
            this.field_d = 31;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_i = "Seriously offensive language";
        field_o = "Reject <%0> from this game";
    }
}
