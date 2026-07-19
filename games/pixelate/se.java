/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends jj {
    private fo[] field_m;
    static ei field_o;
    private jm[] field_n;

    final static boolean b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (null == sh.field_e) {
                break L1;
              } else {
                if (!uk.field_s.b(-21)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void c(int param0) {
        jm[] var2 = null;
        fo[] var2_array = null;
        int var3 = 0;
        int var5 = 0;
        jm[] var6 = null;
        fo[] var7 = null;
        int var8 = 0;
        jm var9 = null;
        fo var10 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        super.c(param0);
        var6 = this.field_n;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            var7 = this.field_m;
            var2_array = var7;
            var8 = 0;
            var3 = var8;
            L1: while (true) {
              if (var7.length <= var8) {
                return;
              } else {
                var10 = var7[var8];
                var10.a(-173);
                var8++;
                continue L1;
              }
            }
          } else {
            L2: {
              var9 = var6[var3];
              var9.field_m = var9.field_m + var9.field_e;
              if (-200.0 > var9.field_m) {
                break L2;
              } else {
                if (640.0 < var9.field_m) {
                  break L2;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            var9.a((byte) -114);
            this.e(-1);
            var3++;
            continue L0;
          }
        }
    }

    private final boolean b(byte param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        for (var2 = 0; this.field_n.length - 1 > var2; var2++) {
            if (!(this.field_n[var2].field_l <= this.field_n[1 + var2].field_l)) {
                return false;
            }
        }
        var2 = -99 / ((-7 - param0) / 43);
        return true;
    }

    final static tf[] a(int param0, int param1, int param2, fm param3) {
        RuntimeException var4 = null;
        tf[] stackIn_5_0 = null;
        tf[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tf[] stackOut_6_0 = null;
        tf[] stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (rk.a(param0, false, param3, param1)) {
              if (param2 == 1000) {
                stackOut_6_0 = wa.c(param2 + -1119);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (tf[]) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("se.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(byte param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        int var3 = 0;
        rh var4 = null;
        ue var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4 = (rh) ((Object) de.field_b.c(1504642273));
            L1: while (true) {
              if (var4 == null) {
                var5 = (ue) ((Object) f.field_c.c(1504642273));
                L2: while (true) {
                  if (var5 == null) {
                    L3: {
                      if (param0 > 3) {
                        break L3;
                      } else {
                        discarded$2 = se.b(true);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    uj.a(param1, var5, 65536);
                    var5 = (ue) ((Object) f.field_c.f(1504642273));
                    continue L2;
                  }
                }
              } else {
                sd.a((byte) -76, var4, param1);
                var4 = (rh) ((Object) de.field_b.f(1504642273));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "se.J(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        jm var4 = null;
        fo var4_ref = null;
        int var3 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        t.g(0, 0, 640, 480, 8874, 3368703);
        if (param0) {
            return;
        }
        jm[] var2 = this.field_n;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            eh.field_c[var4.field_n].b((int)var4.field_m, var4.field_c, var4.field_a, var4.field_f, var4.field_t);
        }
        fo[] var2_array = this.field_m;
        int var6 = 0;
        var3 = var6;
        while (var6 < var2_array.length) {
            var4_ref = var2_array[var6];
            var4_ref.b(1);
            var6++;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 36 / ((param0 - 20) / 49);
        jm var5 = this.field_n[param1];
        this.field_n[param1] = this.field_n[param2];
        this.field_n[param2] = var5;
    }

    final static boolean d(int param0) {
        boolean discarded$0 = false;
        if (null != ip.field_y) {
            return true;
        }
        if (param0 != 3782) {
            discarded$0 = se.b(true);
        }
        if (!(pf.field_d.a("benefits", -1))) {
            return false;
        }
        ip.field_y = bi.a("benefits", "members_benefits_borders", pf.field_d, (byte) -89);
        km.field_p = bi.a("benefits", "members_benefits_price", pf.field_d, (byte) -70);
        cf.field_t = bi.a("benefits", "members_benefits_logo", pf.field_d, (byte) -118);
        li.field_h = eh.a("members_benefits_screenshots", "benefits", (byte) 47, pf.field_d);
        bl.a(11833, ip.field_y, po.field_e);
        ni.a(km.field_p, 2, 40, 40, 80, false, -2400, 15, rk.field_e, 80, 0);
        pb.a(-25960, li.field_h);
        sk.a(param0 ^ -3744, cf.field_t);
        return true;
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 != 21476) {
            field_o = (ei) null;
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        L0: while (true) {
          if (this.b((byte) 89)) {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_o = (ei) null;
                break L1;
              }
            }
            return;
          } else {
            var2 = 0;
            L2: while (true) {
              if (-1 + this.field_n.length <= var2) {
                continue L0;
              } else {
                if (this.field_n[var2 - -1].field_l < this.field_n[var2].field_l) {
                  this.a((byte) 108, 1 + var2, var2);
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    se(String param0, tf[] param1) {
        super(param0, param1);
        int var3_int = 0;
        try {
            this.field_n = new jm[10];
            for (var3_int = 0; (var3_int ^ -1) > -11; var3_int++) {
                this.field_n[var3_int] = new jm();
            }
            this.e(-1);
            this.field_m = new fo[4];
            this.field_m[0] = new fo(1400, 150, 400, 500, 1000);
            this.field_m[1] = new fo(1800, 430, 320, 800, 1000);
            this.field_m[2] = new fo(2200, 500, 140, 900, 1000);
            this.field_m[3] = new fo(2600, 230, 220, 700, 1000);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "se.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
