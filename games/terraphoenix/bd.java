/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class bd {
    private int field_h;
    ci[] field_b;
    private int field_e;
    private int field_l;
    static String[] field_f;
    ci field_c;
    static int field_d;
    private boolean field_i;
    static sa field_m;
    private int field_n;
    static String field_j;
    private int field_g;
    static int field_a;
    static mf field_k;

    final bd a(int param0, int param1) {
        ((bd) this).field_l = param1;
        if (param0 != -19426) {
            ((bd) this).field_e = -101;
            return (bd) this;
        }
        return (bd) this;
    }

    final void a(int param0, gl param1, int param2, int param3, hf param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        pk stackIn_25_0 = null;
        String stackIn_25_1 = null;
        pk stackIn_26_0 = null;
        String stackIn_26_1 = null;
        pk stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        pk stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        pk stackIn_29_0 = null;
        String stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        pk stackIn_30_0 = null;
        String stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        pk stackIn_31_0 = null;
        String stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_31_6 = 0;
        int stackIn_31_7 = 0;
        pk stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_32_5 = 0;
        int stackIn_32_6 = 0;
        int stackIn_32_7 = 0;
        pk stackIn_33_0 = null;
        String stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        int stackIn_33_6 = 0;
        int stackIn_33_7 = 0;
        int stackIn_33_8 = 0;
        pk stackOut_24_0 = null;
        String stackOut_24_1 = null;
        pk stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        pk stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        pk stackOut_27_0 = null;
        String stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        pk stackOut_29_0 = null;
        String stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        pk stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        pk stackOut_30_0 = null;
        String stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_30_6 = 0;
        int stackOut_30_7 = 0;
        pk stackOut_32_0 = null;
        String stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        int stackOut_32_6 = 0;
        int stackOut_32_7 = 0;
        int stackOut_32_8 = 0;
        pk stackOut_31_0 = null;
        String stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        int stackOut_31_6 = 0;
        int stackOut_31_7 = 0;
        int stackOut_31_8 = 0;
        L0: {
          jl.a(((bd) this).field_b, param1.field_n, param0 + param1.field_u, param1.field_p, (byte) 18, param1.field_w + param2);
          if (null != ((bd) this).field_c) {
            L1: {
              var6_int = ((bd) this).field_g + param1.field_w + param2;
              if (1 == param4.field_h) {
                var6_int = var6_int + (-((bd) this).field_c.field_q + param1.field_p) / 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = ((bd) this).field_h + (param0 + param1.field_u);
              if (param4.field_a != 1) {
                break L2;
              } else {
                var7 = var7 + (param1.field_n + -((bd) this).field_c.field_u) / 2;
                break L2;
              }
            }
            L3: {
              if (param4.field_h != 2) {
                break L3;
              } else {
                var6_int = var6_int + (-((bd) this).field_c.field_q + param1.field_p);
                break L3;
              }
            }
            L4: {
              if (-3 == (param4.field_a ^ -1)) {
                var7 = var7 + (param1.field_n + -((bd) this).field_c.field_u);
                break L4;
              } else {
                break L4;
              }
            }
            ((bd) this).field_c.b(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        var6 = param4.b(param1, 32032);
        if (var6 != null) {
          if (param4.field_j != null) {
            L5: {
              if (-1 < ((bd) this).field_n) {
                break L5;
              } else {
                L6: {
                  stackOut_24_0 = param4.field_j;
                  stackOut_24_1 = (String) var6;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  if (2147483647 == ((bd) this).field_g) {
                    stackOut_26_0 = (pk) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    break L6;
                  } else {
                    stackOut_25_0 = (pk) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = ((bd) this).field_g;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    break L6;
                  }
                }
                L7: {
                  stackOut_27_0 = (pk) (Object) stackIn_27_0;
                  stackOut_27_1 = (String) (Object) stackIn_27_1;
                  stackOut_27_2 = stackIn_27_2 + (param2 + param1.field_w + param4.field_d);
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_29_2 = stackOut_27_2;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  if (2147483647 == (((bd) this).field_h ^ -1)) {
                    stackOut_29_0 = (pk) (Object) stackIn_29_0;
                    stackOut_29_1 = (String) (Object) stackIn_29_1;
                    stackOut_29_2 = stackIn_29_2;
                    stackOut_29_3 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    stackIn_30_3 = stackOut_29_3;
                    break L7;
                  } else {
                    stackOut_28_0 = (pk) (Object) stackIn_28_0;
                    stackOut_28_1 = (String) (Object) stackIn_28_1;
                    stackOut_28_2 = stackIn_28_2;
                    stackOut_28_3 = ((bd) this).field_h;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    stackIn_30_3 = stackOut_28_3;
                    break L7;
                  }
                }
                L8: {
                  stackOut_30_0 = (pk) (Object) stackIn_30_0;
                  stackOut_30_1 = (String) (Object) stackIn_30_1;
                  stackOut_30_2 = stackIn_30_2;
                  stackOut_30_3 = stackIn_30_3 + (param1.field_u + param0) + param4.field_b;
                  stackOut_30_4 = -param4.field_l + (param1.field_p + -param4.field_d);
                  stackOut_30_5 = param1.field_n + -param4.field_b - param4.field_f;
                  stackOut_30_6 = ((bd) this).field_n;
                  stackOut_30_7 = ((bd) this).field_l;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  stackIn_32_3 = stackOut_30_3;
                  stackIn_32_4 = stackOut_30_4;
                  stackIn_32_5 = stackOut_30_5;
                  stackIn_32_6 = stackOut_30_6;
                  stackIn_32_7 = stackOut_30_7;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  stackIn_31_3 = stackOut_30_3;
                  stackIn_31_4 = stackOut_30_4;
                  stackIn_31_5 = stackOut_30_5;
                  stackIn_31_6 = stackOut_30_6;
                  stackIn_31_7 = stackOut_30_7;
                  if ((((bd) this).field_e ^ -1) != 2147483647) {
                    stackOut_32_0 = (pk) (Object) stackIn_32_0;
                    stackOut_32_1 = (String) (Object) stackIn_32_1;
                    stackOut_32_2 = stackIn_32_2;
                    stackOut_32_3 = stackIn_32_3;
                    stackOut_32_4 = stackIn_32_4;
                    stackOut_32_5 = stackIn_32_5;
                    stackOut_32_6 = stackIn_32_6;
                    stackOut_32_7 = stackIn_32_7;
                    stackOut_32_8 = ((bd) this).field_e;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    stackIn_33_3 = stackOut_32_3;
                    stackIn_33_4 = stackOut_32_4;
                    stackIn_33_5 = stackOut_32_5;
                    stackIn_33_6 = stackOut_32_6;
                    stackIn_33_7 = stackOut_32_7;
                    stackIn_33_8 = stackOut_32_8;
                    break L8;
                  } else {
                    stackOut_31_0 = (pk) (Object) stackIn_31_0;
                    stackOut_31_1 = (String) (Object) stackIn_31_1;
                    stackOut_31_2 = stackIn_31_2;
                    stackOut_31_3 = stackIn_31_3;
                    stackOut_31_4 = stackIn_31_4;
                    stackOut_31_5 = stackIn_31_5;
                    stackOut_31_6 = stackIn_31_6;
                    stackOut_31_7 = stackIn_31_7;
                    stackOut_31_8 = 256;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    stackIn_33_2 = stackOut_31_2;
                    stackIn_33_3 = stackOut_31_3;
                    stackIn_33_4 = stackOut_31_4;
                    stackIn_33_5 = stackOut_31_5;
                    stackIn_33_6 = stackOut_31_6;
                    stackIn_33_7 = stackOut_31_7;
                    stackIn_33_8 = stackOut_31_8;
                    break L8;
                  }
                }
                int discarded$1 = ((pk) (Object) stackIn_33_0).a(stackIn_33_1, stackIn_33_2, stackIn_33_3, stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_33_7, stackIn_33_8, param4.field_h, param4.field_a, param4.field_m);
                break L5;
              }
            }
            if (param3 != 1) {
              ((bd) this).field_g = -106;
              return;
            } else {
              return;
            }
          } else {
            if (param3 != 1) {
              ((bd) this).field_g = -106;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != 1) {
            ((bd) this).field_g = -106;
            return;
          } else {
            return;
          }
        }
    }

    final bd b(int param0, boolean param1) {
        ((bd) this).field_n = param0;
        if (!param1) {
            return null;
        }
        return (bd) this;
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            int var4 = 0;
            mf var5 = null;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            he stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            he stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            he stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            he stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            he stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            he stackOut_13_0 = null;
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
                        var7 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param0 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = pc.a(param0, 0);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param1 != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (param0 == null) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_ref = var3_ref + param1;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            u.a(var3_ref, 113);
                            var8 = qf.a(var3_ref, 0, ":", "%3a");
                            var9 = qf.a(var8, 0, "@", "%40");
                            var4 = -44 % ((3 - param2) / 63);
                            var10 = qf.a(var9, 0, "&", "%26");
                            var11 = qf.a(var10, 0, "#", "%23");
                            if (td.field_b != null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = d.field_K;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = td.field_b.getCodeBase();
                            stackOut_11_4 = new StringBuilder().append("clienterror.ws?c=").append(ve.field_b).append("&u=");
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
                            if (null != sa.field_f) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (he) (Object) stackIn_12_0;
                            stackOut_12_1 = null;
                            stackOut_12_2 = null;
                            stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                            stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                            stackOut_12_5 = "" + pf.field_c;
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
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (he) (Object) stackIn_13_0;
                            stackOut_13_1 = null;
                            stackOut_13_2 = null;
                            stackOut_13_3 = (java.net.URL) (Object) stackIn_13_3;
                            stackOut_13_4 = (StringBuilder) (Object) stackIn_13_4;
                            stackOut_13_5 = sa.field_f;
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
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + he.field_j + "&v2=" + he.field_d + "&e=" + var11);
                            var5 = ((he) (Object) stackIn_14_0).a(stackIn_14_1, -71);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-1 != (var5.field_d ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            gi.a((byte) -122, 1L);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var5.field_d != 1) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var6 = (DataInputStream) var5.field_e;
                            int discarded$1 = var6.read();
                            var6.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
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

    final bd a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 >= -24) {
          L0: {
            bd discarded$13 = ((bd) this).c(-92, -27);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((bd) this).field_i = stackIn_8_1 != 0;
          return (bd) this;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((bd) this).field_i = stackIn_4_1 != 0;
          return (bd) this;
        }
    }

    final bd b(int param0, int param1) {
        if (param0 < 38) {
            field_j = null;
            ((bd) this).field_g = param1;
            return (bd) this;
        }
        ((bd) this).field_g = param1;
        return (bd) this;
    }

    final void a(int param0) {
        ((bd) this).field_h = 0;
        ((bd) this).field_c = null;
        ((bd) this).field_b = null;
        ((bd) this).field_n = 0;
        ((bd) this).field_g = 0;
        ((bd) this).field_l = -1;
        int var2 = 100 / ((param0 - -48) / 47);
        ((bd) this).field_e = 256;
    }

    final void a(int param0, bd param1) {
        param1.field_c = ((bd) this).field_c;
        param1.field_e = ((bd) this).field_e;
        param1.field_i = ((bd) this).field_i;
        param1.field_g = ((bd) this).field_g;
        param1.field_l = ((bd) this).field_l;
        param1.field_b = ((bd) this).field_b;
        int var3 = -63 / ((1 - param0) / 43);
        param1.field_n = ((bd) this).field_n;
        param1.field_h = ((bd) this).field_h;
    }

    final bd a(ci[] param0, byte param1) {
        ((bd) this).field_b = param0;
        if (param1 != 45) {
            return null;
        }
        return (bd) this;
    }

    final void a(gl param0, bd param1, hf param2, int param3, byte param4, int param5) {
        L0: {
          if (((bd) this).field_i) {
            param1.a(param3, param0, param5, 1, param2);
            param1.a(-95);
            break L0;
          } else {
            break L0;
          }
        }
        if ((((bd) this).field_l ^ -1) > 0) {
          if ((((bd) this).field_g ^ -1) == 2147483647) {
            L1: {
              if (-2147483648 != ((bd) this).field_h) {
                param1.field_h = ((bd) this).field_h;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((((bd) this).field_e ^ -1) != 2147483647) {
                param1.field_e = ((bd) this).field_e;
                break L2;
              } else {
                break L2;
              }
            }
            if (param4 < -125) {
              L3: {
                if (((bd) this).field_n >= -1) {
                  param1.field_n = ((bd) this).field_n;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((bd) this).field_c != null) {
                  param1.field_c = ((bd) this).field_c;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (null != ((bd) this).field_b) {
                param1.field_b = ((bd) this).field_b;
                return;
              } else {
                return;
              }
            } else {
              L5: {
                bd discarded$4 = ((bd) this).b(-126, true);
                if (((bd) this).field_n >= -1) {
                  param1.field_n = ((bd) this).field_n;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (((bd) this).field_c != null) {
                  param1.field_c = ((bd) this).field_c;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (null != ((bd) this).field_b) {
                param1.field_b = ((bd) this).field_b;
                return;
              } else {
                return;
              }
            }
          } else {
            L7: {
              param1.field_g = ((bd) this).field_g;
              if (-2147483648 != ((bd) this).field_h) {
                param1.field_h = ((bd) this).field_h;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((((bd) this).field_e ^ -1) != 2147483647) {
                param1.field_e = ((bd) this).field_e;
                break L8;
              } else {
                break L8;
              }
            }
            if (param4 < -125) {
              L9: {
                if (((bd) this).field_n >= -1) {
                  param1.field_n = ((bd) this).field_n;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (((bd) this).field_c != null) {
                  param1.field_c = ((bd) this).field_c;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (null != ((bd) this).field_b) {
                param1.field_b = ((bd) this).field_b;
                return;
              } else {
                return;
              }
            } else {
              L11: {
                bd discarded$5 = ((bd) this).b(-126, true);
                if (((bd) this).field_n >= -1) {
                  param1.field_n = ((bd) this).field_n;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (((bd) this).field_c != null) {
                  param1.field_c = ((bd) this).field_c;
                  break L12;
                } else {
                  break L12;
                }
              }
              if (null != ((bd) this).field_b) {
                param1.field_b = ((bd) this).field_b;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          param1.field_l = ((bd) this).field_l;
          if ((((bd) this).field_g ^ -1) != 2147483647) {
            L13: {
              param1.field_g = ((bd) this).field_g;
              if (-2147483648 != ((bd) this).field_h) {
                param1.field_h = ((bd) this).field_h;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if ((((bd) this).field_e ^ -1) != 2147483647) {
                param1.field_e = ((bd) this).field_e;
                break L14;
              } else {
                break L14;
              }
            }
            if (param4 >= -125) {
              L15: {
                bd discarded$6 = ((bd) this).b(-126, true);
                if (((bd) this).field_n >= -1) {
                  param1.field_n = ((bd) this).field_n;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (((bd) this).field_c != null) {
                  param1.field_c = ((bd) this).field_c;
                  break L16;
                } else {
                  break L16;
                }
              }
              if (null != ((bd) this).field_b) {
                param1.field_b = ((bd) this).field_b;
                return;
              } else {
                return;
              }
            } else {
              L17: {
                if (((bd) this).field_n >= -1) {
                  param1.field_n = ((bd) this).field_n;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (((bd) this).field_c != null) {
                  param1.field_c = ((bd) this).field_c;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (null == ((bd) this).field_b) {
                  break L19;
                } else {
                  param1.field_b = ((bd) this).field_b;
                  break L19;
                }
              }
              return;
            }
          } else {
            L20: {
              if (-2147483648 != ((bd) this).field_h) {
                param1.field_h = ((bd) this).field_h;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if ((((bd) this).field_e ^ -1) != 2147483647) {
                param1.field_e = ((bd) this).field_e;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param4 < -125) {
                break L22;
              } else {
                bd discarded$7 = ((bd) this).b(-126, true);
                break L22;
              }
            }
            L23: {
              if (((bd) this).field_n >= -1) {
                param1.field_n = ((bd) this).field_n;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (((bd) this).field_c != null) {
                param1.field_c = ((bd) this).field_c;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (null == ((bd) this).field_b) {
                break L25;
              } else {
                param1.field_b = ((bd) this).field_b;
                break L25;
              }
            }
            return;
          }
        }
    }

    final bd c(int param0, int param1) {
        ((bd) this).field_h = param1;
        if (param0 != 2) {
            return null;
        }
        return (bd) this;
    }

    bd() {
        ((bd) this).field_h = -2147483648;
        ((bd) this).field_e = -2147483648;
        ((bd) this).field_i = false;
        ((bd) this).field_b = null;
        ((bd) this).field_c = null;
        ((bd) this).field_g = -2147483648;
        ((bd) this).field_l = -2;
        ((bd) this).field_n = -2;
    }

    public static void b(int param0) {
        field_k = null;
        field_m = null;
        field_j = null;
        field_f = null;
        int var1 = 119 % ((param0 - -36) / 41);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"The basic military fatigues offer minimal protection to attacks.", "Combat armour uses advanced reactive plating to absorb attacks and deflect damage away from the wearer.", "Battle armour uses alien-armoured plates taken from the battle field and their UFOs, remoulding them to provide a suit of tight fitting armour that will greatly increace the chance of our soldiers surviving in the field against the aliens' superior firepower.", "Shielded armour takes a regular suit of battle armour and places an alien shield module in the chest piece. This has the effect of allowing a soldier to use a heavy weapon while also recieving the benefit of all-round shielding."};
        field_j = "achievements to collect";
        field_d = 4;
    }
}
