/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends pm {
    private boolean field_h;
    static String field_f;
    private String field_i;
    static float field_j;
    static vn field_g;

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 != -160793343) {
          return;
        } else {
          var1 = rf.a(false);
          var2 = co.b(param0 + 160780300);
          cj.field_i.a(var1 + (af.field_b << -160793343), wm.field_d + -ia.field_c, wh.field_c + -af.field_b, (byte) -80, var2 - -(ia.field_c << 304908225));
          d.a(false);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        am var4 = null;
        int var5 = 0;
        if (po.w(13296)) {
          return;
        } else {
          var4 = dp.field_e;
          var4.j(11, param1);
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.i(0, 97);
          var4.a(param3, (byte) 105);
          var4.i(param2, 82);
          var4.a(param0, (byte) 105);
          var4.d(60, var4.field_j - var5);
          return;
        }
    }

    final rh a(String param0, int param1) {
        eo var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rh stackIn_2_0 = null;
        rh stackIn_9_0 = null;
        rh stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_8_0 = null;
        rh stackOut_15_0 = null;
        rh stackOut_14_0 = null;
        rh stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (ea.a(20000000, var4)) {
              L1: {
                if (!param0.equals(this.field_i)) {
                  L2: {
                    var3 = tm.a((byte) 51, param0);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null != var3.field_e) {
                        break L2;
                      } else {
                        this.field_i = param0;
                        this.field_h = var3.field_b;
                        break L1;
                      }
                    }
                  }
                  stackOut_8_0 = gj.field_v;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
              L3: {
                if (param1 == 2) {
                  break L3;
                } else {
                  field_g = (vn) null;
                  break L3;
                }
              }
              L4: {
                if (this.field_h) {
                  stackOut_15_0 = mc.field_g;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = uc.field_b;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = uc.field_b;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("ql.I(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    public static void b(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
            field_f = (String) null;
        }
    }

    ql(tb param0) {
        super(param0);
        this.field_h = false;
    }

    final void e(int param0) {
        if (param0 != -28769) {
            field_j = 0.772375226020813f;
            this.field_i = null;
            return;
        }
        this.field_i = null;
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        eo var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -94) {
                break L1;
              } else {
                field_g = (vn) null;
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param0);
            var3 = ed.a(var5, (byte) -105);
            if (var3 == null) {
              L2: {
                if (!param0.equals(this.field_i)) {
                  var4 = tm.a((byte) 51, param0);
                  if (var4 != null) {
                    if (null == var4.field_e) {
                      this.field_h = var4.field_b;
                      this.field_i = param0;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (this.field_h) {
                stackOut_16_0 = kf.field_X;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_14_0 = ma.field_i;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = (String) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("ql.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
        field_f = "Loading...";
        field_j = -1.0f;
    }
}
