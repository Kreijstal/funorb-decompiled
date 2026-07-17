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
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
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
                  L2: {
                    var6 = dw.field_f + -var11.field_g;
                    var15 = var5.field_g;
                    var14 = var15;
                    var13 = var14;
                    var12 = var13;
                    var7 = var12;
                    if (var15.length << 2 >= var6) {
                      break L2;
                    } else {
                      var6 = var15.length << 2;
                      break L2;
                    }
                  }
                  var8 = 0;
                  L3: while (true) {
                    if (var6 <= var8) {
                      var5.a(false);
                      break L1;
                    } else {
                      var7[var8 >> 2] = var7[var8 >> 2] + (var11.b(16711935) << (dda.a(var8, 3) << 8));
                      var8++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (var2 == 1) {
                  var5_int = var11.e(-4095);
                  var6_ref_gea = (gea) (Object) wd.field_t.b((byte) 90);
                  L4: while (true) {
                    L5: {
                      if (var6_ref_gea == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var6_ref_gea.field_i != var4) {
                            break L6;
                          } else {
                            if (var5_int == var6_ref_gea.field_m) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var6_ref_gea = (gea) (Object) wd.field_t.c(0);
                        continue L4;
                      }
                    }
                    if (var6_ref_gea == null) {
                      vc.a((byte) -109);
                      return;
                    } else {
                      var6_ref_gea.a(false);
                      break L1;
                    }
                  }
                } else {
                  cv.a(1, "LR1: " + nia.d((byte) -116), (Throwable) null);
                  vc.a((byte) -71);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "eha.B(" + param0 + 41);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            Object var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var5 = param1.getCodeBase();
                      var3 = ow.a(var5, (byte) -105, param1).getFile();
                      Object discarded$6 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
                      if (param0 <= -102) {
                        break L2;
                      } else {
                        var4 = null;
                        eha.a(4, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    Object discarded$7 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
                    Object discarded$8 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
                    Object discarded$9 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
                    Object discarded$10 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
                    Object discarded$11 = ac.a(param1, "updatelinks", new Object[2], (byte) 73);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("eha.E(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    eha(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            ((eha) this).field_n = param3;
            ((eha) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "eha.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < bp.field_z) {
                  break L1;
                } else {
                  if (param1.length() > ko.field_e) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 == 15) {
                        break L2;
                      } else {
                        var3 = null;
                        eha.a(13, (java.applet.Applet) null);
                        break L2;
                      }
                    }
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("eha.C(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    public static void b(int param0) {
        field_s = null;
        field_q = null;
        field_p = null;
        field_r = null;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        j var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        Object stackIn_3_0 = null;
        j stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        j stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            var18 = ((eha) this).field_h.a(59, param0);
            var4 = new j(((eha) this).field_g, new nq(var18));
            var4.field_s = ((eha) this).field_n;
            var4.field_r = ((eha) this).field_k;
            var22 = var4.a(0, -77, param0, var18);
            var6 = 17;
            var7 = 17;
            var8 = -1 + var6 >> 1;
            var9 = var7 - 1 >> 1;
            if (param1 == 3) {
              var10 = 0;
              L1: while (true) {
                if (var10 >= var6) {
                  var4.field_q = new int[var4.field_o.g(param1 + -3)];
                  var10 = 0;
                  L2: while (true) {
                    if (var10 >= var4.field_q.length) {
                      stackOut_15_0 = (j) var4;
                      stackIn_16_0 = stackOut_15_0;
                      break L0;
                    } else {
                      var4.field_q[var10] = 1 + kla.a(4, param0.field_w, -2147483648);
                      var10++;
                      continue L2;
                    }
                  }
                } else {
                  var11 = 0;
                  L3: while (true) {
                    if (var11 >= var7) {
                      var10++;
                      continue L1;
                    } else {
                      L4: {
                        if (var22[var10][var11] != 1) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var11++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ii) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("eha.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 41);
        }
        return (ii) (Object) stackIn_16_0;
    }

    final static void c(boolean param0) {
        gfa.field_i = false;
        eea.field_b = false;
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
