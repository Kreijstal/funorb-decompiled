/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static gb field_a;
    static String field_b;
    static int[] field_c;
    static sd field_d;
    static he field_e;
    static int field_f;

    final static String a(int param0, byte param1, byte[] param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var11 = new char[param0];
          var10 = var11;
          var4 = var10;
          var5 = 0;
          var6 = 0;
          if (param1 == 79) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: while (true) {
          if (param0 <= var6) {
            return new String(var11, 0, var5);
          } else {
            var7 = param2[param3 + var6] & 255;
            if (var7 != 0) {
              L2: {
                if (var7 < 128) {
                  break L2;
                } else {
                  if ((var7 ^ -1) <= -161) {
                    break L2;
                  } else {
                    L3: {
                      var8 = we.field_a[-128 + var7];
                      if (var8 != 0) {
                        break L3;
                      } else {
                        var8 = 63;
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  }
                }
              }
              var5++;
              var4[var5] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, nh param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        nh var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (wj.field_g <= param6) {
            break L0;
          } else {
            param0 = param0 - (-param6 + wj.field_g);
            param6 = wj.field_g;
            break L0;
          }
        }
        L1: {
          if (wj.field_e > param5) {
            param3 = param3 - (-param5 + wj.field_e);
            param5 = wj.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param6 + param0 > wj.field_b) {
            param0 = -param6 + wj.field_b;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param5 - -param3 <= wj.field_j) {
            break L3;
          } else {
            param3 = -param5 + wj.field_j;
            break L3;
          }
        }
        if (-1 <= (param0 ^ -1)) {
          return;
        } else {
          if (param3 > 0) {
            var21 = param7.a();
            var32 = wj.field_l;
            var10 = wj.field_k;
            var11 = wj.field_c;
            var30 = new int[4];
            wj.b(var30);
            param7.c();
            wj.d(var30[param2], var30[1], var30[2], var30[3]);
            var13 = param6 + param7.field_y * param5;
            var14 = param7.field_y + -param0;
            var31 = var21.field_B;
            var28 = var31;
            var25 = var28;
            var22 = var25;
            var15 = var22;
            var16 = param5;
            L4: while (true) {
              if (var16 >= param5 + param3) {
                var21.d(-param7.field_D, -param7.field_v);
                wj.a(var32, var10, var11);
                wj.a(var30);
                return;
              } else {
                var17 = param6;
                L5: while (true) {
                  if (param0 + param6 <= var17) {
                    var13 = var13 + var14;
                    var16++;
                    continue L4;
                  } else {
                    var18 = var31[var13];
                    if (var18 != 0) {
                      L6: {
                        L7: {
                          if (var17 <= 0) {
                            break L7;
                          } else {
                            if (var15[-1 + var13] == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var16 <= 0) {
                            break L8;
                          } else {
                            if (var15[var13 - param7.field_y] == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var17 >= -1 + param7.field_y) {
                            break L9;
                          } else {
                            if (-1 == (var15[var13 - -1] ^ -1)) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (var16 < -1 + param7.field_w) {
                          if (var15[param7.field_y + var13] == 0) {
                            break L6;
                          } else {
                            var13++;
                            var17++;
                            continue L5;
                          }
                        } else {
                          var13++;
                          var17++;
                          continue L5;
                        }
                      }
                      wj.b(var17, var16, param1, param4);
                      var13++;
                      var17++;
                      continue L5;
                    } else {
                      var13++;
                      var17++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != -161) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(kk.a(var2, param1, 4767999), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 != -29912) {
            field_e = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[16384];
        field_b = "Names should contain a maximum of 12 characters";
        field_d = new sd("email");
    }
}
