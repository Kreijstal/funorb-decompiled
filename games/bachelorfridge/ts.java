/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ts extends td {
    static sna field_r;
    static String field_q;
    static String field_p;

    ts(int param0, aga param1, nq param2) {
        super(param0, param1);
        ((ts) this).field_j = param2;
    }

    final static java.awt.Frame a(int param0, ht param1, int param2, int param3, int param4, int param5) {
        lba[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        lba[] var10 = null;
        eh var11 = null;
        var9 = BachelorFridge.field_y;
        if (param1.b(34)) {
          L0: {
            if (0 != param5) {
              break L0;
            } else {
              var10 = we.a((byte) -57, param1);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (var10[var8].field_d == param2) {
                      if (var10[var8].field_e == param0) {
                        L2: {
                          if (0 == param3) {
                            break L2;
                          } else {
                            if (param3 == var10[var8].field_b) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (var10[var8].field_a > param5) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7_int = 1;
                        param5 = var10[var8].field_a;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          var11 = param1.a(param5, param2, param4 ^ 124, param0, param3);
          L4: while (true) {
            if (var11.field_f != 0) {
              var7 = (java.awt.Frame) var11.field_e;
              if (var7 != null) {
                if (param4 == var11.field_f) {
                  gv.a(-111, param1, var7);
                  return null;
                } else {
                  return var7;
                }
              } else {
                return null;
              }
            } else {
              gda.a(false, 10L);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    public static void c(boolean param0) {
        field_p = null;
        field_q = null;
        field_r = null;
        if (!param0) {
            field_q = null;
        }
    }

    final ii a(op param0, int param1) {
        if (param1 != 3) {
            return null;
        }
        aga var3 = ((ts) this).field_h.a(61, param0);
        aga var4 = ((ts) this).field_j.a(param1 ^ 96, param0);
        if (var4 == null) {
            return (ii) (Object) new ew(new nq(var3));
        }
        lca var5 = new lca(((ts) this).field_g, new nq(var3), ((ts) this).field_j);
        int var6 = var4.c(param1 ^ 119);
        int var7 = kla.a(var6, param0.field_w, param1 + 2147483645);
        var5.field_o.a((bw) (Object) new ela(new nq(var4), var7), true);
        return (ii) (Object) var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Real-life threats";
        field_p = "OFFERED DRAW";
    }
}
