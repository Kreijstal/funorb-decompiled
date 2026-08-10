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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        bm var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            this.field_wb = true;
            if (param0 == 58) {
              L1: {
                if (param1.field_k) {
                  var4 = lc.field_q;
                  break L1;
                } else {
                  if (param1.field_j == null) {
                    var4 = param1.field_b;
                    if (-249 == (param1.field_f ^ -1)) {
                      if (param2) {
                        this.field_vb = true;
                        var4 = al.field_a;
                        break L1;
                      } else {
                        ii.b(116);
                        this.field_vb = true;
                        var4 = al.field_a;
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    var4 = de.field_o;
                    if (null == this.field_ub) {
                      break L1;
                    } else {
                      this.field_ub.a(-72);
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5 = new bm((bd) (this), rg.field_o, var4);
                if (!param1.field_k) {
                  L3: {
                    if (!this.field_vb) {
                      if (param1.field_f != 5) {
                        var5.a(mi.field_k, param0 + -23551, -1);
                        break L3;
                      } else {
                        var5.a(ld.field_c, -23493, 11);
                        var5.a(vk.field_K, -23493, 17);
                        break L3;
                      }
                    } else {
                      var5.a((kd) (this), true, ee.field_k);
                      break L3;
                    }
                  }
                  if (param1.field_f == 3) {
                    var5.a(bm.field_N, -23493, 7);
                    break L2;
                  } else {
                    if ((param1.field_f ^ -1) != -7) {
                      break L2;
                    } else {
                      var5.a(cb.field_s, param0 ^ -23551, 9);
                      break L2;
                    }
                  }
                } else {
                  if (param1.field_g) {
                    this.d(new og((ua) (this)), 26034);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5.a((kd) (this), true, ee.field_k);
                    break L2;
                  }
                }
              }
              this.d(var5, param0 + 25976);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var4_ref);

            stackIn_33_1 = new StringBuilder().append("ua.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L4;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void h(byte param0) {
        if (param0 >= -3) {
            return;
        }
        this.a((byte) 58, af.a((byte) 36, 248, al.field_a), true);
    }

    final boolean a(int param0) {
        int var2;
        mk var3;
        var2 = -66 / ((38 - param0) / 49);
        if (this.field_G) {
          if (!this.field_wb) {
            var3 = bg.a((byte) 56);
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
        if (!(!this.field_vb)) {
            wa.a(false, true, param3 + -370);
            return;
        }
        try {
            ih.l(255);
            this.n(param3 ^ -22669);
            if (param3 != 248) {
                field_xb = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ua.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    ua(f param0, ca param1) {
        super(param0, rg.field_o, pb.field_b, false, false);
        try {
            this.field_ub = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_xb = "</shad>";
    }
}
