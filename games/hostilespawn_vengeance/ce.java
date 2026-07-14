/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ce {
    static u[] field_f;
    static int field_e;
    pm[] field_d;
    static int[] field_b;
    static String field_g;
    static bd field_a;
    static int field_c;

    final int b(int param0, int param1) {
        int var4 = 0;
        pm var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        pm[] var7 = ((ce) this).field_d;
        pm[] var3 = var7;
        for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5.field_b.length > param0) {
                return var5.field_b[param0];
            }
            param0 = param0 - (var5.field_b.length + -1);
        }
        return 0;
    }

    final int a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (((ce) this).field_d == null) {
                break L1;
              } else {
                if (0 < ((ce) this).field_d.length) {
                  stackOut_6_0 = ((ce) this).field_d[((ce) this).field_d.length - 1].field_f - ((ce) this).field_d[0].field_i;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 24;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        pm var4 = null;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        for (var3 = param1; ((ce) this).field_d.length > var3; var3++) {
            var4 = ((ce) this).field_d[var3];
            if (var4.field_b.length > param0) {
                return var3;
            }
            param0 = param0 - (var4.field_b.length + -1);
        }
        return ((ce) this).field_d.length;
    }

    final static void a(ln param0, boolean param1) {
        int var2 = 0;
        ln var3 = null;
        int var4 = 0;
        ln stackIn_17_0 = null;
        ln stackIn_18_0 = null;
        ln stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ln stackOut_16_0 = null;
        ln stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ln stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (null != param0.field_s) {
          L0: {
            L1: {
              if (-1 != (param0.field_i ^ -1)) {
                break L1;
              } else {
                if (param0.field_e != 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= qb.field_i) {
                break L0;
              } else {
                var3 = rj.field_J[var2];
                if (2 == var3.field_f) {
                  if (param0.field_i == var3.field_i) {
                    if (param0.field_e == var3.field_e) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (null == param0.field_o) {
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (ln) param0;
            stackIn_18_0 = stackOut_16_0;
            stackIn_17_0 = stackOut_16_0;
            if (param1) {
              stackOut_18_0 = (ln) (Object) stackIn_18_0;
              stackOut_18_1 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L4;
            } else {
              stackOut_17_0 = (ln) (Object) stackIn_17_0;
              stackOut_17_1 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              break L4;
            }
          }
          L5: {
            ed.a(stackIn_19_0, stackIn_19_1 != 0);
            if (param1) {
              break L5;
            } else {
              field_f = null;
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        pm var6 = null;
        int var7 = 0;
        int var8 = HostileSpawn.field_I ? 1 : 0;
        if (null != ((ce) this).field_d) {
            // ifeq L37
            // if_icmpgt L37
        } else {
            return -1;
        }
        if (!(param1 <= ((ce) this).field_d[-1 + ((ce) this).field_d.length].field_f)) {
            return -1;
        }
        if ((((ce) this).field_d.length ^ -1) == -2) {
            return ((ce) this).field_d[0].a(param2, (byte) -111);
        }
        int var4 = 0;
        if (param0 <= 82) {
            return -76;
        }
        for (var5 = 0; ((ce) this).field_d.length > var5; var5++) {
            var6 = ((ce) this).field_d[var5];
            if (var6.field_i <= param1) {
                if (!(var6.field_f < param1)) {
                    var7 = var6.a(param2, (byte) -125);
                    if (-1 == var7) {
                        return -1;
                    }
                    return var4 - -var7;
                }
            }
            var4 = var4 + (var6.field_b.length + -1);
        }
        return -1;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        if (param2 >= 1) {
          var5 = 0;
          var6 = 0;
          var7 = param3.length();
          var8 = 0;
          L0: while (true) {
            if (var7 <= var8) {
              if (0 >= var5) {
                return 0;
              } else {
                return (param1 + -param0 << 1671528488) / var5;
              }
            } else {
              var9 = param3.charAt(var8);
              if (var9 == 60) {
                var6 = 1;
                var8++;
                continue L0;
              } else {
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
              }
            }
          }
        } else {
          return -59;
        }
    }

    final int a(int param0) {
        int var2 = 0;
        pm[] var3 = null;
        int var4 = 0;
        pm var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var2 = -1;
        if (param0 == 3915) {
          L0: {
            if (null != ((ce) this).field_d) {
              var3 = ((ce) this).field_d;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a((byte) 127);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return -107;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        if (param0 != 6937) {
            ce.b(85);
        }
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = new int[]{100, 235, 340, 550};
    }
}
