/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hla extends bca {
    static lu field_t;
    static pj field_s;
    nq field_q;
    static String field_r;

    public static void d(int param0) {
        field_s = null;
        field_r = null;
        if (param0 > -64) {
            field_t = (lu) null;
            field_t = null;
            return;
        }
        field_t = null;
    }

    final void a(op param0, int param1) {
        try {
            int var3_int = -37 % ((param1 - 12) / 35);
            this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hla.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    hla(int param0, nq param1, nq param2) {
        super(param0, param1);
        try {
            this.field_q = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hla.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        vea stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5) {
              stackIn_4_0 = new vea(param1, (hla) (this));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (at) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hla.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (at) ((Object) stackIn_4_0);
        }
    }

    hla(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 72);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (var2_int < 0) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_q = qi.a(param0, (byte) 12);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, lu param1) {
        if (param0 > -12) {
            return;
        }
        try {
            super.a((byte) -107, param1);
            er.a(this.field_q, 112, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hla.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static sba a(int param0, ee[] param1, byte[] param2) {
        sba stackIn_5_0 = null;
        sba stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        byte[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        byte[][] var20 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if ((param1.length ^ -1) == -257) {
              var16 = new int[256];
              var11 = var16;
              var10 = var11;
              var3 = var10;
              var17 = new int[256];
              var12 = var17;
              var4 = var12;
              var18 = new int[256];
              var13 = var18;
              var5 = var13;
              if (param0 == 4676) {
                var19 = new int[256];
                var14 = var19;
                var6 = var14;
                var20 = new byte[256][];
                var15 = var20;
                var7 = var15;
                var8 = 0;
                L1: while (true) {
                  if (-257 >= (var8 ^ -1)) {
                    stackIn_10_0 = new sba(param2, var16, var17, var18, var19, param1[0].field_h, var20);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var10[var8] = param1[var8].field_f;
                    var4[var8] = param1[var8].field_c;
                    var5[var8] = param1[var8].field_d;
                    var6[var8] = param1[var8].field_e;
                    var7[var8] = param1[var8].field_g;
                    var8++;
                    continue L1;
                  }
                }
              } else {
                stackIn_5_0 = (sba) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("hla.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_t = new lu(30000);
        field_r = "Connection lost - attempting to reconnect";
    }
}
