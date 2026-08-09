/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fu extends wp {
    int field_J;
    private rs field_H;
    static String field_F;
    static String field_E;
    int field_I;
    private int field_G;

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1_int = 0;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var2 = null;
            var3 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == jk.field_b) {
                    break L1;
                  } else {
                    jk.field_b.c(-106);
                    break L1;
                  }
                }
                L2: {
                  if (in.field_D != null) {
                    in.field_D.b(109);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null != bc.field_a) {
                    try {
                      L4: {
                        bc.field_a.b(-1);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (param0 == -1) {
                    break L6;
                  } else {
                    field_F = (String) null;
                    break L6;
                  }
                }
                L7: {
                  if (m.field_O == null) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (m.field_O.length <= var1_int) {
                        break L7;
                      } else {
                        if (null != m.field_O[var1_int]) {
                          try {
                            L9: {
                              m.field_O[var1_int].b(-1);
                              break L9;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L10: {
                              var2 = (IOException) (Object) decompiledCaughtException;
                              break L10;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          var1_int++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw qo.a((Throwable) ((Object) var1), "fu.I(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(boolean param0) {
        field_E = null;
        if (param0) {
            fu.a(78);
        }
        field_F = null;
    }

    final int a(int param0, int param1) {
        if (-1 < (param0 ^ -1) || param0 >= this.field_H.a((byte) 51)) {
            return -1;
        }
        if (param1 != -24194) {
            this.g(-5);
        }
        return this.field_H.d(param0, -29816);
    }

    final int h(int param0) {
        if (param0 != -1) {
            this.field_I = 54;
        }
        return this.field_G;
    }

    final int g(int param0) {
        if (param0 != 0) {
            this.field_I = 112;
        }
        return this.field_H.a((byte) 70);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -42) {
                break L1;
              } else {
                fu.f(-122);
                break L1;
              }
            }
            if (super.a(param0, -105, param2, param3, param4, param5, param6)) {
              L2: {
                var8_int = param5 - (param4 + this.field_I);
                var9 = -(this.field_I * 2) + this.field_q;
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (-1 < (var8_int ^ -1)) {
                  var8_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8_int = var8_int * this.field_G / var9;
                if (param3 != 1) {
                  if ((param3 ^ -1) == -3) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (var12 >= this.field_H.a((byte) 29)) {
                        if ((var11 ^ -1) > -1) {
                          break L4;
                        } else {
                          this.field_H.a((byte) 61, var11);
                          break L4;
                        }
                      } else {
                        L6: {
                          var13 = this.field_H.d(var12, -29816) + -var8_int;
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var11 = var12;
                            var10 = var13;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  this.field_H.c(-18, var8_int);
                  break L4;
                }
              }
              stackIn_25_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var8);

            stackIn_28_1 = new StringBuilder().append("fu.R(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final static int e(byte param0) {
        int var1 = 126 % ((param0 - -26) / 38);
        return rf.field_d;
    }

    private fu() throws Throwable {
        throw new Error();
    }

    final static void f(int param0) {
        try {
            if (!(pe.field_E == null)) {
                try {
                    pe.field_E.a(-7564, 0L);
                    pe.field_E.a(ig.field_a.field_n, 24, (byte) -41, ig.field_a.field_p);
                } catch (Exception exception) {
                }
            }
            ig.field_a.field_p = ig.field_a.field_p + param0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_F = "Names can only contain letters, numbers, spaces and underscores";
    }
}
