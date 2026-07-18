/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends jc {
    static int field_J;
    int field_L;
    static int field_K;
    static String[][] field_M;

    final static void o(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        pb var4_ref_pb = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        pb var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = MinerDisturbance.field_ab;
        try {
          L0: {
            pc.field_g = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = aj.field_b.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = pc.field_g[9] >> 8;
                  var4 = pc.field_g[10] >> 8;
                  var5 = pc.field_g[11] >> 8;
                  var6 = mn.field_x << 4;
                  var7 = 0;
                  var8 = nm.a(var6, (byte) -128) >> 8;
                  var9 = j.a(var6, -50) >> 8;
                  if (nk.field_w == -1) {
                    break L2;
                  } else {
                    if (-1 != gb.field_e) {
                      var9 = -128;
                      var8 = -gb.field_e + 240;
                      var7 = -320 + nk.field_w;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var7 * var7 - -(var8 * var8) - -(var9 * var9)));
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var12 = -var3 + var7;
                var13 = var8 + -var4;
                var14 = var9 - var5;
                var10 = 256.0 / Math.sqrt((double)(var13 * var13 + var12 * var12 - -(var14 * var14)));
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L3: while (true) {
                  if (aj.field_b.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (aj.field_b.length <= var17_int) {
                        var23[var16] = -2147483648;
                        var17 = aj.field_b[var16];
                        fd.a(3300, var16);
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= 3) {
                            tm.a(var17, -363953584, pc.field_g, tk.field_d, true, false, false);
                            sl.a(-1, var8, var12, var7, var17, var13, var9, var14);
                            var15++;
                            continue L3;
                          } else {
                            tk.field_d[var18] = tk.field_d[var18] + pa.field_b[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var16] < var23[var17_int]) {
                            var16 = var17_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_pb = aj.field_b[var3];
                var4_ref_pb.a(true);
                fd.a(3300, var3);
                var5 = var4_ref_pb.field_H + var4_ref_pb.field_v >> 1;
                var6 = var4_ref_pb.field_h - -var4_ref_pb.field_l >> 1;
                var7 = var4_ref_pb.field_J + var4_ref_pb.field_j >> 1;
                var8 = pc.field_g[9] >> 2;
                var9 = pc.field_g[10] >> 2;
                var10_int = pc.field_g[11] >> 2;
                var11 = var8 * tk.field_d[3] - (-(var9 * tk.field_d[4]) + -(var10_int * tk.field_d[5])) >> 14;
                var12 = var10_int * tk.field_d[8] + var9 * tk.field_d[7] + tk.field_d[6] * var8 >> 14;
                var13 = tk.field_d[9] * var8 - (-(tk.field_d[10] * var9) - var10_int * tk.field_d[11]) >> 14;
                var2[var3] = var13 * var7 + var11 * var5 - -(var6 * var12) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "oj.E(" + -1236579128 + ')');
        }
    }

    final static void c(byte param0) {
    }

    oj(fe param0) {
        super(param0.field_u, param0.field_t, param0.field_v, param0.field_q, (ad) null, (rm) null);
        try {
            param0.a(((oj) this).field_q, -57, 0, ((oj) this).field_v, 0);
            ((oj) this).field_L = 256;
            ((oj) this).field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "oj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(pi param0, pi param1, byte param2) {
        try {
            if (param0.field_c != null) {
                param0.b(34);
            }
            param0.field_f = param1;
            param0.field_c = param1.field_c;
            param0.field_c.field_f = param0;
            param0.field_f.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "oj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -117 + ')');
        }
    }

    final static void a(int param0, int param1) {
        dm.field_j = param0;
    }

    public oj() {
        super(0, 0, 0, 0, (ad) null, (rm) null);
        ((oj) this).field_L = 256;
    }

    public static void n(int param0) {
        field_M = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (!(((oj) this).field_I != null)) {
            return;
        }
        if (0 == ((oj) this).field_L) {
            return;
        }
        if (!(256 != ((oj) this).field_L)) {
            ((oj) this).field_I.a((byte) 4, param1 + ((oj) this).field_u, ((oj) this).field_t + param2, param3);
            return;
        }
        ea var6 = new ea(((oj) this).field_I.field_v, ((oj) this).field_I.field_q);
        vb.a(var6, 125);
        ((oj) this).field_I.a(param0, 0, 0, param3);
        tk.b(true);
        var6.f(param1 + ((oj) this).field_u, param2 - -((oj) this).field_t, ((oj) this).field_L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = -1;
        field_M = new String[][]{new String[1]};
    }
}
