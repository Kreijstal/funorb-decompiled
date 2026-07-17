/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class paa extends b implements mk {
    static lqa field_z;
    static String field_y;
    static int[] field_x;
    private uba field_w;

    abstract boolean i(byte param0);

    final static void a(iv param0, int param1, String param2, long param3, int param4, int[] param5, jea param6, int param7, String param8) {
        if (param4 != -11635) {
            return;
        }
        try {
            lu.field_b = param0;
            hka.field_b = new lja(param6, param3, param2, param8, param1, param7, param5);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "paa.M(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + (param8 != null ? "{...}" : "null") + 41);
        }
    }

    abstract int j(byte param0);

    final static g c(int param0, int param1, int param2) {
        qg var5 = cm.field_a[param0];
        qg var3 = var5;
        int var4 = 70 / ((param1 - 5) / 61);
        return var5.field_c[param2];
    }

    public final nua a(byte param0) {
        if (param0 <= 44) {
            return null;
        }
        return (nua) (Object) ((paa) this).field_w;
    }

    public static void k(byte param0) {
        field_y = null;
        field_z = null;
        field_x = null;
    }

    void a(byte param0, uba param1) {
        try {
            int var3_int = 126 % ((-36 - param0) / 59);
            ((paa) this).field_w = param1;
            ((paa) this).field_w.field_i = (paa) this;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "paa.AA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                fna.field_j[0] = qua.a(bja.field_a, "", "TR_theme");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (1 != param1) {
                break L2;
              } else {
                fna.field_j[1] = qua.a(bja.field_a, "", "TR_temple_music");
                break L2;
              }
            }
            L3: {
              if (param1 != 2) {
                break L3;
              } else {
                fna.field_j[2] = qua.a(bja.field_a, "", "TR_win_jingle_long");
                break L3;
              }
            }
            if (!param0) {
              L4: {
                if (3 != param1) {
                  break L4;
                } else {
                  fna.field_j[3] = qua.a(bja.field_a, "", "TR_lose_jingle_long");
                  break L4;
                }
              }
              L5: while (true) {
                if (ab.field_n.field_y.a(176400, fna.field_j[param1], ua.field_a, ns.field_j, 0)) {
                  break L0;
                } else {
                  continue L5;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "paa.F(" + param0 + 44 + param1 + 41);
        }
    }

    abstract int d(int param0);

    abstract int a(int param0);

    final static vb c(int param0) {
        return it.a(255, 141 - -uca.field_c.a(2, 0));
    }

    paa(int param0, int param1, int param2, int param3, isa param4) {
        super(param0, param1, param2, param3, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Game drawn";
        field_x = new int[]{17, 10, 11};
    }
}
