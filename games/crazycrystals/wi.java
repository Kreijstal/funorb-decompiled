/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wi {
    int field_d;
    static long field_h;
    int field_a;
    int field_f;
    int field_c;
    int field_e;
    int field_g;
    static String field_b;

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = CrazyCrystals.field_B;
        if (2 <= param1) {
          if ((param1 ^ -1) >= -37) {
            var4 = 0;
            if (param0 == 48) {
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              if (var7 > var8) {
                L0: {
                  L1: {
                    var9 = param2.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L1;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        var8++;
                        break L0;
                      } else {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param3) {
                            break L1;
                          } else {
                            var8++;
                            var8++;
                            var8++;
                            var8++;
                            var8++;
                            return var5 != 0;
                          }
                        }
                      }
                    }
                  }
                  L2: {
                    L3: {
                      if (48 > var9) {
                        break L3;
                      } else {
                        if (var9 > 57) {
                          break L3;
                        } else {
                          var9 -= 48;
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (90 < var9) {
                          break L4;
                        } else {
                          var9 -= 55;
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 > 122) {
                          break L5;
                        } else {
                          var9 -= 87;
                          break L2;
                        }
                      }
                    }
                    return false;
                  }
                  if (param1 <= var9) {
                    return false;
                  } else {
                    L6: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = var9 + var6 * param1;
                    if (var10 / param1 != var6) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      break L0;
                    }
                  }
                }
                var8++;
                var8++;
                var8++;
                var8++;
                return var5 != 0;
              } else {
                return var5 != 0;
              }
            } else {
              var12 = null;
              boolean discarded$1 = wi.a(-107, 91, (CharSequence) null, true);
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L7: while (true) {
                if (var7 > var8) {
                  L8: {
                    var9 = param2.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L8;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L7;
                      } else {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param3) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (48 > var9) {
                        break L10;
                      } else {
                        if (var9 > 57) {
                          break L10;
                        } else {
                          var9 -= 48;
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (var9 < 65) {
                        break L11;
                      } else {
                        if (90 < var9) {
                          break L11;
                        } else {
                          var9 -= 55;
                          break L9;
                        }
                      }
                    }
                    L12: {
                      if (var9 < 97) {
                        break L12;
                      } else {
                        if (var9 > 122) {
                          break L12;
                        } else {
                          var9 -= 87;
                          break L9;
                        }
                      }
                    }
                    return false;
                  }
                  if (param1 <= var9) {
                    return false;
                  } else {
                    L13: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var10 = var9 + var6 * param1;
                    if (var10 / param1 != var6) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    }
                  }
                } else {
                  return var5 != 0;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param1);
          }
        } else {
          throw new IllegalArgumentException("" + param1);
        }
    }

    final static ef a(int param0, wj[] param1, byte[] param2) {
        int var8 = 0;
        int var9 = CrazyCrystals.field_B;
        if (!(-257 == (param1.length ^ -1))) {
            throw new IllegalArgumentException();
        }
        int[] var26 = new int[256];
        int[] var21 = var26;
        int[] var16 = var21;
        int[] var11 = var16;
        int[] var10 = var11;
        int[] var3 = var10;
        int[] var27 = new int[256];
        int[] var22 = var27;
        int[] var17 = var22;
        int[] var12 = var17;
        int[] var4 = var12;
        int[] var28 = new int[256];
        int[] var23 = var28;
        int[] var18 = var23;
        int[] var13 = var18;
        int[] var5 = var13;
        int[] var29 = new int[256];
        int[] var24 = var29;
        int[] var19 = var24;
        int[] var14 = var19;
        int[] var6 = var14;
        byte[][] var30 = new byte[256][];
        byte[][] var25 = var30;
        byte[][] var20 = var25;
        byte[][] var15 = var20;
        byte[][] var7 = var15;
        for (var8 = param0; 256 > var8; var8++) {
            var10[var8] = param1[var8].field_g;
            var4[var8] = param1[var8].field_d;
            var5[var8] = param1[var8].field_f;
            var6[var8] = param1[var8].field_e;
            var7[var8] = param1[var8].field_j;
        }
        return new ef(param2, var26, var27, var28, var29, var30);
    }

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_b = null;
        }
    }

    final static void a(int param0, dl[] param1, int param2, int param3, byte param4, int param5) {
        qc.a(192, param2, param3, param1, param0, param5, 2);
        if (param4 != -71) {
            field_b = null;
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This is earth.<br>Dig your way through it<br>to get to the crystals.";
    }
}
