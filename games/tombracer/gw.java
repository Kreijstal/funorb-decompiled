/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw extends kna {
    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        if (param0) {
            return;
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        mfa var5 = null;
        int var6 = 0;
        int var7_int = 0;
        ki var7 = null;
        int var8 = 0;
        fsa var9 = null;
        L0: {
          L1: {
            var8 = TombRacer.field_G ? 1 : 0;
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, ((gw) this).field_k, ((gw) this).field_l);
            var9.a((byte) -3, 0);
            var9.b((byte) 17, true);
            var5 = rm.field_a;
            var7_int = ((gw) this).r(12);
            if (38 != var7_int) {
              if ((var7_int ^ -1) != -40) {
                if (var7_int != 40) {
                  if (41 == var7_int) {
                    var6 = 3;
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  var6 = 2;
                  break L0;
                }
              } else {
                var6 = 0;
                break L0;
              }
            } else {
              break L1;
            }
          }
          var6 = 1;
          break L0;
        }
        if (param1 == 3) {
          var7 = (ki) (Object) var5.a(14, 82);
          var7.a(true, var6);
          var9.a((gr) null, (byte) 124, (dg) (Object) var7);
          return var9;
        } else {
          return null;
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            int discarded$0 = gw.A(-113);
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, float[] param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
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
          var23 = TombRacer.field_G ? 1 : 0;
          if (-1 <= (param5 ^ -1)) {
            break L0;
          } else {
            if (cla.a(9181, param5)) {
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L1: {
          if ((param6 ^ -1) >= -1) {
            break L1;
          } else {
            if (!cla.a(9181, param6)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        L2: {
          var7 = jj.a(param0, (byte) -119);
          var8 = 0;
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
        if (param1 > 81) {
          var10 = param5 >> -37472415;
          var11 = param6 >> -826171103;
          var12 = param4;
          var13 = new float[var11 * var10 * var7];
          L3: while (true) {
            jaggl.OpenGL.glTexImage2Df(param2, var8, param3, param5, param6, 0, param0, 5126, var12, 0);
            if (1 < var9) {
              var16 = param5 * var7;
              var17 = 0;
              L4: while (true) {
                if (var17 >= var7) {
                  var14 = var13;
                  var13 = var12;
                  param5 = var10;
                  var12 = var14;
                  param6 = var11;
                  var9 = var9 >> 1;
                  var8++;
                  var11 = var11 >> 1;
                  var10 = var10 >> 1;
                  continue L3;
                } else {
                  var18 = var17;
                  var19 = var17;
                  var20 = var19 - -var16;
                  var21 = 0;
                  L5: while (true) {
                    if (var21 >= var11) {
                      var17++;
                      continue L4;
                    } else {
                      var22 = 0;
                      L6: while (true) {
                        if (var10 <= var22) {
                          var19 = var19 + var16;
                          var20 = var20 + var16;
                          var21++;
                          continue L5;
                        } else {
                          var15 = param4[var19];
                          var19 = var19 + var7;
                          var15 = var15 + param4[var19];
                          var15 = var15 + param4[var20];
                          var19 = var19 + var7;
                          var20 = var20 + var7;
                          var15 = var15 + param4[var20];
                          var13[var18] = var15 * 0.25f;
                          var20 = var20 + var7;
                          var18 = var18 + var7;
                          var22++;
                          continue L6;
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
        } else {
          return;
        }
    }

    final void q(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = TombRacer.field_G ? 1 : 0;
            super.q(param0);
            var4 = ((gw) this).r(12);
            if (38 == var4) {
              break L1;
            } else {
              if (var4 == -40) {
                break L1;
              } else {
                L2: {
                  if (40 == var4) {
                    break L2;
                  } else {
                    if (-42 != var4) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = 1;
                var3 = 1;
                break L0;
              }
            }
          }
          var3 = 2;
          var2 = 2;
          break L0;
        }
        ((gw) this).b(param0 + 243, var2 * 2097152, 2097152 * var3);
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -83;
        }
        return 7;
    }

    final static int A(int param0) {
        if (param0 != -1) {
            int discarded$0 = gw.A(33);
        }
        if (lca.a(false)) {
            // ifnull L35
        } else {
            return -1;
        }
        return wu.field_a.a((byte) 101).field_n;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return false;
    }

    final static void b(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        sda var5 = (sda) (Object) qd.field_a.f(-80);
        while (var5 != null) {
            oia.a(param1, var5, 127);
            var5 = (sda) (Object) qd.field_a.e(111);
        }
        int var3 = 22 / ((param0 - -35) / 63);
        vg var2 = wma.field_n.f(-80);
        while (var2 != null) {
            dr.a(param1, -75);
            var2 = wma.field_n.e(116);
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return false;
        }
        return true;
    }

    gw(la param0, int param1) {
        super(param0, param1);
    }

    gw(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
    }
}
