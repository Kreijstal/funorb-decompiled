/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dd {
    int field_o;
    int field_b;
    int field_n;
    int field_e;
    int field_k;
    int field_p;
    boolean field_i;
    private static long[] field_c;
    int field_h;
    hh[] field_l;
    int field_g;
    int field_d;
    int field_j;
    static String field_m;
    static String field_a;
    static String field_f;

    final static wm[] b(byte param0) {
        return new wm[]{rn.field_f, ej.field_b, w.field_w, gj.field_T, lb.field_r, lm.field_l, lb.field_C, gn.field_u, pf.field_f, of.field_e, kn.field_M, u.field_d, gh.field_s, ad.field_u};
    }

    final void a(byte param0, Random param1) {
        int var3_int = 0;
        int[] var14 = null;
        int[] var13 = null;
        int[] var12 = null;
        int[] var11 = null;
        int[] var4 = null;
        int var5_int = 0;
        int var9 = 0;
        int var6 = 0;
        int var7 = 0;
        hh[] var5 = null;
        int var10 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        try {
            var3_int = ((dd) this).field_l.length;
            var14 = new int[var3_int];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var4 = var11;
            for (var5_int = 0; var3_int > var5_int; var5_int++) {
                var14[var5_int] = var5_int;
            }
            var9 = 0;
            var5_int = var9;
            while (var9 < var3_int) {
                var6 = var9 - -ok.a(param1, -120, var3_int - var9);
                var7 = var14[var9];
                var4[var9] = var14[var6];
                var14[var6] = var7;
                var9++;
            }
            var6 = -119 % ((param0 - -53) / 60);
            var5 = new hh[var3_int];
            var10 = 0;
            var7 = var10;
            while (var3_int > var10) {
                var5[var10] = ((dd) this).field_l[var14[var10]];
                var10++;
            }
            ((dd) this).field_l = var5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_a = null;
        field_c = null;
        int var1 = 27;
        field_f = null;
    }

    final boolean a(byte param0) {
        if (param0 > -113) {
            field_a = null;
        }
        int fieldTemp$0 = ((dd) this).field_d + 1;
        ((dd) this).field_d = ((dd) this).field_d + 1;
        return fieldTemp$0 == ((dd) this).field_l.length ? true : false;
    }

    final static String[] a(String param0, byte param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var11 = (CharSequence) (Object) param0;
            var3_int = al.a(0, param2, var11);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                L2: {
                  var4[var3_int] = param0.substring(var6);
                  if (param1 <= -28) {
                    break L2;
                  } else {
                    var10 = null;
                    String[] discarded$4 = dd.a((String) null, (byte) -32, 'k');
                    break L2;
                  }
                }
                stackOut_9_0 = (String[]) var4;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2 == param0.charAt(var8)) {
                    int incrementValue$5 = var5;
                    var5++;
                    var4[incrementValue$5] = param0.substring(var6, var8);
                    var6 = 1 + var8;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("dd.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param1 >= 44) {
            break L0;
          } else {
            boolean discarded$2 = dd.a('ﾰ', (byte) -89);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 48) {
                break L3;
              } else {
                if (param0 <= 57) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 65) {
                break L4;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param0 < 97) {
                break L5;
              } else {
                if (122 < param0) {
                  break L5;
                } else {
                  break L2;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    final static String a(int param0) {
        String var1 = "";
        if (!(nf.field_b == null)) {
            var1 = nf.field_b.l(-24832);
        }
        if (0 == var1.length()) {
            var1 = cg.b(false);
        }
        if (var1.length() == 0) {
            var1 = cd.field_d;
        }
        return var1;
    }

    dd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, hh[] param8) {
        try {
            ((dd) this).field_l = param8;
            if ((30 & param2) == 30) {
                ((dd) this).field_i = true;
            }
            ((dd) this).field_e = 10 * param7;
            ((dd) this).field_b = param6;
            ((dd) this).field_p = param2;
            ((dd) this).field_h = param3;
            ((dd) this).field_k = param1;
            ((dd) this).field_n = param4;
            ((dd) this).field_j = param5;
            ((dd) this).field_g = param1 * param0;
            ((dd) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_c = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_m = "All players have left <%0>'s game.";
            field_f = "Type your password again to make sure it's correct";
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_c[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
