/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i extends ma {
    private boolean field_n;
    static String[] field_p;
    static int field_m;
    private String field_o;
    static long field_q;
    static int field_r;

    public static void g(int param0) {
        field_p = null;
        if (param0 != -14298) {
            field_p = null;
        }
    }

    final rj a(byte param0, String param1) {
        ef var3 = null;
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!lk.a(param0 ^ -7343, var4)) {
            return lk.field_c;
        }
        if (param0 != 24) {
            return null;
        }
        if (!(param1.equals((Object) (Object) ((i) this).field_o))) {
            var3 = wi.a(param1, (byte) 123);
            if (var3 == null) {
                return jh.field_c;
            }
            if (var3.field_g == null) {
                ((i) this).field_n = var3.field_m;
                ((i) this).field_o = param1;
                return !((i) this).field_n ? lk.field_c : tf.field_w;
            }
            return jh.field_c;
        }
        return !((i) this).field_n ? lk.field_c : tf.field_w;
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 17004) {
          L0: {
            field_p = null;
            if (param1 != (-param1 & param1)) {
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
            if (param1 != (-param1 & param1)) {
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

    final void f(int param0) {
        ((i) this).field_o = null;
        if (param0 != 0) {
            ((i) this).f(-101);
        }
    }

    final String a(String param0, byte param1) {
        ef var4 = null;
        if (param1 != -24) {
            return null;
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        String var3 = id.a(var5, false);
        if (!(var3 == null)) {
            return var3;
        }
        if (!param0.equals((Object) (Object) ((i) this).field_o)) {
            var4 = wi.a(param0, (byte) 97);
            if (var4 == null) {
                return null;
            }
            if (null != var4.field_g) {
                return null;
            }
            ((i) this).field_n = var4.field_m;
            ((i) this).field_o = param0;
        }
        if (!(((i) this).field_n)) {
            return qb.field_f;
        }
        return uf.field_l;
    }

    final static void a(byte[] param0, byte param1, int param2, File param3) throws IOException {
        EOFException eOFException = null;
        DataInputStream var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param3)));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4.readFully(param0, 0, param2);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    eOFException = (EOFException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var4.close();
                    if (param1 < 77) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    boolean discarded$2 = i.a(31, -60);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    i(dj param0) {
        super(param0);
        ((i) this).field_n = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{"Runner", "Spitter", "Thudder", "Rocketeer", "Slimer", "Grinder"};
    }
}
