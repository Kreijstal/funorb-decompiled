/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma implements t {
    static long field_b;
    static int field_c;
    static String field_a;

    final static de a(int param0, byte param1, int param2, ng[] param3, byte[] param4, int param5) {
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        int var16_int = 0;
        de var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        int[] var55 = null;
        var27 = TrackController.field_F ? 1 : 0;
        if (-257 != (param3.length ^ -1)) {
          throw new IllegalArgumentException();
        } else {
          var52 = new int[256];
          var45 = var52;
          var38 = var45;
          var31 = var38;
          var6 = var31;
          var53 = new int[256];
          var46 = var53;
          var39 = var46;
          var32 = var39;
          var7 = var32;
          var50 = new int[256];
          var43 = var50;
          var36 = var43;
          var29 = var36;
          var8 = var29;
          var51 = new int[256];
          var44 = var51;
          var37 = var44;
          var30 = var37;
          var9 = var30;
          var10 = new int[]{0, param5, param0};
          var54 = new byte[256][];
          var47 = var54;
          var40 = var47;
          var33 = var40;
          var11 = var33;
          var55 = ll.field_i;
          var13 = ll.field_d;
          var14 = ll.field_k;
          if (param1 < -120) {
            var49 = new int[4];
            ll.a(var49);
            var16_int = 0;
            L0: while (true) {
              if (256 <= var16_int) {
                var16 = new de(param4, var52, var53, var50, var51, var10, var54);
                var16.field_u = var16.field_u - param2;
                var16.field_H = var16.field_H - param2;
                var16.field_G = var16.field_G - param2;
                ll.a(var55, var13, var14);
                ll.b(var49);
                return var16;
              } else {
                var6[var16_int] = param3[var16_int].field_b - param2;
                var7[var16_int] = -param2 + param3[var16_int].field_a;
                var8[var16_int] = (param2 << 2057031297) + param3[var16_int].field_c;
                var9[var16_int] = (param2 << -1147471359) + param3[var16_int].field_j;
                var11[var16_int] = new byte[var50[var16_int] * var51[var16_int]];
                var17 = new byte[var50[var16_int] * var51[var16_int]];
                var18 = param3[var16_int].field_m;
                var19 = param3[var16_int].field_c;
                var20 = param3[var16_int].field_j;
                var21 = var50[var16_int];
                var22 = -var19 + var21;
                ll.a(new int[var51[var16_int] * var50[var16_int]], var50[var16_int], var51[var16_int]);
                var23 = 0;
                var24 = 0;
                L1: while (true) {
                  if (var24 >= var20) {
                    var24 = 0;
                    L2: while (true) {
                      if (var17.length <= var24) {
                        var23 = 0;
                        var24 = param2 * (var50[var16_int] + 1);
                        var25 = 0;
                        L3: while (true) {
                          if (var20 <= var25) {
                            var16_int++;
                            continue L0;
                          } else {
                            var26 = 0;
                            L4: while (true) {
                              if (var19 <= var26) {
                                var24 = var24 + var22;
                                var25++;
                                continue L3;
                              } else {
                                int incrementValue$3 = var23;
                                var23++;
                                if (0 != var18[incrementValue$3]) {
                                  int incrementValue$4 = var24;
                                  var24++;
                                  var17[incrementValue$4] = (byte) 1;
                                  var26++;
                                  continue L4;
                                } else {
                                  var24++;
                                  var26++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var17[var24] = (byte)ll.field_i[var24];
                        var24++;
                        continue L2;
                      }
                    }
                  } else {
                    var25 = 0;
                    L5: while (true) {
                      if (var19 <= var25) {
                        var24++;
                        continue L1;
                      } else {
                        int incrementValue$5 = var23;
                        var23++;
                        if (var18[incrementValue$5] != 0) {
                          ll.f(var25 - -param2, var24 - -param2, param2, 2);
                          var25++;
                          continue L5;
                        } else {
                          var25++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -50) {
            field_b = 126L;
        }
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int var6 = param1.field_p + param4;
        int var7 = param1.field_m + param2;
        fc.a(param1.field_x, var7, param1.field_u, (byte) -77, var6);
        if (param0 != -24969) {
            return;
        }
        qj var8 = TrackController.field_D[1];
        if (param1 instanceof rh) {
            if (((rh) (Object) param1).field_G) {
                var8.a((param1.field_x - var8.field_s >> -1597222911) + (1 + var6), var7 + 1 + (param1.field_u - var8.field_v >> -1553946207), 256);
            }
        }
        if (param1.h(-111)) {
            bc.a(param1.field_u + -4, -28846, param1.field_x - 4, var7 - -2, var6 - -2);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                  param1.getAppletContext().showDocument(of.a(param1, var2, false), "_top");
                  if (param0 == -9969) {
                    break L1;
                  } else {
                    field_a = null;
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Members";
    }
}
