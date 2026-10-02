/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ee implements ta, pl {
    private hc field_E;
    static volatile int field_C;
    vh field_D;
    private hk field_H;
    static Sprite field_F;
    static String createIneligibleText;
    static long field_G;
    private hk field_J;

    private final boolean h(byte param0) {
        if (!this.a(-115, (nl) (this.field_E))) {
            return false;
        }
        if (param0 != -118) {
            this.field_H = (hk) null;
            return true;
        }
        return true;
    }

    public hi() {
        super(0, 0, 496, 0, (dh) null);
        this.field_E = new hc("", (bb) null, 12);
        ff var1 = new ff(hh.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, ng.field_F.field_o, -1, 2147483647, true);
        el var2 = new el(sb.loginNoDisplayNameText, var1, (bb) null);
        this.field_H = new hk(ec.okText, (bb) null);
        this.field_J = new hk(ck.cancelText, (bb) null);
        this.field_E.field_j = ud.createDisplayNameTooltipText;
        this.field_E.a((byte) -58, new uk(this.field_E));
        this.field_H.field_D = false;
        this.field_H.field_q = (dh) ((Object) new ml());
        this.field_J.field_q = (dh) ((Object) new fh());
        this.field_E.field_q = (dh) ((Object) new ac(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(50, 270, (byte) -8, var3, 20);
        int var5 = 200;
        this.b((byte) -110, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, -12037, 170, this.field_E, gk.createDisplayNameHintText, wj.createDisplayNameText));
        this.field_H.a(40, var5, (byte) -23, var3, -var5 + 496 >> 1);
        this.field_J.a(40, 60, (byte) -85, var3 + 15, 3 + var4);
        this.field_J.field_u = (bb) (this);
        this.field_H.field_u = (bb) (this);
        this.b((byte) -102, this.field_H);
        this.b((byte) -105, this.field_J);
        this.field_D = new vh((ta) (this));
        this.field_D.a(150, -60 + this.field_r + (-this.field_E.field_v - this.field_E.field_r), (byte) -54, 20, 60 + this.field_E.field_v + this.field_E.field_r);
        this.b((byte) -102, this.field_D);
        this.a(var4 + 55 + var3, 496, (byte) -55, 0, 0);
    }

    private final int a(int param0, int param1, String param2, String param3, int param4, int param5, el param6) {
        RuntimeException var8 = null;
        pi var9 = null;
        int var10 = 0;
        hd var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new hd(20, param0, param5 + 120, 25, param6, false, 120, 3, ng.field_F, 16777215, param2);
          var10 = -110 / ((70 - param1) / 33);
          this.b((byte) -108, var11);
          var9 = new pi(((nl) ((Object) param6)).a((byte) -113), param3, 126, param0 + var11.field_h, 25 + param5, param4);
          var9.field_u = (bb) (this);
          this.b((byte) -115, var9);
          stackIn_1_0 = var9.field_h + var11.field_h;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var8);

          stackIn_4_1 = new StringBuilder().append("hi.O(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
            stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
            stackIn_5_2 = "null";
          } else {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
            stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
            stackIn_5_2 = "{...}";
          }


          stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

          if (param3 == null) {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }


          stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');

          if (param6 == null) {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, nf param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        fd stackIn_40_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        fd var21 = null;
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
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        nf var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = Geoblox.field_C;
        try {
          L0: {
            var44 = param5;
            if (null != var44.field_n) {
              if (var44.field_v > 1) {
                var60 = var44.field_n;
                va.a(0, var60, 0, uh.field_x, (byte) -85);
                break L0;
              }
            }
            vc.d(2971);
          }
          if (param3 != 6562) {
            return;
          }
          {
            var54 = new int[param5.field_m];
            var49 = var54;
            var41 = var49;
            var8 = var41;
            var64 = new int[param5.field_m];
            var62 = ok.field_h;
            var61 = oa.field_f;
            var63 = gi.field_b;
            for (var13 = 0; param5.field_m > var13; var13++) {
              var14 = var61[var13] * param7 + param4 * var62[var13] + var63[var13] * param1 >> 8;
              if (0 > var14) {
                var14 = -var14;
              }
              if (var14 >= 0) {
                if (128 <= var14) {
                  stackIn_18_0 = 256;
                } else {
                  stackIn_18_0 = 128 + var14;
                }
              } else {
                stackIn_18_0 = 128;
              }
              var14 = stackIn_18_0;
              var15 = param0 * var63[var13] + (param2 * var62[var13] + param6 * var61[var13]) >> 8;
              stackIn_20_0 = jf.field_b;

              if (var15 < 0) {
                stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                stackIn_21_1 = -var15;
              } else {
                stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                stackIn_21_1 = var15;
              }
              var15 = stackIn_21_0[stackIn_21_1];
              var14 = var14 * (256 - var15) >>> 8;
              var54[var13] = var14;
              var64[var13] = var15;
            }
            for (var13 = 0; var13 < ch.field_b; var13++) {
              var14 = pj.field_i[var13];
              var15 = param5.field_r[var14];
              var16 = param5.field_B[var14];
              var17 = param5.field_c[var14];
              if (param5.field_P[var14] >= ok.field_h.length) {
                stackIn_27_0 = -1;
              } else {
                stackIn_27_0 = param5.field_P[var14];
              }
              var18 = stackIn_27_0;
              if (ok.field_h.length > param5.field_u[var14]) {
                stackIn_30_0 = param5.field_u[var14];
              } else {
                stackIn_30_0 = -1;
              }
              var19 = stackIn_30_0;
              if (ok.field_h.length > param5.field_e[var14]) {
                stackIn_33_0 = param5.field_e[var14];
              } else {
                stackIn_33_0 = -1;
              }
              L7: {
                var20 = stackIn_33_0;
                if (l.field_i != null) {
                  if (param5.field_G != null) {
                    if (param5.field_G.length > var14) {
                      if (param5.field_G[var14] != -1) {
                        if (l.field_i.length > param5.field_G[var14]) {
                          stackIn_40_0 = l.field_i[param5.field_G[var14]];
                          break L7;
                        }
                      }
                    }
                  }
                }
                stackIn_40_0 = null;
              }
              L9: {
                var21 = stackIn_40_0;
                var22 = sh.field_x[var15];
                var23 = dj.field_N[var15];
                var24 = sh.field_x[var16];
                var25 = dj.field_N[var16];
                var26 = sh.field_x[var17];
                var27 = dj.field_N[var17];
                if (var18 == var19) {
                  if (var20 == var19) {
                    var28 = var54[var18];
                    var29 = var64[var18];
                    if (var21 != null) {
                      stackIn_45_0 = var21.field_a;
                    } else {
                      stackIn_45_0 = 8355711;
                    }
                    var30 = stackIn_45_0;
                    var31 = var30 & 16711935;
                    var32 = 65280 & var30;
                    var33 = (-16711703 & var31 * var28) >>> 8 | -285147392 & var32 * var28 >>> 8;
                    var33 = var33 + var29 * 65793;
                    gi.a(var26, -122, var27, var25, var24, var22, var23, 8355711 & var33 >> 1);
                    break L9;
                  }
                }
                var28 = var54[var18];
                var29 = var54[var19];
                var30 = var54[var20];
                var31 = var64[var18];
                var32 = var64[var19];
                var33 = var64[var20];
                if (var21 != null) {
                  stackIn_49_0 = var21.field_a;
                } else {
                  stackIn_49_0 = 8355711;
                }
                var34 = stackIn_49_0;
                var35 = var34 & 16711935;
                var36 = 65280 & var34;
                var37 = (var28 * var36 & 16711921) >>> 8 | -822148865 & var28 * var35 >>> 8;
                var38 = (var36 * var29 & 16711688) >>> 8 | (var29 * var35 & -16711783) >>> 8;
                var38 = var38 + 65793 * var32;
                var37 = var37 + 65793 * var31;
                var39 = var30 * var36 >>> 8 & 1543569152 | var30 * var35 >>> 8 & -536936193;
                var39 = var39 + var33 * 65793;
                nb.a(255 & var37, 255 & var37 >> 8, var39 >> 16, var39 >> 8 & 255, var25, 255 & var38, var37 >> 16, var23, var26, 255 & var39, -2, var38 >> 16, 255 & var38 >> 8, var24, var22, var27);
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = (RuntimeException) (var8_ref);

          stackIn_54_1 = new StringBuilder().append("hi.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

          if (param5 == null) {
            stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
            stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
            stackIn_55_2 = "null";
          } else {
            stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
            stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
            stackIn_55_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static int a(CharSequence param0, byte[] param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        try {
          var6_int = -param2 + param3;
          if (param5 != 98) {
            stackIn_2_0 = 52;
            return stackIn_2_0;
          }
          {
            for (var7 = 0; var7 < var6_int; var7++) {
              L1: {
                L2: {
                  var8 = param0.charAt(param2 + var7);
                  if (0 < var8) {
                    if (var8 < 128) {
                      break L2;
                    }
                  }
                  if (var8 >= 160) {
                    if (var8 <= 255) {
                      break L2;
                    }
                  }
                  if (var8 == 8364) {
                    param1[var7 + param4] = (byte)-128;
                    break L1;
                  }
                  if (var8 == 8218) {
                    param1[param4 + var7] = (byte)-126;
                    break L1;
                  }
                  if (var8 == 402) {
                    param1[param4 + var7] = (byte)-125;
                    break L1;
                  }
                  if (8222 == var8) {
                    param1[var7 + param4] = (byte)-124;
                    break L1;
                  }
                  if (8230 == var8) {
                    param1[var7 + param4] = (byte)-123;
                    break L1;
                  }
                  if (var8 == 8224) {
                    param1[param4 + var7] = (byte)-122;
                    break L1;
                  }
                  if (var8 == 8225) {
                    param1[var7 + param4] = (byte)-121;
                    break L1;
                  }
                  if (var8 == 710) {
                    param1[var7 + param4] = (byte)-120;
                    break L1;
                  }
                  if (8240 == var8) {
                    param1[var7 + param4] = (byte)-119;
                    break L1;
                  }
                  if (var8 == 352) {
                    param1[param4 + var7] = (byte)-118;
                    break L1;
                  }
                  if (var8 == 8249) {
                    param1[param4 + var7] = (byte)-117;
                    break L1;
                  }
                  if (var8 == 338) {
                    param1[var7 + param4] = (byte)-116;
                    break L1;
                  }
                  if (381 == var8) {
                    param1[var7 + param4] = (byte)-114;
                    break L1;
                  }
                  if (var8 == 8216) {
                    param1[param4 + var7] = (byte)-111;
                    break L1;
                  }
                  if (var8 == 8217) {
                    param1[param4 + var7] = (byte)-110;
                    break L1;
                  }
                  if (var8 == 8220) {
                    param1[var7 + param4] = (byte)-109;
                    break L1;
                  }
                  if (var8 == 8221) {
                    param1[param4 + var7] = (byte)-108;
                    break L1;
                  }
                  if (8226 == var8) {
                    param1[param4 + var7] = (byte)-107;
                    break L1;
                  }
                  if (8211 == var8) {
                    param1[var7 + param4] = (byte)-106;
                    break L1;
                  }
                  if (var8 == 8212) {
                    param1[param4 + var7] = (byte)-105;
                    break L1;
                  }
                  if (var8 == 732) {
                    param1[var7 + param4] = (byte)-104;
                    break L1;
                  }
                  if (var8 == 8482) {
                    param1[param4 + var7] = (byte)-103;
                    break L1;
                  }
                  if (var8 == 353) {
                    param1[param4 + var7] = (byte)-102;
                    break L1;
                  }
                  if (var8 == 8250) {
                    param1[var7 + param4] = (byte)-101;
                    break L1;
                  }
                  if (339 == var8) {
                    param1[var7 + param4] = (byte)-100;
                    break L1;
                  }
                  if (var8 == 382) {
                    param1[var7 + param4] = (byte)-98;
                    break L1;
                  }
                  if (var8 != 376) {
                    param1[var7 + param4] = (byte)63;
                    break L1;
                  }
                  param1[var7 + param4] = (byte)-97;
                  break L1;
                }
                param1[param4 + var7] = (byte)var8;
              }
            }
            stackIn_69_0 = var6_int;
            return stackIn_69_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = (RuntimeException) (var6);

          stackIn_72_1 = new StringBuilder().append("hi.N(");

          if (param0 == null) {
            stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
            stackIn_73_2 = "null";
          } else {
            stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
            stackIn_73_2 = "{...}";
          }


          stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');

          if (param1 == null) {
            stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
            stackIn_76_2 = "null";
          } else {
            stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
            stackIn_76_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(int param0, nl param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lh var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) -98);
          if (var3 == null) {
            stackIn_3_0 = 1;
            return stackIn_3_0 != 0;
          }
          var4 = 37 / ((-70 - param0) / 38);
          var5 = var3.a((byte) -105);
          stackIn_7_0 = (var5 != kk.field_w) ? 0 : 1;
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3_ref);

          stackIn_10_1 = new StringBuilder().append("hi.J(").append(param0).append(',');

          if (param1 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        boolean discarded$1 = false;
        nl var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_J != param4) {
            if (this.field_H == param4) {
              this.f(-50);
            }
          } else {
            ib.d(24107);
          }
          if (param1 != -20) {
            var7 = (nl) null;
            discarded$1 = this.a(-4, (nl) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var6);

          stackIn_10_1 = new StringBuilder().append("hi.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

          if (param4 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(String param0, int param1) {
        hc var3 = null;
        String var4 = null;
        try {
            if (param1 != 20) {
                this.field_J = (hk) null;
            }
            var3 = this.field_E;
            var4 = param0;
            ((dj) ((Object) var3)).a(param1 - 136, var4, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hi.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_H.field_D = this.h((byte) -118);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void i(byte param0) {
        if (param0 > -45) {
            return;
        }
        createIneligibleText = null;
        field_F = null;
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13) {
            discarded$1 = this.h((byte) -45);
          }
          if (super.a(param0, param1 + 0, param2, param3)) {
            stackIn_4_0 = 1;
            return stackIn_4_0 != 0;
          }
          if (98 == param0) {
            stackIn_7_0 = this.a(7305, param3);
            return stackIn_7_0;
          }
          if (param0 != 99) {
            stackIn_12_0 = 0;
            return stackIn_12_0 != 0;
          }
          stackIn_10_0 = this.a(param3, -96);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var5);

          stackIn_15_1 = new StringBuilder().append("hi.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        ((uk) ((Object) this.field_E.a((byte) -117))).c((byte) -80);
        if (param0 != 83) {
            this.field_H = (hk) null;
        }
    }

    private final int a(int param0, int param1, int param2, el param3, String param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -12037) {
            field_G = 55L;
          }
          stackIn_3_0 = this.a(param0, -116, param5, param4, 35, param2, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var7);

          stackIn_6_1 = new StringBuilder().append("hi.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }


          stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

          if (param4 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }


          stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

          if (param5 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        if (!this.h((byte) -118)) {
            return;
        }
        if (param0 >= -42) {
            return;
        }
        ag.c(12607, this.field_E.field_s);
    }

    static {
        field_C = 0;
        createIneligibleText = "Unfortunately you are not eligible to create an account.";
    }
}
