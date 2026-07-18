/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oqa extends osa {
    static ala field_s;
    private int field_u;
    static int field_w;
    static String field_t;
    static cn field_v;

    final int a(int param0, int param1) {
        if (param0 != 0) {
            int discarded$0 = ((oqa) this).c(-68);
            return param1;
        }
        return param1;
    }

    final int c(int param0) {
        if (param0 != 1) {
            return -63;
        }
        return 13;
    }

    final void b(byte param0) {
        int var2 = 6 % ((param0 - -69) / 42);
    }

    public static void g(int param0) {
        field_s = null;
        field_t = null;
        field_v = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            return;
        }
        for (var2 = ((oqa) this).field_n.q((byte) -80) - ((oqa) this).e((byte) -43); var2 < 0; var2 += 8192) {
        }
        while (var2 > 8192) {
            var2 -= 8192;
        }
        if (4096 < var2) {
            var2 = var2 + -8192;
        }
        int var3 = 0;
        int var4 = ((oqa) this).field_u / 2;
        if (~var4 <= ~var2) {
            if (~-var4 >= ~var2) {
                if (!(var3 == 0)) {
                    ((oqa) this).field_n.c(false, var3);
                }
                return;
            }
            var3 = -var2 + -var4;
            if (!(var3 == 0)) {
                ((oqa) this).field_n.c(false, var3);
            }
            return;
        }
        var3 = -var2 + var4;
        if (!(var3 == 0)) {
            ((oqa) this).field_n.c(false, var3);
        }
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -125);
            if (param1 > -78) {
                ((oqa) this).field_u = -70;
            }
            param0.a((byte) -3, cn.a((byte) -104, ((oqa) this).field_u, 8192, 8), 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oqa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param0) {
          L0: {
            if (param1) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 == 21297) {
            if (param3) {
              var4++;
              return cua.field_b[var4];
            } else {
              return cua.field_b[var4];
            }
          } else {
            String discarded$2 = oqa.a(false, true, 65, true);
            if (param3) {
              var4++;
              return cua.field_b[var4];
            } else {
              return cua.field_b[var4];
            }
          }
        } else {
          L1: {
            var4 += 4;
            if (param1) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param2 != 21297) {
            String discarded$3 = oqa.a(false, true, 65, true);
            if (!param3) {
              return cua.field_b[var4];
            } else {
              var4++;
              return cua.field_b[var4];
            }
          } else {
            if (param3) {
              var4++;
              return cua.field_b[var4];
            } else {
              return cua.field_b[var4];
            }
          }
        }
    }

    oqa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((oqa) this).field_u = 1024;
        try {
            ((oqa) this).field_u = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new ala();
        field_t = "Show private chat from my friends and opponents";
    }
}
