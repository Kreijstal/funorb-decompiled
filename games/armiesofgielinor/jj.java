/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static String field_b;
    static String field_h;
    static String field_d;
    static String[] field_a;
    static String field_f;
    static String field_e;
    static kl field_c;
    static je[] field_i;
    static hi field_g;

    public static void a(byte param0) {
        field_g = null;
        if (param0 >= -106) {
            Object var2 = null;
            boolean discarded$0 = jj.a(-113, (String) null);
            field_i = null;
            field_d = null;
            field_c = null;
            field_h = null;
            field_b = null;
            field_a = null;
            field_e = null;
            field_f = null;
            return;
        }
        field_i = null;
        field_d = null;
        field_c = null;
        field_h = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static boolean a(int param0, String param1) {
        if (param0 < 18) {
            Object var3 = null;
            boolean discarded$4 = jj.a(93, (String) null);
            return lg.a(param1, (byte) -34) != null ? true : false;
        }
        return lg.a(param1, (byte) -34) != null ? true : false;
    }

    final static String a(byte param0, int param1, String[][] param2, int param3) {
        String var5 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        String var4 = param2[param3][param1];
        int var6 = -73 / ((12 - param0) / 61);
        if (!le.a((byte) -125, var4)) {
            if (!iq.a(30, var4)) {
                if (kq.a(var4, false)) {
                    var5 = var4;
                    return var5;
                }
                var5 = null;
                return var5;
            }
            var5 = ua.a(param3, (byte) 78, var4);
            return var5;
        }
        var5 = var4;
        return var5;
    }

    final static void a(byte param0, int param1, vh param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 != null) {
          if (param1 != 0) {
            var4 = 0;
            L0: while (true) {
              if (-4 <= (param1 ^ -1)) {
                L1: {
                  var5 = 0;
                  if (-1 <= (param1 ^ -1)) {
                    break L1;
                  } else {
                    var5 = var5 | param3[var4];
                    if (1 < param1) {
                      var5 = var5 | param3[1 + var4] << 1084478370;
                      if (-3 > (param1 ^ -1)) {
                        var5 = var5 | param3[var4 + 2] << 721271172;
                        param2.b(1, var5);
                        break L1;
                      } else {
                        L2: {
                          param2.b(1, var5);
                          if (param0 <= -17) {
                            break L2;
                          } else {
                            boolean discarded$3 = jj.b((byte) -104);
                            break L2;
                          }
                        }
                        return;
                      }
                    } else {
                      L3: {
                        param2.b(1, var5);
                        if (param0 <= -17) {
                          break L3;
                        } else {
                          boolean discarded$4 = jj.b((byte) -104);
                          break L3;
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0 <= -17) {
                  return;
                } else {
                  boolean discarded$5 = jj.b((byte) -104);
                  return;
                }
              } else {
                param2.b(1, param3[var4] | param3[var4 - -1] << 1889181410 | param3[2 + var4] << -1268675292 | param3[3 + var4] << 1969611622);
                param1 -= 4;
                var4 += 4;
                continue L0;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, kl param1) {
        int var3 = 0;
        int var4 = 0;
        pu var5 = null;
        int[] var6 = null;
        int var7 = 0;
        bv var8 = null;
        int var9 = 0;
        bv var10 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var8 = new bv(param1.a("", 97, "logo.fo3d"));
        var10 = var8;
        var3 = var10.k(0);
        var10.o(90);
        if (param0 <= -74) {
          pg.field_a = fk.a(12, var10);
          iq.field_a = new pu[var3];
          sd.field_s = new int[var3][];
          var4 = 0;
          L0: while (true) {
            if (var3 <= var4) {
              var10.n(-2);
              var9 = 0;
              var4 = var9;
              L1: while (true) {
                if (var9 >= var3) {
                  return;
                } else {
                  var5 = iq.field_a[var9];
                  var5.a(1, 6, 6, 6, 115);
                  var5.a(-3831);
                  var6 = new int[]{var5.field_p - -var5.field_L >> 970065153, var5.field_H + var5.field_P >> -85342047, var5.field_J + var5.field_D >> -1895764831};
                  sd.field_s[var9] = var6;
                  var5.a(-var6[2], 0, -var6[1], -var6[0]);
                  var9++;
                  continue L1;
                }
              }
            } else {
              iq.field_a[var4] = oj.a(-86, var8);
              var4++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (!(null != ra.field_e)) {
            throw new IllegalStateException("NGR");
        }
        ra.field_e.field_h = true;
        if (param0 != -4223) {
            field_b = null;
            ds.a(1, -54);
            return;
        }
        ds.a(1, -54);
    }

    final static boolean b(byte param0) {
        Object var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 == -73) {
          if (tn.field_Z == null) {
            if (!dn.l(0)) {
              L0: {
                if (ik.field_b != null) {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L0;
                } else {
                  if (!vg.a(10)) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return stackIn_20_0 != 0;
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var2 = null;
          boolean discarded$13 = jj.a(47, (String) null);
          if (tn.field_Z == null) {
            if (!dn.l(0)) {
              L1: {
                if (ik.field_b != null) {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L1;
                } else {
                  if (!vg.a(10)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    return true;
                  }
                }
              }
              return stackIn_10_0 != 0;
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Only show game chat from my friends";
        field_h = "Password: ";
        field_d = "No spectators";
        field_a = new String[]{"Open", "Track", "Mountain", "Forest", "River", "Swamp", "Sea", "Permanent portal", "Village", "Tower", "Bridge", "Temporary portal", "Wall", "Destroyed wall", "Temple", "Standing Stone"};
        field_e = "Show private chat from my friends and opponents";
        field_f = "An opponent who loses a key building will be immediately eliminated.";
    }
}
