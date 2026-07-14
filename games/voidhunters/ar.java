/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ar {
    static boolean field_d;
    toa[] field_c;
    static int field_b;
    static String field_a;

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        toa var6 = null;
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        if (((ar) this).field_c != null) {
            // if_icmpeq L37
            // if_icmpgt L37
        } else {
            return -1;
        }
        if (!(((ar) this).field_c[-1 + ((ar) this).field_c.length].field_a >= param0)) {
            return -1;
        }
        if (param1 != -23381) {
            return 25;
        }
        if (!(1 != ((ar) this).field_c.length)) {
            return ((ar) this).field_c[0].a(-74, param2);
        }
        int var4 = 0;
        for (var5 = 0; var5 < ((ar) this).field_c.length; var5++) {
            var6 = ((ar) this).field_c[var5];
            if (var6.field_b <= param0) {
                if (!(param0 > var6.field_a)) {
                    var7 = var6.a(-88, param2);
                    if (-1 == var7) {
                        return -1;
                    }
                    return var4 + var7;
                }
            }
            var4 = var4 + (-1 + var6.field_c.length);
        }
        return -1;
    }

    final int a(int param0) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 29565) {
            break L0;
          } else {
            var3 = null;
            int discarded$2 = ((ar) this).a(true, -112, -23, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ar) this).field_c == null) {
              break L2;
            } else {
              if (((ar) this).field_c.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = -((ar) this).field_c[0].field_b + ((ar) this).field_c[((ar) this).field_c.length + -1].field_a;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(boolean param0, int param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        var5 = 0;
        var6 = param0 ? 1 : 0;
        var7 = param3.length();
        var8 = 0;
        L0: while (true) {
          if (var8 >= var7) {
            if ((var5 ^ -1) >= -1) {
              return 0;
            } else {
              return (-param2 + param1 << -891458168) / var5;
            }
          } else {
            var9 = param3.charAt(var8);
            if (60 != var9) {
              if (var9 != 62) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var8++;
                continue L0;
              }
            } else {
              var6 = 1;
              var8++;
              continue L0;
            }
          }
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        toa var4 = null;
        int var5 = VoidHunters.field_G;
        if (!param0) {
            return -43;
        }
        for (var3 = 0; ((ar) this).field_c.length > var3; var3++) {
            var4 = ((ar) this).field_c[var3];
            if (!(param1 >= var4.field_c.length)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_c.length);
        }
        return ((ar) this).field_c.length;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        L0: {
          if (param1 >= 102) {
            break L0;
          } else {
            field_b = 115;
            break L0;
          }
        }
        L1: {
          var4 = param0 >> -158384769;
          param0 = var4 ^ var4 + param0;
          var4 = param2 >> -1104817025;
          param2 = var4 ^ param2 + var4;
          var3 = 0;
          if (param2 > param0) {
            var4 = param0;
            param0 = param2;
            param2 = var4;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-32769 < (param0 ^ -1)) {
            break L2;
          } else {
            L3: {
              if (param0 < 1073741824) {
                break L3;
              } else {
                param0 = param0 >> 16;
                var3 += 16;
                break L3;
              }
            }
            L4: {
              if (param0 > -4194305) {
                break L4;
              } else {
                var3 += 8;
                param0 = param0 >> 8;
                break L4;
              }
            }
            L5: {
              if (262144 > param0) {
                break L5;
              } else {
                var3 += 4;
                param0 = param0 >> 4;
                break L5;
              }
            }
            L6: {
              if (-65537 <= param0) {
                param0 = param0 >> 2;
                var3 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0 < 32768) {
                break L7;
              } else {
                var3++;
                param0 = param0 >> 1;
                break L7;
              }
            }
            param2 = param2 >> var3;
            break L2;
          }
        }
        if (param0 > param2 << 1888444485) {
          return param0 << var3;
        } else {
          param0 = param2 * param2 + param0 * param0;
          if (param0 >= 65536) {
            if (16777216 <= param0) {
              if (-268435457 < (param0 ^ -1)) {
                if (-67108865 < (param0 ^ -1)) {
                  L8: {
                    if (var3 >= 3) {
                      stackOut_55_0 = eo.field_o[param0 >> 1860748338] << -3 + var3;
                      stackIn_56_0 = stackOut_55_0;
                      break L8;
                    } else {
                      stackOut_54_0 = eo.field_o[param0 >> -762980814] >> -var3 + 3;
                      stackIn_56_0 = stackOut_54_0;
                      break L8;
                    }
                  }
                  return stackIn_56_0;
                } else {
                  L9: {
                    if ((var3 ^ -1) > -3) {
                      stackOut_51_0 = eo.field_o[param0 >> -70313740] >> 2 + -var3;
                      stackIn_52_0 = stackOut_51_0;
                      break L9;
                    } else {
                      stackOut_50_0 = eo.field_o[param0 >> 615335380] << var3 - 2;
                      stackIn_52_0 = stackOut_50_0;
                      break L9;
                    }
                  }
                  return stackIn_52_0;
                }
              } else {
                if (1073741824 > param0) {
                  L10: {
                    if (var3 >= 1) {
                      stackOut_46_0 = eo.field_o[param0 >> 1574831190] << -1 + var3;
                      stackIn_47_0 = stackOut_46_0;
                      break L10;
                    } else {
                      stackOut_45_0 = eo.field_o[param0 >> 1046894582] >> 1 - var3;
                      stackIn_47_0 = stackOut_45_0;
                      break L10;
                    }
                  }
                  return stackIn_47_0;
                } else {
                  return eo.field_o[param0 >> 1628591128] << var3;
                }
              }
            } else {
              if (-1048577 < (param0 ^ -1)) {
                if (262144 <= param0) {
                  return eo.field_o[param0 >> 782844172] >> -1544320026;
                } else {
                  return eo.field_o[param0 >> -1161863990] >> 1046900583;
                }
              } else {
                if (param0 < 4194304) {
                  return eo.field_o[param0 >> 1136719950] >> 2017888485;
                } else {
                  return eo.field_o[param0 >> -102332720] >> 884362884;
                }
              }
            }
          } else {
            if ((param0 ^ -1) <= -257) {
              if (4096 <= param0) {
                if (param0 < 16384) {
                  return eo.field_o[param0 >> 2107089254] >> -905256823;
                } else {
                  return eo.field_o[param0 >> 697391720] >> -57817688;
                }
              } else {
                if (param0 >= 1024) {
                  return eo.field_o[param0 >> -504990076] >> -709833174;
                } else {
                  return eo.field_o[param0 >> -1083719934] >> -1084556789;
                }
              }
            } else {
              if ((param0 ^ -1) > -1) {
                return -1;
              } else {
                return eo.field_o[param0] >> -507549300;
              }
            }
          }
        }
    }

    final int c(int param0) {
        int var2 = 0;
        toa[] var3 = null;
        int var4 = 0;
        toa var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param0 == -18877) {
            break L0;
          } else {
            int discarded$2 = ar.a(-4, (byte) -85, -6);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null == ((ar) this).field_c) {
            break L1;
          } else {
            var3 = ((ar) this).field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(0);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var2;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 < 41) {
            field_a = null;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        toa var5 = null;
        int var6 = VoidHunters.field_G;
        toa[] var7 = ((ar) this).field_c;
        toa[] var3 = var7;
        if (param1 > -107) {
            int discarded$0 = ((ar) this).c(-56);
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_c.length > param0) {
                return var5.field_c[param0];
            }
            param0 = param0 - (-1 + var5.field_c.length);
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> has withdrawn the request to join.";
        field_b = 0;
    }
}
