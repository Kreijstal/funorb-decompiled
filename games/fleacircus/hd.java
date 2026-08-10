/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hd {
    static int field_g;
    static int field_c;
    static int field_b;
    static int[] field_h;
    static String field_f;
    static String field_e;
    static vc field_a;
    static String field_d;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        java.awt.Component var9;
        var8 = fleas.field_A ? 1 : 0;
        if (vg.field_z >= 0) {
          L0: {
            var3 = param0 + -135;
            var4 = -35 + param1;
            var5 = 256;
            if (-76 >= (vg.field_z ^ -1)) {
              break L0;
            } else {
              var5 = (vg.field_z << 1402836776) / 75;
              break L0;
            }
          }
          L1: {
            if (200 < vg.field_z) {
              var5 = (250 + -vg.field_z << 101175016) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            r.a(nj.field_b, 45);
            bl.b();
            gb.c();
            mj.a(-515966495);
            if (256 > var5) {
              gb.g(0, 0, gb.field_d, gb.field_k, 0, -var5 + 256);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ia.a(-74);
            if (150 <= vg.field_z) {
              pl.field_e.c(var3 + 15, 10 + var4, var5);
              break L3;
            } else {
              nj.field_b.e(var3, var4);
              break L3;
            }
          }
          L4: {
            var6 = vg.field_z + -125;
            if (0 >= var6) {
              break L4;
            } else {
              if (50 > var6) {
                if (20 <= var6) {
                  if ((var6 ^ -1) <= -31) {
                    var7 = 256 * (-var6 + 50) / 20;
                    uc.field_d.a(var3, var4, var7);
                    break L4;
                  } else {
                    uc.field_d.a(var3, var4, 256);
                    break L4;
                  }
                } else {
                  var7 = var6 * 256 / 20;
                  uc.field_d.a(var3, var4, var7);
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (param2 == -27794) {
              break L5;
            } else {
              var9 = (java.awt.Component) null;
              hd.a(-21, (ei) null, 14, -111, -71, (ce) null, (java.awt.Component) null, false);
              break L5;
            }
          }
          L6: {
            var6 = vg.field_z + -140;
            if (-1 <= (var6 ^ -1)) {
              break L6;
            } else {
              L7: {
                var7 = 256;
                if (20 <= var6) {
                  break L7;
                } else {
                  var7 = var6 * 256 / 20;
                  break L7;
                }
              }
              ge.field_f.c(15 + var3, 10 + var4, var7 * var5 >> 2071229544);
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0, byte[] param1);

    final static wh a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        wh[] var3 = null;
        int var4 = 0;
        wh var5 = null;
        int var6 = 0;
        java.awt.Component var7 = null;
        wh stackIn_6_0 = null;
        wh stackIn_11_0 = null;
        wh stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = ck.a(-5174, "jagex-last-login-method", param1);
              if (param0) {
                break L1;
              } else {
                var7 = (java.awt.Component) null;
                hd.a(98, (ei) null, -46, 17, -94, (ce) null, (java.awt.Component) null, true);
                break L1;
              }
            }
            if (var2 == null) {
              stackIn_6_0 = bf.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = hc.a((byte) -116);
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackIn_14_0 = bf.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (!var5.a((byte) -38, var2)) {
                    var4++;
                    continue L2;
                  } else {
                    stackIn_11_0 = (wh) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("hd.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static boolean a(int param0) {
        fg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        fg var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (fg) ((Object) jk.field_m.c((byte) 47));
            var1 = var4;
            if (var1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_k) {
                  var2 = 73 / ((-19 - param0) / 56);
                  stackIn_18_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L2: {
                    if (var4.field_n[var2] == null) {
                      break L2;
                    } else {
                      if (var4.field_n[var2].field_b != 0) {
                        break L2;
                      } else {
                        stackIn_10_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (var4.field_s[var2] != null) {
                      if (-1 != (var4.field_s[var2].field_b ^ -1)) {
                        break L3;
                      } else {
                        stackIn_15_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "hd.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        if (param0 != -75) {
            field_d = (String) null;
        }
        field_e = null;
        field_f = null;
        field_d = null;
    }

    abstract byte[] b(int param0);

    final static void a(int param0, ei param1, int param2, int param3, int param4, ce param5, java.awt.Component param6, boolean param7) {
        la.a(param4, param7, 10);
        db.field_J = la.a(param5, param6, 0, param2);
        if (param3 < 2) {
            return;
        }
        try {
            tg.field_i = la.a(param5, param6, 1, param0);
            qg.field_f = new ke();
            ng.field_c = param0 * 1000 / param4;
            tg.field_i.b(qg.field_f);
            gg.field_h = param1;
            gg.field_h.b(17, th.field_D);
            db.field_J.b(gg.field_h);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "hd.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    static {
        we.a(50, -128);
        field_h = new int[2];
        field_e = "Music: ";
        field_f = "Passwords must be between 5 and 20 letters and numbers";
        field_a = new vc();
        field_d = "<%0>Recessed Wall:<%1> Fleas pass through these normally, but the green switches turn them into normal walls, killing any fleas still on these squares when that happens.";
    }
}
