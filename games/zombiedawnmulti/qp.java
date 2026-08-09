/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends un {
    private pm field_q;
    static byte[][] field_t;
    static ja field_v;
    static String[] field_s;
    static String field_r;
    static ja[] field_u;
    static ef field_w;

    public static void h(int param0) {
        field_s = null;
        field_r = null;
        field_u = null;
        field_t = (byte[][]) null;
        field_w = null;
        if (param0 != 1) {
            return;
        }
        field_v = null;
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        if (!(oo.field_b < param0 - -param2)) {
            return param0;
        }
        int var4 = -6 % ((-7 - param1) / 32);
        if (!((-param2 + (param3 + param0) ^ -1) > -1)) {
            return -param2 + param0 - -param3;
        }
        return oo.field_b - param2;
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4) {
        ja[] var5;
        ja[] var6;
        var6 = new ja[9];
        var5 = var6;
        ja dupTemp$2 = k.a(-109, param1, param3);
        var6[6] = dupTemp$2;
        var5[3] = dupTemp$2;
        var5[2] = dupTemp$2;
        var5[1] = dupTemp$2;
        var5[0] = dupTemp$2;
        ja dupTemp$3 = k.a(-125, param1, param4);
        var6[8] = dupTemp$3;
        var5[7] = dupTemp$3;
        var5[5] = dupTemp$3;
        if (param0 == 0) {
          if (param2 > -55) {
            return (ja[]) null;
          } else {
            return var5;
          }
        } else {
          var6[4] = k.a(-124, 64, param0);
          if (param2 > -55) {
            return (ja[]) null;
          } else {
            return var5;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        ec.a(param0, param1, -105);
    }

    final re a(boolean param0, String param1) {
        j var3 = null;
        RuntimeException var3_ref = null;
        re stackIn_6_0 = null;
        re stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_r = (String) null;
                break L1;
              }
            }
            L2: {
              if (!(this.field_q instanceof kh)) {
                break L2;
              } else {
                var3 = ((kh) ((Object) this.field_q)).a((byte) 101);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.d(49) == db.field_b) {
                    break L2;
                  } else {
                    stackIn_6_0 = jq.field_b;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            L3: {
              if (param1.equals(this.field_q.field_j)) {
                stackIn_10_0 = db.field_b;
                break L3;
              } else {
                stackIn_10_0 = jq.field_b;
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
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("qp.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    qp(pm param0, pm param1) {
        super(param0);
        try {
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, int param1) {
        j var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_q instanceof kh)) {
                break L1;
              } else {
                var3 = ((kh) ((Object) this.field_q)).a((byte) 85);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.d(125) != db.field_b) {
                      break L2;
                    } else {
                      if (param0.equals(this.field_q.field_j)) {
                        break L2;
                      } else {
                        stackIn_5_0 = de.field_d;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_7_0 = var3.c(-122);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            if (!param0.equals(this.field_q.field_j)) {
              stackIn_11_0 = de.field_d;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param1 != -1276425040) {
                qp.a(-118, 127, -62, 52, -38);
                stackIn_15_0 = null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("qp.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return (String) ((Object) stackIn_15_0);
            }
          }
        }
    }

    static {
        field_r = "Tech Master";
    }
}
