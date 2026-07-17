/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ab {
    static String field_a;
    static int field_e;
    static java.util.zip.CRC32 field_c;
    private be field_b;
    static int field_f;
    private be field_g;
    static String field_d;

    final static int e() {
        int var1 = 0;
        if (!(lg.field_W <= var1)) {
            var1 = lg.field_W;
        }
        if (var1 < bf.field_r) {
            var1 = bf.field_r;
        }
        if (!(tg.field_e <= var1)) {
            var1 = tg.field_e;
        }
        return var1;
    }

    final be b(byte param0) {
        be var2 = ((ab) this).field_g;
        if (!(var2 != ((ab) this).field_b)) {
            ((ab) this).field_g = null;
            return null;
        }
        if (param0 != 20) {
            return null;
        }
        ((ab) this).field_g = var2.field_p;
        return var2;
    }

    final void a(be param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_v != null) {
                param0.e((byte) 101);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_p = ((ab) this).field_b;
              param0.field_v = ((ab) this).field_b.field_v;
              param0.field_v.field_p = param0;
              param0.field_p.field_v = param0;
              if (param1 == -7267) {
                break L2;
              } else {
                var4 = null;
                ((ab) this).a((be) null, 54);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ab.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final be a(byte param0) {
        be var2 = ((ab) this).field_b.field_p;
        if (((ab) this).field_b == var2) {
            return null;
        }
        var2.e((byte) 94);
        int var3 = 27 / ((1 - param0) / 39);
        return var2;
    }

    final be b(int param0) {
        if (param0 != -2198) {
            be discarded$0 = ((ab) this).b(61);
        }
        be var2 = ((ab) this).field_b.field_p;
        if (((ab) this).field_b == var2) {
            ((ab) this).field_g = null;
            return null;
        }
        ((ab) this).field_g = var2.field_p;
        return var2;
    }

    final static long a(int param0, CharSequence param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_20_0 = 0L;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_19_0 = 0L;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L4;
                      } else {
                        if (var6 > 90) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(-65 + var6 + 1);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (97 > var6) {
                        break L5;
                      } else {
                        if (var6 > 122) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(-97 + (var6 + 1));
                          break L3;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (57 < var6) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(var6 - 21);
                        break L3;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: {
                if (param0 > 95) {
                  break L6;
                } else {
                  field_f = -6;
                  break L6;
                }
              }
              L7: while (true) {
                L8: {
                  if (0L != var2_long % 37L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_19_0 = var2_long;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("ab.E(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        var1 = 108 % ((-69 - param0) / 50);
        var2 = (Object) (Object) f.field_r;
        synchronized (var2) {
          L0: {
            if (ea.field_n != sf.field_B) {
              wh.field_c = pf.field_i[sf.field_B];
              el.field_G = bl.field_Z[sf.field_B];
              sf.field_B = 1 + sf.field_B & 127;
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    public static void d() {
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final int a(int param0) {
        int var4 = client.field_A ? 1 : 0;
        int var2 = param0;
        be var3 = ((ab) this).field_b.field_p;
        while (var3 != ((ab) this).field_b) {
            var2++;
            var3 = var3.field_p;
        }
        return var2;
    }

    final static boolean c() {
        return null != kb.field_i || jh.field_h;
    }

    public ab() {
        ((ab) this).field_b = new be();
        ((ab) this).field_b.field_v = ((ab) this).field_b;
        ((ab) this).field_b.field_p = ((ab) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Resign";
        field_e = 64;
        field_c = new java.util.zip.CRC32();
        field_d = "Unfortunately you are not eligible to create an account.";
    }
}
