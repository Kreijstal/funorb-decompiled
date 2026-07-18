/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int[][] field_f;
    static int[] field_e;
    static boolean[] field_i;
    static int[] field_h;
    static int[] field_a;
    static int[] field_b;
    static int[] field_d;
    static int field_c;
    static int field_g;

    final static void c(byte param0) {
        if (param0 <= 111) {
            kk discarded$0 = mf.a(45, (byte) -128);
            int discarded$1 = 25;
            p.a();
            return;
        }
        int discarded$2 = 25;
        p.a();
    }

    final static void a(int param0, boolean param1, int param2, uf param3, java.awt.Component param4, nb param5) {
        try {
            int discarded$0 = 22050;
            jb.a((byte) -109, true, param5, 22050, param4, 1024, param3);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mf.A(" + 15 + ',' + true + ',' + 22050 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        nk var5_ref_nk = null;
        int var5 = 0;
        dh var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        la var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var10 = ne.field_a;
            var2 = var10.h(16383);
            var3 = var10.h(16383);
            var4 = -8;
            if (0 != var2) {
              if (var2 != 1) {
                hb.a((Throwable) null, 0, "LR1: " + jc.b(96));
                lj.a((byte) 126);
                break L0;
              } else {
                var5 = var10.k(118);
                var6 = (dh) (Object) pa.field_c.b(2);
                L1: while (true) {
                  L2: {
                    if (var6 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var3 != var6.field_k) {
                          break L3;
                        } else {
                          if (var5 != var6.field_q) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var6 = (dh) (Object) pa.field_c.a(10);
                      continue L1;
                    }
                  }
                  if (var6 != null) {
                    var6.a(-78);
                    return;
                  } else {
                    lj.a((byte) 112);
                    return;
                  }
                }
              }
            } else {
              var5_ref_nk = (nk) (Object) qh.field_e.b(2);
              if (var5_ref_nk != null) {
                L4: {
                  var6_int = hd.field_o + -var10.field_k;
                  var14 = var5_ref_nk.field_m;
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var7 = var11;
                  if (var14.length << 2 < var6_int) {
                    var6_int = var14.length << 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var8 = 0;
                L5: while (true) {
                  if (var6_int <= var8) {
                    var5_ref_nk.field_k = true;
                    var5_ref_nk.a(-71);
                    return;
                  } else {
                    var7[var8 >> 2] = var7[var8 >> 2] + (var10.h(16383) << tc.a(var8 << 8, 768));
                    var8++;
                    continue L5;
                  }
                }
              } else {
                lj.a((byte) 113);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "mf.B(" + -53 + ')');
        }
    }

    public static void b() {
        field_h = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_i = null;
        field_b = null;
        field_f = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >>> 31;
        return -var3 + (param2 + var3) / param0;
    }

    final static void a(int param0, be param1) {
        int var2_int = 0;
        try {
            kf.field_c = param1.d((byte) -126) << 5;
            var2_int = param1.h(16383);
            kf.field_c = kf.field_c + (var2_int >> 3);
            ai.field_d = 1835008 & var2_int << 18;
            ai.field_d = ai.field_d + (param1.d((byte) -97) << 2);
            var2_int = param1.h(16383);
            ai.field_d = ai.field_d + (var2_int >> 6);
            fe.field_Q = 2064384 & var2_int << 15;
            fe.field_Q = fe.field_Q + (param1.h(16383) << 7);
            var2_int = param1.h(16383);
            nh.field_a = var2_int << 16 & 65536;
            fe.field_Q = fe.field_Q + (var2_int >> 1);
            nh.field_a = nh.field_a + param1.d((byte) -50);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "mf.E(" + 14 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static kk a(int param0, byte param1) {
        int var2 = 19 / ((param1 - 24) / 42);
        return fh.a(true, param0, false, false, 1, 9);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        boolean[] var0 = null;
        boolean[] var1 = null;
        boolean[] var2 = null;
        boolean[] var3 = null;
        int var4 = 0;
        int[] var72 = null;
        int[] var73 = null;
        int[] var74 = null;
        int[] var75 = null;
        int[] var76 = null;
        int[] var77 = null;
        int[] var78 = null;
        int[] var79 = null;
        int[] var80 = null;
        int[] var81 = null;
        int[] var82 = null;
        int[] var83 = null;
        int[] var84 = null;
        int[] var85 = null;
        int[] var86 = null;
        int[] var87 = null;
        int[] var88 = null;
        field_e = new int[17];
        field_i = new boolean[17];
        field_h = new int[17];
        field_f = new int[17][];
        field_f[2] = new int[4];
        field_f[5] = new int[2];
        field_f[10] = new int[2];
        field_f[6] = new int[2];
        field_f[9] = new int[1];
        field_f[4] = new int[2];
        field_f[0] = new int[8];
        field_f[1] = new int[8];
        field_f[15] = new int[2];
        field_f[16] = new int[2];
        field_f[8] = new int[2];
        field_f[3] = new int[3];
        field_f[7] = new int[2];
        field_f[14] = new int[1];
        field_f[11] = new int[4];
        field_f[12] = new int[7];
        field_f[13] = new int[6];
        field_a = new int[17];
        field_d = new int[17];
        field_b = new int[17];
        var0 = field_i;
        var1 = field_i;
        field_i[7] = true;
        var2 = field_i;
        var1[5] = true;
        var2[6] = true;
        field_i[8] = true;
        var0[4] = true;
        field_i[16] = true;
        var3 = field_i;
        field_i[11] = true;
        var3[10] = true;
        var4 = 0;
        L0: while (true) {
          if (var4 >= 17) {
            var72 = field_a;
            field_a[1] = 151;
            var72[0] = 151;
            var73 = field_h;
            field_h[1] = 152;
            var73[0] = 152;
            var75 = field_h;
            var74 = field_h;
            field_h[7] = 438;
            var76 = field_h;
            var74[5] = 438;
            var75[4] = 438;
            var76[6] = 438;
            var77 = field_a;
            var78 = field_a;
            field_a[7] = 21;
            var79 = field_a;
            var77[4] = 21;
            var78[5] = 21;
            var79[6] = 21;
            var82 = field_d;
            var80 = field_d;
            field_d[7] = 221;
            var81 = field_d;
            var80[5] = 221;
            var81[6] = 221;
            var82[4] = 221;
            var83 = field_h;
            var84 = field_h;
            field_h[16] = 438;
            var83[8] = 438;
            var84[9] = 438;
            field_a[16] = 125;
            var85 = field_a;
            var85[8] = 125;
            field_a[9] = 242;
            var86 = field_d;
            var87 = field_d;
            field_d[16] = 234;
            field_h[10] = 438;
            field_h[11] = 412;
            var86[8] = 234;
            var87[9] = 234;
            field_d[11] = 182;
            field_a[11] = 242 + -field_d[11];
            field_a[10] = 125;
            field_d[10] = 234;
            field_h[2] = -(26 * field_f[2].length) + 457;
            field_h[3] = 457 + -(26 * field_f[3].length);
            field_a[3] = 100;
            var88 = field_a;
            field_h[15] = 206;
            var88[2] = 100;
            field_a[15] = 242;
            field_e[4] = 0;
            field_e[5] = 1;
            field_e[12] = -1;
            field_e[9] = 1;
            field_d[15] = 78;
            field_e[10] = 0;
            field_e[13] = -1;
            field_e[7] = 13;
            field_e[11] = 1;
            field_e[6] = 12;
            field_e[3] = 1;
            field_e[8] = 0;
            field_e[16] = 11;
            field_e[2] = 0;
            field_e[14] = -3;
            field_c = 0;
            return;
          } else {
            field_a[var4] = 467;
            field_h[var4] = 229;
            field_e[var4] = -2147483648;
            if (!field_i[var4]) {
              field_d[var4] = 26;
              field_b[var4] = 156;
              var4++;
              var4++;
              continue L0;
            } else {
              field_d[var4] = 156;
              field_b[var4] = 26;
              var4++;
              var4++;
              var4++;
              continue L0;
            }
          }
        }
    }
}
