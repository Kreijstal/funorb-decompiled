/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wj extends hf implements vc {
    static String field_h;
    private rj field_m;
    static String field_l;
    static tk field_k;
    static na field_i;
    static ad field_j;

    public final void a(int param0, rj param1) {
        if (param0 >= -19) {
            field_l = null;
        }
    }

    final na c(int param0) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          le[] discarded$2 = wj.a((byte) -23, -1, (ad) null, 109);
          return ((wj) this).a(((wj) this).field_m.field_s, param0 ^ 3916);
        } else {
          return ((wj) this).a(((wj) this).field_m.field_s, param0 ^ 3916);
        }
    }

    final String c(byte param0) {
        int var2 = 33 / ((param0 - 32) / 45);
        return ((wj) this).a(1, ((wj) this).field_m.field_s);
    }

    final static le[] a(byte param0, int param1, ad param2, int param3) {
        Object var5 = null;
        if (wg.a(param3, param1, param2, -3)) {
          if (param0 != 83) {
            var5 = null;
            le[] discarded$2 = wj.a((byte) -96, -124, (ad) null, -100);
            return o.a(true);
          } else {
            return o.a(true);
          }
        } else {
          return null;
        }
    }

    abstract String a(int param0, String param1);

    final static void a(int param0, wf param1, int param2) {
        int var4 = 0;
        hb var5 = null;
        var5 = gf.field_c;
        var5.b(true, param2);
        var5.field_h = var5.field_h + 1;
        var4 = var5.field_h;
        var5.b(1, param0 + -74685);
        var5.b(param1.field_e, param0 + -74685);
        var5.a(param1.field_f, false);
        var5.a(-803539344, param1.field_g);
        var5.a(-803539344, param1.field_k);
        if (param0 != 25533) {
          boolean discarded$3 = wj.d(80);
          var5.a(-803539344, param1.field_l);
          var5.a(-803539344, param1.field_j);
          int discarded$4 = var5.a((byte) -59, var4);
          var5.a(-var4 + var5.field_h, (byte) -113);
          return;
        } else {
          var5.a(-803539344, param1.field_l);
          var5.a(-803539344, param1.field_j);
          int discarded$5 = var5.a((byte) -59, var4);
          var5.a(-var4 + var5.field_h, (byte) -113);
          return;
        }
    }

    final static void d(byte param0) {
        if (param0 != 35) {
          L0: {
            field_j = null;
            if (me.field_f != null) {
              me.field_f.g((byte) -75);
              break L0;
            } else {
              break L0;
            }
          }
          sc.field_f = new eb();
          jh.field_C.c((byte) 36, (we) (Object) sc.field_f);
          return;
        } else {
          L1: {
            if (me.field_f != null) {
              me.field_f.g((byte) -75);
              break L1;
            } else {
              break L1;
            }
          }
          sc.field_f = new eb();
          jh.field_C.c((byte) 36, (we) (Object) sc.field_f);
          return;
        }
    }

    public final void b(int param0, rj param1) {
        if (param0 != 16926) {
            Object var4 = null;
            ((wj) this).a(35, (rj) null);
            ((wj) this).a((byte) -88);
            return;
        }
        ((wj) this).a((byte) -88);
    }

    final static boolean d(int param0) {
        int var1 = 0;
        var1 = 96 / ((37 - param0) / 53);
        if (-21 >= (mc.field_a ^ -1)) {
          if (vg.c(false)) {
            if ((ue.field_G ^ -1) < -1) {
              if (ej.a(12931)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    abstract na a(String param0, int param1);

    public final boolean a(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (((wj) this).field_m.field_s != null) {
            if (0 == ((wj) this).field_m.field_s.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_k = null;
          if (((wj) this).field_m.field_s == null) {
            return true;
          } else {
            L0: {
              if (0 != ((wj) this).field_m.field_s.length()) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    wj(rj param0) {
        ((wj) this).field_m = param0;
    }

    public static void e(byte param0) {
        field_l = null;
        if (param0 != -95) {
          boolean discarded$2 = wj.d(57);
          field_j = null;
          field_k = null;
          field_h = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          field_h = null;
          field_i = null;
          return;
        }
    }

    final static void a(float[] param0, int param1, float[] param2) {
        if (param1 > -72) {
          field_l = null;
          param0[0] = param0[0] + param2[0];
          param0[1] = param0[1] + param2[1];
          return;
        } else {
          param0[0] = param0[0] + param2[0];
          param0[1] = param0[1] + param2[1];
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Well done!";
        field_l = "Player names can be up to 12 letters, numbers and underscores";
        field_k = new tk();
        field_i = new na();
    }
}
