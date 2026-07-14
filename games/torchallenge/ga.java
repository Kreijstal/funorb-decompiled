/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends bc {
    private gj field_t;
    static sl field_w;
    static String field_u;
    private gj[] field_v;
    static boolean field_y;
    static int[][][] field_x;
    static int[][] field_s;

    final void a(ka[] param0, int param1, int param2) {
        int var4 = param1;
        if (!(((ga) this).field_v[var4] != null)) {
            ((ga) this).field_v[var4] = new gj();
        }
        ((ga) this).field_v[param1].field_k = param0;
        if (param2 <= 43) {
            field_s = null;
        }
    }

    private final void a(ga param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        gj var6 = null;
        gj var7 = null;
        gj var7_ref = null;
        int var8 = 0;
        gj stackIn_6_0 = null;
        gj stackIn_7_0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_8_1 = null;
        gj stackOut_5_0 = null;
        gj stackOut_7_0 = null;
        gj stackOut_7_1 = null;
        gj stackOut_6_0 = null;
        gj stackOut_6_1 = null;
        L0: {
          var8 = TorChallenge.field_F ? 1 : 0;
          var4 = 120 / ((-63 - param2) / 38);
          super.a(-122, (bc) (Object) param0);
          if (!param1) {
            he.a((Object[]) (Object) ((ga) this).field_v, 0, (Object[]) (Object) param0.field_v, 0, 6);
            break L0;
          } else {
            var5 = 0;
            L1: while (true) {
              if (-7 >= (var5 ^ -1)) {
                break L0;
              } else {
                var6 = ((ga) this).field_v[var5];
                var7 = var6;
                var7 = var6;
                if (var6 != null) {
                  L2: {
                    var7_ref = param0.field_v[var5];
                    stackOut_5_0 = (gj) var6;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var7_ref != null) {
                      stackOut_7_0 = (gj) (Object) stackIn_7_0;
                      stackOut_7_1 = (gj) var7_ref;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      param0.field_v[var5] = new gj();
                      stackOut_6_0 = (gj) (Object) stackIn_6_0;
                      stackOut_6_1 = new gj();
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  ((gj) (Object) stackIn_8_0).a(stackIn_8_1, (byte) 73);
                  var5++;
                  continue L1;
                } else {
                  param0.field_v[var5] = null;
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        gj var7 = null;
        gj var9 = null;
        Object var10 = null;
        ng var11 = null;
        gj var12 = null;
        gj var13 = null;
        gj var14 = null;
        gj var15 = null;
        ee stackIn_5_0 = null;
        ee stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        L0: {
          if (param3 == 97) {
            break L0;
          } else {
            var10 = null;
            this.a((ga) null, true, 35);
            break L0;
          }
        }
        L1: {
          if (param0 instanceof ng) {
            stackOut_4_0 = (ee) param0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackIn_5_0 = (ee) (Object) stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var11 = (ng) (Object) stackIn_5_0;
          bc.a(param0.field_l + (param1 - -param0.field_i), param0.field_m + param2, param0.field_i + param1, param2 - -param0.field_m + param0.field_p, param3 + -96);
          if (var11 != null) {
            param4 = param4 & var11.field_F;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var7 = ((ga) this).field_v[0];
          ((ga) this).field_t.b(param3 + 14914);
          var7.a(param2, ((ga) this).field_t, (ga) this, -1, param1, param0);
          if (var11 == null) {
            break L3;
          } else {
            L4: {
              if (var11.field_D) {
                var12 = ((ga) this).field_v[1];
                if (var12 == null) {
                  break L4;
                } else {
                  var12.a(param2, ((ga) this).field_t, (ga) this, -1, param1, param0);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (!var11.field_w) {
              break L3;
            } else {
              L5: {
                var13 = ((ga) this).field_v[3];
                if (-1 == (var11.field_z ^ -1)) {
                  break L5;
                } else {
                  if (var13 == null) {
                    break L5;
                  } else {
                    var13.a(param2, ((ga) this).field_t, (ga) this, param3 ^ -98, param1, param0);
                    break L3;
                  }
                }
              }
              var9 = ((ga) this).field_v[2];
              if (var9 != null) {
                var9.a(param2, ((ga) this).field_t, (ga) this, param3 ^ -98, param1, param0);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L6: {
          if (!param0.c(118)) {
            break L6;
          } else {
            var14 = ((ga) this).field_v[5];
            if (var14 == null) {
              break L6;
            } else {
              var14.a(param2, ((ga) this).field_t, (ga) this, -1, param1, param0);
              break L6;
            }
          }
        }
        L7: {
          if (!param4) {
            var15 = ((ga) this).field_v[4];
            if (var15 != null) {
              var15.a(param2, ((ga) this).field_t, (ga) this, param3 + -98, param1, param0);
              break L7;
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((ga) this).field_t.a(param1, param0, param2, (ga) this, (byte) 44);
        ie.b((byte) -9);
    }

    final void a(byte param0, ka param1) {
        gj[] var3 = null;
        int var4 = 0;
        gj var5_ref_gj = null;
        int var5 = 0;
        int var6 = 0;
        gj[] var7 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        var7 = ((ga) this).field_v;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            var5 = -109 / ((param0 - -88) / 32);
            return;
          } else {
            var5_ref_gj = var7[var4];
            if (var5_ref_gj != null) {
              var5_ref_gj.field_e = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, eg param1, String[] param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          var5 = param1.a(param4);
          if (param3 < var5) {
            break L0;
          } else {
            if (0 != (param4.indexOf("<br>") ^ -1)) {
              break L0;
            } else {
              param2[0] = (String) (Object) param2;
              return 1;
            }
          }
        }
        var6 = (var5 + param3 - 1) / param3;
        param3 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param4.length();
        var9 = param0;
        L1: while (true) {
          if (var9 >= var8) {
            L2: {
              if (var7 >= var8) {
                break L2;
              } else {
                var6++;
                param2[var6] = param4.substring(var7, var8).trim();
                break L2;
              }
            }
            return var6;
          } else {
            L3: {
              L4: {
                var10 = param4.charAt(var9);
                if (var10 == 32) {
                  break L4;
                } else {
                  if (var10 == 45) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var11 = param4.substring(var7, var9 - -1).trim();
              var12 = param1.a(var11);
              if (var12 < param3) {
                break L3;
              } else {
                var6++;
                param2[var6] = var11;
                var7 = 1 + var9;
                break L3;
              }
            }
            if (var10 == 62) {
              if (param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
                var6++;
                param2[var6] = param4.substring(var7, -3 + var9).trim();
                var7 = 1 + var9;
                var9++;
                continue L1;
              } else {
                var9++;
                continue L1;
              }
            } else {
              var9++;
              continue L1;
            }
          }
        }
    }

    public ga() {
        ((ga) this).field_v = new gj[6];
        ((ga) this).field_t = new gj();
        ((ga) this).field_v[0] = new gj();
        gj var1 = new gj();
        var1.b(15011);
    }

    ga(ga param0, boolean param1) {
        this();
        param0.a((ga) this, param1, 31);
    }

    final void a(byte param0, ka[] param1) {
        gj[] var3 = null;
        int var4 = 0;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          var7 = ((ga) this).field_v;
          var3 = var7;
          if (param0 == 107) {
            break L0;
          } else {
            field_y = false;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_k = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_s = null;
        field_w = null;
        field_x = null;
        if (param0 != -79) {
            field_y = false;
        }
        field_u = null;
    }

    final static int a(byte param0, int param1) {
        if (param0 < 3) {
            field_x = null;
        }
        return oc.field_g[param1 & 2047];
    }

    final gj a(int param0, int param1) {
        if (param1 != -27140) {
            ((ga) this).field_v = null;
        }
        ((ga) this).field_v[param0] = new gj();
        return new gj();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Unfortunately we are unable to create an account for you at this time.";
        field_w = new sl();
        field_x = new int[][][]{new int[7][], new int[7][], new int[7][]};
        field_s = new int[][]{new int[7], new int[7], new int[7]};
    }
}
