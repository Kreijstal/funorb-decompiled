/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st {
    static String[] field_b;
    static float[] field_a;

    final static me[] a(boolean param0, dl param1) {
        int var2 = 0;
        int var3 = 0;
        me[] var4 = null;
        int var5 = 0;
        me var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var2 = param1.b((byte) -96, 8);
        if (-1 <= (var2 ^ -1)) {
          var3 = param1.b((byte) -77, 12);
          var4 = new me[var3];
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              if (!param0) {
                st.a((byte) -3);
                return var4;
              } else {
                return var4;
              }
            } else {
              if (!tn.a(101, param1)) {
                var6 = param1.b((byte) 83, eo.a(112, var5 - 1));
                var4[var5] = var4[var6];
                var5++;
                var5++;
                continue L0;
              } else {
                var6_ref = new me();
                int discarded$126 = param1.b((byte) 110, 24);
                int discarded$127 = param1.b((byte) 80, 24);
                var6_ref.field_c = param1.b((byte) 114, 24);
                int discarded$128 = param1.b((byte) -76, 9);
                int discarded$129 = param1.b((byte) -56, 12);
                int discarded$130 = param1.b((byte) -49, 12);
                int discarded$131 = param1.b((byte) 103, 12);
                var4[var5] = var6_ref;
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void b(byte param0) {
        if (param0 > -78) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param0) {
          L0: {
            if (param2) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param3) {
            if (!param1) {
              field_a = (float[]) null;
              return wd.field_G[var4];
            } else {
              return wd.field_G[var4];
            }
          } else {
            var4++;
            if (!param1) {
              field_a = (float[]) null;
              return wd.field_G[var4];
            } else {
              return wd.field_G[var4];
            }
          }
        } else {
          L1: {
            var4 += 4;
            if (param2) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param3) {
            var4++;
            if (param1) {
              return wd.field_G[var4];
            } else {
              field_a = (float[]) null;
              return wd.field_G[var4];
            }
          } else {
            if (!param1) {
              field_a = (float[]) null;
              return wd.field_G[var4];
            } else {
              return wd.field_G[var4];
            }
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != 87) {
            field_b = (String[]) null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[16];
        field_a = new float[4];
    }
}
