/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static bi field_b;
    private boolean field_a;
    static String field_d;
    private String field_c;

    final static short[] a(int param0, hb param1, short[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param1.g(param3, 0);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (param2.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param2 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.g(4, param0);
                var6 = (short)param1.g(16, param0 + 0);
                if (var5 > 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param2[var7] = (short)(var6 + param1.g(var5, param0 + 0));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param2[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (short[]) (param2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("bn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    public static void a(byte param0) {
        int var1 = 107 / ((param0 - 23) / 49);
        field_d = null;
        field_b = null;
    }

    final static void c(int param0) {
        vg.field_Z.g((byte) 127);
        if (ui.field_c == null) {
            ui.field_c = new jj(vg.field_Z, cb.field_b);
        }
        vg.field_Z.c(ui.field_c, param0);
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            short[] var3 = (short[]) null;
            bn.a(69, (hb) null, (short[]) null, 72);
        }
        return this.field_a;
    }

    final String a(int param0) {
        int var2 = -76 / ((param0 - -20) / 48);
        return this.field_c;
    }

    bn(String param0) {
        this(param0, false);
    }

    bn(String param0, boolean param1) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              if (null != this.field_c) {
                break L1;
              } else {
                this.field_c = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              ((bn) (this)).field_a = stackIn_6_1 != 0;
              if (this.field_c.length() != 0) {
                break L3;
              } else {
                this.field_a = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("bn.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "This game has been updated! Please reload this page.";
    }
}
