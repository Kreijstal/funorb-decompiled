/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ei {
    static w field_d;
    static int field_a;
    private java.util.zip.Inflater field_b;
    static String field_c;

    final static void a(int param0) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var1 = -36 % ((-50 - param0) / 48);
        dl var2 = q.field_p;
        while (sa.a(true)) {
            var2.g(65, 8);
            ((dl) var2).field_g = ((dl) var2).field_g + 1;
            var3 = ((dl) var2).field_g + 1;
            hb.a(var2, 24732);
            q.field_p.b(((dl) var2).field_g + -var3, (byte) 118);
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        if (param0 < 95) {
          ei.a(true);
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener((java.awt.event.KeyListener) (Object) ua.field_d);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) ua.field_d);
          return;
        } else {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener((java.awt.event.KeyListener) (Object) ua.field_d);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) ua.field_d);
          return;
        }
    }

    final static boolean a(String param0, byte param1) {
        if (param1 != -16) {
            field_c = (String) null;
            return es.a(ln.class, -106, param0);
        }
        return es.a(ln.class, -106, param0);
    }

    final void a(byte[] param0, int param1, rb param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (31 != ((rb) param2).field_f[((rb) param2).field_g]) {
                break L0;
              } else {
                if (116 == (((rb) param2).field_f[((rb) param2).field_g - -1] ^ -1)) {
                  L1: {
                    if (((ei) this).field_b != null) {
                      break L1;
                    } else {
                      ((ei) this).field_b = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  try {
                    ((ei) this).field_b.setInput(((rb) param2).field_f, param1 + ((rb) param2).field_g, ((rb) param2).field_f.length - (8 + ((rb) param2).field_g + 10));
                    int discarded$2 = ((ei) this).field_b.inflate(param0);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((ei) this).field_b.reset();
                  throw new RuntimeException("");
                } else {
                  break L0;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ei() {
        this(-1, 1000000, 1000000);
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    private ei(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading music";
        field_d = new w();
    }
}
