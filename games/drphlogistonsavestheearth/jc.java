/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends bh {
    static int field_g;
    static int field_j;
    private java.nio.ByteBuffer field_f;
    static int[] field_h;
    static int field_i;

    final static vc a(byte param0, String param1) {
        if (ib.field_f.a(false)) {
            if (!(param1.equals((Object) (Object) ib.field_f.a((byte) -58)))) {
                ib.field_f = ug.a(param1, 0);
            }
        }
        if (param0 != 45) {
            jc.c((byte) -81);
        }
        return ib.field_f;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        L0: {
          var2 = param1.getParameter("username");
          if (var2 == null) {
            break L0;
          } else {
            var4 = (CharSequence) (Object) var2;
            if (-1L != (ub.a(50, var4) ^ -1L)) {
              var3 = 28 / ((-30 - param0) / 57);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final void a(byte[] param0, byte param1) {
        ((jc) this).field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$5 = ((jc) this).field_f.position(0);
        if (param1 >= -124) {
            Object var4 = null;
            vc discarded$6 = jc.a((byte) -95, (String) null);
        }
        java.nio.ByteBuffer discarded$7 = ((jc) this).field_f.put(param0);
    }

    final byte[] c(int param0) {
        byte[] var3 = new byte[((jc) this).field_f.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$6 = ((jc) this).field_f.position(0);
        if (param0 != 19707) {
            return null;
        }
        java.nio.ByteBuffer discarded$7 = ((jc) this).field_f.get(var3);
        return var3;
    }

    final static void a(int param0, bg param1, int param2) {
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        lh var7 = nj.field_p;
        lh var8 = var7;
        var8.d(param0, -18392);
        var8.field_j = var8.field_j + 1;
        int var4 = var8.field_j;
        var8.c(1, (byte) -93);
        var8.c(param1.field_i, -17402);
        var8.c(param1.field_u, -17402);
        var8.c(param1.field_m, -17402);
        var8.a(param1.field_o, (byte) 126);
        var8.a(param1.field_s, (byte) 107);
        if (param2 >= -93) {
            jc.c((byte) -14);
        }
        var8.a(param1.field_j, (byte) -112);
        var8.a(param1.field_h, (byte) -16);
        var8.c(param1.field_l.length, (byte) -111);
        for (var5 = 0; var5 < param1.field_l.length; var5++) {
            var7.a(param1.field_l[var5], (byte) 109);
        }
        int discarded$0 = var8.d(var4, (byte) 123);
        var8.b(-var4 + var8.field_j, (byte) 87);
    }

    jc() {
    }

    final static void a(nh param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var6 = (param1 + -param2 << 281971560) / param0.field_z;
          var7 = param0.field_D * var6 + (param2 << -147816056);
          param4 = param4 + param0.field_v;
          param5 = param5 + param0.field_D;
          var8 = wj.field_k * param4 + param5;
          var9 = 0;
          var10 = param0.field_w;
          var11 = param0.field_y;
          if (param3 >= 28) {
            break L0;
          } else {
            jc.c((byte) -103);
            break L0;
          }
        }
        L1: {
          var12 = wj.field_k - var11;
          var13 = 0;
          if (wj.field_e > param4) {
            var14 = wj.field_e + -param4;
            var8 = var8 + wj.field_k * var14;
            param4 = wj.field_e;
            var9 = var9 + var14 * var11;
            var10 = var10 - var14;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var10 + param4 > wj.field_j) {
            var10 = var10 - (-wj.field_j + param4 + var10);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (wj.field_g <= param5) {
            break L3;
          } else {
            var14 = wj.field_g + -param5;
            var12 = var12 + var14;
            var11 = var11 - var14;
            param5 = wj.field_g;
            var13 = var13 + var14;
            var7 = var7 + var6 * var14;
            var8 = var8 + var14;
            var9 = var9 + var14;
            break L3;
          }
        }
        L4: {
          if (wj.field_b >= var11 + param5) {
            break L4;
          } else {
            var14 = var11 + param5 + -wj.field_b;
            var13 = var13 + var14;
            var11 = var11 - var14;
            var12 = var12 + var14;
            break L4;
          }
        }
        L5: {
          if (-1 <= (var11 ^ -1)) {
            break L5;
          } else {
            if (var10 > 0) {
              param4 = -var10;
              L6: while (true) {
                if (0 <= param4) {
                  return;
                } else {
                  var14 = var7;
                  param5 = -var11;
                  L7: while (true) {
                    if (-1 >= param5) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param4++;
                      continue L6;
                    } else {
                      var15 = var14 >> -2137995576;
                      var14 = var14 + var6;
                      var16 = 256 + -var15;
                      if (-1 <= var15) {
                        var9++;
                        var17 = param0.field_B[var9];
                        if (var17 != 0) {
                          if ((var15 ^ -1) < -256) {
                            wj.field_l[var8] = var17;
                            var8++;
                            param5++;
                            continue L7;
                          } else {
                            var18 = wj.field_l[var8];
                            var19 = var16 * (16711935 & var18) - -(var15 * (var17 & 16711935)) >> -1727244440 & 16711935;
                            wj.field_l[var8] = (rk.a(rk.a(65280, var18) * var16 - -(var15 * rk.a(65280, var17)), 16711720) >> -1324456056) + var19;
                            var8++;
                            param5++;
                            continue L7;
                          }
                        } else {
                          var8++;
                          param5++;
                          continue L7;
                        }
                      } else {
                        var9++;
                        var8++;
                        param5++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 <= 24) {
            field_i = -53;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_h = new int[8192];
    }
}
