/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bna extends ana {
    static kv field_v;
    static wba field_x;
    private lca field_A;
    static kv field_y;
    static sna field_z;
    static int field_w;

    final boolean c(byte param0) {
        int var2 = 0;
        int fieldTemp$6 = ((bna) this).field_l - 1;
        ((bna) this).field_l = ((bna) this).field_l - 1;
        if (fieldTemp$6 >= 0) {
          if (((bna) this).field_l == 25) {
            int discarded$7 = -86;
            this.e();
            return false;
          } else {
            return false;
          }
        } else {
          var2 = -58 / ((71 - param0) / 47);
          int discarded$8 = -85;
          this.f();
          return true;
        }
    }

    public static void d(int param0) {
        field_z = null;
        field_v = null;
        field_x = null;
        int var1 = 2;
        field_y = null;
    }

    bna(gj param0, lca param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((bna) this).field_A = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bna.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static nea b(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        nea var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        nea stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        nea stackOut_18_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (null != wja.field_m) {
            if (param1 != null) {
              if (param1.length() != 0) {
                var7 = (CharSequence) (Object) param1;
                var2 = fq.a(0, var7);
                if (var2 != null) {
                  L0: {
                    if (param0 <= -19) {
                      break L0;
                    } else {
                      var6 = null;
                      boolean discarded$2 = bna.a((byte) -52, (String) null);
                      break L0;
                    }
                  }
                  var3 = (nea) (Object) wja.field_m.a((long)var2.hashCode(), (byte) -87);
                  L1: while (true) {
                    if (var3 != null) {
                      var8 = (CharSequence) (Object) var3.field_xb;
                      var4 = fq.a(0, var8);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_18_0 = (nea) var3;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        var3 = (nea) (Object) wja.field_m.a((byte) -31);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (nea) (Object) stackIn_10_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (nea) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("bna.E(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    private final void e() {
        boolean discarded$0 = dha.a(-108, (bca) (Object) ((bna) this).field_A, ((bna) this).field_q);
    }

    private final void f() {
        int var2 = -25;
    }

    final static kv[] a(int param0, vr param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (g.a(param0, param3, -30744, param1)) {
            int discarded$2 = 22;
            return vma.c();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("bna.D(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -116 + 44 + param3 + 41);
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var3 = null;
                nea discarded$2 = bna.b(65, (String) null);
                break L1;
              }
            }
            L2: {
              if (null == di.a(param1, -125)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("bna.B(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new wba(2);
    }
}
