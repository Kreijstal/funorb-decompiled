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
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_20_0 = 0L;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Main.field_T;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (65 > var6) {
                        break L4;
                      } else {
                        if (90 < var6) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(-65 + (var6 + 1));
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (97 > var6) {
                        break L5;
                      } else {
                        if (122 >= var6) {
                          var2_long = var2_long + (long)(-97 + (var6 + 1));
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (57 < var6) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(-21 + var6);
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
                if (param1 > 57) {
                  break L6;
                } else {
                  fe.a((byte) 61, -85);
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
                stackOut_20_0 = var2_long;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("fe.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
        return stackIn_21_0;
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
                  {
                    L3: {
                      cb.field_j.a(0, (byte) -89, na.field_r.field_i, na.field_r.field_g);
                      ua.field_E = id.a(125);
                      break L3;
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = 80;
    }
}
