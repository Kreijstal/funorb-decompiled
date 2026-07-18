/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends oh {
    bi field_o;
    int field_h;
    static oa field_s;
    bi field_i;
    static qr field_m;
    static byte[][] field_q;
    static String field_p;
    static String field_j;
    static ro field_r;
    static ul field_t;
    static uh field_n;
    static long field_k;
    static int[] field_l;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var4 = 0;
        int var6 = 0;
        nd[] var7 = null;
        nd[] var8 = null;
        int var9 = 0;
        nd var10 = null;
        nd var11 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            gf.b();
            var2 = 300 - di.field_m;
            var1_int = -25 + var2 / 8;
            db.field_a.b(var1_int, 0, 33023);
            var1_int = var2 / 6 + -100;
            w.field_D.b(var1_int, 0, 4227327);
            oi.field_d.a(var1_int, 0, dp.field_r / 8);
            var7 = fe.field_y;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                var1_int = -250 + var2 / 4;
                vm.field_Jb.b(var1_int, 120, 8421631);
                tp.field_e.a(var1_int, 120, dp.field_r / 4);
                sr.field_F.a(var1_int, 120, dp.field_r);
                var8 = fe.field_H;
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var8.length <= var9) {
                    break L0;
                  } else {
                    L3: {
                      var11 = var8[var9];
                      if (0 == var11.field_a) {
                        break L3;
                      } else {
                        gf.b(var11.field_e - -var1_int << 4, var11.field_j + 120 << 4, var11.field_f, var11.field_a, fe.field_u);
                        break L3;
                      }
                    }
                    var9++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  var10 = var7[var4];
                  if (var10.field_a == 0) {
                    break L4;
                  } else {
                    gf.b(var1_int + var10.field_e << 4, var10.field_j << 4, var10.field_f, var10.field_a, fe.field_u);
                    break L4;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "hd.A(" + 120 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_j = null;
        field_r = null;
        field_m = null;
        field_q = null;
        field_l = null;
        field_s = null;
        field_t = null;
        field_n = null;
    }

    hd(String param0, nq param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1.c(param0);
              var5 = param1.field_J - -param1.field_q;
              if (500 >= var4_int) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (var6 == 0) {
                break L2;
              } else {
                var4_int = 600;
                break L2;
              }
            }
            L3: {
              ((hd) this).field_i = new bi(var4_int, var5);
              ((hd) this).field_o = new bi(var4_int - -6, 6 + var5);
              ra.a(-127);
              ((hd) this).field_i.e();
              if (var6 == 0) {
                param1.d(param0, 0, param1.field_J, 16777215, -1);
                break L3;
              } else {
                param1.b(param0, 0, param1.field_J, 16777215, -1, 600);
                break L3;
              }
            }
            ((hd) this).field_o.e();
            ((hd) this).field_i.c(3, 3);
            gf.b(1, 1, 0, 0, 6 + var4_int, var5 + 6);
            var7 = (var4_int + 6) * (6 + var5) + -1;
            L4: while (true) {
              if (var7 < 0) {
                cg.i(0);
                ((hd) this).field_h = -param2;
                break L0;
              } else {
                L5: {
                  if (0 != (128 & gf.field_h[var7])) {
                    break L5;
                  } else {
                    gf.field_h[var7] = gf.field_h[var7] << 1;
                    break L5;
                  }
                }
                var7--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("hd.<init>(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ')');
        }
    }

    final static ld a(int param0, int param1) {
        ld var2 = new ld();
        ua.field_d.a((byte) -113, (oh) (Object) var2);
        cp.a(6, 1);
        return var2;
    }

    final static void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1_int = ln.field_H.length;
        kb.field_A = 0;
        try {
            cb.field_i = new int[var1_int];
            for (var2 = 0; var1_int > var2; var2++) {
                var3 = aa.a(var2, (byte) -71);
                if (!(var2 == -1 + var1_int)) {
                    var3 += 50;
                }
                cb.field_i[var2] = var3;
                kb.field_A = kb.field_A + var3;
            }
            kb.field_A = kb.field_A - 294;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "hd.B(" + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_j = "Click to build fleets in this territory.";
        field_s = new oa();
        field_r = new ro();
        field_l = new int[5];
    }
}
