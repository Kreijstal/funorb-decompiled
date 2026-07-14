/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends java.awt.Canvas implements java.awt.event.FocusListener {
    static mi field_g;
    java.awt.Frame field_d;
    volatile boolean field_b;
    static String field_f;
    static String field_e;
    static int[] field_c;
    static pe[] field_h;
    static wk[] field_a;

    final static void a(int param0, boolean param1, int param2, int param3) {
        ib.a(param2, db.field_b, param1, param3, 127, da.field_g, te.field_b);
        if (param0 != -1604006872) {
            field_g = null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(pn param0, int param1) {
        ok.a(-1, param0, ((nn) this).field_d);
        int var3 = 121 / ((param1 - -15) / 60);
    }

    final static void a(String[] args, int param1, String param2, byte param3) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var5 = SteelSentinels.field_G;
          cb.field_j = sn.field_p;
          if (param1 == -256) {
            L1: {
              if (13 <= wi.field_y) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
            }
            qf.field_d = fn.a(stackIn_8_0 != 0, (byte) 69);
            break L0;
          } else {
            L2: {
              if (param1 < 100) {
                break L2;
              } else {
                if (-106 < param1) {
                  break L2;
                } else {
                  qf.field_d = fc.a((byte) -76, args);
                  break L0;
                }
              }
            }
            qf.field_d = fi.a(18, param2, param1);
            break L0;
          }
        }
        L3: {
          if (param3 < -101) {
            break L3;
          } else {
            field_e = null;
            break L3;
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = an.field_h * an.field_h;
        if (param0) {
            return;
        }
        int var2 = var1 - wa.field_p * wa.field_p;
        int var3 = var2 * (jn.field_c + -va.field_b) / var1 + va.field_b;
        qc.field_V.a(0, var3, 120, me.field_e, 640);
        nm.a(da.field_g, 0, va.field_e, 5, jn.field_c - 24, 640, 110);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    nn() {
    }

    public static void b(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 != 30) {
            return;
        }
        field_h = null;
        field_a = null;
        field_g = null;
        field_f = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((nn) this).field_b = true;
    }

    final static boolean a(byte param0) {
        if (param0 != 42) {
            return false;
        }
        return de.field_d;
    }

    final static int a(int[] param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = SteelSentinels.field_G;
        if (param1 > 36) {
          var2 = 0;
          var3 = param0.length;
          if (var3 < 8) {
            return 0;
          } else {
            var4 = 0;
            L0: while (true) {
              if (var3 + -8 <= var4) {
                var6 = var3 - 8;
                var4 = var6;
                L1: while (true) {
                  if (var6 >= var3) {
                    return var2;
                  } else {
                    L2: {
                      if ((param0[var6] ^ -1) > -1) {
                        break L2;
                      } else {
                        if (param0[var6] >= dn.field_Sb.length) {
                          break L2;
                        } else {
                          var2 = var2 + dn.field_Sb[param0[var6]];
                          break L2;
                        }
                      }
                    }
                    if (-35 != (param0[var6] ^ -1)) {
                      var6++;
                      continue L1;
                    } else {
                      return 6100;
                    }
                  }
                }
              } else {
                if (param0[var4] >= 0) {
                  if (param0[var4] < tc.field_B.length) {
                    var2 = var2 + tc.field_B[param0[var4]];
                    var4++;
                    continue L0;
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -22;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wk param4, int param5) {
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
          var20 = SteelSentinels.field_G;
          var6 = (-param2 + param1 << 1707727656) / param4.field_z;
          param3 = param3 + param4.field_H;
          var7 = (param2 << 2097599976) + param4.field_D * var6;
          param0 = param0 + param4.field_D;
          var8 = param3 * pb.field_c + param0;
          var9 = 0;
          var10 = param4.field_F;
          if (param5 == -1) {
            break L0;
          } else {
            nn.a(-123, false, 41, 13);
            break L0;
          }
        }
        L1: {
          var11 = param4.field_A;
          var12 = -var11 + pb.field_c;
          var13 = 0;
          if (pb.field_l > param3) {
            var14 = pb.field_l - param3;
            var10 = var10 - var14;
            var9 = var9 + var11 * var14;
            param3 = pb.field_l;
            var8 = var8 + pb.field_c * var14;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 >= pb.field_i) {
            break L2;
          } else {
            var14 = pb.field_i + -param0;
            var7 = var7 + var14 * var6;
            var12 = var12 + var14;
            var13 = var13 + var14;
            var8 = var8 + var14;
            var11 = var11 - var14;
            var9 = var9 + var14;
            param0 = pb.field_i;
            break L2;
          }
        }
        L3: {
          if (pb.field_d >= var10 + param3) {
            break L3;
          } else {
            var10 = var10 - (var10 + (param3 - pb.field_d));
            break L3;
          }
        }
        L4: {
          if (param0 - -var11 <= pb.field_b) {
            break L4;
          } else {
            var14 = param0 + var11 - pb.field_b;
            var12 = var12 + var14;
            var11 = var11 - var14;
            var13 = var13 + var14;
            break L4;
          }
        }
        L5: {
          if (0 >= var11) {
            break L5;
          } else {
            if (-1 <= var10) {
              break L5;
            } else {
              param3 = -var10;
              L6: while (true) {
                if (-1 <= param3) {
                  return;
                } else {
                  var14 = var7;
                  param0 = -var11;
                  L7: while (true) {
                    if (0 <= param0) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param3++;
                      continue L6;
                    } else {
                      var15 = var14 >> -713378872;
                      var14 = var14 + var6;
                      var16 = 256 + -var15;
                      if (var15 > -1) {
                        var8++;
                        var9++;
                        param0++;
                        continue L7;
                      } else {
                        var9++;
                        var17 = param4.field_E[var9];
                        if (-1 != var17) {
                          if (255 < var15) {
                            pb.field_g[var8] = var17;
                            var8++;
                            param0++;
                            continue L7;
                          } else {
                            var18 = pb.field_g[var8];
                            var19 = var16 * (var18 & 16711935) - -(var15 * (16711935 & var17)) >> -1604006872 & 16711935;
                            pb.field_g[var8] = ec.a(ec.a(65280, var17) * var15 + ec.a(var18, 65280) * var16 >> 1834406760, 65280) + var19;
                            var8++;
                            param0++;
                            continue L7;
                          }
                        } else {
                          var8++;
                          param0++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Playing";
        field_c = new int[]{109, 23, 18, 16, -1, -1, -1, -1, -1, -1, -1};
    }
}
