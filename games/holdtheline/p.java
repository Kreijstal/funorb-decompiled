/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class p {
    int field_d;
    static String field_f;
    int field_k;
    static e field_h;
    int field_i;
    static float[] field_g;
    int field_l;
    int field_c;
    int field_e;
    static String field_b;
    static int field_j;
    static int[] field_a;

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(boolean param0) {
        field_f = null;
        field_b = null;
        if (!param0) {
            p.a(-114);
        }
        field_g = null;
        field_a = null;
        field_h = null;
    }

    final static hj a(int param0, byte param1, int param2) {
        int var3 = 0;
        hj var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var5 = HoldTheLine.field_D;
          if (null != ra.field_X) {
            break L0;
          } else {
            if (fb.field_i.b("world_images", -128)) {
              ra.field_X = si.a(fb.field_i, 33, "world_images", "");
              ok.a(32381);
              mi.field_c = new hj[4];
              var3 = 0;
              L1: while (true) {
                if ((var3 ^ -1) <= -5) {
                  ih.field_t = new hj[4];
                  var6 = 0;
                  var3 = var6;
                  L2: while (true) {
                    if (-5 >= (var6 ^ -1)) {
                      ug.b(-1);
                      break L0;
                    } else {
                      ih.field_t[var6] = ra.field_X[var6].e();
                      qm.a(ih.field_t[var6], 128, -1);
                      var4 = ih.field_t[var6].e();
                      var4.f();
                      kj.field_q.d(17, 0, 84, 84);
                      ih.field_t[var6].f();
                      var4.d(0, 0, 64);
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  mi.field_c[var3] = ra.field_X[var3].e();
                  qm.a(mi.field_c[var3], 64, -1);
                  mi.field_c[var3].f();
                  rf.field_ab.a(-rf.field_ab.field_s + mi.field_c[var3].field_s >> 1391241089, -rf.field_ab.field_y + mi.field_c[var3].field_y >> 1198891297);
                  var3++;
                  continue L1;
                }
              }
            } else {
              return hi.a(111, (byte) -112, 84);
            }
          }
        }
        if (param1 < -31) {
          if ((param0 ^ -1) == -2) {
            return mi.field_c[param2];
          } else {
            if (param0 != 2) {
              return ra.field_X[param2];
            } else {
              return ih.field_t[param2];
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        int var4 = HoldTheLine.field_D;
        int[] var5 = qg.field_d;
        int[] var1 = var5;
        int var2 = 0;
        if (param0 < 76) {
            p.a(false);
        }
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        hj var3 = tn.field_b.field_i[kj.b(2, 6)];
        if (param0 != -61) {
            return;
        }
        var3.d(param1, param2, var3.field_o >> 1348586849, var3.field_v >> 1885047969, 64);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<img=11>";
        field_g = new float[]{0.0f, 0.5f, 1.0f, 100.0f, 800.0f, 80.0f, 0.0f, 10.0f};
        field_h = new e(8, 0, 4, 1);
        field_b = "Mouse over an icon for details";
        field_a = new int[128];
    }
}
