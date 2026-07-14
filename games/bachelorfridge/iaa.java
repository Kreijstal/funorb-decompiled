/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iaa {
    static String[] field_b;
    static boolean field_a;

    final static void a(int param0) {
        Object var1 = null;
        kha var1_ref = null;
        int var2 = 0;
        var1 = null;
        var2 = BachelorFridge.field_y;
        if (param0 < -105) {
          dea.field_n = 0;
          var1_ref = (kha) (Object) iea.field_d.b((byte) 90);
          L0: while (true) {
            if (var1_ref != null) {
              L1: {
                if (-1 != (dga.field_a ^ -1)) {
                  break L1;
                } else {
                  dea.field_n = dea.field_n + fw.field_h[var1_ref.field_h].field_f * var1_ref.field_g;
                  break L1;
                }
              }
              var1_ref = (kha) (Object) iea.field_d.c(0);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_b = null;
          dea.field_n = 0;
          var1_ref = (kha) (Object) iea.field_d.b((byte) 90);
          L2: while (true) {
            if (var1_ref != null) {
              L3: {
                if (-1 != (dga.field_a ^ -1)) {
                  break L3;
                } else {
                  dea.field_n = dea.field_n + fw.field_h[var1_ref.field_h].field_f * var1_ref.field_g;
                  break L3;
                }
              }
              var1_ref = (kha) (Object) iea.field_d.c(0);
              continue L2;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, eaa param5) {
        lh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        param0 -= 8;
        var6 = (lh) (Object) param5.b((byte) 90);
        var7 = 0;
        if (param3 >= -82) {
          field_a = true;
          L0: while (true) {
            if (var6 != null) {
              L1: {
                if ((var6.field_h ^ -1) > -1) {
                  L2: {
                    var8 = (326565 * var6.field_h + 8357 * var6.field_i & 630) + (var6.field_o >> -1742503327);
                    if (var8 <= 256) {
                      break L2;
                    } else {
                      var8 = 256;
                      break L2;
                    }
                  }
                  iga.field_a[2 + var7 % 7].a((var6.field_i * param1 >> 1851439184) + (param4 - 32), param0 - (((var6.field_h - var6.field_q) * param1 >> -940705200) + 2 - -32), var6.field_o);
                  break L1;
                } else {
                  break L1;
                }
              }
              var6 = (lh) (Object) param5.c(0);
              var7++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L3: while (true) {
            if (var6 != null) {
              L4: {
                if ((var6.field_h ^ -1) > -1) {
                  L5: {
                    var8 = (326565 * var6.field_h + 8357 * var6.field_i & 630) + (var6.field_o >> -1742503327);
                    if (var8 <= 256) {
                      break L5;
                    } else {
                      var8 = 256;
                      break L5;
                    }
                  }
                  iga.field_a[2 + var7 % 7].a((var6.field_i * param1 >> 1851439184) + (param4 - 32), param0 - (((var6.field_h - var6.field_q) * param1 >> -940705200) + 2 - -32), var6.field_o);
                  break L4;
                } else {
                  break L4;
                }
              }
              var6 = (lh) (Object) param5.c(0);
              var7++;
              continue L3;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, kv param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = param4 + param6.field_t - -param2 - param3;
        var10 = param2 + (param4 + param6.field_t - -param8);
        var11 = param6.field_u - -param0 - -(param6.field_p >> -1647222847);
        dg.c(var9, 0, var10, param5 + var11);
        param6.d(-1 + param4, -1 + param0, param1);
        param6.d(-1 + param4, param0 + 1, param1);
        dg.b(ie.field_b);
        dg.c(var9 - -1, 0, var10 - -1, var11 + param5);
        param6.d(param4 + 1, -1 + param0, param1);
        param6.d(1 + param4, param0 - -1, param1);
        dg.b(ie.field_b);
        var9 = -param8 + (-param2 + param4) + param6.field_t + param6.field_q;
        var10 = -param3 + (param6.field_q + param6.field_t - -param4 + -param2);
        dg.c(var9, var11 - param5, var10, 480);
        param6.d(-1 + param4, param0 + -1, param1);
        param6.d(-1 + param4, param0 - -1, param1);
        dg.b(ie.field_b);
        dg.c(var9 + 1, -param5 + var11, var10 + 1, 480);
        param6.d(param4 + 1, -1 + param0, param1);
        if (param7 != -3702) {
          field_a = false;
          param6.d(1 + param4, 1 + param0, param1);
          dg.b(ie.field_b);
          return;
        } else {
          param6.d(1 + param4, 1 + param0, param1);
          dg.b(ie.field_b);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > 85) {
            return;
        }
        Object var2 = null;
        iaa.a(83, -61, 60, (byte) -114, 105, (eaa) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
