/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends lw {
    static String field_o;
    static String field_l;
    static int[] field_m;
    static ee field_n;

    public static void d(byte param0) {
        field_l = null;
        field_o = null;
        field_m = null;
        field_n = null;
        if (param0 >= -54) {
            wa.e((byte) -49);
        }
    }

    final static sba a(int param0, byte[] param1) {
        sba discarded$2 = null;
        sba var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        Object stackIn_4_0 = null;
        sba stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sba stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
              if (param0 == -21231) {
                break L1;
              } else {
                var3 = (byte[]) null;
                discarded$2 = wa.a(-91, (byte[]) null);
                break L1;
              }
            }
            if (param1 != null) {
              var2 = new sba(param1, fl.field_j, fd.field_D, lq.field_A, eha.field_s, hk.field_f, baa.field_P);
              al.b(-18073);
              stackOut_5_0 = (sba) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("wa.B(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (sba) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(byte param0) {
        if (param0 <= 103) {
            wa.e((byte) -22);
        }
    }

    final void a(int param0, byte param1) {
        if ((param0 ^ -1) == -35) {
          this.b(1);
          if (!this.c((byte) 95)) {
            L0: {
              if (param1 == 73) {
                break L0;
              } else {
                field_o = (String) null;
                break L0;
              }
            }
            return;
          } else {
            this.b((byte) 112);
            fla.b(23621);
            return;
          }
        } else {
          L1: {
            if (param1 == 73) {
              break L1;
            } else {
              field_o = (String) null;
              break L1;
            }
          }
          return;
        }
    }

    wa() {
        super(true, new String[]{qca.field_p}, jla.field_f);
        this.field_c = new int[][]{new int[]{160, 180}, new int[]{160, 180}};
    }

    final static void e(byte param0) {
        kr var1 = null;
        int var2 = BachelorFridge.field_y;
        try {
            if (param0 > -85) {
                wa.d((byte) -63);
            }
            if (qg.field_b.field_z != null) {
                var1 = (kr) ((Object) qg.field_b.field_z.b((byte) 90));
                while (var1 != null) {
                    if (var1.field_R == 1) {
                        qm.a(7, 7758);
                        var1.field_yb.c((byte) -80);
                        if (-1 == (var1.field_yb.field_g ^ -1)) {
                            var1.field_yb.a(false);
                            var1.a(false);
                        }
                        gu.field_d = gu.field_d - 1;
                    }
                    var1 = (kr) ((Object) qg.field_b.field_z.c(0));
                }
            }
            qf.e(20434);
            iaa.a(-119);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wa.F(" + param0 + ')');
        }
    }

    static {
        field_m = new int[1024];
        field_o = "This is <%0>'s RuneScape clan if they have one.";
        field_l = "Rankings";
    }
}
