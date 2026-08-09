/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends da {
    static int field_m;
    private String field_l;
    static int[] field_q;
    private boolean field_p;
    static cr field_o;
    static String field_r;
    static int field_n;

    final ba a(int param0, String param1) {
        ch var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        ba stackIn_2_0 = null;
        ba stackIn_10_0 = null;
        ba stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            if (jc.a((byte) 82, var5)) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a(86, (String) null);
                  break L1;
                }
              }
              L2: {
                if (param1.equals(this.field_l)) {
                  break L2;
                } else {
                  L3: {
                    var3 = qe.a(param1, (byte) 54);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_j == null) {
                        this.field_p = var3.field_a;
                        this.field_l = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_10_0 = dj.field_c;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L4: {
                if (!this.field_p) {
                  stackIn_15_0 = ir.field_a;
                  break L4;
                } else {
                  stackIn_15_0 = qm.field_G;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = ir.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("hk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final static void a(int param0, byte param1, int param2) {
        mi var3;
        var3 = uh.field_Wb;
        var3.j(param0, param1 ^ 75);
        if (param1 != 60) {
          field_r = (String) null;
          var3.f(3, 91);
          var3.f(8, param1 + 41);
          var3.d(param2, param1 ^ -1739);
          return;
        } else {
          var3.f(3, 91);
          var3.f(8, param1 + 41);
          var3.d(param2, param1 ^ -1739);
          return;
        }
    }

    final String b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ch var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 3614) {
                break L1;
              } else {
                field_o = (cr) null;
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param1);
            var3 = gm.a((byte) 92, var5);
            if (var3 == null) {
              L2: {
                if (!param1.equals(this.field_l)) {
                  var4 = qe.a(param1, (byte) 61);
                  if (var4 != null) {
                    if (null == var4.field_j) {
                      this.field_p = var4.field_a;
                      this.field_l = param1;
                      break L2;
                    } else {
                      stackIn_11_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (this.field_p) {
                stackIn_17_0 = sf.field_c;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_15_0 = wa.field_g;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("hk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_11_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final void h(int param0) {
        this.field_l = null;
        if (param0 != -1) {
            java.awt.Component var3 = (java.awt.Component) null;
            hk.a(-74, (java.awt.Component) null);
        }
    }

    hk(kp param0) {
        super(param0);
        this.field_p = false;
    }

    final static int a(boolean param0) {
        if (!param0) {
            field_m = 2;
            return jp.field_o;
        }
        return jp.field_o;
    }

    public static void c(byte param0) {
        field_o = null;
        field_r = null;
        if (param0 >= -61) {
            hk.a(true);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            if (param0 != 3) {
                hk.g(98);
            }
            param1.addMouseListener(as.field_b);
            param1.addMouseMotionListener(as.field_b);
            param1.addFocusListener(as.field_b);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "hk.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void g(int param0) {
        CharSequence var2;
        CharSequence var3;
        if (param0 != 3) {
          field_m = -23;
          qe.field_V = id.field_f.f(param0 ^ 131);
          var2 = (CharSequence) ((Object) qe.field_V);
          Vertigo2.field_F = rc.a(var2, param0 + 317);
          return;
        } else {
          qe.field_V = id.field_f.f(param0 ^ 131);
          var3 = (CharSequence) ((Object) qe.field_V);
          Vertigo2.field_F = rc.a(var3, param0 + 317);
          return;
        }
    }

    static {
        field_n = -1;
        field_r = "Paint-off";
    }
}
