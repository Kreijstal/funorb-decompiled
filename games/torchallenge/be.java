/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static ka[] field_f;
    static String field_a;
    static boolean[] field_c;
    static boolean field_b;
    static TorChallenge field_e;
    static int field_d;

    final static void a(boolean param0, byte param1) {
        ji.field_k.a((byte) 80, param0);
    }

    final static ef a(int param0, boolean param1) {
        if (param0 > -111) {
            field_e = null;
        }
        ef var2 = new ef(true);
        var2.field_c = param1 ? true : false;
        return var2;
    }

    final static void a(int param0, byte param1, boolean param2) {
        bb.field_h = param0;
        if (param1 >= -101) {
            be.a(19, (byte) -122, true);
        }
        hk.field_e = 0;
        if (!(bb.field_h < 0)) {
            ug.field_i[bb.field_h].a(3, param2);
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
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
        int var20 = 0;
        int var21 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        var21 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = 160;
              var9 = 0;
              var10 = 30;
              var11 = 240;
              var12 = 21;
              var13 = 21;
              var14 = var13 / var12;
              var15 = 1;
              ie.field_f[param2][1].d(param4, param3, 160);
              qg.a(sh.field_w);
              var18 = ie.field_f[param2][1].field_q;
              var19 = ie.field_f[param2][1].field_v;
              if (!param0) {
                if (lj.field_b > 0) {
                  var17 = var18 / 4;
                  var17 = var17 * (25 + lj.field_b / 25 * 25 - lj.field_b) / 25;
                  var18 = (param1 + -(lj.field_b / 25) + -1) * var18 / 4 + var17;
                  qg.f(param4, param3, param4 - -var18, param3 + var19);
                  fd.field_h.d(param4, param3, var8_int);
                  qg.b(sh.field_w);
                  break L1;
                } else {
                  if (0 < fh.field_d) {
                    var17 = var18 / 4;
                    var17 = fh.field_d * var17 / 200;
                    var18 = var17 + param1 * var18 / 4;
                    qg.f(param4, param3, var18 + param4, var19 + param3);
                    fd.field_h.d(param4, param3, var8_int);
                    qg.b(sh.field_w);
                    break L1;
                  } else {
                    var18 = var18 * param1 / 4;
                    qg.f(param4, param3, param4 + var18, param3 + var19);
                    fd.field_h.d(param4, param3, var8_int);
                    qg.b(sh.field_w);
                    break L1;
                  }
                }
              } else {
                L2: {
                  param6++;
                  var9 = -var13 + param6 % (var13 * 2);
                  if (var9 < 0) {
                    var9 = -var9;
                    var15 = -1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var16 = var9 / var14;
                  ac.field_a.d();
                  if (var15 >= 0) {
                    if (0 <= var15) {
                      var8_int = var11;
                      var20 = 1;
                      L4: while (true) {
                        if (var20 > var16) {
                          break L3;
                        } else {
                          var8_int = var8_int - var20;
                          var20++;
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    var16 = var12 + -var16;
                    var8_int = var10;
                    var20 = 1;
                    L5: while (true) {
                      if (var16 < var20) {
                        break L3;
                      } else {
                        var8_int = var8_int + (var12 - var20);
                        var20++;
                        continue L5;
                      }
                    }
                  }
                }
                L6: {
                  qg.b();
                  qg.f(0, 0, var18, var19);
                  fd.field_h.g(0, 0);
                  qg.d(2, 2, 0, 0, var18, var19);
                  qg.b(sh.field_w);
                  la.field_f.a(-123);
                  if (param1 != 4) {
                    break L6;
                  } else {
                    var19 += 2;
                    param3--;
                    var18 += 2;
                    param4--;
                    break L6;
                  }
                }
                L7: {
                  var20 = param7;
                  if (125 > var20) {
                    var18 = 2 * (var18 * var20) / 250;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                qg.f(param4, param3, var18 + param4, var19 + param3);
                ac.field_a.d(param4, param3, var8_int);
                qg.b(sh.field_w);
                break L1;
              }
            }
            stackOut_25_0 = param6;
            stackIn_26_0 = stackOut_25_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var8, "be.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 25 + 44 + param6 + 44 + param7 + 41);
        }
        return stackIn_26_0;
    }

    public static void a() {
        field_e = null;
        field_f = null;
        field_c = null;
        field_a = null;
    }

    final static qa a(boolean param0) {
        String var1 = si.h(-118);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        int discarded$0 = 125;
        return new qa(si.h(16), fc.d());
    }

    final static ql a(int param0, int param1) {
        ql var2 = new ql();
        ji.field_q.a((da) (Object) var2, -77);
        af.b(9245, 4);
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Continue";
        field_c = new boolean[]{true, true, false, true, false, false, false, false, false, false};
        field_d = 0;
    }
}
