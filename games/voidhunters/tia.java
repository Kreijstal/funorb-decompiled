/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tia extends mu {
    int field_D;
    static llb field_M;
    private nva field_F;
    static String field_G;
    int field_H;
    static int[] field_J;
    static long field_C;
    Object[] field_L;
    static String field_K;
    int field_I;
    private no field_E;

    public static void a(int param0) {
        field_J = null;
        field_M = null;
        field_G = null;
        int var1 = -23 % ((-30 - param0) / 60);
        field_K = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4) {
        ((tia) this).field_D = -1;
        if (!(((tia) this).field_F.field_H)) {
            return false;
        }
        if (!(((tia) this).field_F.field_G.field_y.field_e)) {
            return false;
        }
        if (!(((tia) this).field_L != null)) {
            return super.a(param0, param1, param2, param3, (byte) 22);
        }
        param0 = param0 - (((tia) this).field_r + param3);
        param2 = param2 - (param1 - -((tia) this).field_g);
        if ((param2 ^ -1) <= -1) {
            // if_icmpgt L114
            // if_icmpgt L114
            // if_icmplt L114
        } else {
            return false;
        }
        if (param4 != 22) {
            ((byte[]) ((Object[]) ((tia) this).field_L[16])[0])[25] = (byte) 98;
        }
        ((tia) this).field_D = param0 / ((tia) this).field_I;
        if (((tia) this).field_L.length > ((tia) this).field_D) {
            return true;
        }
        ((tia) this).field_D = -1;
        return true;
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        super.c(param0, param1, param2, param3);
        param3 = param3 - ((tia) this).field_r;
        param1 = param1 - ((tia) this).field_g;
        if (!(null == ((tia) this).field_L)) {
            var5 = param3 / ((tia) this).field_I;
            if (var5 >= 0) {
                if (!(((tia) this).field_L.length <= var5)) {
                    ((tia) this).field_H = var5;
                    ((tia) this).field_F.i(21694);
                }
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = VoidHunters.field_G;
        if (param1 != 0) {
            return;
        }
        int var5 = ((tia) this).field_g + param0;
        int var6 = ((tia) this).field_r + param3;
        dma.d(var5, var6, ((tia) this).field_h, ((tia) this).field_f, 0);
        if (param2 <= 47) {
            return;
        }
        int var7 = ((tia) this).field_H;
        if (-1 != ((tia) this).field_D) {
            var7 = ((tia) this).field_D;
        }
        if (((tia) this).field_L != null) {
            for (var8 = 0; var8 < ((tia) this).field_L.length; var8++) {
                var9 = ((tia) this).field_L[var8];
                var10 = var9.toString();
                if (!(var8 != var7)) {
                    dma.e(2 + var5, var6 + 4, ((tia) this).field_h - 4, ((tia) this).field_I, 2188450, 128);
                }
                var6 = var6 + ((tia) this).field_I;
                ((tia) this).field_E.c(var10, 2 + var5, var6, 10000536, -1);
            }
        }
    }

    final static int a(boolean param0, int param1, int param2, boolean param3) {
        if (param0) {
            tia.a(-64);
        }
        return rt.c(1);
    }

    final int e(int param0) {
        if (param0 != 4) {
            ((tia) this).field_E = (no) ((Object[]) ((tia) this).field_L[1])[15];
        }
        return null != ((tia) this).field_L ? ((tia) this).field_I * (1 + ((tia) this).field_L.length * 2) >> 589398561 : 200;
    }

    tia(nva param0, no param1, Object[] param2, int param3) {
        super((shb) (Object) param0);
        ((tia) this).field_E = param1;
        ((tia) this).field_F = param0;
        ((tia) this).field_I = ((tia) this).field_E.field_A + ((tia) this).field_E.field_k;
        this.a(param3, 28, param2);
    }

    final Object g(byte param0) {
        Object stackIn_7_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_5_0 = null;
        L0: {
          if (param0 == 96) {
            break L0;
          } else {
            ((tia) this).b(-103, 101, 5, -59);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((tia) this).field_L) {
              break L2;
            } else {
              if (-1 != ((tia) this).field_H) {
                stackOut_6_0 = ((tia) this).field_L[((tia) this).field_H];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = null;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, Object[] param2) {
        ((tia) this).field_L = param2;
        ((tia) this).field_H = param0;
        ((tia) this).field_D = -1;
        if (param1 != 28) {
            return;
        }
        if (param2 != null) {
            if (((tia) this).field_H >= -1) {
                // if_icmpge L49
            } else {
                throw new IllegalStateException();
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_G = "To <%0>: ";
        field_K = "OK";
    }
}
