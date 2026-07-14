/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu {
    static kp field_b;
    static int field_a;

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 21) {
            field_a = -115;
        }
        if ((bl.field_c ^ -1) > -11) {
            var3 = 0;
            if (!(!AceOfSkies.field_J)) {
                AceOfSkies.field_J = false;
                var3 = 1;
            }
            oj.a(qn.b(-115), g.field_h, param0 ^ 153, nk.a((byte) 68), var3 != 0);
        } else {
            if (!uk.a((byte) -5)) {
                vp.a();
                qa.a(240, (byte) -4, 320);
                ps.a(0, false, param1, 0);
            } else {
                if (-1 == (ob.field_d ^ -1)) {
                    ul.a(param2, false, -7395);
                    ps.a(0, false, param1, 0);
                } else {
                    hj.a(param1, -12);
                }
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 240) {
            field_a = -93;
        }
    }

    final static void a(byte param0, int param1, int param2, byte[] param3, int param4, int param5, int param6) {
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
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var23 = AceOfSkies.field_G ? 1 : 0;
          if (-1 <= (param6 ^ -1)) {
            break L0;
          } else {
            if (!mg.a(param6, (byte) 32)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param5 <= 0) {
            break L1;
          } else {
            if (!mg.a(param5, (byte) 6)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        L2: {
          var7 = rl.a(param0 + 59, param1);
          if (param0 == -55) {
            break L2;
          } else {
            field_a = -4;
            break L2;
          }
        }
        L3: {
          var8 = 0;
          if (param5 <= param6) {
            stackOut_12_0 = param5;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = param6;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        var9 = stackIn_13_0;
        var10 = param6 >> 446483905;
        var11 = param5 >> 411617377;
        var12 = param3;
        var13 = new byte[var10 * (var11 * var7)];
        L4: while (true) {
          jaggl.OpenGL.glTexImage2Dub(param4, var8, param2, param6, param5, 0, param1, 5121, var12, 0);
          if (var9 > 1) {
            var16 = var7 * param6;
            var17 = 0;
            L5: while (true) {
              if (var17 >= var7) {
                var14 = var13;
                var13 = var12;
                var12 = var14;
                param5 = var11;
                param6 = var10;
                var8++;
                var9 = var9 >> 1;
                var11 = var11 >> 1;
                var10 = var10 >> 1;
                continue L4;
              } else {
                var18 = var17;
                var19 = var17;
                var20 = var16 + var19;
                var21 = 0;
                L6: while (true) {
                  if (var21 >= var11) {
                    var17++;
                    continue L5;
                  } else {
                    var22 = 0;
                    L7: while (true) {
                      if (var22 >= var10) {
                        var20 = var20 + var16;
                        var19 = var19 + var16;
                        var21++;
                        continue L6;
                      } else {
                        var15 = param3[var19];
                        var19 = var19 + var7;
                        var15 = var15 + param3[var19];
                        var15 = var15 + param3[var20];
                        var19 = var19 + var7;
                        var20 = var20 + var7;
                        var15 = var15 + param3[var20];
                        var13[var18] = (byte)(var15 >> -261151358);
                        var20 = var20 + var7;
                        var18 = var18 + var7;
                        var22++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kp();
    }
}
