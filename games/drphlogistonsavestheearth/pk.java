/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends ei {
    static int field_s;
    static int field_q;
    private String field_r;
    private boolean field_p;

    pk(kl param0) {
        super(param0);
        this.field_p = false;
    }

    final static void e(int param0) {
        int var1;
        var1 = -27 / ((param0 - -25) / 53);
        if (-71 < (oa.field_b ^ -1)) {
          wk.a(80, 10 + oa.field_b);
          return;
        } else {
          wk.a(80, 80);
          return;
        }
    }

    final vh a(int param0, String param1) {
        og var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        vh stackIn_2_0 = null;
        vh stackIn_11_0 = null;
        vh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (d.a(-18254, var4)) {
              L1: {
                if (param0 == 8192) {
                  break L1;
                } else {
                  pk.e(69);
                  break L1;
                }
              }
              L2: {
                if (!param1.equals(this.field_r)) {
                  L3: {
                    var3 = ng.a(param1, param0 ^ 11774);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null != var3.field_g) {
                        break L3;
                      } else {
                        this.field_p = var3.field_b;
                        this.field_r = param1;
                        break L2;
                      }
                    }
                  }
                  stackIn_11_0 = nd.field_P;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!this.field_p) {
                  stackIn_16_0 = u.field_b;
                  break L4;
                } else {
                  stackIn_16_0 = ce.field_e;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = u.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("pk.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final static int d(byte param0) {
        if (param0 != 9) {
            return -67;
        }
        return (int)(1000000000L / ma.field_vb);
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        og var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 47) {
                break L1;
              } else {
                pk.d((byte) -100);
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param1);
            var3 = vj.a(true, var5);
            if (var3 == null) {
              L2: {
                if (!param1.equals(this.field_r)) {
                  var4 = ng.a(param1, 3582);
                  if (var4 != null) {
                    if (var4.field_g == null) {
                      this.field_r = param1;
                      this.field_p = var4.field_b;
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
              if (!this.field_p) {
                stackIn_16_0 = q.field_g;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return fk.field_r;
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
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("pk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_11_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final void e(byte param0) {
        this.field_r = null;
        if (param0 != -27) {
            this.field_p = false;
        }
    }

    static {
        field_s = 0;
    }
}
