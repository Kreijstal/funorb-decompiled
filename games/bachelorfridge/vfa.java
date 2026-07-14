/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vfa extends td {
    static String field_r;
    static vr field_p;
    static String field_q;

    public static void b(int param0) {
        field_r = null;
        if (param0 != -14431) {
            return;
        }
        field_p = null;
        field_q = null;
    }

    final static jla a(int param0, int param1) {
        if (!(param1 != 5)) {
            return (jla) (Object) new eca();
        }
        if (!(7 != param1)) {
            return (jla) (Object) new ina(false);
        }
        if (param0 != 19341) {
            field_p = null;
        }
        if (!((param1 ^ -1) != -9)) {
            return (jla) (Object) new ina(true);
        }
        if (param1 == 3) {
            return (jla) (Object) new dl();
        }
        return new jla(param1);
    }

    vfa(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((vfa) this).field_k = param2;
        ((vfa) this).field_n = param3;
    }

    final ii a(op param0, int param1) {
        bea var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        aga var17 = null;
        int[][] var19 = null;
        int[][] var21 = null;
        int[][] var23 = null;
        int[][] var24 = null;
        int[][] var25 = null;
        L0: {
          var15 = BachelorFridge.field_y;
          var17 = ((vfa) this).field_h.a(93, param0);
          var4 = new bea(((vfa) this).field_g, new nq(var17));
          var4.field_t = ((vfa) this).field_n;
          if (param1 == 3) {
            break L0;
          } else {
            vfa.b(-73);
            break L0;
          }
        }
        var4.field_q = ((vfa) this).field_k;
        var24 = var4.c(false);
        var6 = 17;
        var7 = 17;
        var8 = var6 + -1 >> -26217023;
        var9 = -1 + var7 >> 528665089;
        var10 = 0;
        var11_int = 0;
        L1: while (true) {
          if (var11_int >= var6) {
            L2: {
              if (var10 >= 12) {
                break L2;
              } else {
                var25 = new int[var10][2];
                var23 = var25;
                var21 = var23;
                var19 = var21;
                var11 = var19;
                var16 = 0;
                var12 = var16;
                L3: while (true) {
                  if (var16 >= var25.length) {
                    var4.field_r = var11;
                    break L2;
                  } else {
                    var25[var16][0] = var4.field_r[var16][0];
                    var25[var16][1] = var4.field_r[var16][1];
                    var16++;
                    continue L3;
                  }
                }
              }
            }
            return (ii) (Object) var4;
          } else {
            var12 = 0;
            L4: while (true) {
              if (var7 > var12) {
                if (var24[var11_int][var12] == 1) {
                  var13 = -var8 + (var11_int + ((vfa) this).field_k);
                  var14 = ((vfa) this).field_n + (var12 + -var9);
                  if ((var13 ^ -1) <= -1) {
                    if (param0.field_z > var13) {
                      if (0 <= var14) {
                        if (param0.field_B > var14) {
                          if (var10 < 12) {
                            if (8 >= kla.a(10, param0.field_w, -2147483648)) {
                              var4.field_r[var10][0] = var13;
                              var4.field_r[var10][1] = var14;
                              var10++;
                              var12++;
                              continue L4;
                            } else {
                              var12++;
                              continue L4;
                            }
                          } else {
                            var12++;
                            continue L4;
                          }
                        } else {
                          var12++;
                          continue L4;
                        }
                      } else {
                        var12++;
                        continue L4;
                      }
                    } else {
                      var12++;
                      continue L4;
                    }
                  } else {
                    var12++;
                    continue L4;
                  }
                } else {
                  var12++;
                  continue L4;
                }
              } else {
                var11_int++;
                continue L1;
              }
            }
          }
        }
    }

    final static fea a(String param0, vr param1, int param2, String param3, vr param4) {
        int var5 = param1.a(param3, false);
        int var7 = -21 % ((31 - param2) / 43);
        int var6 = param1.a((byte) 6, var5, param0);
        return jc.a(param4, var6, false, param1, var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "All players have left <%0>'s game.";
        field_q = "Invalid password.";
    }
}
