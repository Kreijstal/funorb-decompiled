/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ht {
    static String field_k;
    int field_o;
    int field_p;
    int field_q;
    static volatile int field_l;
    private int field_m;
    private int field_n;

    ek(fr param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param4 * (param2 * param3), false);
        ((ek) this).field_n = -1;
        ((ek) this).field_m = -1;
        try {
            ((ek) this).field_p = param2;
            ((ek) this).field_q = param3;
            ((ek) this).field_o = param4;
            ((ek) this).field_d.a(63, (ht) this);
            jaggl.OpenGL.glTexImage3Dub(((ek) this).field_c, 0, ((ek) this).field_a, ((ek) this).field_p, ((ek) this).field_q, ((ek) this).field_o, 0, be.a(false, ((ek) this).field_a), 5121, (byte[]) null, 0);
            ((ek) this).a(true, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d() {
        field_k = null;
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(((ek) this).field_n, ((ek) this).field_m, ((ek) this).field_c, 0, 0, 0);
        ((ek) this).field_n = -1;
        int var2 = -76 / ((44 - param0) / 58);
        ((ek) this).field_m = -1;
    }

    final static void a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              qf.field_a = qf.field_a + 1;
              if (tm.field_d != -1) {
                break L1;
              } else {
                if (dm.field_e != -1) {
                  break L1;
                } else {
                  dm.field_e = pi.field_e;
                  tm.field_d = ko.field_p;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  if (!param0.equals((Object) (Object) hp.field_l)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (hp.field_l != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!up.field_d) {
                  if (qf.field_a >= fn.field_s) {
                    if (fn.field_s + sb.field_c > qf.field_a) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param0 == null) {
                  qf.field_a = 0;
                  break L5;
                } else {
                  if (up.field_d) {
                    qf.field_a = fn.field_s;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      qf.field_a = 0;
                      break L5;
                    } else {
                      qf.field_a = fn.field_s;
                      break L5;
                    }
                  }
                }
              }
              za.field_k = dm.field_e;
              hq.field_b = tm.field_d;
              if (param0 != null) {
                up.field_d = false;
                break L2;
              } else {
                if (var2_int == 0) {
                  break L2;
                } else {
                  up.field_d = true;
                  break L2;
                }
              }
            }
            L6: {
              hp.field_l = param0;
              var2_int = 0;
              if (up.field_d) {
                break L6;
              } else {
                if (qf.field_a >= fn.field_s) {
                  break L6;
                } else {
                  if (sl.field_d) {
                    qf.field_a = 0;
                    za.field_k = dm.field_e;
                    hq.field_b = tm.field_d;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (!up.field_d) {
                break L7;
              } else {
                if (qf.field_a != fe.field_T) {
                  break L7;
                } else {
                  qf.field_a = 0;
                  up.field_d = false;
                  break L7;
                }
              }
            }
            dm.field_e = -1;
            tm.field_d = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("ek.B(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + -124 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ek) this).field_d.a(param1 ^ 36, (ht) this);
        jaggl.OpenGL.glCopyTexSubImage3D(((ek) this).field_c, 0, param0, param2, param3, param7, param6, param5, param4);
        jaggl.OpenGL.glFlush();
        if (param1 != 80) {
            ((ek) this).field_n = 57;
        }
    }

    ek(fr param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param3 * param2 * param4, false);
        ((ek) this).field_n = -1;
        ((ek) this).field_m = -1;
        try {
            ((ek) this).field_p = param2;
            ((ek) this).field_q = param3;
            ((ek) this).field_o = param4;
            ((ek) this).field_d.a(72, (ht) this);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(((ek) this).field_c, 0, ((ek) this).field_a, ((ek) this).field_p, ((ek) this).field_q, ((ek) this).field_o, 0, param6, 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((ek) this).a(true, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static void b() {
        int discarded$0 = 96;
        int discarded$1 = 100;
        mf var2 = mf.a(rc.field_l[0]);
        var2.c(-1);
        dj discarded$2 = qq.a(18416, var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
    }
}
