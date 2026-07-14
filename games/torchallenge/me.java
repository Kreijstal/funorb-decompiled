/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me implements j {
    static String[] field_a;
    static String field_d;
    static ka field_e;
    private int field_h;
    static boolean field_b;
    static int field_g;
    private eg field_c;
    private int field_f;

    public static void a(int param0) {
        if (param0 != -13978) {
            return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static void a(boolean param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        me.a(false);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (cf.field_d == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            cf.field_d.a(0L, 0);
                            cf.field_d.a(-4573, id.field_b.field_q, id.field_b.field_m, 24);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        id.field_b.field_q = id.field_b.field_q + 24;
                        return;
                    }
                    case 5: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        id.field_b.field_q = id.field_b.field_q + 24;
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

    public me() {
        ((me) this).field_c = oe.field_g;
        ((me) this).field_h = 1;
        ((me) this).field_f = 1;
    }

    me(eg param0, int param1, int param2) {
        ((me) this).field_h = param1;
        ((me) this).field_f = param2;
        ((me) this).field_c = param0;
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var11 = TorChallenge.field_F ? 1 : 0;
          if (param0.field_w) {
            stackOut_18_0 = 3249872;
            stackIn_20_0 = stackOut_18_0;
            break L0;
          } else {
            if (!param0.c(115)) {
              stackOut_19_0 = 2188450;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              L1: {
                var6 = 3249872;
                if (param3 == 97) {
                  break L1;
                } else {
                  ((me) this).field_h = 7;
                  break L1;
                }
              }
              int discarded$3 = ((me) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_v + "</u>", param2 - -param0.field_m, param0.field_i + param1, param0.field_p, param0.field_l, var6, -1, ((me) this).field_h, ((me) this).field_f, ((me) this).field_c.field_x + ((me) this).field_c.field_K);
              if (param0.c(94)) {
                L2: {
                  var7 = ((me) this).field_c.a(param0.field_v);
                  var8 = ((me) this).field_c.field_x - -((me) this).field_c.field_K;
                  var9 = param2 + param0.field_m;
                  if ((((me) this).field_h ^ -1) == -3) {
                    var9 = var9 + (param0.field_p - var7);
                    break L2;
                  } else {
                    if ((((me) this).field_h ^ -1) == -2) {
                      var9 = var9 + (-var7 + param0.field_p >> -1004351167);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = param1 + param0.field_i;
                if (((me) this).field_f != 2) {
                  if (-2 == (((me) this).field_f ^ -1)) {
                    var10 = var10 + (param0.field_l + -var8 >> -1078860671);
                    jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                    return;
                  } else {
                    jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param0.field_l);
                  jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        var6 = stackIn_20_0;
        if (param3 == 97) {
          int discarded$4 = ((me) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_v + "</u>", param2 - -param0.field_m, param0.field_i + param1, param0.field_p, param0.field_l, var6, -1, ((me) this).field_h, ((me) this).field_f, ((me) this).field_c.field_x + ((me) this).field_c.field_K);
          if (param0.c(94)) {
            var7 = ((me) this).field_c.a(param0.field_v);
            var8 = ((me) this).field_c.field_x - -((me) this).field_c.field_K;
            var9 = param2 + param0.field_m;
            if ((((me) this).field_h ^ -1) == -3) {
              var9 = var9 + (param0.field_p - var7);
              var10 = param1 + param0.field_i;
              if (((me) this).field_f != 2) {
                if (-2 == (((me) this).field_f ^ -1)) {
                  var10 = var10 + (param0.field_l + -var8 >> -1078860671);
                  jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                  return;
                } else {
                  jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                  return;
                }
              } else {
                var10 = var10 + (-var8 + param0.field_l);
                jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                return;
              }
            } else {
              if (((me) this).field_h == -2) {
                var9 = var9 + (-var7 + param0.field_p >> -1004351167);
                var10 = param1 + param0.field_i;
                if (((me) this).field_f != 2) {
                  if (-2 == (((me) this).field_f ^ -1)) {
                    var10 = var10 + (param0.field_l + -var8 >> -1078860671);
                    jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                    return;
                  } else {
                    jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param0.field_l);
                  jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                  return;
                }
              } else {
                var10 = param1 + param0.field_i;
                if (((me) this).field_f != 2) {
                  if (-2 != ((me) this).field_f) {
                    jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                    return;
                  } else {
                    var10 = var10 + (param0.field_l + -var8 >> -1078860671);
                    jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param0.field_l);
                  jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          ((me) this).field_h = 7;
          int discarded$5 = ((me) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_v + "</u>", param2 - -param0.field_m, param0.field_i + param1, param0.field_p, param0.field_l, var6, -1, ((me) this).field_h, ((me) this).field_f, ((me) this).field_c.field_x + ((me) this).field_c.field_K);
          if (param0.c(94)) {
            L3: {
              var7 = ((me) this).field_c.a(param0.field_v);
              var8 = ((me) this).field_c.field_x - -((me) this).field_c.field_K;
              var9 = param2 + param0.field_m;
              if ((((me) this).field_h ^ -1) == -3) {
                var9 = var9 + (param0.field_p - var7);
                break L3;
              } else {
                if ((((me) this).field_h ^ -1) == -2) {
                  var9 = var9 + (-var7 + param0.field_p >> -1004351167);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            var10 = param1 + param0.field_i;
            if (((me) this).field_f != 2) {
              if (-2 != (((me) this).field_f ^ -1)) {
                jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                return;
              } else {
                var10 = var10 + (param0.field_l + -var8 >> -1078860671);
                jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
                return;
              }
            } else {
              var10 = var10 + (-var8 + param0.field_l);
              jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 - -2);
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_a = new String[]{"Henhui", "Ziren", "Damen"};
    }
}
