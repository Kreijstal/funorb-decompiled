/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kaa implements isa {
    private il field_c;
    private int field_a;
    private int field_b;

    final static byte[] a(int param0, byte[] param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new byte[param2];
            var3 = var4;
            lua.a(param1, param0, var4, 0, param2);
            stackOut_0_0 = (byte[]) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3_ref);
            stackOut_2_1 = new StringBuilder().append("kaa.D(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(byte param0) {
        byte[] discarded$0 = null;
        bta.field_q = 0;
        ni.field_c = true;
        if (param0 <= 31) {
            byte[] var2 = (byte[]) null;
            discarded$0 = kaa.a(-119, (byte[]) null, -9);
        }
    }

    final static boolean a(int param0, int param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param2) {
          return false;
        } else {
          L0: {
            if (-1 == (24 & param1 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if ((544 & param1 ^ -1) != -545) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          return (stackIn_7_0 | stackIn_7_1) != 0;
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        byte[] discarded$2 = null;
        int discarded$3 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0.field_f) {
                  break L2;
                } else {
                  if (!param0.b((byte) -34)) {
                    stackOut_5_0 = 2188450;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_6_0;
              if (param2 == 16777215) {
                break L3;
              } else {
                var12 = (byte[]) null;
                discarded$2 = kaa.a(91, (byte[]) null, 83);
                break L3;
              }
            }
            discarded$3 = this.field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_o + "</u>", param0.field_i + param1, param0.field_n + param3, param0.field_m, param0.field_p, var6_int, -1, this.field_a, this.field_b, this.field_c.field_k + this.field_c.field_w);
            if (param0.b((byte) -34)) {
              L4: {
                L5: {
                  var7 = this.field_c.b(param0.field_o);
                  var8 = this.field_c.field_k + this.field_c.field_w;
                  var9 = param1 + param0.field_i;
                  var10 = param3 + param0.field_n;
                  if (-3 != (this.field_a ^ -1)) {
                    break L5;
                  } else {
                    var9 = var9 + (-var7 + param0.field_m);
                    if (var11 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (this.field_a == 1) {
                  var9 = var9 + (param0.field_m - var7 >> -955317823);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                L7: {
                  if (-3 == (this.field_b ^ -1)) {
                    break L7;
                  } else {
                    if (-2 != (this.field_b ^ -1)) {
                      break L6;
                    } else {
                      var10 = var10 + (param0.field_p - var8 >> -1746807167);
                      if (var11 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var10 = var10 + (-var8 + param0.field_p);
                break L6;
              }
              nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("kaa.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public kaa() {
        this.field_b = 1;
        this.field_a = 1;
        this.field_c = mj.field_J;
    }

    kaa(il param0, int param1, int param2) {
        try {
            this.field_c = param0;
            this.field_a = param1;
            this.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kaa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
