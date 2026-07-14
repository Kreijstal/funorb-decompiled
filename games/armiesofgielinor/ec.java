/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends oj {
    private boolean field_C;
    int field_B;
    private boolean field_D;
    private int field_y;
    int field_A;
    private int field_z;

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        if (param1) {
          System.out.println("Teleport event debug");
          System.out.println("Unit at " + ((ec) this).field_A + "," + ((ec) this).field_B);
          System.out.println("Jumped to " + (((ec) this).field_z + ((ec) this).field_A) + "," + (((ec) this).field_y - -((ec) this).field_B));
          var4 = -18 / ((param0 - 53) / 51);
          var3 = "EventTeleport: pos: (" + ((ec) this).field_A + "," + ((ec) this).field_B + ")" + ",d: (" + ((ec) this).field_z + "," + ((ec) this).field_y + ")";
          return var3;
        } else {
          var4 = -18 / ((param0 - 53) / 51);
          var3 = "EventTeleport: pos: (" + ((ec) this).field_A + "," + ((ec) this).field_B + ")" + ",d: (" + ((ec) this).field_z + "," + ((ec) this).field_y + ")";
          return var3;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!((ec) this).a((byte) -39, param2, param0, true)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (param1 > -84) {
          L1: {
            int discarded$1 = ec.a(-83, -34, -127);
            if (((ec) this).field_D) {
              break L1;
            } else {
              var4 = var4 != 0 | ((ec) this).a(((ec) this).field_B - -((ec) this).field_y, 15, param2, param0, ((ec) this).field_A - -((ec) this).field_z) ? 1 : 0;
              break L1;
            }
          }
          return var4 != 0;
        } else {
          L2: {
            if (((ec) this).field_D) {
              break L2;
            } else {
              var4 = var4 != 0 | ((ec) this).a(((ec) this).field_B - -((ec) this).field_y, 15, param2, param0, ((ec) this).field_A - -((ec) this).field_z) ? 1 : 0;
              break L2;
            }
          }
          return var4 != 0;
        }
    }

    final void a(ha param0, int param1) {
        ne var3 = null;
        ne var4 = null;
        if (((ec) this).field_C) {
          return;
        } else {
          ((ec) this).field_C = true;
          var4 = param0.field_Eb[((ec) this).field_A - -(((ec) this).field_B * param0.field_v)];
          var3 = var4;
          if (((ec) this).field_w.field_bb) {
            ((ec) this).field_w.field_bb = false;
            var4.field_c.field_bb = false;
            param0.field_t[((ec) this).field_w.field_O].a((byte) -119, (tc) (Object) ((ec) this).field_w);
            ((ec) this).field_w.field_s = true;
            ((ec) this).field_w.field_J = ((ec) this).field_w.field_J + ((ec) this).field_z;
            ((ec) this).field_w.field_w = ((ec) this).field_w.field_w + ((ec) this).field_y;
            if (param1 == -26661) {
              if (!((ec) this).field_D) {
                param0.field_Eb[param0.field_v * ((ec) this).field_w.field_w + ((ec) this).field_w.field_J].field_c = ((ec) this).field_w;
                if (((ec) this).field_w.p(-70)) {
                  param0.a(((ec) this).field_w.field_w, ((ec) this).field_w.field_J, 0, 3);
                  fl.a(param0, -124);
                  return;
                } else {
                  fl.a(param0, -124);
                  return;
                }
              } else {
                fl.a(param0, -124);
                return;
              }
            } else {
              return;
            }
          } else {
            var3.field_c = null;
            var3.field_m = var4.e(10);
            if (!((ec) this).field_w.p(-43)) {
              ((ec) this).field_w.field_s = true;
              ((ec) this).field_w.field_J = ((ec) this).field_w.field_J + ((ec) this).field_z;
              ((ec) this).field_w.field_w = ((ec) this).field_w.field_w + ((ec) this).field_y;
              if (param1 == -26661) {
                if (!((ec) this).field_D) {
                  param0.field_Eb[param0.field_v * ((ec) this).field_w.field_w + ((ec) this).field_w.field_J].field_c = ((ec) this).field_w;
                  if (((ec) this).field_w.p(-70)) {
                    param0.a(((ec) this).field_w.field_w, ((ec) this).field_w.field_J, 0, 3);
                    fl.a(param0, -124);
                    return;
                  } else {
                    fl.a(param0, -124);
                    return;
                  }
                } else {
                  fl.a(param0, -124);
                  return;
                }
              } else {
                return;
              }
            } else {
              param0.a(((ec) this).field_B, ((ec) this).field_A, param1 + 26661, 3);
              ((ec) this).field_w.field_s = true;
              ((ec) this).field_w.field_J = ((ec) this).field_w.field_J + ((ec) this).field_z;
              ((ec) this).field_w.field_w = ((ec) this).field_w.field_w + ((ec) this).field_y;
              if (param1 == -26661) {
                if (!((ec) this).field_D) {
                  param0.field_Eb[param0.field_v * ((ec) this).field_w.field_w + ((ec) this).field_w.field_J].field_c = ((ec) this).field_w;
                  if (((ec) this).field_w.p(-70)) {
                    param0.a(((ec) this).field_w.field_w, ((ec) this).field_w.field_J, 0, 3);
                    fl.a(param0, -124);
                    return;
                  } else {
                    fl.a(param0, -124);
                    return;
                  }
                } else {
                  fl.a(param0, -124);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 > 97) {
          var3 = 0;
          var4 = od.field_b;
          L0: while (true) {
            if (wp.field_v.length > var3) {
              var5 = ca.field_h[var3];
              if (0 > var5) {
                var4 = var4 + fh.field_e;
                var3++;
                var3++;
                continue L0;
              } else {
                var6 = lg.a(wp.field_v[var3], true, (byte) -56);
                var4 = var4 + cp.field_a;
                var7 = rk.field_B + -(var6 >> 37575585);
                if (!mu.a(param0, (el.field_c << 1161109345) + q.field_B, param2, -et.field_b + var7, 5138823, var6 - -(et.field_b << -653532191), var4)) {
                  var4 = var4 + (cp.field_a + (el.field_c << 597615265) - -q.field_B);
                  var3++;
                  var3++;
                  continue L0;
                } else {
                  return var5;
                }
              }
            } else {
              return -1;
            }
          }
        } else {
          return -55;
        }
    }

    ec(int param0, int param1, int param2, boolean param3) {
        ((ec) this).field_z = param2 >> -1404540824;
        ((ec) this).field_y = 255 & param2;
        ((ec) this).field_B = param1;
        ((ec) this).field_A = param0;
        ((ec) this).field_z = -128 + (((ec) this).field_z ^ 128);
        ((ec) this).field_y = (128 ^ ((ec) this).field_y) + -128;
        ((ec) this).field_D = param3 ? true : false;
        ((ec) this).field_m = ((ec) this).field_D ? 21 : 26;
    }

    ec(int param0, int param1, int param2, int param3, boolean param4) {
        ((ec) this).field_A = param0;
        ((ec) this).field_B = param1;
        ((ec) this).field_z = param2;
        ((ec) this).field_D = param4 ? true : false;
        ((ec) this).field_y = param3;
        ((ec) this).field_m = ((ec) this).field_D ? 21 : 26;
    }

    static {
    }
}
