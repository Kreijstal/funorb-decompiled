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
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((ch.field_b ^ -1) != 0) {
                break L1;
              } else {
                if (0 != (ql.field_v ^ -1)) {
                  break L1;
                } else {
                  ql.field_v = ad.field_m;
                  ch.field_b = gb.field_j;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                kk.field_d = kk.field_d + 1;
                if (param1 == null) {
                  if (s.field_ib == null) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (param1.equals(s.field_ib)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ab.field_u) {
                  if (kg.field_e <= kk.field_d) {
                    if (kg.field_e - -wi.field_l > kk.field_d) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  kk.field_d = 0;
                  break L5;
                } else {
                  if (ab.field_u) {
                    kk.field_d = kg.field_e;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      kk.field_d = 0;
                      break L5;
                    } else {
                      kk.field_d = kg.field_e;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                bf.field_a = ch.field_b;
                if (param1 == null) {
                  if (var2_int != 0) {
                    ab.field_u = true;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  ab.field_u = false;
                  break L6;
                }
              }
              kd.field_c = ql.field_v;
              break L2;
            }
            L7: {
              if (ab.field_u) {
                break L7;
              } else {
                if (kg.field_e <= kk.field_d) {
                  break L7;
                } else {
                  if (ne.field_d) {
                    kd.field_c = ql.field_v;
                    bf.field_a = ch.field_b;
                    kk.field_d = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              if (param0 >= 122) {
                break L8;
              } else {
                var4 = (String) null;
                pd.a(95, (String) null);
                break L8;
              }
            }
            L9: {
              s.field_ib = param1;
              if (!ab.field_u) {
                break L9;
              } else {
                if (kk.field_d != pj.field_A) {
                  break L9;
                } else {
                  kk.field_d = 0;
                  ab.field_u = false;
                  break L9;
                }
              }
            }
            ch.field_b = -1;
            ql.field_v = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var2);

            stackIn_45_1 = new StringBuilder().append("pd.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
    }

    static {
        field_b = "Visit the Account Management section on the main site to view.";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
