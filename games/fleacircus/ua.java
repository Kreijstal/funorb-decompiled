/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends bd implements da {
    static dd[] field_tb;
    static String field_xb;
    static long field_sb;
    private boolean field_wb;
    private ca field_ub;
    private boolean field_vb;

    public static void i(byte param0) {
        if (param0 <= 119) {
            ua.i((byte) -36);
            field_xb = null;
            field_tb = null;
            return;
        }
        field_xb = null;
        field_tb = null;
    }

    private final void a(byte param0, mk param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        bm var5 = null;
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
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            ((ua) this).field_wb = true;
            L1: {
              if (param1.field_k) {
                var4_ref = lc.field_q;
                break L1;
              } else {
                if (param1.field_j == null) {
                  var4_ref = param1.field_b;
                  if (param1.field_f == 248) {
                    if (param2) {
                      ((ua) this).field_vb = true;
                      var4_ref = al.field_a;
                      break L1;
                    } else {
                      int discarded$3 = 116;
                      ii.b();
                      ((ua) this).field_vb = true;
                      var4_ref = al.field_a;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = de.field_o;
                  if (null == ((ua) this).field_ub) {
                    break L1;
                  } else {
                    ((ua) this).field_ub.a(-72);
                    break L1;
                  }
                }
              }
            }
            L2: {
              var5 = new bm((bd) this, rg.field_o, var4_ref);
              if (!param1.field_k) {
                L3: {
                  if (!((ua) this).field_vb) {
                    if (param1.field_f != 5) {
                      var5.a(mi.field_k, -23493, -1);
                      break L3;
                    } else {
                      var5.a(ld.field_c, -23493, 11);
                      var5.a(vk.field_K, -23493, 17);
                      break L3;
                    }
                  } else {
                    bb discarded$4 = var5.a((kd) this, true, ee.field_k);
                    break L3;
                  }
                }
                if (param1.field_f == 3) {
                  var5.a(bm.field_N, -23493, 7);
                  break L2;
                } else {
                  if (param1.field_f != 6) {
                    break L2;
                  } else {
                    var5.a(cb.field_s, -23493, 9);
                    break L2;
                  }
                }
              } else {
                if (param1.field_g) {
                  ((ua) this).d((qa) (Object) new og((ua) this), 26034);
                  return;
                } else {
                  bb discarded$5 = var5.a((kd) this, true, ee.field_k);
                  break L2;
                }
              }
            }
            ((ua) this).d((qa) (Object) var5, 26034);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("ua.BA(").append(58).append(44);
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
              break L4;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
    }

    final void h(byte param0) {
        if (param0 >= -3) {
            return;
        }
        this.a((byte) 58, af.a((byte) 36, 248, al.field_a), true);
    }

    final boolean a(int param0) {
        int var2 = 0;
        mk var3 = null;
        var2 = -66 / ((38 - param0) / 49);
        if (((ua) this).field_G) {
          if (!((ua) this).field_wb) {
            int discarded$2 = 56;
            var3 = bg.a();
            if (var3 != null) {
              this.a((byte) 58, var3, false);
              return super.a(100);
            } else {
              return super.a(100);
            }
          } else {
            return super.a(100);
          }
        } else {
          return super.a(100);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((ua) this).field_vb) {
              wa.a(false, true, param3 + -370);
              return;
            } else {
              L1: {
                int discarded$3 = 255;
                ih.l();
                ((ua) this).n(param3 ^ -22669);
                if (param3 == 248) {
                  break L1;
                } else {
                  field_xb = null;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("ua.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    ua(f param0, ca param1) {
        super(param0, rg.field_o, pb.field_b, false, false);
        try {
            ((ua) this).field_ub = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ua.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_xb = "</shad>";
    }
}
