/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class m extends gg {
    int field_i;
    int field_j;
    static nc field_h;

    final static int a(int param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var3 = 0;
        var4 = param2.length();
        var5 = param0;
        L0: while (true) {
          if (var4 <= var5) {
            return var3;
          } else {
            if (param2.charAt(var5) == param1) {
              var3++;
              var5++;
              var5++;
              continue L0;
            } else {
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
    }

    private m() throws Throwable {
        throw new Error();
    }

    final static rb a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        rb var6 = null;
        if (param3 != -6) {
          field_h = null;
          var6 = new rb(param0, param2, param1, param5, param4);
          pk.a((byte) 32, var6);
          return var6;
        } else {
          var6 = new rb(param0, param2, param1, param5, param4);
          pk.a((byte) 32, var6);
          return var6;
        }
    }

    final static void b(boolean param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = SolKnight.field_L ? 1 : 0;
              if (il.field_c == null) {
                break L0;
              } else {
                il.field_c.a((byte) 92);
                break L0;
              }
            }
            if (!param0) {
              L1: {
                if (pf.field_d != null) {
                  pf.field_d.a(5);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null != hc.field_c) {
                  try {
                    L3: {
                      hc.field_c.d(false);
                      break L3;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      iOException = (IOException) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  break L2;
                } else {
                  break L2;
                }
              }
              if (tk.field_p != null) {
                var1 = 0;
                L5: while (true) {
                  if (tk.field_p.length <= var1) {
                    return;
                  } else {
                    if (null != tk.field_p[var1]) {
                      try {
                        L6: {
                          tk.field_p[var1].d(false);
                          var1++;
                          var1++;
                          break L6;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L7: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          var1++;
                          break L7;
                        }
                      }
                      continue L5;
                    } else {
                      var1++;
                      var1++;
                      continue L5;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new nc();
    }
}
