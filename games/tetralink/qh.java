/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends d implements ih, cg {
    static boolean field_k;
    hn field_m;
    static int field_n;
    static String field_l;

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2_int = ((qh) this).field_m.g((byte) 12);
            if (param0 == 0) {
              L1: {
                var3 = ((qh) this).field_m.a(false);
                var4 = ((qh) this).field_m.f((byte) 94);
                var5 = df.a(true);
                if (var4 < 1890) {
                  break L1;
                } else {
                  if (var4 <= var5 - 3) {
                    if (!fk.a(var4, (byte) -40, var2_int, var3)) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_6_0 = sk.a(new String[2], fm.field_d, param0 + 122);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        return nm.field_y;
    }

    public final void a(byte param0, nn param1) {
        try {
            int var3_int = -10 / ((-18 - param0) / 63);
            ((qh) this).a(125);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "qh.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, byte param2, int param3, int param4, boolean param5) {
        if (ak.a(3058)) {
            we.a(param5, 15, -2, 13);
            if (null != hd.field_s) {
                if (hd.field_s.a(13, 11, param5, (byte) 53, 0)) {
                    param5 = false;
                    int discarded$0 = 43;
                    gg.c();
                }
            }
            int discarded$1 = 107;
            int discarded$2 = 13;
            ej.a(param5);
            int discarded$3 = 14;
            int discarded$4 = -1;
            mn.a(param5);
            param5 = false;
        }
        return param5;
    }

    public static void d() {
        field_l = null;
    }

    final static void a(gd param0, int param1, int param2, int param3, int param4, int param5, rb param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        pf var13 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            gd.a(param0.field_Rb, 255, param0.field_Yb, -1, param6, (int[]) null, param0.field_Nb, (hl) (Object) param0, -1);
            hd.field_s.a(19, true);
            hd.field_s.a(0, (int[]) null, true);
            hd.field_s.a(true);
            var13 = hd.field_s;
            var8 = param1;
            var9 = param4;
            var10 = param5;
            var11 = param2;
            var13.field_j.a(var10, var9, -74, var11, var8);
            if (param3 < -48) {
              break L0;
            } else {
              var12 = null;
              qh.a((gd) null, 6, 79, 49, 30, -92, (rb) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("qh.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public final boolean b(int param0) {
        if (param0 != 13074) {
            return false;
        }
        return ((qh) this).field_m.h(-30886);
    }

    final static void a(boolean param0, byte param1, int param2, ri param3) {
        try {
            bn.field_c.a(param3, 1048576, false, 256, 1000000, (byte) -128);
            int var5_int = -120;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "qh.D(" + true + ',' + -56 + ',' + 1048576 + ',' + (param3 != null ? "{...}" : "null") + ',' + 256 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ck.field_bb.a((byte) -85, 640, 0, param3, param0);
        if (gl.field_o != null) {
          gl.field_o.a(param5, param3, param5 + -d.field_e, param1, param3, 0);
          return;
        } else {
          return;
        }
    }

    public final void a(nn param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 101) {
                break L1;
              } else {
                ((qh) this).field_m = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qh.P(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final jk a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jk stackIn_3_0 = null;
        jk stackIn_7_0 = null;
        jk stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        jk stackOut_2_0 = null;
        jk stackOut_6_0 = null;
        jk stackOut_9_0 = null;
        try {
          L0: {
            var2_int = ((qh) this).field_m.g((byte) 12);
            var3 = ((qh) this).field_m.a(param0);
            var4 = ((qh) this).field_m.f((byte) 66);
            var5 = df.a(true);
            if (var4 < 1890) {
              stackOut_2_0 = db.field_h;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (var4 > -3 + var5) {
                stackOut_6_0 = db.field_h;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (fk.a(var4, (byte) -40, var2_int, var3)) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackOut_9_0 = db.field_h;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return db.field_h;
        }
        if (decompiledRegionSelector0 == 0) {
          return pf.field_a;
        } else {
          return stackIn_10_0;
        }
    }

    public qh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "<%0> wants to join";
    }
}
