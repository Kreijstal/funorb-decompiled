/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              incrementValue$4 = param2;
              param2++;
              ww.a(param0, param5, rba.field_b[incrementValue$4], (byte) 75, param4);
              if (param1 >= 57) {
                break L1;
              } else {
                field_o = 108;
                break L1;
              }
            }
            incrementValue$5 = param3;
            param3--;
            ww.a(param0, param5, rba.field_b[incrementValue$5], (byte) 75, param4);
            var6_int = param2;
            L2: while (true) {
              if (var6_int > param3) {
                break L0;
              } else {
                var7 = rba.field_b[var6_int];
                var7[param5] = param0;
                var7[param4] = param0;
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var6), "nv.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0, dnb param1, int param2) {
        faa var4 = null;
        int var5 = 0;
        int discarded$0 = 0;
        try {
            int var3_int = -87 % ((4 - param0) / 54);
            var4 = dpa.field_p;
            var4.h(24335, param2);
            var4.field_e = var4.field_e + 1;
            var5 = var4.field_e;
            var4.c(0, 1);
            if (null != param1.field_e) {
                var4.c(0, param1.field_e.length);
                var4.a(0, param1.field_e, -1, param1.field_e.length);
            } else {
                var4.c(0, 0);
            }
            discarded$0 = var4.g(1595, var5);
            var4.field_e = var4.field_e - 4;
            param1.field_d = var4.h(35);
            var4.e(var4.field_e - var5, -129);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "nv.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.e((byte) 116);
        super.finalize();
    }

    final void e(byte param0) {
        if (-1 > (this.field_l ^ -1)) {
            this.field_t.a(this.field_m, this.field_l, (byte) 77);
            this.field_l = 0;
            if (param0 >= 106) {
                return;
            }
            this.field_t = (qfa) null;
            return;
        }
        if (param0 < 106) {
            this.field_t = (qfa) null;
            return;
        }
    }

    public final void a(int param0) {
        if (param0 != 31294) {
            this.field_k = -106;
            jaggl.OpenGL.glFramebufferRenderbufferEXT(this.field_q, this.field_s, 36161, 0);
            this.field_q = -1;
            this.field_s = -1;
            return;
        }
        jaggl.OpenGL.glFramebufferRenderbufferEXT(this.field_q, this.field_s, 36161, 0);
        this.field_q = -1;
        this.field_s = -1;
    }

    final void a(int param0, int param1, int param2) {
        jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, this.field_l);
        this.field_s = param1;
        if (param0 != 1) {
            this.field_u = -15;
            this.field_q = param2;
            return;
        }
        this.field_q = param2;
    }

    final static String a(int param0, int param1, boolean param2) {
        int var3 = 0;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_29_0 = null;
        String stackOut_28_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        if (4 > param0) {
          if (param1 >= 0) {
            if (param1 < unb.field_p) {
              var3 = param0;
              if (-1 == (var3 ^ -1)) {
                L0: {
                  if (-1 != (param1 ^ -1)) {
                    stackOut_21_0 = fcb.field_g;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_20_0 = cta.field_r;
                    stackIn_22_0 = stackOut_20_0;
                    break L0;
                  }
                }
                return stackIn_22_0;
              } else {
                if (-2 == (var3 ^ -1)) {
                  L1: {
                    if (param1 != 0) {
                      stackOut_25_0 = csa.field_a;
                      stackIn_26_0 = stackOut_25_0;
                      break L1;
                    } else {
                      stackOut_24_0 = fdb.field_T;
                      stackIn_26_0 = stackOut_24_0;
                      break L1;
                    }
                  }
                  return stackIn_26_0;
                } else {
                  if (2 == var3) {
                    L2: {
                      if (param1 != 0) {
                        stackOut_29_0 = pbb.field_a;
                        stackIn_30_0 = stackOut_29_0;
                        break L2;
                      } else {
                        stackOut_28_0 = jlb.field_t;
                        stackIn_30_0 = stackOut_28_0;
                        break L2;
                      }
                    }
                    return stackIn_30_0;
                  } else {
                    if (var3 == 3) {
                      L3: {
                        if (0 == param1) {
                          stackOut_33_0 = ipa.field_q;
                          stackIn_34_0 = stackOut_33_0;
                          break L3;
                        } else {
                          stackOut_32_0 = vm.field_q;
                          stackIn_34_0 = stackOut_32_0;
                          break L3;
                        }
                      }
                      return stackIn_34_0;
                    } else {
                      if (param2) {
                        return aqa.field_a[param0];
                      } else {
                        return (String) null;
                      }
                    }
                  }
                }
              }
            } else {
              if (param2) {
                return aqa.field_a[param0];
              } else {
                return (String) null;
              }
            }
          } else {
            if (param2) {
              return aqa.field_a[param0];
            } else {
              return (String) null;
            }
          }
        } else {
          if (param2) {
            return aqa.field_a[param0];
          } else {
            return (String) null;
          }
        }
    }

    nv(qfa param0, int param1, int param2, int param3) {
        this.field_s = -1;
        this.field_q = -1;
        try {
            this.field_t = param0;
            this.field_k = param1;
            this.field_u = param3;
            this.field_w = param2;
            jaggl.OpenGL.glGenRenderbuffersEXT(1, job.field_p, 0);
            this.field_l = job.field_p[0];
            jaggl.OpenGL.glBindRenderbufferEXT(36161, this.field_l);
            jaggl.OpenGL.glRenderbufferStorageEXT(36161, this.field_k, this.field_w, this.field_u);
            this.field_m = this.field_u * this.field_w * this.field_t.e(this.field_k, 2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "nv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    nv(qfa param0, int param1, int param2, int param3, int param4) {
        this.field_s = -1;
        this.field_q = -1;
        try {
            this.field_k = param1;
            this.field_t = param0;
            this.field_u = param3;
            this.field_w = param2;
            jaggl.OpenGL.glGenRenderbuffersEXT(1, job.field_p, 0);
            this.field_l = job.field_p[0];
            jaggl.OpenGL.glBindRenderbufferEXT(36161, this.field_l);
            jaggl.OpenGL.glRenderbufferStorageMultisampleEXT(36161, param4, this.field_k, this.field_w, this.field_u);
            this.field_m = this.field_w * (this.field_u * this.field_t.e(this.field_k, 2));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "nv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_v = 360;
        field_n = false;
        field_o = 4;
        field_p = "Use this alternative as your account name";
    }
}
