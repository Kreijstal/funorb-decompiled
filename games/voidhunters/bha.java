/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bha implements ntb {
    boolean field_a;

    public boolean a(byte param0, tv param1) {
        int var3 = -73 % ((param0 - 22) / 59);
        bha var4 = (bha) (Object) param1;
        return (!var4.field_a ? 1 : 0) != (!var4.field_a ? 1 : 0) ? true : false;
    }

    void a(boolean param0, tja param1, int param2, int param3) {
        if (!param0) {
            Object var6 = null;
            ((bha) this).a(true, (tja) null, -49, 117);
        }
    }

    public void a(tv param0, int param1) {
        Object var3 = null;
        bha var3_ref = null;
        int var4 = 0;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        var3 = null;
        if (param1 < -19) {
          L0: {
            var3_ref = (bha) (Object) param0;
            var4 = 0;
            stackOut_11_0 = var3_ref.field_a;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (var3_ref.field_a) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          L1: {
            if ((stackIn_14_0 ? 1 : 0) == stackIn_14_1) {
              var4 = 1;
              iva.a(-6940, "boolean connected has changed. before=" + var3_ref.field_a + ", now=" + var3_ref.field_a);
              break L1;
            } else {
              break L1;
            }
          }
          if (var4 != 0) {
            tfb.a((byte) -73, "This instance of CarouselPlayerInfo has changed");
            return;
          } else {
            return;
          }
        } else {
          L2: {
            ((bha) this).field_a = true;
            var3_ref = (bha) (Object) param0;
            var4 = 0;
            stackOut_1_0 = var3_ref.field_a;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var3_ref.field_a) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          L3: {
            if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
              var4 = 1;
              iva.a(-6940, "boolean connected has changed. before=" + var3_ref.field_a + ", now=" + var3_ref.field_a);
              break L3;
            } else {
              break L3;
            }
          }
          if (var4 != 0) {
            tfb.a((byte) -73, "This instance of CarouselPlayerInfo has changed");
            return;
          } else {
            return;
          }
        }
    }

    public void a(faa param0, boolean param1) {
        ((bha) this).field_a = kv.a(param1, param0);
    }

    void a(tja param0, int param1, int param2, int param3) {
        if (param2 != -24354) {
            ((bha) this).field_a = true;
        }
    }

    public void b(faa param0, int param1) {
        Object var4 = null;
        if (param1 > -109) {
          var4 = null;
          ((bha) this).a((faa) null, true);
          boolean discarded$4 = vq.a(param0, -82, ((bha) this).field_a);
          return;
        } else {
          boolean discarded$5 = vq.a(param0, -82, ((bha) this).field_a);
          return;
        }
    }

    public void b(byte param0, tv param1) {
        if (param0 <= 54) {
            return;
        }
        bha var5 = (bha) (Object) param1;
        bha var6 = var5;
        var6.field_a = var5.field_a;
    }

    static {
    }
}
