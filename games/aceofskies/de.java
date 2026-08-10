/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de implements ir {
    private hc field_c;
    private int field_d;
    private int field_e;
    private int field_a;
    private int field_g;
    private int field_b;
    private int field_f;
    private int field_h;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        cn var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        try {
            var14 = !(param3 instanceof cn) ? null : (cn) ((Object) param3);
            vp.b(param3.field_p + param2, param4 - -param3.field_h, param3.field_q, param3.field_n, this.field_b);
            if (var14 != null) {
            }
            var7 = param2 + (param3.field_p + var14.field_C);
            var8 = param4 + param3.field_h - -var14.field_x;
            vp.g(var7, var8, var14.field_A, this.field_g);
            if (!((var14.field_B ^ -1) == 0)) {
                var9 = 3.141592653589793 * (double)var14.field_B * 2.0 / (double)var14.field_w;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_A);
                var12 = (int)(Math.cos(var9) * (double)var14.field_A);
                vp.g(var7 - -var11, var8 + var12, 1, this.field_f);
            }
            vp.g(var7, var8, 2, 1);
            var9 = 2.0 * ((double)var14.field_y * 3.141592653589793) / (double)var14.field_w;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_A);
            var12 = (int)(Math.cos(var9) * (double)var14.field_A);
            vp.f(var7, var8, var7 - -var11, var12 + var8, 1);
            if (param1 != -7592) {
                this.field_e = 72;
            }
            if (this.field_c != null) {
                var13 = var14.field_C + var14.field_A + this.field_d;
                this.field_c.a(param3.field_f, param2 - -param3.field_p - -var13, param3.field_h + param4 + this.field_h, param3.field_q - var13 - this.field_d, -(this.field_d << 2002516769) + param3.field_n, this.field_a, this.field_e, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "de.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0.addMouseListener(ho.field_b);
            param0.addMouseMotionListener(ho.field_b);
            param0.addFocusListener(ho.field_b);
            if (!param1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("de.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 92) {
              vn.field_f.a(pd.field_b, true, qe.field_k, true);
              vn.field_f.f((byte) -117);
              L1: while (true) {
                if (!ek.a((byte) -127)) {
                  if (-1 == dh.field_c) {
                    if (ss.field_t) {
                      stackIn_13_0 = 3;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (jq.field_fb == nb.field_c) {
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (gm.field_x.a(false)) {
                          if (jq.field_fb != ht.field_k) {
                            stackIn_25_0 = -1;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackIn_23_0 = 2;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var1_int = dh.field_c;
                    oi.a(-1, param0 + 20573);
                    stackIn_9_0 = var1_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  vn.field_f.a(param0 + -42, fr.field_e, bk.field_f);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -79;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "de.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    return stackIn_25_0;
                  }
                }
              }
            }
          }
        }
    }

    de(hc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_h = param2;
            this.field_b = param7;
            this.field_c = param0;
            this.field_e = param4;
            this.field_g = param5;
            this.field_a = param3;
            this.field_f = param6;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "de.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
    }
}
