/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pd {
    java.awt.Image field_g;
    int field_a;
    static String field_b;
    static int[] field_e;
    int[] field_h;
    static Calendar field_f;
    static boolean field_c;
    int field_d;

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
          field_e = (int[]) null;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          return;
        }
        mi.a(this.field_h, this.field_a, this.field_d);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          if (ch.field_b == -1 &&
            ql.field_v == -1) {
            ql.field_v = ad.field_m;
            ch.field_b = gb.field_j;
          }
          boolean decompiledFrameRemainder0 = true;
          kk.field_d = kk.field_d + 1;
          if (param1 == null) {
            decompiledFrameRemainder0 = (s.field_ib == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(s.field_ib));
          }
          if (decompiledFrameRemainder0) {
            if (!ab.field_u) {
              if (kg.field_e <= kk.field_d) {
                stackIn_17_0 = (kg.field_e + wi.field_l > kk.field_d) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              kk.field_d = 0;
            } else {
              if (ab.field_u) {
                kk.field_d = kg.field_e;
              } else {
                if (var2_int == 0) {
                  kk.field_d = 0;
                } else {
                  kk.field_d = kg.field_e;
                }
              }
            }
            bf.field_a = ch.field_b;
            if (param1 == null) {
              if (var2_int != 0) {
                ab.field_u = true;
              }
            } else {
              ab.field_u = false;
            }
            kd.field_c = ql.field_v;
          }
          if (!ab.field_u &&
            kg.field_e > kk.field_d &&
            ne.field_d) {
            kd.field_c = ql.field_v;
            bf.field_a = ch.field_b;
            kk.field_d = 0;
          }
          if (param0 < 122) {
            var4 = (String) null;
            pd.a(95, (String) null);
          }
          s.field_ib = param1;
          if (ab.field_u &&
            kk.field_d == pj.field_A) {
            kk.field_d = 0;
            ab.field_u = false;
          }
          ch.field_b = -1;
          ql.field_v = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("pd.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    static {
        field_b = "Visit the Account Management section on the main site to view.";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
