/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw extends mn {
    static String field_z;
    static String field_x;
    private int field_A;
    static int field_B;
    private int field_E;
    static String field_C;
    private int field_v;
    static String field_y;
    static String field_w;
    static String field_D;

    final static String a(CharSequence param0, boolean param1) {
        if (param1) {
            hw.a((byte) 111);
        }
        return nk.a(false, param0, (byte) -95);
    }

    private final String a(String[] param0, byte param1) {
        if (param1 >= -50) {
            field_C = null;
        }
        return ((hw) this).a(119, param0, "summon");
    }

    final static void a(boolean param0, byte param1) {
        if (param1 >= -74) {
            field_w = null;
        }
        if (tb.field_e != null) {
            tb.field_e.b(param0, 20);
        }
    }

    public static void a(byte param0) {
        field_y = null;
        if (param0 >= -42) {
            Object var2 = null;
            String discarded$0 = hw.a((CharSequence) null, true);
        }
        field_z = null;
        field_D = null;
        field_x = null;
        field_w = null;
        field_C = null;
    }

    final static String a(int param0, Class param1) {
        if (param0 != 640) {
            hw.a(false, (byte) 44);
        }
        if (!param1.isArray()) {
            return param1.getName().substring(1 + param1.getName().lastIndexOf("."));
        }
        return hw.a(param0 ^ 0, param1.getComponentType()) + "[]";
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        wk var8 = null;
        wk var9 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = -1;
          if (null == gv.field_a) {
            break L0;
          } else {
            if (param1 >= gv.field_a.length) {
              break L0;
            } else {
              L1: {
                if (null == gv.field_a[param1]) {
                  break L1;
                } else {
                  if (gv.field_a[param1].length <= param2) {
                    break L1;
                  } else {
                    L2: {
                      if (param0 == 29) {
                        break L2;
                      } else {
                        int discarded$1 = hw.a(false);
                        break L2;
                      }
                    }
                    var4 = 0;
                    L3: while (true) {
                      if (gv.field_a[param1][param2].length <= var4) {
                        if (-1 <= (var3 ^ -1)) {
                          return;
                        } else {
                          var7 = 0;
                          var4 = var7;
                          L4: while (true) {
                            if (var7 >= gv.field_a[param1][param2].length) {
                              return;
                            } else {
                              var9 = gv.field_a[param1][param2][var7];
                              if (var9 != null) {
                                if (var3 > var9.field_A) {
                                  var9.field_w = -var9.field_A + var3 >> -450827551;
                                  var9.field_A = var3;
                                  var7++;
                                  continue L4;
                                } else {
                                  var7++;
                                  continue L4;
                                }
                              } else {
                                var7++;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var8 = gv.field_a[param1][param2][var4];
                        if (var8 != null) {
                          if (-1 >= var8.field_A) {
                            L5: {
                              if (-1 > var3) {
                                break L5;
                              } else {
                                if (var8.field_A >= var3) {
                                  break L5;
                                } else {
                                  var4++;
                                  continue L3;
                                }
                              }
                            }
                            var3 = var8.field_A;
                            var4++;
                            continue L3;
                          } else {
                            var4++;
                            continue L3;
                          }
                        } else {
                          var4++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final bd a(int param0, ha param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          ((hw) this).d(-114);
          if (-75 != ((hw) this).field_v) {
            if (-5 != ((hw) this).field_v) {
              break L0;
            } else {
              if (-3 != param1.field_hb) {
                break L0;
              } else {
                ((hw) this).field_v = 81;
                break L0;
              }
            }
          } else {
            if (-5 != ((hw) this).field_v) {
              break L0;
            } else {
              if (-3 != param1.field_hb) {
                break L0;
              } else {
                ((hw) this).field_v = 81;
                break L0;
              }
            }
          }
        }
        L1: {
          var3 = bw.field_m[((hw) this).field_v][1];
          if (0 != var3) {
            var4 = 0;
            var5 = param1.field_c[((hw) this).field_p];
            var6 = 0;
            L2: while (true) {
              L3: {
                if (var6 >= var5.length) {
                  break L3;
                } else {
                  var7 = var5[var6];
                  if (var7 == var3) {
                    var4 = 1;
                    break L3;
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              }
              if (var4 == 0) {
                String discarded$3 = this.a(new String[2], (byte) -62);
                return null;
              } else {
                break L1;
              }
            }
          } else {
            var3 = 12;
            break L1;
          }
        }
        if (0 == (param1.c(((hw) this).field_E, -27300, ((hw) this).field_A, ((hw) this).field_p) & 1 << var3)) {
          String discarded$4 = this.a(new String[4], (byte) -111);
          return null;
        } else {
          if (param1.b(((hw) this).field_A, -26813, ((hw) this).field_v, ((hw) this).field_E, ((hw) this).field_p)) {
            L4: {
              if (param0 >= 31) {
                break L4;
              } else {
                field_y = null;
                break L4;
              }
            }
            var4 = param1.a(bw.field_m[((hw) this).field_v][1], ((hw) this).field_A, ((hw) this).field_E, 0, ((hw) this).field_p, bw.field_m[((hw) this).field_v][2]);
            return (bd) (Object) new be(((hw) this).field_E, ((hw) this).field_A, ((hw) this).field_v, var4, ((hw) this).field_p);
          } else {
            String discarded$5 = this.a(new String[4], (byte) -87);
            return null;
          }
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
            field_B = -104;
        }
        return -co.field_f + bm.field_h;
    }

    final static void a(byte param0, int[] param1, int param2) {
        kr.field_y[param2] = param1;
        rq.field_p[param2] = new ci(param2);
        if (param0 <= 17) {
            field_B = -14;
        }
    }

    hw(int param0, int param1, int param2, int param3) {
        ((hw) this).field_v = param3;
        ((hw) this).field_E = param1;
        ((hw) this).field_p = param0;
        ((hw) this).field_A = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_x = "Plate";
        field_C = "Only show private chat from my friends and opponents";
        field_w = "This coat of arms will be unlocked at <%0>. After collecting <%1> more, you may use any of the parts from it in your own coat of arms.";
        field_y = "You cannot join this game - it is in progress";
        field_D = "Your captured buildings will produce a bonus amount of mana per turn.";
    }
}
