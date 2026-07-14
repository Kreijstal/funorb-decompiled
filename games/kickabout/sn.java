/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sn {
    static ut field_k;
    private u field_h;
    static hu field_a;
    static int[] field_f;
    static String[] field_b;
    static String field_e;
    static hu field_i;
    private iw field_d;
    static String field_j;
    static Vector field_g;
    static byte[] field_c;

    final boolean a(byte param0) {
        if (null != ((sn) this).field_h) {
          if (((sn) this).field_h.a((byte) 70)) {
            ((sn) this).field_d = ((sn) this).field_h.b(0);
            if (param0 >= -78) {
              return false;
            } else {
              ((sn) this).field_h = null;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != -1316) {
          field_f = null;
          field_a = null;
          field_g = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_i = null;
          field_e = null;
          field_k = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_i = null;
          field_e = null;
          field_k = null;
          return;
        }
    }

    sn(ma param0) {
        try {
            java.net.URL var2 = null;
            java.net.MalformedURLException var2_ref = null;
            int statePc = 1;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 1: {
                        try {
                            var2 = param0.getCodeBase();
                            if (var2 == null) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ((sn) this).field_h = new u(oo.field_c, new java.net.URL(var2, "motd"), 100000);
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var2_ref = (java.net.MalformedURLException) (Object) caughtException;
                        ((sn) this).field_h = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final iw a(boolean param0) {
        if (param0) {
            field_a = null;
            return ((sn) this).field_d;
        }
        return ((sn) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[4];
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_j = "Owner";
        field_c = new byte[]{(byte)3, (byte)2, (byte)2, (byte)2};
    }
}
