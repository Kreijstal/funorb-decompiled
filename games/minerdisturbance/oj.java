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
        RuntimeException decompiledCaughtException = null;
        var19 = MinerDisturbance.field_ab;
        try {
          L0: {
            pc.field_g = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = aj.field_b.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = pc.field_g[9] >> -2096764792;
                  var4 = pc.field_g[10] >> 206942920;
                  var5 = pc.field_g[11] >> -1236579128;
                  var6 = mn.field_x << -412586332;
                  var7 = 0;
                  var8 = nm.a(var6, (byte) -128) >> -1271587640;
                  var9 = j.a(var6, -50) >> 1260734408;
                  if ((nk.field_w ^ -1) == 0) {
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
                L3: {
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
                  if (param0 == -1236579128) {
                    break L3;
                  } else {
                    field_J = 107;
                    break L3;
                  }
                }
                L4: while (true) {
                  if (aj.field_b.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (aj.field_b.length <= var17_int) {
                        var21[var16] = -2147483648;
                        var17 = aj.field_b[var16];
                        fd.a(3300, var16);
                        var18 = 0;
                        L6: while (true) {
                          if ((var18 ^ -1) <= -4) {
                            tm.a(var17, -363953584, pc.field_g, tk.field_d, true, false, false);
                            sl.a(-1, var8, var12, var7, var17, var13, var9, var14);
                            var15++;
                            continue L4;
                          } else {
                            tk.field_d[var18] = tk.field_d[var18] + pa.field_b[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var21[var16] < var21[var17_int]) {
                            var16 = var17_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_pb = aj.field_b[var3];
                var4_ref_pb.a(true);
                fd.a(3300, var3);
                var5 = var4_ref_pb.field_H + var4_ref_pb.field_v >> -489440831;
                var6 = var4_ref_pb.field_h - -var4_ref_pb.field_l >> 1917240833;
                var7 = var4_ref_pb.field_J + var4_ref_pb.field_j >> -1176108319;
                var8 = pc.field_g[9] >> -583891198;
                var9 = pc.field_g[10] >> -755997342;
                var10_int = pc.field_g[11] >> -1084108382;
                var11 = var8 * tk.field_d[3] - (-(var9 * tk.field_d[4]) + -(var10_int * tk.field_d[5])) >> 657562030;
                var12 = var10_int * tk.field_d[8] + var9 * tk.field_d[7] + tk.field_d[6] * var8 >> -242934642;
                var13 = tk.field_d[9] * var8 - (-(tk.field_d[10] * var9) - var10_int * tk.field_d[11]) >> -758171858;
                var2[var3] = var13 * var7 + var11 * var5 - -(var6 * var12) >> -1469637712;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "oj.E(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        if (param0 != -62) {
            oj.a(-128, 66);
        }
    }

    oj(fe param0) {
        super(param0.field_u, param0.field_t, param0.field_v, param0.field_q, (ad) null, (rm) null);
        try {
            param0.a(this.field_q, -57, 0, this.field_v, 0);
            this.field_L = 256;
            this.field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(pi param0, pi param1, byte param2) {
        try {
            if (param2 != -117) {
                field_K = -82;
            }
            if (param0.field_c != null) {
                param0.b(34);
            }
            param0.field_f = param1;
            param0.field_c = param1.field_c;
            param0.field_c.field_f = param0;
            param0.field_f.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "oj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        dm.field_j = param0;
        if (param1 != 3) {
            field_K = 80;
        }
    }

    public oj() {
        super(0, 0, 0, 0, (ad) null, (rm) null);
        this.field_L = 256;
    }

    public static void n(int param0) {
        field_M = (String[][]) null;
        if (param0 != 65536) {
            oj.a(-64, -101);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        if (!(this.field_I != null)) {
            return;
        }
        if (0 == this.field_L) {
            return;
        }
        if (!(256 != this.field_L)) {
            this.field_I.a((byte) 4, param1 + this.field_u, this.field_t + param2, param3);
            return;
        }
        ea var6 = new ea(this.field_I.field_v, this.field_I.field_q);
        vb.a(var6, 125);
        this.field_I.a(param0, 0, 0, param3);
        tk.b(true);
        var6.f(param1 + this.field_u, param2 - -this.field_t, this.field_L);
    }

    static {
        field_K = -1;
        field_M = new String[][]{new String[]{"Ah, you've found the bones of an old miner. Clearly, he wasn't as fortunate as you. Check his body; he might have some equipment he no longer has any use for. You have taken care of whatever killed him, right?"}};
    }
}
