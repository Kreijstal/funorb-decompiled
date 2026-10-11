/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kc extends bh {
    int field_v;
    String[][] field_r;
    int field_n;
    int field_o;
    int[][] field_u;
    boolean field_p;
    long[][] field_t;
    static String field_s;
    static String field_q;

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = gd.field_e;
        if (var3 < 5) {
          var2 = 8192 * (var3 * var3) / 1100;
          if (param0 != 8192) {
            return;
          }
          var4 = 1;
          var5 = 0;
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 4) {
            var4 = 1;
            var5 = 1;
          }
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (param1 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (8 == param1) {
              var4 = -1;
              var5 = -1;
            }
          }
          if (11 == param1) {
            var4 = -1;
          }
          if (param1 == 12) {
            var4 = -1;
            var5 = -1;
          }
          if (13 == param1) {
            var5 = -1;
            var4 = 1;
          }
          if (14 == param1) {
            var5 = 1;
            var4 = -1;
          }
          if (15 == param1) {
            var4 = 1;
            var5 = 1;
          }
          o.field_e = em.a(var5 * var2, var2 * var4, (byte) 90);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + 16384 * var3) / 220;
          if (param0 != 8192) {
            return;
          }
          var4Lifetime1 = 1;
          var5Lifetime1 = 0;
          if (param1 == 1) {
            var5Lifetime1 = 1;
          }
          if (param1 == 3) {
            var4Lifetime1 = -1;
          }
          if (param1 == 4) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          if (param1 == 5) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (param1 == 6) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param1 == 7 ||
            8 == param1) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (11 == param1) {
            var4Lifetime1 = -1;
          }
          if (param1 == 12) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (13 == param1) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (14 == param1) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (15 == param1) {
            var4Lifetime1 = 1;
            var5Lifetime1 = 1;
          }
          o.field_e = em.a(var5Lifetime1 * var2, var2 * var4Lifetime1, (byte) 90);
          return;
        }
        if (120 > var3) {
          var3 = -var3 + 120;
          var2 = -(var3 * var3 * 8192 / 3300) + 8192;
        }
        if (param0 != 8192) {
          return;
        }
        var4Lifetime2 = 1;
        var5Lifetime2 = 0;
        if (param1 == 1) {
          var5Lifetime2 = 1;
        }
        if (param1 == 3) {
          var4Lifetime2 = -1;
        }
        if (param1 == 4) {
          var4Lifetime2 = 1;
          var5Lifetime2 = 1;
        }
        if (param1 == 5) {
          var4Lifetime2 = -1;
          var5Lifetime2 = 1;
        }
        if (param1 == 6) {
          var4Lifetime2 = 1;
          var5Lifetime2 = -1;
        }
        if (param1 == 7 ||
          8 == param1) {
          var4Lifetime2 = -1;
          var5Lifetime2 = -1;
        }
        if (11 == param1) {
          var4Lifetime2 = -1;
        }
        if (param1 == 12) {
          var4Lifetime2 = -1;
          var5Lifetime2 = -1;
        }
        if (13 == param1) {
          var5Lifetime2 = -1;
          var4Lifetime2 = 1;
        }
        if (14 == param1) {
          var5Lifetime2 = 1;
          var4Lifetime2 = -1;
        }
        if (15 == param1) {
          var4Lifetime2 = 1;
          var5Lifetime2 = 1;
        }
        o.field_e = em.a(var5Lifetime2 * var2, var2 * var4Lifetime2, (byte) 90);
        return;
    }

    final static ji a(boolean param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          le var8 = null;
          ji stackIn_2_0 = null;
          ji stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param4) {
              stackIn_2_0 = (ji) null;
              return stackIn_2_0;
            }
            var6 = null;
            var7 = null;
            if (bl.field_U.field_i != null) {
              mk.field_d = new nh(bl.field_U.field_i, 5200, 0);
              bl.field_U.field_i = null;
              var6 = new kh(255, mk.field_d, new nh(bl.field_U.field_l, 12000, 0), 2097152);
            }
            if (mk.field_d != null) {
              if (ig.field_cc == null) {
                ig.field_cc = new nh[bl.field_U.field_o.length];
              }
              if (ig.field_cc[param2] == null) {
                ig.field_cc[param2] = new nh(bl.field_U.field_o[param2], 12000, 0);
                bl.field_U.field_o[param2] = null;
              }
              var7 = new kh(param2, mk.field_d, ig.field_cc[param2], 2097152);
            }
            var8 = sc.field_l.a((byte) -86, param2, (kh) (var7), (kh) (var6), param3);
            if (param5) {
              var8.b((byte) 0);
            }
            stackIn_15_0 = new ji(var8, param0, param1);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    kc() {
    }

    public static void a(int param0) {
        field_q = null;
        field_s = null;
        if (param0 < 40) {
          field_s = (String) null;
        }
    }

    static {
        field_q = "In Multiplayer";
        field_s = "The Basics";
    }
}
