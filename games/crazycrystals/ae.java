/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends og implements vd {
    static String field_D;
    static int field_F;
    private pc field_z;
    private pc field_B;
    static String field_G;
    private pc field_E;
    static String field_C;

    public ae() {
        super(0, 0, 476, 225, (wo) null);
        ((ae) this).field_E = new pc(mj.field_d, (bi) null);
        ((ae) this).field_B = new pc(dp.field_i, (bi) null);
        ((ae) this).field_z = new pc(ip.field_b, (bi) null);
        ve var1 = new ve();
        ((ae) this).field_E.field_i = (wo) (Object) var1;
        ((ae) this).field_B.field_i = (wo) (Object) var1;
        ((ae) this).field_z.field_i = (wo) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 1;
        ((ae) this).field_B.a(30, ((ae) this).field_g - var3 >> 1, -48 + ((ae) this).field_f + -var2, var4, (byte) -52);
        ((ae) this).field_z.a(30, var4 + ((-var3 + ((ae) this).field_g >> 1) + var2), ((ae) this).field_f + -48 + -var2, var4, (byte) -52);
        ((ae) this).field_E.a(30, ((ae) this).field_g - var3 >> 1, -(var2 * 2) + -78 + ((ae) this).field_f, var3, (byte) -52);
        ((ae) this).field_B.field_l = (bi) this;
        ((ae) this).field_E.field_l = (bi) this;
        ((ae) this).field_z.field_l = (bi) this;
        ((ae) this).field_E.field_t = pg.field_c;
        ((ae) this).field_z.field_t = md.field_o;
        ((ae) this).b((qm) (Object) ((ae) this).field_B, 1);
        ((ae) this).b((qm) (Object) ((ae) this).field_E, -5);
        ((ae) this).b((qm) (Object) ((ae) this).field_z, -115);
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0 != 98) {
                if (param0 == 99) {
                  stackOut_9_0 = ((ae) this).a(param2, -25911);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((ae) this).a((byte) -124, param2);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ae.AA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    public static void a() {
        field_G = null;
        field_D = null;
        field_C = null;
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (((ae) this).field_B == param4) {
                gl.b(53);
                break L1;
              } else {
                if (((ae) this).field_E == param4) {
                  ih.a((byte) 63);
                  break L1;
                } else {
                  if (((ae) this).field_z == param4) {
                    int discarded$26 = 4;
                    hf.a();
                    break L1;
                  } else {
                    var6_int = -40 % ((param0 - 83) / 36);
                    return;
                  }
                }
              }
            }
            var6_int = -40 % ((param0 - 83) / 36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ae.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 >= -12) {
          return;
        } else {
          var5 = ((ae) this).field_r - -param2;
          var6 = ((ae) this).field_j + param0;
          int discarded$1 = ai.field_h.a(j.field_h, 20 + var5, 20 + var6, -40 + ((ae) this).field_g, ((ae) this).field_f + -50, 16777215, -1, 1, 0, ai.field_h.field_o);
          super.a(param0, (byte) -20, param2, param3);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Playing Wizard Run";
        field_G = "Name";
        field_C = "There is spider web here.<br>Are there any spiders<br>nearby?";
    }
}
