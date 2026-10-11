/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private lm field_n;
    static ll field_d;
    static ri field_j;
    private dh field_f;
    private ej field_p;
    private java.math.BigInteger field_k;
    private rb[] field_h;
    private vi field_b;
    private java.math.BigInteger field_l;
    static String field_g;
    static int field_i;
    static String field_m;
    static ub field_c;
    static volatile int field_o;
    static int field_a;
    static String field_e;

    public static void b(int param0) {
        field_c = null;
        if (param0 >= -51) {
          String var2 = (String) null;
          sg.a(true, (String) null, (gb) null, (String) null);
        }
        field_m = null;
        field_g = null;
        field_e = null;
        field_d = null;
        field_j = null;
    }

    final void c(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (null == this.field_h) {
          return;
        }
        for (var2 = 0; this.field_h.length > var2; var2++) {
          if (null != this.field_h[var2]) {
            this.field_h[var2].d(40);
          }
        }
        if (param0 != -11) {
          return;
        }
        for (var2Lifetime1 = 0; this.field_h.length > var2Lifetime1; var2Lifetime1++) {
          if (this.field_h[var2Lifetime1] != null) {
            this.field_h[var2Lifetime1].f(-1);
          }
        }
    }

    sg(ej param0, dh param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static pg[] a(boolean param0, String param1, gb param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pg[] stackIn_2_0 = null;
        pg[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a((byte) -2, param1);
          if (!param0) {
            stackIn_2_0 = (pg[]) null;
            return stackIn_2_0;
          }
          var5 = param2.a(var4_int, param3, -1);
          stackIn_4_0 = qi.a(var4_int, (byte) 118, var5, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        oc var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        og var9 = null;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        p var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        oj var25 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var31 = null;
        int[] var33 = null;
        var24 = HostileSpawn.field_I ? 1 : 0;
        try {
          var25 = mm.field_m[0];
          var2 = var25.field_j;
          var3 = var2.b(-4);
          var29 = ln.field_a.field_c;
          var26 = var29;
          var4 = var26;
          var33 = ln.field_a.field_f;
          var31 = ln.field_a.field_u;
          var28 = var31;
          var6 = var28;
          var29[var3] = 0;
          var7 = var2.field_e;
          var8 = var2.field_g;
          var9 = var25.field_l;
          var10 = var9.field_f;
          var12 = var9.field_a;
          var14 = (double)var7 + var10;
          var16 = (double)var8 + var12;
          for (var18 = 0; var18 < ib.field_c; var18++) {
            var19 = jn.field_F[var18];
            var20 = var19.field_i;
            var21 = var19.field_j.field_e - var7;
            var22 = -var8 + var19.field_j.field_g;
            if (var21 < 0) {
              var21 = -var21;
            }
            if (0 > var22) {
              var22 = -var22;
            }
            L6: {
              if ((30 < var21 ||
                var22 > 25) &&
                (var20 != 5 &&
                24 != var20)) {
                var19.field_i = -1;
              } else {
                var23 = var20;
                if (var23 != 20 &&
                  var23 != 0 &&
                  var23 != 18) {
                  if (var23 == 23) {
                    pa.a(var19, var3, var29, false);
                    break L6;
                  }
                  if (32 != var23) {
                    switch (var23) {
                      case 9:
                        jm.a(var29, var3, (byte) -128, var19);
                        break L6;
                      case 1:
                        var19.a(8573);
                        var19.field_l.a(2, (byte) 94, var19.field_c);
                        var19.field_e = var19.field_e + 1;
                        if (var19.field_e <= 16) {
                          break L6;
                        }
                        var19.field_i = -1;
                        break L6;
                      case 2:
                        var19.field_e = var19.field_e + 1;
                        if (32 >= var19.field_e) {
                          break L6;
                        }
                        var19.field_i = -1;
                        break L6;
                      case 3:
                        var19.field_e = var19.field_e + 1;
                        if (var19.field_e <= 32) {
                          break L6;
                        }
                        var19.field_i = -1;
                        break L6;
                      case 21:
                        var19.a(8573);
                        var19.field_e = var19.field_e + 1;
                        if (var19.field_e <= 6) {
                          break L6;
                        }
                        var19.field_i = -1;
                        break L6;
                      case 6:
                      case 37:
                      case 8:
                      case 33:
                      case 12:
                      case 13:
                      case 14:
                      case 15:
                      case 16:
                      case 17:
                      case 30:
                      case 36:
                      default:
                        if (var23 != 4 &&
                          var23 != 28) {
                          if (var23 != 5 &&
                            var23 != 24) {
                            if (var23 == 6) {
                              var19.a(8573);
                              if (2 != var4[var19.field_j.b(-4)]) {
                                var19.field_l.a(1, (byte) 94, var19.field_c);
                              }
                              var19.field_e = var19.field_e + 1;
                              if (!(16 >= var19.field_e)) {
                                var19.field_i = -1;
                              }
                            } else {
                              if (var23 == 37) {
                                var19.field_l.field_f = var19.field_l.field_f - Math.sin(3.141592653589793 * var19.field_c / 128.0) * 0.05;
                                var19.field_l.field_a = var19.field_l.field_a - 0.05 * Math.cos(3.141592653589793 * var19.field_c / 128.0);
                                var19.a(8573);
                                if (2 > var4[var19.field_j.b(-4)]) {
                                  var19.field_l.a(1, (byte) 94, var19.field_c);
                                }
                                var19.field_e = var19.field_e + 1;
                                if (!(16 >= var19.field_e)) {
                                  var19.field_i = -1;
                                }
                              } else {
                                if (var23 != 7 &&
                                  var23 != 26) {
                                  if (var23 == 8) {
                                    if (var4[var19.field_j.b(-4)] != 2) {
                                      var19.field_l.a(var19.field_h, (byte) 94, var19.field_c);
                                    }
                                    var19.a(8573);
                                    var19.field_e = var19.field_e + 1;
                                    if (!(32 >= var19.field_e)) {
                                      var19.field_i = -1;
                                    }
                                  } else {
                                    if (var23 != 10 &&
                                      var23 != 25) {
                                      if (var23 != 11 &&
                                        var23 != 34) {
                                        switch (var23) {
                                          case 33:
                                            rj.a(var19, -2312);
                                            break L6;
                                          case 12:
                                            var19.field_e = var19.field_e + 4;
                                            if (var19.field_e <= 128) {
                                              break L6;
                                            }
                                            var19.field_i = -1;
                                            break L6;
                                          case 13:
                                            ml.a((byte) -128, var14, var16, var19, var29, var25, var3);
                                            break L6;
                                          case 14:
                                            he.a(var19, var25, (byte) 110, var16, var14);
                                            break L6;
                                          case 15:
                                            in.a(var14, var19, (byte) 29, var29, var3, var16);
                                            break L6;
                                          case 16:
                                            ei.a(var19, (byte) -116, var33, var3, var29, var31);
                                            break L6;
                                          case 17:
                                            var6[var19.field_j.b(-4)] = 100;
                                            fm.a(var19, true, var20, var29);
                                            break L6;
                                          case 30:
                                            var6[var19.field_j.b(-4)] = 100;
                                            fm.a(var19, true, var20, var29);
                                            break L6;
                                          case 36:
                                          default:
                                            if (var23 != 19 &&
                                              var23 != 29) {
                                              if (var23 != 22 &&
                                                var23 != 27) {
                                                if (var23 != 31 &&
                                                  var23 != 35) {
                                                  if ((var23 == 36)) {
                                                    nf.a(var19, (byte) 70);
                                                  }
                                                } else {
                                                  ia.a(var19, var29, -14808);
                                                }
                                              } else {
                                                hh.a(false, var19, var29);
                                              }
                                              break L6;
                                            }
                                            lj.a(var29, var3, 0, var19);
                                            break L6;
                                        }
                                      }
                                      vd.a(var19, -127);
                                    } else {
                                      ui.a(var16, var29, var19, var3, var20, var14, false);
                                    }
                                  }
                                } else {
                                  vc.a(var3, -11112, var29, var19);
                                }
                              }
                            }
                          } else {
                            sc.a(var3, var19, var29, 1);
                          }
                          break L6;
                        }
                        ng.a((byte) 78, var19, var3, var20, var29);
                        break L6;
                    }
                  }
                }
                pa.a(var19, var3, var29, false);
              }
            }
          }
          for (var18 = -1 + ib.field_c; var18 >= 0; var18--) {
            if (-1 == jn.field_F[var18].field_i) {
              ib.field_c = ib.field_c - 1;
              jn.field_F[var18].field_c = jn.field_F[ib.field_c].field_c;
              jn.field_F[var18].field_l.a(jn.field_F[ib.field_c].field_l, -28860);
              jn.field_F[var18].field_j.a((byte) 46, jn.field_F[ib.field_c].field_j);
              jn.field_F[var18].field_h = jn.field_F[ib.field_c].field_h;
              jn.field_F[var18].field_e = jn.field_F[ib.field_c].field_e;
              jn.field_F[var18].field_i = jn.field_F[ib.field_c].field_i;
            }
          }
          if (!param0) {
            sg.a('ￂ', true);
          }
          var29[var3] = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "sg.B(" + param0 + ')');
        }
    }

    final boolean a(int param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        vi var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_b != null) {
          return true;
        }
        if (this.field_n == null) {
          if (this.field_p.a(20)) {
            return false;
          }
          this.field_n = this.field_p.a((byte) 0, 255, 255, -18986, true);
        }
        if (this.field_n.field_v) {
          return false;
        }
        if (param0 != -26720) {
          return true;
        }
        var10 = new vi(this.field_n.c((byte) 127));
        var10.field_i = 5;
        var3 = var10.l(32270);
        var10.field_i = var10.field_i + var3 * 72;
        var13 = new byte[var10.field_n.length - var10.field_i];
        var11 = var13;
        var4 = var11;
        var10.a(var13.length, 0, var13, param0 + 8539);
        if (this.field_k != null &&
          null != this.field_l) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_k, this.field_l);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = ld.a(var10.field_n, 5, 113, -5 + (var10.field_i - var13.length));
        for (var7 = 0; 64 > var7; var7++) {
          if (var5[1 + var7] != var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_b = var10;
        this.field_h = new rb[var3];
        return true;
    }

    final rb a(boolean param0, int param1, um param2, um param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        rb var9 = null;
        byte[] var13 = null;
        rb stackIn_9_0 = null;
        rb stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_b) {
            throw new RuntimeException();
          }
          if (param1 >= 0 &&
            this.field_h.length > param1) {
            if (this.field_h[param1] != null) {
              stackIn_9_0 = this.field_h[param1];
              return stackIn_9_0;
            }
            this.field_b.field_i = 6 + param1 * 72;
            var6_int = this.field_b.d(8195);
            var7 = this.field_b.d(8195);
            var13 = new byte[64];
            this.field_b.a(64, param4, var13, -18181);
            var9 = new rb(param1, param3, param2, this.field_p, this.field_f, var6_int, var13, var7, param0);
            this.field_h[param1] = var9;
            stackIn_11_0 = var9;
            return stackIn_11_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("sg.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String d(int param0) {
        if (param0 != 24) {
          sg.a('ﾊ', false);
        }
        return bi.field_c[fl.d(-97)];
    }

    final static boolean a(char param0, boolean param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (rf.a(param1, param0)) {
            return true;
          }
          var6 = pk.field_g;
          var2 = var6;
          var3 = 0;
          while (var3 < var6.length) {
            var4 = var6[var3];
            if (~param0 != ~var4) {
              var3++;
              continue;
            }
            return true;
          }
          var2Lifetime1 = i.field_g;
          for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime1.length; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param0 == var4Lifetime1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2_ref), "sg.G(" + param0 + ',' + param1 + ')');
        }
    }

    private sg(ej param0, dh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_p = param0;
          this.field_f = param1;
          this.field_k = param2;
          this.field_l = param3;
          if (!this.field_p.a(20)) {
            this.field_n = this.field_p.a((byte) 0, 255, 255, -18986, true);
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Unfortunately we are unable to create an account for you at this time.";
        field_d = new ll();
        field_m = "PER MONTH";
        field_o = 0;
        field_a = 0;
        field_c = new ub();
        field_e = "Click";
    }
}
