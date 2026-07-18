/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends kc {
    private String field_e;
    static int field_g;
    static int field_f;
    static double field_l;
    static int[] field_j;
    static md field_k;
    static String field_i;
    private String field_h;

    final fk a(boolean param0) {
        if (param0) {
            return null;
        }
        return te.field_a;
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            if (param2 >= 8) {
              L1: while (true) {
                if (param1 <= var5) {
                  var4_int = ~var4_int;
                  stackOut_6_0 = var4_int;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  var4_int = var4_int >>> 8 ^ hb.field_k[(param3[var5] ^ var4_int) & 255];
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -111;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("rc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static byte[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        gk var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_20_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              var9 = new gk(param0);
              var3 = var9.a((byte) 114);
              if (param1 > 114) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            L2: {
              var4 = var9.e(127);
              if (var4 < 0) {
                break L2;
              } else {
                L3: {
                  if (fa.field_r == 0) {
                    break L3;
                  } else {
                    if (fa.field_r < var4) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var3 == 0) {
                  var17 = new byte[var4];
                  var15 = var17;
                  var13 = var15;
                  var11 = var13;
                  var5 = var11;
                  var9.a(var17, var4, -127, 0);
                  stackOut_22_0 = (byte[]) var5;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  L4: {
                    var5_int = var9.e(-80);
                    if (var5_int < 0) {
                      break L4;
                    } else {
                      L5: {
                        if (fa.field_r == 0) {
                          break L5;
                        } else {
                          if (fa.field_r >= var5_int) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var16 = new byte[var5_int];
                        var14 = var16;
                        var12 = var14;
                        var10 = var12;
                        var6 = var10;
                        if (1 != var3) {
                          var7 = (Object) (Object) oe.field_o;
                          synchronized (var7) {
                            L7: {
                              oe.field_o.a(57, var16, var9);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          int discarded$1 = tg.a(var16, var5_int, param0, var4, 9);
                          break L6;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("rc.B(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw la.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    final static void a(float param0, int param1, byte param2) {
        if (0 >= param1) {
            bl.field_f = -1;
            mh.field_D = -1;
            return;
        }
        if (param1 >= 17) {
            bl.field_f = -1;
            mh.field_D = -1;
            return;
        }
        if (!(param1 != 16)) {
            bl.field_f = (int)pe.field_d[param1].field_e[0];
            mh.field_D = (int)pe.field_d[param1].field_e[1];
            return;
        }
        float[] var4 = ac.a(pe.field_d[param1].field_e, 120, pe.field_d[param1 + -1].field_e);
        float[] var3 = var4;
        oa.a(param0, var4, 122);
        wj.a(var4, -92, pe.field_d[param1 + -1].field_e);
        bl.field_f = (int)var4[0];
        mh.field_D = (int)var4[1];
    }

    final void a(int param0, gk param1) {
        try {
            int var3_int = 126 % ((-34 - param0) / 53);
            param1.a(((rc) this).field_e, -45);
            param1.a(((rc) this).field_h, (byte) 57);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "rc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_j = null;
        field_k = null;
    }

    rc(String param0, String param1) {
        try {
            ((rc) this).field_h = param1;
            ((rc) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "rc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0.0;
        field_j = new int[8192];
        field_i = null;
    }
}
