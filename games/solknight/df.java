/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends a {
    private String field_j;
    private boolean field_k;

    final static void a(int param0, boolean param1) {
        we.field_h = 0;
        ua.field_L = 0;
        wd.field_a = 0;
        ti.field_e = uc.field_e;
        qh.field_b = new sf(2);
        qh.field_b.a(param1, -1, ad.a(ad.field_m, gb.field_j, param0), param0 + 121);
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wg var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
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
              if (!param1) {
                break L1;
              } else {
                var5 = (String) null;
                this.a((String) null, true);
                break L1;
              }
            }
            var6 = (CharSequence) ((Object) param0);
            var3 = sj.a(var6, 0);
            if (var3 != null) {
              stackIn_5_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0.equals(this.field_j)) {
                  break L2;
                } else {
                  var4 = gb.a(param0, (byte) 122);
                  if (var4 != null) {
                    if (null == var4.field_d) {
                      this.field_k = var4.field_c;
                      this.field_j = param0;
                      break L2;
                    } else {
                      stackIn_11_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_k) {
                stackIn_17_0 = hj.field_o;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_15_0 = pc.field_d;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("df.K(");

            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
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

    final void a(boolean param0) {
        this.field_j = null;
        if (!param0) {
            String var3 = (String) null;
            this.a((String) null, true);
        }
    }

    final static void h(int param0) {
        kd.field_c = -1;
        s.field_ib = null;
        bf.field_a = param0;
        kk.field_d = 0;
        ab.field_u = false;
    }

    final qf a(String param0, byte param1) {
        wg var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        qf stackIn_2_0 = null;
        qf stackIn_8_0 = null;
        qf stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            if (rc.a(111, var5)) {
              L1: {
                if (param0.equals(this.field_j)) {
                  break L1;
                } else {
                  L2: {
                    var3 = gb.a(param0, (byte) 100);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var3.field_d != null) {
                        break L2;
                      } else {
                        this.field_j = param0;
                        this.field_k = var3.field_c;
                        break L1;
                      }
                    }
                  }
                  stackIn_8_0 = db.field_u;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L3: {
                if (param1 <= -109) {
                  break L3;
                } else {
                  var4 = (String) null;
                  this.a((String) null, true);
                  break L3;
                }
              }
              L4: {
                if (!this.field_k) {
                  stackIn_15_0 = rg.field_f;
                  break L4;
                } else {
                  stackIn_15_0 = ph.field_g;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = rg.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("df.J(");

            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    df(vg param0) {
        super(param0);
        this.field_k = false;
    }

    static {
    }
}
