/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vna {
    static nh field_c;
    static su field_a;
    static String[][] field_d;
    vg field_e;
    private vg field_b;

    final vg a(int param0, vg param1) {
        vg var3 = null;
        RuntimeException var3_ref = null;
        vg stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        vg stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
            if (TombRacer.field_G) {
              var3 = this.field_e.field_a;
            }
          } else {
            var3 = this.field_e.field_a;
          }
          if (param0 != -13854) {
            stackIn_5_0 = (vg) null;
            return stackIn_5_0;
          }
          if (this.field_e != var3) {
            this.field_b = var3.field_a;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_b = null;
          stackIn_8_0 = null;
          return (vg) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("vna.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(byte param0, vg param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != param1.field_e) {
            param1.p(47);
          }
          param1.field_a = this.field_e.field_a;
          param1.field_e = this.field_e;
          if (param0 < 87) {
            this.f(54);
          }
          param1.field_e.field_a = param1;
          param1.field_a.field_e = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("vna.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final vg c(byte param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        vg stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vg stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_e.field_e;
          if (param0 != 22) {
            stackIn_2_0 = (vg) null;
            return stackIn_2_0;
          }
          if (var2 == this.field_e) {
            stackIn_5_0 = null;
            return (vg) (stackIn_5_0);
          }
          var2.p(2);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.F(" + param0 + ')');
        }
    }

    final static mu a(boolean param0, int param1, int param2) {
        iv stackIn_7_0;
        int stackIn_7_1;
        boolean stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        int stackIn_7_5;
        boolean stackIn_8_6 = false;
        jea stackIn_46_0 = null;
        String stackIn_47_1 = null;
        jea stackIn_50_0 = null;
        String stackIn_51_1 = null;
        int stackIn_55_0 = 0;
        Object stackIn_107_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vna var4 = null;
        Object var5 = null;
        Object var6 = null;
        mu var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        lja var17 = null;
        String var18 = null;
        int var19 = 0;
        lja var17Lifetime1;
        String var18Lifetime1;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 > -114) {
            vna.a(false, -16, -77);
          }
          stackIn_7_0 = dn.field_b.field_vb;
          stackIn_7_1 = 2;
          stackIn_7_2 = param0;
          stackIn_7_3 = 71;
          stackIn_7_4 = 3 * ((2 + di.field_a) * param1);
          stackIn_7_5 = di.field_a + 2;
          stackIn_8_6 = (dn.field_b.field_vb == lu.field_b);
          boolean decompiledFrameRemainder1 = true;
          var3_int = ((iv) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_8_6) ? 1 : 0;
          var4 = dn.field_b.field_tb.field_J;
          var5 = null;
          if (ae.field_g != 2) {
            is.field_yb.field_r = dt.field_n;
            dqa.field_e.field_X = false;
            if (ae.field_g != 1) {
              dn.field_b.field_vb.field_vb.field_r = nl.field_c;
              if (var19 != 0) {
                dn.field_b.field_vb.field_vb.field_r = tna.field_b;
              }
            } else {
              dn.field_b.field_vb.field_vb.field_r = tna.field_b;
            }
            vsa.a(-106, dn.field_b.field_tb);
            decompiledFrameRemainder1 = (var19 != 0);
          }
          if (decompiledFrameRemainder1) {
            dqa.field_e.field_X = true;
            is.field_yb.field_r = gl.$cfr$intArgs$a$53ce4ab4c593(99, uba.field_h, new String[]{ol.field_b});
            dn.field_b.field_vb.field_vb.field_r = null;
            var6 = null;
            var7 = (mu) (var4.f(-80));
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var7 != null) {
                var8 = 0;
                if (var19 == 0) {
                  if (null == var7.field_J) {
                    var7.field_xb = new jea(0L, lta.field_a);
                    var7.b(-128, var7.field_xb);
                    var7.field_Ab = new jea(0L, iea.field_g);
                    var7.b(-123, var7.field_Ab);
                    var7.field_zb = new jea(0L, lta.field_a);
                    var7.b(-128, var7.field_zb);
                    var7.field_Ab.field_z = 2;
                    var8 = 1;
                    var7.a(-10966);
                  }
                  var7.field_G = dn.field_b.field_tb.field_G;
                  var9 = 0;
                  if (var7.field_Cb != null) {
                    if (var7.field_Cb != ol.field_b) {
                      var10 = 13421568;
                      var11 = 16777062;
                    } else {
                      var11 = 6750054;
                      var10 = 52224;
                    }
                  } else {
                    var11 = 16737894;
                    var10 = 13369344;
                  }
                  var12 = 0;
                  if (null != var7.field_vb &&
                    !var7.field_vb.equals("")) {
                    var7.field_zb.field_R = bfa.field_e;
                    var7.field_zb.field_ab = var11;
                    var12 = 1;
                    var7.field_zb.a(3 + bfa.field_e.field_n, di.field_a, -23776, var9, 0);
                  }
                  var7.field_Ab.field_gb = var11;
                  var7.field_xb.field_gb = var11;
                  var7.field_Ab.field_ab = var11;
                  var7.field_xb.field_ab = var11;
                  var7.field_Ab.field_ib = var10;
                  var7.field_xb.field_ib = var10;
                  var7.field_Ab.field_N = var11;
                  var7.field_xb.field_N = var11;
                  var13 = 0;
                  var14 = var7.field_G - 80 - 2;
                  if (var12 != 0) {
                    var13 = 3 + bfa.field_e.field_n;
                    var14 = var14 - var13;
                  }
                  stackIn_46_0 = var7.field_xb;
                  if (var14 <= 0) {
                    stackIn_47_1 = var7.field_tb;
                  } else {
                    stackIn_47_1 = il.a(var7.field_xb.field_H, var7.field_tb, var14);
                  }
                  stackIn_46_0.field_r = stackIn_47_1;
                  var7.field_xb.a(var14, di.field_a, -23776, var9, var13);
                  stackIn_50_0 = var7.field_Ab;
                  if (var7.field_Cb == null) {
                    stackIn_51_1 = gd.field_K;
                  } else {
                    stackIn_51_1 = var7.field_Cb;
                  }
                  stackIn_50_0.field_r = stackIn_51_1;
                  var7.field_Ab.a(80, di.field_a, -23776, var9, -80 + var7.field_G);
                  stackIn_55_0 = (var7.field_xb.field_r.equals(var7.field_tb)) ? 0 : 1;
                  var15 = stackIn_55_0;
                  var9 = var9 + di.field_a;
                  if (var3_int == 0) {
                    var7.field_O = -var7.field_t + var9;
                  }
                  if (var8 != 0) {
                    dn.field_b.field_tb.a(2, (jea) (var6), var7, (byte) -122);
                  }
                  var6 = var7;
                  if (var7.field_zb == null ||
                    !var7.field_zb.field_o) {
                    if (var7.field_y != 0) {
                      var16 = var7.field_tb;
                      paa.a(dn.field_b.field_vb, -1, var16, 0L, -11635, (int[]) null, var7, -1, (String) null);
                      if (var7.field_Cb != null &&
                        !ab.a(hka.field_b.field_i, (byte) -13) &&
                        !fua.field_g) {
                        if (!ok.field_s) {
                          var17 = hka.field_b;
                          var18 = gl.$cfr$intArgs$a$53ce4ab4c593(114, fj.field_b, new String[]{var16});
                          var17.field_f.a((byte) -79, 8, var18);
                        }
                        var17Lifetime1 = hka.field_b;
                        var18Lifetime1 = gl.$cfr$intArgs$a$53ce4ab4c593(86, ob.field_f, new String[]{var16});
                        var17Lifetime1.field_f.a((byte) -97, 18, var18Lifetime1);
                      }
                      var5 = var7;
                    } else if (var7.field_xb.field_o &&
                      var15 != 0) {
                      qda.field_b = var7.field_tb;
                    }
                  } else {
                    qda.field_b = var7.field_vb;
                  }
                  var7 = (mu) (var4.e(111));
                  continue;
                }
              } else {
                decompiledFrameRemainder0 = (dn.field_b.field_yb.field_y != 0);
                if (decompiledFrameRemainder0) {
                  bl.field_a = new is(dn.field_b.field_yb.field_q, dn.field_b.field_yb.field_A, dn.field_b.field_yb.field_G, dn.field_b.field_yb.field_t, tr.field_c, lw.field_a, kua.field_i, kua.field_i);
                }
              }
              if (decompiledFrameRemainder0) {
                cn.field_k = 0;
              }
              if (0 == dn.field_b.field_wb.field_y) {
                break;
              }
              bl.field_a = new is(dn.field_b.field_wb.field_q, dn.field_b.field_wb.field_A, dn.field_b.field_wb.field_G, dn.field_b.field_wb.field_t, ro.field_q, lw.field_a, kua.field_i, kua.field_i);
              cn.field_k = 1;
              break;
            }
          }
          stackIn_107_0 = var5;
          return (mu) (stackIn_107_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "vna.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final vg a(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vg stackIn_5_0 = null;
        vg stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_b;
          if (this.field_e == var2) {
            this.field_b = null;
            stackIn_2_0 = null;
            return (vg) (stackIn_2_0);
          }
          if (param0 != -1) {
            stackIn_5_0 = (vg) null;
            return stackIn_5_0;
          }
          this.field_b = var2.field_e;
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.M(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        vg var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -16) {
            stackIn_3_0 = 34;
            return stackIn_3_0;
          }
          var2_int = 0;
          var3 = this.field_e.field_a;
          while (var3 != this.field_e) {
            var2_int++;
            var3 = var3.field_a;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          stackIn_8_0 = var2_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "vna.L(" + param0 + ')');
        }
    }

    final boolean d(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14) {
            field_a = (su) null;
          }
          stackIn_7_0 = (this.field_e == this.field_e.field_a);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "vna.I(" + param0 + ')');
        }
    }

    final vg c(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_4_0 = null;
        vg stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_e.field_a;
          var3 = -30 % ((-37 - param0) / 59);
          if (this.field_e == var2) {
            stackIn_4_0 = null;
            return (vg) (stackIn_4_0);
          }
          var2.p(64);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.D(" + param0 + ')');
        }
    }

    final void b(byte param0, vg param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -45) {
            vna.a(true, 11, -23);
          }
          if (null != param1.field_e) {
            param1.p(111);
          }
          param1.field_a = this.field_e;
          param1.field_e = this.field_e.field_e;
          param1.field_e.field_a = param1;
          param1.field_a.field_e = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("vna.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final vg f(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        vg stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vg stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_e.field_a;
          if (param0 != -80) {
            stackIn_2_0 = (vg) null;
            return stackIn_2_0;
          }
          if (this.field_e != var2) {
            this.field_b = var2.field_a;
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          this.field_b = null;
          stackIn_5_0 = null;
          return (vg) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.A(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 <= 87) {
            field_c = (nh) null;
          }
          field_d = (String[][]) null;
          field_c = null;
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "vna.G(" + param0 + ')');
        }
    }

    final vg b(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        vg stackIn_7_0 = null;
        vg stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_e.field_e;
          if (this.field_e == var2) {
            this.field_b = null;
            stackIn_4_0 = null;
            return (vg) (stackIn_4_0);
          }
          if (param0 != 3) {
            stackIn_7_0 = (vg) null;
            return stackIn_7_0;
          }
          this.field_b = var2.field_e;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.E(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException runtimeException = null;
        vg var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          while (true) {
            var2 = this.field_e.field_a;
            if (this.field_e != var2) {
              var2.p(param0 ^ 119);
              if (var3 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          if (param0 != 8) {
            this.a(-64);
          }
          this.field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "vna.N(" + param0 + ')');
        }
    }

    final vg e(int param0) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        vg stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_b;
          if (var2 == this.field_e) {
            this.field_b = null;
            stackIn_4_0 = null;
            return (vg) (stackIn_4_0);
          }
          if (param0 < 106) {
            this.field_b = (vg) null;
          }
          this.field_b = var2.field_a;
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "vna.C(" + param0 + ')');
        }
    }

    public vna() {
        this.field_e = new vg();
        try {
          this.field_e.field_e = this.field_e;
          this.field_e.field_a = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vna.<init>()");
        }
    }

    static {
        field_d = new String[11][];
        field_a = new su(10, 2, 2, 0);
    }
}
