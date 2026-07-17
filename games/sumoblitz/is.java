/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is {
    private ki field_d;
    static boolean field_b;
    private sd field_f;
    private ki field_e;
    static jn field_c;
    static boolean field_a;

    final static void b(int param0) {
        lf.a(256, (byte) -58);
        if (param0 <= 56) {
            field_b = false;
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        return (param1 & 33) != 0;
    }

    final oq a(int param0, int param1) {
        oq var3 = null;
        byte[] var4 = null;
        var3 = (oq) ((is) this).field_f.a((long)param0, 123);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param0 < 32768) {
              var4 = ((is) this).field_e.a((byte) 109, param0, 1);
              break L0;
            } else {
              var4 = ((is) this).field_d.a((byte) 115, param0 & 32767, 1);
              break L0;
            }
          }
          L1: {
            var3 = new oq();
            if (var4 != null) {
              var3.a(new fs(var4), true);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1 >= ~param0) {
              var3.e(param1 ^ 32885);
              break L2;
            } else {
              break L2;
            }
          }
          ((is) this).field_f.a((long)param0, (Object) (Object) var3, (byte) 19);
          return var3;
        }
    }

    final static void a() {
        pu.field_e.a((byte) 123);
        pu.field_e.a((byte) 112, (pk) (Object) new dd(pu.field_e));
    }

    final static cn a(byte param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        cn var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        cn stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_17_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (io.field_b != null) {
            var6 = (CharSequence) (Object) param1;
            var2 = uk.a(-1, var6);
            if (param0 >= 89) {
              L0: {
                if (var2 == null) {
                  var2 = param1;
                  break L0;
                } else {
                  break L0;
                }
              }
              var3 = (cn) (Object) io.field_b.a((long)var2.hashCode(), -45);
              L1: while (true) {
                if (var3 != null) {
                  L2: {
                    var7 = (CharSequence) (Object) var3.field_jb;
                    var4 = uk.a(-1, var7);
                    if (var4 != null) {
                      break L2;
                    } else {
                      var4 = var3.field_jb;
                      break L2;
                    }
                  }
                  if (var4.equals((Object) (Object) var2)) {
                    stackOut_17_0 = (cn) var3;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    var3 = (cn) (Object) io.field_b.a(-109);
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (cn) (Object) stackIn_6_0;
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (cn) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("is.A(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    private is() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
