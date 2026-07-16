/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fe {
    int field_b;
    static int field_a;
    static vi field_c;
    static String field_d;

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Main.field_T;
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (65 > var6) {
                    break L3;
                  } else {
                    if (90 < var6) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(-65 + (var6 + 1));
                      break L2;
                    }
                  }
                }
                L4: {
                  if (97 > var6) {
                    break L4;
                  } else {
                    if (122 >= var6) {
                      var2 = var2 + (long)(-97 + (var6 + 1));
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (57 < var6) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(-21 + var6);
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
            if (param1 > 57) {
              break L5;
            } else {
              fe.a((byte) 61, -85);
              break L5;
            }
          }
          L6: while (true) {
            L7: {
              if (0L != var2 % 37L) {
                break L7;
              } else {
                if ((var2 ^ -1L) == -1L) {
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

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 < -22) {
                break L0;
              } else {
                field_a = 102;
                break L0;
              }
            }
            if (cb.field_j == null) {
              na.field_r.field_i = 0;
              return;
            } else {
              L1: {
                if (param1 < 0) {
                  if (na.field_r.field_i == 0) {
                    if (id.a(90) <= ua.field_E - -10000L) {
                      break L1;
                    } else {
                      na.field_r.h(param1, 0);
                      break L1;
                    }
                  } else {
                    if (na.field_r.field_i != 0) {
                      break L1;
                    } else {
                      if (id.a(90) <= ua.field_E - -10000L) {
                        break L1;
                      } else {
                        na.field_r.h(param1, 0);
                        break L1;
                      }
                    }
                  }
                } else {
                  if (na.field_r.field_i != 0) {
                    break L1;
                  } else {
                    if (id.a(90) <= ua.field_E - -10000L) {
                      break L1;
                    } else {
                      na.field_r.h(param1, 0);
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (na.field_r.field_i <= 0) {
                  break L2;
                } else {
                  try {
                    L3: {
                      cb.field_j.a(0, (byte) -89, na.field_r.field_i, na.field_r.field_g);
                      ua.field_E = id.a(125);
                      break L3;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      mc.a((byte) -126);
                      break L4;
                    }
                  }
                  na.field_r.field_i = 0;
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    fe(int param0) {
        ((fe) this).field_b = param0;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 17449) {
            fe.a((byte) 108, 62);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = 80;
    }
}
