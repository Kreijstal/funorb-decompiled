/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends of {
    private kh field_w;
    static int field_y;
    private byte[] field_F;
    static String field_r;
    private ng field_G;
    private im field_v;
    static w[] field_D;
    private int field_q;
    private kh field_H;
    private ad field_I;
    private sf field_p;
    private byte[] field_z;
    static tb field_o;
    private dd field_l;
    private int field_n;
    private int field_x;
    static int field_t;
    private vj field_J;
    private boolean field_u;
    private vj field_k;
    private int field_j;
    static eh field_m;
    static int field_s;
    private boolean field_B;
    static ji field_E;
    private long field_A;
    private boolean field_C;

    final ad a(boolean param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = client.field_A ? 1 : 0;
        if (null == ((le) this).field_I) {
          L0: {
            if (((le) this).field_p == null) {
              if (!((le) this).field_l.a(param0)) {
                ((le) this).field_p = (sf) (Object) ((le) this).field_l.a(true, (byte) 0, true, 255, ((le) this).field_x);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((le) this).field_p.field_z) {
            if (param0) {
              L1: {
                var9 = ((le) this).field_p.g((byte) 70);
                var8 = var9;
                var7 = var8;
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (((le) this).field_p instanceof el) {
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    ((le) this).field_I = new ad(var9, ((le) this).field_q, ((le) this).field_z);
                    if (((le) this).field_n == ((le) this).field_I.field_m) {
                      break L1;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } else {
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    ((le) this).field_I = new ad(var9, ((le) this).field_q, ((le) this).field_z);
                    if (((le) this).field_H != null) {
                      el discarded$1 = ((le) this).field_v.a(((le) this).field_x, ((le) this).field_H, var9, (byte) 67);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (null == ((le) this).field_w) {
                  break L2;
                } else {
                  ((le) this).field_F = new byte[((le) this).field_I.field_n];
                  break L2;
                }
              }
              ((le) this).field_p = null;
              return ((le) this).field_I;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((le) this).field_I;
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        field_D = null;
        field_E = null;
        field_r = null;
        if (!param0) {
            return;
        }
        field_o = null;
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        if (((le) this).field_J == null) {
            return;
        }
        if (null == ((le) this).a(true)) {
            return;
        }
        bh var2 = ((le) this).field_k.c((byte) -113);
        while (var2 != null) {
            var3 = (int)var2.field_i;
            if (var3 < 0) {
                var2.b((byte) 105);
            } else {
                if (((le) this).field_I.field_n <= var3) {
                    var2.b((byte) 105);
                } else {
                    if (-1 == (((le) this).field_I.field_B[var3] ^ -1)) {
                        var2.b((byte) 105);
                    } else {
                        if (!(0 != ((le) this).field_F[var3])) {
                            sf discarded$0 = this.a(1, var3, (byte) -20);
                        }
                        if (!(-1 != ((le) this).field_F[var3])) {
                            sf discarded$1 = this.a(2, var3, (byte) -20);
                        }
                        if (((le) this).field_F[var3] == 1) {
                            var2.b((byte) 117);
                        }
                    }
                }
            }
            var2 = ((le) this).field_k.d(true);
        }
        if (param0 != 16322) {
            ((le) this).b(-71);
        }
    }

    final int a(int param0, int param1) {
        int var4 = 103 % ((param1 - 5) / 58);
        sf var5 = (sf) (Object) ((le) this).field_G.a((long)param0, 77);
        sf var3 = (sf) (Object) ((le) this).field_G.a((long)param0, 77);
        if (var5 != null) {
            return var5.a(false);
        }
        return 0;
    }

    final void b(byte param0) {
        if (!(null != ((le) this).field_w)) {
            return;
        }
        if (param0 != 0) {
            ((le) this).field_I = null;
        }
        ((le) this).field_B = true;
        if (!(((le) this).field_J != null)) {
            ((le) this).field_J = new vj();
        }
    }

    private final sf a(int param0, int param1, byte param2) {
        sf var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        sf var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var23 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        byte[] var32 = null;
        sf stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        sf stackOut_59_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    var12 = (sf) (Object) ((le) this).field_G.a((long)param1, 95);
                    var4 = (sf) (Object) ((le) this).field_G.a((long)param1, 95);
                    if (var12 == null) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var12.field_D) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var12.field_z) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var12.b((byte) 114);
                    var4 = null;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var4 != null) {
                        statePc = 31;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-1 == (param0 ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (1 == param0) {
                        statePc = 20;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (param0 != 2) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (null == ((le) this).field_w) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    if (0 != (((le) this).field_F[param1] ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    throw new RuntimeException();
                }
                case 16: {
                    if (!((le) this).field_l.b(0)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return null;
                }
                case 18: {
                    var4 = (sf) (Object) ((le) this).field_l.a(false, (byte) 2, true, ((le) this).field_x, param1);
                    statePc = 30;
                    continue stateLoop;
                }
                case 19: {
                    throw new RuntimeException();
                }
                case 20: {
                    if (null != ((le) this).field_w) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    throw new RuntimeException();
                }
                case 22: {
                    var4 = (sf) (Object) ((le) this).field_v.a(param1, ((le) this).field_w, (byte) 61);
                    statePc = 30;
                    continue stateLoop;
                }
                case 23: {
                    if (null == ((le) this).field_w) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (0 != (((le) this).field_F[param1] ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (!((le) this).field_l.a(true)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return null;
                }
                case 28: {
                    var4 = (sf) (Object) ((le) this).field_l.a(true, (byte) 2, true, ((le) this).field_x, param1);
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    var4 = (sf) (Object) ((le) this).field_v.a(param1, ((le) this).field_w, -98);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((le) this).field_G.a((long)param1, -1, (bh) (Object) var4);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (!var4.field_z) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return null;
                }
                case 33: {
                    var28 = var4.g((byte) 79);
                    var23 = var28;
                    var18 = var23;
                    var13 = var18;
                    var5 = var13;
                    if (param2 == -20) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    ((le) this).field_q = 57;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (!(var4 instanceof el)) {
                        statePc = 67;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    try {
                        if (var5 == null) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (-3 > (var28.length ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ab.field_c.reset();
                        ab.field_c.update(var5, 0, -2 + var28.length);
                        var6 = (int)ab.field_c.getValue();
                        if (((le) this).field_I.field_c[param1] != var6) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (((le) this).field_I.field_l == null) {
                            statePc = 51;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null != ((le) this).field_I.field_l[param1]) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var30 = ((le) this).field_I.field_l[param1];
                        var29 = um.a(0, var5, 0, var28.length - 2);
                        var9 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (64 <= var9) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var29[var9] == var30[var9]) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var9++;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var7 = ((var5[var28.length + -2] & 255) << 1262224936) - -(var5[var28.length + -1] & 255);
                        if ((((le) this).field_I.field_y[param1] & 65535) == var7) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (((le) this).field_F[param1] != 1) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (0 != ((le) this).field_F[param1]) {
                            statePc = 56;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ((le) this).field_F[param1] = (byte) 1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var4.field_D) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var4.b((byte) 115);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = (sf) var4;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    return stackIn_60_0;
                }
                case 61: {
                    var6_ref_Exception = (Exception) (Object) caughtException;
                    ((le) this).field_F[param1] = (byte)-1;
                    var4.b((byte) 119);
                    if (var4.field_D) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    return null;
                }
                case 63: {
                    if (!((le) this).field_l.a(true)) {
                        statePc = 65;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var4 = (sf) (Object) ((le) this).field_l.a(true, (byte) 2, true, ((le) this).field_x, param1);
                    ((le) this).field_G.a((long)param1, param2 ^ 19, (bh) (Object) var4);
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    return null;
                }
                case 67: {
                    if (var5 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (-3 > (var28.length ^ -1)) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    throw new RuntimeException();
                }
                case 71: {
                    ab.field_c.reset();
                    ab.field_c.update(var5, 0, -2 + var28.length);
                    var6 = (int)ab.field_c.getValue();
                    if (((le) this).field_I.field_c[param1] != var6) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    throw new RuntimeException();
                }
                case 74: {
                    if (((le) this).field_I.field_l == null) {
                        statePc = 83;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (null != ((le) this).field_I.field_l[param1]) {
                        statePc = 77;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var31 = ((le) this).field_I.field_l[param1];
                    var32 = um.a(0, var5, 0, -2 + var28.length);
                    var11 = 0;
                    var9 = var11;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var11 >= 64) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var31[var11] != var32[var11]) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var11++;
                    statePc = 78;
                    continue stateLoop;
                }
                case 81: {
                    throw new RuntimeException();
                }
                case 83: {
                    ((le) this).field_l.field_j = 0;
                    ((le) this).field_l.field_o = 0;
                    var5[-2 + var28.length] = (byte)(((le) this).field_I.field_y[param1] >>> 967493416);
                    var5[-1 + var28.length] = (byte)((le) this).field_I.field_y[param1];
                    if (null != ((le) this).field_w) {
                        statePc = 85;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 85: {
                    el discarded$2 = ((le) this).field_v.a(param1, ((le) this).field_w, var28, (byte) -68);
                    if ((((le) this).field_F[param1] ^ -1) == -2) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    ((le) this).field_F[param1] = (byte) 1;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (!var4.field_D) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var4.b((byte) 117);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int b(int param0, int param1) {
        if (param0 != 32085) {
            le.b(false);
        }
        return 500 * ((-1 + param1) * param1);
    }

    final static void a(byte param0, int param1) {
        dk.field_i = param1 * 100 / 150;
        dk.field_c = (param1 << -367606192) / 150;
        dk.field_g = param1 * 400 / 150;
        int var2 = 101 % ((8 - param0) / 52);
    }

    final void c(boolean param0) {
        sf var2 = null;
        int var2_int = 0;
        bh var3 = null;
        int var4 = 0;
        int var5 = 0;
        bh var6 = null;
        bh var7 = null;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            ((le) this).c(false);
            break L0;
          }
        }
        L1: {
          if (null == ((le) this).field_J) {
            break L1;
          } else {
            if (null == ((le) this).a(param0)) {
              return;
            } else {
              if (!((le) this).field_u) {
                if (((le) this).field_B) {
                  var2_int = 1;
                  var3 = ((le) this).field_J.c((byte) 77);
                  L2: while (true) {
                    if (var3 == null) {
                      L3: while (true) {
                        L4: {
                          if (((le) this).field_j >= ((le) this).field_I.field_B.length) {
                            break L4;
                          } else {
                            L5: {
                              if (((le) this).field_I.field_B[((le) this).field_j] == 0) {
                                break L5;
                              } else {
                                if (((le) this).field_l.b(0)) {
                                  var2_int = 0;
                                  break L4;
                                } else {
                                  L6: {
                                    if (((le) this).field_F[((le) this).field_j] != 1) {
                                      sf discarded$4 = this.a(2, ((le) this).field_j, (byte) -20);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  if (1 == ((le) this).field_F[((le) this).field_j]) {
                                    break L5;
                                  } else {
                                    var7 = new bh();
                                    var7.field_i = (long)((le) this).field_j;
                                    ((le) this).field_J.a(var7, 2777);
                                    var2_int = 0;
                                    break L5;
                                  }
                                }
                              }
                            }
                            ((le) this).field_j = ((le) this).field_j + 1;
                            continue L3;
                          }
                        }
                        if (var2_int != 0) {
                          ((le) this).field_j = 0;
                          ((le) this).field_B = false;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    } else {
                      L7: {
                        var4 = (int)var3.field_i;
                        if (1 == ((le) this).field_F[var4]) {
                          break L7;
                        } else {
                          sf discarded$5 = this.a(2, var4, (byte) -20);
                          break L7;
                        }
                      }
                      L8: {
                        if (-2 != (((le) this).field_F[var4] ^ -1)) {
                          var2_int = 0;
                          break L8;
                        } else {
                          var3.b((byte) 102);
                          break L8;
                        }
                      }
                      var3 = ((le) this).field_J.d(true);
                      continue L2;
                    }
                  }
                } else {
                  ((le) this).field_J = null;
                  break L1;
                }
              } else {
                var2_int = 1;
                var3 = ((le) this).field_J.c((byte) 54);
                L9: while (true) {
                  if (var3 == null) {
                    L10: while (true) {
                      L11: {
                        if (((le) this).field_j >= ((le) this).field_I.field_B.length) {
                          break L11;
                        } else {
                          L12: {
                            if (0 == ((le) this).field_I.field_B[((le) this).field_j]) {
                              break L12;
                            } else {
                              if (((le) this).field_v.field_b < 250) {
                                L13: {
                                  if (((le) this).field_F[((le) this).field_j] != 0) {
                                    break L13;
                                  } else {
                                    sf discarded$6 = this.a(1, ((le) this).field_j, (byte) -20);
                                    break L13;
                                  }
                                }
                                if (0 != ((le) this).field_F[((le) this).field_j]) {
                                  break L12;
                                } else {
                                  var6 = new bh();
                                  var6.field_i = (long)((le) this).field_j;
                                  ((le) this).field_J.a(var6, 2777);
                                  var2_int = 0;
                                  break L12;
                                }
                              } else {
                                var2_int = 0;
                                break L11;
                              }
                            }
                          }
                          ((le) this).field_j = ((le) this).field_j + 1;
                          continue L10;
                        }
                      }
                      if (var2_int == 0) {
                        break L1;
                      } else {
                        ((le) this).field_j = 0;
                        ((le) this).field_u = false;
                        break L1;
                      }
                    }
                  } else {
                    L14: {
                      var4 = (int)var3.field_i;
                      if (-1 == (((le) this).field_F[var4] ^ -1)) {
                        sf discarded$7 = this.a(1, var4, (byte) -20);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (((le) this).field_F[var4] != 0) {
                        var3.b((byte) 121);
                        break L15;
                      } else {
                        var2_int = 0;
                        break L15;
                      }
                    }
                    var3 = ((le) this).field_J.d(true);
                    continue L9;
                  }
                }
              }
            }
          }
        }
        L16: {
          if (!((le) this).field_C) {
            break L16;
          } else {
            if ((ik.a(4) ^ -1L) > (((le) this).field_A ^ -1L)) {
              break L16;
            } else {
              var2 = (sf) (Object) ((le) this).field_G.a((byte) 126);
              L17: while (true) {
                if (var2 == null) {
                  ((le) this).field_A = ik.a(4) + 1000L;
                  break L16;
                } else {
                  L18: {
                    if (var2.field_z) {
                      break L18;
                    } else {
                      if (var2.field_A) {
                        if (!var2.field_D) {
                          throw new RuntimeException();
                        } else {
                          var2.b((byte) 101);
                          break L18;
                        }
                      } else {
                        var2.field_A = true;
                        break L18;
                      }
                    }
                  }
                  var2 = (sf) (Object) ((le) this).field_G.b((byte) 107);
                  continue L17;
                }
              }
            }
          }
        }
    }

    final byte[] a(int param0, byte param1) {
        sf var3 = this.a(0, param0, (byte) -20);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.g((byte) 126);
        var3.b((byte) 107);
        if (param1 != 91) {
            return null;
        }
        return var4;
    }

    le(int param0, kh param1, kh param2, dd param3, im param4, int param5, byte[] param6, int param7, boolean param8) {
        ((le) this).field_G = new ng(16);
        ((le) this).field_j = 0;
        ((le) this).field_k = new vj();
        ((le) this).field_A = 0L;
        ((le) this).field_w = param1;
        ((le) this).field_x = param0;
        if (null == ((le) this).field_w) {
            ((le) this).field_u = false;
        } else {
            ((le) this).field_u = true;
            ((le) this).field_J = new vj();
        }
        ((le) this).field_q = param5;
        ((le) this).field_l = param3;
        ((le) this).field_C = param8 ? true : false;
        ((le) this).field_z = param6;
        ((le) this).field_H = param2;
        ((le) this).field_n = param7;
        ((le) this).field_v = param4;
        if (null != ((le) this).field_H) {
            ((le) this).field_p = (sf) (Object) ((le) this).field_v.a(((le) this).field_x, ((le) this).field_H, -36);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "No highscores";
        field_o = new tb();
    }
}
