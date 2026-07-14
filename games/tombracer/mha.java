/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mha extends rj {
    static long field_D;
    private nua field_z;
    private int field_A;
    private static String[] field_B;
    static int field_C;
    static String field_F;
    static int field_E;

    final String d(byte param0) {
        int var2 = -38 / ((-58 - param0) / 60);
        if (!((mha) this).field_f) {
            return null;
        }
        return ((mha) this).field_z.a(127);
    }

    public static void b(int param0) {
        field_B = null;
        if (param0 != -23897) {
            return;
        }
        field_F = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        ((mha) this).field_A = ((mha) this).field_A + 1;
        super.a(param0, param1, param2, param3);
    }

    mha(nua param0) {
        ((mha) this).field_z = param0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        it var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        iu var12 = null;
        iu var13 = null;
        iu var15 = null;
        iu var16 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, 0, param3);
        if (param3 == param2) {
          var5 = (((mha) this).field_m >> -1655065343) + ((mha) this).field_i + param0;
          var6 = (((mha) this).field_p >> 977829985) + param1 - -((mha) this).field_n;
          var8 = ((mha) this).field_z.b(-4666);
          if (gla.field_p != var8) {
            if (tea.field_b != var8) {
              if (fp.field_c != var8) {
                if (uh.field_k == var8) {
                  var12 = pq.field_b[1];
                  var12.a(var5 + -(var12.field_m >> 209900129), -(var12.field_q >> -1354890975) + var6, 256);
                  return;
                } else {
                  return;
                }
              } else {
                var13 = pq.field_b[2];
                var13.a(var5 + -(var13.field_m >> -947988767), var6 + -(var13.field_q >> 562582945), 256);
                return;
              }
            } else {
              var16 = pq.field_b[0];
              var9 = var16.field_n << -575421567;
              var10 = var16.field_k << -2008834943;
              if (null != aj.field_l) {
                if (aj.field_l.field_m >= var9) {
                  if (var10 <= aj.field_l.field_q) {
                    nm.a(aj.field_l, (byte) 95);
                    bea.a();
                    var16.a(112, 144, var16.field_n << 495482532, var16.field_k << -1562572412, -((mha) this).field_A << 1453014762, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
                    return;
                  } else {
                    aj.field_l = new iu(var9, var10);
                    nm.a(aj.field_l, (byte) 108);
                    var16.a(112, 144, var16.field_n << 495482532, var16.field_k << -1562572412, -((mha) this).field_A << 1453014762, 4096);
                    pfa.a(1);
                    aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
                    return;
                  }
                } else {
                  aj.field_l = new iu(var9, var10);
                  nm.a(aj.field_l, (byte) 108);
                  var16.a(112, 144, var16.field_n << 495482532, var16.field_k << -1562572412, -((mha) this).field_A << 1453014762, 4096);
                  pfa.a(1);
                  aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
                  return;
                }
              } else {
                aj.field_l = new iu(var9, var10);
                nm.a(aj.field_l, (byte) 108);
                var16.a(112, 144, var16.field_n << 495482532, var16.field_k << -1562572412, -((mha) this).field_A << 1453014762, 4096);
                pfa.a(1);
                aj.field_l.a(-var16.field_n + var5, var6 - var16.field_k, 256);
                return;
              }
            }
          } else {
            var15 = pq.field_b[0];
            var9 = var15.field_n << -575421567;
            var10 = var15.field_k << -2008834943;
            if (null != aj.field_l) {
              if (aj.field_l.field_m >= var9) {
                if (var10 <= aj.field_l.field_q) {
                  nm.a(aj.field_l, (byte) 95);
                  bea.a();
                  var15.a(112, 144, var15.field_n << 495482532, var15.field_k << -1562572412, -((mha) this).field_A << 1453014762, 4096);
                  pfa.a(1);
                  aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
                  return;
                } else {
                  aj.field_l = new iu(var9, var10);
                  nm.a(aj.field_l, (byte) 108);
                  var15.a(112, 144, var15.field_n << 495482532, var15.field_k << -1562572412, -((mha) this).field_A << 1453014762, 4096);
                  pfa.a(1);
                  aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
                  return;
                }
              } else {
                aj.field_l = new iu(var9, var10);
                nm.a(aj.field_l, (byte) 108);
                var15.a(112, 144, var15.field_n << 495482532, var15.field_k << -1562572412, -((mha) this).field_A << 1453014762, 4096);
                pfa.a(1);
                aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
                return;
              }
            } else {
              aj.field_l = new iu(var9, var10);
              nm.a(aj.field_l, (byte) 108);
              var15.a(112, 144, var15.field_n << 495482532, var15.field_k << -1562572412, -((mha) this).field_A << 1453014762, 4096);
              pfa.a(1);
              aj.field_l.a(-var15.field_n + var5, var6 - var15.field_k, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(ae param0, boolean param1) {
        if (param1) {
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new String[5];
        field_B[3] = "Floating Rotator";
        field_B[0] = "Wheeled";
        field_B[4] = "Mirror Fixed";
        field_B[1] = "Mirror Base";
        field_B[2] = "Rotator";
        field_E = 480;
        field_F = "Cancel";
    }
}
