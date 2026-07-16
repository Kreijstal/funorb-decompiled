/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static String field_b;
    static String field_d;
    private int[] field_a;
    static String field_c;

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = fleas.field_A ? 1 : 0;
        if (0 != param3) {
          var7 = 0;
          if (param5 == -1) {
            param3 = param3 + param2;
            var8 = param1;
            L0: while (true) {
              L1: {
                var9 = param0[var8];
                if (0 > var9) {
                  var7 = ((oc) this).field_a[var7];
                  break L1;
                } else {
                  var7++;
                  break L1;
                }
              }
              L2: {
                var10 = ((oc) this).field_a[var7];
                if (0 <= ((oc) this).field_a[var7]) {
                  break L2;
                } else {
                  int incrementValue$8 = param2;
                  param2++;
                  param4[incrementValue$8] = (byte)(var10 ^ -1);
                  if (param3 > param2) {
                    var7 = 0;
                    break L2;
                  } else {
                    return 1 + (var8 + -param1);
                  }
                }
              }
              L3: {
                if ((var9 & 64) != 0) {
                  var7 = ((oc) this).field_a[var7];
                  break L3;
                } else {
                  var7++;
                  break L3;
                }
              }
              L4: {
                var10 = ((oc) this).field_a[var7];
                if (0 <= ((oc) this).field_a[var7]) {
                  break L4;
                } else {
                  int incrementValue$9 = param2;
                  param2++;
                  param4[incrementValue$9] = (byte)(var10 ^ -1);
                  if (param3 > param2) {
                    var7 = 0;
                    break L4;
                  } else {
                    return 1 + (var8 + -param1);
                  }
                }
              }
              L5: {
                if ((32 & var9) != 0) {
                  var7 = ((oc) this).field_a[var7];
                  break L5;
                } else {
                  var7++;
                  break L5;
                }
              }
              L6: {
                var10 = ((oc) this).field_a[var7];
                if (((oc) this).field_a[var7] < 0) {
                  int incrementValue$10 = param2;
                  param2++;
                  param4[incrementValue$10] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L6;
                  } else {
                    return 1 + (var8 + -param1);
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if ((var9 & 16) == 0) {
                  var7++;
                  break L7;
                } else {
                  var7 = ((oc) this).field_a[var7];
                  break L7;
                }
              }
              L8: {
                var10 = ((oc) this).field_a[var7];
                if (0 <= ((oc) this).field_a[var7]) {
                  break L8;
                } else {
                  int incrementValue$11 = param2;
                  param2++;
                  param4[incrementValue$11] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L8;
                  } else {
                    return 1 + (var8 + -param1);
                  }
                }
              }
              L9: {
                if (-1 != (var9 & 8)) {
                  var7 = ((oc) this).field_a[var7];
                  break L9;
                } else {
                  var7++;
                  break L9;
                }
              }
              L10: {
                var10 = ((oc) this).field_a[var7];
                if (-1 <= ((oc) this).field_a[var7]) {
                  break L10;
                } else {
                  int incrementValue$12 = param2;
                  param2++;
                  param4[incrementValue$12] = (byte)var10;
                  if (param3 > param2) {
                    var7 = 0;
                    break L10;
                  } else {
                    return 1 + (var8 + -param1);
                  }
                }
              }
              L11: {
                if (-1 == (4 & var9)) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((oc) this).field_a[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((oc) this).field_a[var7];
                if (((oc) this).field_a[var7] < 0) {
                  int incrementValue$13 = param2;
                  param2++;
                  param4[incrementValue$13] = (byte)(var10 ^ -1);
                  if (param3 > param2) {
                    var7 = 0;
                    break L12;
                  } else {
                    return 1 + (var8 + -param1);
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if ((var9 & 2) != -1) {
                  var7 = ((oc) this).field_a[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                var10 = ((oc) this).field_a[var7];
                if (-1 <= ((oc) this).field_a[var7]) {
                  break L14;
                } else {
                  int incrementValue$14 = param2;
                  param2++;
                  param4[incrementValue$14] = (byte)(var10 ^ -1);
                  if (param2 < param3) {
                    var7 = 0;
                    break L14;
                  } else {
                    return 1 + (var8 + -param1);
                  }
                }
              }
              L15: {
                if (-1 != (1 & var9)) {
                  var7 = ((oc) this).field_a[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              var10 = ((oc) this).field_a[var7];
              if (-1 <= ((oc) this).field_a[var7]) {
                var8++;
                var8++;
                continue L0;
              } else {
                int incrementValue$15 = param2;
                param2++;
                param4[incrementValue$15] = (byte)(var10 ^ -1);
                if (param3 > param2) {
                  var7 = 0;
                  var8++;
                  continue L0;
                } else {
                  return 1 + (var8 + -param1);
                }
              }
            }
          } else {
            return 92;
          }
        } else {
          return 0;
        }
    }

    final static void a(boolean param0, String[] param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        if (!param0) {
          cb.field_v = ui.field_ob;
          if (-256 != (param2 ^ -1)) {
            if (param2 >= 100) {
              if ((param2 ^ -1) < -106) {
                rl.field_b = af.a((byte) 36, param2, param3);
                return;
              } else {
                rl.field_b = ha.a(param1, -21916);
                return;
              }
            } else {
              rl.field_b = af.a((byte) 36, param2, param3);
              return;
            }
          } else {
            L0: {
              if (13 <= ug.field_c) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            rl.field_b = ld.a(stackIn_16_0 != 0, (byte) 42);
            return;
          }
        } else {
          field_d = null;
          cb.field_v = ui.field_ob;
          if (-256 != (param2 ^ -1)) {
            if (param2 >= 100) {
              if ((param2 ^ -1) < -106) {
                rl.field_b = af.a((byte) 36, param2, param3);
                return;
              } else {
                rl.field_b = ha.a(param1, -21916);
                return;
              }
            } else {
              rl.field_b = af.a((byte) 36, param2, param3);
              return;
            }
          } else {
            L1: {
              if (13 <= ug.field_c) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            rl.field_b = ld.a(stackIn_5_0 != 0, (byte) 42);
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        int var1 = -85 / ((58 - param0) / 44);
    }

    private oc() throws Throwable {
        throw new Error();
    }

    final static dd[] a(rh param0, int param1, int param2, byte param3) {
        if (!ha.a(param0, -32180, param2, param1)) {
            return null;
        }
        if (param3 >= -95) {
            return null;
        }
        return me.b(120);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_d = "<%0>Basic wall:<%1> merely gets in the fleas' way (one of the three tiles you can place yourself).";
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
