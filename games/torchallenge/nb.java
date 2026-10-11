/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nb {
    static ka field_a;

    final static void a(int param0, boolean param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            if (!param1) {
              field_a = (ka) null;
            }
            ff.a("resizing", new Object[]{new Integer(param0)}, gi.b(12476), -29585);
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -26375) {
          field_a = (ka) null;
        }
        stackIn_7_0 = (gj.field_c >= 10) && (!lj.field_q) && (!hf.a(4));
        return stackIn_7_0;
    }

    final static boolean a(int param0, byte param1) {
        if (param0 == 16) {
          return true;
        }
        if (param1 < 112) {
          field_a = (ka) null;
          return false;
        }
        return false;
    }

    final static void a(byte param0, int[][] param1) {
        int var12 = 0;
        int[] dupTemp$0 = null;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        qe var15 = null;
        int var9Lifetime1;
        int var11Lifetime1;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          var6 = 0;
          if (param0 != 42) {
            return;
          }
          for (var11 = 0; 64 > var11; var11++) {
            for (var12 = 0; var12 < ol.field_g.field_a; var12++) {
              for (var9 = 0; var9 < 3; var9++) {
                if (null != bi.field_g[var11][var12][var9]) {
                  bi.field_g[var11][var12][var9][var6] = 0;
                }
              }
            }
          }
          if (ea.field_g == null) {
            return;
          }
          var14 = 0;
          var11Lifetime1 = var14;
          while (var14 < ea.field_g.length) {
            boolean decompiledFrameRemainder0 = true;
            if (ea.field_g[var14] != null) {
              var15 = ea.field_g[var14];
              if (var15.field_F != 0) {
                if (param1[0][0] <= param1[0][1]) {
                  var8 = param1[0][1];
                  var7 = param1[0][0];
                  decompiledFrameRemainder0 = (!(var7 > var15.field_o) ||
                    !(var15.field_o >= var8));
                } else {
                  var8 = param1[0][0];
                  var7 = param1[0][1];
                  decompiledFrameRemainder0 = (!(var15.field_o >= var7) ||
                    !(var15.field_o < var8));
                }
                if ((decompiledFrameRemainder0) && (!(var15.field_H < param1[1][0]) ||
                  !(var15.field_H >= param1[1][1]))) {
                  if (var15.field_F >= 8) {
                    stackIn_39_0 = (var15.field_F <= 21) ? 1 : 0;
                  } else {
                    stackIn_39_0 = 0;
                  }
                  var3 = stackIn_39_0;
                  if (var15.field_L != 13) {
                    if (var3 == 0) {
                      stackIn_47_0 = (var15.field_F == 22) ? 0 : 1;
                    } else {
                      stackIn_47_0 = 0;
                    }
                  } else {
                    stackIn_47_0 = 0;
                  }
                  var4 = stackIn_47_0;
                  if (13 != var15.field_L &&
                    var15.field_db >= 0 &&
                    var15.field_F != 22) {
                    stackIn_56_0 = 0;
                  } else {
                    stackIn_56_0 = (var3 == 0) ? 1 : 0;
                  }
                  var5 = stackIn_56_0;
                  if (var3 != 0 ||
                    var4 != 0 ||
                    var5 != 0) {
                    if (var3 != 0) {
                      var9Lifetime1 = 0;
                    } else {
                      var9Lifetime1 = (var4 == 0) ? 2 : 1;
                    }
                    if (0 <= var15.field_H &&
                      var15.field_H < ol.field_g.field_a &&
                      bi.field_g[var15.field_o][var15.field_H][var9Lifetime1] == null) {
                      bi.field_g[var15.field_o][var15.field_H][var9Lifetime1] = new int[9];
                      bi.field_g[var15.field_o][var15.field_H][var9Lifetime1][var6] = 0;
                    }
                    if (var15.field_H >= 0 &&
                      var15.field_H < ol.field_g.field_a &&
                      8 > bi.field_g[var15.field_o][var15.field_H][var9Lifetime1][var6]) {
                      dupTemp$0 = bi.field_g[var15.field_o][var15.field_H][var9Lifetime1];
                      dupTemp$0[var6] = dupTemp$0[var6] + 1;
                      var10 = bi.field_g[var15.field_o][var15.field_H][var9Lifetime1][var6];
                      bi.field_g[var15.field_o][var15.field_H][var9Lifetime1][var10] = var14;
                    }
                  }
                }
              }
            }
            var14++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_79_0 = var2;
          stackIn_79_1 = new StringBuilder().append("nb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        if (param1 != -1) {
          nb.a(127, (byte) -24);
        }
        nk.field_h = param0;
        if (null != la.field_a) {
          la.field_a.c(param0, false);
        }
        if (null != la.field_d) {
          la.field_d.a(-127, param0);
        }
    }

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (qf.field_a != null && (param0 < 0 ||
            qc.field_d == aj.field_c)) {
            if (param1 == ~dk.field_s.field_q &&
              ol.a(param1 + 257) > (i.field_q + 10000L)) {
              dk.field_s.d(25, param0);
            }
            if (0 < dk.field_s.field_q) {
              try {
                qf.field_a.a(dk.field_s.field_q, 0, (byte) 113, dk.field_s.field_m);
                i.field_q = ol.a(256);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                ob.b(-125);
              }
              dk.field_s.field_q = 0;
            }
            return;
          }
          dk.field_s.field_q = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 > -69) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
