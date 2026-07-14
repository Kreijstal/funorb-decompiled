/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends tc {
    int field_k;
    static byte[][] field_z;
    bg field_n;
    int field_B;
    static int[] field_u;
    int field_D;
    String field_r;
    int field_A;
    wk field_m;
    int field_t;
    boolean field_l;
    int field_x;
    static int field_F;
    int field_v;
    om field_p;
    static String field_C;
    String field_w;
    String field_q;
    int field_o;
    static String field_E;
    int field_y;
    wk field_s;

    public static void a(int param0) {
        field_z = null;
        if (param0 != -101) {
            wk[] discarded$0 = cq.a(-99, -40, -126, (byte) 12, -104);
        }
        field_E = null;
        field_u = null;
        field_C = null;
    }

    final static Class a(Object param0, byte param1) {
        if (Integer.class.isInstance(param0)) {
            return Integer.TYPE;
        }
        if (param1 != -75) {
            return null;
        }
        if (Byte.class.isInstance(param0)) {
            return Byte.TYPE;
        }
        if (Short.class.isInstance(param0)) {
            return Short.TYPE;
        }
        if (!(!Long.class.isInstance(param0))) {
            return Long.TYPE;
        }
        if (Boolean.class.isInstance(param0)) {
            return Boolean.TYPE;
        }
        if (Float.class.isInstance(param0)) {
            return Float.TYPE;
        }
        if (!(!Double.class.isInstance(param0))) {
            return Double.TYPE;
        }
        if (!Character.class.isInstance(param0)) {
            return null;
        }
        return Character.TYPE;
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          oh.field_L = lm.field_d;
          if (param1 == -14) {
            break L0;
          } else {
            cq.a(7);
            break L0;
          }
        }
        L1: {
          if (255 == param3) {
            L2: {
              if (-14 >= (nm.field_z ^ -1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            p.field_a = dc.a(stackIn_10_0 != 0, false);
            break L1;
          } else {
            L3: {
              if (-101 < param3) {
                break L3;
              } else {
                if (-106 < param3) {
                  break L3;
                } else {
                  p.field_a = ei.a(2, param2);
                  break L1;
                }
              }
            }
            p.field_a = il.a(-1, param3, param0);
            break L1;
          }
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 0;
          var3 = ib.field_j;
          if ((var3 ^ -1) <= -6) {
            if (var3 < 105) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (var3 < 120) {
                var3 = -var3 + 120;
                var2 = 8192 - var3 * var3 * 8192 / 3300;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var2 = 8192 * (var3 * var3) / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (1 == param1) {
            var5 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1 == 3) {
            var4 = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((param1 ^ -1) == -5) {
            var5 = 1;
            var4 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == -116) {
            break L4;
          } else {
            cq.a((byte) 74, 85);
            break L4;
          }
        }
        L5: {
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param1 == -7) {
            var4 = 1;
            var5 = -1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (-8 == param1) {
              break L8;
            } else {
              if (-9 == param1) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (11 != param1) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (-13 == param1) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (param1 != -14) {
            break L11;
          } else {
            var5 = -1;
            var4 = 1;
            break L11;
          }
        }
        L12: {
          if (-15 == param1) {
            var4 = -1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (15 != param1) {
            break L13;
          } else {
            var4 = 1;
            var5 = 1;
            break L13;
          }
        }
        pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
    }

    final static wk[] a(int param0, int param1, int param2, byte param3, int param4) {
        wk[] var6 = new wk[9];
        wk[] var5 = var6;
        var6[6] = hl.a(false, param2, param1);
        var5[3] = hl.a(false, param2, param1);
        var5[2] = hl.a(false, param2, param1);
        var5[1] = hl.a(false, param2, param1);
        var5[0] = hl.a(false, param2, param1);
        var6[8] = hl.a(false, param4, param1);
        var5[7] = hl.a(false, param4, param1);
        var5[5] = hl.a(false, param4, param1);
        if (param3 <= 33) {
            cq.a(111);
        }
        if (param0 != 0) {
            var6[4] = hl.a(false, param0, 64);
        }
        return var5;
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param2 >= 114) {
            break L0;
          } else {
            boolean discarded$2 = ((cq) this).a(106, -67, 2);
            break L0;
          }
        }
        L1: {
          L2: {
            if (db.a(true, ((cq) this).field_y) > param0) {
              break L2;
            } else {
              if (db.a(true, ((cq) this).field_B + ((cq) this).field_y) < param0) {
                break L2;
              } else {
                if (param1 < u.a(((cq) this).field_x, (byte) 94)) {
                  break L2;
                } else {
                  if (u.a(((cq) this).field_o + ((cq) this).field_x, (byte) 94) < param1) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    cq(om param0) {
        ne[] var3 = null;
        ne[] var4_ref_ne__ = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lo var12 = null;
        ne var13 = null;
        sd var14 = null;
        int[] var18 = null;
        ((cq) this).field_p = param0;
        ((cq) this).field_w = param0.field_J;
        ((cq) this).field_v = 1073741823;
        ((cq) this).field_l = false;
        ((cq) this).field_k = param0.field_v;
        ((cq) this).field_n = new bg(16);
        var12 = param0.a(-114);
        var3 = var12.a(115, (ha) null);
        var4_ref_ne__ = var3;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var4_ref_ne__.length) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= param0.field_B.length) {
              } else {
                var5 = param0.field_B[var4];
                if (var5 != -1) {
                  var14 = param0.field_G.field_q[var5];
                  if (null != var14.field_p) {
                    var18 = var14.field_p;
                    var8 = 0;
                    L2: while (true) {
                      if (var18.length > var8) {
                        var9 = var18[var8];
                        var10 = bw.field_m[var9][0];
                        if (((cq) this).field_n.a(-96, (long)var10) == null) {
                          ((cq) this).field_n.a(new tc(), (long)var10, 126);
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      } else {
                        var4++;
                        continue L1;
                      }
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            var13 = var4_ref_ne__[var5];
            if (null != var13.field_c) {
              if (var13.field_c.field_O != param0.field_w) {
                var7 = var13.field_c.g(0);
                if (((cq) this).field_n.a(-57, (long)var7) == null) {
                  ((cq) this).field_n.a(new tc(), (long)var7, 108);
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    cq(int param0, String param1) {
        ((cq) this).field_w = param1;
        ((cq) this).field_v = 1073741823;
        ((cq) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 22;
        field_C = "Create unrated game";
        field_E = "Quick Chat game";
    }
}
