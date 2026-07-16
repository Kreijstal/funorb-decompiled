/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ac {
    static String field_a;
    static String field_d;
    static ih field_c;
    static int field_b;

    final static void a(int param0, int param1) {
        int discarded$4 = dj.a(6445);
        if (param0 != 25972) {
            field_c = null;
        }
    }

    final static void b(int param0) {
        if (bk.field_r == null) {
          if (param0 != 112) {
            ac.d(-21);
            return;
          } else {
            return;
          }
        } else {
          bk.field_r.a((byte) -124);
          if (param0 == 112) {
            return;
          } else {
            ac.d(-21);
            return;
          }
        }
    }

    final static void d(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = EscapeVector.field_A;
              if (od.field_j != null) {
                od.field_j.a(param0 ^ -16802);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (uk.field_b != null) {
                uk.field_b.a(-24580);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -16802) {
              L2: {
                if (uc.field_h != null) {
                  try {
                    L3: {
                      uc.field_h.a((byte) -111);
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
              if (bg.field_e != null) {
                var1 = 0;
                L5: while (true) {
                  if (bg.field_e.length <= var1) {
                    return;
                  } else {
                    if (bg.field_e[var1] != null) {
                      try {
                        L6: {
                          bg.field_e[var1].a((byte) -111);
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

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        var1 = (Object) (Object) ck.field_v;
        synchronized (var1) {
          L0: {
            L1: {
              if (param0 == 28087) {
                break L1;
              } else {
                field_b = -95;
                break L1;
              }
            }
            L2: {
              ui.field_e = ui.field_e + 1;
              ve.field_l = ta.field_w;
              if (sb.field_b < 0) {
                var5 = 0;
                var2 = var5;
                L3: while (true) {
                  if (112 <= var5) {
                    sb.field_b = m.field_k;
                    break L2;
                  } else {
                    ik.field_h[var5] = false;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                L4: while (true) {
                  if (m.field_k == sb.field_b) {
                    break L2;
                  } else {
                    var2 = hc.field_C[m.field_k];
                    m.field_k = 127 & 1 + m.field_k;
                    if (0 <= var2) {
                      ik.field_h[var2] = true;
                      continue L4;
                    } else {
                      ik.field_h[var2 ^ -1] = false;
                      continue L4;
                    }
                  }
                }
              }
            }
            ta.field_w = bn.field_b;
            break L0;
          }
        }
    }

    final static ab a(String param0, int param1, mf param2, String param3, mf param4) {
        int var5 = 4 % ((50 - param1) / 60);
        int var6 = param2.b(-1, param3);
        int var7 = param2.a(var6, param0, true);
        return ha.a(var6, -198630768, param4, var7, param2);
    }

    public static void c(int param0) {
        field_d = null;
        int var1 = 76 / ((param0 - -3) / 33);
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
