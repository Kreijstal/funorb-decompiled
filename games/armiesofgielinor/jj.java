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
            String var2 = (String) null;
            jj.a(-113, (String) null);
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
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 18) {
                break L1;
              } else {
                var3 = (String) null;
                jj.a(93, (String) null);
                break L1;
              }
            }
            L2: {
              if (lg.a(param1, (byte) -34) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("jj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static String a(byte param0, int param1, String[][] param2, int param3) {
        String var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = param2[param3][param1];
              var6 = -73 / ((12 - param0) / 61);
              if (le.a((byte) -125, var4)) {
                var5 = var4;
                break L1;
              } else {
                if (iq.a(30, var4)) {
                  var5 = ua.a(param3, (byte) 78, var4);
                  break L1;
                } else {
                  if (!kq.a(var4, false)) {
                    var5 = null;
                    break L1;
                  } else {
                    var5 = var4;
                    break L1;
                  }
                }
              }
            }
            stackIn_9_0 = var5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("jj.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return (String) ((Object) stackIn_9_0);
    }

    final static void a(byte param0, int param1, vh param2, int[] param3) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param1 == 0) {
                  break L1;
                } else {
                  var4_int = 0;
                  L2: while (true) {
                    if (-4 <= (param1 ^ -1)) {
                      L3: {
                        var5 = 0;
                        if (-1 <= (param1 ^ -1)) {
                          break L3;
                        } else {
                          L4: {
                            var5 = var5 | param3[var4_int];
                            if (1 < param1) {
                              var5 = var5 | param3[1 + var4_int] << 1084478370;
                              if (-3 > (param1 ^ -1)) {
                                var5 = var5 | param3[var4_int + 2] << 721271172;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          param2.b(1, var5);
                          break L3;
                        }
                      }
                      L5: {
                        if (param0 <= -17) {
                          break L5;
                        } else {
                          jj.b((byte) -104);
                          break L5;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param2.b(1, param3[var4_int] | param3[var4_int - -1] << 1889181410 | param3[2 + var4_int] << -1268675292 | param3[3 + var4_int] << 1969611622);
                      param1 -= 4;
                      var4_int += 4;
                      continue L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("jj.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var8 = new bv(param1.a("", 97, "logo.fo3d"));
            var10 = var8;
            var3 = var10.k(0);
            var10.o(90);
            if (param0 <= -74) {
              pg.field_a = fk.a(12, var10);
              iq.field_a = new pu[var3];
              sd.field_s = new int[var3][];
              var4 = 0;
              L1: while (true) {
                if (var3 <= var4) {
                  var10.n(-2);
                  var9 = 0;
                  var4 = var9;
                  L2: while (true) {
                    if (var9 >= var3) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5 = iq.field_a[var9];
                      var5.a(1, 6, 6, 6, 115);
                      var5.a(-3831);
                      var6 = new int[]{var5.field_p - -var5.field_L >> 970065153, var5.field_H + var5.field_P >> -85342047, var5.field_J + var5.field_D >> -1895764831};
                      sd.field_s[var9] = var6;
                      var5.a(-var6[2], 0, -var6[1], -var6[0]);
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  iq.field_a[var4] = oj.a(-86, var8);
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("jj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
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
            field_b = (String) null;
            ds.a(1, -54);
            return;
        }
        ds.a(1, -54);
    }

    final static boolean b(byte param0) {
        String var2;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        if (param0 == -73) {
          if (tn.field_Z == null) {
            if (!dn.l(0)) {
              L0: {
                if (ik.field_b != null) {
                  stackIn_20_0 = 1;
                  break L0;
                } else {
                  if (!vg.a(10)) {
                    stackIn_20_0 = 0;
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
          var2 = (String) null;
          jj.a(47, (String) null);
          if (tn.field_Z == null) {
            if (!dn.l(0)) {
              L1: {
                if (ik.field_b != null) {
                  stackIn_10_0 = 1;
                  break L1;
                } else {
                  if (!vg.a(10)) {
                    stackIn_10_0 = 0;
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
        field_b = "Only show game chat from my friends";
        field_h = "Password: ";
        field_d = "No spectators";
        field_a = new String[]{"Open", "Track", "Mountain", "Forest", "River", "Swamp", "Sea", "Permanent portal", "Village", "Tower", "Bridge", "Temporary portal", "Wall", "Destroyed wall", "Temple", "Standing Stone"};
        field_e = "Show private chat from my friends and opponents";
        field_f = "An opponent who loses a key building will be immediately eliminated.";
    }
}
