/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends si implements n {
    static int field_wb;
    private boolean field_xb;
    static String field_ub;
    private boolean field_vb;
    static int field_sb;
    private pl field_tb;

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 9) {
                break L1;
              } else {
                var3 = null;
                String discarded$4 = tj.a((CharSequence) null, 66);
                break L1;
              }
            }
            L2: {
              int discarded$5 = -12382;
              var2 = hi.a(qd.a(-113, param0));
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackOut_4_0 = (String) var2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("tj.R(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0;
    }

    tj(d param0, pl param1) {
        super(param0, be.field_x, mm.field_d, false, false);
        try {
            ((tj) this).field_tb = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "tj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void p() {
        field_ub = null;
    }

    final void q(int param0) {
        Object var3 = null;
        if (param0 < 66) {
          var3 = null;
          String discarded$2 = tj.a((CharSequence) null, -117);
          this.a(aj.a(248, (byte) -47, ib.field_ab), (byte) -110, true);
          return;
        } else {
          this.a(aj.a(248, (byte) -47, ib.field_ab), (byte) -110, true);
          return;
        }
    }

    private final void a(pd param0, byte param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        oi var5 = null;
        int var6 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              ((tj) this).field_vb = true;
              if (param0.field_i) {
                var4_ref = sh.field_q;
                break L1;
              } else {
                if (null == param0.field_d) {
                  var4_ref = param0.field_b;
                  if (248 == param0.field_c) {
                    if (param2) {
                      var4_ref = ib.field_ab;
                      ((tj) this).field_xb = true;
                      break L1;
                    } else {
                      dm.a((byte) -119);
                      var4_ref = ib.field_ab;
                      ((tj) this).field_xb = true;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = mg.field_m;
                  if (null == ((tj) this).field_tb) {
                    break L1;
                  } else {
                    ((tj) this).field_tb.a(50);
                    break L1;
                  }
                }
              }
            }
            L2: {
              var5 = new oi((si) this, be.field_x, var4_ref);
              if (param0.field_i) {
                if (!param0.field_a) {
                  eb discarded$2 = var5.a((byte) 23, (sc) this, rj.field_e);
                  break L2;
                } else {
                  ((tj) this).a((gl) (Object) new cl((tj) this), -86);
                  return;
                }
              } else {
                L3: {
                  if (!((tj) this).field_xb) {
                    if (param0.field_c == 5) {
                      var5.a(11, hf.field_u, (byte) -65);
                      var5.a(17, ed.field_c, (byte) 54);
                      break L3;
                    } else {
                      var5.a(-1, gd.field_b, (byte) -120);
                      break L3;
                    }
                  } else {
                    eb discarded$3 = var5.a((byte) 23, (sc) this, rj.field_e);
                    break L3;
                  }
                }
                if (3 == param0.field_c) {
                  var5.a(7, mi.field_i, (byte) 118);
                  break L2;
                } else {
                  if (param0.field_c != 6) {
                    break L2;
                  } else {
                    var5.a(9, fc.field_b, (byte) -117);
                    break L2;
                  }
                }
              }
            }
            ((tj) this).a((gl) (Object) var5, -31);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("tj.S(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L4;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + -110 + 44 + param2 + 41);
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        if (!(!((tj) this).field_xb)) {
            qc.a(false, true, 123);
            return;
        }
        try {
            jh.c((byte) 30);
            ((tj) this).h((byte) -126);
            int var6_int = 75 / ((-5 - param4) / 57);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "tj.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean f(byte param0) {
        pd var2 = null;
        L0: {
          if (!((tj) this).field_J) {
            break L0;
          } else {
            if (!((tj) this).field_vb) {
              var2 = pd.a(-352);
              if (var2 != null) {
                this.a(var2, (byte) -110, false);
                break L0;
              } else {
                if (param0 == -121) {
                  return super.f((byte) -121);
                } else {
                  field_sb = 5;
                  return super.f((byte) -121);
                }
              }
            } else {
              if (param0 == -121) {
                return super.f((byte) -121);
              } else {
                field_sb = 5;
                return super.f((byte) -121);
              }
            }
          }
        }
        if (param0 != -121) {
          field_sb = 5;
          return super.f((byte) -121);
        } else {
          return super.f((byte) -121);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = 128;
        field_ub = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
