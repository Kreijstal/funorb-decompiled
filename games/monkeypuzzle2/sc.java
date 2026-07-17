/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc {
    static char[] field_a;
    static int field_e;
    static String field_d;
    static int[] field_h;
    static String field_b;
    static int field_c;
    static int field_g;
    static eb field_f;

    final static void b(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (lg.field_n == null) {
                    break L1;
                  } else {
                    lg.field_n.b((byte) 7);
                    break L1;
                  }
                }
                L2: {
                  if (null == jc.field_c) {
                    break L2;
                  } else {
                    jc.field_c.a(true);
                    break L2;
                  }
                }
                L3: {
                  if (null == ah.field_f) {
                    break L3;
                  } else {
                    {
                      L4: {
                        ah.field_f.a(true);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (param0 == 0) {
                    break L6;
                  } else {
                    sc.a(40);
                    break L6;
                  }
                }
                L7: {
                  if (null == bl.field_o) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (bl.field_o.length <= var1_int) {
                        break L7;
                      } else {
                        L9: {
                          if (bl.field_o[var1_int] == null) {
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var1_int++;
                        continue L8;
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw la.a((Throwable) (Object) var1, "sc.A(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        uh var3_ref_uh = null;
        int var3 = 0;
        int var4_int = 0;
        mk var4 = null;
        Object var5 = null;
        int var6 = 0;
        hb var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = MonkeyPuzzle2.field_D;
              var2 = var9.a((byte) 114);
              if (var2 != 0) {
                if (1 != var2) {
                  kk.a("A1: " + bh.a((byte) -21), (byte) 126, (Throwable) null);
                  gk.a(-1);
                  break L1;
                } else {
                  var3 = var9.e(126);
                  var4 = (mk) (Object) eb.field_C.a((byte) -117);
                  L2: while (true) {
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (var3 == var4.field_e) {
                          break L3;
                        } else {
                          var4 = (mk) (Object) eb.field_C.d((byte) 63);
                          continue L2;
                        }
                      }
                    }
                    if (var4 != null) {
                      var4.c(-19822);
                      break L1;
                    } else {
                      gk.a(-1);
                      return;
                    }
                  }
                }
              } else {
                var3_ref_uh = (uh) (Object) t.field_v.a((byte) -117);
                if (var3_ref_uh != null) {
                  L4: {
                    var4_int = var9.a((byte) 114);
                    if (var4_int != 0) {
                      var13 = new byte[var4_int];
                      var9.a(var13, var4_int, -122, 0);
                      break L4;
                    } else {
                      var5 = null;
                      break L4;
                    }
                  }
                  var9.field_h = var9.field_h + 4;
                  if (!var9.l(-24685)) {
                    gk.a(-1);
                    return;
                  } else {
                    var3_ref_uh.c(-19822);
                    break L1;
                  }
                } else {
                  gk.a(-1);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "sc.B(" + 0 + 41);
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = sb.a((byte) 79, param2);
        int var5 = 37 % ((-85 - param0) / 36);
        int var4 = r.a((byte) 71, param2);
        int var6 = sb.a((byte) 79, param1);
        int var7 = r.a((byte) 71, param1);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var7 * (long)var3 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        int var11 = (int)((long)var7 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var7, 0, var6, var8, var4, -var9, -var10, var3, var11};
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 != -21718) {
            Object var2 = null;
            String discarded$0 = sc.a((byte[]) null, -77, 2, 45);
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
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
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5 = -95 % (param2 / 52);
            var14 = new char[param1];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var4 = var11;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param1) {
                stackOut_13_0 = new String(var14, 0, var6);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L2: {
                  var8 = param0[param3 - -var7] & 255;
                  if (var8 != 0) {
                    L3: {
                      if (var8 < 128) {
                        break L3;
                      } else {
                        if (var8 >= 160) {
                          break L3;
                        } else {
                          L4: {
                            var9 = sb.field_n[-128 + var8];
                            if (var9 == 0) {
                              var9 = 63;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var8 = var9;
                          break L3;
                        }
                      }
                    }
                    int incrementValue$2 = var6;
                    var6++;
                    var4[incrementValue$2] = (char)var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4_ref;
            stackOut_15_1 = new StringBuilder().append("sc.D(");
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
          throw la.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Level Complete: <%0> pts";
        field_a = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_b = "This game has been updated! Please reload this page.";
        field_e = 0;
        field_h = new int[300];
        field_c = 0;
    }
}
