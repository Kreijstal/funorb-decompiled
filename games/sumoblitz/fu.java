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
            IOException var2_ref = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
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
                        if (var3 == 0) {
                          L9: {
                            if (null == m.field_O[var1_int]) {
                              break L9;
                            } else {
                              try {
                                L10: {
                                  m.field_O[var1_int].b(-1);
                                  break L10;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L11: {
                                  var2_ref = (IOException) (Object) decompiledCaughtException;
                                  break L11;
                                }
                              }
                              break L9;
                            }
                          }
                          var1_int++;
                          continue L8;
                        } else {
                          return;
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
            field_F = null;
            return;
        }
        field_F = null;
    }

    final int a(int param0, int param1) {
        int discarded$2 = 0;
        if (-1 >= (param0 ^ -1)) {
          if (param0 < this.field_H.a((byte) 51)) {
            if (param1 != -24194) {
              discarded$2 = this.g(-5);
              return this.field_H.d(param0, -29816);
            } else {
              return this.field_H.d(param0, -29816);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int h(int param0) {
        if (param0 != -1) {
            this.field_I = 54;
            return this.field_G;
        }
        return this.field_G;
    }

    final int g(int param0) {
        if (param0 != 0) {
            this.field_I = 112;
            return this.field_H.a((byte) 70);
        }
        return this.field_H.a((byte) 70);
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
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
                L5: {
                  var8_int = var8_int * this.field_G / var9;
                  if (param3 != 1) {
                    break L5;
                  } else {
                    this.field_H.c(-18, var8_int);
                    if (var14 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if ((param3 ^ -1) == -3) {
                  var10 = 2147483647;
                  var11 = -1;
                  var12 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var12 >= this.field_H.a((byte) 29)) {
                          break L8;
                        } else {
                          var13 = this.field_H.d(var12, -29816) + -var8_int;
                          var13 = var13 * var13;
                          var16 = var13;
                          var15 = var10;
                          if (var14 != 0) {
                            if (var15 > var16) {
                              break L4;
                            } else {
                              break L7;
                            }
                          } else {
                            L9: {
                              if (var15 > var16) {
                                var11 = var12;
                                var10 = var13;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var12++;
                            if (var14 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if ((var11 ^ -1) > -1) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                    this.field_H.a((byte) 61, var11);
                    break L4;
                  }
                } else {
                  return true;
                }
              }
              stackOut_27_0 = 1;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var8);
            stackOut_29_1 = new StringBuilder().append("fu.R(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_28_0 != 0;
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
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (pe.field_E != null) {
              try {
                L0: {
                  pe.field_E.a(-7564, 0L);
                  pe.field_E.a(ig.field_a.field_n, 24, (byte) -41, ig.field_a.field_p);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                ig.field_a.field_p = ig.field_a.field_p + param0;
                return;
              }
              ig.field_a.field_p = ig.field_a.field_p + param0;
              return;
            } else {
              ig.field_a.field_p = ig.field_a.field_p + param0;
              return;
            }
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
