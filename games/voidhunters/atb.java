/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class atb {
    static int field_d;
    static phb[] field_b;
    private pfb field_c;
    private pf field_a;
    private d field_e;

    public static void a(boolean param0) {
        if (!param0) {
          atb.a(false);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final eb a(int param0, int param1) {
        int stackIn_8_0 = 0;
        pf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        pf stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        pf stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        boolean stackIn_27_2 = false;
        pf stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        boolean stackIn_38_2 = false;
        pf stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        boolean stackIn_44_2 = false;
        pf stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        boolean stackIn_50_2 = false;
        pf stackIn_56_0;
        int stackIn_56_1;
        int stackIn_56_2;
        float[] stackIn_56_3;
        boolean stackIn_57_4 = false;
        Object var3;
        eb var4;
        opa var5;
        int var6;
        float[] var7;
        int var8;
        float[] var9;
        eb var11;
        eb var13;
        eb var15;
        eb var17;
        eb var19;
        eb var21;
        eb var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        var8 = VoidHunters.field_G;
        var3 = this.field_c.b(0, (long)param1);
        if (var3 != null) {
          return (eb) (var3);
        }
        if (!this.field_e.a(param1, (byte) -49)) {
          return null;
        }
        var5 = this.field_e.a(-20292, param1);
        if (var5.field_h) {
          stackIn_8_0 = 64;
        } else {
          stackIn_8_0 = this.field_a.field_n;
        }
        var6 = stackIn_8_0;
        if (!var5.field_i) {
          if (var5.field_q == 2) {
            var23 = this.field_e.a(103, var6, var6, false, param1, 0.699999988079071f);
            stackIn_14_0 = this.field_a;
            stackIn_14_1 = var6;
            stackIn_15_2 = (var5.field_j == 0) ? false : true;
            var11 = ((pf) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2, var6, (byte) -84, var23);
            if (param0 != -1) {
              this.a(100, 49);
            }
            var11.a(var5.field_k, (byte) -98, var5.field_s);
            this.field_c.a(var11, (long)param1, (byte) -117);
            return var11;
          }
          if (!tka.a(param0 ^ 2, (int) var5.field_c)) {
            var24 = this.field_e.a(103, var6, var6, false, param1, 0.699999988079071f);
            stackIn_20_0 = this.field_a;
            stackIn_20_1 = var6;
            stackIn_21_2 = (var5.field_j == 0) ? false : true;
            var13 = ((pf) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_21_2, var6, (byte) -84, var24);
            if (param0 != -1) {
              this.a(100, 49);
            }
            var13.a(var5.field_k, (byte) -98, var5.field_s);
            this.field_c.a(var13, (long)param1, (byte) -117);
            return var13;
          }
          var25 = this.field_e.a(var6, 0.699999988079071f, true, param1, var6, true);
          stackIn_26_0 = this.field_a;
          stackIn_26_1 = var6;
          stackIn_27_2 = (var5.field_j == 0) ? false : true;
          var15 = ((pf) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_27_2, var6, (byte) -84, var25);
          var4 = var15;
          if (param0 != -1) {
            this.a(100, 49);
          }
          var15.a(var5.field_k, (byte) -98, var5.field_s);
          this.field_c.a(var15, (long)param1, (byte) -117);
          return var15;
        }
        if (this.field_a.s()) {
          var9 = this.field_e.a(0.699999988079071f, var6, param1, var6, 117, false);
          var7 = var9;
          stackIn_56_0 = this.field_a;
          stackIn_56_1 = var6;
          stackIn_56_2 = var6;
          stackIn_56_3 = var9;
          stackIn_57_4 = (var5.field_j == 0) ? false : true;
          var22 = ((pf) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_57_4, param0 + 0, qua.field_d);
          if (param0 != -1) {
            this.a(100, 49);
          }
          var22.a(var5.field_k, (byte) -98, var5.field_s);
          this.field_c.a(var22, (long)param1, (byte) -117);
          return var22;
        }
        if (var5.field_q == 2) {
          var26 = this.field_e.a(103, var6, var6, false, param1, 0.699999988079071f);
          stackIn_37_0 = this.field_a;
          stackIn_37_1 = var6;
          stackIn_38_2 = (var5.field_j == 0) ? false : true;
          var17 = ((pf) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_38_2, var6, (byte) -84, var26);
          if (param0 != -1) {
            this.a(100, 49);
          }
          var17.a(var5.field_k, (byte) -98, var5.field_s);
          this.field_c.a(var17, (long)param1, (byte) -117);
          return var17;
        }
        if (!tka.a(param0 ^ 2, (int) var5.field_c)) {
          var27 = this.field_e.a(103, var6, var6, false, param1, 0.699999988079071f);
          stackIn_43_0 = this.field_a;
          stackIn_43_1 = var6;
          stackIn_44_2 = (var5.field_j == 0) ? false : true;
          var19 = ((pf) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_44_2, var6, (byte) -84, var27);
          if (param0 != -1) {
            this.a(100, 49);
          }
          var19.a(var5.field_k, (byte) -98, var5.field_s);
          this.field_c.a(var19, (long)param1, (byte) -117);
          return var19;
        }
        var28 = this.field_e.a(var6, 0.699999988079071f, true, param1, var6, true);
        stackIn_49_0 = this.field_a;
        stackIn_49_1 = var6;
        stackIn_50_2 = (var5.field_j == 0) ? false : true;
        var21 = ((pf) (Object) stackIn_49_0).a(stackIn_49_1, stackIn_50_2, var6, (byte) -84, var28);
        if (param0 != -1) {
          this.a(100, 49);
        }
        var21.a(var5.field_k, (byte) -98, var5.field_s);
        this.field_c.a(var21, (long)param1, (byte) -117);
        return var21;
    }

    final void a(byte param0) {
        if (param0 == -106) {
          this.field_c.a(true, 5);
          return;
        }
        this.field_a = (pf) null;
        this.field_c.a(true, 5);
    }

    atb(pf param0, d param1) {
        this.field_c = new pfb(256);
        try {
          this.field_e = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "atb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
