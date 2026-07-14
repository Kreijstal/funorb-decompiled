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
            field_e = null;
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        String var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0;
        int stackOut_8_0;
        int stackOut_3_0;
        int stackOut_2_0;
        if (!param0) {
          L0: {
            ap.a(-35, 121, (byte) -8);
            if (param0) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L0;
            }
          }
          L1: {
            var2 = qc.a(ah.a(stackIn_10_0 != 0, param1), (byte) 3);
            if (var2 != null) {
              break L1;
            } else {
              var2 = "";
              break L1;
            }
          }
          return var2;
        } else {
          L2: {
            if (param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = qc.a(ah.a(stackIn_4_0 != 0, param1), (byte) 3);
            if (var2 != null) {
              break L3;
            } else {
              var2 = "";
              break L3;
            }
          }
          return var2;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
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
        if (param0 == 117) {
          md.a(-118, (java.awt.Component) (Object) param1);
          pl.a((java.awt.Component) (Object) param1, 7282);
          if (null != qa.field_x) {
            qa.field_x.a((byte) 44, (java.awt.Component) (Object) param1);
            return;
          } else {
            return;
          }
        } else {
          int discarded$7 = ap.a(32, 14);
          md.a(-118, (java.awt.Component) (Object) param1);
          pl.a((java.awt.Component) (Object) param1, 7282);
          if (null == qa.field_x) {
            return;
          } else {
            qa.field_x.a((byte) 44, (java.awt.Component) (Object) param1);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Your ignore list is full. Max of 100 hit.";
    }
}
