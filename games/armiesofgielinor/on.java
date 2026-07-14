/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class on extends tc {
    static String field_p;
    int[] field_m;
    static String field_k;
    int field_l;
    static String field_o;
    static int field_n;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_k = null;
        if (param0 != -7) {
            on.a(-36);
        }
    }

    final static void a(ha param0, int param1, boolean param2, Random param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= param0.field_db * param0.field_v / 3) {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var5 = 1 + ns.a(false, param0.field_v - 2, param3);
              var6 = ns.a(param2, param0.field_db + -2, param3) + 1;
              var7 = var6 * param0.field_v + var5;
              if (-1 != (param0.field_Eb[var7].field_h ^ -1)) {
                break L2;
              } else {
                if (null != param0.field_Eb[var7].field_c) {
                  break L2;
                } else {
                  L3: {
                    if (param0.field_Eb[1 + var7].field_h == param1) {
                      break L3;
                    } else {
                      if (param1 == param0.field_Eb[-1 + var7].field_h) {
                        break L3;
                      } else {
                        if (param0.field_Eb[param0.field_v + var7].field_h == param1) {
                          break L3;
                        } else {
                          if (param1 == param0.field_Eb[var7 - param0.field_v].field_h) {
                            break L3;
                          } else {
                            var8 = ns.a(false, 100, param3);
                            if (var8 < 20) {
                              param0.field_Eb[var7].field_h = 3;
                              break L2;
                            } else {
                              if (40 <= var8) {
                                if (50 > var8) {
                                  param0.field_Eb[var7].field_h = 2;
                                  break L2;
                                } else {
                                  if (70 <= var8) {
                                    break L2;
                                  } else {
                                    if (0 > (param1 ^ -1)) {
                                      param0.field_Eb[var7].field_h = param1;
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                param0.field_Eb[var7].field_h = 5;
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if ((ns.a(false, 100, param3) ^ -1) <= -41) {
                    var8 = ns.a(param2, 100, param3);
                    if (var8 <= -21) {
                      if (-41 > var8) {
                        param0.field_Eb[var7].field_h = 5;
                        break L2;
                      } else {
                        if (-51 >= var8) {
                          if (-71 <= var8) {
                            break L2;
                          } else {
                            if (param1 <= -1) {
                              break L2;
                            } else {
                              param0.field_Eb[var7].field_h = param1;
                              break L2;
                            }
                          }
                        } else {
                          param0.field_Eb[var7].field_h = 2;
                          break L2;
                        }
                      }
                    } else {
                      param0.field_Eb[var7].field_h = 3;
                      break L2;
                    }
                  } else {
                    param0.field_Eb[var7].field_h = param1;
                    break L2;
                  }
                }
              }
            }
            var4++;
            continue L0;
          }
        }
    }

    private on() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Melee";
        field_p = "Village";
        field_o = "Slow";
    }
}
