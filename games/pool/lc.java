/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lc extends fe {
    private int field_S;
    static Random field_P;
    private ip field_N;
    static String field_Q;
    static vh field_U;
    static int field_V;
    static String field_T;
    static String field_R;
    static lr field_O;

    final static void a(boolean param0, String param1, int param2, int param3, long param4, int param5) {
        ej.field_j.b(false, param3);
        ej.field_j.field_v = ej.field_j.field_v + 1;
        int var8 = 55 % ((param5 - -38) / 51);
        int var7 = ej.field_j.field_v;
        ej.field_j.a(param4, (byte) -79);
        ej.field_j.a(-9946, param1);
        ej.field_j.a(param2, false);
        ej.field_j.a(!param0 ? 0 : 1, false);
        ej.field_j.b(ej.field_j.field_v - var7, true);
    }

    final String e(int param0) {
        if (!(!((lc) this).field_s)) {
            return ((lc) this).field_N.a(98);
        }
        if (param0 <= -10) {
            return null;
        }
        return null;
    }

    public static void g(byte param0) {
        field_P = null;
        field_Q = null;
        field_T = null;
        int var1 = -32 / ((29 - param0) / 48);
        field_U = null;
        field_O = null;
        field_R = null;
    }

    lc(ip param0) {
        ((lc) this).field_N = param0;
    }

    final boolean a(ei param0, byte param1) {
        int var3 = -87 % ((param1 - -43) / 47);
        return false;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        ((lc) this).field_S = ((lc) this).field_S + 1;
        super.a(param0, param1, param2, param3);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        na var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dd var13 = null;
        dd var14 = null;
        dd var15 = null;
        var12 = Pool.field_O;
        super.a(param0, (byte) -122, param2, param3);
        if (-1 != (param0 ^ -1)) {
          return;
        } else {
          L0: {
            L1: {
              var5 = (((lc) this).field_l >> -239556031) + (((lc) this).field_C + param2);
              var7 = 1 % ((-42 - param1) / 53);
              var6 = (((lc) this).field_y >> 192158081) + (param3 + ((lc) this).field_D);
              var9 = ((lc) this).field_N.c(-31873);
              if (ji.field_h == var9) {
                break L1;
              } else {
                if (no.field_k != var9) {
                  if (var9 == gp.field_d) {
                    var15 = bo.field_a[2];
                    var15.c(-(var15.field_z >> 374229793) + var5, var6 - (var15.field_A >> 1883728065), 256);
                    break L0;
                  } else {
                    if (var9 != kr.field_e) {
                      break L0;
                    } else {
                      var14 = bo.field_a[1];
                      var14.c(-(var14.field_z >> -2075578783) + var5, -(var14.field_A >> -759010111) + var6, 256);
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var13 = bo.field_a[0];
                var10 = var13.field_w << 1000193441;
                var11 = var13.field_y << -667739711;
                if (null == sm.field_z) {
                  break L3;
                } else {
                  if (sm.field_z.field_z < var10) {
                    break L3;
                  } else {
                    if (sm.field_z.field_A < var11) {
                      break L3;
                    } else {
                      kj.a(104, sm.field_z);
                      qh.d();
                      break L2;
                    }
                  }
                }
              }
              sm.field_z = new dd(var10, var11);
              kj.a(56, sm.field_z);
              break L2;
            }
            var13.b(112, 144, var13.field_w << -982641820, var13.field_y << -459286108, -((lc) this).field_S << 684841482, 4096);
            oc.a(112);
            sm.field_z.c(-var13.field_w + var5, var6 + -var13.field_y, 256);
            break L0;
          }
          return;
        }
    }

    final static int a(int param0, int param1, eh param2, oj param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Pool.field_O;
          if (param2 == null) {
            break L0;
          } else {
            if (param2.field_z == null) {
              break L0;
            } else {
              if (param3 == null) {
                break L0;
              } else {
                if (param2.field_A == param3.field_l) {
                  var4 = param3.field_z.length;
                  var5 = param2.field_z[param0].length / var4;
                  var6 = param1;
                  L1: while (true) {
                    if (var6 >= var5) {
                      return -1;
                    } else {
                      if (param3.field_w == param2.field_q[param0][var6]) {
                        if (or.a((byte) 3, param2.field_m[param0][var6])) {
                          var7 = 0;
                          L2: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param3.field_z[var7] == param2.field_z[param0][var7 + var6 * var4]) {
                                var6 = var6;
                                var7++;
                                continue L2;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new Random();
        field_V = 20;
        field_Q = "Go Back";
        field_T = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_R = "Unpacking models";
    }
}
