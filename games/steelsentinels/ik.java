/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static wk field_g;
    private boolean field_d;
    static int field_e;
    static boolean field_h;
    static int field_b;
    private String field_f;
    static String field_i;
    static int field_c;
    static boolean field_a;

    final String a(int param0) {
        if (param0 != 2134230754) {
            field_i = null;
            return ((ik) this).field_f;
        }
        return ((ik) this).field_f;
    }

    public static void b(int param0) {
        int var1 = 4 / ((param0 - -28) / 39);
        field_g = null;
        field_i = null;
    }

    final static void a(boolean param0) {
        ad.field_j = ck.a(125);
        ag.field_p = new ka();
        ok.a(true, param0, -73);
    }

    ik(String param0) {
        this(param0, false);
    }

    final static void a(long param0, int param1, boolean param2) {
        kj var4 = null;
        int var5 = 0;
        var4 = mm.field_g;
        var4.a(param1, (byte) -117);
        if (param2) {
          ik.b(-47);
          var4.field_p = var4.field_p + 1;
          var5 = var4.field_p;
          var4.a((byte) 115, 6);
          var4.b(-28875, param0);
          var4.b((byte) -92, -var5 + var4.field_p);
          return;
        } else {
          var4.field_p = var4.field_p + 1;
          var5 = var4.field_p;
          var4.a((byte) 115, 6);
          var4.b(-28875, param0);
          var4.b((byte) -92, -var5 + var4.field_p);
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        var2 = -124 % ((param1 - -65) / 50);
        if (((long)param0 ^ -1L) <= -65537L) {
          if (16777216L <= (long)param0) {
            if ((long)param0 >= 268435456L) {
              if (((long)param0 ^ -1L) > -1073741825L) {
                return td.field_Xb[param0 >> -1291420074] >> -2008484031;
              } else {
                return td.field_Xb[param0 >> -545106280];
              }
            } else {
              if ((long)param0 < 67108864L) {
                return td.field_Xb[param0 >> -7654734] >> 1335207299;
              } else {
                return td.field_Xb[param0 >> 158370580] >> 2134230754;
              }
            }
          } else {
            if (-1048577L >= ((long)param0 ^ -1L)) {
              if ((long)param0 < 4194304L) {
                return td.field_Xb[param0 >> -1425838066] >> 1939912293;
              } else {
                return td.field_Xb[param0 >> -8188144] >> -419004636;
              }
            } else {
              if (-262145L < ((long)param0 ^ -1L)) {
                return td.field_Xb[param0 >> -1398588982] >> -1446045113;
              } else {
                return td.field_Xb[param0 >> 1580601964] >> -641602138;
              }
            }
          }
        } else {
          if ((long)param0 >= 256L) {
            if (4096L <= (long)param0) {
              if (((long)param0 ^ -1L) <= -16385L) {
                return td.field_Xb[param0 >> -510862360] >> 1038499432;
              } else {
                return td.field_Xb[param0 >> -1355769338] >> -2107438679;
              }
            } else {
              if (-1025L < ((long)param0 ^ -1L)) {
                return td.field_Xb[param0 >> 1509032386] >> -2059578325;
              } else {
                return td.field_Xb[param0 >> -1486435036] >> -1639705302;
              }
            }
          } else {
            if (param0 >= 0) {
              return td.field_Xb[param0] >> 587275308;
            } else {
              return -1;
            }
          }
        }
    }

    ik(String param0, boolean param1) {
        ((ik) this).field_f = param0;
        if (((ik) this).field_f == null) {
            ((ik) this).field_f = "";
        }
        ((ik) this).field_d = param1 ? true : false;
        if (((ik) this).field_f.length() == 0) {
            ((ik) this).field_d = false;
        }
    }

    final boolean a(byte param0) {
        if (param0 != 51) {
            return true;
        }
        return ((ik) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_h = false;
        field_c = 50;
        field_i = "The invitation has been withdrawn.";
        field_a = false;
        field_b = 3;
    }
}
