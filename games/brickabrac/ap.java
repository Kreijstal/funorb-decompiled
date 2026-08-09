/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    static mh field_e;
    static jp[] field_c;
    static jp field_a;
    static jp field_f;
    static String field_d;
    static vj field_b;

    final static void a(int param0, int param1, byte param2) {
        ll.field_b = param1;
        oo.field_v = param0;
        if (param2 < 72) {
            field_e = (mh) null;
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_5_0 = 0;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ap.a(-35, 121, (byte) -8);
                break L1;
              }
            }
            L2: {
              if (param0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {
              var2 = qc.a(ah.a(stackIn_5_0 != 0, param1), (byte) 3);
              if (var2 != null) {
                break L3;
              } else {
                var2 = "";
                break L3;
              }
            }
            stackIn_8_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("ap.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final static int a(int param0, int param1) {
        int var2;
        var2 = -102 / ((-11 - param1) / 37);
        if (((long)param0 ^ -1L) > -65537L) {
          if (((long)param0 ^ -1L) <= -257L) {
            if (-4097L < ((long)param0 ^ -1L)) {
              if (-1025L < ((long)param0 ^ -1L)) {
                return lj.field_l[param0 >> -768132478] >> -1576788373;
              } else {
                return lj.field_l[param0 >> 1884472292] >> 2044247370;
              }
            } else {
              if (16384L > (long)param0) {
                return lj.field_l[param0 >> 1323367686] >> -571796247;
              } else {
                return lj.field_l[param0 >> 1808441128] >> -636661528;
              }
            }
          } else {
            if ((param0 ^ -1) <= -1) {
              return lj.field_l[param0] >> -395145492;
            } else {
              return -1;
            }
          }
        } else {
          if (-16777217L >= ((long)param0 ^ -1L)) {
            if (((long)param0 ^ -1L) > -268435457L) {
              if ((long)param0 < 67108864L) {
                return lj.field_l[param0 >> 1264456274] >> 2080693795;
              } else {
                return lj.field_l[param0 >> 361796820] >> 215751362;
              }
            } else {
              if (1073741824L <= (long)param0) {
                return lj.field_l[param0 >> -1853585096];
              } else {
                return lj.field_l[param0 >> -1502878954] >> -1038202239;
              }
            }
          } else {
            if (-1048577L < ((long)param0 ^ -1L)) {
              if (((long)param0 ^ -1L) > -262145L) {
                return lj.field_l[param0 >> 854727882] >> -1079202649;
              } else {
                return lj.field_l[param0 >> -451303732] >> 964535174;
              }
            } else {
              if (((long)param0 ^ -1L) > -4194305L) {
                return lj.field_l[param0 >> 1229904750] >> 1502217861;
              } else {
                return lj.field_l[param0 >> 1939276560] >> 1576900804;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        if (param0) {
            ap.a(true);
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 117) {
                break L1;
              } else {
                ap.a(32, 14);
                break L1;
              }
            }
            md.a(-118, (java.awt.Component) ((Object) param1));
            pl.a((java.awt.Component) ((Object) param1), 7282);
            if (null == qa.field_x) {
              break L0;
            } else {
              qa.field_x.a((byte) 44, (java.awt.Component) ((Object) param1));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ap.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_d = "Your ignore list is full. Max of 100 hit.";
    }
}
