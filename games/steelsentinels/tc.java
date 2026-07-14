/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends ck {
    static String field_s;
    static int[] field_B;
    int field_t;
    int field_w;
    static int[] field_A;
    int field_u;
    static String field_v;
    int[] field_q;
    int field_o;
    static String field_r;
    int field_p;
    int field_C;
    static int field_x;
    long field_D;
    int field_y;
    static int field_z;

    public static void a(boolean param0) {
        field_A = null;
        field_r = null;
        if (param0) {
          tc.a(59, -75);
          field_s = null;
          field_B = null;
          field_v = null;
          return;
        } else {
          field_s = null;
          field_B = null;
          field_v = null;
          return;
        }
    }

    final static gh d(int param0) {
        if (param0 != 800) {
            return null;
        }
        return eh.a(false);
    }

    final static db a(String param0, int param1, int param2) {
        r var3 = null;
        if (param2 != 22137) {
          field_v = null;
          var3 = new r();
          ((db) (Object) var3).field_e = param0;
          ((db) (Object) var3).field_c = param1;
          return (db) (Object) var3;
        } else {
          var3 = new r();
          ((db) (Object) var3).field_e = param0;
          ((db) (Object) var3).field_c = param1;
          return (db) (Object) var3;
        }
    }

    final static void a(int param0, int param1) {
        kj var2 = null;
        if (param0 != 87) {
          field_r = null;
          var2 = mm.field_g;
          var2.a(param1, (byte) -117);
          var2.a((byte) 124, 1);
          var2.a((byte) 112, 0);
          return;
        } else {
          var2 = mm.field_g;
          var2.a(param1, (byte) -117);
          var2.a((byte) 124, 1);
          var2.a((byte) 112, 0);
          return;
        }
    }

    final static int a(int param0, mi param1, int param2, String param3, String[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = SteelSentinels.field_G;
        var5 = param1.c(param3);
        if (param0 >= var5) {
          if (param3.indexOf("<br>") != -1) {
            if (param2 == 75) {
              var6 = (var5 - -param0 - 1) / param0;
              param0 = var5 / var6;
              var6 = 0;
              var7 = 0;
              var8 = param3.length();
              var9 = 0;
              L0: while (true) {
                if (var8 <= var9) {
                  L1: {
                    if (var8 > var7) {
                      var6++;
                      param4[var6] = param3.substring(var7, var8).trim();
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return var6;
                } else {
                  L2: {
                    L3: {
                      var10 = param3.charAt(var9);
                      if (var10 == 32) {
                        break L3;
                      } else {
                        if (var10 != 45) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var11 = param3.substring(var7, var9 - -1).trim();
                    var12 = param1.c(var11);
                    if (param0 <= var12) {
                      var7 = var9 + 1;
                      var6++;
                      param4[var6] = var11;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (62 != var10) {
                    var9++;
                    var9++;
                    continue L0;
                  } else {
                    if (param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      var6++;
                      param4[var6] = param3.substring(var7, var9 + -3).trim();
                      var7 = var9 + 1;
                      var9++;
                      continue L0;
                    } else {
                      var9++;
                      continue L0;
                    }
                  }
                }
              }
            } else {
              field_s = null;
              var6 = (var5 - -param0 - 1) / param0;
              param0 = var5 / var6;
              var6 = 0;
              var7 = 0;
              var8 = param3.length();
              var9 = 0;
              L4: while (true) {
                if (var8 <= var9) {
                  L5: {
                    if (var8 > var7) {
                      var6++;
                      param4[var6] = param3.substring(var7, var8).trim();
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return var6;
                } else {
                  L6: {
                    L7: {
                      var10 = param3.charAt(var9);
                      if (var10 == 32) {
                        break L7;
                      } else {
                        if (var10 != 45) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = param3.substring(var7, var9 - -1).trim();
                    var12 = param1.c(var11);
                    if (param0 <= var12) {
                      var7 = var9 + 1;
                      var6++;
                      param4[var6] = var11;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (62 != var10) {
                    var9++;
                    var9++;
                    continue L4;
                  } else {
                    if (param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      var6++;
                      param4[var6] = param3.substring(var7, var9 + -3).trim();
                      var7 = var9 + 1;
                      var9++;
                      continue L4;
                    } else {
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            param4[0] = (String) (Object) param4;
            return 1;
          }
        } else {
          if (param2 == 75) {
            var6 = (var5 - -param0 - 1) / param0;
            param0 = var5 / var6;
            var6 = 0;
            var7 = 0;
            var8 = param3.length();
            var9 = 0;
            L8: while (true) {
              if (var8 <= var9) {
                L9: {
                  if (var8 > var7) {
                    var6++;
                    param4[var6] = param3.substring(var7, var8).trim();
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return var6;
              } else {
                L10: {
                  L11: {
                    var10 = param3.charAt(var9);
                    if (var10 == 32) {
                      break L11;
                    } else {
                      if (var10 != 45) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var11 = param3.substring(var7, var9 - -1).trim();
                  var12 = param1.c(var11);
                  if (param0 <= var12) {
                    var7 = var9 + 1;
                    var6++;
                    param4[var6] = var11;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (62 != var10) {
                  var9++;
                  var9++;
                  continue L8;
                } else {
                  if (param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
                    var6++;
                    param4[var6] = param3.substring(var7, var9 + -3).trim();
                    var7 = var9 + 1;
                    var9++;
                    continue L8;
                  } else {
                    var9++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            field_s = null;
            var6 = (var5 - -param0 - 1) / param0;
            param0 = var5 / var6;
            var6 = 0;
            var7 = 0;
            var8 = param3.length();
            var9 = 0;
            L12: while (true) {
              if (var8 <= var9) {
                L13: {
                  if (var8 > var7) {
                    var6++;
                    param4[var6] = param3.substring(var7, var8).trim();
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return var6;
              } else {
                L14: {
                  L15: {
                    var10 = param3.charAt(var9);
                    if (var10 == 32) {
                      break L15;
                    } else {
                      if (var10 != 45) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var11 = param3.substring(var7, var9 - -1).trim();
                  var12 = param1.c(var11);
                  if (param0 <= var12) {
                    var7 = var9 + 1;
                    var6++;
                    param4[var6] = var11;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                if (62 != var10) {
                  var9++;
                  var9++;
                  continue L12;
                } else {
                  if (param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
                    var6++;
                    param4[var6] = param3.substring(var7, var9 + -3).trim();
                    var7 = var9 + 1;
                    var9++;
                    continue L12;
                  } else {
                    var9++;
                    continue L12;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        ag.field_p.h(126);
        if (null == r.field_r) {
          r.field_r = new ki(ag.field_p, ba.field_f);
          ag.field_p.a((lh) (Object) r.field_r, 62);
          var1 = -37 % ((param0 - 8) / 39);
          return;
        } else {
          ag.field_p.a((lh) (Object) r.field_r, 62);
          var1 = -37 % ((param0 - 8) / 39);
          return;
        }
    }

    final static void a(long param0, byte param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param0);
        } catch (InterruptedException interruptedException) {
        }
        if (param1 <= 114) {
            Object var4 = null;
            db discarded$0 = tc.a((String) null, -125, -121);
            return;
        }
    }

    tc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((tc) this).field_u = param3;
        ((tc) this).field_y = param0;
        ((tc) this).field_w = param5;
        ((tc) this).field_q = param6;
        ((tc) this).field_t = param4;
        od.field_h = od.field_h + 1;
        ((tc) this).field_p = od.field_h & 65535;
        ((tc) this).field_o = param1;
        ((tc) this).field_C = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[110];
        field_s = " seconds";
        field_A = new int[8192];
        field_B[59] = 200;
        field_B[25] = 25;
        field_B[20] = 75;
        field_B[76] = 600;
        field_B[70] = 500;
        field_B[60] = 400;
        field_B[68] = 500;
        field_B[28] = 75;
        field_B[0] = 500;
        field_B[82] = 600;
        field_B[62] = 750;
        field_B[57] = 400;
        field_B[51] = 200;
        field_B[53] = 300;
        field_B[92] = 5000;
        field_B[43] = 500;
        field_B[45] = 750;
        field_B[49] = 1000;
        field_B[31] = 150;
        field_B[89] = 1000;
        field_B[54] = 400;
        field_B[58] = 250;
        field_B[71] = 500;
        field_B[69] = 1000;
        field_B[32] = 100;
        field_B[35] = 250;
        field_B[46] = 750;
        field_B[44] = 750;
        field_B[48] = 1000;
        field_B[88] = 3000;
        field_B[52] = 1337;
        field_B[24] = 25;
        field_B[1] = 200;
        field_B[85] = 800;
        field_B[81] = 800;
        field_B[18] = 25;
        field_B[83] = 600;
        field_B[33] = 200;
        field_B[73] = 600;
        field_B[47] = 750;
        field_B[3] = 300;
        field_B[86] = 800;
        field_B[23] = 25;
        field_B[91] = 800;
        field_B[34] = 200;
        field_B[26] = 25;
        field_B[21] = 75;
        field_B[63] = 200;
        field_B[87] = 1000;
        field_B[74] = 500;
        field_B[30] = 100;
        field_B[37] = 100;
        field_B[38] = 200;
        field_B[56] = 400;
        field_B[50] = 1000;
        field_B[80] = 800;
        field_B[64] = 500;
        field_B[27] = 75;
        field_B[78] = 500;
        field_B[90] = 1000;
        field_B[66] = 500;
        field_B[55] = 750;
        field_B[72] = 1000;
        field_B[93] = 2000;
        field_B[17] = 25;
        field_B[75] = 2000;
        field_B[77] = 600;
        field_B[67] = 400;
        field_B[95] = 1000;
        field_B[65] = 750;
        field_B[84] = 2000;
        field_B[79] = 2000;
        field_B[22] = 100;
        field_B[2] = 400;
        field_B[29] = 100;
        field_B[61] = 200;
        field_B[36] = 200;
        field_B[19] = 75;
        field_v = "Disruptive behaviour";
        field_x = 20;
        field_r = "Arm slot";
    }
}
