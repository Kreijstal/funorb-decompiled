/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class ba {
    int field_n;
    byte[] field_l;
    static long field_a;
    byte[] field_h;
    static String field_c;
    int field_g;
    int field_e;
    int field_i;
    static int[] field_k;
    int field_m;
    int field_d;
    static String field_f;
    static int[] field_o;
    static String field_b;
    int field_j;

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 <= 75) {
            return;
        }
        field_c = null;
        field_o = null;
        field_b = null;
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_27_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_31_0 = null;
        String stackOut_26_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = gk.a(param1, -13);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (rk.a((byte) 117, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (!rk.a((byte) 118, var4.charAt(-1 + var4.length()))) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param1.length()) {
                                    if (var5 > 0) {
                                      stackOut_31_0 = ua.field_H;
                                      stackIn_32_0 = stackOut_31_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param1.charAt(var6);
                                      if (rk.a((byte) 123, (char) var7)) {
                                        var5++;
                                        break L5;
                                      } else {
                                        var5 = 0;
                                        break L5;
                                      }
                                    }
                                    if (2 > var5) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_26_0 = ff.field_e;
                                      stackIn_27_0 = stackOut_26_0;
                                      return stackIn_27_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_17_0 = ua.field_H;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = lm.field_c;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = lm.field_c;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = lm.field_c;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("ba.F(").append(false).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + true + ')');
        }
        return stackIn_32_0;
    }

    final static void a(int param0) {
        if (param0 < 80) {
            ba.a((byte) 114);
        }
        g.field_e.a((byte) -92, (qm) (Object) new td());
    }

    final static void c(int param0) {
        p.field_b.f(-120);
        if (null == ci.field_c) {
            ci.field_c = new gd(p.field_b, fg.field_o);
        }
        p.field_b.b((qm) (Object) ci.field_c, 15637);
    }

    final static void b(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (jl.field_c == null) {
                    break L1;
                  } else {
                    jl.field_c.c(16711422);
                    break L1;
                  }
                }
                L2: {
                  if (null == ed.field_yb) {
                    break L2;
                  } else {
                    ed.field_yb.a((byte) 90);
                    break L2;
                  }
                }
                L3: {
                  if (null != bm.field_e) {
                    {
                      L4: {
                        bm.field_e.c((byte) -101);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (null == bb.field_b) {
                    break L6;
                  } else {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= bb.field_b.length) {
                        break L6;
                      } else {
                        L8: {
                          if (null != bb.field_b[var1_int]) {
                            {
                              L9: {
                                bb.field_b[var1_int].c((byte) -101);
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw aa.a((Throwable) (Object) var1, "ba.B(" + 11670 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(int param0) {
        int var1 = 96;
        if (null != p.field_b) {
            p.field_b.h((byte) 83);
        }
        if (ci.field_c != null) {
            ci.field_c.k((byte) 61);
        }
        hb.f((byte) -102);
    }

    final static String a(int param0, int param1, byte param2, byte[] param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var14 = new char[param1];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            if (param2 < -122) {
              L1: while (true) {
                if (~var6 <= ~param1) {
                  stackOut_13_0 = new String(var14, 0, var5);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    var7 = param3[param0 + var6] & 255;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      L3: {
                        if (var7 < 128) {
                          break L3;
                        } else {
                          if (var7 >= 160) {
                            break L3;
                          } else {
                            L4: {
                              var8 = oc.field_a[-128 + var7];
                              if (0 != var8) {
                                break L4;
                              } else {
                                var8 = 63;
                                break L4;
                              }
                            }
                            var7 = var8;
                            break L3;
                          }
                        }
                      }
                      int incrementValue$2 = var5;
                      var5++;
                      var10[incrementValue$2] = (char)var7;
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("ba.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Players";
        field_f = "Please wait...";
        field_k = new int[8192];
        field_b = "Reading Book of Flame";
    }
}
