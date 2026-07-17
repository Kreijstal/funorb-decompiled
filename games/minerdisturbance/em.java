/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class em extends al {
    static boolean field_w;
    static ia field_B;
    boolean field_z;
    boolean field_v;
    static String field_u;
    static boolean field_x;
    volatile boolean field_C;
    static ea field_y;
    static long field_A;

    abstract int f(int param0);

    abstract byte[] c(byte param0);

    public static void b(byte param0) {
        field_B = null;
        field_u = null;
        field_y = null;
    }

    final static void g(int param0) {
    }

    em() {
        ((em) this).field_C = true;
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        jb var4 = null;
        int var4_int = 0;
        int var5 = 0;
        il var5_ref_il = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ld var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var9 = kj.field_a;
              var2 = var9.d((byte) -54);
              var3 = var9.d((byte) -54);
              if (var2 == 0) {
                var4 = (jb) (Object) sd.field_a.b(param0 ^ -62);
                if (var4 != null) {
                  L2: {
                    var5 = rj.field_d + -var9.field_o;
                    var13 = var4.field_r;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5 <= var13.length << 2) {
                      break L2;
                    } else {
                      var5 = var13.length << 2;
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 <= var7) {
                      var4.b(34);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -54) << c.a(768, var7 << 8));
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  si.a(-36);
                  return;
                }
              } else {
                if (var2 != 1) {
                  di.a((Throwable) null, 1, "LR1: " + hj.a((byte) 55));
                  si.a(param0 ^ 1);
                  break L1;
                } else {
                  var4_int = var9.c((byte) 127);
                  var5_ref_il = (il) (Object) mf.field_h.b(119);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_il == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != var5_ref_il.field_r) {
                            break L6;
                          } else {
                            if (var4_int == var5_ref_il.field_p) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref_il = (il) (Object) mf.field_h.b((byte) 56);
                        continue L4;
                      }
                    }
                    if (var5_ref_il == null) {
                      si.a(param0 ^ 117);
                      return;
                    } else {
                      var5_ref_il.b(34);
                      break L1;
                    }
                  }
                }
              }
            }
            if (param0 == -67) {
              break L0;
            } else {
              field_u = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "em.G(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = true;
        field_u = "Achievements";
        field_x = false;
    }
}
