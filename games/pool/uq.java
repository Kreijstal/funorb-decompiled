/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq {
    int[] field_v;
    int field_p;
    int field_s;
    int[] field_I;
    int field_a;
    int field_u;
    int field_e;
    int field_h;
    static jg field_i;
    static vh field_D;
    static int field_c;
    int field_H;
    int[][] field_b;
    byte[] field_A;
    int[] field_o;
    byte[] field_B;
    int[] field_w;
    byte[] field_g;
    int field_y;
    int field_j;
    int field_F;
    boolean[] field_x;
    static vh field_f;
    byte[][] field_J;
    byte[] field_k;
    int[][] field_n;
    int field_q;
    byte[] field_G;
    int[][] field_d;
    int field_t;
    int field_l;
    boolean[] field_m;
    static String field_K;
    byte field_C;
    int field_E;
    byte[] field_r;
    int field_z;

    final static void a(long param0) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              Thread.sleep(param0);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        kf var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          L0: {
            L1: {
              ib.field_s.d();
              kk.field_D.d();
              if (param0 < -79) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            L2: {
              kh.field_Pb = kh.field_Pb - 1;
              if (kh.field_Pb == 0) {
                kh.field_Pb = 200;
                var1 = (kf) (Object) oj.field_o.c((byte) 116);
                L3: while (true) {
                  if (var1 == null) {
                    if (mp.field_R != null) {
                      var1 = (kf) (Object) mp.field_R.c((byte) -84);
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (!var1.field_m.b(-117)) {
                              var1.a((byte) -117);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var1 = (kf) (Object) mp.field_R.f((byte) -5);
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L6: {
                      if (!var1.field_m.b(-126)) {
                        var1.a((byte) -117);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var1 = (kf) (Object) oj.field_o.f((byte) -5);
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (null == tl.field_N) {
                break L7;
              } else {
                if (!tl.field_N.d(-11414)) {
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "uq.B(" + param0 + ')');
        }
    }

    public static void a() {
        field_f = null;
        field_i = null;
        field_K = null;
        field_D = null;
    }

    final static void a(int param0, String param1, int param2, byte param3, long param4) {
        try {
            hj.field_c = param4;
            nr.field_T = true;
            ie.field_e = param1;
            uh.field_x = param0;
            tq.field_t = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "uq.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + -76 + ',' + param4 + ')');
        }
    }

    uq() {
        ((uq) this).field_o = new int[16];
        ((uq) this).field_I = new int[256];
        ((uq) this).field_b = new int[6][258];
        ((uq) this).field_w = new int[257];
        ((uq) this).field_a = 0;
        ((uq) this).field_G = new byte[4096];
        ((uq) this).field_J = new byte[6][258];
        ((uq) this).field_k = new byte[256];
        ((uq) this).field_v = new int[6];
        ((uq) this).field_d = new int[6][258];
        ((uq) this).field_x = new boolean[16];
        ((uq) this).field_m = new boolean[256];
        ((uq) this).field_A = new byte[18002];
        ((uq) this).field_u = 0;
        ((uq) this).field_r = new byte[18002];
        ((uq) this).field_n = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_K = "Passwords must be between 5 and 20 characters long";
    }
}
