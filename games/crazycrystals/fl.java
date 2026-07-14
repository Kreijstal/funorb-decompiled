/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl implements wo {
    private int field_c;
    private int field_n;
    private vc field_p;
    private int field_h;
    static int field_g;
    private int field_j;
    private int field_r;
    static int field_m;
    private int field_e;
    private int field_d;
    static dl[] field_i;
    static String field_f;
    private int field_o;
    static dl field_a;
    private int field_k;
    static String field_l;
    private int field_b;
    private int field_q;

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        of var11 = null;
        qm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof of)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qm) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (of) (Object) stackIn_3_0;
          if (var11 != null) {
            param4 = param4 & var11.field_x;
            break L1;
          } else {
            break L1;
          }
        }
        var7 = 5592405;
        if (param1) {
          L2: {
            field_g = 26;
            kh.f(param2 + param3.field_r, param3.field_j + param0, param3.field_g, param3.field_f, ((fl) this).field_b);
            if (!param4) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          L3: {
            var8 = ((fl) this).field_r + param3.field_r + param2;
            var9 = ((fl) this).field_j + param3.field_j + param0;
            kh.b(var8, var9, ((fl) this).field_h, ((fl) this).field_d, 5592405);
            kh.f(var8, var9, ((fl) this).field_h, ((fl) this).field_d, var7);
            if (var11.field_A) {
              kh.e(var8, var9, var8 - -((fl) this).field_h, var9 + ((fl) this).field_d, 1);
              kh.e(((fl) this).field_h + var8, var9, var8, var9 - -((fl) this).field_d, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null != ((fl) this).field_p) {
              var10 = ((fl) this).field_h + ((fl) this).field_r - -((fl) this).field_n;
              int discarded$2 = ((fl) this).field_p.a(param3.field_o, var10 + param2 - -param3.field_r, ((fl) this).field_o + (param0 - -param3.field_j), param3.field_g - var10 + -((fl) this).field_n, -(((fl) this).field_n << 1158940289) + param3.field_f, ((fl) this).field_e, ((fl) this).field_c, ((fl) this).field_k, ((fl) this).field_q, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          L5: {
            kh.f(param2 + param3.field_r, param3.field_j + param0, param3.field_g, param3.field_f, ((fl) this).field_b);
            if (!param4) {
              break L5;
            } else {
              var7 = 16777215;
              break L5;
            }
          }
          L6: {
            var8 = ((fl) this).field_r + param3.field_r + param2;
            var9 = ((fl) this).field_j + param3.field_j + param0;
            kh.b(var8, var9, ((fl) this).field_h, ((fl) this).field_d, 5592405);
            kh.f(var8, var9, ((fl) this).field_h, ((fl) this).field_d, var7);
            if (var11.field_A) {
              kh.e(var8, var9, var8 - -((fl) this).field_h, var9 + ((fl) this).field_d, 1);
              kh.e(((fl) this).field_h + var8, var9, var8, var9 - -((fl) this).field_d, 1);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (null != ((fl) this).field_p) {
              var10 = ((fl) this).field_h + ((fl) this).field_r - -((fl) this).field_n;
              int discarded$3 = ((fl) this).field_p.a(param3.field_o, var10 + param2 - -param3.field_r, ((fl) this).field_o + (param0 - -param3.field_j), param3.field_g - var10 + -((fl) this).field_n, -(((fl) this).field_n << 1158940289) + param3.field_f, ((fl) this).field_e, ((fl) this).field_c, ((fl) this).field_k, ((fl) this).field_q, 0);
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 1) {
          field_f = null;
          vk.a(param1 ^ -39, false, param0);
          return;
        } else {
          vk.a(param1 ^ -39, false, param0);
          return;
        }
    }

    final static String a(int param0, String param1, db param2, String param3) {
        Object var5 = null;
        if (!param2.a((byte) 102)) {
          return param1;
        } else {
          if (param0 < 36) {
            var5 = null;
            String discarded$2 = fl.a(-14, (String) null, (db) null, (String) null);
            return param3 + " - " + param2.b(3492) + "%";
          } else {
            return param3 + " - " + param2.b(3492) + "%";
          }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_f = null;
        field_i = null;
        field_a = null;
        if (param0 >= -94) {
            field_l = null;
        }
    }

    fl(vc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((fl) this).field_k = 1;
        ((fl) this).field_q = 1;
        ((fl) this).field_b = param9;
        ((fl) this).field_h = param8;
        ((fl) this).field_c = param4;
        ((fl) this).field_r = param5;
        ((fl) this).field_n = param1;
        ((fl) this).field_p = param0;
        ((fl) this).field_d = param7;
        ((fl) this).field_o = param2;
        ((fl) this).field_e = param3;
        ((fl) this).field_j = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
        field_f = "This is a bouncy ball.<br><br>Bouncy balls bounce back<br>and forth. Do not stand<br>in the way!<br><br>You can run up against a<br>bouncy ball safely, as long<br>as it does not run into<br>you.";
        field_l = "Not yet achieved";
    }
}
