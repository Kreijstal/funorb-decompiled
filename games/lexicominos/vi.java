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
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var1 = new db[th.field_t];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 >= th.field_t) {
                break L2;
              } else {
                var3 = pb.field_h[var2] * bd.field_m[var2];
                var13 = be.field_f[var2];
                var11 = new int[var3];
                var9 = var11;
                var5 = var9;
                stackOut_2_0 = 0;
                stackIn_12_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  var6 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var6 >= var3) {
                        var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var11);
                        var2++;
                        break L4;
                      } else {
                        var5[var6] = ci.field_b[vg.a((int) var13[var6], 255)];
                        var6++;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            gk.a(param0 ^ 27773);
            stackOut_11_0 = param0;
            stackIn_12_0 = stackOut_11_0;
            break L1;
          }
          if (stackIn_12_0 != 23793) {
            return (db[]) null;
          } else {
            return var1;
          }
        }
    }

    final static void a(int param0, vb param1, int param2) {
        th var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
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
            discarded$0 = var5.a(var4, (byte) 119);
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_6_0 = null;
        cd stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param1 >= 100) {
                var2 = new cd(param0, mg.field_x, rg.field_c, pb.field_h, bd.field_m, be.field_f);
                gk.a(12428);
                stackOut_6_0 = (cd) (var2);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (cd) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("vi.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
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
