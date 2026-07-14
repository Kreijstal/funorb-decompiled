/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static tb field_b;
    static boolean field_d;
    static String field_g;
    static String field_c;
    static String field_k;
    int field_j;
    int field_f;
    int field_h;
    int field_a;
    static ak field_e;
    static String field_i;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 6774) {
            field_c = null;
        }
        int var3 = g.field_N != null ? 1 : 0;
        if (-10 == (wh.field_c ^ -1)) {
            if (!(!pc.a(uh.field_d, param2 + -6772, ng.field_a, he.field_Y, wf.field_o))) {
                if (2 != uh.field_d) {
                    if (var3 != 0) {
                        return false;
                    }
                }
                return vm.a(wf.field_o, ng.field_a, he.field_Y, -12, uh.field_d);
            }
        }
        if (-11 == (wh.field_c ^ -1)) {
            if (var3 != 0) {
                return false;
            }
            aj.a(-1045);
            return true;
        }
        if (11 == wh.field_c) {
            if (!ch.field_c) {
                return false;
            }
            if (qa.field_y == -3) {
                if (!sg.a(fa.field_r, param2 ^ 6671, li.field_e)) {
                    return false;
                }
            }
            if (-3 != qa.field_y) {
                if (!(var3 == 0)) {
                    return false;
                }
            }
            if (!(!vh.a((byte) 70))) {
                Object var4 = null;
                ce.a(param1, (byte) -85, qa.field_y, fa.field_r, cd.field_a, (String) null);
            }
            return true;
        }
        return false;
    }

    final static void a(boolean param0, int param1) {
        if (ph.n(-30146)) {
            if (!tf.a((byte) 38, j.field_d)) {
                // ifnonnull L38
                // if_icmpgt L38
            } else {
                ba.field_c = true;
                pd.field_d = rc.a(true, id.field_P > 0 ? true : false, null != gh.field_e ? true : false, (byte) -61, param0);
                return;
            }
        }
        ba.field_c = false;
        ob.field_k = false;
        if (tf.a((byte) 64, j.field_d)) {
            lk.field_F = true;
        }
        if (!(!ge.field_c)) {
            ge.field_c = false;
            fm.field_e = true;
        }
        if (gn.field_b) {
            mg.field_Zb = true;
            gn.field_b = false;
        }
        if (param1 <= 75) {
            field_i = null;
        }
        qi.a(param0, (byte) -108);
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (!cb.a(true, param0, 4564)) {
            return false;
        }
        for (var2 = 0; param0.length() > var2; var2++) {
            if (!(oe.a(param0.charAt(var2), -6237))) {
                return false;
            }
        }
        if (param1 != -70) {
            field_i = null;
            return true;
        }
        return true;
    }

    final static void a(int param0) {
        int[] var1_ref_int__ = null;
        int var1 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        L0: {
          var4 = client.field_A ? 1 : 0;
          if (nm.field_Qb) {
            break L0;
          } else {
            L1: {
              if (null != dm.field_b) {
                break L1;
              } else {
                dm.field_b = cc.a(4, (byte) -115);
                break L1;
              }
            }
            if (!dm.field_b.field_u) {
              break L0;
            } else {
              var18 = o.field_g;
              var14 = var18;
              var12 = var14;
              var10 = var12;
              var5 = var10;
              var1_ref_int__ = var5;
              var19 = dm.field_b.field_t;
              var3 = 0;
              L2: while (true) {
                if (var3 >= 8) {
                  var20 = j.field_d;
                  var16 = var20;
                  var13 = var16;
                  var11 = var13;
                  var7 = var11;
                  var1_ref_int__ = var7;
                  var21 = dm.field_b.field_t;
                  var9 = 0;
                  var3 = var9;
                  L3: while (true) {
                    if ((var9 ^ -1) <= -9) {
                      nm.field_Qb = true;
                      dm.field_b = null;
                      break L0;
                    } else {
                      var7[var9] = lb.a(var20[var9], var21[var9] ^ -1);
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  var5[var3] = de.b(var18[var3], var19[var3]);
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
        L4: {
          if (qj.field_k) {
            break L4;
          } else {
            L5: {
              if (null == mf.field_N) {
                mf.field_N = ub.a(1, 5, 0, 107);
                break L5;
              } else {
                break L5;
              }
            }
            if (!mf.field_N.field_s) {
              break L4;
            } else {
              var1 = mf.field_N.field_q[0];
              mf.field_N = null;
              qj.field_k = true;
              if (id.field_P < var1) {
                id.field_P = var1;
                break L4;
              } else {
                break L4;
              }
            }
          }
        }
        L6: {
          if (param0 <= -59) {
            break L6;
          } else {
            dc.a(true, 110);
            break L6;
          }
        }
        L7: {
          if (!nm.field_Qb) {
            break L7;
          } else {
            if (!qj.field_k) {
              break L7;
            } else {
              fh.b((byte) -125);
              break L7;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_i = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_k = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_c = "Shortcut Reference";
        field_d = false;
        field_k = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_b = new tb();
        field_i = "You have withdrawn your request to join.";
    }
}
