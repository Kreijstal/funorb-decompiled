/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    private String field_g;
    static int field_f;
    static String field_d;
    static kg field_c;
    static int[] field_b;
    static ba field_e;
    static String field_a;
    static String field_h;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 < 114) {
            return;
        }
        field_h = null;
        field_b = null;
        field_e = null;
    }

    final static void a(rj param0, byte param1, int param2) {
        kd.field_c = param2;
        uo.field_f = le.field_b[kd.field_c];
        fc.field_d = 0;
        id.field_l = param0;
        if (param1 < 40) {
            return;
        }
        og.a(false, 0, uo.field_f[fc.field_d]);
    }

    final void a(int param0, java.applet.Applet param1) {
        if (param0 != 64) {
            Object var4 = null;
            ba.a((rj) null, (byte) 20, -83);
        }
        lm.a(false, "jagex-last-login-method", 31536000L, param1, ((ba) this).field_g);
    }

    final boolean a(String param0, int param1) {
        if (param1 != 20886) {
            return true;
        }
        return ((ba) this).field_g.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static cn[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        cn[] var10 = null;
        cn[] var11_ref_cn__ = null;
        int var11 = 0;
        int var12 = 0;
        cn var13 = null;
        int var14 = 0;
        L0: {
          var9 = param6 + (param5 + param8);
          var10 = new cn[]{new cn(var9, var9), new cn(param1, var9), new cn(var9, var9), new cn(var9, param1), new cn(64, 64), new cn(var9, param1), new cn(var9, var9), new cn(param1, var9), new cn(var9, var9)};
          if (param2 <= -80) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var11_ref_cn__ = var10;
        var12 = 0;
        L1: while (true) {
          if (var11_ref_cn__.length <= var12) {
            var11 = 0;
            L2: while (true) {
              if (param6 <= var11) {
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param6) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param1) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param1 >> 459638689) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param8 > var12) {
                                var10[1].field_B[var11 + (var9 + -var12 + -1) * param1] = param7;
                                var10[3].field_B[-var12 - (-var9 + 1) + var9 * var11] = param7;
                                var10[7].field_B[var11 + var12 * param1] = param7;
                                var10[5].field_B[var11 * var9 - -var12] = param7;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param6 > var12) {
                            var10[7].field_B[var11 + (-var12 + var9 - 1) * param1] = param4;
                            var10[5].field_B[var11 * var9 - (-var9 - -1) + -var12] = param4;
                            var10[1].field_B[param1 * var12 - -var11] = param0;
                            var10[3].field_B[var12 + var11 * var9] = param0;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 > var12) {
                        var10[0].field_B[var11 * var9 + var12] = param0;
                        var10[0].field_B[var11 + var9 * var12] = param0;
                        if (-var11 + var9 > var12) {
                          var10[2].field_B[var9 * var11 + var12] = param0;
                          var10[6].field_B[var11 + var12 * var9] = param0;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L2;
                  } else {
                    var10[6].field_B[var12 + var9 * (-var11 + (var9 + -1))] = param4;
                    var10[8].field_B[(-1 + var9 + -var11) * var9 - -var12] = param4;
                    var10[2].field_B[var12 * var9 + (-var11 + -1 + var9)] = param4;
                    var10[8].field_B[var9 - 1 - var11 + var12 * var9] = param4;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_cn__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_B.length <= var14) {
                var12++;
                continue L1;
              } else {
                var13.field_B[var14] = param3;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    ba(String param0) {
        ((ba) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Your raider was detected by trap, but avoided it.";
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_a = "Notoriously dimwitted, the ogres share the highlands with the goblin and orc tribes. What this particular ogre thug lacks in intellect and subtlety, he compensates for with raw force.";
        field_c = null;
        field_e = new ba("email");
        field_h = "Dungeon Assault";
    }
}
