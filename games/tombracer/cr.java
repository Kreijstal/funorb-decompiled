/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr {
    private mi[] field_a;
    int field_c;
    static volatile int field_d;
    static String field_b;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            L0: {
              if (param1 >= 6144) {
                stackIn_19_0 = -ida.field_b[-param1 + 8192];
                break L0;
              } else {
                stackIn_19_0 = -ida.field_b[-4096 + param1];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-2049 < (param1 ^ -1)) {
                stackIn_15_0 = ida.field_b[param1];
                break L1;
              } else {
                stackIn_15_0 = ida.field_b[4096 + -param1];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_b = (String) null;
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            L2: {
              if (param1 >= 6144) {
                stackIn_9_0 = -ida.field_b[-param1 + 8192];
                break L2;
              } else {
                stackIn_9_0 = -ida.field_b[-4096 + param1];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-2049 < (param1 ^ -1)) {
                stackIn_5_0 = ida.field_b[param1];
                break L3;
              } else {
                stackIn_5_0 = ida.field_b[4096 + -param1];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 >= -127) {
            field_b = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        if (param0 < 77) {
          return true;
        } else {
          L0: {
            if (this.field_a.length > this.field_c) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 == 35) {
              break L0;
            } else {
              field_b = (String) null;
              break L0;
            }
          }
          if (ica.field_a) {
            tga.field_a.da(param2 >> -1445968338, -param1 >> 523861294, -param3 >> -2087861170, param0);
            return;
          } else {
            tga.field_a.HA(param2 >> -1331304210, -param1 >> -1190026802, -param3 >> 60253742, 2048, param0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("cr.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    cr(vna param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        mi var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_c = 0;
        try {
          L0: {
            this.field_a = new mi[param0.a((byte) -16)];
            var2_int = 0;
            var3 = (mi) ((Object) param0.f(-80));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.p(67);
                incrementValue$2 = var2_int;
                var2_int++;
                this.field_a[incrementValue$2] = var3;
                var3 = (mi) ((Object) param0.e(124));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("cr.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final mi c(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 >= -125) {
          this.field_a = (mi[]) null;
          fieldTemp$2 = this.field_c;
          this.field_c = this.field_c + 1;
          return this.field_a[fieldTemp$2];
        } else {
          fieldTemp$3 = this.field_c;
          this.field_c = this.field_c + 1;
          return this.field_a[fieldTemp$3];
        }
    }

    static {
        field_d = 0;
    }
}
