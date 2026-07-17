/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends ma implements ke {
    static vj field_Jb;
    static String field_Fb;
    static String field_Db;
    static java.awt.Frame field_Gb;
    private boolean field_Hb;
    static he[] field_Cb;
    private v field_Ib;
    private boolean field_Eb;

    public static void o(int param0) {
        field_Gb = null;
        field_Fb = null;
        field_Cb = null;
        field_Db = null;
        field_Jb = null;
    }

    qd(k param0, v param1) {
        super(param0, wi.field_e, mk.field_d, false, false);
        try {
            ((qd) this).field_Ib = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "qd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        Object var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 111) {
                break L1;
              } else {
                var4 = null;
                byte[] discarded$2 = qd.a((byte) 94, (byte[]) null);
                break L1;
              }
            }
            var2_int = param1.length;
            var3 = new byte[var2_int];
            kg.a(param1, 0, var3, 0, var2_int);
            stackOut_2_0 = (byte[]) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("qd.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final void p(int param0) {
        this.a((byte) -92, kj.a(param0, 4, ig.field_i), true);
    }

    private final void a(byte param0, og param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        dj var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              ((qd) this).field_Eb = true;
              if (param1.field_b) {
                var4_ref = oa.field_c;
                break L1;
              } else {
                if (null == param1.field_h) {
                  var4_ref = param1.field_g;
                  if (248 == param1.field_a) {
                    if (param2) {
                      ((qd) this).field_Hb = true;
                      var4_ref = ig.field_i;
                      break L1;
                    } else {
                      bg.a(false);
                      ((qd) this).field_Hb = true;
                      var4_ref = ig.field_i;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = q.field_g;
                  if (((qd) this).field_Ib == null) {
                    break L1;
                  } else {
                    ((qd) this).field_Ib.a((byte) -82);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == -92) {
                break L2;
              } else {
                boolean discarded$3 = ((qd) this).k(33);
                break L2;
              }
            }
            L3: {
              var5 = new dj((ma) this, wi.field_e, var4_ref);
              if (!param1.field_b) {
                L4: {
                  if (((qd) this).field_Hb) {
                    hf discarded$4 = var5.a(cd.field_a, false, (fd) this);
                    break L4;
                  } else {
                    if (5 == param1.field_a) {
                      var5.a(false, jf.field_fb, 11);
                      var5.a(false, qk.field_d, 17);
                      break L4;
                    } else {
                      var5.a(false, f.field_m, -1);
                      break L4;
                    }
                  }
                }
                if (param1.field_a == 3) {
                  var5.a(false, nl.field_o, 7);
                  break L3;
                } else {
                  if (param1.field_a == 6) {
                    var5.a(false, bb.field_d, 9);
                    break L3;
                  } else {
                    ((qd) this).a(33, (vg) (Object) var5);
                    return;
                  }
                }
              } else {
                if (!param1.field_d) {
                  hf discarded$5 = var5.a(cd.field_a, false, (fd) this);
                  break L3;
                } else {
                  ((qd) this).a(33, (vg) (Object) new ih((qd) this));
                  return;
                }
              }
            }
            ((qd) this).a(33, (vg) (Object) var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("qd.F(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        if (!(!((qd) this).field_Hb)) {
            q.a((byte) -115, false, true);
            return;
        }
        try {
            lk.b(1);
            ((qd) this).d(param2);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "qd.G(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final boolean k(int param0) {
        og var2 = null;
        if (((qd) this).field_Q) {
          if (!((qd) this).field_Eb) {
            var2 = qg.l(19860);
            if (var2 != null) {
              this.a((byte) -92, var2, false);
              if (param0 != 2968) {
                ((qd) this).field_Ib = null;
                return super.k(param0);
              } else {
                return super.k(param0);
              }
            } else {
              if (param0 != 2968) {
                ((qd) this).field_Ib = null;
                return super.k(param0);
              } else {
                return super.k(param0);
              }
            }
          } else {
            if (param0 != 2968) {
              ((qd) this).field_Ib = null;
              return super.k(param0);
            } else {
              return super.k(param0);
            }
          }
        } else {
          if (param0 != 2968) {
            ((qd) this).field_Ib = null;
            return super.k(param0);
          } else {
            return super.k(param0);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = "Waiting for music";
        field_Db = "Log in / Create account";
    }
}
