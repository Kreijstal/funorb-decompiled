/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends a {
    static int[] field_l;
    static int field_n;
    static int field_o;
    static boolean field_m;
    static String field_j;
    static String field_k;

    final qf a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        qf stackIn_3_0 = null;
        qf stackIn_8_0 = null;
        qf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            if (!ec.a(30418, var5)) {
              stackIn_3_0 = rg.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var3_int = il.a(var6, 6054);
                if (0 >= var3_int) {
                  break L1;
                } else {
                  if (var3_int > 130) {
                    break L1;
                  } else {
                    L2: {
                      if (param1 < -109) {
                        break L2;
                      } else {
                        var4 = (String) null;
                        this.a((String) null, (byte) 83);
                        break L2;
                      }
                    }
                    stackIn_12_0 = ph.field_g;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = rg.field_f;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("cl.J(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void e(byte param0) {
        o var2;
        if (param0 > -96) {
          var2 = (o) null;
          cl.a(16, (o) null);
          field_j = null;
          field_k = null;
          field_l = null;
          return;
        } else {
          field_j = null;
          field_k = null;
          field_l = null;
          return;
        }
    }

    cl(vg param0) {
        super(param0);
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param0, (byte) -116) == rg.field_f) {
              stackIn_3_0 = qh.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1) {
                stackIn_7_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("cl.K(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static fg[] d(byte param0) {
        if (param0 != -30) {
          return (fg[]) null;
        } else {
          return new fg[]{sk.field_p, bb.field_I, SolKnight.field_D};
        }
    }

    final static void a(int param0, o param1) {
        try {
            fl.b((byte) 91);
            if (param0 > -91) {
                cl.e((byte) 101);
            }
            mi.a(param1.field_v, param1.field_q, param1.field_r);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "cl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Error connecting to server. Please try using a different server.";
        field_k = "Reload game";
    }
}
