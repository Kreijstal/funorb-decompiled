/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    float field_g;
    private int field_d;
    private int field_e;
    private int field_k;
    String field_i;
    static String field_b;
    static gh[] field_a;
    private sl[] field_c;
    static int field_h;
    static String field_f;
    static int field_j;

    final static gk[] a(int param0, String param1, cm param2, String param3) {
        int var4 = param2.a(param1, 41);
        int var5 = param2.a(var4, -32759, param3);
        int var6 = -61 % ((-77 - param0) / 38);
        return rd.a(true, param2, var4, var5);
    }

    final boolean b(int param0) {
        int var2 = 0;
        sl var3 = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 69 / ((71 - param0) / 55);
        L0: while (true) {
          if (((cj) this).field_k <= ((cj) this).field_d) {
            return true;
          } else {
            var3 = ((cj) this).field_c[((cj) this).field_d];
            if (!var3.field_d.a(true)) {
              this.a(var3, -9803, 0);
              return false;
            } else {
              L1: {
                if (-1 < (var3.field_a ^ -1)) {
                  break L1;
                } else {
                  if (var3.field_d.a(var3.field_a, true)) {
                    break L1;
                  } else {
                    this.a(var3, -9803, var3.field_d.b(10407, var3.field_a));
                    return false;
                  }
                }
              }
              L2: {
                if (null == var3.field_g) {
                  break L2;
                } else {
                  if (var3.field_d.a(var3.field_g, (byte) 90)) {
                    break L2;
                  } else {
                    this.a(var3, -9803, var3.field_d.a((byte) 76, var3.field_g));
                    return false;
                  }
                }
              }
              L3: {
                if ((var3.field_a ^ -1) <= -1) {
                  break L3;
                } else {
                  if (null != var3.field_g) {
                    break L3;
                  } else {
                    if (var3.field_e == null) {
                      break L3;
                    } else {
                      if (var3.field_d.a(25)) {
                        break L3;
                      } else {
                        this.a(var3, -9803, var3.field_d.a((byte) -33));
                        return false;
                      }
                    }
                  }
                }
              }
              ((cj) this).field_d = ((cj) this).field_d + 1;
              continue L0;
            }
          }
        }
    }

    final static int[] a(int param0, int[] param1, nk param2) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = SteelSentinels.field_G;
        int var3 = 0;
        int var5 = -2 / ((-49 - param0) / 36);
        int[] var11 = new int[1000];
        int[] var10 = var11;
        int[] var4 = var10;
        var3 = param2.a(0, var11, var3);
        int var6 = param2.i(-106);
        for (var7_int = 0; -9 < (var7_int ^ -1); var7_int++) {
            var3++;
            var4[var3] = var6 > var7_int ? param1[var7_int] : -1;
        }
        int[] var7 = new int[var3];
        for (var8 = 0; var3 > var8; var8++) {
            var7[var8] = var11[var8];
        }
        return var7;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            cj.a(-69);
        }
        field_b = null;
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, boolean param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var14 = SteelSentinels.field_G;
        if (param0 <= param4) {
          return;
        } else {
          if (param3 > 1 + param4) {
            L0: {
              if (param4 + 5 >= param3) {
                break L0;
              } else {
                if (param6 == param1) {
                  break L0;
                } else {
                  var7 = (1 & (param1 & param6)) + (param6 >> 138272513) + (param1 >> -1080385183);
                  var8 = param4;
                  var9 = param1;
                  var10 = param6;
                  var11 = param4;
                  L1: while (true) {
                    if (var11 >= param3) {
                      cj.a(param0, param1, param2, var8, param4, param5, var9);
                      cj.a(param0, var10, (byte) 125, param3, var8, param5, param6);
                      return;
                    } else {
                      L2: {
                        var12 = un.field_j[var11];
                        if (param5) {
                          stackOut_20_0 = ok.field_d[var12];
                          stackIn_21_0 = stackOut_20_0;
                          break L2;
                        } else {
                          stackOut_19_0 = eb.field_u[var12];
                          stackIn_21_0 = stackOut_19_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_21_0;
                      if (var7 < var13) {
                        un.field_j[var11] = un.field_j[var8];
                        var8++;
                        un.field_j[var8] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        if (var13 > var10) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param3;
            L3: while (true) {
              if (param4 >= var7) {
                return;
              } else {
                var8 = param4;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = un.field_j[var8];
                    var10 = un.field_j[var8 + 1];
                    if (q.a((byte) -127, var9, var10, param5)) {
                      un.field_j[var8] = var10;
                      un.field_j[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final void a(sl param0, int param1, int param2) {
        float var4 = (float)(1 + ((cj) this).field_d) + (float)param2 / 100.0f;
        if (param2 == 0) {
            ((cj) this).field_i = param0.field_h;
        } else {
            ((cj) this).field_i = param0.field_e + " - " + param2 + "%";
        }
        if (param1 != -9803) {
            boolean discarded$0 = ((cj) this).b(-46);
        }
        ((cj) this).field_g = var4 * (float)((cj) this).field_e / (float)(1 + ((cj) this).field_k);
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        if (param1 < 57) {
            field_h = 89;
        }
        if (null != an.field_i) {
            if (!(!an.field_i.b((byte) 126))) {
                rh.a(false);
                return true;
            }
        }
        if (n.field_x != null) {
            if (!(!n.field_x.k(-91))) {
                n.field_x = null;
                rh.a(false);
                return true;
            }
        }
        if (ta.a(-91)) {
            return true;
        }
        if (vh.a(param3, param2, -80, param0)) {
            return true;
        }
        return false;
    }

    final static int a(byte param0, int param1, int param2) {
        int var4 = SteelSentinels.field_G;
        int var3 = 1;
        if (param0 > -15) {
            return 20;
        }
        while (1 < param1) {
            if ((param1 & 1) != 0) {
                var3 = var3 * param2;
            }
            param2 = param2 * param2;
            param1 = param1 >> 1;
        }
        if (!(param1 != 1)) {
            return var3 * param2;
        }
        return var3;
    }

    private cj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Show chat (<%0> unread messages)";
        field_a = new gh[Math.max(110, 35)];
        field_f = "Show game chat from my friends";
        field_j = 9;
    }
}
