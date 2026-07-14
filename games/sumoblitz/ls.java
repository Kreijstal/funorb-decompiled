/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls {
    int field_k;
    static ls field_b;
    int field_i;
    private int field_f;
    private io field_m;
    static ls field_c;
    static ls field_g;
    static ls field_j;
    static ls field_e;
    static ls field_d;
    static ls field_a;
    static int field_h;
    static String field_l;

    final static void b(int param0) {
        int var1 = 0;
        int var2 = Sumoblitz.field_L ? 1 : 0;
        jl.field_a.b((byte) 105);
        for (var1 = 0; var1 < 32; var1++) {
            gd.field_k[var1] = 0L;
        }
        for (var1 = param0; -33 < (var1 ^ -1); var1++) {
            fa.field_a[var1] = 0L;
        }
        vt.field_t = 0;
    }

    final static String a(byte param0) {
        if (param0 != -62) {
            return null;
        }
        return ig.field_a.d(-1);
    }

    final static void a(int param0, int param1, int param2) {
        wr.field_F = param2;
        if (param1 > -42) {
            return;
        }
        ha.field_b = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ls a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0;
        if (var2 == 0) {
          return field_b;
        } else {
          if (var2 != 1) {
            if ((var2 ^ -1) != -3) {
              if ((var2 ^ -1) == -4) {
                return field_j;
              } else {
                if ((var2 ^ -1) == -5) {
                  return field_e;
                } else {
                  if ((var2 ^ -1) == -6) {
                    return field_d;
                  } else {
                    if ((var2 ^ -1) != -7) {
                      if (param1 > -77) {
                        ls.a(88, 28, 105);
                        return null;
                      } else {
                        return null;
                      }
                    } else {
                      return field_a;
                    }
                  }
                }
              }
            } else {
              return field_g;
            }
          } else {
            return field_c;
          }
        }
    }

    final static void a(float param0, float param1, int param2, int param3, byte[] param4, int param5, float param6, int param7, int param8, int param9, int param10, float param11, ab param12, float param13) {
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = Sumoblitz.field_L ? 1 : 0;
        if (param8 > -59) {
            field_g = null;
        }
        int var14 = param3 * param9;
        float[] var24 = new float[var14];
        for (var16 = 0; var16 < param10; var16++) {
            param12.a(param1 / (float)param9, 0, param11 / (float)param3, param0 / (float)param7, param5, param7, 1, var24, param9, param6 * 127.0f, param3);
            var17 = param2;
            for (var18 = 0; var14 > var18; var18++) {
                param4[var17] = (byte)(int)((float)param4[var17] + var24[var18]);
                var17++;
            }
            param6 = param6 * param13;
            param1 = param1 * 2.0f;
            param0 = param0 * 2.0f;
            param11 = param11 * 2.0f;
        }
        int var20 = param2;
        var16 = var20;
        for (var17 = 0; var14 > var17; var17++) {
            param4[var20] = (byte)(param4[var20] - -127);
            var20++;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_b = null;
        field_l = null;
        field_e = null;
        field_c = null;
        field_j = null;
        field_a = null;
        if (param0 != 2) {
            Object var2 = null;
            ls.a(0.4216335117816925f, -2.271651268005371f, -82, -112, (byte[]) null, 106, 0.32911431789398193f, -52, -122, -66, 54, 0.6878315806388855f, (ab) null, -1.019270896911621f);
        }
    }

    private ls(int param0, int param1, io param2) {
        ((ls) this).field_m = param2;
        ((ls) this).field_f = param1;
        ((ls) this).field_i = param0;
        ((ls) this).field_k = ((ls) this).field_m.field_j * ((ls) this).field_f;
        if (((ls) this).field_i >= 16) {
            throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ls(0, 3, io.field_d);
        field_c = new ls(1, 3, io.field_d);
        field_g = new ls(2, 4, io.field_g);
        field_j = new ls(3, 1, io.field_d);
        field_e = new ls(4, 2, io.field_d);
        field_d = new ls(5, 3, io.field_d);
        field_a = new ls(6, 4, io.field_d);
        field_h = mr.a(16, (byte) -115);
        field_l = "Continue";
    }
}
