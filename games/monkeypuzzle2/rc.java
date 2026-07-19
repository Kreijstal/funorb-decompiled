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
            return (fk) null;
        }
        return te.field_a;
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            if (param2 >= 8) {
              L1: while (true) {
                L2: {
                  if (param1 <= var5) {
                    var4_int = var4_int ^ -1;
                    break L2;
                  } else {
                    var4_int = var4_int >>> 904932200 ^ hb.field_k[(param3[var5] ^ var4_int) & 255];
                    var5++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      continue L1;
                    }
                  }
                }
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -111;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("rc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int discarded$1 = 0;
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
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_21_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              var9 = new gk(param0);
              var3 = var9.a((byte) 114);
              if (param1 > 114) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            L2: {
              var4 = var9.e(127);
              if (var4 < 0) {
                break L2;
              } else {
                L3: {
                  if (-1 == (fa.field_r ^ -1)) {
                    break L3;
                  } else {
                    if (fa.field_r < var4) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-1 == (var3 ^ -1)) {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5 = var11;
                  var9.a(var13, var4, -127, 0);
                  stackOut_23_0 = (byte[]) (var5);
                  stackIn_24_0 = stackOut_23_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = var9.e(-80);
                    if ((var5_int ^ -1) > -1) {
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
                        L7: {
                          var12 = new byte[var5_int];
                          var10 = var12;
                          var6 = var10;
                          if (1 != var3) {
                            break L7;
                          } else {
                            discarded$1 = tg.a(var12, var5_int, param0, var4, 9);
                            if (!MonkeyPuzzle2.field_F) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var7 = oe.field_o;
                        synchronized (var7) {
                          L8: {
                            oe.field_o.a(57, var12, var9);
                            break L8;
                          }
                        }
                        break L6;
                      }
                      stackOut_21_0 = (byte[]) (var6);
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
          L9: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("rc.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0;
        } else {
          return stackIn_24_0;
        }
    }

    final static void a(float param0, int param1, byte param2) {
        float[] var3 = null;
        float[] var4 = null;
        float[] var5 = null;
        float[] var6 = null;
        if (0 < param1) {
          if (-18 < (param1 ^ -1)) {
            if (param1 == 16) {
              bl.field_f = (int)pe.field_d[param1].field_e[0];
              mh.field_D = (int)pe.field_d[param1].field_e[1];
              return;
            } else {
              if (param2 != -111) {
                field_f = -35;
                var6 = ac.a(pe.field_d[param1].field_e, 120, pe.field_d[param1 + -1].field_e);
                var5 = var6;
                var4 = var5;
                var3 = var4;
                oa.a(param0, var6, 122);
                wj.a(var6, -92, pe.field_d[param1 + -1].field_e);
                bl.field_f = (int)var6[0];
                mh.field_D = (int)var6[1];
                return;
              } else {
                var6 = ac.a(pe.field_d[param1].field_e, 120, pe.field_d[param1 + -1].field_e);
                var5 = var6;
                var4 = var5;
                var3 = var4;
                oa.a(param0, var6, 122);
                wj.a(var6, -92, pe.field_d[param1 + -1].field_e);
                bl.field_f = (int)var6[0];
                mh.field_D = (int)var6[1];
                return;
              }
            }
          } else {
            bl.field_f = -1;
            mh.field_D = -1;
            return;
          }
        } else {
          bl.field_f = -1;
          mh.field_D = -1;
          return;
        }
    }

    final void a(int param0, gk param1) {
        try {
            int var3_int = 126 % ((-34 - param0) / 53);
            param1.a(this.field_e, -45);
            param1.a(this.field_h, (byte) 57);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "rc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_j = null;
        if (param0 < 85) {
            field_k = (md) null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    rc(String param0, String param1) {
        try {
            this.field_h = param1;
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "rc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 0.0;
        field_j = new int[8192];
        field_i = null;
    }
}
