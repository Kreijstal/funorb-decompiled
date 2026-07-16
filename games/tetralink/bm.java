/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bm extends mc {
    static int field_q;
    int field_t;
    static String field_s;
    int field_r;
    static int field_n;
    static int field_p;
    static String field_o;

    public static void b(byte param0) {
        if (param0 < 57) {
            return;
        }
        field_s = null;
        field_o = null;
    }

    final static kl a(int param0, int param1, int param2, int param3, int param4, ie param5) {
        java.awt.Frame var8 = sk.a(param2, param5, 10, param3, param4, param0);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        kl var7 = new kl();
        var7.field_d = var8;
        java.awt.Component discarded$0 = var7.field_d.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, param1, param3, param0);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    private bm() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = TetraLink.field_J;
              if (null == vh.field_e) {
                break L0;
              } else {
                vh.field_e.a((byte) 80);
                break L0;
              }
            }
            L1: {
              if (null != qc.field_X) {
                qc.field_X.b(-23641);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == ch.field_r) {
                break L2;
              } else {
                try {
                  L3: {
                    ch.field_r.a(param0 ^ 25675);
                    break L3;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L4;
                  }
                }
                break L2;
              }
            }
            L5: {
              if (param0 == -25676) {
                break L5;
              } else {
                field_s = null;
                break L5;
              }
            }
            L6: {
              if (null != ok.field_b) {
                var1 = 0;
                L7: while (true) {
                  if (var1 >= ok.field_b.length) {
                    break L6;
                  } else {
                    if (ok.field_b[var1] != null) {
                      try {
                        L8: {
                          ok.field_b[var1].a(-1);
                          var1++;
                          break L8;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L9: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          var1++;
                          break L9;
                        }
                      }
                      continue L7;
                    } else {
                      var1++;
                      continue L7;
                    }
                  }
                }
              } else {
                break L6;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0, int param1) {
        if ((param1 ^ -1) != param0) {
            throw new IllegalArgumentException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Name";
    }
}
