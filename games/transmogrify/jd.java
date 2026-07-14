/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends IOException {
    static int field_a;
    static int field_b;

    final static mi a(byte[] param0, int param1, ii[] param2) {
        int var9 = 0;
        int var10 = Transmogrify.field_A ? 1 : 0;
        if (256 != param2.length) {
            throw new IllegalArgumentException();
        }
        int[] var27 = new int[256];
        int[] var22 = var27;
        int[] var17 = var22;
        int[] var12 = var17;
        int[] var11 = var12;
        int[] var3 = var11;
        int var5 = -98 / ((-28 - param1) / 54);
        int[] var28 = new int[256];
        int[] var23 = var28;
        int[] var18 = var23;
        int[] var13 = var18;
        int[] var4 = var13;
        int[] var29 = new int[256];
        int[] var24 = var29;
        int[] var19 = var24;
        int[] var14 = var19;
        int[] var6 = var14;
        int[] var30 = new int[256];
        int[] var25 = var30;
        int[] var20 = var25;
        int[] var15 = var20;
        int[] var7 = var15;
        byte[][] var31 = new byte[256][];
        byte[][] var26 = var31;
        byte[][] var21 = var26;
        byte[][] var16 = var21;
        byte[][] var8 = var16;
        for (var9 = 0; var9 < 256; var9++) {
            var11[var9] = param2[var9].field_c;
            var4[var9] = param2[var9].field_b;
            var6[var9] = param2[var9].field_f;
            var7[var9] = param2[var9].field_g;
            var8[var9] = param2[var9].field_i;
        }
        return new mi(param0, var27, var28, var29, var30, var31);
    }

    final static void a(byte param0) {
        int var1 = -128 / ((-25 - param0) / 47);
    }

    jd(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, ti[] param2, int param3, int param4, int param5, kg param6, int param7, int param8, ti[] param9, boolean param10) {
        je.a(-11);
        if (param10) {
            field_a = -111;
        }
    }

    final static int a(int param0, hg param1, byte param2, String param3, int param4, boolean param5, hg param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        oa stackIn_9_0 = null;
        oa stackIn_10_0 = null;
        oa stackIn_11_0 = null;
        String stackIn_11_1 = null;
        oa stackIn_12_0 = null;
        oa stackIn_13_0 = null;
        oa stackIn_14_0 = null;
        String stackIn_14_1 = null;
        oa stackOut_8_0 = null;
        oa stackOut_10_0 = null;
        String stackOut_10_1 = null;
        oa stackOut_9_0 = null;
        String stackOut_9_1 = null;
        oa stackOut_11_0 = null;
        oa stackOut_13_0 = null;
        String stackOut_13_1 = null;
        oa stackOut_12_0 = null;
        String stackOut_12_1 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        var14 = param6.a(false);
        var8 = param1.a(false);
        if (param2 == -9) {
          L0: {
            if (null != nk.field_b) {
              break L0;
            } else {
              if (gk.a(false, 127)) {
                break L0;
              } else {
                return -1;
              }
            }
          }
          L1: {
            if (lj.field_z == jk.field_y) {
              L2: {
                ch.field_f = null;
                ff.field_D.field_h = 0;
                if (param3 != null) {
                  L3: {
                    var9 = 0;
                    if (param5) {
                      var9 = var9 | 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    d.field_d.field_h = 0;
                    d.field_d.a(param2 + -94, d.field_c.nextInt());
                    d.field_d.a(param2 ^ 110, d.field_c.nextInt());
                    d.field_d.a(var14, 123);
                    d.field_d.a(var8, 125);
                    var15 = (CharSequence) (Object) param3;
                    d.field_d.a(ob.a((byte) 107, var15), param2 ^ -120);
                    d.field_d.c(param4, -159688920);
                    d.field_d.f(6389, param0);
                    d.field_d.f(6389, var9);
                    ff.field_D.f(6389, 18);
                    ff.field_D.field_h = ff.field_D.field_h + 2;
                    var10 = ff.field_D.field_h;
                    var11_ref = wk.a(ha.b(116), (byte) -45);
                    if (var11_ref == null) {
                      var11_ref = "";
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ff.field_D.a(92, var11_ref);
                  bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -123, d.field_d);
                  ff.field_D.b(-109, ff.field_D.field_h - var10);
                  break L2;
                } else {
                  L5: {
                    d.field_d.field_h = 0;
                    d.field_d.a(param2 + -96, d.field_c.nextInt());
                    d.field_d.a(-103, d.field_c.nextInt());
                    stackOut_8_0 = d.field_d;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (param6.a((byte) -121)) {
                      stackOut_10_0 = (oa) (Object) stackIn_10_0;
                      stackOut_10_1 = (String) var14;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L5;
                    } else {
                      stackOut_9_0 = (oa) (Object) stackIn_9_0;
                      stackOut_9_1 = "";
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L5;
                    }
                  }
                  L6: {
                    ((oa) (Object) stackIn_11_0).a(stackIn_11_1, 126);
                    stackOut_11_0 = d.field_d;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (param1.a((byte) -121)) {
                      stackOut_13_0 = (oa) (Object) stackIn_13_0;
                      stackOut_13_1 = (String) var8;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L6;
                    } else {
                      stackOut_12_0 = (oa) (Object) stackIn_12_0;
                      stackOut_12_1 = "";
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L6;
                    }
                  }
                  ((oa) (Object) stackIn_14_0).a(stackIn_14_1, param2 ^ -117);
                  ff.field_D.f(6389, 16);
                  ff.field_D.field_h = ff.field_D.field_h + 1;
                  var9 = ff.field_D.field_h;
                  bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -108, d.field_d);
                  ff.field_D.a((byte) -42, -var9 + ff.field_D.field_h);
                  break L2;
                }
              }
              rb.a(-1, -377);
              lj.field_z = vf.field_b;
              break L1;
            } else {
              break L1;
            }
          }
          L7: {
            if (vf.field_b != lj.field_z) {
              break L7;
            } else {
              if (!ue.a(1, 0)) {
                break L7;
              } else {
                L8: {
                  var9 = nf.field_l.d((byte) 97);
                  nf.field_l.field_h = 0;
                  if (-101 < var9) {
                    break L8;
                  } else {
                    if (-106 < var9) {
                      break L8;
                    } else {
                      lj.field_z = aa.field_b;
                      wh.field_F = new String[var9 + -100];
                      break L7;
                    }
                  }
                }
                if (-249 != (var9 ^ -1)) {
                  if (99 != var9) {
                    lj.field_z = gg.field_f;
                    tg.field_a = -1;
                    ca.field_e = var9;
                    break L7;
                  } else {
                    boolean discarded$1 = ue.a(jk.a((byte) -114), 0);
                    ch.field_f = new Boolean(oh.a((byte) -87, (oa) (Object) nf.field_l));
                    nf.field_l.field_h = 0;
                    break L7;
                  }
                } else {
                  tb.a(ha.b(param2 ^ -66), true);
                  Transmogrify.field_B = nj.field_j;
                  pc.a(1);
                  ej.field_k = false;
                  return var9;
                }
              }
            }
          }
          L9: {
            if (aa.field_b != lj.field_z) {
              break L9;
            } else {
              var9 = 2;
              if (ue.a(var9, 0)) {
                var10 = nf.field_l.a((byte) -102);
                nf.field_l.field_h = 0;
                if (!ue.a(var10, 0)) {
                  break L9;
                } else {
                  var11 = wh.field_F.length;
                  var12 = 0;
                  L10: while (true) {
                    if (var11 <= var12) {
                      pc.a(1);
                      ej.field_k = false;
                      return var11 + 100;
                    } else {
                      wh.field_F[var12] = nf.field_l.e(26);
                      var12++;
                      continue L10;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
          }
          L11: {
            if (gg.field_f == lj.field_z) {
              if (ce.a(0)) {
                L12: {
                  if (-256 == (ca.field_e ^ -1)) {
                    var9_ref = nf.field_l.j(-1640531527);
                    if (var9_ref == null) {
                      break L12;
                    } else {
                      v.a(0, var9_ref, ha.b(114));
                      break L12;
                    }
                  } else {
                    Transmogrify.field_B = nf.field_l.g(param2 + 12257);
                    break L12;
                  }
                }
                pc.a(1);
                ej.field_k = false;
                return ca.field_e;
              } else {
                break L11;
              }
            } else {
              break L11;
            }
          }
          L13: {
            if (null != nk.field_b) {
              break L13;
            } else {
              if (ej.field_k) {
                L14: {
                  if ((mc.b(true) ^ -1L) >= -30001L) {
                    Transmogrify.field_B = bd.field_s;
                    break L14;
                  } else {
                    Transmogrify.field_B = ng.field_h;
                    break L14;
                  }
                }
                ej.field_k = false;
                return 249;
              } else {
                var9 = lf.field_c;
                lf.field_c = kf.field_p;
                kf.field_p = var9;
                ej.field_k = true;
                break L13;
              }
            }
          }
          return -1;
        } else {
          return -40;
        }
    }

    static {
    }
}
