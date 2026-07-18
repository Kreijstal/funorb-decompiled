/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    private int field_a;
    private int field_g;
    private int field_e;
    private int[] field_d;
    private int field_f;
    static int field_b;
    private int[] field_c;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Main.field_T;
          int fieldTemp$3 = ((hg) this).field_f + 1;
          ((hg) this).field_f = ((hg) this).field_f + 1;
          ((hg) this).field_e = ((hg) this).field_e + fieldTemp$3;
          if (param0 <= -76) {
            break L0;
          } else {
            this.a(true);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L2: {
              var3 = ((hg) this).field_c[var2];
              if (0 == (2 & var2)) {
                if ((1 & var2) != 0) {
                  ((hg) this).field_g = ((hg) this).field_g ^ ((hg) this).field_g >>> 6;
                  break L2;
                } else {
                  ((hg) this).field_g = ((hg) this).field_g ^ ((hg) this).field_g << 13;
                  break L2;
                }
              } else {
                if ((1 & var2) != 0) {
                  ((hg) this).field_g = ((hg) this).field_g ^ ((hg) this).field_g >>> 16;
                  break L2;
                } else {
                  ((hg) this).field_g = ((hg) this).field_g ^ ((hg) this).field_g << 2;
                  break L2;
                }
              }
            }
            ((hg) this).field_g = ((hg) this).field_g + ((hg) this).field_c[var2 - -128 & 255];
            int dupTemp$4 = ((hg) this).field_g + (((hg) this).field_c[bc.a(var3 >> 2, 255)] + ((hg) this).field_e);
            var4 = dupTemp$4;
            ((hg) this).field_c[var2] = dupTemp$4;
            int dupTemp$5 = ((hg) this).field_c[bc.a(var4 >> 8 >> 2, 255)] + var3;
            ((hg) this).field_e = dupTemp$5;
            ((hg) this).field_d[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = Main.field_T;
          var10 = -1640531527;
          var9 = -1640531527;
          var5 = -1640531527;
          var7 = -1640531527;
          var6 = -1640531527;
          if (!param0) {
            break L0;
          } else {
            var12 = null;
            String discarded$1 = hg.a((CharSequence) null, (byte) 30);
            break L0;
          }
        }
        var4 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if (256 <= var2) {
                    this.a(-119);
                    ((hg) this).field_a = 256;
                    return;
                  } else {
                    var10 = var10 + ((hg) this).field_c[var2 - -7];
                    var3 = var3 + ((hg) this).field_c[var2];
                    var8 = var8 + ((hg) this).field_c[var2 + 5];
                    var7 = var7 + ((hg) this).field_c[var2 - -4];
                    var6 = var6 + ((hg) this).field_c[3 + var2];
                    var5 = var5 + ((hg) this).field_c[var2 - -2];
                    var4 = var4 + ((hg) this).field_c[var2 + 1];
                    var9 = var9 + ((hg) this).field_c[var2 - -6];
                    var3 = var3 ^ var4 << 11;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 8;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 16;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 10;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((hg) this).field_c[var2] = var3;
                    ((hg) this).field_c[var2 + 1] = var4;
                    ((hg) this).field_c[2 + var2] = var5;
                    ((hg) this).field_c[var2 - -3] = var6;
                    ((hg) this).field_c[4 + var2] = var7;
                    ((hg) this).field_c[5 + var2] = var8;
                    ((hg) this).field_c[6 + var2] = var9;
                    ((hg) this).field_c[7 + var2] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var9 = var9 + ((hg) this).field_d[var2 + 6];
                var3 = var3 + ((hg) this).field_d[var2];
                var10 = var10 + ((hg) this).field_d[7 + var2];
                var7 = var7 + ((hg) this).field_d[var2 + 4];
                var6 = var6 + ((hg) this).field_d[3 + var2];
                var8 = var8 + ((hg) this).field_d[5 + var2];
                var5 = var5 + ((hg) this).field_d[var2 - -2];
                var4 = var4 + ((hg) this).field_d[var2 + 1];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 2;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 8;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 16;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 10;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 4;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 8;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((hg) this).field_c[var2] = var3;
                ((hg) this).field_c[1 + var2] = var4;
                ((hg) this).field_c[2 + var2] = var5;
                ((hg) this).field_c[3 + var2] = var6;
                ((hg) this).field_c[4 + var2] = var7;
                ((hg) this).field_c[5 + var2] = var8;
                ((hg) this).field_c[6 + var2] = var9;
                ((hg) this).field_c[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 2;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 8;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 4;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 8;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L1;
          }
        }
    }

    final static lb a(String param0, byte param1) {
        RuntimeException var2 = null;
        lb stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        lb stackOut_6_0 = null;
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
            L1: {
              if (!wh.field_a.a(640)) {
                break L1;
              } else {
                if (!param0.equals((Object) (Object) wh.field_a.d(640))) {
                  wh.field_a = nk.a(false, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            stackOut_6_0 = wh.field_a;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("hg.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -125 + ')');
        }
        return stackIn_7_0;
    }

    final int b(int param0) {
        if (!(((hg) this).field_a != 0)) {
            this.a(-80);
            ((hg) this).field_a = 256;
        }
        if (param0 != -1427) {
            this.a(61);
        }
        int fieldTemp$0 = ((hg) this).field_a - 1;
        ((hg) this).field_a = ((hg) this).field_a - 1;
        return ((hg) this).field_d[fieldTemp$0];
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2 = eh.a(0, fe.a(param0, 75));
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            var3 = 99 / ((param1 - 36) / 57);
            stackOut_3_0 = (String) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("hg.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    hg(int[] param0) {
        int var2_int = 0;
        try {
            ((hg) this).field_c = new int[256];
            ((hg) this).field_d = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((hg) this).field_d[var2_int] = param0[var2_int];
            }
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
