/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa {
    private di[] field_b;
    private uf field_f;
    private rb field_j;
    static ka field_e;
    private java.math.BigInteger field_h;
    private java.math.BigInteger field_i;
    static int field_g;
    static pe field_k;
    private vb field_c;
    private db field_d;
    static int[] field_a;

    oa(vb param0, rb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final di a(int param0, la param1, boolean param2, byte param3, la param4) {
        int var6 = 0;
        int var7 = 0;
        di var17 = null;
        di var19 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        if (((oa) this).field_f == null) {
          throw new RuntimeException();
        } else {
          if ((param0 ^ -1) <= -1) {
            if (param0 < ((oa) this).field_b.length) {
              if (((oa) this).field_b[param0] == null) {
                if (param3 != 15) {
                  boolean discarded$2 = ((oa) this).a(87);
                  ((oa) this).field_f.field_q = 6 + 72 * param0;
                  var6 = ((oa) this).field_f.i(param3 ^ 41);
                  var7 = ((oa) this).field_f.i(97);
                  var22 = new byte[64];
                  ((oa) this).field_f.a(84, var22, 64, 0);
                  var17 = new di(param0, param1, param4, ((oa) this).field_c, ((oa) this).field_j, var6, var22, var7, param2);
                  ((oa) this).field_b[param0] = var17;
                  return var17;
                } else {
                  ((oa) this).field_f.field_q = 6 + 72 * param0;
                  var6 = ((oa) this).field_f.i(param3 ^ 41);
                  var7 = ((oa) this).field_f.i(97);
                  var23 = new byte[64];
                  ((oa) this).field_f.a(84, var23, 64, 0);
                  var19 = new di(param0, param1, param4, ((oa) this).field_c, ((oa) this).field_j, var6, var23, var7, param2);
                  ((oa) this).field_b[param0] = var19;
                  return var19;
                }
              } else {
                return ((oa) this).field_b[param0];
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    public static void b(int param0) {
        if (param0 < 78) {
          field_a = null;
          field_k = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_k = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static bf a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        Object var8 = null;
        pa var9 = null;
        lh var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TorChallenge.field_F ? 1 : 0;
                    var9 = id.field_b;
                    var3 = var9.j(-98);
                    if (0 == (128 & var3)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    o.field_m = stackIn_3_0 != 0;
                    uk.field_L = 127 & var3;
                    ih.field_K = var9.j(-85);
                    ik.field_b = var9.k(-123);
                    if (uk.field_L != 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    hc.field_O = var9.c(false);
                    hf.field_e = var9.g(0);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    hc.field_O = 0;
                    hf.field_e = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8 = null;
                    int discarded$5 = oa.a((byte) -112, 80, (Random) null);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (1 != var9.j(-111)) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4 = stackIn_11_0;
                    vc.field_f = var9.b(false);
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    lk.field_b = var9.b(false);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    lk.field_b = vc.field_f;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == (uk.field_L ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((uk.field_L ^ -1) == -5) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$6 = var9.c(false);
                    String discarded$7 = var9.b(false);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$8 = var9.c(false);
                    String discarded$9 = var9.b(false);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (!param0) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var9.c(false);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var10 = ie.field_a.a(var5, (byte) -104);
                        td.field_q = var10.b(true);
                        if (lk.field_b.equals((Object) (Object) mf.field_a)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var10.field_x;
                        stackIn_24_0 = stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        eb.field_k = stackIn_24_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    td.a("CC1", (Throwable) (Object) var6, (byte) -80);
                    eb.field_k = null;
                    td.field_q = null;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    td.field_q = kk.a((uf) (Object) var9, -77, 80);
                    eb.field_k = null;
                    return new bf(param0);
                }
                case 28: {
                    return new bf(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (((oa) this).field_b != null) {
          var2 = 0;
          L0: while (true) {
            if (((oa) this).field_b.length <= var2) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((oa) this).field_b.length <= var4) {
                  if (param0 >= -94) {
                    bf discarded$1 = oa.a(true, false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (((oa) this).field_b[var4] != null) {
                    ((oa) this).field_b[var4].c(-91);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((oa) this).field_b[var2] != null) {
                ((oa) this).field_b[var2].a((byte) -112);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        int var7 = 0;
        java.math.BigInteger var7_ref = null;
        int var8 = 0;
        byte[] var9 = null;
        uf var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (((oa) this).field_f != null) {
          return true;
        } else {
          L0: {
            if (null == ((oa) this).field_d) {
              if (!((oa) this).field_c.b((byte) 100)) {
                ((oa) this).field_d = ((oa) this).field_c.a(true, 255, 255, (byte) 0, 101);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((oa) this).field_d.field_v) {
            var10 = new uf(((oa) this).field_d.e(2));
            var10.field_q = 5;
            var3 = var10.j(-87);
            var10.field_q = var10.field_q + 72 * var3;
            var21 = new byte[-var10.field_q + var10.field_m.length];
            var14 = var21;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            var10.a(param0 + 12048, var4, var21.length, 0);
            if (((oa) this).field_i != null) {
              if (((oa) this).field_h != null) {
                var12 = new java.math.BigInteger(var21);
                var7_ref = var12.modPow(((oa) this).field_i, ((oa) this).field_h);
                var26 = var7_ref.toByteArray();
                var19 = var26;
                var5 = var19;
                if ((var26.length ^ -1) != -66) {
                  throw new RuntimeException();
                } else {
                  var27 = qc.a(var10.field_m, -5 + (-var21.length + var10.field_q), (byte) -66, 5);
                  var7 = 0;
                  if (param0 == -11982) {
                    L1: while (true) {
                      if (-65 < (var7 ^ -1)) {
                        if (var27[var7] == var5[var7 - -1]) {
                          var7++;
                          continue L1;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        ((oa) this).field_b = new di[var3];
                        ((oa) this).field_f = var10;
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                var24 = var4;
                var17 = var24;
                var5 = var17;
                if ((var24.length ^ -1) != -66) {
                  throw new RuntimeException();
                } else {
                  var25 = qc.a(var10.field_m, -5 + (-var21.length + var10.field_q), (byte) -66, 5);
                  var18 = var25;
                  var9 = var18;
                  var7 = 0;
                  if (param0 == -11982) {
                    L2: while (true) {
                      if (-65 < (var7 ^ -1)) {
                        if (var25[var7] == var5[var7 - -1]) {
                          var7++;
                          continue L2;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        ((oa) this).field_b = new di[var3];
                        ((oa) this).field_f = var10;
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
            } else {
              var22 = var4;
              var15 = var22;
              var5 = var15;
              if ((var22.length ^ -1) != -66) {
                throw new RuntimeException();
              } else {
                var23 = qc.a(var10.field_m, -5 + (-var21.length + var10.field_q), (byte) -66, 5);
                var16 = var23;
                var9 = var16;
                var7 = 0;
                if (param0 == -11982) {
                  L3: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var23[var7] == var5[var7 - -1]) {
                        var7++;
                        continue L3;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      ((oa) this).field_b = new di[var3];
                      ((oa) this).field_f = var10;
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static int a(byte param0, int param1, Random param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (-1 <= (param1 ^ -1)) {
          throw new IllegalArgumentException();
        } else {
          if (i.a(17004, param1)) {
            return (int)((4294967295L & (long)param2.nextInt()) * (long)param1 >> 949195872);
          } else {
            if (param0 > -72) {
              field_g = 77;
              var3 = -2147483648 + -(int)(4294967296L % (long)param1);
              L0: while (true) {
                var4 = param2.nextInt();
                if (var3 <= var4) {
                  continue L0;
                } else {
                  return v.d(-110, var4, param1);
                }
              }
            } else {
              var3 = -2147483648 + -(int)(4294967296L % (long)param1);
              L1: while (true) {
                var4 = param2.nextInt();
                if (var3 <= var4) {
                  continue L1;
                } else {
                  return v.d(-110, var4, param1);
                }
              }
            }
          }
        }
    }

    private oa(vb param0, rb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((oa) this).field_i = param2;
        ((oa) this).field_h = param3;
        ((oa) this).field_c = param0;
        ((oa) this).field_j = param1;
        if (!((oa) this).field_c.b((byte) 100)) {
            ((oa) this).field_d = ((oa) this).field_c.a(true, 255, 255, (byte) 0, 71);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_e = new ka(160, 160);
        field_a = new int[]{416, 433, 180, 39};
    }
}
