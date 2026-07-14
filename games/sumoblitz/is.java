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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            field_a = true;
            if (-1 == (param1 & 33)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param1 & 33)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final oq a(int param0, int param1) {
        oq var3 = null;
        oq var3_ref = null;
        byte[] var4 = null;
        var3 = (oq) ((is) this).field_f.a((long)param0, 123);
        if (var3 != null) {
          return var3_ref;
        } else {
          L0: {
            if ((param0 ^ -1) > -32769) {
              var4 = ((is) this).field_e.a((byte) 109, param0, 1);
              break L0;
            } else {
              var4 = ((is) this).field_d.a((byte) 115, param0 & 32767, 1);
              break L0;
            }
          }
          L1: {
            var3_ref = new oq();
            if (var4 != null) {
              var3_ref.a(new fs(var4), true);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1 >= (param0 ^ -1)) {
              var3_ref.e(param1 ^ 32885);
              break L2;
            } else {
              break L2;
            }
          }
          ((is) this).field_f.a((long)param0, (Object) (Object) var3_ref, (byte) 19);
          return var3_ref;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        if (param0 < 27) {
          var2 = null;
          cn discarded$2 = is.a((byte) 10, (String) null);
          pu.field_e.a((byte) 123);
          pu.field_e.a((byte) 112, (pk) (Object) new dd(pu.field_e));
          return;
        } else {
          pu.field_e.a((byte) 123);
          pu.field_e.a((byte) 112, (pk) (Object) new dd(pu.field_e));
          return;
        }
    }

    final static cn a(byte param0, String param1) {
        String var2 = null;
        cn var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
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
                  return var3;
                } else {
                  var3 = (cn) (Object) io.field_b.a(-109);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private is() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            Object var2 = null;
            cn discarded$0 = is.a((byte) 3, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
