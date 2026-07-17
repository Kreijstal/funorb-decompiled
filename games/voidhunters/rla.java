/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends dqa implements oo {
    private htb field_w;
    private htb field_z;
    private htb field_y;
    static dja field_v;
    static int field_x;

    final static boolean c(boolean param0) {
        if (!upa.field_a) {
            return false;
        }
        if (pk.field_o != -1) {
            return true;
        }
        if (-1 != noa.field_q) {
            return true;
        }
        return false;
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = param0 + ((rla) this).field_g;
        if (param2 <= 47) {
          ((rla) this).field_z = null;
          var6 = param3 + ((rla) this).field_r;
          int discarded$2 = loa.field_o.a(dkb.field_a, 20 + var5, var6 - -20, ((rla) this).field_h - 40, ((rla) this).field_f - 50, 16777215, -1, 1, 0, loa.field_o.field_k);
          super.b(param0, param1, 94, param3);
          return;
        } else {
          var6 = param3 + ((rla) this).field_r;
          int discarded$3 = loa.field_o.a(dkb.field_a, 20 + var5, var6 - -20, ((rla) this).field_h - 40, ((rla) this).field_f - 50, 16777215, -1, 1, 0, loa.field_o.field_k);
          super.b(param0, param1, 94, param3);
          return;
        }
    }

    public static void i(byte param0) {
        if (param0 < 45) {
            return;
        }
        field_v = null;
    }

    public rla() {
        super(0, 0, 476, 225, (wwa) null);
        ((rla) this).field_w = new htb(gqb.field_b, (sba) null);
        ((rla) this).field_y = new htb(gsa.field_p, (sba) null);
        ((rla) this).field_z = new htb(cjb.field_a, (sba) null);
        vva var1 = new vva();
        ((rla) this).field_w.field_q = (wwa) (Object) var1;
        ((rla) this).field_y.field_q = (wwa) (Object) var1;
        ((rla) this).field_z.field_q = (wwa) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 1;
        ((rla) this).field_y.a(((rla) this).field_h + -var3 >> 1, var4, 30, 1, -48 + ((rla) this).field_f + -var2);
        ((rla) this).field_z.a(var4 + ((((rla) this).field_h + -var3 >> 1) + var2), var4, 30, 1, -var2 + -48 + ((rla) this).field_f);
        ((rla) this).field_w.a(((rla) this).field_h + -var3 >> 1, var3, 30, 1, -78 + (((rla) this).field_f + -(var2 * 2)));
        ((rla) this).field_y.field_l = (sba) this;
        ((rla) this).field_w.field_l = (sba) this;
        ((rla) this).field_z.field_l = (sba) this;
        ((rla) this).field_w.field_p = tt.field_a;
        ((rla) this).field_z.field_p = dqa.field_u;
        ((rla) this).b(-18756, (shb) (Object) ((rla) this).field_y);
        ((rla) this).b(-18756, (shb) (Object) ((rla) this).field_w);
        ((rla) this).b(-18756, (shb) (Object) ((rla) this).field_z);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_13_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 == 98) {
                stackOut_6_0 = ((rla) this).a(param2, param0 ^ -15834);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 != 99) {
                  if (param0 == -15834) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    field_x = -28;
                    return false;
                  }
                } else {
                  stackOut_9_0 = ((rla) this).a(true, param2);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("rla.N(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
        return stackIn_14_0 != 0;
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (((rla) this).field_y == param3) {
                ot.a(-96);
                break L1;
              } else {
                if (((rla) this).field_w == param3) {
                  kga.a(70);
                  break L1;
                } else {
                  if (param3 == ((rla) this).field_z) {
                    pr.a(17496);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 == 11) {
              break L0;
            } else {
              ((rla) this).field_y = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("rla.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = (dja) (Object) new eoa();
        field_x = 1;
    }
}
