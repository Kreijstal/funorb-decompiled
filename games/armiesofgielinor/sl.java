/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_a;
    int field_d;
    int field_e;
    byte[] field_c;
    int field_h;
    int field_g;
    static String field_i;
    boolean field_f;
    int[] field_j;
    private int field_b;

    final boolean a(int param0, int param1, bv param2) {
        if (null == ((sl) this).field_c) {
            return true;
        }
        param2.a(0, param0, ((sl) this).field_b, ((sl) this).field_c);
        if (param1 != -1) {
            return true;
        }
        ((sl) this).field_b = ((sl) this).field_b + param0;
        return ((sl) this).field_b >= ((sl) this).field_c.length ? true : false;
    }

    final void a(int param0, vh param1) {
        this.b(8, param1);
        param1.a(((sl) this).field_c, param0, ((sl) this).field_c.length, 104);
    }

    private final void b(int param0, vh param1) {
        int var3 = 0;
        int var4 = 0;
        vh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        vh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        vh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        vh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        vh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        vh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          param1.b(1, ((sl) this).field_g);
          param1.b(param0 + -7, ((sl) this).field_e);
          param1.b(true, ((sl) this).field_d);
          stackOut_0_0 = (vh) param1;
          stackOut_0_1 = 1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (((sl) this).field_f) {
            stackOut_2_0 = (vh) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (vh) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          ((vh) (Object) stackIn_3_0).b(stackIn_3_1 != 0, stackIn_3_2);
          if (((sl) this).field_j == null) {
            param1.b(1, 0);
            break L1;
          } else {
            param1.b(1, ((sl) this).field_j.length);
            var3 = 0;
            L2: while (true) {
              if (((sl) this).field_j.length <= var3) {
                break L1;
              } else {
                param1.a((byte) -74, ((sl) this).field_j[var3]);
                var3++;
                continue L2;
              }
            }
          }
        }
        L3: {
          param1.b(1, ((sl) this).field_h);
          param1.a((byte) -72, ((sl) this).field_c.length);
          if (param0 == 8) {
            break L3;
          } else {
            sl.a(25);
            break L3;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        int var1 = -54 % ((param0 - -65) / 39);
    }

    sl(vh param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        ((sl) this).field_b = -1;
        ((sl) this).field_g = param0.k(0);
        ((sl) this).field_e = param0.k(0);
        ((sl) this).field_d = param0.e((byte) -104);
        ((sl) this).field_f = -2 == (param0.e((byte) -104) ^ -1) ? true : false;
        if (param1 > 7) {
            var4 = param0.k(0);
            if (var4 > 0) {
                ((sl) this).field_j = new int[var4];
                for (var5 = 0; var5 < ((sl) this).field_j.length; var5++) {
                    ((sl) this).field_j[var5] = param0.i(1);
                }
            }
            if (param1 > 8) {
                ((sl) this).field_h = param0.k(0);
            }
        }
        var4 = param0.i(1);
        if ((var4 ^ -1) > -100001) {
            if ((var4 ^ -1) < -1) {
                ((sl) this).field_c = new byte[var4];
                if (!param2) {
                    ((sl) this).field_b = -1;
                    param0.a(0, var4, 0, ((sl) this).field_c);
                } else {
                    ((sl) this).field_b = 0;
                }
            }
        }
    }

    sl(int param0, int param1, ha param2, int param3, boolean param4) {
        ((sl) this).field_e = param1;
        ((sl) this).field_g = param0;
        ((sl) this).field_b = -1;
        vh var7 = new vh(30000);
        param2.a(var7, -25771, param2.field_K.field_w);
        ((sl) this).field_c = var7.g((byte) -82);
        ((sl) this).field_h = param2.field_e;
        ((sl) this).field_f = param4 ? true : false;
        ((sl) this).field_d = param3;
        ((sl) this).field_j = new int[param2.field_H.length];
        vm.a(param2.field_H, 0, ((sl) this).field_j, 0, param2.field_H.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Elixirs to improve the abilities of your units.";
        field_i = "Rating";
    }
}
