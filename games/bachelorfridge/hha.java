/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hha extends ana {
    static long[] field_z;
    static hw[] field_w;
    static int[] field_A;
    private mna field_x;
    static ee[] field_y;
    static long[][] field_v;

    final static boolean e(int param0) {
        if (param0 != 1071140296) {
            boolean discarded$0 = hha.e(-20);
        }
        return dka.field_G == kq.field_j ? true : false;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (param6 < param4) {
              break L1;
            } else {
              if (param6 >= param4 + param2) {
                break L1;
              } else {
                if (param1 < param5) {
                  break L1;
                } else {
                  if (param5 - -param0 <= param1) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final void d(int param0) {
        aga var2 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var2 = ((hha) this).field_x.field_l.a(74, ((hha) this).field_q.field_h);
        if (var2.i(-117)) {
          return;
        } else {
          return;
        }
    }

    private final void f() {
    }

    hha(gj param0, mna param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((hha) this).field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hha.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean c(byte param0) {
        int var2 = 84 % ((71 - param0) / 47);
        int fieldTemp$0 = ((hha) this).field_l - 1;
        ((hha) this).field_l = ((hha) this).field_l - 1;
        if (fieldTemp$0 >= 0) {
            if (((hha) this).field_l == 25) {
                jja.a(256, -1, 52);
                this.d(-10649);
            }
            return false;
        }
        int discarded$1 = 1532;
        this.f();
        return true;
    }

    final static hk a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        hk[] var3 = null;
        int var4 = 0;
        hk var5 = null;
        int var6 = 0;
        hk stackIn_4_0 = null;
        hk stackIn_10_0 = null;
        hk stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        hk stackOut_3_0 = null;
        hk stackOut_12_0 = null;
        hk stackOut_9_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var2 = fi.a("jagex-last-login-method", 61, param1);
            if (var2 == null) {
              stackOut_3_0 = uka.field_k;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              int discarded$2 = -67;
              var3 = gh.c();
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  stackOut_12_0 = uka.field_k;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, 91)) {
                    stackOut_9_0 = (hk) var5;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("hha.F(").append(127).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    public static void g() {
        field_z = null;
        field_v = null;
        field_w = null;
        field_y = null;
        field_A = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_z = new long[11];
        field_A = new int[8192];
        field_v = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_z[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (var15 > 10) {
                return;
              } else {
                var1 = 8 * (var15 - 1);
                field_z[var15] = gv.a(gv.a(gv.a(gda.a(field_v[5][var1 + 5], 16711680L), gv.a(gda.a(field_v[4][var1 + 4], 4278190080L), gv.a(gda.a(1095216660480L, field_v[3][var1 - -3]), gv.a(gv.a(gda.a(71776119061217280L, field_v[1][1 + var1]), gda.a(-72057594037927936L, field_v[0][var1])), gda.a(280375465082880L, field_v[2][2 + var1]))))), gda.a(65280L, field_v[6][var1 + 6])), gda.a(field_v[7][7 + var1], 255L));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> 8);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1;
              if (var4 < 256L) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (var6 >= 256L) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1;
              if (256L <= var10) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_v[0][var0] = sr.a(var12, sr.a(sr.a(sr.a(sr.a(sr.a(var6 << 40, sr.a(var2 << 48, var2 << 56)), var2 << 32), var10 << 24), var8 << 16), var4 << 8));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_v[var14][var0] = sr.a(field_v[var14 + -1][var0] << 56, field_v[-1 + var14][var0] >>> 8);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
