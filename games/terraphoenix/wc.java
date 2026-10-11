/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wc extends vh {
    static int field_r;
    int field_q;
    static int field_s;
    static int field_p;

    abstract boolean d(int param0);

    final static void a(e param0, int param1, int param2, int param3) {
        se dupTemp$0 = null;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        Object stackIn_98_0 = null;
        r stackIn_98_1 = null;
        int stackIn_119_0 = 0;
        RuntimeException stackIn_195_0 = null;
        StringBuilder stackIn_195_1 = null;
        String stackIn_196_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        int var19 = 0;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var11Lifetime2;
        int var12Lifetime2;
        int var13Lifetime2;
        int var14Lifetime2;
        int var15Lifetime2;
        int var16Lifetime2;
        int var9Lifetime1Lifetime1;
        int var17Lifetime1Lifetime1;
        var19 = Terraphoenix.field_V;
        try {
          for (var4_int = 0; param2 >= var4_int; var4_int++) {
            for (var5 = 0; var5 <= param1; var5++) {
              pc.field_b[var4_int][var5] = false;
            }
          }
          if (param3 != -11669) {
            return;
          }
          for (var4_intLifetime1 = 0; rd.field_t > var4_intLifetime1; var4_intLifetime1++) {
            var5Lifetime1 = 1;
            var6 = 32;
            var7 = 32;
            if (p.field_a[var4_intLifetime1].field_g < 0) {
              var5Lifetime1 = 0;
              var7 = 1;
              p.field_a[var4_intLifetime1].field_g = 0;
            }
            if (p.field_a[var4_intLifetime1].field_g > param2) {
              p.field_a[var4_intLifetime1].field_g = param2;
              var7 = 1;
              var5Lifetime1 = 0;
            }
            if (p.field_a[var4_intLifetime1].field_a < 40) {
              var5Lifetime1 = 0;
              var6 = 1;
              p.field_a[var4_intLifetime1].field_a = 40;
            }
            if (param1 < p.field_a[var4_intLifetime1].field_a) {
              p.field_a[var4_intLifetime1].field_a = param1;
              var6 = 1;
              var5Lifetime1 = 0;
            }
            if (var5Lifetime1 != 0 &&
              pc.field_b[p.field_a[var4_intLifetime1].field_g][p.field_a[var4_intLifetime1].field_a]) {
              var7 = 1;
              var6 = 1;
              var5Lifetime1 = 0;
            }
            if (var5Lifetime1 == 0) {
              var8 = p.field_a[var4_intLifetime1].field_g;
              var9 = p.field_a[var4_intLifetime1].field_a;
              var10 = 32767;
              var11 = p.field_a[var4_intLifetime1].field_g - p.field_a[var4_intLifetime1].field_i;
              var12 = p.field_a[var4_intLifetime1].field_g + p.field_a[var4_intLifetime1].field_i;
              var13 = -p.field_a[var4_intLifetime1].field_i + p.field_a[var4_intLifetime1].field_a;
              if (var11 < 0) {
                var11 = 0;
              }
              if (param2 <= var12) {
                var12 = param2;
              }
              var14 = p.field_a[var4_intLifetime1].field_a + p.field_a[var4_intLifetime1].field_i;
              if (var13 < 40) {
                var13 = 40;
              }
              if (param1 <= var14) {
                var14 = param1;
              }
              for (var15 = var11; var12 >= var15; var15 = var15 + var6) {
                for (var16 = var13; var14 >= var16; var16 = var16 + var7) {
                  if (!pc.field_b[var15][var16]) {
                    var17 = Math.abs(var15 - p.field_a[var4_intLifetime1].field_g) + Math.abs(var16 - p.field_a[var4_intLifetime1].field_a);
                    if (var10 > var17) {
                      var9 = var16;
                      var10 = var17;
                      var8 = var15;
                    }
                  }
                }
              }
              if (32767 == var10) {
                dupTemp$0 = p.field_a[var4_intLifetime1];
                dupTemp$0.field_i = dupTemp$0.field_i + 32;
              } else {
                p.field_a[var4_intLifetime1].field_g = var8;
                p.field_a[var4_intLifetime1].field_a = var9;
              }
              if (p.field_a[var4_intLifetime1].field_f == -1) {
                p.field_a[var4_intLifetime1].field_f = p.field_a[var4_intLifetime1].field_g;
                p.field_a[var4_intLifetime1].field_e = p.field_a[var4_intLifetime1].field_a;
              } else {
                if (var10 < p.field_a[var4_intLifetime1].field_i) {
                  p.field_a[var4_intLifetime1].field_i = var10;
                }
                p.field_a[var4_intLifetime1].field_f = (p.field_a[var4_intLifetime1].field_g + p.field_a[var4_intLifetime1].field_f) / 2;
                p.field_a[var4_intLifetime1].field_e = (p.field_a[var4_intLifetime1].field_a + p.field_a[var4_intLifetime1].field_e) / 2;
              }
              if (p.field_a[var4_intLifetime1].field_g - 31 <= 0) {
                stackIn_61_0 = 0;
              } else {
                stackIn_61_0 = -31 + p.field_a[var4_intLifetime1].field_g;
              }
              var11Lifetime2 = stackIn_61_0;
              if (param1 <= 31 + p.field_a[var4_intLifetime1].field_a) {
                stackIn_64_0 = param1;
              } else {
                stackIn_64_0 = p.field_a[var4_intLifetime1].field_a + 31;
              }
              var14Lifetime2 = stackIn_64_0;
              if (param2 > p.field_a[var4_intLifetime1].field_g + 31) {
                stackIn_67_0 = 31 + p.field_a[var4_intLifetime1].field_g;
              } else {
                stackIn_67_0 = param2;
              }
              var12Lifetime2 = stackIn_67_0;
              if (p.field_a[var4_intLifetime1].field_a - 31 <= 40) {
                stackIn_70_0 = 40;
              } else {
                stackIn_70_0 = p.field_a[var4_intLifetime1].field_a - 31;
              }
              var13Lifetime2 = stackIn_70_0;
              for (var15Lifetime2 = var11Lifetime2; var15Lifetime2 <= var12Lifetime2; var15Lifetime2++) {
                for (var16Lifetime2 = var13Lifetime2; var16Lifetime2 <= var14Lifetime2; var16Lifetime2++) {
                  pc.field_b[var15Lifetime2][var16Lifetime2] = true;
                }
              }
            } else {
              if (-1 != p.field_a[var4_intLifetime1].field_f) {
                p.field_a[var4_intLifetime1].field_f = (p.field_a[var4_intLifetime1].field_f + p.field_a[var4_intLifetime1].field_g) / 2;
                p.field_a[var4_intLifetime1].field_e = (p.field_a[var4_intLifetime1].field_e + p.field_a[var4_intLifetime1].field_a) / 2;
              } else {
                p.field_a[var4_intLifetime1].field_f = p.field_a[var4_intLifetime1].field_g;
                p.field_a[var4_intLifetime1].field_e = p.field_a[var4_intLifetime1].field_a;
              }
            }
            L24: {
              var8Lifetime1 = 0;
              if (p.field_a[var4_intLifetime1].field_b != 1 &&
                p.field_a[var4_intLifetime1].field_b != 2 &&
                p.field_a[var4_intLifetime1].field_b != 5 &&
                p.field_a[var4_intLifetime1].field_b != 12) {
                if (p.field_a[var4_intLifetime1].field_d != null) {
                  if (p.field_a[var4_intLifetime1].field_d.field_E > eg.field_p) {
                    var8Lifetime1 = 1;
                  }
                  if (p.field_a[var4_intLifetime1].field_d.field_E < eg.field_p) {
                    var8Lifetime1 = -1;
                  }
                }
                var9Lifetime1 = p.field_a[var4_intLifetime1].field_b;
                if (var9Lifetime1 == 4) {
                  var9Lifetime1 = dd.field_M;
                }
                L29: {
                  if (fd.field_o) {
                    L30: {
                      if (var5Lifetime1 != 0) {
                        if (p.field_a[var4_intLifetime1].field_d == param0.field_q) {
                          stackIn_98_0 = null;
                          stackIn_98_1 = param0.field_q;
                          if (stackIn_98_0 != stackIn_98_1) {
                            break L30;
                          }
                        }
                        if (var9Lifetime1 != 4 &&
                          7 != var9Lifetime1 &&
                          var9Lifetime1 != 8) {
                          rh.field_b[var9Lifetime1].d(p.field_a[var4_intLifetime1].field_f, p.field_a[var4_intLifetime1].field_e, 128);
                          break L29;
                        }
                      }
                    }
                    rh.field_b[var9Lifetime1].b(p.field_a[var4_intLifetime1].field_f, p.field_a[var4_intLifetime1].field_e);
                  }
                }
                if (((p.field_a[var4_intLifetime1].field_d == param0.field_q)) &&
                  (!(!fd.field_o))) {
                  l.a(16 + p.field_a[var4_intLifetime1].field_f, p.field_a[var4_intLifetime1].field_e + 16, 16, 16777215);
                  l.a(16 + p.field_a[var4_intLifetime1].field_f, p.field_a[var4_intLifetime1].field_e + 16, 17, 255);
                }
                break L24;
              }
              for (var9Lifetime1Lifetime1 = 0; var9Lifetime1Lifetime1 < 12; var9Lifetime1Lifetime1++) {
                if (null != param0.field_C[var9Lifetime1Lifetime1] &&
                  param0.field_C[var9Lifetime1Lifetime1].field_Z != null) {
                  stackIn_119_0 = (param0.field_C[var9Lifetime1Lifetime1].field_ob) ? 0 : 1;
                  if (stackIn_119_0 == 1 &&
                    param0.field_h.a((byte) -93, param0.field_C[var9Lifetime1Lifetime1], p.field_a[var4_intLifetime1].field_d)) {
                    param0.field_C[var9Lifetime1Lifetime1].field_ob = true;
                  }
                }
              }
              if (p.field_a[var4_intLifetime1].field_d != null) {
                if (eg.field_p < p.field_a[var4_intLifetime1].field_d.field_E) {
                  var8Lifetime1 = 1;
                }
                if (p.field_a[var4_intLifetime1].field_d.field_E < eg.field_p) {
                  var8Lifetime1 = -1;
                }
              }
              if (fd.field_o) {
                if (var5Lifetime1 != 0 && (param0.field_q == null ||
                  !param0.field_h.a((byte) -93, param0.field_q, p.field_a[var4_intLifetime1].field_d))) {
                  rh.field_b[p.field_a[var4_intLifetime1].field_b].d(p.field_a[var4_intLifetime1].field_f, p.field_a[var4_intLifetime1].field_e, 128);
                  break L24;
                }
                rh.field_b[p.field_a[var4_intLifetime1].field_b].b(p.field_a[var4_intLifetime1].field_f, p.field_a[var4_intLifetime1].field_e);
                if (param0.field_q != null &&
                  param0.field_h.a((byte) -93, param0.field_q, p.field_a[var4_intLifetime1].field_d)) {
                  l.a(16 + p.field_a[var4_intLifetime1].field_f, 16 + p.field_a[var4_intLifetime1].field_e, 16, 16711680);
                  l.a(p.field_a[var4_intLifetime1].field_f + 16, 16 + p.field_a[var4_intLifetime1].field_e, 17, 8388608);
                }
              }
            }
            if (fd.field_o) {
              if (var8Lifetime1 == 1) {
                rh.field_b[9].b(p.field_a[var4_intLifetime1].field_f, -8 + p.field_a[var4_intLifetime1].field_e);
              }
              if (var8Lifetime1 == -1) {
                rh.field_b[10].b(p.field_a[var4_intLifetime1].field_f, p.field_a[var4_intLifetime1].field_e + 8);
              }
            }
            if ((!(2 < p.field_a[var4_intLifetime1].field_b) ||
              p.field_a[var4_intLifetime1].field_b == 5 ||
              p.field_a[var4_intLifetime1].field_b == 6) && (var5Lifetime1 != 0 &&
              fd.field_o &&
              eg.field_p == p.field_a[var4_intLifetime1].field_d.field_E)) {
              var9Lifetime2 = 100;
              var10Lifetime1 = 110;
              if (9 == p.field_a[var4_intLifetime1].field_d.field_t) {
                var9Lifetime2 = 400;
              }
              if (null != p.field_a[var4_intLifetime1].field_d.field_Z) {
                var10Lifetime1 = 200;
              }
              var11Lifetime1 = 31 * p.field_a[var4_intLifetime1].field_d.field_P / var9Lifetime2;
              var12Lifetime1 = p.field_a[var4_intLifetime1].field_d.field_u * 31 / var10Lifetime1;
              var13Lifetime1 = (p.field_a[var4_intLifetime1].field_d.field_m + p.field_a[var4_intLifetime1].field_d.field_u) * 31 / var10Lifetime1;
              var14Lifetime1 = 31 * p.field_a[var4_intLifetime1].field_d.field_mb / var9Lifetime2;
              var15Lifetime1 = (p.field_a[var4_intLifetime1].field_d.field_fb + p.field_a[var4_intLifetime1].field_d.field_J) * 31 / var10Lifetime1;
              for (var16Lifetime1 = 0; var16Lifetime1 < 31; var16Lifetime1++) {
                var17Lifetime1 = (int)(20.0 * Math.cos((double)(-(var14Lifetime1 / 2) + var16Lifetime1) * 0.07));
                var18 = -(int)(20.0 * Math.sin(0.07 * (double)(-(var14Lifetime1 / 2) + var16Lifetime1)));
                if (var16Lifetime1 < var11Lifetime1) {
                  l.e(16 - var17Lifetime1 + p.field_a[var4_intLifetime1].field_f, 16 + p.field_a[var4_intLifetime1].field_e + var18, 1, 16711680);
                } else {
                  if (var14Lifetime1 > var16Lifetime1) {
                    l.e(p.field_a[var4_intLifetime1].field_f + (-var17Lifetime1 + 16), 16 + var18 + p.field_a[var4_intLifetime1].field_e, 1, 8388608);
                  }
                }
                var17Lifetime1Lifetime1 = (int)(Math.cos((double)(-(var15Lifetime1 / 2) + var16Lifetime1) * 0.07) * 20.0);
                var18Lifetime1 = -(int)(Math.sin((double)(-(var15Lifetime1 / 2) + var16Lifetime1) * 0.07) * 20.0);
                if (var12Lifetime1 > var16Lifetime1) {
                  l.e(var17Lifetime1Lifetime1 + (p.field_a[var4_intLifetime1].field_f + 16), 16 + var18Lifetime1 + p.field_a[var4_intLifetime1].field_e, 1, 65280);
                } else {
                  if (var13Lifetime1 <= var16Lifetime1) {
                    if (var16Lifetime1 < var15Lifetime1) {
                      l.e(16 + var17Lifetime1Lifetime1 + p.field_a[var4_intLifetime1].field_f, 16 + var18Lifetime1 + p.field_a[var4_intLifetime1].field_e, 1, 32768);
                    }
                  } else {
                    l.e(16 + (p.field_a[var4_intLifetime1].field_f + var17Lifetime1Lifetime1), var18Lifetime1 + p.field_a[var4_intLifetime1].field_e + 16, 1, 255);
                  }
                }
              }
            }
            if (p.field_a[var4_intLifetime1].field_b == 0 &&
              p.field_a[var4_intLifetime1].field_d != null &&
              p.field_a[var4_intLifetime1].field_d.field_Z != null &&
              ce.field_e) {
              var9Lifetime3 = 16777215;
              if (!fd.field_o &&
                p.field_a[var4_intLifetime1].field_d != param0.field_q) {
                var9Lifetime3 = 9013641;
              }
              og.field_f.c(p.field_a[var4_intLifetime1].field_d.field_Z.b(1), p.field_a[var4_intLifetime1].field_f + 16, -1 + (6 + (16 + p.field_a[var4_intLifetime1].field_e)), 0, -1);
              og.field_f.c(p.field_a[var4_intLifetime1].field_d.field_Z.b(param3 + 11670), 16 + p.field_a[var4_intLifetime1].field_f, p.field_a[var4_intLifetime1].field_e + 16 + 6 + 1, 0, -1);
              og.field_f.c(p.field_a[var4_intLifetime1].field_d.field_Z.b(1), -1 + (p.field_a[var4_intLifetime1].field_f + 16), 6 + (16 + p.field_a[var4_intLifetime1].field_e), 0, -1);
              og.field_f.c(p.field_a[var4_intLifetime1].field_d.field_Z.b(param3 + 11670), 16 + (p.field_a[var4_intLifetime1].field_f + 1), 16 + p.field_a[var4_intLifetime1].field_e + 6, 0, -1);
              og.field_f.c(p.field_a[var4_intLifetime1].field_d.field_Z.b(param3 + 11670), 16 + p.field_a[var4_intLifetime1].field_f, 22 + p.field_a[var4_intLifetime1].field_e, var9Lifetime3, -1);
            }
            if (6 == p.field_a[var4_intLifetime1].field_b &&
              p.field_a[var4_intLifetime1].field_d != null &&
              ce.field_e) {
              var9Lifetime4 = 255;
              og.field_f.c(ig.field_c, 16 + p.field_a[var4_intLifetime1].field_f, 16 + (p.field_a[var4_intLifetime1].field_e + 6 - 1), 0, -1);
              og.field_f.c(ig.field_c, p.field_a[var4_intLifetime1].field_f + 16, 6 + p.field_a[var4_intLifetime1].field_e + 17, 0, -1);
              og.field_f.c(ig.field_c, -1 + (p.field_a[var4_intLifetime1].field_f + 16), 6 + (16 + p.field_a[var4_intLifetime1].field_e), 0, -1);
              og.field_f.c(ig.field_c, 1 + (16 + p.field_a[var4_intLifetime1].field_f), 22 + p.field_a[var4_intLifetime1].field_e, 0, -1);
              og.field_f.c(ig.field_c, p.field_a[var4_intLifetime1].field_f + 16, 16 + (p.field_a[var4_intLifetime1].field_e + 6), var9Lifetime4, -1);
            }
            if (var5Lifetime1 != 0) {
              p.field_a[var4_intLifetime1].field_d = null;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_195_0 = var4;
          stackIn_195_1 = new StringBuilder().append("wc.A(");
          if (param0 == null) {
            stackIn_196_2 = "null";
          } else {
            stackIn_196_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_195_0), ((StringBuilder) (Object) stackIn_195_1).append(stackIn_196_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(long param0, int param1) {
        ab.field_l.setTime(new Date(param0));
        int var3 = ab.field_l.get(7);
        int var4 = ab.field_l.get(5);
        int var5 = ab.field_l.get(2);
        int var6 = ab.field_l.get(1);
        int var7 = ab.field_l.get(11);
        int var8 = ab.field_l.get(12);
        int var9 = ab.field_l.get(13);
        if (param1 != -1) {
          field_p = -67;
        }
        return vj.field_O[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + uk.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    wc(int param0) {
        this.field_q = param0;
    }

    final static int c(int param0) {
        i.field_a.a(param0);
        if (!jg.field_kb.c(true)) {
          return ga.a(param0 ^ -108);
        }
        return 0;
    }

    abstract Object d(byte param0);

    static {
        field_r = -1;
    }
}
