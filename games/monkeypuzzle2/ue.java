/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends jk {
    int field_F;
    static int field_G;
    static String field_E;
    static int field_D;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param1 = am.a('_', param1, "", -23026);
        var3 = ki.a((byte) 53, param0);
        var4 = 70 % ((8 - param2) / 53);
        if (-1 == param1.indexOf(param0)) {
          if (0 != (param1.indexOf(var3) ^ -1)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -1) {
            return;
        }
        if (!(((ue) this).field_v != null)) {
            return;
        }
        if (-1 == ((ue) this).field_F) {
            return;
        }
        if (!(((ue) this).field_F != 256)) {
            ((ue) this).field_v.a(30, param1, param2 - -((ue) this).field_e, ((ue) this).field_r + param3);
            return;
        }
        le var6 = new le(((ue) this).field_v.field_l, ((ue) this).field_v.field_p);
        mc.a(-8497, var6);
        ((ue) this).field_v.a(param0, param1, 0, 0);
        tj.b(param0 ^ 659);
        var6.b(param3 + ((ue) this).field_r, param2 + ((ue) this).field_e, ((ue) this).field_F);
    }

    ue(we param0) {
        super(param0.field_r, param0.field_e, param0.field_l, param0.field_p, (ml) null, (of) null);
        param0.a(((ue) this).field_p, 13361, 0, ((ue) this).field_l, 0);
        ((ue) this).field_F = 256;
        ((ue) this).field_v = param0;
    }

    public ue() {
        super(0, 0, 0, 0, (ml) null, (of) null);
        ((ue) this).field_F = 256;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        vk var3 = null;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 122) {
          if ((af.field_c ^ -1) < -1) {
            ba.field_f = qg.a(640, 480, 0, rc.field_k, (byte) -73, 0);
            if (null != ba.field_f) {
              af.a(20, (java.awt.Canvas) (Object) ba.field_f);
              var2 = 2;
              var3 = pl.field_e;
              ff.a((ta) (Object) sb.field_r, ji.field_b, 480, ((ta) (Object) var3).field_j + ((ta) (Object) var3).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) (Object) var3).field_j, sb.field_r.field_j, 8, 320, (ta) (Object) var3);
              return;
            } else {
              var2 = 3;
              var3 = pl.field_e;
              ff.a((ta) (Object) sb.field_r, ji.field_b, 480, ((ta) (Object) var3).field_j + ((ta) (Object) var3).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) (Object) var3).field_j, sb.field_r.field_j, 8, 320, (ta) (Object) var3);
              return;
            }
          } else {
            if (ok.a(false)) {
              var2 = 0;
              var3 = pl.field_e;
              ff.a((ta) (Object) sb.field_r, ji.field_b, 480, ((ta) (Object) var3).field_j + ((ta) (Object) var3).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) (Object) var3).field_j, sb.field_r.field_j, 8, 320, (ta) (Object) var3);
              return;
            } else {
              var2 = 1;
              var3 = pl.field_e;
              ff.a((ta) (Object) sb.field_r, ji.field_b, 480, ((ta) (Object) var3).field_j + ((ta) (Object) var3).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) (Object) var3).field_j, sb.field_r.field_j, 8, 320, (ta) (Object) var3);
              return;
            }
          }
        } else {
          field_D = 13;
          if ((af.field_c ^ -1) < -1) {
            ba.field_f = qg.a(640, 480, 0, rc.field_k, (byte) -73, 0);
            if (null != ba.field_f) {
              af.a(20, (java.awt.Canvas) (Object) ba.field_f);
              var2 = 2;
              var3 = pl.field_e;
              ff.a((ta) (Object) sb.field_r, ji.field_b, 480, ((ta) (Object) var3).field_j + ((ta) (Object) var3).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) (Object) var3).field_j, sb.field_r.field_j, 8, 320, (ta) (Object) var3);
              return;
            } else {
              var2 = 3;
              var3 = pl.field_e;
              ff.a((ta) (Object) sb.field_r, ji.field_b, 480, ((ta) (Object) var3).field_j + ((ta) (Object) var3).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) (Object) var3).field_j, sb.field_r.field_j, 8, 320, (ta) (Object) var3);
              return;
            }
          } else {
            if (ok.a(false)) {
              var2 = 0;
              var3 = pl.field_e;
              ff.a((ta) (Object) sb.field_r, ji.field_b, 480, ((ta) (Object) var3).field_j + ((ta) (Object) var3).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) (Object) var3).field_j, sb.field_r.field_j, 8, 320, (ta) (Object) var3);
              return;
            } else {
              var2 = 1;
              var3 = pl.field_e;
              ff.a((ta) (Object) sb.field_r, ji.field_b, 480, ((ta) (Object) var3).field_j + ((ta) (Object) var3).field_D, (sb.field_r.field_C + sb.field_r.field_D) / 2, ik.field_o, 8, 2, var2, param1, 240, ((ta) (Object) var3).field_j, sb.field_r.field_j, 8, 320, (ta) (Object) var3);
              return;
            }
          }
        }
    }

    public static void j(int param0) {
        if (param0 != 8443) {
            return;
        }
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Email is valid";
        field_D = 0;
    }
}
