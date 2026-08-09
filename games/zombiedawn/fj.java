/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends pm {
    private tb field_f;
    static vo field_i;
    static char[] field_h;
    static am field_g;

    final static vn a(vn param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        vn stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ki.a((byte) -116, md.field_vb);
            if (param2 == 339) {
              bi.d();
              param0.b(3, 3);
              ho.a(md.field_vb, param3, param1, -109);
              pa.a(-21189);
              stackIn_4_0 = md.field_vb;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (vn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("fj.M(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0, int param1) {
        int var2;
        int stackIn_4_0 = 0;
        var2 = -102 / ((29 - param1) / 54);
        if (-1 == param0) {
          return true;
        } else {
          L0: {
            if ((hf.field_I & 1 << param0) == 0) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    fj(tb param0, tb param1) {
        super(param0);
        try {
            this.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_h = null;
        field_i = null;
        field_g = null;
        if (param0 >= -120) {
            field_i = (vo) null;
        }
    }

    final String a(String param0, byte param1) {
        vc var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_f instanceof mi)) {
                break L1;
              } else {
                var3 = ((mi) ((Object) this.field_f)).a(0);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a((byte) -75) != mc.field_g) {
                      break L2;
                    } else {
                      if (param0.equals(this.field_f.field_o)) {
                        break L2;
                      } else {
                        stackIn_5_0 = ne.field_a;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_7_0 = var3.b((byte) -125);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            if (param0.equals(this.field_f.field_o)) {
              if (param1 >= -94) {
                var4 = (String) null;
                this.a((String) null, (byte) -42);
                stackIn_14_0 = null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_10_0 = ne.field_a;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("fj.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return (String) ((Object) stackIn_14_0);
            }
          }
        }
    }

    final rh a(String param0, int param1) {
        vc var3 = null;
        RuntimeException var3_ref = null;
        rh stackIn_5_0 = null;
        rh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_f instanceof mi) {
                var3 = ((mi) ((Object) this.field_f)).a(0);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a((byte) -105) == mc.field_g) {
                    break L1;
                  } else {
                    stackIn_5_0 = uc.field_b;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 2) {
                break L2;
              } else {
                this.field_f = (tb) null;
                break L2;
              }
            }
            L3: {
              if (!param0.equals(this.field_f.field_o)) {
                stackIn_11_0 = uc.field_b;
                break L3;
              } else {
                stackIn_11_0 = mc.field_g;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("fj.I(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_11_0;
        }
    }

    static {
        field_h = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_i = new vo();
    }
}
