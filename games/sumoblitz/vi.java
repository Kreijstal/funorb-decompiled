/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends nt {
    private int field_w;
    static tg field_v;
    private int field_t;
    private int field_x;
    static int[] field_z;
    boolean field_u;
    static dc field_y;
    private int field_s;

    final static void e(int param0) {
        od.a(5178);
        rd.a(param0, param0 + -31);
    }

    final boolean a(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (((vi) this).field_t <= ((vi) this).field_p) {
        } else {
            ((vi) this).field_k = ((vi) this).field_k + ((vi) this).field_w;
            ((vi) this).field_o = ((vi) this).field_o + ((vi) this).field_x;
            ((vi) this).field_w = ((vi) this).field_w * 251 / 300;
            ((vi) this).field_x = ((vi) this).field_x * 251 / 300;
            if (((vi) this).field_w >= 0) {
                ((vi) this).field_w = ((vi) this).field_w + 1;
            } else {
                ((vi) this).field_w = ((vi) this).field_w - 1;
            }
            if (((vi) this).field_x >= 0) {
                ((vi) this).field_x = ((vi) this).field_x + 1;
            } else {
                ((vi) this).field_x = ((vi) this).field_x - 1;
            }
        }
        if (param0 != -2567) {
            return true;
        }
        return super.a(-2567);
    }

    final static boolean f(int param0) {
        int var1 = 0;
        if (null == kd.field_a[0]) {
          L0: {
            si.a(135, 38, 148, 2, new int[7], 0, 492);
            si.a(150, 38, 170, param0 + -3, new int[6], 1, 470);
            si.a(150, 38, 170, param0 + -3, new int[5], 8, 470);
            si.a(400, 38, 150, 2, new int[2], 2, 490);
            si.a(430, 38, 170, 2, new int[3], 3, 470);
            si.a(430, 38, 170, 2, new int[2], 4, 470);
            si.a(430, 38, 170, 2, new int[2], 5, 470);
            si.a(200, 96, 170, param0 + -3, new int[2], 6, 470);
            si.a(390, 38, 170, 2, new int[2], 7, 468);
            si.a(400, 38, 200, 2, new int[2], 9, 440);
            si.a(370, 38, 200, 2, new int[2], 10, 440);
            si.a(240, 38, 200, 2, new int[2], 11, 440);
            si.a(370, 38, 200, 2, new int[1], 12, 440);
            t.field_q = (int)((double)ma.field_b.a(fn.field_u[12], 0) * 1.5);
            var1 = (int)((double)ma.field_b.a(fn.field_u[13], 0) * 1.5);
            if (t.field_q >= var1) {
              break L0;
            } else {
              t.field_q = var1;
              break L0;
            }
          }
          hg.field_o = new lg();
          return true;
        } else {
          return false;
        }
    }

    public static void c(boolean param0) {
        field_y = null;
        field_z = null;
        field_v = null;
        if (!param0) {
            vi.c((byte) 28);
        }
    }

    final void a(ha param0, int param1) {
        if (-1 != (((vi) this).field_s ^ -1)) {
            im.field_a.a((float)(((vi) this).field_k >> -1559474904), (float)(((vi) this).field_o >> -128733688), 8192, 0, 0, (256 / ((vi) this).field_t * ((vi) this).field_p << -492257544) + ((vi) this).field_q, 1);
        } else {
            uc.field_a.a((float)(((vi) this).field_k >> 46931400), (float)(((vi) this).field_o >> -354740696), 2048, 0, 3, 16777215 - -(((vi) this).field_p * (256 / ((vi) this).field_t) << -2105821224), 1);
        }
        if (param1 > -121) {
            field_v = null;
        }
    }

    vi(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        ((vi) this).field_s = param6;
        ((vi) this).field_x = param5;
        ((vi) this).field_t = param0;
        ((vi) this).field_w = param4;
    }

    final static void c(byte param0) {
        int var2 = 0;
        km var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pl var13 = null;
        int var14 = 0;
        int var15 = 0;
        pl var16 = null;
        int[][] var20 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -77) {
          var13 = ig.field_a;
          var16 = var13;
          var2 = var16.e(-31302);
          var3 = (km) (Object) dk.field_a.b(122);
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var2 == var3.field_n) {
                  break L1;
                } else {
                  var3 = (km) (Object) dk.field_a.d((byte) 18);
                  continue L0;
                }
              }
            }
            if (var3 != null) {
              L2: {
                var4 = var16.e(-31302);
                if (var4 != 0) {
                  var5 = var3.field_l;
                  rf.field_b[0] = qv.field_o;
                  var6_int = 1;
                  L3: while (true) {
                    if (var4 <= var6_int) {
                      tn.b(var4, -2147483648, var5);
                      var6_int = 0;
                      L4: while (true) {
                        if (var4 <= var6_int) {
                          qr.a(13136, var5);
                          var6 = new String[2][var5];
                          var20 = new int[2][var5 * 4];
                          var8 = se.field_d;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var9 >= var8) {
                              var14 = 0;
                              var9 = var14;
                              var15 = 0;
                              var10 = var15;
                              L6: while (true) {
                                if (var14 >= var8) {
                                  break L2;
                                } else {
                                  var11 = pd.field_q[var14 + var5];
                                  var6[1][var15] = rf.field_b[var11];
                                  var20[1][4 * var15] = lj.field_a[var11];
                                  var20[1][1 + 4 * var15] = jf.field_f[var11];
                                  var20[1][2 + 4 * var15] = ic.field_c[var11];
                                  var20[1][var15 * 4 + 3] = field_z[var11];
                                  if (ea.a(rf.field_b[var11], (byte) -25)) {
                                    if (-1 == (jf.field_f[var11] - (-ic.field_c[var11] - field_z[var11]) ^ -1)) {
                                      var6[1][var15] = null;
                                      var15--;
                                      var15++;
                                      var14++;
                                      continue L6;
                                    } else {
                                      var15++;
                                      var14++;
                                      continue L6;
                                    }
                                  } else {
                                    var15++;
                                    var14++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var11 = pd.field_q[var9];
                              var6[0][var10] = rf.field_b[var11];
                              var20[0][var10 * 4] = lj.field_a[var11];
                              var20[0][var10 * 4 + 1] = jf.field_f[var11];
                              var20[0][2 + 4 * var10] = ic.field_c[var11];
                              var20[0][var10 * 4 + 3] = field_z[var11];
                              if (ea.a(rf.field_b[var11], (byte) -25)) {
                                if (field_z[var11] + jf.field_f[var11] + ic.field_c[var11] == 0) {
                                  var6[0][var10] = null;
                                  var10--;
                                  var9++;
                                  var10++;
                                  continue L5;
                                } else {
                                  var9++;
                                  var10++;
                                  continue L5;
                                }
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          nm.a((fs) (Object) var16, (byte) 61);
                          if (var6_int == 0) {
                            oc.a(bb.field_l, qk.field_U, true, var6_int, sd.field_f, ch.field_d);
                            var6_int++;
                            continue L4;
                          } else {
                            oc.a(bb.field_l, qk.field_U, true, var6_int, sd.field_f, ch.field_d);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      rf.field_b[var6_int] = var13.d(-1);
                      var6_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var3.b(false);
              return;
            } else {
              kk.a((byte) -115);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        id var4 = (id) (Object) ow.field_f.b(85);
        while (var4 != null) {
            km.a((byte) -120, param0, var4);
            var4 = (id) (Object) ow.field_f.d((byte) 18);
        }
        of var5 = (of) (Object) oi.field_b.b(109);
        while (var5 != null) {
            pd.a((byte) -65, param0, var5);
            var5 = (of) (Object) oi.field_b.d((byte) 18);
        }
        if (param1 > -63) {
            field_z = null;
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = param0;
        if (param3) {
            var4 += 4;
        }
        if (param1) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        return kr.field_f[var4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new tg();
    }
}
