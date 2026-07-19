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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
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
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  kk.field_d = 0;
                  break L5;
                } else {
                  L6: {
                    if (ab.field_u) {
                      break L6;
                    } else {
                      if (var2_int == 0) {
                        kk.field_d = 0;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  kk.field_d = kg.field_e;
                  if (var3 == 0) {
                    break L5;
                  } else {
                    kk.field_d = 0;
                    break L5;
                  }
                }
              }
              L7: {
                L8: {
                  bf.field_a = ch.field_b;
                  if (param1 == null) {
                    break L8;
                  } else {
                    ab.field_u = false;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (var2_int != 0) {
                  ab.field_u = true;
                  break L7;
                } else {
                  break L7;
                }
              }
              kd.field_c = ql.field_v;
              break L2;
            }
            L9: {
              if (ab.field_u) {
                break L9;
              } else {
                if (kg.field_e <= kk.field_d) {
                  break L9;
                } else {
                  if (ne.field_d) {
                    kd.field_c = ql.field_v;
                    bf.field_a = ch.field_b;
                    kk.field_d = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L10: {
              if (param0 >= 122) {
                break L10;
              } else {
                var4 = (String) null;
                pd.a(95, (String) null);
                break L10;
              }
            }
            L11: {
              s.field_ib = param1;
              if (!ab.field_u) {
                break L11;
              } else {
                if (kk.field_d != pj.field_A) {
                  break L11;
                } else {
                  kk.field_d = 0;
                  ab.field_u = false;
                  break L11;
                }
              }
            }
            ch.field_b = -1;
            ql.field_v = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var2);
            stackOut_45_1 = new StringBuilder().append("pd.G(").append(param0).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L12;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L12;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
    }

    static {
        field_b = "Visit the Account Management section on the main site to view.";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
