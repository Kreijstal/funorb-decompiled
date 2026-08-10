/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends jc {
    static int field_N;
    static int field_M;
    static int[] field_O;
    static int field_K;
    static String field_J;
    static String field_L;

    private se(int param0, int param1, int param2, int param3, ad param4, rm param5, fe param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_I = param6;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "se.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != -13673) {
          se.n(28);
          field_J = null;
          field_O = null;
          field_L = null;
          return;
        } else {
          field_J = null;
          field_O = null;
          field_L = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        ma var7 = null;
        try {
            super.a(param0, param1, param2, param3, param4, param5 + param5);
            var7 = j.field_d;
            if (var7 != null) {
                if (!this.b(param1, param0, param3, param2, -88)) {
                    return;
                }
                if (this.field_y instanceof cd) {
                    ((cd) ((Object) this.field_y)).a(27055, (se) (this), var7);
                    j.field_d = null;
                    return;
                }
                if (var7.field_y instanceof cd) {
                    ((cd) ((Object) var7.field_y)).a(param5 + 27055, (se) (this), var7);
                    j.field_d = null;
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "se.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var5_int = param0 - -param3;
              var6 = param4 + param2;
              if (param1 == 2) {
                break L1;
              } else {
                field_M = 88;
                break L1;
              }
            }
            L2: {
              if (param0 > eh.field_a) {
                stackIn_6_0 = param0;
                break L2;
              } else {
                stackIn_6_0 = eh.field_a;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_6_0;
              if (eh.field_d >= param2) {
                stackIn_9_0 = eh.field_d;
                break L3;
              } else {
                stackIn_9_0 = param2;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_9_0;
              if (var5_int >= eh.field_k) {
                stackIn_12_0 = eh.field_k;
                break L4;
              } else {
                stackIn_12_0 = var5_int;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (eh.field_e > var6) {
                stackIn_15_0 = var6;
                break L5;
              } else {
                stackIn_15_0 = eh.field_e;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (eh.field_a > param0) {
                break L6;
              } else {
                if (eh.field_k <= param0) {
                  break L6;
                } else {
                  var11 = param0 + eh.field_g * var8;
                  var12 = var10 + (1 - var8) >> 683885665;
                  L7: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L6;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 = var11 + eh.field_g * 2;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (eh.field_d > param2) {
                break L8;
              } else {
                if (eh.field_e > var6) {
                  var11 = eh.field_g * param2 + var7;
                  var12 = var9 + (1 - var7) >> 1076792129;
                  L9: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L8;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (var5_int < eh.field_a) {
                break L10;
              } else {
                if (eh.field_k <= var5_int) {
                  break L10;
                } else {
                  var11 = var5_int + (var8 - -(1 & var5_int + -param0)) * eh.field_g;
                  var12 = var10 + 1 - var8 >> -1445603231;
                  L11: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L10;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 = var11 + 2 * eh.field_g;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (eh.field_d > param2) {
                break L12;
              } else {
                if (eh.field_e <= var6) {
                  break L12;
                } else {
                  var11 = var6 * eh.field_g + var7 + (1 & var6 + -param2);
                  var12 = -var7 + (var9 + 1) >> 1261234401;
                  L13: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L12;
                    } else {
                      eh.field_f[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var5), "se.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_M = 50;
        field_K = -1;
        field_J = "Ranking: Puddle Splasher";
        field_L = "Sell<br>Basic Kit";
    }
}
