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
          jd.f((byte) 41);
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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            var6_int = -104 % ((83 - param0) / 36);
            var7 = 0;
            L1: while (true) {
              if (this.field_F <= var7) {
                break L0;
              } else {
                if (this.field_L[var7] != param4) {
                  var7++;
                  continue L1;
                } else {
                  var8 = this.field_E[var7];
                  if (0 == (var8 ^ -1)) {
                    this.field_B.i((byte) -62);
                    return;
                  } else {
                    rc.a(-25537, this.field_E[var7]);
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
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("jd.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    jd(na param0, vc param1, String param2) {
        super(0, 0, 288, 0, (wo) null);
        int var4_int = 0;
        this.field_F = 0;
        try {
            this.field_B = param0;
            this.field_C = param1;
            this.field_M = param2;
            var4_int = null == this.field_M ? 0 : this.field_C.b(this.field_M, 260, this.field_C.field_o);
            this.a(22 + var4_int, 0, 0, 288, (byte) -52);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final pc a(String param0, bi param1, int param2) {
        pc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        pc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new pc(param0, param1);
              var4.field_i = (wo) ((Object) new ve());
              var5 = -2 + this.field_f;
              this.a(34 + this.field_f, 0, 0, this.field_g, (byte) -52);
              var4.a(30, 7, var5, this.field_g + -14, (byte) -52);
              this.b(var4, 35);
              if (param2 >= 4) {
                break L1;
              } else {
                var6 = (String) null;
                this.a((String) null, (byte) 44, 127);
                break L1;
              }
            }
            stackIn_3_0 = (pc) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("jd.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -92, param2, param3);
        this.field_C.a(this.field_M, 14 + (this.field_r + param2), 10 + (param0 + this.field_j), -28 + this.field_g, this.field_f, 16777215, -1, 0, 0, this.field_C.field_o);
        if (param1 > -12) {
            String var6 = (String) null;
            this.a((String) null, (byte) 125, 44);
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (!(param1 > this.field_F)) {
            return;
        }
        pc[] var7 = new pc[param1];
        pc[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; this.field_F > var5; var5++) {
            var7[var5] = this.field_L[var5];
            var4[var5] = this.field_E[var5];
        }
        if (param0 < 92) {
            this.field_E = (int[]) null;
        } else {
            this.field_F = param1;
            this.field_L = var3;
            this.field_E = var4;
            return;
        }
        this.field_F = param1;
        this.field_L = var3;
        this.field_E = var4;
    }

    final void a(String param0, byte param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_F;
            if (param1 != -124) {
                field_D = (java.awt.Canvas) null;
            }
            this.a(119, var4_int + 1);
            this.field_L[var4_int] = this.a(param0, (bi) (this), param1 + 167);
            this.field_E[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "jd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_H = false;
        field_J = "Restart Level";
    }
}
