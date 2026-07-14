/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh implements dh {
    private int field_a;
    private int field_b;
    private m field_d;
    static int field_c;
    static dm[] field_e;

    final static void b(int param0) {
        cf.field_i = false;
        va.field_d = false;
        pc.a(-1, false);
        si.field_g = uf.field_l;
        kd.field_b = uf.field_l;
        if (param0 != -6011) {
            field_c = 36;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            fh.a(51);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static boolean c(int param0) {
        if (param0 > -78) {
            return false;
        }
        return hl.field_G;
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        int var7 = 0;
        long var7_long = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Geoblox.field_C;
        if ((param0 ^ -1L) < -1L) {
          if (param0 < 6582952005840035281L) {
            if (0L == param0 % 37L) {
              return null;
            } else {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (-1L == (param0 ^ -1L)) {
                      StringBuilder discarded$2 = var6.reverse();
                      var7 = 49 % ((27 - param1) / 36);
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7_long = param0;
                        param0 = param0 / 37L;
                        var9 = w.field_c[(int)(-(37L * param0) + var7_long)];
                        if (95 != var9) {
                          break L2;
                        } else {
                          var10 = -1 + var6.length();
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Geoblox.field_C;
        if (!param4.field_l) {
          if (!param4.e((byte) 54)) {
            L0: {
              var6 = 2188450;
              int discarded$6 = ((fh) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_s + "</u>", param4.field_v + param0, param2 - -param4.field_m, param4.field_r, param4.field_h, var6, -1, ((fh) this).field_b, ((fh) this).field_a, ((fh) this).field_d.field_o - -((fh) this).field_d.field_q);
              if (param1 <= -5) {
                break L0;
              } else {
                String discarded$7 = fh.a(53L, -116);
                break L0;
              }
            }
            if (param4.e((byte) 54)) {
              L1: {
                var7 = ((fh) this).field_d.a(param4.field_s);
                var8 = ((fh) this).field_d.field_q + ((fh) this).field_d.field_o;
                var9 = param4.field_v + param0;
                if (((fh) this).field_b == -3) {
                  var9 = var9 + (-var7 + param4.field_r);
                  break L1;
                } else {
                  if (-2 != ((fh) this).field_b) {
                    break L1;
                  } else {
                    L2: {
                      var9 = var9 + (-var7 + param4.field_r >> -1257061119);
                      var10 = param2 - -param4.field_m;
                      if (-3 == (((fh) this).field_a ^ -1)) {
                        var10 = var10 + (param4.field_h - var8);
                        break L2;
                      } else {
                        if (((fh) this).field_a == 1) {
                          var10 = var10 + (param4.field_h - var8 >> 1292510401);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    bf.a(var10 - -2, 4 + var7, 14164, var8, -2 + var9);
                    return;
                  }
                }
              }
              var10 = param2 - -param4.field_m;
              if (-3 != (((fh) this).field_a ^ -1)) {
                if (((fh) this).field_a != 1) {
                  bf.a(var10 - -2, 4 + var7, 14164, var8, -2 + var9);
                  return;
                } else {
                  var10 = var10 + (param4.field_h - var8 >> 1292510401);
                  bf.a(var10 - -2, 4 + var7, 14164, var8, -2 + var9);
                  return;
                }
              } else {
                var10 = var10 + (param4.field_h - var8);
                bf.a(var10 - -2, 4 + var7, 14164, var8, -2 + var9);
                return;
              }
            } else {
              return;
            }
          } else {
            L3: {
              var6 = 3249872;
              int discarded$8 = ((fh) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_s + "</u>", param4.field_v + param0, param2 - -param4.field_m, param4.field_r, param4.field_h, var6, -1, ((fh) this).field_b, ((fh) this).field_a, ((fh) this).field_d.field_o - -((fh) this).field_d.field_q);
              if (param1 <= -5) {
                break L3;
              } else {
                String discarded$9 = fh.a(53L, -116);
                break L3;
              }
            }
            L4: {
              if (param4.e((byte) 54)) {
                L5: {
                  var7 = ((fh) this).field_d.a(param4.field_s);
                  var8 = ((fh) this).field_d.field_q + ((fh) this).field_d.field_o;
                  var9 = param4.field_v + param0;
                  if (((fh) this).field_b == -3) {
                    var9 = var9 + (-var7 + param4.field_r);
                    break L5;
                  } else {
                    if (-2 != ((fh) this).field_b) {
                      break L5;
                    } else {
                      var9 = var9 + (-var7 + param4.field_r >> -1257061119);
                      break L5;
                    }
                  }
                }
                L6: {
                  var10 = param2 - -param4.field_m;
                  if (-3 == (((fh) this).field_a ^ -1)) {
                    var10 = var10 + (param4.field_h - var8);
                    break L6;
                  } else {
                    if (((fh) this).field_a == 1) {
                      var10 = var10 + (param4.field_h - var8 >> 1292510401);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                bf.a(var10 - -2, 4 + var7, 14164, var8, -2 + var9);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          L7: {
            var6 = 3249872;
            int discarded$10 = ((fh) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_s + "</u>", param4.field_v + param0, param2 - -param4.field_m, param4.field_r, param4.field_h, var6, -1, ((fh) this).field_b, ((fh) this).field_a, ((fh) this).field_d.field_o - -((fh) this).field_d.field_q);
            if (param1 <= -5) {
              break L7;
            } else {
              String discarded$11 = fh.a(53L, -116);
              break L7;
            }
          }
          L8: {
            if (param4.e((byte) 54)) {
              L9: {
                var7 = ((fh) this).field_d.a(param4.field_s);
                var8 = ((fh) this).field_d.field_q + ((fh) this).field_d.field_o;
                var9 = param4.field_v + param0;
                if (((fh) this).field_b == -3) {
                  var9 = var9 + (-var7 + param4.field_r);
                  break L9;
                } else {
                  if (-2 != ((fh) this).field_b) {
                    break L9;
                  } else {
                    var9 = var9 + (-var7 + param4.field_r >> -1257061119);
                    break L9;
                  }
                }
              }
              L10: {
                var10 = param2 - -param4.field_m;
                if (-3 == (((fh) this).field_a ^ -1)) {
                  var10 = var10 + (param4.field_h - var8);
                  break L10;
                } else {
                  if (((fh) this).field_a == 1) {
                    var10 = var10 + (param4.field_h - var8 >> 1292510401);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              bf.a(var10 - -2, 4 + var7, 14164, var8, -2 + var9);
              break L8;
            } else {
              break L8;
            }
          }
          return;
        }
    }

    public fh() {
        ((fh) this).field_a = 1;
        ((fh) this).field_b = 1;
        ((fh) this).field_d = ng.field_F;
    }

    fh(m param0, int param1, int param2) {
        ((fh) this).field_a = param2;
        ((fh) this).field_b = param1;
        ((fh) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
