/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj implements cj {
    static String[] field_c;
    static im field_d;
    static vg field_b;
    static String field_a;
    static String field_f;
    static String field_e;

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ci var8 = null;
        try {
          L0: {
            var6_int = param2 - -param1.field_w;
            var7 = param1.field_u + param0;
            ah.a(param1.field_n, 128, param1.field_p, var6_int, var7);
            if (param3 == -24381) {
              L1: {
                var8 = og.field_c[1];
                if (!(param1 instanceof eb)) {
                  break L1;
                } else {
                  if (((eb) ((Object) param1)).field_C) {
                    var8.d((-var8.field_q + param1.field_p >> 16861537) + (var6_int - -1), var7 + 1 + (-var8.field_u + param1.field_n >> -1724550079), 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (!param1.d(-118)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                ed.a(-4 + param1.field_p, -4 + param1.field_n, 2 + var7, 52, var6_int + 2);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("kj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int var1;
        int var2;
        var2 = Terraphoenix.field_V;
        if (param0 == 95) {
          m.field_e = null;
          fd.field_k = false;
          if (!qi.field_b) {
            var1 = db.field_b;
            if (-1 > (var1 ^ -1)) {
              if (var1 != 1) {
                m.field_e = ij.a(new String[]{Integer.toString(var1)}, -1, na.field_X);
                m.field_e = bj.a(new CharSequence[]{(CharSequence) ((Object) m.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) mm.field_h)}, (byte) -103);
                nb.field_b.h((byte) -126);
                vj.a(param0 ^ -24476);
                return;
              } else {
                m.field_e = ol.field_Lb;
                m.field_e = bj.a(new CharSequence[]{(CharSequence) ((Object) m.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) mm.field_h)}, (byte) -103);
                nb.field_b.h((byte) -126);
                vj.a(param0 ^ -24476);
                return;
              }
            } else {
              nb.field_b.h((byte) -126);
              vj.a(param0 ^ -24476);
              return;
            }
          } else {
            nb.field_b.l(54);
            return;
          }
        } else {
          field_b = (vg) null;
          m.field_e = null;
          fd.field_k = false;
          if (!qi.field_b) {
            var1 = db.field_b;
            if (-1 > (var1 ^ -1)) {
              if (var1 != 1) {
                m.field_e = ij.a(new String[]{Integer.toString(var1)}, -1, na.field_X);
                m.field_e = bj.a(new CharSequence[]{(CharSequence) ((Object) m.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) mm.field_h)}, (byte) -103);
                nb.field_b.h((byte) -126);
                vj.a(param0 ^ -24476);
                return;
              } else {
                m.field_e = ol.field_Lb;
                m.field_e = bj.a(new CharSequence[]{(CharSequence) ((Object) m.field_e), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) mm.field_h)}, (byte) -103);
                nb.field_b.h((byte) -126);
                vj.a(param0 ^ -24476);
                return;
              }
            } else {
              nb.field_b.h((byte) -126);
              vj.a(param0 ^ -24476);
              return;
            }
          } else {
            nb.field_b.l(54);
            return;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -87 % ((-43 - param0) / 37);
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    static {
        field_a = "Terrain Level:";
        field_d = new im();
        field_e = "Unfortunately we are unable to create an account for you at this time.";
    }
}
