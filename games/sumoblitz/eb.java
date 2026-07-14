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
            field_b = null;
            if (null == ((eb) this).field_d) {
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
            if (null == ((eb) this).field_d) {
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
        ((eb) this).field_d = null;
        if (!((eb) this).field_e.a((byte) -78)) {
          var3 = ((eb) this).field_e.b(86);
          L0: while (true) {
            if (((eb) this).field_e.field_e != var3) {
              ((ve) (Object) var3).c(50);
              var3 = var3.field_b;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    eb(fr param0) {
        ((eb) this).field_e = new jn();
        ((eb) this).field_c = param0;
        if (((eb) this).field_c.field_xc) {
            if (((eb) this).field_c.field_C) {
                ((eb) this).field_d = new cs(((eb) this).field_c);
                if ((((eb) this).field_c.field_Bc ^ -1) < -2) {
                    if (((eb) this).field_c.field_B) {
                        if (((eb) this).field_c.field_vb) {
                            ((eb) this).field_d = new cs(((eb) this).field_c);
                        }
                    }
                }
            }
        }
    }

    static {
    }
}
