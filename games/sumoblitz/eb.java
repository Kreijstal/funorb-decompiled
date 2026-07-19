/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    private cs field_d;
    static ki field_f;
    static og field_b;
    private jn field_e;
    private fr field_c;
    static int[] field_a;

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 550267135) {
          L0: {
            field_b = (og) null;
            if (null == this.field_d) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == this.field_d) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param0 - 1 & param2 >> 629251103;
        if (param1 <= 87) {
          return -115;
        } else {
          return ((param2 >>> 550267135) + param2) % param0 + var3;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void b(byte param0) {
        field_b = null;
        int var1 = -15 / ((param0 - -74) / 44);
        field_a = null;
        field_f = null;
    }

    final void a(byte param0) {
        int var2 = 0;
        ms var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = -61 / ((param0 - 13) / 45);
        this.field_d = null;
        if (!this.field_e.a((byte) -78)) {
          var3 = this.field_e.b(86);
          L0: while (true) {
            if (this.field_e.field_e != var3) {
              ((ve) ((Object) var3)).c(50);
              var3 = var3.field_b;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    eb(fr param0) {
        RuntimeException var2 = null;
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
        this.field_e = new jn();
        try {
          L0: {
            L1: {
              this.field_c = param0;
              if (!this.field_c.field_xc) {
                break L1;
              } else {
                if (this.field_c.field_C) {
                  this.field_d = new cs(this.field_c);
                  if ((this.field_c.field_Bc ^ -1) >= -2) {
                    break L1;
                  } else {
                    if (!this.field_c.field_B) {
                      break L1;
                    } else {
                      if (!this.field_c.field_vb) {
                        break L1;
                      } else {
                        this.field_d = new cs(this.field_c);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("eb.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
    }
}
