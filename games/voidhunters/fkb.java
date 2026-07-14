/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fkb extends ksa {
    int field_k;
    static tjb field_m;
    int field_v;
    gd field_y;
    cja field_g;
    int field_o;
    int field_r;
    int field_h;
    static String field_z;
    int field_l;
    int field_u;
    int field_i;
    int field_w;
    sd field_n;
    int field_f;
    int field_e;
    int field_p;
    int field_d;
    int field_q;
    int field_x;
    fga field_j;
    int field_t;
    int field_s;

    final static int a(int param0, byte param1) {
        if (param1 == -121) {
          if (li.field_i) {
            return de.a(param0, 300).field_e;
          } else {
            return ita.a(param0, param1 ^ -8013).field_A;
          }
        } else {
          field_z = null;
          if (li.field_i) {
            return de.a(param0, 300).field_e;
          } else {
            return ita.a(param0, param1 ^ -8013).field_A;
          }
        }
    }

    final void c(int param0) {
        ((fkb) this).field_y = null;
        if (param0 != 25804) {
          field_z = null;
          ((fkb) this).field_j = null;
          ((fkb) this).field_g = null;
          ((fkb) this).field_n = null;
          return;
        } else {
          ((fkb) this).field_j = null;
          ((fkb) this).field_g = null;
          ((fkb) this).field_n = null;
          return;
        }
    }

    public static void d(int param0) {
        if (param0 != -25815) {
            fkb.d(-108);
            field_m = null;
            field_z = null;
            return;
        }
        field_m = null;
        field_z = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        omb.field_p.a(-103);
        var1 = 0;
        L0: while (true) {
          if (-33 >= var1) {
            if (param0 != 2096) {
              field_m = null;
              var1 = 0;
              L1: while (true) {
                if (-33 <= var1) {
                  dn.field_p = 0;
                  return;
                } else {
                  fm.field_b[var1] = 0L;
                  var1++;
                  continue L1;
                }
              }
            } else {
              var1 = 0;
              L2: while (true) {
                if (-33 >= (var1 ^ -1)) {
                  dn.field_p = 0;
                  return;
                } else {
                  fm.field_b[var1] = 0L;
                  var1++;
                  continue L2;
                }
              }
            }
          } else {
            sga.field_o[var1] = 0L;
            var1++;
            continue L0;
          }
        }
    }

    fkb() {
    }

    final static void a(int param0, Object param1, File param2) {
        FileOutputStream var3 = null;
        IOException var3_ref = null;
        ObjectOutputStream var4 = null;
        SecurityException var4_ref = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = new FileOutputStream(param2);
                        var4 = new ObjectOutputStream((OutputStream) (Object) var3);
                        if (param0 > 36) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        var4.writeObject(param1);
                        var4.close();
                        var3.close();
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    var3_ref = (IOException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        boolean discarded$1 = param2.delete();
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    var4_ref = (SecurityException) (Object) caughtException;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Remove clicked object";
    }
}
