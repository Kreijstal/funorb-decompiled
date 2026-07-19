/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class av extends jt {
    private Object field_D;
    static il field_B;
    static int[] field_C;

    final static void a(fs param0, boolean param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte stackIn_5_0 = 0;
            int stackIn_11_0 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_4_0 = 0;
            int stackOut_10_0 = 0;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var5 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var8 = new byte[24];
                    var7 = var8;
                    var6 = var7;
                    var2 = var6;
                    if (null == pe.field_E) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          pe.field_E.a(-7564, 0L);
                          pe.field_E.a(var8, (byte) 124);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (var3_int >= 24) {
                                  break L6;
                                } else {
                                  stackOut_4_0 = var8[var3_int];
                                  stackIn_11_0 = stackOut_4_0;
                                  stackIn_5_0 = stackOut_4_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    L7: {
                                      if (stackIn_5_0 == 0) {
                                        break L7;
                                      } else {
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    continue L4;
                                  }
                                }
                              }
                              stackOut_10_0 = var3_int;
                              stackIn_11_0 = stackOut_10_0;
                              break L5;
                            }
                            if (stackIn_11_0 >= 24) {
                              throw new IOException();
                            } else {
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L8: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L9: while (true) {
                            L10: {
                              if (24 <= var4) {
                                break L10;
                              } else {
                                var6[var4] = (byte)-1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L8;
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L11: {
                    if (param1) {
                      break L11;
                    } else {
                      field_C = (int[]) null;
                      break L11;
                    }
                  }
                  param0.a(var8, (byte) -123, 24, 0);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) (var2_ref);
                stackOut_24_1 = new StringBuilder().append("av.H(");
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param0 == null) {
                  stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L12;
                } else {
                  stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L12;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean e(int param0) {
        int var2 = -48 % ((14 - param0) / 51);
        return false;
    }

    final static void a(int param0, boolean param1, int param2) {
        eh.field_a = 0;
        rc.field_k = param2;
        if (param0 == -7753) {
          L0: {
            if (0 <= rc.field_k) {
              iv.field_g[rc.field_k].b(param0 + -875, param1);
              break L0;
            } else {
              break L0;
            }
          }
          if (0 == rc.field_k) {
            if (7 == nj.field_b) {
              return;
            } else {
              ag.a(0, 0);
              return;
            }
          } else {
            return;
          }
        } else {
          L1: {
            field_C = (int[]) null;
            if (0 <= rc.field_k) {
              iv.field_g[rc.field_k].b(param0 + -875, param1);
              break L1;
            } else {
              break L1;
            }
          }
          if (0 == rc.field_k) {
            if (7 == nj.field_b) {
              return;
            } else {
              ag.a(0, 0);
              return;
            }
          } else {
            return;
          }
        }
    }

    av(Object param0, int param1) {
        super(param1);
        try {
            this.field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "av.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        field_C = null;
        field_B = null;
        if (param0 != 24) {
            av.f(30);
        }
    }

    final Object c(byte param0) {
        int var2 = -15 % ((37 - param0) / 58);
        return this.field_D;
    }

    static {
        field_B = new il();
    }
}
