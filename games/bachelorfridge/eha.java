/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eha extends td {
    static String field_r;
    static int[] field_s;
    static String field_p;
    static int[] field_q;

    final static void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rg var5 = null;
        int var5_int = 0;
        gea var6_ref_gea = null;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        pf var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var9 = BachelorFridge.field_y;
          var11 = ig.field_m;
          var2 = var11.b(16711935);
          var3 = -49 / ((param0 - -10) / 41);
          var4 = var11.b(16711935);
          if (var2 == 0) {
            var5 = (rg) (Object) rp.field_C.b((byte) 90);
            if (var5 == null) {
              vc.a((byte) -124);
              return;
            } else {
              L1: {
                var6 = dw.field_f + -var11.field_g;
                var15 = var5.field_g;
                var14 = var15;
                var13 = var14;
                var12 = var13;
                var7 = var12;
                if (var15.length << -978879518 >= var6) {
                  break L1;
                } else {
                  var6 = var15.length << -1232389342;
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if (var6 <= var8) {
                  var5.a(false);
                  break L0;
                } else {
                  var7[var8 >> 287933730] = var7[var8 >> 287933730] + (var11.b(16711935) << (dda.a(var8, 3) << -378285016));
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            if (var2 == 1) {
              var5_int = var11.e(-4095);
              var6_ref_gea = (gea) (Object) wd.field_t.b((byte) 90);
              L3: while (true) {
                L4: {
                  if (var6_ref_gea == null) {
                    break L4;
                  } else {
                    L5: {
                      if (var6_ref_gea.field_i != var4) {
                        break L5;
                      } else {
                        if (var5_int == var6_ref_gea.field_m) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var6_ref_gea = (gea) (Object) wd.field_t.c(0);
                    continue L3;
                  }
                }
                if (var6_ref_gea == null) {
                  vc.a((byte) -109);
                  return;
                } else {
                  var6_ref_gea.a(false);
                  break L0;
                }
              }
            } else {
              cv.a(1, "LR1: " + nia.d((byte) -116), (Throwable) null);
              vc.a((byte) -71);
              break L0;
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            Object var4 = null;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var5 = param1.getCodeBase();
                var3 = ow.a(var5, (byte) -105, param1).getFile();
                Object discarded$6 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
                if (param0 <= -102) {
                  break L0;
                } else {
                  var4 = null;
                  eha.a(4, (java.applet.Applet) null);
                  break L0;
                }
              }
              Object discarded$7 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
              Object discarded$8 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
              Object discarded$9 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
              Object discarded$10 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
              Object discarded$11 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    eha(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((eha) this).field_n = param3;
        ((eha) this).field_k = param2;
    }

    final static boolean a(int param0, String param1) {
        if (param1 != null) {
            // if_icmplt L27
            // if_icmpgt L27
        } else {
            return true;
        }
        if (param0 != 15) {
            Object var3 = null;
            eha.a(13, (java.applet.Applet) null);
        }
        return false;
    }

    public static void b(int param0) {
        field_s = null;
        field_q = null;
        if (param0 != -1452) {
            eha.c(-28);
        }
        field_p = null;
        field_r = null;
    }

    final ii a(op param0, int param1) {
        j var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        aga var15 = null;
        iv var16 = null;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        var17 = BachelorFridge.field_y;
        var18 = ((eha) this).field_h.a(59, param0);
        var4 = new j(((eha) this).field_g, new nq(var18));
        var4.field_s = ((eha) this).field_n;
        var4.field_r = ((eha) this).field_k;
        var22 = var4.a(0, -77, param0, var18);
        var6 = 17;
        var7 = 17;
        var8 = -1 + var6 >> 1564723649;
        var9 = var7 - 1 >> 766591105;
        if (param1 == 3) {
          var10 = 0;
          L0: while (true) {
            if (var10 >= var6) {
              var4.field_q = new int[var4.field_o.g(param1 + -3)];
              var10 = 0;
              L1: while (true) {
                if (var10 >= var4.field_q.length) {
                  return (ii) (Object) var4;
                } else {
                  var4.field_q[var10] = 1 + kla.a(4, param0.field_w, -2147483648);
                  var10++;
                  continue L1;
                }
              }
            } else {
              var11 = 0;
              L2: while (true) {
                if (var11 >= var7) {
                  var10++;
                  continue L0;
                } else {
                  if (var22[var10][var11] == 1) {
                    var12 = ((eha) this).field_k - -var10 - var8;
                    var13 = ((eha) this).field_n + -var9 + var11;
                    if (var12 >= 0) {
                      if (param0.field_z > var12) {
                        if (-1 >= (var13 ^ -1)) {
                          if (param0.field_B > var13) {
                            var14 = param0.field_a[var12][var13];
                            var15 = var14.field_l;
                            if (var15 != null) {
                              var16 = new iv(new nq(var15), false, 1, 30, 15);
                              var4.field_o.a((bw) (Object) var16, true);
                              var11++;
                              continue L2;
                            } else {
                              var11++;
                              continue L2;
                            }
                          } else {
                            var11++;
                            continue L2;
                          }
                        } else {
                          var11++;
                          continue L2;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    } else {
                      var11++;
                      continue L2;
                    }
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void c(boolean param0) {
        gfa.field_i = false;
        eea.field_b = param0 ? true : false;
        ep.a(-1, 8192);
        ola.field_p = tn.field_a;
        dka.field_G = tn.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Select creatures for battle";
        field_q = new int[4];
        field_r = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
