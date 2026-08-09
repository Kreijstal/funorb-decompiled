/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static ci field_h;
    boolean field_a;
    static volatile int field_i;
    String[] field_j;
    String field_b;
    static ti field_e;
    static int[] field_d;
    boolean field_f;
    int field_g;
    static qj field_c;

    final static ti[] a(int param0) {
        ti[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    var1 = new ti[ih.field_b];
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (ih.field_b <= var2) {
                        statePc = 11;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = ql.field_b[var2] * wk.field_b[var2];
                    var9 = re.field_K[var2];
                    var5 = new int[var3];
                    stackIn_12_0 = 0;
                    stackIn_3_0 = stackIn_12_0;
                    if (var7 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var3 <= var6) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5[var6] = rg.field_D[vg.c((int) var9[var6], 255)];
                    var6++;
                    if (var7 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var5);
                    var2++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var5);
                    var2++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    wd.d(-9);
                    stackIn_12_0 = param0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 != 31151) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return var1;
                }
                case 14: {
                    field_e = (ti) null;
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != -1) {
          field_e = (ti) null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    uj(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_i = -1;
        field_c = new qj();
    }
}
