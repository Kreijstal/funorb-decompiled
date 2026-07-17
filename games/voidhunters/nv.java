/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nv extends fh implements mda {
    private qfa field_t;
    private int field_l;
    private int field_q;
    static int field_o;
    static int field_v;
    static boolean field_n;
    private int field_s;
    static String field_r;
    int field_w;
    static String field_p;
    int field_m;
    int field_u;
    private int field_k;

    public static void e(int param0) {
        field_p = null;
        field_r = null;
        if (param0 < 30) {
            nv.e(-90);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            int incrementValue$4 = param2;
            param2++;
            ww.a(param0, param5, rba.field_b[incrementValue$4], (byte) 75, param4);
            int incrementValue$5 = param3;
            param3--;
            ww.a(param0, param5, rba.field_b[incrementValue$5], (byte) 75, param4);
            var6_int = param2;
            L1: while (true) {
              if (var6_int > param3) {
                break L0;
              } else {
                var7 = rba.field_b[var6_int];
                var7[param5] = param0;
                var7[param4] = param0;
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var6, "nv.G(" + param0 + 44 + 102 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(byte param0, dnb param1) {
        faa var4 = null;
        int var5 = 0;
        try {
            int var3_int = -87 % ((4 - param0) / 54);
            var4 = dpa.field_p;
            var4.h(24335, 6);
            var4.field_e = var4.field_e + 1;
            var5 = var4.field_e;
            var4.c(0, 1);
            if (null != param1.field_e) {
                var4.c(0, param1.field_e.length);
                var4.a(0, param1.field_e, -1, param1.field_e.length);
            } else {
                var4.c(0, 0);
            }
            int discarded$0 = var4.g(1595, var5);
            var4.field_e = var4.field_e - 4;
            param1.field_d = var4.h(35);
            var4.e(var4.field_e - var5, -129);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nv.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 6 + 41);
        }
    }

    protected final void finalize() throws Throwable {
        ((nv) this).e((byte) 116);
        super.finalize();
    }

    final void e(byte param0) {
        if (((nv) this).field_l > 0) {
            ((nv) this).field_t.a(((nv) this).field_m, ((nv) this).field_l, (byte) 77);
            ((nv) this).field_l = 0;
        }
        if (param0 < 106) {
            ((nv) this).field_t = null;
        }
    }

    public final void a(int param0) {
        if (param0 != 31294) {
            ((nv) this).field_k = -106;
        }
        jaggl.OpenGL.glFramebufferRenderbufferEXT(((nv) this).field_q, ((nv) this).field_s, 36161, 0);
        ((nv) this).field_q = -1;
        ((nv) this).field_s = -1;
    }

    final void a(int param0, int param1, int param2) {
        jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, ((nv) this).field_l);
        ((nv) this).field_s = param1;
        if (param0 != 1) {
            ((nv) this).field_u = -15;
        }
        ((nv) this).field_q = param2;
    }

    final static String a(int param0, int param1) {
        int var3 = 0;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
        String stackOut_14_0 = null;
        String stackOut_13_0 = null;
        String stackOut_18_0 = null;
        String stackOut_17_0 = null;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        L0: {
          if (4 <= param0) {
            break L0;
          } else {
            if (param1 < 0) {
              break L0;
            } else {
              if (param1 >= unb.field_p) {
                break L0;
              } else {
                var3 = param0;
                if (var3 == 0) {
                  L1: {
                    if (param1 != 0) {
                      stackOut_10_0 = fcb.field_g;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = cta.field_r;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  return stackIn_11_0;
                } else {
                  if (var3 == 1) {
                    L2: {
                      if (param1 != 0) {
                        stackOut_14_0 = csa.field_a;
                        stackIn_15_0 = stackOut_14_0;
                        break L2;
                      } else {
                        stackOut_13_0 = fdb.field_T;
                        stackIn_15_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                    return stackIn_15_0;
                  } else {
                    if (2 == var3) {
                      L3: {
                        if (param1 != 0) {
                          stackOut_18_0 = pbb.field_a;
                          stackIn_19_0 = stackOut_18_0;
                          break L3;
                        } else {
                          stackOut_17_0 = jlb.field_t;
                          stackIn_19_0 = stackOut_17_0;
                          break L3;
                        }
                      }
                      return stackIn_19_0;
                    } else {
                      if (var3 != 3) {
                        break L0;
                      } else {
                        L4: {
                          if (0 == param1) {
                            stackOut_22_0 = ipa.field_q;
                            stackIn_23_0 = stackOut_22_0;
                            break L4;
                          } else {
                            stackOut_21_0 = vm.field_q;
                            stackIn_23_0 = stackOut_21_0;
                            break L4;
                          }
                        }
                        return stackIn_23_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return aqa.field_a[param0];
    }

    nv(qfa param0, int param1, int param2, int param3) {
        ((nv) this).field_s = -1;
        ((nv) this).field_q = -1;
        try {
            ((nv) this).field_t = param0;
            ((nv) this).field_k = param1;
            ((nv) this).field_u = param3;
            ((nv) this).field_w = param2;
            jaggl.OpenGL.glGenRenderbuffersEXT(1, job.field_p, 0);
            ((nv) this).field_l = job.field_p[0];
            jaggl.OpenGL.glBindRenderbufferEXT(36161, ((nv) this).field_l);
            jaggl.OpenGL.glRenderbufferStorageEXT(36161, ((nv) this).field_k, ((nv) this).field_w, ((nv) this).field_u);
            ((nv) this).field_m = ((nv) this).field_u * ((nv) this).field_w * ((nv) this).field_t.e(((nv) this).field_k, 2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nv.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    nv(qfa param0, int param1, int param2, int param3, int param4) {
        ((nv) this).field_s = -1;
        ((nv) this).field_q = -1;
        try {
            ((nv) this).field_k = param1;
            ((nv) this).field_t = param0;
            ((nv) this).field_u = param3;
            ((nv) this).field_w = param2;
            jaggl.OpenGL.glGenRenderbuffersEXT(1, job.field_p, 0);
            ((nv) this).field_l = job.field_p[0];
            jaggl.OpenGL.glBindRenderbufferEXT(36161, ((nv) this).field_l);
            jaggl.OpenGL.glRenderbufferStorageMultisampleEXT(36161, param4, ((nv) this).field_k, ((nv) this).field_w, ((nv) this).field_u);
            ((nv) this).field_m = ((nv) this).field_w * (((nv) this).field_u * ((nv) this).field_t.e(((nv) this).field_k, 2));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nv.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 360;
        field_n = false;
        field_o = 4;
        field_p = "Use this alternative as your account name";
    }
}
