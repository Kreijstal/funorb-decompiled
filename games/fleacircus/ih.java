/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ni {
    private int field_o;
    private pc field_n;
    static sf field_l;
    static String field_m;

    final void k(int param0) {
        ((ih) this).field_o = param0 * ((ih) this).field_i;
    }

    final void m(int param0) {
        ((ih) this).field_i = (((ih) this).field_o - -7) / param0;
    }

    ih(byte[] param0) {
        super(param0);
    }

    final int f(byte param0) {
        if (param0 != 47) {
          ((ih) this).m(-38);
          int fieldTemp$4 = ((ih) this).field_i;
          ((ih) this).field_i = ((ih) this).field_i + 1;
          return ((ih) this).field_k[fieldTemp$4] - ((ih) this).field_n.a(995108848) & 255;
        } else {
          int fieldTemp$5 = ((ih) this).field_i;
          ((ih) this).field_i = ((ih) this).field_i + 1;
          return ((ih) this).field_k[fieldTemp$5] - ((ih) this).field_n.a(995108848) & 255;
        }
    }

    public static void j(int param0) {
        field_m = null;
        if (param0 != 8) {
            return;
        }
        field_l = null;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = ((ih) this).field_i;
        ((ih) this).field_i = ((ih) this).field_i + 1;
        ((ih) this).field_k[fieldTemp$0] = (byte)(((ih) this).field_n.a(995108848) + param1);
        if (param0 != 8) {
            ((ih) this).field_n = null;
        }
    }

    final int b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var3 = ((ih) this).field_o >> 3;
        if (param1 == -87) {
          var4 = 8 + -(((ih) this).field_o & 7);
          var5 = 0;
          ((ih) this).field_o = ((ih) this).field_o + param0;
          L0: while (true) {
            if (var4 >= param0) {
              L1: {
                if (var4 == param0) {
                  var5 = var5 + (ek.field_d[var4] & ((ih) this).field_k[var3]);
                  break L1;
                } else {
                  var5 = var5 + (((ih) this).field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                  break L1;
                }
              }
              return var5;
            } else {
              int incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((ek.field_d[var4] & ((ih) this).field_k[incrementValue$2]) << param0 - var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ih.j(33);
          var4 = 8 + -(((ih) this).field_o & 7);
          var5 = 0;
          ((ih) this).field_o = ((ih) this).field_o + param0;
          L2: while (true) {
            if (var4 >= param0) {
              L3: {
                if (var4 == param0) {
                  var5 = var5 + (ek.field_d[var4] & ((ih) this).field_k[var3]);
                  break L3;
                } else {
                  var5 = var5 + (((ih) this).field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                  break L3;
                }
              }
              return var5;
            } else {
              int incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((ek.field_d[var4] & ((ih) this).field_k[incrementValue$3]) << param0 - var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final static void l() {
        af.a(ef.field_j, true, oa.field_o, (byte) 54);
        ud.field_c = true;
    }

    ih(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 66) {
                break L1;
              } else {
                ih.j(-43);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((ih) this).field_i;
                ((ih) this).field_i = ((ih) this).field_i + 1;
                param3[param2 + var5_int] = (byte)(((ih) this).field_k[fieldTemp$5] + -((ih) this).field_n.a(995108848));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ih.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void a(int[] param0, byte param1) {
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
              ((ih) this).field_n = new pc(param0);
              if (param1 == 12) {
                break L1;
              } else {
                ((ih) this).e(-95, -126);
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
            stackOut_3_1 = new StringBuilder().append("ih.E(");
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
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Flea Circus";
    }
}
