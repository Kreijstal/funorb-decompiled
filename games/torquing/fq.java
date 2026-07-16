/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends jh {
    static dg field_F;
    int field_D;
    static byte[][] field_G;
    static boolean field_E;

    fq(gm param0) {
        super(param0.field_w, param0.field_k, param0.field_p, param0.field_o, (el) null, (ca) null);
        param0.a((byte) -83, 0, 0, ((fq) this).field_o, ((fq) this).field_p);
        ((fq) this).field_D = 256;
        ((fq) this).field_C = param0;
    }

    public fq() {
        super(0, 0, 0, 0, (el) null, (ca) null);
        ((fq) this).field_D = 256;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        t var5 = null;
        if (0 == param0) {
          if (((fq) this).field_C != null) {
            if (((fq) this).field_D == 0) {
              return;
            } else {
              if (256 != ((fq) this).field_D) {
                if (param1 > -7) {
                  return;
                } else {
                  var5 = new t(((fq) this).field_C.field_p, ((fq) this).field_C.field_o);
                  tm.a((byte) 34, var5);
                  ((fq) this).field_C.a(param0, (byte) -61, 0, 0);
                  r.a(122);
                  var5.e(param3 + ((fq) this).field_w, ((fq) this).field_k + param2, ((fq) this).field_D);
                  return;
                }
              } else {
                ((fq) this).field_C.a(param0, (byte) -70, param2 - -((fq) this).field_k, ((fq) this).field_w + param3);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void g(byte param0) {
        field_G = null;
        if (param0 > -64) {
            return;
        }
        field_F = null;
    }

    final static void a(boolean param0, int param1, gg param2, int param3) {
        if (param0) {
          field_F = null;
          tb.field_l.a(param2, param1, on.field_c * param3 / 160);
          return;
        } else {
          tb.field_l.a(param2, param1, on.field_c * param3 / 160);
          return;
        }
    }

    final static sm[] a(la param0, int param1, int param2, int param3) {
        if (nd.a(param3, param0, -1, param2)) {
          if (param1 != -25960) {
            fq.g((byte) -70);
            return rf.a((byte) 66);
          } else {
            return rf.a((byte) 66);
          }
        } else {
          return null;
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (!vh.field_i.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0.startsWith("http://")) {
                  break L1;
                } else {
                  if (param0.startsWith("https://")) {
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = param1;
              L2: while (true) {
                if (param0.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) != 0) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_16_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = false;
    }
}
