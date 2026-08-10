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
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            if (param2 >= 8) {
              L1: while (true) {
                if (param1 <= var5) {
                  var4_int = var4_int ^ -1;
                  stackIn_7_0 = var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4_int = var4_int >>> 904932200 ^ hb.field_k[(param3[var5] ^ var4_int) & 255];
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -111;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("rc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        gk var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
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
                  stackIn_23_0 = (byte[]) (var5);
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
                        var12 = new byte[var5_int];
                        var10 = var12;
                        var6 = var10;
                        if (1 != var3) {
                          var7 = oe.field_o;
                          synchronized (var7) {
                            L7: {
                              oe.field_o.a(57, var12, var9);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          tg.a(var12, var5_int, param0, var4, 9);
                          break L6;
                        }
                      }
                      stackIn_21_0 = (byte[]) (var6);
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
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("rc.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static void a(float param0, int param1, byte param2) {
        float[] var3;
        float[] var4;
        float[] var5;
        float[] var6;
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
