/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class af {
    private int[] field_a;

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = OrbDefence.field_D ? 1 : 0;
                        if (kg.field_h == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        kg.field_h.c(1);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (wj.field_o == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        wj.field_o.a(-31973);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (vg.field_q != null) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            vg.field_q.a((byte) -120);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (ok.field_a != null) {
                            statePc = 11;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var1 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (ok.field_a.length <= var1) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (ok.field_a[var1] != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ok.field_a[var1].a((byte) 63);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 17: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 18: {
                        var1 = 91 % ((param0 - -74) / 37);
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

    af(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= (param0.length >> 938764929) + param0.length) {
            var2 = var2 << 1;
        }
        ((af) this).field_a = new int[var2 + var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((af) this).field_a[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = var2 - 1 & param0[var3];
            while ((((af) this).field_a[var4 + var4 + 1] ^ -1) != 0) {
                var4 = -1 + var2 & var4 - -1;
            }
            ((af) this).field_a[var4 + var4] = param0[var3];
            ((af) this).field_a[1 + (var4 + var4)] = var3;
        }
    }

    final static hj a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        hj var6 = new hj(param0, param0);
        hj var3 = var6;
        for (var4 = 0; var4 < var3.field_v.length; var4++) {
            var6.field_v[var4] = param2;
        }
        if (param1 > -21) {
            return null;
        }
        return var3;
    }

    final static boolean a(mg param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            int discarded$0 = af.a(true, (CharSequence) null, 82, -108);
        }
        int var2 = param0.b((byte) 90);
        int var3 = -2 == (var2 ^ -1) ? 1 : 0;
        return var3 != 0;
    }

    final static int a(boolean param0, CharSequence param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = OrbDefence.field_D ? 1 : 0;
          if (param3 < 2) {
            break L0;
          } else {
            if (param3 > 36) {
              break L0;
            } else {
              var4 = 76 % ((param2 - -75) / 35);
              var5 = 0;
              var6 = 0;
              var7 = 0;
              var8 = param1.length();
              var9 = 0;
              L1: while (true) {
                if (var8 <= var9) {
                  if (var6 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var7;
                  }
                } else {
                  L2: {
                    var10 = param1.charAt(var9);
                    if (var9 == 0) {
                      if (var10 != 45) {
                        if (var10 != 43) {
                          break L2;
                        } else {
                          if (!param0) {
                            break L2;
                          } else {
                            var9++;
                            continue L1;
                          }
                        }
                      } else {
                        var5 = 1;
                        var9++;
                        continue L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (48 > var10) {
                        break L4;
                      } else {
                        if (var10 > 57) {
                          break L4;
                        } else {
                          var10 -= 48;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var10 < 65) {
                        break L5;
                      } else {
                        if (90 >= var10) {
                          var10 -= 55;
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (97 > var10) {
                        break L6;
                      } else {
                        if (var10 > 122) {
                          break L6;
                        } else {
                          var10 -= 87;
                          break L3;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param3 <= var10) {
                    throw new NumberFormatException();
                  } else {
                    L7: {
                      if (var5 != 0) {
                        var10 = -var10;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var11 = var7 * param3 - -var10;
                    if (var7 == var11 / param3) {
                      var6 = 1;
                      var7 = var11;
                      var9++;
                      continue L1;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param1 < -56) {
            break L0;
          } else {
            hj discarded$2 = af.a(63, (byte) -86, 25);
            break L0;
          }
        }
        var3 = (((af) this).field_a.length >> -577030175) + -1;
        var4 = var3 & param0;
        L1: while (true) {
          var5 = ((af) this).field_a[var4 + var4 + 1];
          if (0 == (var5 ^ -1)) {
            return -1;
          } else {
            if (((af) this).field_a[var4 - -var4] == param0) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
