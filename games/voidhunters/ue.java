/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private jp field_b;
    static String field_c;
    static int field_a;
    long field_d;

    protected final void finalize() throws Throwable {
        ((ue) this).field_b.a(((ue) this).field_d, 0);
        super.finalize();
    }

    final static void a(byte[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var23 = VoidHunters.field_G;
          if (0 >= param5) {
            break L0;
          } else {
            if (!bd.a(param5, (byte) -95)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (0 >= param6) {
            break L1;
          } else {
            if (bd.a(param6, (byte) -95)) {
              break L1;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L2: {
          var7 = pu.a((byte) -120, param2);
          var8 = param1;
          if (param6 > param5) {
            stackOut_9_0 = param5;
            stackIn_10_0 = stackOut_9_0;
            break L2;
          } else {
            stackOut_8_0 = param6;
            stackIn_10_0 = stackOut_8_0;
            break L2;
          }
        }
        var9 = stackIn_10_0;
        var10 = param5 >> 1299943137;
        var11 = param6 >> -949862623;
        var12 = param0;
        var13 = new byte[var10 * (var11 * var7)];
        L3: while (true) {
          jaggl.OpenGL.glTexImage2Dub(param3, var8, param4, param5, param6, 0, param2, 5121, var12, 0);
          if (1 >= var9) {
            return;
          } else {
            var16 = var7 * param5;
            var14 = var13;
            var17 = 0;
            L4: while (true) {
              if (var7 <= var17) {
                var13 = var12;
                var12 = var14;
                param5 = var10;
                param6 = var11;
                var9 = var9 >> 1;
                var11 = var11 >> 1;
                var10 = var10 >> 1;
                var8++;
                continue L3;
              } else {
                var18 = var17;
                var19 = var17;
                var20 = var16 + var19;
                var21 = 0;
                L5: while (true) {
                  if (var11 <= var21) {
                    var17++;
                    continue L4;
                  } else {
                    var22 = 0;
                    L6: while (true) {
                      if (var22 >= var10) {
                        var20 = var20 + var16;
                        var19 = var19 + var16;
                        var21++;
                        continue L5;
                      } else {
                        var15 = param0[var19];
                        var19 = var19 + var7;
                        var15 = var15 + param0[var19];
                        var19 = var19 + var7;
                        var15 = var15 + param0[var20];
                        var20 = var20 + var7;
                        var15 = var15 + param0[var20];
                        var20 = var20 + var7;
                        var13[var18] = (byte)(var15 >> 92680482);
                        var18 = var18 + var7;
                        var22++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1, bc param2, int param3) {
        if (param1 != 111) {
            Object var5 = null;
            ue.a((byte[]) null, -33, -97, 6, -100, 46, -12);
        }
        eh.field_p = param0;
        skb.field_o = param2;
        ag.field_p = param3;
    }

    public static void a(byte param0) {
        if (param0 != 124) {
            return;
        }
        field_c = null;
    }

    ue(jp param0, long param1, int param2) {
        ((ue) this).field_b = param0;
        ((ue) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Ask to join <%0>'s game";
        field_a = 200;
    }
}
