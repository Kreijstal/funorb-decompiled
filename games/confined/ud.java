/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends rk {
    static char[] field_q;
    int field_p;
    int field_r;
    static double field_o;
    int field_m;
    int field_n;
    int[] field_s;
    int field_u;
    int field_t;

    public static void b(int param0) {
        field_q = null;
        if (param0 != 98) {
            ud.b(-36);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        om var4 = null;
        ca var5 = null;
        var3 = Confined.field_J ? 1 : 0;
        var4 = (om) (Object) jd.field_f.a(88);
        L0: while (true) {
          if (var4 == null) {
            var5 = (ca) (Object) dl.field_b.a(param1 ^ 96);
            L1: while (true) {
              if (var5 == null) {
                if (param1 != 118) {
                  field_o = 0.6728990735793879;
                  return;
                } else {
                  return;
                }
              } else {
                kd.a((byte) -115, param0, var5);
                var5 = (ca) (Object) dl.field_b.d(2123);
                continue L1;
              }
            }
          } else {
            vg.a(7932, param0, var4);
            var4 = (om) (Object) jd.field_f.d(param1 + 2005);
            continue L0;
          }
        }
    }

    final static void a(boolean param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var5 = Confined.field_J ? 1 : 0;
        oe.field_Q = b.field_a;
        if (!param0) {
          if (param1 != -256) {
            if (-101 <= param1) {
              if ((param1 ^ -1) >= -106) {
                ji.field_d = p.a(26663, param3);
                return;
              } else {
                ji.field_d = gd.a(4, param2, param1);
                return;
              }
            } else {
              ji.field_d = gd.a(4, param2, param1);
              return;
            }
          } else {
            L0: {
              stackOut_3_0 = 125;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (13 <= wc.field_Ob) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L0;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L0;
              }
            }
            ji.field_d = jj.a((byte) stackIn_6_0, stackIn_6_1 != 0);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        pe.field_q = param2;
        ef.field_vb = param0;
        if (param1 != -12) {
            Object var4 = null;
            ud.a(false, -13, (String) null, (String[]) null);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int[] param7) {
        int var9 = 115 / ((29 - param2) / 45);
        ((ud) this).field_r = param5;
        ((ud) this).field_m = param1;
        ((ud) this).field_s = param7;
        ((ud) this).field_p = param6;
        ((ud) this).field_n = param3;
        ((ud) this).field_t = param0;
        ((ud) this).field_u = param4;
    }

    ud() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
