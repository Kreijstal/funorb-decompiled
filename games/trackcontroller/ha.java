/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends fc {
    int field_s;
    int field_t;
    bh field_l;
    int field_F;
    int field_A;
    int field_v;
    int field_u;
    static kk field_x;
    static int field_z;
    ik field_n;
    int field_p;
    mh field_B;
    static qj[] field_m;
    int field_q;
    int field_y;
    int field_C;
    int field_i;
    int field_j;
    int field_o;
    int field_w;
    uh field_k;
    int field_G;
    static qj field_E;
    int field_r;
    int field_D;

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2, byte[] param3, int param4, byte param5, be param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = TrackController.field_F ? 1 : 0;
          var7 = ae.a((byte) -39, param2);
          if (null == oj.field_b) {
            oj.field_b = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var15 = new int[4];
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var8 = var12;
          var9 = 0;
          if (param5 >= 43) {
            break L1;
          } else {
            field_E = null;
            break L1;
          }
        }
        L2: while (true) {
          if (4 <= var9) {
            if (null == dg.field_H) {
              dg.field_H = new be(var7);
              dg.field_H.field_k = 0;
              dg.field_H.a(param2, 121, param4, param3);
              dg.field_H.a(-3869, var7);
              dg.field_H.a(29715, var15);
              if (al.field_w == null) {
                al.field_w = new be(100);
                al.field_w.field_k = 0;
                al.field_w.a(10, (byte) -83);
                var11 = 0;
                var9 = var11;
                L3: while (true) {
                  if (4 <= var11) {
                    al.field_w.b(param2, (byte) -120);
                    al.field_w.a(param1, param0, false);
                    param6.a(al.field_w.field_k, 79, 0, al.field_w.field_j);
                    param6.a(dg.field_H.field_k, 83, 0, dg.field_H.field_j);
                    return;
                  } else {
                    al.field_w.b(false, var15[var11]);
                    var11++;
                    continue L3;
                  }
                }
              } else {
                if (-101 < (al.field_w.field_j.length ^ -1)) {
                  al.field_w = new be(100);
                  al.field_w.field_k = 0;
                  al.field_w.a(10, (byte) -83);
                  var11 = 0;
                  var9 = var11;
                  L4: while (true) {
                    if (4 <= var11) {
                      al.field_w.b(param2, (byte) -120);
                      al.field_w.a(param1, param0, false);
                      param6.a(al.field_w.field_k, 79, 0, al.field_w.field_j);
                      param6.a(dg.field_H.field_k, 83, 0, dg.field_H.field_j);
                      return;
                    } else {
                      al.field_w.b(false, var15[var11]);
                      var11++;
                      continue L4;
                    }
                  }
                } else {
                  al.field_w.field_k = 0;
                  al.field_w.a(10, (byte) -83);
                  var11 = 0;
                  var9 = var11;
                  L5: while (true) {
                    if (4 <= var11) {
                      al.field_w.b(param2, (byte) -120);
                      al.field_w.a(param1, param0, false);
                      param6.a(al.field_w.field_k, 79, 0, al.field_w.field_j);
                      param6.a(dg.field_H.field_k, 83, 0, dg.field_H.field_j);
                      return;
                    } else {
                      al.field_w.b(false, var15[var11]);
                      var11++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              if (dg.field_H.field_j.length < var7) {
                dg.field_H = new be(var7);
                dg.field_H.field_k = 0;
                dg.field_H.a(param2, 121, param4, param3);
                dg.field_H.a(-3869, var7);
                dg.field_H.a(29715, var15);
                if (al.field_w == null) {
                  al.field_w = new be(100);
                  al.field_w.field_k = 0;
                  al.field_w.a(10, (byte) -83);
                  var11 = 0;
                  var9 = var11;
                  L6: while (true) {
                    if (4 <= var11) {
                      al.field_w.b(param2, (byte) -120);
                      al.field_w.a(param1, param0, false);
                      param6.a(al.field_w.field_k, 79, 0, al.field_w.field_j);
                      param6.a(dg.field_H.field_k, 83, 0, dg.field_H.field_j);
                      return;
                    } else {
                      al.field_w.b(false, var15[var11]);
                      var11++;
                      continue L6;
                    }
                  }
                } else {
                  if (-101 < (al.field_w.field_j.length ^ -1)) {
                    al.field_w = new be(100);
                    al.field_w.field_k = 0;
                    al.field_w.a(10, (byte) -83);
                    var11 = 0;
                    var9 = var11;
                    L7: while (true) {
                      if (4 <= var11) {
                        al.field_w.b(param2, (byte) -120);
                        al.field_w.a(param1, param0, false);
                        param6.a(al.field_w.field_k, 79, 0, al.field_w.field_j);
                        param6.a(dg.field_H.field_k, 83, 0, dg.field_H.field_j);
                        return;
                      } else {
                        al.field_w.b(false, var15[var11]);
                        var11++;
                        continue L7;
                      }
                    }
                  } else {
                    al.field_w.field_k = 0;
                    al.field_w.a(10, (byte) -83);
                    var11 = 0;
                    var9 = var11;
                    L8: while (true) {
                      if (4 <= var11) {
                        al.field_w.b(param2, (byte) -120);
                        al.field_w.a(param1, param0, false);
                        param6.a(al.field_w.field_k, 79, 0, al.field_w.field_j);
                        param6.a(dg.field_H.field_k, 83, 0, dg.field_H.field_j);
                        return;
                      } else {
                        al.field_w.b(false, var15[var11]);
                        var11++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                L9: {
                  dg.field_H.field_k = 0;
                  dg.field_H.a(param2, 121, param4, param3);
                  dg.field_H.a(-3869, var7);
                  dg.field_H.a(29715, var15);
                  if (al.field_w == null) {
                    al.field_w = new be(100);
                    al.field_w.field_k = 0;
                    al.field_w.a(10, (byte) -83);
                    var11 = 0;
                    var9 = var11;
                    break L9;
                  } else {
                    if (-101 < (al.field_w.field_j.length ^ -1)) {
                      al.field_w = new be(100);
                      al.field_w.field_k = 0;
                      al.field_w.a(10, (byte) -83);
                      var11 = 0;
                      var9 = var11;
                      break L9;
                    } else {
                      al.field_w.field_k = 0;
                      al.field_w.a(10, (byte) -83);
                      var11 = 0;
                      var9 = var11;
                      break L9;
                    }
                  }
                }
                L10: while (true) {
                  if (4 <= var11) {
                    al.field_w.b(param2, (byte) -120);
                    al.field_w.a(param1, param0, false);
                    param6.a(al.field_w.field_k, 79, 0, al.field_w.field_j);
                    param6.a(dg.field_H.field_k, 83, 0, dg.field_H.field_j);
                    return;
                  } else {
                    al.field_w.b(false, var15[var11]);
                    var11++;
                    continue L10;
                  }
                }
              }
            }
          } else {
            var8[var9] = oj.field_b.nextInt();
            var9++;
            continue L2;
          }
        }
    }

    final void e(int param0) {
        ((ha) this).field_l = null;
        ((ha) this).field_n = null;
        int var2 = -87 / ((-49 - param0) / 34);
        ((ha) this).field_k = null;
        ((ha) this).field_B = null;
    }

    final static oi a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        oi var5 = null;
        Object var6 = null;
        if (param0 != null) {
          if (param0.length() != 0) {
            var2 = param0.indexOf('@');
            if ((var2 ^ -1) != 0) {
              if (param1 <= -106) {
                var3 = param0.substring(0, var2);
                var4 = param0.substring(var2 + 1);
                var5 = tf.a(0, var3);
                if (var5 != null) {
                  return var5;
                } else {
                  return jd.a(var4, 255);
                }
              } else {
                var6 = null;
                ha.a((oh) null, 98, -93, (oh) null);
                var3 = param0.substring(0, var2);
                var4 = param0.substring(var2 + 1);
                var5 = tf.a(0, var3);
                if (var5 != null) {
                  return var5;
                } else {
                  return jd.a(var4, 255);
                }
              }
            } else {
              return oc.field_j;
            }
          } else {
            return gd.field_f;
          }
        } else {
          return gd.field_f;
        }
    }

    public static void d(int param0) {
        field_m = null;
        if (param0 != 4) {
            field_z = 126;
            field_x = null;
            field_E = null;
            return;
        }
        field_x = null;
        field_E = null;
    }

    final static void a(oh param0, int param1, int param2, oh param3) {
        mk.field_b = param0;
        r.field_k = param3;
        sc.field_f = param2;
        jk.a(ll.field_k / param1, -120, ll.field_d / 2);
        vb.a(param3.field_H, param0.field_H - -param0.field_u, param1 + -107, param0.field_H, param3.field_H + param3.field_u);
    }

    ha() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = -1;
        field_E = new qj(270, 70);
    }
}
