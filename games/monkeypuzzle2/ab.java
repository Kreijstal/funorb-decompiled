/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ka {
    static int field_d;
    private java.nio.ByteBuffer field_c;
    static int field_e;

    final static void e(int param0) {
        if (param0 != -18753) {
            field_d = 4;
        }
    }

    final byte[] d(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((ab) this).field_c.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$19 = ((ab) this).field_c.position(0);
        java.nio.ByteBuffer discarded$20 = ((ab) this).field_c.get(var3);
        if (param0 != -13913) {
          return null;
        } else {
          return var3;
        }
    }

    ab() {
    }

    final static te a(byte param0, int param1) {
        te[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        te[] var6 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var6 = ee.j(44);
        var2 = var6;
        var3 = 0;
        var4 = 105 / ((-2 - param0) / 61);
        L0: while (true) {
          if (var6.length > var3) {
            if (param1 == var6[var3].field_c) {
              return var6[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1, le[] param2, int param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param2 == null) {
            break L0;
          } else {
            if (param0 > 0) {
              var6 = param2[0].field_m;
              var7 = param2[2].field_m;
              var8 = param2[1].field_m;
              param2[0].a(param4, param3, param1);
              param2[2].a(-var7 + (param0 + param4), param3, param1);
              ge.b(si.field_u);
              ge.c(var6 + param4, param3, param4 - -param0 - var7, param2[1].field_n + param3);
              var9 = param4 + var6;
              var10 = -var7 + param0 + param4;
              if (param5 <= 24) {
                field_d = -36;
                param4 = var9;
                L1: while (true) {
                  if (param4 >= var10) {
                    ge.a(si.field_u);
                    return;
                  } else {
                    param2[1].a(param4, param3, param1);
                    param4 = param4 + var8;
                    continue L1;
                  }
                }
              } else {
                param4 = var9;
                L2: while (true) {
                  if (param4 >= var10) {
                    ge.a(si.field_u);
                    return;
                  } else {
                    param2[1].a(param4, param3, param1);
                    param4 = param4 + var8;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(int param0, byte[] param1) {
        ((ab) this).field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$0 = ((ab) this).field_c.position(0);
        int var3 = 117 / ((11 - param0) / 42);
        java.nio.ByteBuffer discarded$1 = ((ab) this).field_c.put(param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
