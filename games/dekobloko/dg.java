/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg implements Iterator {
    static vj field_e;
    private be field_g;
    static ck[][] field_d;
    private uh field_a;
    private be field_f;
    static mi field_c;
    static int field_b;

    public final Object next() {
        Object var1;
        var1 = this.field_f;
        if (this.field_a.field_a != var1) {
          this.field_f = ((be) (var1)).field_p;
          if (client.field_A) {
            var1 = null;
            this.field_f = null;
            this.field_g = (be) (var1);
            return var1;
          } else {
            this.field_g = (be) (var1);
            return var1;
          }
        } else {
          var1 = null;
          this.field_f = null;
          this.field_g = (be) (var1);
          return var1;
        }
    }

    public final void remove() {
        if (!(this.field_g != null)) {
            throw new IllegalStateException();
        }
        this.field_g.e((byte) 81);
        this.field_g = null;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = (ck[][]) null;
        if (param0 != 8) {
            field_d = (ck[][]) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0, w param1, w param2) {
        try {
            if (param2.field_M == null) {
                param2.field_M = new vj();
            }
            if (null == param1.field_M) {
                param1.field_M = new vj();
            }
            if (null == mc.field_a) {
                mc.field_a = new nk(64);
            }
            if (null == hg.field_e) {
                hg.field_e = new nk(64);
            }
            uf.field_z = param1.field_M;
            if (param0 != 21014) {
                field_c = (mi) null;
            }
            qi.field_S = param2.field_M;
            d.a(true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        kn var4 = null;
        kc var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (kn) ((Object) pb.field_c.c((byte) -80));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fm.a((byte) -125, param1, var4);
                        var4 = (kn) ((Object) pb.field_c.d(true));
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 <= -47) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_b = 100;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = (kc) ((Object) field_e.c((byte) -121));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == null) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        wb.a(var5, param1, 60);
                        var5 = (kc) ((Object) field_e.d(true));
                        if (var3 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var2), "dg.C(" + param0 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final boolean hasNext() {
        return this.field_f != this.field_a.field_a;
    }

    final static boolean b(int param0) {
        if (param0 >= -34) {
            return false;
        }
        return rg.a(se.h(25144), (byte) -78);
    }

    dg(uh param0) {
        this.field_g = null;
        try {
            this.field_a = param0;
            this.field_f = this.field_a.field_a.field_p;
            this.field_g = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new ck[8][];
        field_e = new vj();
    }
}
