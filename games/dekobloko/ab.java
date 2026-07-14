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

    final static int e(int param0) {
        int var1 = 0;
        if (!(lg.field_W <= var1)) {
            var1 = lg.field_W;
        }
        if (var1 < bf.field_r) {
            var1 = bf.field_r;
        }
        if (param0 != -28199) {
            field_e = -18;
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
        if (!(param0.field_v == null)) {
            param0.e((byte) 101);
        }
        param0.field_p = ((ab) this).field_b;
        param0.field_v = ((ab) this).field_b.field_v;
        param0.field_v.field_p = param0;
        param0.field_p.field_v = param0;
        if (param1 != -7267) {
            Object var4 = null;
            ((ab) this).a((be) null, 54);
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
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        var2 = 0L;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L3;
                  } else {
                    if (var6 > 90) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(-65 + var6 + 1);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (97 > var6) {
                    break L4;
                  } else {
                    if (var6 > 122) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(-97 + (var6 + 1));
                      break L2;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (57 < var6) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(var6 + 27 - 48);
                    break L2;
                  }
                }
              }
              if (var2 >= 177917621779460413L) {
                break L1;
              } else {
                var5++;
                continue L0;
              }
            }
          }
          L5: {
            if (param0 > 95) {
              break L5;
            } else {
              field_f = -6;
              break L5;
            }
          }
          L6: while (true) {
            L7: {
              if (0L != var2 % 37L) {
                break L7;
              } else {
                if (var2 == 0L) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
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
          if (ea.field_n != sf.field_B) {
            wh.field_c = pf.field_i[sf.field_B];
            el.field_G = bl.field_Z[sf.field_B];
            sf.field_B = 1 + sf.field_B & 127;
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
          } else {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          }
        }
        return stackIn_5_0 != 0;
    }

    public static void d(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 1) {
            int discarded$0 = ab.e(-99);
        }
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

    final static boolean c(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            boolean discarded$2 = ab.c((byte) 45);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != kb.field_i) {
              break L2;
            } else {
              if (!jh.field_h) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
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
