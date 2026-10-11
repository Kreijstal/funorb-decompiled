/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ac extends bb {
    private int field_eb;
    private int field_fb;
    static String field_gb;
    private int field_Y;
    static String field_Z;
    private int field_db;
    static String field_ab;
    private int field_hb;
    private int field_cb;
    static RgbSprite field_bb;

    void j(byte param0) {
        if (param0 < 6) {
          field_gb = (String) null;
          return;
        }
    }

    ac(ka param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_eb = 0;
        this.field_db = 0;
    }

    void i(byte param0) {
        if (this.field_db <= 0) {
          return;
        }
        this.a((byte) -90, this.field_cb, this.field_Y);
        this.field_db = 0;
        this.j((byte) 12);
        int var2 = 73 % ((55 - param0) / 39);
    }

    final static SceneWidget k(int param0) {
        if (param0 != -4795) {
          return (SceneWidget) null;
        }
        return rn.field_y.field_Ub;
    }

    void a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var16;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = SteelSentinels.obfuscationControl;
        SoftwareRaster.e(6 + param0, param1 + 35, -12 + this.field_x, this.field_E - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (var8 >= SoftwareRaster.field_l &&
            var8 < SoftwareRaster.field_d) {
            var9 = (-var5 + var6) * var7 / var4 + var5;
            var10 = 0;
            var11 = this.field_x;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var7 + 20) * (20 - var7) + (20 - var10) * (20 - var10);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  SoftwareRaster.field_g[param0 + (var8 * SoftwareRaster.field_c + var10)] = var13;
                }
                var10++;
              }
            }
            if (20 >= var7) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = var13Lifetime1 * var13Lifetime1 + (20 - var7) * (-var7 + 20);
                if (462 >= var14) {
                  if (420 > var14) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    SoftwareRaster.field_g[var8 * SoftwareRaster.field_c + param0 + var11] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            SoftwareRaster.g(var10 + param0, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = param1 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRaster.g(param0, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRaster.g(this.field_x + (param0 - 6), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        Explosion.field_L.a(this.field_x + param0 - 90, param1 + 10);
        if (param2) {
          uc.a(jj.field_k, this.field_x - 10, 35 + param1, (byte) -39, param0 + 5);
          uc.a(Explosion.field_J, this.field_x, this.field_E + (param1 - 22), (byte) -39, param0);
          var5Lifetime2 = 169;
          var4Lifetime2 = -79 + this.field_E;
          var6Lifetime2 = 127;
          var7Lifetime2 = 0;
          var8Lifetime2 = param1 + 57;
          while (var4Lifetime2 > var7Lifetime2) {
            var9Lifetime2 = var5Lifetime2 + (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2;
            var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
            SoftwareRaster.g(param0, var8Lifetime2, 6, var9Lifetime2);
            SoftwareRaster.g(-6 + param0 + this.field_x, var8Lifetime2, 6, var9Lifetime2);
            var8Lifetime2++;
            var7Lifetime2++;
          }
        } else {
          field_gb = (String) null;
          uc.a(jj.field_k, this.field_x - 10, 35 + param1, (byte) -39, param0 + 5);
          uc.a(Explosion.field_J, this.field_x, this.field_E + (param1 - 22), (byte) -39, param0);
          var5Lifetime2 = 169;
          var4Lifetime2 = -79 + this.field_E;
          var6Lifetime2 = 127;
          var7Lifetime2 = 0;
          var8Lifetime2 = param1 + 57;
          while (var4Lifetime2 > var7Lifetime2) {
            var9Lifetime2 = var5Lifetime2 + (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2;
            var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
            SoftwareRaster.g(param0, var8Lifetime2, 6, var9Lifetime2);
            SoftwareRaster.g(-6 + param0 + this.field_x, var8Lifetime2, 6, var9Lifetime2);
            var8Lifetime2++;
            var7Lifetime2++;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param3 <= 0) {
          this.a((byte) 99, param2, param1);
          return;
        }
        this.field_Y = param1;
        this.field_eb = 0;
        if (param0 == 103) {
          this.field_hb = this.field_E;
          this.field_fb = this.field_x;
          this.field_cb = param2;
          this.field_db = param3;
          return;
        }
        this.j(63);
        this.field_hb = this.field_E;
        this.field_fb = this.field_x;
        this.field_cb = param2;
        this.field_db = param3;
    }

    boolean j(int param0) {
        this.i((byte) 2);
        if (param0 > -50) {
          this.field_cb = -21;
          return super.j(-55);
        }
        return super.j(-55);
    }

    public static void k(byte param0) {
        field_Z = null;
        field_ab = null;
        if (param0 == 38) {
          field_gb = null;
          field_bb = null;
          return;
        }
        field_ab = (String) null;
        field_gb = null;
        field_bb = null;
    }

    boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 < this.field_db) {
          var2 = this.field_cb;
          var3 = this.field_Y;
          fieldTemp$0 = this.field_eb + 1;
          this.field_eb = this.field_eb + 1;
          if (fieldTemp$0 < this.field_db) {
            var4 = this.field_eb * (this.field_db * 2 - this.field_eb);
            var5 = this.field_db * this.field_db;
            var3 = this.field_hb + (-this.field_hb + this.field_Y) * var4 / var5;
            var2 = (-this.field_fb + this.field_cb) * var4 / var5 + this.field_fb;
            this.a((byte) -70, var2, var3);
            if (param0 != -8350) {
              this.i(-53);
              return super.i(-8350);
            }
            return super.i(-8350);
          }
          this.field_db = 0;
          this.j((byte) 59);
          this.a((byte) -70, var2, var3);
          if (param0 != -8350) {
            this.i(-53);
            return super.i(-8350);
          }
          return super.i(-8350);
        }
        if (param0 == -8350) {
          return super.i(-8350);
        }
        this.i(-53);
        return super.i(-8350);
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        try {
          cc.field_bc.field_S = param3;
          if (2 != ib.field_b) {
            qa.field_N.field_S = ql.field_Yb;
          } else {
            qa.field_N.field_S = qh.field_Ub;
          }
          var9_int = 495;
          var10 = 5;
          te.field_f.a(0, var10, param0, 5, -10 + var9_int);
          vd.field_d.a(0, 0, param0, 0, te.field_f.field_zb - wh.field_e.field_zb);
          wh.field_e.a(0, 0, param0, vd.field_d.field_zb, wh.field_e.field_zb);
          var10 = var10 + (param0 + param6);
          int var12 = 105 % ((-62 - param8) / 61);
          vc.field_f.a(0, var10, param2, 5, vc.field_f.g(-2147483648));
          var11 = qa.field_N.g(-2147483648);
          qa.field_N.a(0, var10, param2, var9_int + (-5 - var11), var11);
          cc.field_bc.a(0, 0, param4, 0, var9_int);
          var13 = 5 + var10 + param2;
          in.field_d.a(0, param4, var13, 0, var9_int);
          var13 = var13 + param4;
          in.field_d.field_I = se.a(3, 2105376, 11579568, in.field_d.field_Lb, 8421504, 13574);
          hh.field_a.a(0, param7 - var13 / 2, var13, param1 - var9_int / 2, var9_int);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ac.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_gb = "Target lock";
        field_Z = "<%1> was roadkill";
        field_ab = "Show all lobby chat";
    }
}
