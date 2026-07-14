/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sma {
    static String field_d;
    static joa field_e;
    int[] field_b;
    static en field_c;
    private int[] field_f;
    private ff field_a;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        ((sma) this).field_f = new int[((sma) this).field_a.field_P];
        ((sma) this).field_b = new int[((sma) this).field_a.field_P];
        if (param0 >= -43) {
            return;
        }
        for (var2 = 0; var2 < ((sma) this).field_b.length; var2++) {
            ((sma) this).field_b[var2] = var2;
            ((sma) this).field_f[var2] = var2;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 67 / ((-44 - param0) / 54);
        field_d = null;
    }

    final static int a(String param0, int param1) {
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var8_int = 0;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = TombRacer.field_G ? 1 : 0;
                    if (param1 == 28893) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    sma.a(47);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (!hna.field_a.field_c) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return -1;
                }
                case 5: {
                    if (!gj.field_d.containsKey((Object) (Object) param0)) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return 100;
                }
                case 7: {
                    var10 = eba.a((byte) 38, param0);
                    if (var10 != null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return -1;
                }
                case 9: {
                    var3 = aqa.field_c + var10;
                    if (af.field_b.a(var3, "", param1 + -28893)) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return -1;
                }
                case 11: {
                    if (af.field_b.c(var3, -122)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return af.field_b.a(var3, true);
                }
                case 13: {
                    var19 = af.field_b.a(var3, (byte) 117, "");
                    var17 = var19;
                    var15 = var17;
                    var13 = var15;
                    var4 = var13;
                    var5 = null;
                    var11 = iba.a(var10, (byte) -94);
                    if (var4 == null) {
                        statePc = 31;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var11 != null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return -1;
                }
                case 16: {
                    var6 = 1;
                    var18 = vj.a(var11, (byte) -86);
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var7 = var12;
                    if (var7 == null) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var18.length == var19.length) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var6 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 20: {
                    var8_int = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var18.length <= var8_int) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var19[var8_int] != var18[var8_int]) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var6 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    var8_int++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        if (var6 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        boolean discarded$1 = hna.field_a.a(var19, var11, true);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var8 = caughtException;
                    return -1;
                }
                case 30: {
                    mj.a(param0, var11, 1);
                    return 100;
                }
                case 31: {
                    return -1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        hca[] var5 = null;
        int var6 = 0;
        hca var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        ((sma) this).field_b = new int[((sma) this).field_a.field_H.length];
        ((sma) this).field_f = new int[((sma) this).field_a.field_H.length];
        var2 = 0;
        L0: while (true) {
          if (((sma) this).field_a.field_H.length <= var2) {
            if (!param0) {
              var2 = 0;
              L1: while (true) {
                if (((sma) this).field_f.length <= var2) {
                  return;
                } else {
                  var3 = -1;
                  var4 = 0;
                  var5 = ((sma) this).field_a.field_H;
                  var6 = 0;
                  L2: while (true) {
                    L3: {
                      if (var5.length <= var6) {
                        break L3;
                      } else {
                        var7 = var5[var6];
                        if (!((sma) this).field_a.f((byte) -83, var7.A(0))) {
                          if (-1 == ((sma) this).field_f[var7.A(0)]) {
                            L4: {
                              L5: {
                                var8 = var7.e(false) + var7.j(false);
                                if (var3 == -1) {
                                  var4 = var8;
                                  var3 = var7.A(0);
                                  var6++;
                                  break L5;
                                } else {
                                  if (var4 < var8) {
                                    var4 = var8;
                                    var3 = var7.A(0);
                                    break L5;
                                  } else {
                                    if (var4 == var8) {
                                      if (((sma) this).field_a.field_c.field_b[var7.A(0)] < ((sma) this).field_a.field_c.field_b[var3]) {
                                        var4 = var8;
                                        var3 = var7.A(0);
                                        break L4;
                                      } else {
                                        var6++;
                                        continue L2;
                                      }
                                    } else {
                                      var6++;
                                      continue L2;
                                    }
                                  }
                                }
                              }
                              var6++;
                              break L4;
                            }
                            var6++;
                            var6++;
                            break L3;
                          } else {
                            var6++;
                            continue L2;
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    }
                    if (-1 != var3) {
                      ((sma) this).field_b[var2] = var3;
                      ((sma) this).field_f[var3] = var2;
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            ((sma) this).field_b[var2] = -1;
            ((sma) this).field_f[var2] = -1;
            var2++;
            continue L0;
          }
        }
    }

    sma(ff param0) {
        ((sma) this).field_a = param0;
        this.a((byte) -54);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Exploiting a bug";
        field_e = new joa();
    }
}
