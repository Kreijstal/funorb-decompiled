/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static vf field_c;
    static int field_d;
    static int field_e;
    static int[] field_f;
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = param5;
              var8 = param2 * param2;
              var9 = param5 * param5;
              var10 = var9 << 1;
              var11 = var8 << 1;
              var12 = param5 << 1;
              var13 = var8 * (1 - var12) + var10;
              var14 = -((-1 + var12) * var11) + var9;
              var15 = var8 << 2;
              var16 = var9 << 2;
              var17 = ((var6_int << 1) + 3) * var10;
              var18 = var11 * ((var7 << 1) - 3);
              var21 = -103 % ((82 - param3) / 34);
              var19 = var16 * (1 + var6_int);
              if (j.field_q > param4) {
                break L1;
              } else {
                if (param4 > qk.field_p) {
                  break L1;
                } else {
                  var22 = ln.a(qg.field_z, kn.field_e, param2 + param1, 88);
                  var23 = ln.a(qg.field_z, kn.field_e, param1 + -param2, 89);
                  di.a(var23, (byte) -91, param0, qd.field_a[param4], var22);
                  break L1;
                }
              }
            }
            var20 = (var7 + -1) * var15;
            L2: while (true) {
              if (var7 <= 0) {
                break L0;
              } else {
                L3: {
                  if (var13 < 0) {
                    L4: while (true) {
                      if (0 <= var13) {
                        break L3;
                      } else {
                        var14 = var14 + var19;
                        var13 = var13 + var17;
                        var17 = var17 + var16;
                        var19 = var19 + var16;
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (var14 < 0) {
                    var14 = var14 + var19;
                    var13 = var13 + var17;
                    var17 = var17 + var16;
                    var6_int++;
                    var19 = var19 + var16;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var13 = var13 + -var20;
                var14 = var14 + -var18;
                var7--;
                var18 = var18 - var15;
                var20 = var20 - var15;
                var22 = param4 - var7;
                var23 = var7 + param4;
                if (j.field_q > var23) {
                  continue L2;
                } else {
                  if (qk.field_p < var22) {
                    continue L2;
                  } else {
                    L6: {
                      var24 = ln.a(qg.field_z, kn.field_e, var6_int + param1, 112);
                      var25 = ln.a(qg.field_z, kn.field_e, -var6_int + param1, 94);
                      if (j.field_q > var22) {
                        break L6;
                      } else {
                        di.a(var25, (byte) -91, param0, qd.field_a[var22], var24);
                        break L6;
                      }
                    }
                    if (qk.field_p < var23) {
                      continue L2;
                    } else {
                      di.a(var25, (byte) 86, param0, qd.field_a[var23], var24);
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var6, "a.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(boolean param0, String param1, java.applet.Applet param2, int param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            Object var5 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                L1: {
                  if (vh.field_i.startsWith("win")) {
                    if (fq.a(param1, 0)) {
                      return;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    if (param3 == 3) {
                      break L2;
                    } else {
                      var5 = null;
                      a.a(false, (String) null, (java.applet.Applet) null, -43);
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  nn.a("MGR1: " + param1, (Throwable) null, param3 ^ -9959);
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var4_ref;
                stackOut_10_1 = new StringBuilder().append("a.A(").append(param0).append(44);
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
              L4: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param2 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L4;
                }
              }
              throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[128];
        field_b = "Email (Login):";
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
