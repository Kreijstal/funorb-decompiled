/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class ln {
    static int field_g;
    static wk field_c;
    static int field_e;
    static String field_b;
    static int field_a;
    static int field_f;
    static boolean field_h;
    static int field_d;

    final static String a(String param0, byte param1, String param2, String param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = param3.length();
            var5 = param0.length();
            var6 = param2.length();
            if (var5 != 0) {
              L1: {
                var7 = var4_int;
                var8 = var6 - var5;
                if (0 != var8) {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param3.indexOf(param0, var9_int);
                    if (var9_int >= 0) {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param3.indexOf(param0, var10);
                if (var11 >= 0) {
                  StringBuilder discarded$3 = var9.append(param3.substring(var10, var11));
                  var10 = var11 - -var5;
                  StringBuilder discarded$4 = var9.append(param2);
                  continue L3;
                } else {
                  StringBuilder discarded$5 = var9.append(param3.substring(var10));
                  stackOut_13_0 = var9.toString();
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ln.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(11).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_14_0;
    }

    final static ik a() {
        int discarded$0 = 105;
        return new ik(hl.d(87), jk.c());
    }

    final static byte[] a(byte[] param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        gi var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new gi(param0);
              var3 = var9.f((byte) -72);
              var4 = var9.i(0);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (uf.field_c == 0) {
                    break L2;
                  } else {
                    if (var4 <= uf.field_c) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (0 != var3) {
                  L3: {
                    var5 = var9.i(0);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (uf.field_c == 0) {
                          break L4;
                        } else {
                          if (var5 > uf.field_c) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var17 = new byte[var5];
                        var15 = var17;
                        var13 = var15;
                        var11 = var13;
                        var6 = var11;
                        if (1 != var3) {
                          var7 = (Object) (Object) wc.field_e;
                          synchronized (var7) {
                            L6: {
                              wc.field_e.a(var9, var17, true);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$2 = 9;
                          int discarded$3 = oi.a(var6, var5, param0, var4);
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var16 = new byte[var4];
                  var14 = var16;
                  var12 = var14;
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a(0, var16, 28, var4);
                  stackOut_6_0 = (byte[]) var5_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("ln.B(");
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
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 127 + 41);
        }
        return stackIn_21_0;
    }

    final static String a(CharSequence param0) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          int discarded$4 = 88;
          int discarded$5 = 0;
          var3 = jd.a(param0);
          if (var3 == null) {
            var4 = 0;
            L0: while (true) {
              if (param0.length() > var4) {
                if (im.a(param0.charAt(var4), false)) {
                  var4++;
                  continue L0;
                } else {
                  stackOut_10_0 = lg.field_f;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_4_0 = (String) var3;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ln.F(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 0 + 44 + -16121 + 41);
        }
    }

    public static void b() {
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = SteelSentinels.field_G;
            try {
              L0: {
                L1: {
                  if (ne.field_N == null) {
                    break L1;
                  } else {
                    ne.field_N.b(111);
                    break L1;
                  }
                }
                L2: {
                  if (null != hk.field_oc) {
                    hk.field_oc.a(0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null == si.field_o) {
                    break L3;
                  } else {
                    {
                      L4: {
                        si.field_o.c(-128);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (rh.field_o != null) {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= rh.field_o.length) {
                        break L6;
                      } else {
                        L8: {
                          if (rh.field_o[var1_int] == null) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw ci.a((Throwable) (Object) var1, "ln.C(" + -8601 + 41);
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
        field_b = "Email: ";
        field_c = null;
        field_a = 0;
        field_f = 0;
        field_d = 32;
    }
}
