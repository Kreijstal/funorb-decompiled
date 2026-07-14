/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class bl extends tj {
    static sg field_r;
    ah field_q;
    static int[] field_n;
    static String field_o;
    static uf field_s;
    private kf field_m;
    fg field_p;

    private final void a(ck param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        kf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ck stackIn_13_2 = null;
        kf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ck stackIn_14_2 = null;
        kf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ck stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        kf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ck stackOut_12_2 = null;
        kf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ck stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        kf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ck stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        if (0 == (((bl) this).field_m.field_o[param0.field_p] & 4)) {
          if (param1 <= -71) {
            param0.field_t.a(param2);
            return;
          } else {
            ((bl) this).field_q = null;
            param0.field_t.a(param2);
            return;
          }
        } else {
          if ((param0.field_z ^ -1) > -1) {
            var4 = ((bl) this).field_m.field_t[param0.field_p] / lo.field_l;
            var5 = (1048575 - (-var4 - -param0.field_v)) / var4;
            param0.field_v = var4 * param2 + param0.field_v & 1048575;
            if (var5 <= param2) {
              if (((bl) this).field_m.field_S[param0.field_p] == 0) {
                param0.field_t = db.b(param0.field_s, param0.field_t.l(), param0.field_t.j(), param0.field_t.k());
                if (param0.field_o.field_q[param0.field_u] < 0) {
                  param0.field_t.g(-1);
                  param2 = param0.field_v / var4;
                  if (param1 <= -71) {
                    param0.field_t.a(param2);
                    return;
                  } else {
                    ((bl) this).field_q = null;
                    param0.field_t.a(param2);
                    return;
                  }
                } else {
                  param2 = param0.field_v / var4;
                  if (param1 <= -71) {
                    param0.field_t.a(param2);
                    return;
                  } else {
                    ((bl) this).field_q = null;
                    param0.field_t.a(param2);
                    return;
                  }
                }
              } else {
                L0: {
                  param0.field_t = db.b(param0.field_s, param0.field_t.l(), 0, param0.field_t.k());
                  stackOut_12_0 = ((bl) this).field_m;
                  stackOut_12_1 = 2;
                  stackOut_12_2 = (ck) param0;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  if (param0.field_o.field_q[param0.field_u] >= 0) {
                    stackOut_14_0 = (kf) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = (ck) (Object) stackIn_14_2;
                    stackOut_14_3 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    break L0;
                  } else {
                    stackOut_13_0 = (kf) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (ck) (Object) stackIn_13_2;
                    stackOut_13_3 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    break L0;
                  }
                }
                ((kf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                if (param0.field_o.field_q[param0.field_u] < 0) {
                  param0.field_t.g(-1);
                  param2 = param0.field_v / var4;
                  if (param1 <= -71) {
                    param0.field_t.a(param2);
                    return;
                  } else {
                    ((bl) this).field_q = null;
                    param0.field_t.a(param2);
                    return;
                  }
                } else {
                  param2 = param0.field_v / var4;
                  if (param1 <= -71) {
                    param0.field_t.a(param2);
                    return;
                  } else {
                    ((bl) this).field_q = null;
                    param0.field_t.a(param2);
                    return;
                  }
                }
              }
            } else {
              if (param1 <= -71) {
                param0.field_t.a(param2);
                return;
              } else {
                ((bl) this).field_q = null;
                param0.field_t.a(param2);
                return;
              }
            }
          } else {
            if (param1 <= -71) {
              param0.field_t.a(param2);
              return;
            } else {
              ((bl) this).field_q = null;
              param0.field_t.a(param2);
              return;
            }
          }
        }
    }

    final tj a() {
        ck var1 = (ck) (Object) ((bl) this).field_q.b((byte) 100);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_t == null)) {
            return (tj) (Object) var1.field_t;
        }
        return ((bl) this).b();
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            af var4 = null;
            DataInputStream var5_ref_DataInputStream = null;
            int var5 = 0;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ib stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            ib stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            ib stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            ib stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            ib stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            ib stackOut_13_0 = null;
            java.net.URL stackOut_13_1 = null;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            StringBuilder stackOut_13_4 = null;
            String stackOut_13_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = HoldTheLine.field_D;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param0 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = ih.a(param0, -12895);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param2 != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + param2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            cd.a(12, var3_ref);
                            var7 = vn.a("%3a", ":", -104, var3_ref);
                            var8 = vn.a("%40", "@", -102, var7);
                            var9 = vn.a("%26", "&", -102, var8);
                            var10 = vn.a("%23", "#", -67, var9);
                            if (null == rd.field_d) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = te.field_d;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = rd.field_d.getCodeBase();
                            stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(im.field_a).append("&u=");
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            if (null != am.field_f) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (ib) (Object) stackIn_12_0;
                            stackOut_12_1 = null;
                            stackOut_12_2 = null;
                            stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                            stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                            stackOut_12_5 = "" + ul.field_e;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (ib) (Object) stackIn_13_0;
                            stackOut_13_1 = null;
                            stackOut_13_2 = null;
                            stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                            stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                            stackOut_13_5 = am.field_f;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            stackIn_14_3 = stackOut_13_3;
                            stackIn_14_4 = stackOut_13_4;
                            stackIn_14_5 = stackOut_13_5;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + ib.field_p + "&v2=" + ib.field_j + "&e=" + var10);
                            var4 = ((ib) (Object) stackIn_14_0).a(stackIn_14_1, 0);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-1 != (var4.field_d ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            qe.a(1L, (byte) 45);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((var4.field_d ^ -1) == -2) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var5_ref_DataInputStream = (DataInputStream) var4.field_b;
                            int discarded$1 = var5_ref_DataInputStream.read();
                            var5_ref_DataInputStream.close();
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var5 = 44 % ((17 - param1) / 37);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return;
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

    final void a(int param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        ((bl) this).field_p.a(param0);
        var3 = (ck) (Object) ((bl) this).field_q.b((byte) 120);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((bl) this).field_m.a(true, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_r >= var2) {
                    this.a(var3, -106, var2);
                    var3.field_r = var3.field_r - var2;
                    break L1;
                  } else {
                    this.a(var3, -121, var3.field_r);
                    var2 = var2 - var3.field_r;
                    if (!((bl) this).field_m.a((int[]) null, var3, var2, -104, 0)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (ck) (Object) ((bl) this).field_q.c((byte) -120);
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(ck param0, int[] param1, byte param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        db var13 = null;
        db var17 = null;
        kf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ck stackIn_13_2 = null;
        kf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ck stackIn_14_2 = null;
        kf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ck stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        kf stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        ck stackIn_38_2 = null;
        kf stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        ck stackIn_39_2 = null;
        kf stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ck stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        kf stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        ck stackOut_37_2 = null;
        kf stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        ck stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        kf stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        ck stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        kf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ck stackOut_12_2 = null;
        kf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ck stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        kf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ck stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        var12 = HoldTheLine.field_D;
        if (param2 == -23) {
          if ((4 & ((bl) this).field_m.field_o[param0.field_p]) != 0) {
            if (-1 < (param0.field_z ^ -1)) {
              var7 = ((bl) this).field_m.field_t[param0.field_p] / lo.field_l;
              L0: while (true) {
                var8 = (-param0.field_v + var7 + 1048575) / var7;
                if (param4 < var8) {
                  param0.field_v = param0.field_v + var7 * param4;
                  param0.field_t.b(param1, param3, param4);
                  return;
                } else {
                  L1: {
                    param0.field_t.b(param1, param3, var8);
                    param0.field_v = param0.field_v + (-1048576 + var8 * var7);
                    param3 = param3 + var8;
                    param4 = param4 - var8;
                    var9 = lo.field_l / 100;
                    var10 = 262144 / var7;
                    if (var9 > var10) {
                      var9 = var10;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var17 = param0.field_t;
                    if (0 != ((bl) this).field_m.field_S[param0.field_p]) {
                      L3: {
                        param0.field_t = db.b(param0.field_s, var17.l(), 0, var17.k());
                        stackOut_37_0 = ((bl) this).field_m;
                        stackOut_37_1 = param2 ^ -21;
                        stackOut_37_2 = (ck) param0;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        if (0 <= param0.field_o.field_q[param0.field_u]) {
                          stackOut_39_0 = (kf) (Object) stackIn_39_0;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = (ck) (Object) stackIn_39_2;
                          stackOut_39_3 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          break L3;
                        } else {
                          stackOut_38_0 = (kf) (Object) stackIn_38_0;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = (ck) (Object) stackIn_38_2;
                          stackOut_38_3 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          break L3;
                        }
                      }
                      ((kf) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3 != 0);
                      param0.field_t.c(var9, var17.j());
                      break L2;
                    } else {
                      param0.field_t = db.b(param0.field_s, var17.l(), var17.j(), var17.k());
                      break L2;
                    }
                  }
                  L4: {
                    if (0 > param0.field_o.field_q[param0.field_u]) {
                      param0.field_t.g(-1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var17.f(var9);
                  var17.b(param1, param3, param5 - param3);
                  if (var17.g()) {
                    ((bl) this).field_p.a((tj) (Object) var17);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            } else {
              param0.field_t.b(param1, param3, param4);
              return;
            }
          } else {
            param0.field_t.b(param1, param3, param4);
            return;
          }
        } else {
          ((bl) this).field_q = null;
          if ((4 & ((bl) this).field_m.field_o[param0.field_p]) != 0) {
            if (-1 < (param0.field_z ^ -1)) {
              var7 = ((bl) this).field_m.field_t[param0.field_p] / lo.field_l;
              L5: while (true) {
                var8 = (-param0.field_v + var7 + 1048575) / var7;
                if (param4 < var8) {
                  param0.field_v = param0.field_v + var7 * param4;
                  param0.field_t.b(param1, param3, param4);
                  return;
                } else {
                  L6: {
                    param0.field_t.b(param1, param3, var8);
                    param0.field_v = param0.field_v + (-1048576 + var8 * var7);
                    param3 = param3 + var8;
                    param4 = param4 - var8;
                    var9 = lo.field_l / 100;
                    var10 = 262144 / var7;
                    if (var9 > var10) {
                      var9 = var10;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var13 = param0.field_t;
                    if (0 != ((bl) this).field_m.field_S[param0.field_p]) {
                      L8: {
                        param0.field_t = db.b(param0.field_s, var13.l(), 0, var13.k());
                        stackOut_12_0 = ((bl) this).field_m;
                        stackOut_12_1 = param2 ^ -21;
                        stackOut_12_2 = (ck) param0;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        if (0 <= param0.field_o.field_q[param0.field_u]) {
                          stackOut_14_0 = (kf) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = (ck) (Object) stackIn_14_2;
                          stackOut_14_3 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          stackIn_15_2 = stackOut_14_2;
                          stackIn_15_3 = stackOut_14_3;
                          break L8;
                        } else {
                          stackOut_13_0 = (kf) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = (ck) (Object) stackIn_13_2;
                          stackOut_13_3 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          stackIn_15_3 = stackOut_13_3;
                          break L8;
                        }
                      }
                      ((kf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                      param0.field_t.c(var9, var13.j());
                      break L7;
                    } else {
                      param0.field_t = db.b(param0.field_s, var13.l(), var13.j(), var13.k());
                      break L7;
                    }
                  }
                  L9: {
                    if (0 > param0.field_o.field_q[param0.field_u]) {
                      param0.field_t.g(-1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var13.f(var9);
                  var13.b(param1, param3, param5 - param3);
                  if (var13.g()) {
                    ((bl) this).field_p.a((tj) (Object) var13);
                    continue L5;
                  } else {
                    continue L5;
                  }
                }
              }
            } else {
              param0.field_t.b(param1, param3, param4);
              return;
            }
          } else {
            param0.field_t.b(param1, param3, param4);
            return;
          }
        }
    }

    final tj b() {
        ck var1 = null;
        int var2 = 0;
        var2 = HoldTheLine.field_D;
        L0: while (true) {
          var1 = (ck) (Object) ((bl) this).field_q.c((byte) -57);
          if (var1 != null) {
            if (var1.field_t != null) {
              return (tj) (Object) var1.field_t;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ck var6 = null;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        ((bl) this).field_p.b(param0, param1, param2);
        var6 = (ck) (Object) ((bl) this).field_q.b((byte) 101);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((bl) this).field_m.a(true, var6)) {
                break L1;
              } else {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var5 <= var6.field_r) {
                    this.a(var6, param0, (byte) -23, var4, var5, var4 + var5);
                    var6.field_r = var6.field_r - var5;
                    break L1;
                  } else {
                    this.a(var6, param0, (byte) -23, var4, var6.field_r, var4 + var5);
                    var4 = var4 + var6.field_r;
                    var5 = var5 - var6.field_r;
                    if (((bl) this).field_m.a(param0, var6, var5, -116, var4)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (ck) (Object) ((bl) this).field_q.c((byte) 102);
            continue L0;
          } else {
            return;
          }
        }
    }

    public static void e(int param0) {
        field_o = null;
        field_n = null;
        field_r = null;
        if (param0 != 0) {
            field_s = null;
            field_s = null;
            return;
        }
        field_s = null;
    }

    final int c() {
        return 0;
    }

    bl(kf param0) {
        ((bl) this).field_q = new ah();
        ((bl) this).field_p = new fg();
        ((bl) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[]{3, 4, 3};
        field_o = "Deaths";
    }
}
