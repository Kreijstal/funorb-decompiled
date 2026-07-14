/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends pe {
    static String field_r;
    private int field_q;
    private int field_k;
    private gj field_m;
    private int field_d;
    private ch field_v;
    private hc field_p;
    private byte[] field_t;
    private la field_u;
    private byte[] field_f;
    private d field_l;
    static String field_o;
    private hc field_h;
    private vb field_n;
    private int field_c;
    private boolean field_s;
    private bk field_e;
    private boolean field_w;
    private bk field_j;
    private long field_i;
    private boolean field_g;

    private final la a(byte param0, int param1, int param2) {
        la var4 = null;
        Object var4_ref = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        na stackIn_62_0 = null;
        Throwable decompiledCaughtException = null;
        na stackOut_61_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Main.field_T;
                    var4 = (la) ((uc) this).field_n.a(false, (long)param1);
                    if (var4 == null) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (0 != param2) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (((la) var4).field_o) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!((la) var4).field_n) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4.c(98);
                    var4 = null;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var4 == null) {
                        statePc = 7;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param2 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (((uc) this).field_p == null) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((((uc) this).field_t[param1] ^ -1) != 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!((uc) this).field_v.a(false)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return null;
                }
                case 13: {
                    var4_ref = ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                    statePc = 29;
                    continue stateLoop;
                }
                case 14: {
                    var4_ref = (na) (Object) ((uc) this).field_m.a(param0 ^ 125, ((uc) this).field_p, param1);
                    statePc = 29;
                    continue stateLoop;
                }
                case 15: {
                    if (1 != param2) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (null != ((uc) this).field_p) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    throw new RuntimeException();
                }
                case 18: {
                    var4_ref = (na) (Object) ((uc) this).field_m.a(param1, -3, ((uc) this).field_p);
                    statePc = 29;
                    continue stateLoop;
                }
                case 19: {
                    if (param2 == 2) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    throw new RuntimeException();
                }
                case 21: {
                    if (null != ((uc) this).field_p) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    throw new RuntimeException();
                }
                case 23: {
                    if ((((uc) this).field_t[param1] ^ -1) != 0) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    throw new RuntimeException();
                }
                case 26: {
                    if (!((uc) this).field_v.c(param0 + -170)) {
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
                    var4_ref = ((uc) this).field_v.a(false, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    ((uc) this).field_n.a((long)param1, (byte) 69, (qb) (Object) var4_ref);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (!((la) var4_ref).field_n) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return null;
                }
                case 32: {
                    var5 = ((la) (Object) var4_ref).b(true);
                    if (param0 == 124) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ((uc) this).field_f = (byte[]) null;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (!(var4_ref instanceof ab)) {
                        statePc = 69;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    try {
                        if (var5 == null) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-3 <= (var5.length ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        fl.field_c.reset();
                        fl.field_c.update(var5, 0, -2 + var5.length);
                        var6 = (int)fl.field_c.getValue();
                        if (((uc) this).field_l.field_i[param1] != var6) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == ((uc) this).field_l.field_l) {
                            statePc = 51;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (((uc) this).field_l.field_l[param1] != null) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7 = ((uc) this).field_l.field_l[param1];
                        var8 = ti.a(0, var5, var5.length - 2, param0 + -124);
                        var9 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var9 >= 64) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var8[var9] != var7[var9]) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var9++;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var7_int = (var5[-1 + var5.length] & 255) + (65280 & var5[-2 + var5.length] << -67561912);
                        if ((65535 & ((uc) this).field_l.field_n[param1]) != var7_int) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-2 == (((uc) this).field_t[param1] ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (((uc) this).field_t[param1] == 0) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ((uc) this).field_t[param1] = (byte) 1;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!((la) var4_ref).field_o) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ((la) (Object) var4_ref).c(param0 ^ 34);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = (na) var4_ref;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    return (la) (Object) stackIn_62_0;
                }
                case 63: {
                    var6_ref_Exception = (Exception) (Object) caughtException;
                    ((uc) this).field_t[param1] = (byte)-1;
                    ((la) (Object) var4_ref).c(param0 ^ 7);
                    if (((la) var4_ref).field_o) {
                        statePc = 65;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (!((uc) this).field_v.a(false)) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var4_ref = ((uc) this).field_v.a(true, -1640279264, param1, (byte) 2, ((uc) this).field_d);
                    ((uc) this).field_n.a((long)param1, (byte) 79, (qb) (Object) var4_ref);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    return null;
                }
                case 69: {
                    if (var5 == null) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (-3 > (var5.length ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    throw new RuntimeException();
                }
                case 73: {
                    fl.field_c.reset();
                    fl.field_c.update(var5, 0, -2 + var5.length);
                    var6 = (int)fl.field_c.getValue();
                    if (((uc) this).field_l.field_i[param1] != var6) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    throw new RuntimeException();
                }
                case 76: {
                    if (((uc) this).field_l.field_l == null) {
                        statePc = 85;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (((uc) this).field_l.field_l[param1] != null) {
                        statePc = 79;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var7 = ((uc) this).field_l.field_l[param1];
                    var8 = ti.a(0, var5, -2 + var5.length, 0);
                    var11 = 0;
                    var9 = var11;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (64 <= var11) {
                        statePc = 85;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var8[var11] != var7[var11]) {
                        statePc = 83;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 83: {
                    throw new RuntimeException();
                }
                case 84: {
                    var11++;
                    statePc = 80;
                    continue stateLoop;
                }
                case 85: {
                    ((uc) this).field_v.field_b = 0;
                    ((uc) this).field_v.field_l = 0;
                    var5[-2 + var5.length] = (byte)(((uc) this).field_l.field_n[param1] >>> -948312632);
                    var5[-1 + var5.length] = (byte)((uc) this).field_l.field_n[param1];
                    if (null == ((uc) this).field_p) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    ab discarded$2 = ((uc) this).field_m.a(((uc) this).field_p, var5, param1, param0 ^ -23043);
                    if ((((uc) this).field_t[param1] ^ -1) != -2) {
                        statePc = 88;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 88: {
                    ((uc) this).field_t[param1] = (byte) 1;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (!((la) var4_ref).field_o) {
                        statePc = 91;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 91: {
                    ((la) (Object) var4_ref).c(83);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    return (la) (Object) var4_ref;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final d b(byte param0) {
        int var4 = Main.field_T;
        if (((uc) this).field_l != null) {
            return ((uc) this).field_l;
        }
        if (((uc) this).field_u == null) {
            if (((uc) this).field_v.a(false)) {
                return null;
            }
            ((uc) this).field_u = (la) (Object) ((uc) this).field_v.a(true, -1640279264, ((uc) this).field_d, (byte) 0, 255);
        }
        if (((uc) this).field_u.field_n) {
            return null;
        }
        byte[] var5 = ((uc) this).field_u.b(true);
        byte[] var2 = var5;
        if (((uc) this).field_u instanceof ab) {
            if (var5 == null) {
                throw new RuntimeException();
            }
            ((uc) this).field_l = new d(var5, ((uc) this).field_k, ((uc) this).field_f);
            // if_icmpeq L216
            throw new RuntimeException();
        }
        if (var5 == null) {
            throw new RuntimeException();
        }
        ((uc) this).field_l = new d(var5, ((uc) this).field_k, ((uc) this).field_f);
        if (null != ((uc) this).field_h) {
            ab discarded$0 = ((uc) this).field_m.a(((uc) this).field_h, var5, ((uc) this).field_d, -23167);
        }
        if (param0 > -35) {
            return (d) null;
        }
        ((uc) this).field_u = null;
        if (!(((uc) this).field_p == null)) {
            ((uc) this).field_t = new byte[((uc) this).field_l.field_b];
        }
        return ((uc) this).field_l;
    }

    final void c(byte param0) {
        qb var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Main.field_T;
          if (param0 >= 89) {
            break L0;
          } else {
            ((uc) this).c((byte) -55);
            break L0;
          }
        }
        if (null == ((uc) this).field_j) {
          return;
        } else {
          if (((uc) this).b((byte) -71) == null) {
            return;
          } else {
            var2 = ((uc) this).field_e.a((byte) 74);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)((qb) var2).field_e;
                  if (-1 >= (var3 ^ -1)) {
                    if (var3 < ((uc) this).field_l.field_b) {
                      if (((uc) this).field_l.field_q[var3] == 0) {
                        var2.c(109);
                        break L2;
                      } else {
                        L3: {
                          if (0 != ((uc) this).field_t[var3]) {
                            break L3;
                          } else {
                            la discarded$2 = this.a((byte) 124, var3, 1);
                            break L3;
                          }
                        }
                        L4: {
                          if (((uc) this).field_t[var3] != -1) {
                            break L4;
                          } else {
                            la discarded$3 = this.a((byte) 124, var3, 2);
                            break L4;
                          }
                        }
                        if (-2 == (((uc) this).field_t[var3] ^ -1)) {
                          var2.c(85);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var2.c(109);
                      break L2;
                    }
                  } else {
                    var2.c(109);
                    break L2;
                  }
                }
                var2 = ((uc) this).field_e.b((byte) -99);
                continue L1;
              }
            }
          }
        }
    }

    final void c(int param0) {
        int var2_int = 0;
        la var2 = null;
        qb var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            L2: {
              var5 = Main.field_T;
              if (null != ((uc) this).field_j) {
                if (((uc) this).b((byte) -56) == null) {
                  return;
                } else {
                  if (((uc) this).field_s) {
                    var2_int = 1;
                    var3 = ((uc) this).field_j.a((byte) 74);
                    L3: while (true) {
                      if (var3 == null) {
                        L4: while (true) {
                          L5: {
                            if (((uc) this).field_l.field_q.length <= ((uc) this).field_c) {
                              break L5;
                            } else {
                              L6: {
                                if (((uc) this).field_l.field_q[((uc) this).field_c] == 0) {
                                  break L6;
                                } else {
                                  if ((((uc) this).field_m.field_b ^ -1) <= -251) {
                                    var2_int = 0;
                                    break L5;
                                  } else {
                                    L7: {
                                      if (0 == ((uc) this).field_t[((uc) this).field_c]) {
                                        la discarded$4 = this.a((byte) 124, ((uc) this).field_c, 1);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    if (((uc) this).field_t[((uc) this).field_c] == 0) {
                                      var3 = new qb();
                                      var3.field_e = (long)((uc) this).field_c;
                                      var2_int = 0;
                                      ((uc) this).field_j.a(var3, param0 + 30390);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              ((uc) this).field_c = ((uc) this).field_c + 1;
                              continue L4;
                            }
                          }
                          if (var2_int == 0) {
                            break L2;
                          } else {
                            ((uc) this).field_s = false;
                            ((uc) this).field_c = 0;
                            break L2;
                          }
                        }
                      } else {
                        L8: {
                          var4 = (int)((qb) var3).field_e;
                          if (((uc) this).field_t[var4] != 0) {
                            break L8;
                          } else {
                            la discarded$5 = this.a((byte) 124, var4, 1);
                            break L8;
                          }
                        }
                        L9: {
                          if (-1 == (((uc) this).field_t[var4] ^ -1)) {
                            var2_int = 0;
                            break L9;
                          } else {
                            var3.c(98);
                            break L9;
                          }
                        }
                        var3 = ((uc) this).field_j.b((byte) -101);
                        continue L3;
                      }
                    }
                  } else {
                    if (((uc) this).field_w) {
                      var2_int = 1;
                      var3 = ((uc) this).field_j.a((byte) 74);
                      L10: while (true) {
                        if (var3 == null) {
                          L11: while (true) {
                            L12: {
                              if (((uc) this).field_l.field_q.length <= ((uc) this).field_c) {
                                break L12;
                              } else {
                                L13: {
                                  if (((uc) this).field_l.field_q[((uc) this).field_c] == 0) {
                                    break L13;
                                  } else {
                                    if (((uc) this).field_v.c(param0 + 3129)) {
                                      var2_int = 0;
                                      break L12;
                                    } else {
                                      L14: {
                                        if (((uc) this).field_t[((uc) this).field_c] != 1) {
                                          la discarded$6 = this.a((byte) 124, ((uc) this).field_c, 2);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      if ((((uc) this).field_t[((uc) this).field_c] ^ -1) != -2) {
                                        var3 = new qb();
                                        var3.field_e = (long)((uc) this).field_c;
                                        ((uc) this).field_j.a(var3, 27362);
                                        var2_int = 0;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                ((uc) this).field_c = ((uc) this).field_c + 1;
                                continue L11;
                              }
                            }
                            if (var2_int != 0) {
                              ((uc) this).field_c = 0;
                              ((uc) this).field_w = false;
                              break L2;
                            } else {
                              if (!((uc) this).field_g) {
                                break L0;
                              } else {
                                if ((id.a(36) ^ -1L) > (((uc) this).field_i ^ -1L)) {
                                  break L0;
                                } else {
                                  var2 = (la) ((uc) this).field_n.b(-119);
                                  L15: while (true) {
                                    if (var2 == null) {
                                      break L1;
                                    } else {
                                      L16: {
                                        if (!((la) var2).field_n) {
                                          if (((la) var2).field_l) {
                                            if (!((la) var2).field_o) {
                                              throw new RuntimeException();
                                            } else {
                                              var2.c(86);
                                              break L16;
                                            }
                                          } else {
                                            var2.field_l = true;
                                            break L16;
                                          }
                                        } else {
                                          break L16;
                                        }
                                      }
                                      var2 = (la) ((uc) this).field_n.a(true);
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L17: {
                            var4 = (int)((qb) var3).field_e;
                            if (1 != ((uc) this).field_t[var4]) {
                              la discarded$7 = this.a((byte) 124, var4, 2);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (-2 != (((uc) this).field_t[var4] ^ -1)) {
                              var2_int = 0;
                              break L18;
                            } else {
                              var3.c(124);
                              break L18;
                            }
                          }
                          var3 = ((uc) this).field_j.b((byte) -104);
                          continue L10;
                        }
                      }
                    } else {
                      ((uc) this).field_j = null;
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            if (!((uc) this).field_g) {
              break L0;
            } else {
              if ((id.a(36) ^ -1L) > (((uc) this).field_i ^ -1L)) {
                break L0;
              } else {
                var2 = (la) ((uc) this).field_n.b(-119);
                L19: while (true) {
                  if (var2 == null) {
                    break L1;
                  } else {
                    L20: {
                      if (!((la) var2).field_n) {
                        if (((la) var2).field_l) {
                          if (!((la) var2).field_o) {
                            throw new RuntimeException();
                          } else {
                            var2.c(86);
                            break L20;
                          }
                        } else {
                          var2.field_l = true;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    var2 = (la) ((uc) this).field_n.a(true);
                    continue L19;
                  }
                }
              }
            }
          }
          ((uc) this).field_i = 1000L + id.a(109);
          break L0;
        }
        L21: {
          if (param0 == -3028) {
            break L21;
          } else {
            ((uc) this).field_v = (ch) null;
            break L21;
          }
        }
    }

    final static void a(pb param0, java.math.BigInteger param1, int param2, byte param3, int param4, java.math.BigInteger param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var10 = Main.field_T;
          var7 = qa.a(param2, 8);
          if (null == bl.field_a) {
            bl.field_a = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new int[4];
        var9 = 0;
        L1: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L2: {
              L3: {
                if (vc.field_b == null) {
                  break L3;
                } else {
                  if (vc.field_b.field_g.length >= var7) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              vc.field_b = new pb(var7);
              break L2;
            }
            L4: {
              L5: {
                vc.field_b.field_i = 0;
                vc.field_b.a(param2, param4, param6, (byte) -121);
                vc.field_b.c(1442653008, var7);
                vc.field_b.a(var8, 8);
                if (null == oj.field_a) {
                  break L5;
                } else {
                  if ((oj.field_a.field_g.length ^ -1) <= -101) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              oj.field_a = new pb(100);
              break L4;
            }
            L6: {
              if (param3 == 0) {
                break L6;
              } else {
                uc.b(57);
                break L6;
              }
            }
            oj.field_a.field_i = 0;
            oj.field_a.b(-9469, 10);
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if (var11 >= 4) {
                oj.field_a.e(param2, 26040);
                oj.field_a.a(param1, param5, -15792);
                param0.a(oj.field_a.field_i, 0, oj.field_a.field_g, (byte) -84);
                param0.a(vc.field_b.field_i, 0, vc.field_b.field_g, (byte) -113);
                return;
              } else {
                oj.field_a.a(-246, var8[var11]);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = bl.field_a.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    public static void b(int param0) {
        field_r = null;
        field_o = null;
        if (param0 != 0) {
            uc.a((pb) null, (java.math.BigInteger) null, 16, (byte) 108, 83, (java.math.BigInteger) null, (byte[]) null);
        }
    }

    final int a(int param0, int param1) {
        la var3 = (la) ((uc) this).field_n.a(false, (long)param0);
        if (!(var3 == null)) {
            return var3.a(false);
        }
        int var4 = 10 / ((-27 - param1) / 58);
        return 0;
    }

    final void a(int param0) {
        if (!(((uc) this).field_p != null)) {
            return;
        }
        ((uc) this).field_w = true;
        if (null == ((uc) this).field_j) {
            ((uc) this).field_j = new bk();
        }
        if (param0 != -25350) {
            ((uc) this).field_m = (gj) null;
        }
    }

    final byte[] a(int param0, boolean param1) {
        la var3 = this.a((byte) 124, param0, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b(param1);
        var3.c(109);
        return var4;
    }

    uc(int param0, hc param1, hc param2, ch param3, gj param4, int param5, byte[] param6, int param7, boolean param8) {
        ((uc) this).field_n = new vb(16);
        ((uc) this).field_c = 0;
        ((uc) this).field_e = new bk();
        ((uc) this).field_i = 0L;
        ((uc) this).field_d = param0;
        ((uc) this).field_p = param1;
        if (((uc) this).field_p != null) {
            ((uc) this).field_s = true;
            ((uc) this).field_j = new bk();
        } else {
            ((uc) this).field_s = false;
        }
        ((uc) this).field_m = param4;
        ((uc) this).field_k = param5;
        ((uc) this).field_f = param6;
        ((uc) this).field_h = param2;
        ((uc) this).field_g = param8 ? true : false;
        ((uc) this).field_q = param7;
        ((uc) this).field_v = param3;
        if (((uc) this).field_h != null) {
            ((uc) this).field_u = (la) (Object) ((uc) this).field_m.a(1, ((uc) this).field_h, ((uc) this).field_d);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Back";
        field_o = "TIME";
    }
}
