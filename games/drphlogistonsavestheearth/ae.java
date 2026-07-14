/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ae extends ca implements ke {
    static Calendar field_ib;
    private hf field_fb;
    static nh[] field_hb;
    static String field_jb;
    static int field_kb;
    static int field_gb;
    static he[] field_lb;

    ae(k param0, ia param1) {
        super(param0, 200, 150);
        String var3 = null;
        if (rk.field_b == param1) {
            var3 = of.field_u;
        } else {
            if (param1 != uf.field_a) {
                // if_acmpne L96
                var3 = de.field_z;
                ((ae) this).field_k = ((ae) this).field_k + 30;
            } else {
                var3 = o.field_f;
                ((ae) this).field_k = ((ae) this).field_k + 10;
                if (l.b(-1)) {
                    ((ae) this).field_k = ((ae) this).field_k + 20;
                    var3 = ei.field_j;
                }
            }
        }
        vg var4 = new vg(var3, (fd) null);
        var4.field_w = ((ae) this).field_w;
        var4.field_k = 80;
        var4.field_m = 50;
        var4.field_o = 0;
        var4.field_l = (cg) (Object) new l(u.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((ae) this).b(var4, (byte) 121);
        ((ae) this).field_fb = this.a((fd) this, ei.field_h, 10);
    }

    public static void n(int param0) {
        field_lb = null;
        field_ib = null;
        if (param0 != 1) {
            ae.a(53, -128, 35, 24, true, 96, 70);
        }
        field_hb = null;
        field_jb = null;
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        if (!param2) {
            Object var7 = null;
            hf discarded$0 = this.a((fd) null, (String) null, -72);
        }
        if (!(((ae) this).field_fb != param3)) {
            this.o(0);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param6 > param5) {
          if (param3 <= param5 - -1) {
            return;
          } else {
            L0: {
              if (5 + param5 >= param3) {
                break L0;
              } else {
                if (param1 == param2) {
                  break L0;
                } else {
                  var7 = (param1 >> 435470049) + (param2 >> 825875361) + (1 & (param1 & param2));
                  var8 = param5;
                  var9 = param1;
                  var10 = param2;
                  var11 = param5;
                  L1: while (true) {
                    if (var11 >= param3) {
                      ae.a(param0 + 0, param1, var9, var8, param4, param5, param6);
                      ae.a(param0, var10, param2, param3, param4, var8, param6);
                      return;
                    } else {
                      L2: {
                        var12 = bj.field_a[var11];
                        if (!param4) {
                          stackOut_21_0 = kf.field_c[var12];
                          stackIn_22_0 = stackOut_21_0;
                          break L2;
                        } else {
                          stackOut_20_0 = rc.field_i[var12];
                          stackIn_22_0 = stackOut_20_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_22_0;
                      if (var7 < var13) {
                        bj.field_a[var11] = bj.field_a[var8];
                        var8++;
                        bj.field_a[var8] = var12;
                        if (var13 < var9) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param3;
            L3: while (true) {
              if (param5 >= var7) {
                return;
              } else {
                var8 = param5;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = bj.field_a[var8];
                    var10 = bj.field_a[1 + var8];
                    if (oa.a((byte) 123, var10, var9, param4)) {
                      bj.field_a[var8] = var10;
                      bj.field_a[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final hf a(fd param0, String param1, int param2) {
        hf var4 = new hf(param1, param0);
        var4.field_l = (cg) (Object) new ie();
        int var5 = ((ae) this).field_k + -6;
        ((ae) this).field_k = ((ae) this).field_k + 38;
        var4.a(var5, 30, 15, 16535, -14 + ((ae) this).field_w - 16);
        if (param2 != 10) {
            return null;
        }
        ((ae) this).b((vg) (Object) var4, (byte) 63);
        ((ae) this).e((byte) 64);
        return var4;
    }

    private final void o(int param0) {
        if (!((ae) this).field_Q) {
            return;
        }
        if (param0 != 0) {
            return;
        }
        ((ae) this).field_Q = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "Password is valid";
        field_ib = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_gb = 0;
    }
}
