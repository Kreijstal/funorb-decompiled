/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class he extends ib implements en {
    static oh field_H;
    private d field_K;
    private d field_I;
    static String[] field_L;
    private d field_J;

    final static ff a(long param0, int param1, boolean param2, String param3, String param4) {
        Object var7 = null;
        L0: {
          if (param1 == 20) {
            break L0;
          } else {
            var7 = null;
            ff discarded$2 = he.a(-13L, 34, false, (String) null, (String) null);
            break L0;
          }
        }
        L1: {
          if (0L != param0) {
            break L1;
          } else {
            if (param4 != null) {
              return (ff) (Object) new eb(param4, param3);
            } else {
              break L1;
            }
          }
        }
        if (!param2) {
          return (ff) (Object) new bo(param0, param3);
        } else {
          return (ff) (Object) new cm(param0, param3);
        }
    }

    public he() {
        super(0, 0, 476, 225, (ub) null);
        ((he) this).field_I = new d(bd.field_a, (uh) null);
        ((he) this).field_K = new d(se.field_l, (uh) null);
        ((he) this).field_J = new d(nd.field_d, (uh) null);
        hi var1 = new hi();
        ((he) this).field_I.field_l = (ub) (Object) var1;
        ((he) this).field_K.field_l = (ub) (Object) var1;
        ((he) this).field_J.field_l = (ub) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1520159551;
        ((he) this).field_K.a(30, ((he) this).field_t + -var3 >> -1577851231, ((he) this).field_s + (-48 + -var2), (byte) -119, var4);
        ((he) this).field_J.a(30, (-var3 + ((he) this).field_t >> 161111425) + (var4 - -var2), -var2 + (-48 + ((he) this).field_s), (byte) -119, var4);
        ((he) this).field_I.a(30, ((he) this).field_t - var3 >> -1089739839, ((he) this).field_s - (78 - -(var2 * 2)), (byte) -119, var3);
        ((he) this).field_K.field_i = (uh) this;
        ((he) this).field_I.field_i = (uh) this;
        ((he) this).field_I.field_z = ie.field_q;
        ((he) this).field_J.field_i = (uh) this;
        ((he) this).field_J.field_z = wp.field_i;
        ((he) this).a((oc) (Object) ((he) this).field_K, true);
        ((he) this).a((oc) (Object) ((he) this).field_I, true);
        ((he) this).a((oc) (Object) ((he) this).field_J, true);
    }

    final static void a(wq param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = BrickABrac.field_J ? 1 : 0;
                        var9 = new byte[24];
                        var7 = var9;
                        var6 = var7;
                        var10 = var6;
                        var8 = var10;
                        var2 = var8;
                        if (go.field_a == null) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            go.field_a.a(0, 0L);
                            go.field_a.a(var9, (byte) -29);
                            var3_int = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (-25 >= (var3_int ^ -1)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var10[var3_int] == -1) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_int++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (-25 <= var3_int) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (var4 >= 24) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (param1 <= -41) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        field_H = null;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        param0.a(var10, -1, 0, 24);
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

    final boolean a(int param0, byte param1, oc param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (98 == param0) {
            return ((he) this).b(param2, (byte) 117);
        }
        if (99 == param0) {
            return ((he) this).a(param2, (byte) -116);
        }
        return false;
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          var2 = param0.length();
          if (20 < var2) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var8 = new char[var2];
          var7 = var8;
          var3 = var7;
          if (param1 == -58) {
            break L1;
          } else {
            field_H = null;
            break L1;
          }
        }
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            return new String(var8);
          } else {
            L3: {
              var5 = param0.charAt(var4);
              if (var5 < 65) {
                break L3;
              } else {
                if (90 < var5) {
                  break L3;
                } else {
                  var3[var4] = (char)(-65 + (var5 + 97));
                  var4++;
                  continue L2;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var5 < 48) {
                  break L6;
                } else {
                  if (var5 > 57) {
                    break L6;
                  } else {
                    break L4;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (param2 <= -22) {
            break L0;
          } else {
            var8 = null;
            he.a((wq) null, (byte) -62);
            break L0;
          }
        }
        L1: {
          if (((he) this).field_K == param4) {
            ee.d(-117);
            break L1;
          } else {
            if (((he) this).field_I == param4) {
              fr.d(-1);
              break L1;
            } else {
              if (param4 != ((he) this).field_J) {
                break L1;
              } else {
                cc.f(967);
                break L1;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_H = null;
        if (param0 != 36) {
            field_H = null;
        }
        field_L = null;
    }

    final static void a(String param0, boolean param1, byte param2) {
        if (param2 <= 18) {
            field_H = null;
        }
        sm.field_b = oh.field_b;
        ln.field_k = param1 ? true : false;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = ((he) this).field_o + param1;
        int var6 = param0 + ((he) this).field_w;
        int discarded$0 = a.field_u.a(qo.field_H, var5 - -20, 20 + var6, ((he) this).field_t - 40, -50 + ((he) this).field_s, 16777215, -1, 1, 0, a.field_u.field_F);
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
