/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends ih {
    private boolean field_cb;
    private int[] field_fb;
    private int field_ib;
    static je field_kb;
    static String field_db;
    static String field_gb;
    private int[] field_S;
    static String[] field_eb;
    static mq field_jb;
    private vk field_hb;
    static String field_bb;

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == null) {
          return false;
        } else {
          L0: {
            var3 = param0.length();
            if (var3 < param1) {
              break L0;
            } else {
              if (-13 > (var3 ^ -1)) {
                break L0;
              } else {
                L1: {
                  var4 = k.a(param0, false);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) > -2) {
                      break L1;
                    } else {
                      L2: {
                        if (rs.a(var4.charAt(0), (byte) -111)) {
                          break L2;
                        } else {
                          if (rs.a(var4.charAt(var4.length() - 1), (byte) -74)) {
                            break L2;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L3: while (true) {
                              if (var6 >= param0.length()) {
                                if (var5 <= 0) {
                                  return true;
                                } else {
                                  return false;
                                }
                              } else {
                                L4: {
                                  var7 = param0.charAt(var6);
                                  if (rs.a((char) var7, (byte) -42)) {
                                    var5++;
                                    break L4;
                                  } else {
                                    var5 = 0;
                                    break L4;
                                  }
                                }
                                if (2 <= var5) {
                                  if (!param2) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                return false;
              }
            }
          }
          return false;
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (-1 == param1) {
            ((wn) this).field_ib = param0;
            return;
        }
        this.a(param0, param1, (byte) -28);
        ((wn) this).field_S[param1] = param0 << 568932236;
        if (param2 > -13) {
            Object var5 = null;
            ((wn) this).a(true, (byte) 40, true, (um) null);
        }
    }

    public wn() {
        ((wn) this).field_fb = new int[16];
        ((wn) this).field_ib = 256;
        ((wn) this).field_S = new int[16];
        this.k(3933);
    }

    final static void a(int param0, wk[] param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == null) {
            break L0;
          } else {
            if (-1 > (param2 ^ -1)) {
              L1: {
                var6 = param1[0].field_A;
                var7 = param1[2].field_A;
                var8 = param1[1].field_A;
                param1[0].b(param3, param4, param0);
                param1[2].b(-var7 + param2 + param3, param4, param0);
                qn.b(an.field_H);
                qn.b(var6 + param3, param4, param3 + param2 + -var7, param1[1].field_x + param4);
                if (param5 == -3225) {
                  break L1;
                } else {
                  wn.a(true);
                  break L1;
                }
              }
              var9 = var6 + param3;
              var10 = -var7 + param2 + param3;
              param3 = var9;
              L2: while (true) {
                if (var10 <= param3) {
                  qn.a(an.field_H);
                  return;
                } else {
                  param1[1].b(param3, param4, param0);
                  param3 = param3 + var8;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != 52) {
            Object var2 = null;
            boolean discarded$0 = wn.a((CharSequence) null, -50, false);
        }
        field_kb = null;
        field_jb = null;
        field_eb = null;
        field_bb = null;
        field_db = null;
        field_gb = null;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = ((wn) this).i(4096);
          ((wn) this).f(-87, ((wn) this).field_ib * var4 >> -1208277848);
          this.b(param0, param1, param2);
          if (!((wn) this).field_cb) {
            var5 = 1;
            var6 = 0;
            L1: while (true) {
              if ((var6 ^ -1) <= -17) {
                if (var5 != 0) {
                  ((wn) this).field_cb = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var7 = ((wn) this).field_fb[var6];
                if (0 != var7) {
                  L2: {
                    ((wn) this).field_S[var6] = ((wn) this).field_S[var6] + var7 * param2;
                    var8 = ((wn) this).field_hb.field_a[var6];
                    if ((var7 ^ -1) >= -1) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    stackOut_9_0 = stackIn_9_0;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (((wn) this).field_S[var6] >> -136759284 >= var8) {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L3;
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L3;
                    }
                  }
                  L4: {
                    if ((stackIn_12_0 ^ stackIn_12_1) != 0) {
                      ((wn) this).field_fb[var6] = 0;
                      ((wn) this).field_S[var6] = var8 << -719769620;
                      break L4;
                    } else {
                      var5 = 0;
                      break L4;
                    }
                  }
                  this.a(((wn) this).field_S[var6] >> -1148159860, var6, (byte) -123);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        ((wn) this).f(-54, var4);
    }

    private final synchronized void a(int param0, vk param1, int param2) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((wn) this).field_hb = param1;
        if (param2 != -20751) {
            field_kb = null;
        }
        for (var4 = 0; 16 > var4; var4++) {
            this.c(param0, var4, -128, ((wn) this).field_hb.field_a[var4]);
        }
    }

    private final synchronized void c(int param0, int param1, int param2, int param3) {
        ((wn) this).field_cb = false;
        if (!(null != ((wn) this).field_hb)) {
            ((wn) this).field_hb = new vk();
        }
        ((wn) this).field_hb.field_a[param1] = param3;
        if (param2 >= -126) {
            ((wn) this).a(82, -42, (byte) 31);
        }
        int var5 = ((wn) this).field_S[param1];
        int var6 = (((wn) this).field_hb.field_a[param1] << 1815846700) + -var5;
        int var7 = 0;
        int var8 = 0;
        if (!(var6 >= 0)) {
            var6 = -var6;
            var8 = 1;
        }
        if (!(-1 <= (var6 ^ -1))) {
            var7 = (1 + var6) / (param0 - -1);
        }
        ((wn) this).field_fb[param1] = var8 != 0 ? -var7 : var7;
    }

    wn(ih param0) {
        super(param0);
        ((wn) this).field_fb = new int[16];
        ((wn) this).field_ib = 256;
        ((wn) this).field_S = new int[16];
        this.k(3933);
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (32 >= te.field_n) {
            jf.b(0, 99);
        } else {
            var1 = te.field_n % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            jf.b(te.field_n - var1, 108);
        }
        if (!param0) {
            field_jb = null;
        }
    }

    final synchronized void a(boolean param0, byte param1, boolean param2, um param3) {
        if (param1 > -78) {
            ((wn) this).field_hb = null;
        }
        this.k(3933);
        this.a(param0, (byte) -110, param2, param3);
    }

    final synchronized void a(byte param0, int param1, vk param2) {
        int var4 = param1 * rc.field_d / 1000;
        int var5 = 58 / ((9 - param0) / 36);
        this.a(var4, param2, -20751);
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = 0; var2 < 16; var2++) {
            ((wn) this).field_S[var2] = 1048576;
        }
        if (param0 != 3933) {
            Object var4 = null;
            wn.a(47, (wk[]) null, 67, -125, 49, -47);
        }
        this.a(256, -1, (byte) -20);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Move here";
        field_eb = new String[]{"tutorial.lev", "tutorial2.lev"};
        field_bb = "This unit cannot use ranged weapons.";
    }
}
