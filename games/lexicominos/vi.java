/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends kd {
    int field_i;
    static boolean field_j;
    static tf field_l;
    boolean field_h;
    int[] field_k;

    final static void a(byte param0) {
        ni.a(75, 17);
        if (param0 < 62) {
            vb var2 = (vb) null;
            vi.a(-73, (vb) null, 90);
        }
    }

    final static db[] b(int param0) {
        db[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Lexicominos.field_L ? 1 : 0;
                    var1 = new db[th.field_t];
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= th.field_t) {
                        statePc = 11;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = pb.field_h[var2] * bd.field_m[var2];
                    var13 = be.field_f[var2];
                    var11 = new int[var3];
                    var9 = var11;
                    var5 = var9;
                    stackIn_12_0 = 0;
                    stackIn_3_0 = stackIn_12_0;
                    if (var7 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var6 >= var3) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5[var6] = ci.field_b[vg.a((int) var13[var6], 255)];
                    var6++;
                    if (var7 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var11);
                    var2++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var11);
                    var2++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    gk.a(param0 ^ 27773);
                    stackIn_12_0 = param0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 != 23793) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return var1;
                }
                case 14: {
                    return (db[]) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, vb param1, int param2) {
        th var5 = null;
        int var4 = 0;
        try {
            var5 = ed.field_q;
            var5.h(param0, 0);
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.c(param2, param2 + -2);
            var5.c(param1.field_n, -1);
            var5.c(param1.field_p, -1);
            var5.f(param1.field_j, -32287);
            var5.f(param1.field_q, -32287);
            var5.f(param1.field_h, -32287);
            var5.f(param1.field_o, -32287);
            var5.a(var4, (byte) 119);
            var5.d(-var4 + var5.field_h, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 12 % ((-66 - param0) / 59);
        field_l = null;
    }

    final static cd a(byte[] param0, byte param1) {
        cd var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        cd stackIn_5_0 = null;
        cd stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param1 >= 100) {
                var2 = new cd(param0, mg.field_x, rg.field_c, pb.field_h, bd.field_m, be.field_f);
                gk.a(12428);
                stackIn_7_0 = (cd) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (cd) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("vi.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (cd) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    vi() {
        this.field_h = false;
    }

    static {
        field_l = new tf();
    }
}
