/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gj {
    private int field_c;
    static gj field_p;
    static gj field_e;
    int field_l;
    private una field_g;
    int field_i;
    static gj field_b;
    static gj field_m;
    static gj field_n;
    static gj field_k;
    static gj field_j;
    static int field_f;
    static nt field_o;
    static boolean field_r;
    static String field_q;
    static float field_h;
    static Hashtable field_d;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(cn param0, boolean param1) {
        jea stackIn_4_0 = null;
        jea stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        jea stackIn_7_0 = null;
        jea stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        jea var3 = null;
        cn var4 = null;
        jea var6 = null;
        jea var7 = null;
        try {
          L0: {
            L1: {
              bfa.field_e = nia.a(param0, "basic", "display_name_changed", 121);
              dn.field_b = new hla(0L, aaa.field_d, kea.field_a, ai.field_d);
              jja.field_j = new hla(0L, aaa.field_d, dj.field_a, uma.field_a);
              dqa.field_e = new jea(0L, (jea) null);
              is.field_yb = new jea(0L, kua.field_i);
              is.field_yb.field_z = 1;
              qh.field_F = new jea(0L, ooa.field_f, ija.field_i);
              mda.field_v = new jea(0L, hma.field_b, ap.field_c);
              ita.field_c = new jea(0L, dja.field_p);
              dqa.field_e.b(-122, is.field_yb);
              dqa.field_e.b(-126, qh.field_F);
              if (param1) {
                break L1;
              } else {
                var4 = (cn) null;
                gj.a((cn) null, true);
                break L1;
              }
            }
            L2: {
              dqa.field_e.b(-123, mda.field_v);
              dqa.field_e.b(-123, dn.field_b);
              dqa.field_e.b(-125, ita.field_c);
              stackIn_4_0 = dn.field_b.field_vb.field_vb;

              if (param1) {
                stackIn_5_0 = (jea) ((Object) stackIn_4_0);
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = (jea) ((Object) stackIn_4_0);
                stackIn_5_1 = 1;
                break L2;
              }
            }
            L3: {
              ((jea) (Object) stackIn_5_0).a(stackIn_5_1 != 0, kua.field_i);
              dn.field_b.field_vb.field_vb.field_bb = 1;
              var6 = dn.field_b.field_vb.field_vb;
              var7 = var6;
              var7.field_z = 1;
              stackIn_7_0 = jja.field_j.field_vb.field_vb;

              if (param1) {
                stackIn_8_0 = (jea) ((Object) stackIn_7_0);
                stackIn_8_1 = 0;
                break L3;
              } else {
                stackIn_8_0 = (jea) ((Object) stackIn_7_0);
                stackIn_8_1 = 1;
                break L3;
              }
            }
            ((jea) (Object) stackIn_8_0).a(stackIn_8_1 != 0, kua.field_i);
            jja.field_j.field_vb.field_vb.field_bb = 1;
            var3 = jja.field_j.field_vb.field_vb;
            var3.field_z = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("gj.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static gj a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = param1;
        if (var2 != 0) {
          if (-2 != (var2 ^ -1)) {
            if (-3 != (var2 ^ -1)) {
              if (var2 != 3) {
                if (-5 != (var2 ^ -1)) {
                  if (-6 != (var2 ^ -1)) {
                    if (-7 != (var2 ^ -1)) {
                      if (param0 == 41) {
                        return null;
                      } else {
                        field_d = (Hashtable) null;
                        return null;
                      }
                    } else {
                      return field_j;
                    }
                  } else {
                    return field_k;
                  }
                } else {
                  return field_n;
                }
              } else {
                return field_m;
              }
            } else {
              return field_b;
            }
          } else {
            return field_e;
          }
        } else {
          return field_p;
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_o = null;
        field_e = null;
        field_j = null;
        int var1 = -99 / ((-68 - param0) / 50);
        field_d = null;
        field_q = null;
        field_a = null;
        field_n = null;
        field_k = null;
        field_p = null;
        field_b = null;
    }

    private gj(int param0, int param1, una param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_i = param0;
            this.field_c = param1;
            this.field_g = param2;
            this.field_l = this.field_g.field_e * this.field_c;
            if ((this.field_i ^ -1) > -17) {
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("gj.<init>(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_p = new gj(0, 3, una.field_h);
        field_e = new gj(1, 3, una.field_h);
        field_b = new gj(2, 4, una.field_g);
        field_m = new gj(3, 1, una.field_h);
        field_n = new gj(4, 2, una.field_h);
        field_k = new gj(5, 3, una.field_h);
        field_j = new gj(6, 4, una.field_h);
        field_f = bia.a((byte) 93, 16);
        field_o = new nt();
        field_d = new Hashtable();
        field_a = "ESC - cancel private message";
    }
}
