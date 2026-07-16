/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static String field_d;
    static int[] field_c;
    static boolean field_a;
    static String field_b;

    final static void b(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        var15 = c.field_d.field_B;
        var13 = var15;
        var10 = var13;
        var8 = var10;
        var7 = var8;
        var14 = var7;
        var12 = var14;
        var11 = var12;
        var9 = var11;
        var1 = var9;
        if (-1 > (co.field_h ^ -1)) {
          var5 = -co.field_h + 256;
          var4 = 256000;
          L0: while (true) {
            if (-1 > (var4 ^ -1)) {
              var4--;
              var3 = var15[var4];
              var2 = 16711935 & var3;
              var2 = var2 * var5;
              var3 = var3 & 65280;
              var2 = var2 & -16711936;
              var3 = var3 * var5;
              var2 = var2 + (-16711936 & co.field_h * 16711935);
              var3 = var3 & 16711680;
              var3 = var3 + (16711680 & 65280 * co.field_h);
              var7[var4] = oh.a(var2, var3) >>> 684306504;
              continue L0;
            } else {
              L1: {
                if (128.0f < lj.field_r) {
                  if (lj.field_r > 256.0f) {
                    var2 = 256000;
                    L2: while (true) {
                      if (var2 <= 0) {
                        break L1;
                      } else {
                        var2--;
                        var1[var2] = rb.a(var14[var2], 16579836);
                        var1[var2] = var1[var2] >> 2;
                        var1[var2] = var1[var2] * 3;
                        continue L2;
                      }
                    }
                  } else {
                    var3 = 100;
                    L3: while (true) {
                      if (var3 <= 0) {
                        break L1;
                      } else {
                        var3--;
                        var4 = 2560 * var3;
                        var2 = 1280;
                        L4: while (true) {
                          var2--;
                          if (var2 <= 0) {
                            continue L3;
                          } else {
                            var1[var4] = rb.a(var14[var4], 16711422);
                            var1[var4] = var1[var4] >> 1;
                            var4++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var3 = 200;
                  L5: while (true) {
                    if (0 >= var3) {
                      break L1;
                    } else {
                      var3--;
                      var4 = 1280 * var3;
                      var2 = 640;
                      L6: while (true) {
                        var2--;
                        if (-1 <= (var2 ^ -1)) {
                          continue L5;
                        } else {
                          var1[var4] = rb.a(var14[var4], 16711422);
                          var1[var4] = var1[var4] >> 1;
                          var4++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 != 8) {
                field_a = true;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (128.0f < lj.field_r) {
            if (lj.field_r > 256.0f) {
              var2 = 256000;
              L7: while (true) {
                if (var2 <= 0) {
                  if (param0 != 8) {
                    field_a = true;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var2--;
                  var1[var2] = rb.a(var14[var2], 16579836);
                  var1[var2] = var1[var2] >> 2;
                  var1[var2] = var1[var2] * 3;
                  continue L7;
                }
              }
            } else {
              var3 = 100;
              L8: while (true) {
                if (var3 > 0) {
                  var3--;
                  var4 = 2560 * var3;
                  var2 = 1280;
                  L9: while (true) {
                    var2--;
                    if (var2 <= 0) {
                      continue L8;
                    } else {
                      var1[var4] = rb.a(var14[var4], 16711422);
                      var1[var4] = var1[var4] >> 1;
                      var4++;
                      continue L9;
                    }
                  }
                } else {
                  if (param0 != 8) {
                    field_a = true;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            var3 = 200;
            L10: while (true) {
              if (0 < var3) {
                var3--;
                var4 = 1280 * var3;
                var2 = 640;
                L11: while (true) {
                  var2--;
                  if (-1 <= (var2 ^ -1)) {
                    continue L10;
                  } else {
                    var1[var4] = rb.a(var14[var4], 16711422);
                    var1[var4] = var1[var4] >> 1;
                    var4++;
                    continue L11;
                  }
                }
              } else {
                if (param0 != 8) {
                  field_a = true;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_7_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            var7 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                var3 = (String) q.b("getcookies", 6168, param1);
                var4 = ql.a(var3, (byte) -123, ';');
                var5 = param0;
                L1: while (true) {
                  if (var4.length <= var5) {
                    break L0;
                  } else {
                    L2: {
                      var6 = var4[var5].indexOf('=');
                      if (0 > var6) {
                        break L2;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                          stackOut_6_0 = var4[var5].substring(1 + var6).trim();
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var3_ref = decompiledCaughtException;
                break L3;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0) {
        int var1 = -38 % ((15 - param0) / 57);
        return nf.field_e;
    }

    final static int a(byte param0, int param1) {
        if (param0 < -43) {
          if (param1 >= 0) {
            if ((param1 ^ -1) < -65537) {
              return -wl.field_c[134217728 / param1] + 2048;
            } else {
              return wl.field_c[param1 >> 537667685];
            }
          } else {
            if (param1 >= -65536) {
              return -wl.field_c[-param1 >> -2033357787];
            } else {
              return -2048 + wl.field_c[134217728 / -param1];
            }
          }
        } else {
          int discarded$1 = wd.a((byte) -38, 106);
          if (param1 >= 0) {
            if ((param1 ^ -1) < -65537) {
              return -wl.field_c[134217728 / param1] + 2048;
            } else {
              return wl.field_c[param1 >> 537667685];
            }
          } else {
            if (param1 >= -65536) {
              return -wl.field_c[-param1 >> -2033357787];
            } else {
              return -2048 + wl.field_c[134217728 / -param1];
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != -8518) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_b = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
