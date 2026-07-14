/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static String field_d;
    static String field_c;
    static int[] field_a;
    static int field_b;

    final static ae c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var4 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var3 = -63 / ((param0 - -27) / 63);
        do {
            var1 = od.a((byte) 41, 65536, -65536);
            var2 = od.a((byte) 41, 65536, -65536);
            var4 = od.a((byte) 41, 65536, -65536);
            // if_icmpne L68
            // if_icmpne L68
        } while (-1 == (var4 ^ -1));
        ae var5 = new ae(var1, var2, var4);
        var5.a((byte) -7);
        return var5;
    }

    public static void b(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 <= 61) {
            nh.b((byte) -92);
        }
    }

    final static void a(byte param0) {
        int var1 = rk.field_e.g(16711680);
        int var2 = rk.field_e.g(16777215);
        if (param0 <= 54) {
            field_c = null;
        }
        int var3 = rk.field_e.field_R[0].length;
        rk.field_e.field_R = new int[4][];
        rk.field_e.field_R[0] = new int[var3];
        rk.field_e.field_R[0][var1] = 65793;
        rk.field_e.field_R[0][var2] = 16777215;
        rk.field_e.field_R[1] = new int[var3];
        rk.field_e.field_R[1][var1] = 65793;
        rk.field_e.field_R[1][var2] = 16711680;
        rk.field_e.field_R[2] = new int[var3];
        rk.field_e.field_R[2][var1] = 65793;
        rk.field_e.field_R[2][var2] = 11184810;
        rk.field_e.field_R[3] = new int[var3];
        rk.field_e.field_R[3][var1] = 65793;
        rk.field_e.field_R[3][var2] = 4473924;
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if (var5 >= var4) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (65 > var6) {
                    break L3;
                  } else {
                    if (var6 > 90) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(-65 + var6 + 1);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (var6 <= 122) {
                      var2 = var2 + (long)(-97 + var6 + 1);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (48 > var6) {
                  break L2;
                } else {
                  if (57 >= var6) {
                    var2 = var2 + (long)(-48 + var6 + 27);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (var2 < 177917621779460413L) {
                var5++;
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L5: while (true) {
            L6: {
              if (0L != var2 % 37L) {
                break L6;
              } else {
                if (0L == var2) {
                  break L6;
                } else {
                  var2 = var2 / 37L;
                  continue L5;
                }
              }
            }
            L7: {
              if (param1 == -29667) {
                break L7;
              } else {
                field_c = null;
                break L7;
              }
            }
            return var2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = Pixelate.field_H ? 1 : 0;
          if (param4 >= 99) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          if (param2 < t.field_e) {
            param5 = param5 - (t.field_e + -param2);
            param2 = t.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param5 + param2 > t.field_h) {
            param5 = -param2 + t.field_h;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (t.field_f > param3) {
            param0 = param0 - (-param3 + t.field_f);
            param3 = t.field_f;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 + param3 <= t.field_a) {
            break L4;
          } else {
            param0 = t.field_a - param3;
            break L4;
          }
        }
        if (0 >= param5) {
          return;
        } else {
          if ((param0 ^ -1) < -1) {
            var6 = param2 - -(param3 * t.field_j);
            var7 = -param5 + t.field_j;
            param3 = -param0;
            L5: while (true) {
              if ((param3 ^ -1) <= -1) {
                return;
              } else {
                param2 = -param5;
                L6: while (true) {
                  if ((param2 ^ -1) <= -1) {
                    var6 = var6 + var7;
                    param3++;
                    continue L5;
                  } else {
                    var8 = t.field_k[var6];
                    if ((var8 & 65280) >> 437520040 > param1) {
                      if ((255 & var8 >> -1960753624) >= (var8 >> -490448752 & 255)) {
                        L7: {
                          var9 = ((16711680 & var8) >> 993062639) - 60;
                          if ((var9 ^ -1) < -256) {
                            var9 = 255;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var10 = 65280 & var8;
                        var10 = (var10 >> -165939871) - (var10 >> -664528411) & 65280;
                        var11 = (255 & var8) >> -734854973;
                        t.field_k[var6] = bq.a(var11, bq.a(var10, var9 << 901460656));
                        var6++;
                        param2++;
                        continue L6;
                      } else {
                        var6++;
                        param2++;
                        continue L6;
                      }
                    } else {
                      var6++;
                      param2++;
                      continue L6;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This game is full.";
        field_a = new int[4];
        field_d = "Mute this player for 48 hours";
    }
}
