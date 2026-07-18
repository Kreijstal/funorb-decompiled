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
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        mi.a(((pd) this).field_h, ((pd) this).field_a, ((pd) this).field_d);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ch.field_b != -1) {
                break L1;
              } else {
                if (ql.field_v != -1) {
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
                  if (param1.equals((Object) (Object) s.field_ib)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (ab.field_u) {
                    break L5;
                  } else {
                    if (kg.field_e > kk.field_d) {
                      break L5;
                    } else {
                      if (kg.field_e - -wi.field_l <= kk.field_d) {
                        break L5;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              }
              L6: {
                var2_int = stackIn_14_0;
                if (param1 == null) {
                  kk.field_d = 0;
                  break L6;
                } else {
                  if (ab.field_u) {
                    kk.field_d = kg.field_e;
                    break L6;
                  } else {
                    if (var2_int == 0) {
                      kk.field_d = 0;
                      break L6;
                    } else {
                      kk.field_d = kg.field_e;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                bf.field_a = ch.field_b;
                if (param1 == null) {
                  if (var2_int != 0) {
                    ab.field_u = true;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  ab.field_u = false;
                  break L7;
                }
              }
              kd.field_c = ql.field_v;
              break L2;
            }
            L8: {
              if (ab.field_u) {
                break L8;
              } else {
                if (~kg.field_e >= ~kk.field_d) {
                  break L8;
                } else {
                  if (ne.field_d) {
                    kd.field_c = ql.field_v;
                    bf.field_a = ch.field_b;
                    kk.field_d = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (param0 >= 122) {
                break L9;
              } else {
                var4 = null;
                pd.a(95, (String) null);
                break L9;
              }
            }
            L10: {
              s.field_ib = param1;
              if (!ab.field_u) {
                break L10;
              } else {
                if (kk.field_d != pj.field_A) {
                  break L10;
                } else {
                  kk.field_d = 0;
                  ab.field_u = false;
                  break L10;
                }
              }
            }
            ch.field_b = -1;
            ql.field_v = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var2;
            stackOut_40_1 = new StringBuilder().append("pd.G(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L11;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Visit the Account Management section on the main site to view.";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
