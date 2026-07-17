/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fha extends at {
    private int field_m;
    static String field_k;
    static String[][] field_j;
    private kj field_l;

    public static void d(byte param0) {
        field_j = null;
        field_k = null;
        if (param0 == 9) {
            return;
        }
        fha.d((byte) 101);
    }

    final boolean c(byte param0) {
        int var2 = 0;
        L0: {
          var2 = 40 % ((71 - param0) / 47);
          if (0 == ((fha) this).field_m) {
            ((fha) this).field_l.a(0);
            break L0;
          } else {
            break L0;
          }
        }
        int fieldTemp$2 = ((fha) this).field_m + 1;
        ((fha) this).field_m = ((fha) this).field_m + 1;
        if (fieldTemp$2 >= this.d(-18093)) {
          this.e(1);
          return true;
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, iga param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              uka.field_i[0] = ia.field_k.nextInt();
              uka.field_i[1] = ia.field_k.nextInt();
              dm.field_g.field_g = param1;
              uka.field_i[3] = (int)bi.field_j;
              uka.field_i[2] = (int)(bi.field_j >> 32);
              dm.field_g.e(uka.field_i[0], param1 + -1615464796);
              dm.field_g.e(uka.field_i[1], param1 + -1615464796);
              dm.field_g.e(uka.field_i[2], -1615464796);
              dm.field_g.e(uka.field_i[3], -1615464796);
              qja.b(param1 ^ 24, dm.field_g);
              dm.field_g.b(param0, -125);
              param2.a(dm.field_g, false);
              sja.field_fb.field_g = 0;
              if (!param4) {
                sja.field_fb.d(16, 0);
                break L1;
              } else {
                sja.field_fb.d(18, param1);
                break L1;
              }
            }
            L2: {
              sja.field_fb.field_g = sja.field_fb.field_g + 2;
              var5_int = sja.field_fb.field_g;
              sja.field_fb.e(cp.field_c, param1 + -1615464796);
              sja.field_fb.b(param1 + 1686281208, vi.field_a);
              var6 = 0;
              if (vs.field_c) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (cr.field_b) {
                var6 = var6 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param3) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (ij.field_m != null) {
                var6 = var6 | 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              sja.field_fb.d(var6, 0);
              var7 = pi.a(11713, nia.d(param1 + -31768));
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              sja.field_fb.a((byte) -50, var7);
              if (null == ij.field_m) {
                break L7;
              } else {
                sja.field_fb.a(ij.field_m, 86);
                break L7;
              }
            }
            wd.a(sm.field_q, (byte) -126, (lu) (Object) sja.field_fb, dm.field_g, tg.field_p);
            sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var5_int);
            hna.a(-1, 85);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("fha.F(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void e(int param0) {
    }

    private final int d(int param0) {
        return 10;
    }

    fha(kj param0) {
        try {
            ((fha) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fha.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
        int var18 = 0;
        int[] var22 = null;
        RuntimeException decompiledCaughtException = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var12 = cr.a(an.field_q, param7, ha.field_n, 0);
              var13 = cr.a(an.field_q, param2, ha.field_n, 0);
              var14 = cr.a(eo.field_l, param4, pw.field_x, 0);
              if (param1 >= 43) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            var15 = cr.a(eo.field_l, param0, pw.field_x, 0);
            var8_int = cr.a(an.field_q, param6 + param7, ha.field_n, 0);
            var9 = cr.a(an.field_q, param2 - param6, ha.field_n, 0);
            var16 = var12;
            L2: while (true) {
              if (var8_int <= var16) {
                var16 = var13;
                L3: while (true) {
                  if (var16 <= var9) {
                    var10 = cr.a(eo.field_l, param6 + param4, pw.field_x, 0);
                    var11 = cr.a(eo.field_l, param0 - param6, pw.field_x, 0);
                    var16 = var8_int;
                    L4: while (true) {
                      if (var9 < var16) {
                        break L0;
                      } else {
                        var22 = tj.field_b[var16];
                        hba.a(param3, var14, var22, 7, var10);
                        hba.a(param5, var10, var22, 7, var11);
                        hba.a(param3, var11, var22, 7, var15);
                        var16++;
                        continue L4;
                      }
                    }
                  } else {
                    hba.a(param3, var14, tj.field_b[var16], 7, var15);
                    var16--;
                    continue L3;
                  }
                }
              } else {
                hba.a(param3, var14, tj.field_b[var16], 7, var15);
                var16++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var8, "fha.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Names can only contain letters, numbers, spaces and underscores";
    }
}
