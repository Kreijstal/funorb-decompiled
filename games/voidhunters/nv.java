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
        try {
            field_p = null;
            field_r = null;
            if (param0 < 30) {
                nv.e(-90);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nv.E(" + param0 + ')');
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
            L1: {
              int incrementValue$4 = param2;
              param2++;
              ww.a(param0, param5, rba.field_b[incrementValue$4], (byte) 75, param4);
              if (param1 >= 57) {
                break L1;
              } else {
                field_o = 108;
                break L1;
              }
            }
            int incrementValue$5 = param3;
            param3--;
            ww.a(param0, param5, rba.field_b[incrementValue$5], (byte) 75, param4);
            var6_int = param2;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6_int > param3) {
                    break L4;
                  } else {
                    var7 = rba.field_b[var6_int];
                    var7[param5] = param0;
                    var7[param4] = param0;
                    var6_int++;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var6, "nv.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0, dnb param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        faa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -87 % ((4 - param0) / 54);
                var4 = dpa.field_p;
                var4.h(24335, param2);
                var4.field_e = var4.field_e + 1;
                var5 = var4.field_e;
                var4.c(0, 1);
                if (null == param1.field_e) {
                  break L2;
                } else {
                  var4.c(0, param1.field_e.length);
                  var4.a(0, param1.field_e, -1, param1.field_e.length);
                  if (VoidHunters.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4.c(0, 0);
              break L1;
            }
            int discarded$3 = var4.g(1595, var5);
            var4.field_e = var4.field_e - 4;
            param1.field_d = var4.h(35);
            var4.e(var4.field_e - var5, -129);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("nv.F(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        try {
            ((nv) this).e((byte) 116);
            super.finalize();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nv.finalize()");
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((nv) this).field_l <= 0) {
                break L1;
              } else {
                ((nv) this).field_t.a(((nv) this).field_m, ((nv) this).field_l, (byte) 77);
                ((nv) this).field_l = 0;
                break L1;
              }
            }
            L2: {
              if (param0 >= 106) {
                break L2;
              } else {
                ((nv) this).field_t = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "nv.D(" + param0 + ')');
        }
    }

    public final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 31294) {
                break L1;
              } else {
                ((nv) this).field_k = -106;
                break L1;
              }
            }
            jaggl.OpenGL.glFramebufferRenderbufferEXT(((nv) this).field_q, ((nv) this).field_s, 36161, 0);
            ((nv) this).field_q = -1;
            ((nv) this).field_s = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "nv.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, ((nv) this).field_l);
              ((nv) this).field_s = param1;
              if (param0 == 1) {
                break L1;
              } else {
                ((nv) this).field_u = -15;
                break L1;
              }
            }
            ((nv) this).field_q = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "nv.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_26_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        String stackIn_41_0 = null;
        Object stackIn_44_0 = null;
        String stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_30_0 = null;
        String stackOut_28_0 = null;
        String stackOut_35_0 = null;
        String stackOut_33_0 = null;
        String stackOut_40_0 = null;
        String stackOut_38_0 = null;
        String stackOut_25_0 = null;
        String stackOut_23_0 = null;
        String stackOut_45_0 = null;
        Object stackOut_43_0 = null;
        try {
          L0: {
            L1: {
              if (4 <= param0) {
                break L1;
              } else {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param1 >= unb.field_p) {
                    break L1;
                  } else {
                    L2: {
                      var3_int = param0;
                      if (var3_int == 0) {
                        break L2;
                      } else {
                        if (var3_int == 1) {
                          L3: {
                            if (param1 != 0) {
                              stackOut_30_0 = csa.field_a;
                              stackIn_31_0 = stackOut_30_0;
                              break L3;
                            } else {
                              stackOut_28_0 = fdb.field_T;
                              stackIn_31_0 = stackOut_28_0;
                              break L3;
                            }
                          }
                          return stackIn_31_0;
                        } else {
                          if (2 == var3_int) {
                            L4: {
                              if (param1 != 0) {
                                stackOut_35_0 = pbb.field_a;
                                stackIn_36_0 = stackOut_35_0;
                                break L4;
                              } else {
                                stackOut_33_0 = jlb.field_t;
                                stackIn_36_0 = stackOut_33_0;
                                break L4;
                              }
                            }
                            return stackIn_36_0;
                          } else {
                            if (var3_int != 3) {
                              break L1;
                            } else {
                              if (VoidHunters.field_G == 0) {
                                L5: {
                                  if (0 == param1) {
                                    stackOut_40_0 = ipa.field_q;
                                    stackIn_41_0 = stackOut_40_0;
                                    break L5;
                                  } else {
                                    stackOut_38_0 = vm.field_q;
                                    stackIn_41_0 = stackOut_38_0;
                                    break L5;
                                  }
                                }
                                return stackIn_41_0;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    L6: {
                      if (param1 != 0) {
                        stackOut_25_0 = fcb.field_g;
                        stackIn_26_0 = stackOut_25_0;
                        break L6;
                      } else {
                        stackOut_23_0 = cta.field_r;
                        stackIn_26_0 = stackOut_23_0;
                        break L6;
                      }
                    }
                    return stackIn_26_0;
                  }
                }
              }
            }
            if (param2) {
              stackOut_45_0 = aqa.field_a[param0];
              stackIn_46_0 = stackOut_45_0;
              break L0;
            } else {
              stackOut_43_0 = null;
              stackIn_44_0 = stackOut_43_0;
              return (String) (Object) stackIn_44_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "nv.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_46_0;
    }

    nv(qfa param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((nv) this).field_s = -1;
        ((nv) this).field_q = -1;
        try {
          L0: {
            ((nv) this).field_t = param0;
            ((nv) this).field_k = param1;
            ((nv) this).field_u = param3;
            ((nv) this).field_w = param2;
            jaggl.OpenGL.glGenRenderbuffersEXT(1, job.field_p, 0);
            ((nv) this).field_l = job.field_p[0];
            jaggl.OpenGL.glBindRenderbufferEXT(36161, ((nv) this).field_l);
            jaggl.OpenGL.glRenderbufferStorageEXT(36161, ((nv) this).field_k, ((nv) this).field_w, ((nv) this).field_u);
            ((nv) this).field_m = ((nv) this).field_u * ((nv) this).field_w * ((nv) this).field_t.e(((nv) this).field_k, 2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nv.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    nv(qfa param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((nv) this).field_s = -1;
        ((nv) this).field_q = -1;
        try {
          L0: {
            ((nv) this).field_k = param1;
            ((nv) this).field_t = param0;
            ((nv) this).field_u = param3;
            ((nv) this).field_w = param2;
            jaggl.OpenGL.glGenRenderbuffersEXT(1, job.field_p, 0);
            ((nv) this).field_l = job.field_p[0];
            jaggl.OpenGL.glBindRenderbufferEXT(36161, ((nv) this).field_l);
            jaggl.OpenGL.glRenderbufferStorageMultisampleEXT(36161, param4, ((nv) this).field_k, ((nv) this).field_w, ((nv) this).field_u);
            ((nv) this).field_m = ((nv) this).field_w * (((nv) this).field_u * ((nv) this).field_t.e(((nv) this).field_k, 2));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nv.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
