/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vd extends rk {
    private static StringBuilder field_p;
    private int[] field_v;
    private int[] field_w;
    private int[] field_t;
    private static int field_y;
    private static int field_r;
    int field_E;
    private static int field_I;
    private static int field_F;
    private static int field_D;
    private byte[] field_u;
    private static int field_z;
    int field_M;
    private static int field_L;
    private static int field_H;
    private static int field_x;
    private static String[] field_K;
    private static int field_A;
    int field_q;
    private jf[] field_s;
    int field_B;
    private int[] field_J;
    private int[] field_C;
    private int[] field_G;

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - ((vd) this).b(param0) / 2, param2);
    }

    final int a(char param0) {
        return ((vd) this).field_G[nf.a(26614, param0) & 255];
    }

    final int c(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = ((vd) this).a(param0, new int[1], field_K);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var3) {
            return var4;
          } else {
            var6 = ((vd) this).b(field_K[var5]);
            if (var6 > var4) {
              var4 = var6;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (param0 != null) {
          L0: {
            this.a(param5, param6, param7);
            if (param10 != 0) {
              break L0;
            } else {
              param10 = ((vd) this).field_E;
              break L0;
            }
          }
          L1: {
            var12 = new int[]{param3};
            if (param4 >= ((vd) this).field_M + ((vd) this).field_B + param10) {
              break L1;
            } else {
              if (param4 >= param10 + param10) {
                break L1;
              } else {
                var12 = null;
                break L1;
              }
            }
          }
          L2: {
            var13 = ((vd) this).a(param0, var12, field_K);
            if (param9 != 3) {
              break L2;
            } else {
              if (var13 != 1) {
                break L2;
              } else {
                param9 = 1;
                break L2;
              }
            }
          }
          L3: {
            if (param9 != 0) {
              if (param9 != 1) {
                if (param9 != 2) {
                  L4: {
                    var15 = (param4 - ((vd) this).field_M - ((vd) this).field_B - (var13 - 1) * param10) / (var13 + 1);
                    if (var15 >= 0) {
                      break L4;
                    } else {
                      var15 = 0;
                      break L4;
                    }
                  }
                  var14 = param2 + ((vd) this).field_M + var15;
                  param10 = param10 + var15;
                  break L3;
                } else {
                  var14 = param2 + param4 - ((vd) this).field_B - (var13 - 1) * param10;
                  break L3;
                }
              } else {
                var14 = param2 + ((vd) this).field_M + (param4 - ((vd) this).field_M - ((vd) this).field_B - (var13 - 1) * param10) / 2;
                break L3;
              }
            } else {
              var14 = param2 + ((vd) this).field_M;
              break L3;
            }
          }
          var15 = 0;
          L5: while (true) {
            if (var15 >= var13) {
              return var13;
            } else {
              if (param8 != 0) {
                if (param8 != 1) {
                  if (param8 != 2) {
                    L6: {
                      if (var15 != var13 - 1) {
                        this.a(field_K[var15], param3);
                        this.b(field_K[var15], param1, var14);
                        field_L = 0;
                        break L6;
                      } else {
                        this.b(field_K[var15], param1, var14);
                        break L6;
                      }
                    }
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  } else {
                    this.b(field_K[var15], param1 + param3 - ((vd) this).b(field_K[var15]), var14);
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  }
                } else {
                  this.b(field_K[var15], param1 + (param3 - ((vd) this).b(field_K[var15])) / 2, var14);
                  var14 = var14 + param10;
                  var15++;
                  continue L5;
                }
              } else {
                this.b(field_K[var15], param1, var14);
                var14 = var14 + param10;
                var15++;
                continue L5;
              }
            }
          }
        } else {
          return 0;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return ((vd) this).a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1, param2);
    }

    private final void b(String param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9_ref = null;
        int var9 = 0;
        Exception var10_ref_Exception = null;
        int var10 = 0;
        int var11 = 0;
        jf var11_ref_jf = null;
        int var12 = 0;
        CharSequence var13 = null;
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    param2 = param2 - ((vd) this).field_E;
                    var4 = -1;
                    var5 = 0;
                    var6 = param0.length();
                    var7 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var7 >= var6) {
                        statePc = 53;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var8 = param0.charAt(var7);
                    if (var8 != 60) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = var7;
                    var7++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 4: {
                    if (var8 != 62) {
                        statePc = 33;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var4 == -1) {
                        statePc = 33;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var9_ref = param0.substring(var4 + 1, var7).toLowerCase();
                    var4 = -1;
                    if (!var9_ref.equals((Object) (Object) "lt")) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8 = 60;
                    statePc = 33;
                    continue stateLoop;
                }
                case 8: {
                    if (!var9_ref.equals((Object) (Object) "gt")) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var8 = 62;
                    statePc = 33;
                    continue stateLoop;
                }
                case 10: {
                    if (!var9_ref.equals((Object) (Object) "nbsp")) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var8 = 160;
                    statePc = 33;
                    continue stateLoop;
                }
                case 12: {
                    if (!var9_ref.equals((Object) (Object) "shy")) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8 = 173;
                    statePc = 33;
                    continue stateLoop;
                }
                case 14: {
                    if (!var9_ref.equals((Object) (Object) "times")) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var8 = 215;
                    statePc = 33;
                    continue stateLoop;
                }
                case 16: {
                    if (!var9_ref.equals((Object) (Object) "euro")) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var8 = 8364;
                    statePc = 33;
                    continue stateLoop;
                }
                case 18: {
                    if (!var9_ref.equals((Object) (Object) "copy")) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var8 = 169;
                    statePc = 33;
                    continue stateLoop;
                }
                case 20: {
                    if (!var9_ref.equals((Object) (Object) "reg")) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var8 = 174;
                    statePc = 33;
                    continue stateLoop;
                }
                case 22: {
                    if (!var9_ref.startsWith("img=")) {
                        statePc = 32;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    try {
                        var13 = (CharSequence) (Object) var9_ref.substring(4);
                        var10 = ph.a(1124, var13);
                        var11_ref_jf = ((vd) this).field_s[var10];
                        if (((vd) this).field_C == null) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = ((vd) this).field_C[var10];
                        stackIn_26_0 = stackOut_24_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = var11_ref_jf.field_j;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var12 = stackIn_26_0;
                        if (field_I != 256) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var11_ref_jf.a(param1, param2 + ((vd) this).field_E - var12);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var11_ref_jf.a(param1, param2 + ((vd) this).field_E - var12, field_I);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param1 = param1 + var11_ref_jf.field_b;
                        var5 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var7++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 31: {
                    var10_ref_Exception = (Exception) (Object) caughtException;
                    var7++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 32: {
                    this.a(var9_ref);
                    var7++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 33: {
                    if (var4 == -1) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var7++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 35: {
                    var8 = (char)(nf.a(26614, (char) var8) & 255);
                    if (((vd) this).field_u == null) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var5 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    param1 = param1 + ((vd) this).field_u[(var5 << 8) + var8];
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var9 = ((vd) this).field_w[var8];
                    var10 = ((vd) this).field_v[var8];
                    var11 = param1;
                    if (var8 == 32) {
                        statePc = 46;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (field_I != 256) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (field_A == -1) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((vd) this).a(var8, param1 + ((vd) this).field_t[var8] + 1, param2 + ((vd) this).field_J[var8] + 1, var9, var10, field_A, true);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    ((vd) this).a(var8, param1 + ((vd) this).field_t[var8], param2 + ((vd) this).field_J[var8], var9, var10, field_y, false);
                    statePc = 48;
                    continue stateLoop;
                }
                case 43: {
                    if (field_A == -1) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((vd) this).a(var8, param1 + ((vd) this).field_t[var8] + 1, param2 + ((vd) this).field_J[var8] + 1, var9, var10, field_A, field_I, true);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    ((vd) this).a(var8, param1 + ((vd) this).field_t[var8], param2 + ((vd) this).field_J[var8], var9, var10, field_y, field_I, false);
                    statePc = 48;
                    continue stateLoop;
                }
                case 46: {
                    if (field_L <= 0) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    field_F = field_F + field_L;
                    param1 = param1 + (field_F >> 8);
                    field_F = field_F & 255;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    param1 = param1 + ((vd) this).field_G[var8];
                    if (field_D == -1) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ed.f(var11, param2 + (int)((double)((vd) this).field_E * 0.7), param1 - var11, field_D);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (field_H == -1) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ed.f(var11, param2 + ((vd) this).field_E + 1, param1 - var11, field_H);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var5 = var8;
                    var7++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 53: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        field_D = -1;
        field_H = -1;
        field_z = param1;
        field_A = param1;
        field_x = param0;
        field_y = param0;
        field_r = param2;
        field_I = param2;
        field_L = 0;
        field_F = 0;
    }

    final int b(String param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        Exception var9 = null;
        int var9_int = 0;
        CharSequence var10 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return 0;
                }
                case 2: {
                    var2 = -1;
                    var3 = 0;
                    var4 = 0;
                    var5 = param0.length();
                    var6 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var6 >= var5) {
                        statePc = 35;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var7 = param0.charAt(var6);
                    if (var7 != 60) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2 = var6;
                    var6++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    if (var7 != 62) {
                        statePc = 29;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var2 == -1) {
                        statePc = 29;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8 = param0.substring(var2 + 1, var6).toLowerCase();
                    var2 = -1;
                    if (!var8.equals((Object) (Object) "lt")) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var7 = 60;
                    statePc = 29;
                    continue stateLoop;
                }
                case 10: {
                    if (!var8.equals((Object) (Object) "gt")) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var7 = 62;
                    statePc = 29;
                    continue stateLoop;
                }
                case 12: {
                    if (!var8.equals((Object) (Object) "nbsp")) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var7 = 160;
                    statePc = 29;
                    continue stateLoop;
                }
                case 14: {
                    if (!var8.equals((Object) (Object) "shy")) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = 173;
                    statePc = 29;
                    continue stateLoop;
                }
                case 16: {
                    if (!var8.equals((Object) (Object) "times")) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var7 = 215;
                    statePc = 29;
                    continue stateLoop;
                }
                case 18: {
                    if (!var8.equals((Object) (Object) "euro")) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var7 = 8364;
                    statePc = 29;
                    continue stateLoop;
                }
                case 20: {
                    if (!var8.equals((Object) (Object) "copy")) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var7 = 169;
                    statePc = 29;
                    continue stateLoop;
                }
                case 22: {
                    if (!var8.equals((Object) (Object) "reg")) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var7 = 174;
                    statePc = 29;
                    continue stateLoop;
                }
                case 24: {
                    if (var8.startsWith("img=")) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var6++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        var10 = (CharSequence) (Object) var8.substring(4);
                        var9_int = ph.a(1124, var10);
                        var4 = var4 + ((vd) this).field_s[var9_int].field_b;
                        var3 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var6++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 28: {
                    var9 = (Exception) (Object) caughtException;
                    var6++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 29: {
                    if (var2 == -1) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var6++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 31: {
                    var7 = (char)(nf.a(26614, (char) var7) & 255);
                    var4 = var4 + ((vd) this).field_G[var7];
                    if (((vd) this).field_u == null) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var3 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var4 = var4 + ((vd) this).field_u[(var3 << 8) + var7];
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var3 = var7;
                    var6++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 35: {
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a() {
        field_p = null;
        field_K = null;
    }

    private final void a(byte[] param0) {
        int var2 = 0;
        int var3_int = 0;
        int[] var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        byte[][] var5 = null;
        int var6_int = 0;
        byte[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        byte[][] var11 = null;
        byte[][] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        byte[][] var19 = null;
        byte[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        byte[][] var23 = null;
        byte[][] var24 = null;
        int[] var25 = null;
        L0: {
          ((vd) this).field_G = new int[256];
          if (param0.length != 257) {
            var2 = 0;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 256) {
                var22 = new int[256];
                var18 = var22;
                var14 = var18;
                var10 = var14;
                var3 = var10;
                var25 = new int[256];
                var21 = var25;
                var17 = var21;
                var13 = var17;
                var4 = var13;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= 256) {
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= 256) {
                        var23 = new byte[256][];
                        var19 = var23;
                        var15 = var19;
                        var11 = var15;
                        var5 = var11;
                        var6_int = 0;
                        L4: while (true) {
                          if (var6_int >= 256) {
                            var24 = new byte[256][];
                            var20 = var24;
                            var16 = var20;
                            var12 = var16;
                            var6 = var12;
                            var7 = 0;
                            L5: while (true) {
                              if (var7 >= 256) {
                                ((vd) this).field_u = new byte[65536];
                                var7 = 0;
                                L6: while (true) {
                                  if (var7 >= 256) {
                                    ((vd) this).field_E = var25[32] + var22[32];
                                    break L0;
                                  } else {
                                    if (var7 != 32) {
                                      if (var7 != 160) {
                                        var8 = 0;
                                        L7: while (true) {
                                          if (var8 < 256) {
                                            if (var8 != 32) {
                                              if (var8 != 160) {
                                                ((vd) this).field_u[(var7 << 8) + var8] = (byte)vd.a(var23, var24, var25, ((vd) this).field_G, var22, var7, var8);
                                                var8++;
                                                continue L7;
                                              } else {
                                                var8++;
                                                continue L7;
                                              }
                                            } else {
                                              var8++;
                                              continue L7;
                                            }
                                          } else {
                                            var7++;
                                            continue L6;
                                          }
                                        }
                                      } else {
                                        var7++;
                                        continue L6;
                                      }
                                    } else {
                                      var7++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                var6[var7] = new byte[var22[var7]];
                                var8 = 0;
                                var9 = 0;
                                L8: while (true) {
                                  if (var9 >= var24[var7].length) {
                                    var7++;
                                    continue L5;
                                  } else {
                                    var2++;
                                    var8 = (byte)(var8 + param0[var2]);
                                    var24[var7][var9] = (byte)var8;
                                    var9++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            var5[var6_int] = new byte[var22[var6_int]];
                            var7 = 0;
                            var8 = 0;
                            L9: while (true) {
                              if (var8 >= var23[var6_int].length) {
                                var6_int++;
                                continue L4;
                              } else {
                                var2++;
                                var7 = (byte)(var7 + param0[var2]);
                                var23[var6_int][var8] = (byte)var7;
                                var8++;
                                continue L9;
                              }
                            }
                          }
                        }
                      } else {
                        var2++;
                        var4[var5_int] = param0[var2] & 255;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var2++;
                    var3[var5_int] = param0[var2] & 255;
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                var2++;
                ((vd) this).field_G[var3_int] = param0[var2] & 255;
                var3_int++;
                continue L1;
              }
            }
          } else {
            var2 = 0;
            L10: while (true) {
              if (var2 >= ((vd) this).field_G.length) {
                ((vd) this).field_E = param0[256] & 255;
                break L0;
              } else {
                ((vd) this).field_G[var2] = param0[var2] & 255;
                var2++;
                continue L10;
              }
            }
          }
        }
    }

    private final void a(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var3 = 0;
        var4 = 0;
        var5 = param0.length();
        var6 = 0;
        L0: while (true) {
          if (var6 >= var5) {
            L1: {
              if (var3 <= 0) {
                break L1;
              } else {
                field_L = (param1 - ((vd) this).b(param0) << 8) / var3;
                break L1;
              }
            }
            return;
          } else {
            var7 = param0.charAt(var6);
            if (var7 != 60) {
              if (var7 != 62) {
                if (var4 == 0) {
                  if (var7 == 32) {
                    var3++;
                    var6++;
                    continue L0;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var4 = 0;
                var6++;
                continue L0;
              }
            } else {
              var4 = 1;
              var6++;
              continue L0;
            }
          }
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    private final static int a(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        byte[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var7 = param2[param5];
          var8 = var7 + param4[param5];
          var9 = param2[param6];
          var10 = var9 + param4[param6];
          var11 = var7;
          if (var9 <= var7) {
            break L0;
          } else {
            var11 = var9;
            break L0;
          }
        }
        L1: {
          var12 = var8;
          if (var10 >= var8) {
            break L1;
          } else {
            var12 = var10;
            break L1;
          }
        }
        L2: {
          var13 = param3[param5];
          if (param3[param6] >= var13) {
            break L2;
          } else {
            var13 = param3[param6];
            break L2;
          }
        }
        var14 = param1[param5];
        var15 = param0[param6];
        var16 = var11 - var7;
        var17 = var11 - var9;
        var18 = var11;
        L3: while (true) {
          if (var18 >= var12) {
            return -var13;
          } else {
            var16++;
            var17++;
            var19 = var14[var16] + var15[var17];
            if (var19 < var13) {
              var13 = var19;
              var18++;
              continue L3;
            } else {
              var18++;
              continue L3;
            }
          }
        }
    }

    private final void a(String param0) {
        Exception var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param0.startsWith("col=")) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var3 = (CharSequence) (Object) param0.substring(4);
                        field_y = vg.a(16, true, var3);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!param0.equals((Object) (Object) "/col")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        field_y = field_x;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!param0.startsWith("trans=")) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = (CharSequence) (Object) param0.substring(6);
                        field_I = ph.a(1124, var4);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0.equals((Object) (Object) "/trans")) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_I = field_r;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!param0.startsWith("str=")) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = (CharSequence) (Object) param0.substring(4);
                        field_D = vg.a(16, true, var5);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!param0.equals((Object) (Object) "str")) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_D = 8388608;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!param0.equals((Object) (Object) "/str")) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        field_D = -1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!param0.startsWith("u=")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = (CharSequence) (Object) param0.substring(2);
                        field_H = vg.a(16, true, var6);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (!param0.equals((Object) (Object) "u")) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        field_H = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!param0.equals((Object) (Object) "/u")) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        field_H = -1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!param0.startsWith("shad=")) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = (CharSequence) (Object) param0.substring(5);
                        field_A = vg.a(16, true, var7);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!param0.equals((Object) (Object) "shad")) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        field_A = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!param0.equals((Object) (Object) "/shad")) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        field_A = field_z;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!param0.equals((Object) (Object) "br")) {
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
                        this.a(field_x, field_z, field_r);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var2 = (Exception) (Object) caughtException;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(String param0, int param1, int param2) {
        if (param2 == 0) {
            param2 = ((vd) this).field_E;
        }
        int var4 = ((vd) this).a(param0, new int[1], field_K);
        int var5 = (var4 - 1) * param2;
        return ((vd) this).field_M + var5 + ((vd) this).field_B;
    }

    final int b(String param0, int param1) {
        return ((vd) this).a(param0, new int[1], field_K);
    }

    final int a(String param0, int[] param1, String[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Exception var16 = null;
        int var16_int = 0;
        Object var17 = null;
        CharSequence var18 = null;
        int stackIn_66_0 = 0;
        int[] stackIn_66_1 = null;
        int stackIn_67_0 = 0;
        int[] stackIn_67_1 = null;
        int stackIn_68_0 = 0;
        int[] stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        int[] stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        int stackOut_65_0 = 0;
        int[] stackOut_65_1 = null;
        int stackOut_67_0 = 0;
        int[] stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = null;
                    if (param0 != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return 0;
                }
                case 2: {
                    StringBuilder discarded$10 = th.a(field_p, ' ', 0, 1);
                    var4 = 0;
                    var5 = 0;
                    var6 = -1;
                    var7 = 0;
                    var8 = 0;
                    var9 = -1;
                    var10 = 0;
                    var11 = 0;
                    var12 = param0.length();
                    var13 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var13 >= var12) {
                        statePc = 74;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var14 = param0.charAt(var13);
                    if (var14 != 60) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var9 = var13;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 6: {
                    if (var14 != 62) {
                        statePc = 55;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var9 == -1) {
                        statePc = 55;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var15 = param0.substring(var9 + 1, var13).toLowerCase();
                    var9 = -1;
                    StringBuilder discarded$11 = field_p.append(60);
                    StringBuilder discarded$12 = field_p.append(var15);
                    StringBuilder discarded$13 = field_p.append(62);
                    if (!var15.equals((Object) (Object) "br")) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    param2[var11] = field_p.toString().substring(var5, field_p.length());
                    var11++;
                    var5 = field_p.length();
                    var4 = 0;
                    var6 = -1;
                    var10 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 10: {
                    if (!var15.equals((Object) (Object) "lt")) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = var4 + ((vd) this).a('<');
                    if (((vd) this).field_u == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var10 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + 60];
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var10 = 60;
                    statePc = 54;
                    continue stateLoop;
                }
                case 15: {
                    if (!var15.equals((Object) (Object) "gt")) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var4 = var4 + ((vd) this).a('>');
                    if (((vd) this).field_u == null) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var10 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + 62];
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var10 = 62;
                    statePc = 54;
                    continue stateLoop;
                }
                case 20: {
                    if (!var15.equals((Object) (Object) "nbsp")) {
                        statePc = 25;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4 = var4 + ((vd) this).a(' ');
                    if (((vd) this).field_u == null) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var10 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + 160];
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var10 = 160;
                    statePc = 54;
                    continue stateLoop;
                }
                case 25: {
                    if (!var15.equals((Object) (Object) "shy")) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var4 = var4 + ((vd) this).a('­');
                    if (((vd) this).field_u == null) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var10 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + 173];
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var10 = 173;
                    statePc = 54;
                    continue stateLoop;
                }
                case 30: {
                    if (!var15.equals((Object) (Object) "times")) {
                        statePc = 35;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var4 = var4 + ((vd) this).a('×');
                    if (((vd) this).field_u == null) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var10 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + 215];
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var10 = 215;
                    statePc = 54;
                    continue stateLoop;
                }
                case 35: {
                    if (!var15.equals((Object) (Object) "euro")) {
                        statePc = 40;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var4 = var4 + ((vd) this).a('€');
                    if (((vd) this).field_u == null) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var10 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + 128];
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var10 = 8364;
                    statePc = 54;
                    continue stateLoop;
                }
                case 40: {
                    if (!var15.equals((Object) (Object) "copy")) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var4 = var4 + ((vd) this).a('©');
                    if (((vd) this).field_u == null) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var10 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + 169];
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var10 = 169;
                    statePc = 54;
                    continue stateLoop;
                }
                case 45: {
                    if (!var15.equals((Object) (Object) "reg")) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var4 = var4 + ((vd) this).a('®');
                    if (((vd) this).field_u == null) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var10 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + 174];
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var10 = 174;
                    statePc = 54;
                    continue stateLoop;
                }
                case 50: {
                    if (!var15.startsWith("img=")) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    try {
                        var18 = (CharSequence) (Object) var15.substring(4);
                        var16_int = ph.a(1124, var18);
                        var4 = var4 + ((vd) this).field_s[var16_int].field_b;
                        var10 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var16 = (Exception) (Object) caughtException;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var14 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var9 == -1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 57: {
                    if (var14 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    StringBuilder discarded$14 = field_p.append(var14);
                    var14 = (char)(nf.a(26614, (char) var14) & 255);
                    var4 = var4 + ((vd) this).field_G[var14];
                    if (((vd) this).field_u == null) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var10 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var4 = var4 + ((vd) this).field_u[(var10 << 8) + var14];
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var10 = var14;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var14 != 32) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var6 = field_p.length();
                    var7 = var4;
                    var8 = 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (param1 == null) {
                        statePc = 71;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = var4;
                    stackOut_65_1 = (int[]) param1;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (var11 >= param1.length) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = stackIn_66_0;
                    stackOut_66_1 = (int[]) (Object) stackIn_66_1;
                    stackOut_66_2 = var11;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_68_2 = stackOut_66_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = stackIn_67_0;
                    stackOut_67_1 = (int[]) (Object) stackIn_67_1;
                    stackOut_67_2 = param1.length - 1;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    stackIn_68_2 = stackOut_67_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 <= stackIn_68_1[stackIn_68_2]) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var6 < 0) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    param2[var11] = field_p.toString().substring(var5, var6 - var8);
                    var11++;
                    var5 = var6;
                    var6 = -1;
                    var4 = var4 - var7;
                    var10 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (var14 == 45) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 73: {
                    var6 = field_p.length();
                    var7 = var4;
                    var8 = 0;
                    var13++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 74: {
                    if (field_p.length() <= var5) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    param2[var11] = field_p.toString().substring(var5, field_p.length());
                    var11++;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    return var11;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1) {
        field_D = -1;
        field_H = -1;
        field_z = param1;
        field_A = param1;
        field_x = param0;
        field_y = param0;
        field_r = 256;
        field_I = 256;
        field_L = 0;
        field_F = 0;
    }

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - ((vd) this).b(param0), param2);
    }

    vd(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ((vd) this).field_E = 0;
        ((vd) this).field_t = param1;
        ((vd) this).field_J = param2;
        ((vd) this).field_w = param3;
        ((vd) this).field_v = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 256) {
            ((vd) this).field_M = ((vd) this).field_E - var6;
            ((vd) this).field_B = var7 - ((vd) this).field_E;
            ((vd) this).field_q = ((vd) this).field_E - ((vd) this).field_J[88];
          } else {
            L1: {
              if (((vd) this).field_J[var8] >= var6) {
                break L1;
              } else {
                if (((vd) this).field_v[var8] == 0) {
                  break L1;
                } else {
                  var6 = ((vd) this).field_J[var8];
                  break L1;
                }
              }
            }
            if (((vd) this).field_J[var8] + ((vd) this).field_v[var8] > var7) {
              var7 = ((vd) this).field_J[var8] + ((vd) this).field_v[var8];
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new StringBuilder(100);
        field_L = 0;
        field_I = 256;
        field_K = new String[100];
        field_y = 0;
        field_A = -1;
        field_r = 256;
        field_z = -1;
        field_F = 0;
        field_D = -1;
        field_H = -1;
        field_x = 0;
    }
}
