/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    boolean field_d;
    int field_j;
    boolean field_z;
    private int field_q;
    boolean field_a;
    r field_h;
    boolean field_w;
    int field_k;
    static int[] field_f;
    int field_b;
    dl field_C;
    int field_i;
    int field_p;
    int field_t;
    int field_A;
    int field_l;
    static String field_o;
    dl field_c;
    private boolean field_u;
    int field_x;
    boolean field_B;
    int field_g;
    static boolean[] field_y;
    int field_v;
    int field_r;
    dk field_s;
    int field_m;
    int field_e;
    int field_n;

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          if (param0 != 23943) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            dl.a((java.applet.Applet) null, -65);
          }
          try {
            var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
            param1.getAppletContext().showDocument(bb.a((byte) 119, var2, param1), "_top");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(boolean param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        dl var9;
        int var10;
        var10 = Terraphoenix.field_V;
        if (param1 != -14) {
          this.a(56, true, -97);
        }
        if (this.field_v == -1) {
          return 10000;
        }
        if (this.field_v == 2) {
          return 10000;
        }
        if (this.field_v == 3) {
          return 10000;
        }
        if (param0) {
          if (this.field_v == 4) {
            if (this.field_C == null) {
              return 10000;
            }
            if (this.field_C.field_h != null) {
              return 10000;
            }
            if (0 != param2 ||
              param3 != 1) {
              return 10000;
            }
          }
          if (5 == this.field_v) {
            if (null == this.field_c) {
              return 10000;
            }
            if (this.field_c.field_h != null) {
              return 10000;
            }
            if (param2 != 0 ||
              param3 != -1) {
              return 10000;
            }
          }
        }
        var5 = this.field_A + param2;
        var6 = param3 + this.field_n;
        var7 = 4;
        if (param2 != 0 &&
          param3 != 0) {
          var7 = 6;
        }
        var8 = 0;
        var9 = this.field_s.a(param1 + 124, var6, this.field_r, var5);
        if (var9 == null) {
          return 10000;
        }
        if (this.field_i == 0 ||
          !param0) {
          if (!param0) {
            if (this.field_i != 1 &&
              param2 == -1 &&
              0 == param3 &&
              (this.field_e & 1) == 1) {
              return 10000;
            }
            if (-1 == param2 &&
              param3 == -1 && ((3 & this.field_e) == 3 ||
              (this.field_e & 1) + (4 & var9.field_e) == 5 ||
              (2 & this.field_e) + (8 & var9.field_e) == 10)) {
              return 10000;
            }
            if (this.field_i != 2 &&
              0 == param2 &&
              -1 == param3 &&
              (this.field_e & 2) == 2) {
              return 10000;
            }
            if (1 == param2 &&
              param3 == -1 && ((6 & this.field_e) == 6 ||
              (1 & var9.field_e) + (4 & this.field_e) == 5 ||
              (8 & var9.field_e) + (this.field_e & 2) == 10)) {
              return 10000;
            }
            if (this.field_i != 4 &&
              param2 == 1 &&
              param3 == 0 &&
              (this.field_e & 4) == 4) {
              return 10000;
            }
            if (param2 == 1 &&
              param3 == 1 && ((12 & this.field_e) == 12 ||
              (var9.field_e & 1) + (4 & this.field_e) == 5 ||
              (var9.field_e & 2) + (8 & this.field_e) == 10)) {
              return 10000;
            }
            if (this.field_i != 8 &&
              param2 == 0 &&
              param3 == 1 &&
              8 == (this.field_e & 8)) {
              return 10000;
            }
            if (-1 == param2 &&
              1 == param3 && ((this.field_e & 9) == 9 ||
              (4 & var9.field_e) + (this.field_e & 1) == 5 ||
              (var9.field_e & 2) + (this.field_e & 8) == 10)) {
              return 10000;
            }
          } else {
            if (param2 == -1 &&
              (this.field_e & 1) == 1) {
              return 10000;
            }
            if (param3 == -1 &&
              (2 & this.field_e) == 2) {
              return 10000;
            }
            if (1 == param2 &&
              (4 & this.field_e) == 4) {
              return 10000;
            }
            if (param3 == 1 &&
              (8 & this.field_e) == 8) {
              return 10000;
            }
            if (-1 == param2 &&
              (this.field_e & 16) == 16) {
              var8++;
              var7 = 10;
            }
            if (param3 == -1 &&
              32 == (this.field_e & 32)) {
              var7 = 10;
              var8++;
            }
            if (param2 == 1 &&
              64 == (64 & this.field_e)) {
              var7 = 10;
              var8++;
            }
            if (param3 == 1 &&
              (this.field_e & 128) == 128) {
              var7 = 10;
              var8++;
            }
          }
        }
        if (param0) {
          if (var9.field_i == 0) {
            if (param2 == 1 &&
              (var9.field_e & 1) == 1) {
              return 10000;
            }
            if (param3 == 1 &&
              (2 & var9.field_e) == 2) {
              return 10000;
            }
            if (param2 == -1 &&
              (var9.field_e & 4) == 4) {
              return 10000;
            }
            if (param3 == -1 &&
              (var9.field_e & 8) == 8) {
              return 10000;
            }
            if (param2 == 1 &&
              (var9.field_e & 16) == 16) {
              var8++;
              var7 = 10;
            }
            if (1 == param3 &&
              (32 & var9.field_e) == 32) {
              var7 = 10;
              var8++;
            }
            if (param2 == -1 &&
              (64 & var9.field_e) == 64) {
              var7 = 10;
              var8++;
            }
            if (param3 == -1 &&
              (128 & var9.field_e) == 128) {
              var7 = 10;
              var8++;
            }
          }
          if (var8 > 2 ||
            param2 != 0 &&
            param3 != 0 &&
            var8 > 0) {
            return 10000;
          }
        }
        if (param0) {
          if (var9.field_v == 2) {
            return 10000;
          }
          if (3 == var9.field_v) {
            return 10000;
          }
          if (var9.field_v == -1) {
            return 10000;
          }
          if (1 == var9.field_v) {
            var7 += 4;
          }
          if (var9.field_v == 4) {
            if (var9.field_C.field_h != null) {
              return 10000;
            }
            if (param2 != 0 ||
              param3 != -1) {
              return 10000;
            }
          }
          if (5 == var9.field_v) {
            if (null != var9.field_c) {
              if (null != var9.field_c.field_h) {
                return 10000;
              }
            } else {
              var9.field_v = 0;
            }
            if (param2 != 0 ||
              param3 != 1) {
              return 10000;
            }
          }
          if (null != var9.field_h && (var9.field_h.field_k ||
            var9.field_h.field_C == 0 ||
            !var9.field_s.field_i.field_J)) {
            return 10000;
          }
        }
        return var7;
    }

    final void a(int param0, boolean param1, int param2) {
        Object var4;
        int var5;
        int var6;
        int var7;
        var7 = Terraphoenix.field_V;
        if (!param1) {
          param0 = param0 << 4;
        }
        var5 = -53 % ((19 - param2) / 59);
        if ((this.field_e & param0) == param0) {
          this.field_e = this.field_e - param0;
        } else {
          this.field_e = this.field_e + param0;
        }
        var4 = null;
        var6 = 0;
        if (param0 == 1 &&
          this.field_A > 0) {
          var4 = this.field_s.a(-87, this.field_n, this.field_r, -1 + this.field_A);
          var6 = 4;
        }
        if (param0 == 2 &&
          this.field_n > 0) {
          var4 = this.field_s.a(-52, this.field_n - 1, this.field_r, this.field_A);
          var6 = 8;
        }
        if (4 == param0 &&
          this.field_A < this.field_s.field_b - 1) {
          var6 = 1;
          var4 = this.field_s.a(97, this.field_n, this.field_r, 1 + this.field_A);
        }
        if (8 == param0 &&
          this.field_s.field_e - 1 > this.field_n) {
          var6 = 2;
          var4 = this.field_s.a(87, this.field_n + 1, this.field_r, this.field_A);
        }
        if (param0 == 16 &&
          this.field_A > 0) {
          var4 = this.field_s.a(110, this.field_n, this.field_r, this.field_A - 1);
          var6 = 64;
        }
        if (param0 == 32 &&
          this.field_n > 0) {
          var4 = this.field_s.a(94, -1 + this.field_n, this.field_r, this.field_A);
          var6 = 128;
        }
        if (64 == param0 &&
          -1 + this.field_s.field_b > this.field_A) {
          var6 = 16;
          var4 = this.field_s.a(-119, this.field_n, this.field_r, this.field_A + 1);
        }
        if (128 == param0 &&
          this.field_n < this.field_s.field_e - 1) {
          var6 = 32;
          var4 = this.field_s.a(-85, this.field_n + 1, this.field_r, this.field_A);
        }
        if (var4 != null) {
          if ((var6 & ((dl) (var4)).field_e) == var6) {
            ((dl) (var4)).field_e = ((dl) (var4)).field_e - var6;
          } else {
            ((dl) (var4)).field_e = ((dl) (var4)).field_e + var6;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          String var4 = null;
          int var3 = 0;
          java.net.URL var5 = null;
          String var4Lifetime1;
          String var4Lifetime2;
          if (param1 != -6242) {
            dl.b(-103);
          }
          try {
            var2 = param0.getDocumentBase().getFile();
            var4 = var2;
            var4Lifetime1 = var2;
            var3 = var2.indexOf('?');
            var4Lifetime2 = "reload.ws";
            if (var3 >= 0) {
              var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
            }
            var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
            param0.getAppletContext().showDocument(bb.a((byte) 124, var5, param0), "_self");
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, int param1, int param2) {
        if (param2 >= -105) {
          this.field_i = -65;
        }
        return this.a(true, (byte) -14, param1, param0);
    }

    final void a(boolean param0) {
        if (-1 != this.field_b) {
          this.field_b = ck.field_f[this.field_b];
        }
        if (this.field_j >= 0) {
          this.field_j = hb.field_h[this.field_j];
          if (this.field_j > -1) {
            this.field_v = nc.field_a[this.field_j];
          }
        }
        if (param0) {
          this.field_n = 46;
        }
    }

    public static void b(int param0) {
        if (param0 != -32) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          dl.a((java.applet.Applet) null, -53);
        }
        field_o = null;
        field_y = null;
        field_f = null;
    }

    final int a(int param0, int param1, int param2, int param3) {
        Object var5;
        int var6;
        var6 = Terraphoenix.field_V;
        var5 = this;
        if (param1 != 1000) {
          this.field_h = (r) null;
        }
        while (param2 > ((dl) (var5)).field_r) {
          var5 = ((dl) (var5)).field_C;
          if (var5 == null) {
            return 1000;
          }
        }
        return ((dl) (var5)).a(true, (byte) -14, param3, param0);
    }

    private final void a(int param0, int param1, ci param2, int param3, int param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          if (param4 == 256) {
            param2.b(param0, param1);
            return;
          }
          param1 = param1 + param2.field_v;
          if (param3 != 17335) {
            this.field_r = -16;
          }
          param0 = param0 + param2.field_p;
          var6_int = param0 + param1 * l.field_k;
          var7 = 0;
          var8 = param2.field_t;
          var9 = param2.field_r;
          var10 = l.field_k - var9;
          if (param1 < l.field_d) {
            var12 = l.field_d - param1;
            param1 = l.field_d;
            var8 = var8 - var12;
            var6_int = var6_int + var12 * l.field_k;
            var7 = var7 + var9 * var12;
          }
          var11 = 0;
          if (l.field_c < var8 + param1) {
            var8 = var8 - (-l.field_c + var8 + param1);
          }
          if (l.field_b > param0) {
            var12Lifetime1 = l.field_b - param0;
            var9 = var9 - var12Lifetime1;
            var7 = var7 + var12Lifetime1;
            var10 = var10 + var12Lifetime1;
            var6_int = var6_int + var12Lifetime1;
            var11 = var11 + var12Lifetime1;
            param0 = l.field_b;
          }
          if (var9 + param0 > l.field_f) {
            var12Lifetime2 = -l.field_f + (param0 + var9);
            var9 = var9 - var12Lifetime2;
            var10 = var10 + var12Lifetime2;
            var11 = var11 + var12Lifetime2;
          }
          if (var9 > 0 &&
            0 < var8) {
            qc.a(l.field_i, var10, param2.field_z, var7, param4, var11, var8, param3 ^ 16729015, 0, var9, var6_int);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_25_0 = var6;
          stackIn_25_1 = new StringBuilder().append("dl.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param1 == 0) {
          return this.a(false, (byte) -14, 1, 0);
        }
        if (param1 == 1) {
          return this.a(false, (byte) -14, 1, 1);
        }
        if (2 == param1) {
          return this.a(false, (byte) -14, 0, 1);
        }
        if (3 == param1) {
          return this.a(false, (byte) -14, -1, 1);
        }
        int var3 = -62 % ((param0 + 46) / 50);
        if (param1 == 4) {
          return this.a(false, (byte) -14, -1, 0);
        }
        if (param1 == 5) {
          return this.a(false, (byte) -14, -1, -1);
        }
        if (param1 == 6) {
          return this.a(false, (byte) -14, 0, -1);
        }
        if (param1 == 7) {
          return this.a(false, (byte) -14, 1, -1);
        }
        return 1000;
    }

    final int a(int param0, int param1, gi[] param2, int param3, byte param4, boolean param5) {
        int stackIn_3_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_331_0 = 0;
        int stackIn_339_0 = 0;
        int stackIn_435_1 = 0;
        int stackIn_435_2 = 0;
        ci stackIn_435_3 = null;
        int stackIn_435_4 = 0;
        Object stackIn_437_0;
        Object stackIn_438_0;
        int stackIn_438_5;
        Object stackIn_442_0;
        Object stackIn_443_0;
        int stackIn_443_1;
        int stackIn_443_2;
        ci stackIn_443_3;
        int stackIn_443_4;
        Object stackIn_444_0;
        int stackIn_444_5;
        Object stackIn_449_0;
        Object stackIn_450_0;
        int stackIn_450_1;
        int stackIn_450_2;
        ci stackIn_450_3;
        int stackIn_450_4;
        Object stackIn_451_0;
        int stackIn_451_5;
        Object stackIn_455_0;
        Object stackIn_456_0;
        int stackIn_456_1;
        int stackIn_456_2;
        ci stackIn_456_3;
        int stackIn_456_4;
        Object stackIn_457_0;
        int stackIn_457_5;
        int stackIn_521_0 = 0;
        RuntimeException stackIn_524_0 = null;
        StringBuilder stackIn_524_1 = null;
        String stackIn_525_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var9Lifetime1;
        Object var11Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        int var11_intLifetime1;
        int var11_intLifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var11_intLifetime3;
        int var12Lifetime3;
        int var12Lifetime4;
        int var11_intLifetime1Lifetime1;
        int var11_intLifetime1Lifetime2;
        int var11_intLifetime1Lifetime3;
        int var12Lifetime2Lifetime1;
        var13 = Terraphoenix.field_V;
        try {
          if (param4 != 125) {
            stackIn_3_0 = 11;
            return stackIn_3_0;
          }
          if (null == u.field_a) {
            u.field_a = new ci(128, 160);
          }
          var7_int = 0;
          if (this.field_s.field_i != null) {
            if (this.field_s.field_m == 1 &&
              this.field_r == 0 &&
              !this.field_d) {
              var7_int = 1;
            }
            if (2 == this.field_s.field_m &&
              this.field_r == 0 && (!(Math.abs(this.field_A - this.field_s.field_b / 2) < this.field_s.field_b / 2 - 5) ||
              !(Math.abs(this.field_n - this.field_s.field_e / 2) < -5 + this.field_s.field_e / 2))) {
              var7_int = 1;
            }
            if (3 == this.field_s.field_m &&
              this.field_r == 1 &&
              this.field_A < 12 &&
              12 > this.field_n) {
              var7_int = 1;
            }
            if (this.field_s.field_m == 4 &&
              this.field_r == 2 &&
              5 != this.field_b) {
              var7_int = 1;
            }
          }
          if (this.field_p > 0 &&
            null == this.field_s.field_i.field_K) {
            this.field_p = this.field_p - 4;
          }
          if (d.field_H &&
            this.field_r == tg.field_l) {
            var9 = null;
            if (param5 &&
              tg.field_l == this.field_r) {
              var9 = oi.field_J;
              oi.field_J.a();
              l.f(0, 0, 128, 160, 0);
              k.field_f.a(0);
            }
            var8 = -(this.field_l * 48 / 100) + param3;
            if (tg.field_l < this.field_r) {
              if (null != this.field_C) {
                param1 = this.field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                param5 = false;
              }
              stackIn_44_0 = param1;
              return stackIn_44_0;
            }
            if (!dh.field_j &&
              tg.field_l != this.field_r) {
              if (this.field_C != null) {
                param1 = this.field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                param5 = false;
              }
              stackIn_51_0 = param1;
              return stackIn_51_0;
            }
            var10 = 1;
            if (tg.field_l > this.field_r) {
              stackIn_57_0 = (this.field_u) ? 0 : 1;
              var10 = stackIn_57_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var10 != 0) {
              if (!this.field_z &&
                !this.field_a) {
                var11_int = this.field_b;
                if (var11_int < 0 && (this.field_v == 0 ||
                  4 == this.field_v ||
                  this.field_v == 5)) {
                  var11_int = 0;
                }
                if (var11_int < 0) {
                  if (var9 != null) {
                    ((ci) (var9)).a();
                    l.a(32, 124, 16777215);
                    l.a(64, 108, 16777215);
                    l.a(64, 139, 16777215);
                    l.a(95, 124, 16777215);
                    k.field_f.a(0);
                  }
                } else {
                  var12 = 43520;
                  if (this.field_v == 1) {
                    var12 = 32768;
                  }
                  if (this.field_v == 2) {
                    var12 = 16776960;
                  }
                  if (this.field_v == 3) {
                    var12 = 16711680;
                  }
                  if (this.field_v == 4) {
                    var12 = 16777215;
                  }
                  if (this.field_v == 5) {
                    var12 = 16777215;
                  }
                  if (this.field_d) {
                    var12 = 0;
                  }
                  if (var9 != null) {
                    ((ci) (var9)).a();
                    aj.field_a[var11_int].b(32, 108, var12);
                    k.field_f.a(0);
                  } else {
                    aj.field_a[var11_int].b(-32 + param0, var8 - 16, var12);
                  }
                  if (this.field_s.field_i != null &&
                    this.field_b >= 0) {
                    this.field_s.field_i.a(param0 - 32, -16 + var8, this.field_r, aj.field_a[this.field_b], false, param4 + 28019);
                  }
                }
                if (null != this.field_s.a(115, this.field_n, this.field_r, -1 + this.field_A) &&
                  !this.field_s.a(-36, this.field_n, this.field_r, -1 + this.field_A).field_a &&
                  this.field_s.a(108, this.field_n, this.field_r, -1 + this.field_A).field_d) {
                  stackIn_100_0 = 0;
                } else {
                  stackIn_100_0 = 256;
                }
                var12Lifetime3 = stackIn_100_0;
                if (this.field_g >= 0 &&
                  var12Lifetime3 > 0) {
                  dm.field_a[this.field_g].a(param0 - 32, -64 + var8, 128);
                }
                if (this.field_s.a(93, this.field_n - 1, this.field_r, this.field_A) != null &&
                  !this.field_s.a(-86, this.field_n - 1, this.field_r, this.field_A).field_a &&
                  this.field_s.a(param4 - 198, this.field_n - 1, this.field_r, this.field_A).field_d) {
                  stackIn_109_0 = 0;
                } else {
                  stackIn_109_0 = 256;
                }
                var12Lifetime4 = stackIn_109_0;
                if ((!(this.field_k < 0)) &&
                  (!(var12Lifetime4 <= 0))) {
                  bk.field_a[this.field_k].a(-32 + param0, var8 - 64, 128);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_a = true;
                var11_intLifetime3 = this.field_b;
                if (var11_intLifetime3 < 0 && (0 == this.field_v ||
                  this.field_v == 4 ||
                  this.field_v == 5)) {
                  var11_intLifetime3 = 0;
                }
                if (0 <= var11_intLifetime3) {
                  var12Lifetime1 = 65280;
                  if (1 == this.field_v) {
                    var12Lifetime1 = 32768;
                  }
                  if (this.field_v == 2) {
                    var12Lifetime1 = 16776960;
                  }
                  if (3 == this.field_v) {
                    var12Lifetime1 = 16711680;
                  }
                  if (this.field_v == 4) {
                    var12Lifetime1 = 16777215;
                  }
                  if (this.field_v == 5) {
                    var12Lifetime1 = 16777215;
                  }
                  if (var9 == null) {
                    aj.field_a[var11_intLifetime3].b(-32 + param0, var8 - 16, var12Lifetime1);
                  } else {
                    ((ci) (var9)).a();
                    aj.field_a[var11_intLifetime3].b(32, 108, var12Lifetime1);
                    k.field_f.a(0);
                  }
                  if (this.field_s.field_i != null &&
                    0 <= this.field_b) {
                    this.field_s.field_i.a(-32 + param0, -16 + var8, this.field_r, aj.field_a[this.field_b], false, param4 + 28019);
                  }
                } else {
                  if (var9 != null) {
                    ((ci) (var9)).a();
                    l.a(32, 124, 16777215);
                    l.a(64, 108, 16777215);
                    l.a(64, 139, 16777215);
                    l.a(95, 124, 16777215);
                    k.field_f.a(0);
                  }
                }
                if (ll.field_c) {
                  if (this.field_g >= 0) {
                    if (this.field_g % 4 == 0) {
                      var12Lifetime2 = 0;
                      if (this.field_s.a(param4 + 2, this.field_n - 1, this.field_r, this.field_A) != null &&
                        this.field_s.a(-35, -1 + this.field_n, this.field_r, this.field_A).field_g == 3 + this.field_g) {
                        var12Lifetime2++;
                      }
                      if (null != this.field_s.a(96, this.field_n + 1, this.field_r, this.field_A) &&
                        this.field_s.a(108, 1 + this.field_n, this.field_r, this.field_A).field_g == 3 + this.field_g) {
                        var12Lifetime2 += 2;
                      }
                      if (var12Lifetime2 == 3) {
                        var12Lifetime2 = 0;
                        this.field_g = this.field_g + 3;
                        if ((this.field_e & 16) == 16) {
                          this.a(1, false, 86);
                        }
                        if ((1 & this.field_e) == 1) {
                          this.a(1, true, 107);
                          this.a(1, false, -92);
                        }
                      }
                      dm.field_a[var12Lifetime2 + this.field_g].a(param0 - 32, var8 - 64, 128);
                    } else {
                      dm.field_a[this.field_g].a(param0 - 32, -64 + var8, 128);
                    }
                  }
                  if (this.field_k >= 0) {
                    if (0 == this.field_k % 4) {
                      var12Lifetime2Lifetime1 = 0;
                      if (this.field_s.a(-29, this.field_n, this.field_r, -1 + this.field_A) != null &&
                        this.field_s.a(81, this.field_n, this.field_r, this.field_A - 1).field_k == 3 + this.field_k) {
                        var12Lifetime2Lifetime1++;
                      }
                      if (this.field_s.a(96, this.field_n, this.field_r, 1 + this.field_A) != null &&
                        this.field_s.a(116, this.field_n, this.field_r, this.field_A + 1).field_k == this.field_k + 3) {
                        var12Lifetime2Lifetime1 += 2;
                      }
                      if (var12Lifetime2Lifetime1 == 3) {
                        var12Lifetime2Lifetime1 = 0;
                        this.field_k = this.field_k + 3;
                        if ((32 & this.field_e) == 32) {
                          this.a(2, false, -63);
                        }
                        if (2 == (2 & this.field_e)) {
                          this.a(2, true, 112);
                          this.a(2, false, 90);
                        }
                      }
                      bk.field_a[this.field_k + var12Lifetime2Lifetime1].a(param0 - 32, var8 - 64, 128);
                    } else {
                      bk.field_a[this.field_k].a(param0 - 32, -64 + var8, 128);
                    }
                  }
                }
              }
            }
            if (this.field_p > 0) {
              li.field_a = true;
              if (this.field_p < 64) {
                l.b(param0, -24 + var8, 32, 16777215, 4 * this.field_p);
              }
            }
            if ((this.field_z ||
              this.field_a ||
              !this.field_d) &&
              this.field_v == 1) {
              if (this.field_j != 7) {
                kg.field_r[this.field_j].a(-32 + param0, var8 - 64, 128);
              } else {
                se.field_c[(this.field_n * 3 + this.field_A) % se.field_c.length].a(-32 + param0, -112 + var8, 128);
              }
            }
            if (null != this.field_C) {
              this.field_C.a(param0, param1, param2, param3, (byte) 125, param5);
            }
            if (var9 != null) {
              u.field_a.a();
              ((ci) (var9)).d(0, 0);
              if (this.field_s.field_i != null &&
                this.field_s.field_i.field_L > 0) {
                c.a((byte) -86, u.field_a, 16777215);
                c.a((byte) -86, u.field_a, 16744576);
                c.a((byte) -86, u.field_a, 16728128);
                c.a((byte) -86, u.field_a, 8388608);
                c.a((byte) -86, u.field_a, 4194304);
              } else {
                c.a((byte) -86, u.field_a, 16777215);
                c.a((byte) -86, u.field_a, 8454016);
                c.a((byte) -86, u.field_a, 4259648);
                c.a((byte) -86, u.field_a, 32768);
                c.a((byte) -86, u.field_a, 16384);
              }
              ((ci) (var9)).b(0, 0, 0);
              k.field_f.a(0);
              hb.field_n = var8 - 124;
              ug.field_b = param0 - 64;
              ((ci) (var9)).b(param0 - 64, -124 + var8);
            }
            stackIn_205_0 = param1;
            return stackIn_205_0;
          }
          var8Lifetime1 = -(this.field_l * 48 / 100) + param3;
          var9Lifetime1 = null;
          if (param5 &&
            tg.field_l == this.field_r) {
            var9Lifetime1 = oi.field_J;
            oi.field_J.a();
            l.f(0, 0, 128, 160, 0);
            k.field_f.a(0);
          }
          if (tg.field_l < this.field_r) {
            if (this.field_h != null) {
            }
            if (this.field_C != null) {
              param1 = this.field_C.a(param0, param1, param2, param3, (byte) 125, param5);
            }
            stackIn_215_0 = param1;
            return stackIn_215_0;
          }
          if (!dh.field_j &&
            this.field_r != tg.field_l) {
            if (null == this.field_h) {
            }
            if (null != this.field_C) {
              param1 = this.field_C.a(param0, param1, param2, param3, (byte) 125, param5);
            }
            stackIn_223_0 = param1;
            return stackIn_223_0;
          }
          var10Lifetime1 = 1;
          if (this.field_r < tg.field_l) {
            stackIn_229_0 = (this.field_u) ? 0 : 1;
            var10Lifetime1 = stackIn_229_0;
          }
          L64: {
            if (var10Lifetime1 != 0) {
              if (!this.field_z &&
                !this.field_a &&
                this.field_s.field_l == null) {
                if (!this.field_d) {
                  if (0 > this.field_b) {
                    if (var9Lifetime1 != null) {
                      ((ci) (var9Lifetime1)).a();
                      l.a(32, 124, 16777215);
                      l.a(64, 108, 16777215);
                      l.a(64, 139, 16777215);
                      l.a(95, 124, 16777215);
                      k.field_f.a(0);
                    }
                  } else {
                    var11_intLifetime1 = 128;
                    if (var7_int != 0) {
                      var11_intLifetime1 = (int)(128.0 + 64.0 * Math.sin((double)this.field_A + 2.0 * mm.field_f - (double)this.field_n));
                    }
                    if (var9Lifetime1 == null) {
                      this.a(param0 - 32, var8Lifetime1 - 16, aj.field_a[this.field_b], 17335, var11_intLifetime1);
                      if (this.field_q != -1) {
                        this.a(-32 + param0, var8Lifetime1 - 16, ji.field_j[this.field_q], param4 + 17210, 128);
                      }
                    } else {
                      ((ci) (var9Lifetime1)).a();
                      this.a(32, 108, aj.field_a[this.field_b], 17335, var11_intLifetime1);
                      if (-1 != this.field_q) {
                        this.a(param0 - 32, var8Lifetime1 - 16, ji.field_j[this.field_q], param4 ^ 17354, 128);
                      }
                      k.field_f.a(0);
                    }
                    if (this.field_s.field_i != null) {
                      this.field_s.field_i.a(-32 + param0, var8Lifetime1 - 16, this.field_r, aj.field_a[this.field_b], false, param4 + 28019);
                    }
                  }
                  if (this.field_g >= 0) {
                    if (this.field_g % 4 == 0) {
                      var11_intLifetime1 = 0;
                      if (null != this.field_s.a(param4 ^ -37, this.field_n - 1, this.field_r, this.field_A) &&
                        this.field_s.a(127, -1 + this.field_n, this.field_r, this.field_A).field_g == this.field_g + 3) {
                        var11_intLifetime1++;
                      }
                      if (this.field_s.a(param4 ^ 33, 1 + this.field_n, this.field_r, this.field_A) != null &&
                        this.field_s.a(param4 ^ 45, this.field_n + 1, this.field_r, this.field_A).field_g == 3 + this.field_g) {
                        var11_intLifetime1 += 2;
                      }
                      if (var11_intLifetime1 == 3) {
                        var11_intLifetime1 = 0;
                        this.field_g = this.field_g + 3;
                        if ((this.field_e & 16) == 16) {
                          this.a(1, false, param4 - 45);
                        }
                        if ((1 & this.field_e) == 1) {
                          this.a(1, true, 92);
                          this.a(1, false, param4 ^ -22);
                        }
                      }
                      if (var9Lifetime1 == null) {
                        this.a(-32 + param0, -64 + var8Lifetime1, dm.field_a[var11_intLifetime1 + this.field_g], 17335, 64);
                      } else {
                        ((ci) (var9Lifetime1)).a();
                        this.a(32, 60, dm.field_a[this.field_g + var11_intLifetime1], param4 ^ 17354, 64);
                        k.field_f.a(0);
                      }
                      if (this.field_s.field_i != null) {
                        this.field_s.field_i.a(param0 - 32, var8Lifetime1 - 64, this.field_r, dm.field_a[var11_intLifetime1 + this.field_g], true, 28144);
                      }
                    } else {
                      if (var9Lifetime1 != null) {
                        ((ci) (var9Lifetime1)).a();
                        this.a(32, 60, dm.field_a[this.field_g], 17335, 64);
                        k.field_f.a(param4 - 125);
                      } else {
                        this.a(param0 - 32, -64 + var8Lifetime1, dm.field_a[this.field_g], param4 ^ 17354, 64);
                      }
                      if (this.field_s.field_i != null) {
                        this.field_s.field_i.a(-32 + param0, -64 + var8Lifetime1, this.field_r, dm.field_a[this.field_g], true, 28144);
                      }
                    }
                  }
                  if (this.field_k >= 0) {
                    if (this.field_k % 4 != 0) {
                      if (var9Lifetime1 != null) {
                        ((ci) (var9Lifetime1)).a();
                        bk.field_a[this.field_k].c(32, 60, 128);
                        k.field_f.a(0);
                      } else {
                        bk.field_a[this.field_k].c(-32 + param0, -64 + var8Lifetime1, 128);
                      }
                      if (this.field_s.field_i != null) {
                        this.field_s.field_i.a(-32 + param0, var8Lifetime1 - 64, this.field_r, bk.field_a[this.field_k], true, 28144);
                      }
                    } else {
                      var11_intLifetime1 = 0;
                      if (this.field_s.a(param4 - 25, this.field_n, this.field_r, this.field_A - 1) != null &&
                        this.field_s.a(-104, this.field_n, this.field_r, -1 + this.field_A).field_k == 3 + this.field_k) {
                        var11_intLifetime1++;
                      }
                      if (this.field_s.a(-114, this.field_n, this.field_r, this.field_A + 1) != null &&
                        this.field_s.a(116, this.field_n, this.field_r, this.field_A + 1).field_k == this.field_k + 3) {
                        var11_intLifetime1 += 2;
                      }
                      if (var11_intLifetime1 == 3) {
                        var11_intLifetime1 = 0;
                        this.field_k = this.field_k + 3;
                        if ((32 & this.field_e) == 32) {
                          this.a(2, false, -94);
                        }
                        if ((2 & this.field_e) == 2) {
                          this.a(2, true, 83);
                          this.a(2, false, 96);
                        }
                      }
                      if (var9Lifetime1 == null) {
                        bk.field_a[var11_intLifetime1 + this.field_k].c(-32 + param0, var8Lifetime1 - 64, 128);
                      } else {
                        ((ci) (var9Lifetime1)).a();
                        bk.field_a[var11_intLifetime1 + this.field_k].c(32, 60, 128);
                        k.field_f.a(0);
                      }
                      if (this.field_s.field_i != null) {
                        this.field_s.field_i.a(param0 - 32, var8Lifetime1 - 64, this.field_r, bk.field_a[var11_intLifetime1 + this.field_k], true, 28144);
                      }
                    }
                  }
                } else {
                  if (0 <= this.field_b) {
                    this.a(param0 - 32, -16 + var8Lifetime1, aj.field_a[this.field_b], 17335, 0);
                    if (null != this.field_s.field_i) {
                      this.field_s.field_i.a(param0 - 32, var8Lifetime1 - 16, this.field_r, aj.field_a[this.field_b], false, param4 + 28019);
                    }
                  }
                  if ((this.field_i & 1) > 0 &&
                    this.field_s.a(param4 ^ -98, this.field_n, this.field_r, this.field_A - 1).field_a) {
                    stackIn_331_0 = 192;
                  } else {
                    stackIn_331_0 = 0;
                  }
                  var11_intLifetime1 = stackIn_331_0;
                  if (this.field_g >= 0) {
                    this.a(param0 - 32, -64 + var8Lifetime1, dm.field_a[this.field_g], 17335, var11_intLifetime1);
                    if (this.field_s.field_i != null) {
                      this.field_s.field_i.a(-32 + param0, -64 + var8Lifetime1, this.field_r, dm.field_a[this.field_g], true, param4 + 28019);
                    }
                  }
                  if ((2 & this.field_i) > 0 &&
                    this.field_s.a(116, -1 + this.field_n, this.field_r, this.field_A).field_a) {
                    stackIn_339_0 = 160;
                  } else {
                    stackIn_339_0 = 0;
                  }
                  var11_intLifetime1 = stackIn_339_0;
                  if (0 <= this.field_k) {
                    this.a(param0 - 32, -64 + var8Lifetime1, bk.field_a[this.field_k], 17335, var11_intLifetime1);
                    if (this.field_s.field_i != null) {
                      this.field_s.field_i.a(-32 + param0, -64 + var8Lifetime1, this.field_r, bk.field_a[this.field_k], true, 28144);
                    }
                  }
                }
                if (((this.field_A == uf.field_c)) &&
                  (this.field_n == vf.field_a)) {
                  break L64;
                }
                break L64;
              }
              this.field_a = true;
              if (this.field_b < 0) {
                if (null != this.field_s.field_l) {
                  vc.field_f.c("N", param0 - 12, var8Lifetime1, 16711680, -1);
                }
                if (var9Lifetime1 != null) {
                  ((ci) (var9Lifetime1)).a();
                  l.a(32, 124, 16777215);
                  l.a(64, 108, 16777215);
                  l.a(64, 139, 16777215);
                  l.a(95, 124, 16777215);
                  k.field_f.a(0);
                }
              } else {
                var11_intLifetime1Lifetime1 = 256;
                if (var7_int != 0) {
                  var11_intLifetime1Lifetime1 = (int)(Math.sin((double)this.field_A + 2.0 * mm.field_f - (double)this.field_n) * 64.0 + 192.0);
                }
                if (this.field_r < tg.field_l) {
                  var11_intLifetime1Lifetime1 -= 64;
                }
                if (var9Lifetime1 != null) {
                  ((ci) (var9Lifetime1)).a();
                  aj.field_a[this.field_b].c(32, 108, var11_intLifetime1Lifetime1);
                  if (this.field_q != -1) {
                    ji.field_j[this.field_q].b(32, 108);
                  }
                  k.field_f.a(param4 ^ 125);
                } else {
                  aj.field_a[this.field_b].c(param0 - 32, -16 + var8Lifetime1, var11_intLifetime1Lifetime1);
                  if (this.field_q != -1) {
                    ji.field_j[this.field_q].b(-32 + param0, -16 + var8Lifetime1);
                  }
                }
                if (null != this.field_s.field_i) {
                  this.field_s.field_i.a(param0 - 32, var8Lifetime1 - 16, this.field_r, aj.field_a[this.field_b], false, param4 + 28019);
                }
              }
              if (uf.field_c == this.field_A &&
                this.field_n == vf.field_a) {
              }
              if (this.field_s.field_l != null &&
                this.field_A == uf.field_c &&
                vf.field_a == this.field_n) {
                var11_intLifetime1Lifetime2 = 32768;
                if (this.field_r == tg.field_l) {
                  var11_intLifetime1Lifetime2 = 65280;
                }
                l.d(param0 - 32, -16 + var8Lifetime1, 64, 32, var11_intLifetime1Lifetime2, 128);
              }
              if (ll.field_c) {
                if (this.field_g >= 0) {
                  if (this.field_g % 4 != 0) {
                    if (var9Lifetime1 == null) {
                      dm.field_a[this.field_g].c(param0 - 32, var8Lifetime1 - 64, 200);
                    } else {
                      ((ci) (var9Lifetime1)).a();
                      dm.field_a[this.field_g].c(32, 60, 200);
                      k.field_f.a(0);
                    }
                    if (this.field_s.field_i != null) {
                      this.field_s.field_i.a(-32 + param0, var8Lifetime1 - 64, this.field_r, dm.field_a[this.field_g], true, 28144);
                    }
                  } else {
                    var11_intLifetime1Lifetime3 = 0;
                    if (this.field_s.a(112, this.field_n - 1, this.field_r, this.field_A) != null &&
                      this.field_s.a(param4 ^ 17, -1 + this.field_n, this.field_r, this.field_A).field_g == this.field_g + 3) {
                      var11_intLifetime1Lifetime3++;
                    }
                    if (null != this.field_s.a(89, this.field_n + 1, this.field_r, this.field_A) &&
                      this.field_s.a(-121, 1 + this.field_n, this.field_r, this.field_A).field_g == 3 + this.field_g) {
                      var11_intLifetime1Lifetime3 += 2;
                    }
                    if (var11_intLifetime1Lifetime3 == 3) {
                      var11_intLifetime1Lifetime3 = 0;
                      this.field_g = this.field_g + 3;
                      if ((this.field_e & 16) == 16) {
                        this.a(1, false, -93);
                      }
                      if ((1 & this.field_e) == 1) {
                        this.a(1, true, param4 ^ 18);
                        this.a(1, false, param4 - 225);
                      }
                    }
                    if (var9Lifetime1 == null) {
                      dm.field_a[this.field_g + var11_intLifetime1Lifetime3].c(-32 + param0, var8Lifetime1 - 64, 200);
                    } else {
                      ((ci) (var9Lifetime1)).a();
                      dm.field_a[this.field_g + var11_intLifetime1Lifetime3].c(32, 60, 200);
                      k.field_f.a(0);
                    }
                    if (this.field_s.field_i != null) {
                      this.field_s.field_i.a(-32 + param0, -64 + var8Lifetime1, this.field_r, dm.field_a[var11_intLifetime1Lifetime3 + this.field_g], true, 28144);
                    }
                  }
                }
                if (this.field_k >= 0) {
                  if (0 != this.field_k % 4) {
                    if (var9Lifetime1 != null) {
                      ((ci) (var9Lifetime1)).a();
                      bk.field_a[this.field_k].c(32, 60, 256);
                      k.field_f.a(0);
                    } else {
                      bk.field_a[this.field_k].c(param0 - 32, -64 + var8Lifetime1, 256);
                    }
                    if (this.field_s.field_i != null) {
                      this.field_s.field_i.a(-32 + param0, var8Lifetime1 - 64, this.field_r, bk.field_a[this.field_k], true, 28144);
                    }
                  } else {
                    var11_intLifetime1Lifetime3 = 0;
                    if (null != this.field_s.a(-124, this.field_n, this.field_r, this.field_A - 1) &&
                      this.field_s.a(83, this.field_n, this.field_r, this.field_A - 1).field_k == 3 + this.field_k) {
                      var11_intLifetime1Lifetime3++;
                    }
                    if (this.field_s.a(111, this.field_n, this.field_r, this.field_A + 1) != null &&
                      this.field_s.a(-78, this.field_n, this.field_r, 1 + this.field_A).field_k == this.field_k + 3) {
                      var11_intLifetime1Lifetime3 += 2;
                    }
                    if (3 == var11_intLifetime1Lifetime3) {
                      var11_intLifetime1Lifetime3 = 0;
                      this.field_k = this.field_k + 3;
                      if ((this.field_e & 32) == 32) {
                        this.a(2, false, 101);
                      }
                      if ((this.field_e & 2) == 2) {
                        this.a(2, true, 121);
                        this.a(2, false, -96);
                      }
                    }
                    if (var9Lifetime1 != null) {
                      ((ci) (var9Lifetime1)).a();
                      bk.field_a[var11_intLifetime1Lifetime3 + this.field_k].c(32, 60, 256);
                      k.field_f.a(0);
                    } else {
                      bk.field_a[this.field_k + var11_intLifetime1Lifetime3].c(param0 - 32, var8Lifetime1 - 64, 256);
                    }
                    if (null != this.field_s.field_i) {
                      this.field_s.field_i.a(param0 - 32, var8Lifetime1 - 64, this.field_r, bk.field_a[var11_intLifetime1Lifetime3 + this.field_k], true, param4 ^ 28045);
                    }
                  }
                }
              }
            }
          }
          if (this.field_p > 0) {
            li.field_a = true;
            if (this.field_p < 64) {
              gi.field_j[-(this.field_p / 4) + 15].b().a(-32 + param0, var8Lifetime1 - 56, 64, 64, 255);
            }
          }
          if (this.field_j >= 0 &&
            jb.field_a) {
            if (!this.field_z &&
              null == this.field_s.field_l) {
              if (this.field_j == 7) {
                if (var9Lifetime1 == null) {
                  stackIn_456_0 = this;
                  stackIn_456_1 = param0 - 32;
                  stackIn_456_2 = -112 + var8Lifetime1;
                  stackIn_456_3 = se.field_c[(3 * this.field_n + this.field_A) % se.field_c.length];
                  stackIn_456_4 = 17335;
                  if (this.field_a) {
                    stackIn_457_0 = this;
                    stackIn_457_5 = 256;
                  } else {
                    stackIn_455_0 = this;
                    if (this.field_d) {
                      stackIn_457_0 = this;
                      stackIn_457_5 = 0;
                    } else {
                      stackIn_457_0 = this;
                      stackIn_457_5 = 128;
                    }
                  }
                  this.a(stackIn_456_1, stackIn_456_2, stackIn_456_3, stackIn_456_4, stackIn_457_5);
                } else {
                  ((ci) (var9Lifetime1)).a();
                  stackIn_450_0 = this;
                  stackIn_450_1 = 32;
                  stackIn_450_2 = 12;
                  stackIn_450_3 = se.field_c[(this.field_A + 3 * this.field_n) % se.field_c.length];
                  stackIn_450_4 = 17335;
                  if (this.field_a) {
                    stackIn_451_0 = this;
                    stackIn_451_5 = 256;
                  } else {
                    stackIn_449_0 = this;
                    if (this.field_d) {
                      stackIn_451_0 = this;
                      stackIn_451_5 = 0;
                    } else {
                      stackIn_451_0 = this;
                      stackIn_451_5 = 128;
                    }
                  }
                  this.a(stackIn_450_1, stackIn_450_2, stackIn_450_3, stackIn_450_4, stackIn_451_5);
                  k.field_f.a(0);
                }
              } else if (var9Lifetime1 == null) {
                stackIn_443_0 = this;
                stackIn_443_1 = -32 + param0;
                stackIn_443_2 = var8Lifetime1 - 64;
                stackIn_443_3 = kg.field_r[this.field_j];
                stackIn_443_4 = 17335;
                if (this.field_a) {
                  stackIn_444_0 = this;
                  stackIn_444_5 = 256;
                } else {
                  stackIn_442_0 = this;
                  if (this.field_d) {
                    stackIn_444_0 = this;
                    stackIn_444_5 = 0;
                  } else {
                    stackIn_444_0 = this;
                    stackIn_444_5 = 128;
                  }
                }
                this.a(stackIn_443_1, stackIn_443_2, stackIn_443_3, stackIn_443_4, stackIn_444_5);
              } else {
                ((ci) (var9Lifetime1)).a();
                stackIn_435_1 = 32;
                stackIn_435_2 = 60;
                stackIn_435_3 = kg.field_r[this.field_j];
                stackIn_435_4 = 17335;
                if (!this.field_a) {
                  stackIn_437_0 = this;
                  if (this.field_d) {
                    stackIn_438_0 = this;
                    stackIn_438_5 = 0;
                  } else {
                    stackIn_438_0 = this;
                    stackIn_438_5 = 128;
                  }
                } else {
                  stackIn_438_0 = this;
                  stackIn_438_5 = 256;
                }
                this.a(stackIn_435_1, stackIn_435_2, stackIn_435_3, stackIn_435_4, stackIn_438_5);
                k.field_f.a(param4 - 125);
              }
            } else {
              if (this.field_j != 7) {
                if (var9Lifetime1 != null) {
                  ((ci) (var9Lifetime1)).a();
                  kg.field_r[this.field_j].b(32, 60);
                  k.field_f.a(0);
                } else {
                  kg.field_r[this.field_j].b(param0 - 32, -64 + var8Lifetime1);
                }
              } else {
                if (var9Lifetime1 != null) {
                  ((ci) (var9Lifetime1)).a();
                  se.field_c[(this.field_n * 3 + this.field_A) % se.field_c.length].b(32, 12);
                  k.field_f.a(0);
                } else {
                  se.field_c[(this.field_A + 3 * this.field_n) % se.field_c.length].b(param0 - 32, var8Lifetime1 - 112);
                }
              }
            }
            if (null != this.field_s.field_i) {
              var11_intLifetime2 = 0;
              if (2 == nc.field_a[this.field_j]) {
                var11_intLifetime2 = 1;
              }
              if (nc.field_a[this.field_j] == 3) {
                var11_intLifetime2 = 1;
              }
              if (5 == nc.field_a[this.field_j]) {
                var11_intLifetime2 = 2;
              }
              if (nc.field_a[this.field_j] == 4) {
                var11_intLifetime2 = 3;
              }
              if (7 == this.field_j) {
                this.field_s.field_i.a((byte) -101, var8Lifetime1 - 112, param0 - 32, se.field_c[(this.field_n * 3 + this.field_A) % se.field_c.length]);
              } else {
                this.field_s.field_i.a(this.field_r, -32 + param0, (byte) -118, var11_intLifetime2, -64 + var8Lifetime1, kg.field_r[this.field_j]);
              }
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_m >= 0) {
            var11 = null;
            var11Lifetime1 = null;
            if (1 == this.field_m) {
              var11Lifetime1 = ui.field_a[11];
            }
            if (this.field_m == 2) {
              var11Lifetime1 = ui.field_a[3];
            }
            if (this.field_m == 3) {
              var11Lifetime1 = ui.field_a[11];
            }
            if (4 == this.field_m) {
              var11Lifetime1 = ui.field_a[7];
            }
            if (5 == this.field_m) {
              var11Lifetime1 = ui.field_a[15];
            }
            if (6 == this.field_m) {
              var11Lifetime1 = ui.field_a[15];
            }
            if (this.field_m == 7) {
              var11Lifetime1 = lf.field_e[3];
            }
            if (this.field_m == 8) {
              var11Lifetime1 = lf.field_e[7];
            }
            if (this.field_m == 9) {
              var11Lifetime1 = lf.field_e[11];
            }
            if (this.field_m == 10) {
              var11Lifetime1 = lf.field_e[15];
            }
            if (11 == this.field_m) {
              var11Lifetime1 = wb.field_h[3];
            }
            if (var11Lifetime1 != null) {
              if (!this.field_z &&
                null == this.field_s.field_l &&
                !this.field_a) {
                if (var9Lifetime1 == null) {
                  this.a(param0 - ((bg) (var11Lifetime1)).field_f / 2, -((bg) (var11Lifetime1)).field_i + var8Lifetime1 + 15, ((bg) (var11Lifetime1)).b(), 17335, 0);
                } else {
                  ((ci) (var9Lifetime1)).a();
                  this.a(-(((bg) (var11Lifetime1)).field_f / 2) + 64, 15 + (124 - ((bg) (var11Lifetime1)).field_i), ((bg) (var11Lifetime1)).b(), 17335, 0);
                  k.field_f.a(0);
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (var9Lifetime1 == null) {
                  ((bg) (var11Lifetime1)).b(-(((bg) (var11Lifetime1)).field_f / 2) + param0, 15 + var8Lifetime1 - ((bg) (var11Lifetime1)).field_i, this.field_t);
                } else {
                  ((ci) (var9Lifetime1)).a();
                  ((bg) (var11Lifetime1)).b(64 - ((bg) (var11Lifetime1)).field_f / 2, 15 + (124 - ((bg) (var11Lifetime1)).field_i), this.field_t);
                  k.field_f.a(0);
                }
              }
            }
          }
          if (null != this.field_C) {
            this.field_C.a(param0, param1, param2, param3, (byte) 125, param5);
          }
          if (var9Lifetime1 != null) {
            u.field_a.a();
            ((ci) (var9Lifetime1)).d(0, 0);
            if (null != this.field_s.field_i &&
              this.field_s.field_i.field_L > 0) {
              c.a((byte) -86, u.field_a, 16777215);
              c.a((byte) -86, u.field_a, 16744576);
              c.a((byte) -86, u.field_a, 16728128);
              c.a((byte) -86, u.field_a, 8388608);
              c.a((byte) -86, u.field_a, 4194304);
            } else {
              c.a((byte) -86, u.field_a, 16777215);
              c.a((byte) -86, u.field_a, 8454016);
              c.a((byte) -86, u.field_a, 4259648);
              c.a((byte) -86, u.field_a, 32768);
              c.a((byte) -86, u.field_a, 16384);
            }
            ((ci) (var9Lifetime1)).b(0, 0, 0);
            k.field_f.a(param4 ^ 125);
            hb.field_n = var8Lifetime1 - 124;
            ug.field_b = -64 + param0;
            ((ci) (var9Lifetime1)).b(param0 - 64, var8Lifetime1 - 124);
          }
          stackIn_521_0 = param1;
          return stackIn_521_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_524_0 = var7;
          stackIn_524_1 = new StringBuilder().append("dl.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_525_2 = "null";
          } else {
            stackIn_525_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_524_0), ((StringBuilder) (Object) stackIn_524_1).append(stackIn_525_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var42 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = Terraphoenix.field_V;
        try {
          if (param10 >= 0 &&
            ob.field_h > param12) {
            if (param16 < 0 &&
              0 > param5 &&
              0 > param7) {
              return;
            }
            if (ob.field_i <= param16 &&
              param5 >= ob.field_i &&
              param7 >= ob.field_i) {
              return;
            }
            if (!param0) {
              field_o = (String) null;
            }
            var34 = -param12 + param10;
            if (param4 == param12) {
              if (param10 == param12) {
                var19 = 0;
                var24 = 0;
                var26 = param11;
                var23 = 0;
                var17_int = param16 << 16;
                var31 = 0;
                var28 = 0;
                var30 = param13;
                var18 = param5 << 16;
                var32 = 0;
                var22 = param9;
                var25 = param15;
                var29 = param6;
                var21 = param14;
                var20 = 0;
                var27 = 0;
              } else {
                var35 = param10 - param4;
                if (param5 <= param16) {
                  var29 = param13 << 16;
                  var21 = param9 << 16;
                  var18 = param16 << 16;
                  var31 = (param2 - param13 << 16) / var35;
                  var28 = (param8 - param15 << 16) / var34;
                  var32 = (-param6 + param2 << 16) / var34;
                  var23 = (param1 - param9 << 16) / var35;
                  var26 = param15 << 16;
                  var17_int = param5 << 16;
                  var19 = (param7 - param5 << 16) / var35;
                  var20 = (param7 - param16 << 16) / var34;
                  var30 = param6 << 16;
                  var27 = (-param11 + param8 << 16) / var35;
                  var24 = (-param14 + param1 << 16) / var34;
                  var25 = param11 << 16;
                  var22 = param14 << 16;
                } else {
                  var25 = param15 << 16;
                  var27 = (param8 - param15 << 16) / var34;
                  var17_int = param16 << 16;
                  var20 = (param7 - param5 << 16) / var35;
                  var29 = param6 << 16;
                  var32 = (-param13 + param2 << 16) / var35;
                  var23 = (-param14 + param1 << 16) / var34;
                  var21 = param14 << 16;
                  var31 = (param2 - param6 << 16) / var34;
                  var24 = (param1 - param9 << 16) / var35;
                  var30 = param13 << 16;
                  var28 = (-param11 + param8 << 16) / var35;
                  var18 = param5 << 16;
                  var26 = param11 << 16;
                  var22 = param9 << 16;
                  var19 = (-param16 + param7 << 16) / var34;
                }
              }
              var33 = 0;
              if (param12 < 0) {
                param12 = Math.min(-param12, param4 - param12);
                var17_int = var17_int + param12 * var19;
                var22 = var22 + param12 * var24;
                var30 = var30 + var32 * param12;
                var25 = var25 + param12 * var27;
                var21 = var21 + param12 * var23;
                var26 = var26 + param12 * var28;
                var29 = var29 + param12 * var31;
                var18 = var18 + var20 * param12;
                param12 = 0;
              }
            } else {
              var30 = param6 << 16;
              var29 = param6 << 16;
              var18 = param16 << 16;
              var17_int = param16 << 16;
              var22 = param14 << 16;
              var21 = param14 << 16;
              var26 = param15 << 16;
              var25 = param15 << 16;
              var35 = -param12 + param4;
              var20 = (param7 - param16 << 16) / var34;
              var19 = (-param16 + param5 << 16) / var35;
              if (var19 >= var20) {
                var33 = 1;
                var27 = (param8 - param15 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var32 = (-param6 + param13 << 16) / var35;
                var24 = (param9 - param14 << 16) / var35;
                var23 = (-param14 + param1 << 16) / var34;
                var31 = (param2 - param6 << 16) / var34;
                var28 = (param11 - param15 << 16) / var35;
              } else {
                var31 = (-param6 + param13 << 16) / var35;
                var28 = (param8 - param15 << 16) / var34;
                var24 = (param1 - param14 << 16) / var34;
                var27 = (param11 - param15 << 16) / var35;
                var33 = 0;
                var32 = (param2 - param6 << 16) / var34;
                var23 = (-param14 + param9 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param12) {
                if (0 > param4) {
                  param12 = -param12 + param4;
                  var26 = var26 + var28 * param12;
                  var18 = var18 + param12 * var20;
                  var22 = var22 + param12 * var24;
                  var17_int = var17_int + param12 * var19;
                  var21 = var21 + param12 * var23;
                  var29 = var29 + var31 * param12;
                  var25 = var25 + param12 * var27;
                  var30 = var30 + var32 * param12;
                  param12 = param4;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param12 = -param12;
                  var17_int = var17_int + var19 * param12;
                  var26 = var26 + param12 * var28;
                  var30 = var30 + var32 * param12;
                  var18 = var18 + var20 * param12;
                  var22 = var22 + var24 * param12;
                  var29 = var29 + param12 * var31;
                  var21 = var21 + var23 * param12;
                  var25 = var25 + var27 * param12;
                  param12 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = ob.field_d[param12];
                while (param4 > param12) {
                  var37 = var17_int >> 16;
                  if (ob.field_i > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (var22 - var21) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var37 + var38 >= ob.field_i) {
                        var38 = -1 + (-var37 + ob.field_i);
                      }
                      if (var37 < 0) {
                        fl.a(var38 + var37, param3, var41, 6, var25 - var37 * var40, -(var37 * var39) + var21, -(var41 * var37) + var29, var40, var36Lifetime2, var39);
                      } else {
                        fl.a(var38, param3, var41, 6, var25, var21, var29, var40, var37 + var36Lifetime2, var39);
                      }
                    } else {
                      if (var37 >= 0 &&
                        var37 < ob.field_i) {
                        fl.a(var38, param3, 0, 6, var25, var21, var29, 0, var37 + var36Lifetime2, 0);
                      }
                    }
                  }
                  param12++;
                  if (param12 >= ob.field_h) {
                    return;
                  }
                  var18 = var18 + var20;
                  var26 = var26 + var28;
                  var25 = var25 + var27;
                  var29 = var29 + var31;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                  var17_int = var17_int + var19;
                  var21 = var21 + var23;
                  var36Lifetime2 = var36Lifetime2 + l.field_k;
                }
              }
              var36Lifetime3 = param10 - param4;
              if (var36Lifetime3 == 0) {
                var19 = 0;
                var31 = 0;
                var24 = 0;
                var20 = 0;
                var23 = 0;
                var32 = 0;
                var27 = 0;
                var28 = 0;
              } else {
                var37Lifetime2 = param7 << 16;
                var38Lifetime2 = param1 << 16;
                var39Lifetime2 = param8 << 16;
                if (var33 == 0) {
                  var25 = param11 << 16;
                  var29 = param13 << 16;
                  var21 = param9 << 16;
                  var17_int = param5 << 16;
                } else {
                  var26 = param11 << 16;
                  var22 = param9 << 16;
                  var18 = param5 << 16;
                  var30 = param13 << 16;
                }
                var40Lifetime2 = param2 << 16;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
              }
            }
            if (param12 < 0) {
              param12 = -param12;
              var30 = var30 + param12 * var32;
              var25 = var25 + param12 * var27;
              var18 = var18 + var20 * param12;
              var17_int = var17_int + var19 * param12;
              var29 = var29 + var31 * param12;
              var21 = var21 + param12 * var23;
              var22 = var22 + param12 * var24;
              var26 = var26 + param12 * var28;
              param12 = 0;
            }
            var35Lifetime1 = ob.field_d[param12];
            while (param10 > param12) {
              var36Lifetime1 = var17_int >> 16;
              if (ob.field_i > var36Lifetime1) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (0 == var37Lifetime1) {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < ob.field_i) {
                    fl.a(var37Lifetime1, param3, 0, 6, var25, var21, var29, 0, var36Lifetime1 + var35Lifetime1, 0);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (ob.field_i <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = -1 - var36Lifetime1 + ob.field_i;
                  }
                  if (var36Lifetime1 < 0) {
                    fl.a(var36Lifetime1 + var37Lifetime1, param3, var40Lifetime1, 6, -(var39Lifetime1 * var36Lifetime1) + var25, var21 - var38Lifetime1 * var36Lifetime1, var29 - var40Lifetime1 * var36Lifetime1, var39Lifetime1, var35Lifetime1, var38Lifetime1);
                  } else {
                    fl.a(var37Lifetime1, param3, var40Lifetime1, 6, var25, var21, var29, var39Lifetime1, var35Lifetime1 + var36Lifetime1, var38Lifetime1);
                  }
                }
              }
              param12++;
              if (ob.field_h <= param12) {
                return;
              }
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var29 = var29 + var31;
              var26 = var26 + var28;
              var30 = var30 + var32;
              var22 = var22 + var24;
              var21 = var21 + var23;
              var35Lifetime1 = var35Lifetime1 + l.field_k;
              var18 = var18 + var20;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_78_0 = var17;
          stackIn_78_1 = new StringBuilder().append("dl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final void a(int param0) {
        dl dupTemp$0 = null;
        dl dupTemp$1 = null;
        double stackIn_116_0 = 0.0;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_117_3 = 0;
        this.field_e = 0;
        if (0 <= this.field_g) {
          if (1 == nh.field_E[this.field_g]) {
            this.a(1, true, param0 ^ 106);
          }
          if (nh.field_E[this.field_g] == 2) {
            this.a(1, false, -68);
          }
          if (3 == nh.field_E[this.field_g]) {
            this.a(1, true, 110);
            this.field_i = this.field_i | 1;
            dupTemp$0 = this.field_s.a(92, this.field_n, this.field_r, -1 + this.field_A);
            dupTemp$0.field_i = dupTemp$0.field_i | 4;
          }
        }
        if (0 <= this.field_k) {
          if (nh.field_E[this.field_k] == 1) {
            this.a(2, true, -71);
          }
          if (nh.field_E[this.field_k] == 2) {
            this.a(2, false, param0 ^ 89);
          }
          if (nh.field_E[this.field_k] == 3) {
            this.a(2, true, 92);
            this.field_i = this.field_i | 2;
            dupTemp$1 = this.field_s.a(111, this.field_n - 1, this.field_r, this.field_A);
            dupTemp$1.field_i = dupTemp$1.field_i | 8;
          }
        }
        this.field_v = param0;
        if (this.field_b == -1) {
          this.field_v = -1;
        }
        if (this.field_b == 0 &&
          this.field_s.field_i.field_G.field_Bb == 11) {
          this.field_b = 12;
        }
        boolean decompiledFrameRemainder1 = true;
        if (this.field_b == 1) {
          if (this.field_s.field_i.field_G.field_Bb == 11) {
            this.field_b = 13;
          }
          if (this.field_b != 2) {
            if (((3 == this.field_b)) &&
              ((this.field_s.field_i.field_G.field_Bb == 11))) {
              this.field_b = 1;
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            if (this.field_s.field_i.field_G.field_Bb != 11) {
              if (((3 == this.field_b)) &&
                ((this.field_s.field_i.field_G.field_Bb == 11))) {
                this.field_b = 1;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              this.field_b = 13;
            }
          }
        } else {
          if (this.field_b != 2) {
            if (((3 == this.field_b)) &&
              ((this.field_s.field_i.field_G.field_Bb == 11))) {
              this.field_b = 1;
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            if (this.field_s.field_i.field_G.field_Bb != 11) {
              if (((3 == this.field_b)) &&
                ((this.field_s.field_i.field_G.field_Bb == 11))) {
                this.field_b = 1;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              this.field_b = 13;
            }
          }
        }
        if ((decompiledFrameRemainder1) && (3 == this.field_b &&
          this.field_s.field_i.field_G.field_Bb == 11)) {
          this.field_b = 1;
        }
        this.field_d = false;
        if (4 == this.field_b ||
          this.field_b == 14 ||
          this.field_b == 15) {
          this.field_d = true;
        }
        if (this.field_j == 34) {
          this.field_d = true;
        }
        if (this.field_c != null &&
          this.field_c.field_d) {
          this.field_d = true;
        }
        if (this.field_C != null &&
          7 == this.field_j) {
          this.field_C.field_j = -1;
        }
        if (this.field_b == 5) {
          this.field_d = false;
        }
        if (null == this.field_C) {
          if (this.field_v != -1) {
            this.field_C = new dl(this.field_A, this.field_n, 1 + this.field_r, this.field_s);
            this.field_C.field_c = this;
            this.field_C.a(0);
          }
        } else {
          this.field_C.field_c = this;
          this.field_C.a(param0 + 0);
        }
        if (this.field_c != null &&
          this.field_c.field_j == 7) {
          this.field_j = -1;
        }
        if (this.field_j > -1 &&
          nc.field_a[this.field_j] != 0) {
          this.field_v = nc.field_a[this.field_j];
          if (nc.field_a[this.field_j] == 5) {
            this.field_v = 0;
            if (null != this.field_C) {
              this.field_C.field_v = 5;
            }
          }
          if (4 == nc.field_a[this.field_j]) {
            this.field_v = 4;
            if (null != this.field_C) {
              this.field_C.field_v = 0;
            }
          }
        }
        this.field_u = true;
        if (!this.field_s.b(this.field_A, this.field_n, -127, 1 + this.field_r) ||
          !this.field_s.b(1 + this.field_A, this.field_n + 1, -101, 1 + this.field_r) ||
          !this.field_s.b(this.field_A + 2, 2 + this.field_n, -99, 1 + this.field_r) ||
          !this.field_s.b(1 + this.field_A, 2 + this.field_n, -121, this.field_r + 1) ||
          !this.field_s.b(this.field_A + 2, 1 + this.field_n, -108, this.field_r + 1) ||
          !this.field_s.b(1 + this.field_A, this.field_n, -115, this.field_r + 1) ||
          !this.field_s.b(this.field_A, 1 + this.field_n, -96, 1 + this.field_r)) {
          this.field_u = false;
        }
        boolean decompiledFrameRemainder0 = true;
        this.field_q = -1;
        this.field_z = false;
        this.field_a = false;
        if (this.field_s.field_i.field_G.field_db ||
          this.field_s.field_i.field_G.field_Bb == 0 ||
          1 == this.field_s.field_i.field_G.field_Bb ||
          this.field_s.field_i.field_G.field_Bb == 2 ||
          3 == this.field_s.field_i.field_G.field_Bb ||
          this.field_s.field_i.field_G.field_Bb == 7 ||
          9 == this.field_s.field_i.field_G.field_Bb ||
          11 == this.field_s.field_i.field_G.field_Bb) {
          if (-1 != this.field_j) {
            if (((this.field_r == 0)) &&
              ((this.field_v == -1))) {
              this.field_j = -1;
              this.field_b = 3;
              this.field_v = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (-1 == this.field_b) {
              if (((this.field_r == 0)) &&
                ((this.field_v == -1))) {
                this.field_j = -1;
                this.field_b = 3;
                this.field_v = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_d) {
                if (((this.field_r == 0)) &&
                  ((this.field_v == -1))) {
                  this.field_j = -1;
                  this.field_b = 3;
                  this.field_v = 0;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_116_0 = Math.random() * 100.0;
                stackIn_116_1 = -(this.field_r * 5);
                stackIn_116_2 = 5;
                if (this.field_g == -1 &&
                  this.field_k == -1) {
                  stackIn_117_3 = 0;
                } else {
                  stackIn_117_3 = 20;
                }
                if (stackIn_116_0 < (double)(stackIn_116_1 + (stackIn_116_2 + stackIn_117_3))) {
                  this.field_q = (int)(12.0 * Math.random());
                }
              }
            }
          }
        }
        if ((decompiledFrameRemainder0) && (this.field_r == 0 &&
          this.field_v == -1)) {
          this.field_j = -1;
          this.field_b = 3;
          this.field_v = 0;
        }

    }

    dl(int param0, int param1, int param2, dk param3) {
        try {
          this.field_B = false;
          this.field_m = -1;
          this.field_x = 1;
          this.field_k = -1;
          this.field_r = param2;
          this.field_z = false;
          this.field_u = false;
          this.field_l = param2 * 100;
          this.field_A = param0;
          this.field_j = -1;
          this.field_v = -1;
          this.field_h = null;
          this.field_c = null;
          this.field_g = -1;
          this.field_C = null;
          this.field_n = param1;
          this.field_b = -1;
          this.field_i = 0;
          this.field_e = 0;
          this.field_s = param3;
          this.field_a = false;
          if (this.field_r == 0) {
            this.field_b = 0;
            this.field_v = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Base Score:";
        field_f = new int[8192];
    }
}
