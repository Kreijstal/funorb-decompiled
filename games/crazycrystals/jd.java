/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends og implements vd {
    static java.awt.Canvas field_D;
    private String field_M;
    static dl field_A;
    private int field_F;
    private pc[] field_L;
    static int field_I;
    private na field_B;
    private int[] field_E;
    static boolean field_H;
    static String field_J;
    static boolean field_z;
    static int[] field_K;
    static String field_G;
    private vc field_C;

    public static void e(byte param0) {
        if (param0 < 20) {
          si discarded$2 = jd.f((byte) 41);
          field_G = null;
          field_A = null;
          field_J = null;
          field_K = null;
          field_D = null;
          return;
        } else {
          field_G = null;
          field_A = null;
          field_J = null;
          field_K = null;
          field_D = null;
          return;
        }
    }

    final static si f(byte param0) {
        if (lc.field_c != tl.field_e) {
          if (param0 == 93) {
            if (lc.field_c != io.field_P) {
              return null;
            } else {
              lc.field_c = tl.field_e;
              return qc.field_i;
            }
          } else {
            jd.e((byte) -51);
            if (lc.field_c != io.field_P) {
              return null;
            } else {
              lc.field_c = tl.field_e;
              return qc.field_i;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            var6_int = -104 % ((83 - param0) / 36);
            var7 = 0;
            L1: while (true) {
              if (((jd) this).field_F <= var7) {
                break L0;
              } else {
                if (((jd) this).field_L[var7] != param4) {
                  var7++;
                  var7++;
                  continue L1;
                } else {
                  var8 = ((jd) this).field_E[var7];
                  if (var8 == -1) {
                    ((jd) this).field_B.i((byte) -62);
                    return;
                  } else {
                    rc.a(-25537, ((jd) this).field_E[var7]);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("jd.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    jd(na param0, vc param1, String param2) {
        super(0, 0, 288, 0, (wo) null);
        int var4_int = 0;
        ((jd) this).field_F = 0;
        try {
            ((jd) this).field_B = param0;
            ((jd) this).field_C = param1;
            ((jd) this).field_M = param2;
            var4_int = null == ((jd) this).field_M ? 0 : ((jd) this).field_C.b(((jd) this).field_M, 260, ((jd) this).field_C.field_o);
            ((jd) this).a(22 + var4_int, 0, 0, 288, (byte) -52);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final pc a(String param0, bi param1, int param2) {
        pc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        pc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new pc(param0, param1);
              var4.field_i = (wo) (Object) new ve();
              var5 = -2 + ((jd) this).field_f;
              ((jd) this).a(34 + ((jd) this).field_f, 0, 0, ((jd) this).field_g, (byte) -52);
              var4.a(30, 7, var5, ((jd) this).field_g + -14, (byte) -52);
              ((jd) this).b((qm) (Object) var4, 35);
              if (param2 >= 4) {
                break L1;
              } else {
                var6 = null;
                ((jd) this).a((String) null, (byte) 44, 127);
                break L1;
              }
            }
            stackOut_2_0 = (pc) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("jd.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -92, param2, param3);
        int discarded$31 = ((jd) this).field_C.a(((jd) this).field_M, 14 + (((jd) this).field_r + param2), 10 + (param0 + ((jd) this).field_j), -28 + ((jd) this).field_g, ((jd) this).field_f, 16777215, -1, 0, 0, ((jd) this).field_C.field_o);
        if (param1 > -12) {
            Object var6 = null;
            ((jd) this).a((String) null, (byte) 125, 44);
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (!(param1 > ((jd) this).field_F)) {
            return;
        }
        pc[] var7 = new pc[param1];
        pc[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; ((jd) this).field_F > var5; var5++) {
            var7[var5] = ((jd) this).field_L[var5];
            var4[var5] = ((jd) this).field_E[var5];
        }
        ((jd) this).field_F = param1;
        ((jd) this).field_L = var3;
        ((jd) this).field_E = var4;
    }

    final void a(String param0, byte param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = ((jd) this).field_F;
            if (param1 != -124) {
                field_D = null;
            }
            this.a(119, var4_int + 1);
            ((jd) this).field_L[var4_int] = ((jd) this).a(param0, (bi) this, param1 + 167);
            ((jd) this).field_E[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "jd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = false;
        field_J = "Restart Level";
    }
}
