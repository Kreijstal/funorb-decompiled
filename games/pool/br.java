/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends ob {
    static String field_L;
    static boolean field_H;
    static String field_K;
    static vh field_M;
    static vh field_J;
    static int field_I;

    br(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((dd) null, param0, param1, param2, param3, param4, param5);
    }

    final void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var4 = ((br) this).field_h[param2];
        if (23 == var4) {
          if (((br) this).field_B.b((byte) 61)) {
            L0: {
              stackOut_4_0 = null;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!oe.a(false, hp.field_c)) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 16;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 18;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            nk.a((String) (Object) stackIn_7_0, stackIn_7_1, (byte) 121);
            return;
          } else {
            super.b(param0, param1, param2);
            return;
          }
        } else {
          super.b(param0, param1, param2);
          return;
        }
    }

    final static void f(int param0) {
        lh.field_c = new nf();
        tn.field_n.d((ei) (Object) lh.field_c, 30);
        if (param0 != 35) {
            field_J = null;
        }
    }

    final void a(byte param0) {
        if (param0 >= -11) {
            field_J = null;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          field_J = null;
          field_K = null;
          field_J = null;
          field_M = null;
          field_L = null;
          return;
        } else {
          field_K = null;
          field_J = null;
          field_M = null;
          field_L = null;
          return;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          super.c(91);
          var2 = oe.a(false, hp.field_c) ? 1 : 0;
          if (ti.field_d == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 <= 36) {
          return;
        } else {
          var4 = oe.field_O;
          var4 = var4 + " " + o.a('#', "<br><br>", nr.a(new String[1], -1, n.a(var2 != 0, var3 != 0, false, (byte) 39)), 1);
          ((br) this).a((lr) (Object) sa.field_h, new int[1], 140, -16097, var4, 280, 15658734);
          ((br) this).b(140, false);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_K = "Quick Chat game";
    }
}
