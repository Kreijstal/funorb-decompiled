/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kra {
    static lqa field_a;
    static Vector field_c;
    private int[] field_b;
    private int[] field_d;
    private byte[] field_e;

    final static void a(boolean param0) {
        if (param0) {
            return;
        }
        era.field_d = new ara(lma.field_r, oba.field_f, cga.field_g, kua.field_i, (jea) (Object) kt.field_F, dja.field_p);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -2350) {
            return;
        }
        field_a = null;
    }

    final int a(byte param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        L0: {
          var15 = TombRacer.field_G ? 1 : 0;
          var7 = 0;
          var8 = param3 << -1811553757;
          if (param0 <= -66) {
            break L0;
          } else {
            var16 = null;
            int discarded$1 = ((kra) this).a(103, (byte) -26, -127, (byte[]) null, 31, (byte[]) null);
            break L0;
          }
        }
        param4 = param4 + param2;
        L1: while (true) {
          if (param2 >= param4) {
            return -param3 + (var8 - -7 >> -1812584861);
          } else {
            var9 = 255 & param5[param2];
            var10 = ((kra) this).field_d[var9];
            var11 = ((kra) this).field_e[var9];
            if (0 == var11) {
              throw new RuntimeException("" + var9);
            } else {
              L2: {
                var12 = var8 >> -229093373;
                var13 = 7 & var8;
                var7 = var7 & -var13 >> -1863848481;
                var14 = var12 + (-1 + var13 - -var11 >> 966679843);
                var13 += 24;
                var7 = fh.a(var7, var10 >>> var13);
                param1[var12] = (byte)fh.a(var7, var10 >>> var13);
                if (var14 <= var12) {
                  break L2;
                } else {
                  var12++;
                  var13 -= 8;
                  var7 = var10 >>> var13;
                  param1[var12] = (byte)(var10 >>> var13);
                  if (var14 <= var12) {
                    break L2;
                  } else {
                    var13 -= 8;
                    var12++;
                    var7 = var10 >>> var13;
                    param1[var12] = (byte)(var10 >>> var13);
                    if (var14 <= var12) {
                      break L2;
                    } else {
                      var13 -= 8;
                      var12++;
                      var7 = var10 >>> var13;
                      param1[var12] = (byte)(var10 >>> var13);
                      if (var12 >= var14) {
                        break L2;
                      } else {
                        var13 -= 8;
                        var12++;
                        var7 = var10 << -var13;
                        param1[var12] = (byte)(var10 << -var13);
                        break L2;
                      }
                    }
                  }
                }
              }
              var8 = var8 + var11;
              param2++;
              continue L1;
            }
          }
        }
    }

    kra(byte[] param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var2 = param0.length;
        ((kra) this).field_e = param0;
        ((kra) this).field_d = new int[var2];
        var19 = new int[33];
        var18 = var19;
        var17 = var18;
        var16 = var17;
        var3 = var16;
        ((kra) this).field_b = new int[8];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var2) {
          } else {
            var6 = param0[var5];
            if (0 != var6) {
              L1: {
                var7 = 1 << 32 - var6;
                var8 = var19[var6];
                ((kra) this).field_d[var5] = var8;
                if ((var8 & var7) == 0) {
                  var10 = var6 - 1;
                  L2: while (true) {
                    L3: {
                      if (var10 < 1) {
                        break L3;
                      } else {
                        var11 = var19[var10];
                        if (var8 != var11) {
                          break L3;
                        } else {
                          var12 = 1 << -var10 + 32;
                          if ((var11 & var12) == 0) {
                            var3[var10] = fh.a(var12, var11);
                            var10--;
                            continue L2;
                          } else {
                            var3[var10] = var3[var10 - 1];
                            break L3;
                          }
                        }
                      }
                    }
                    var9 = var8 | var7;
                    break L1;
                  }
                } else {
                  var9 = var3[-1 + var6];
                  break L1;
                }
              }
              var19[var6] = var9;
              var10 = 1 + var6;
              L4: while (true) {
                if (var10 > 32) {
                  var10 = 0;
                  var11 = 0;
                  L5: while (true) {
                    if (var6 <= var11) {
                      L6: {
                        if (var10 < var4) {
                          break L6;
                        } else {
                          var4 = 1 + var10;
                          break L6;
                        }
                      }
                      ((kra) this).field_b[var10] = var5 ^ -1;
                      var5++;
                      continue L0;
                    } else {
                      L7: {
                        var12 = -2147483648 >>> var11;
                        if (0 == (var8 & var12)) {
                          var10++;
                          break L7;
                        } else {
                          L8: {
                            if (((kra) this).field_b[var10] != 0) {
                              break L8;
                            } else {
                              ((kra) this).field_b[var10] = var4;
                              break L8;
                            }
                          }
                          var10 = ((kra) this).field_b[var10];
                          break L7;
                        }
                      }
                      var12 = var12 >>> 1;
                      if (var10 >= ((kra) this).field_b.length) {
                        var13 = new int[((kra) this).field_b.length * 2];
                        var14 = 0;
                        L9: while (true) {
                          if (var14 >= ((kra) this).field_b.length) {
                            ((kra) this).field_b = var13;
                            var11++;
                            continue L5;
                          } else {
                            var13[var14] = ((kra) this).field_b[var14];
                            var14++;
                            continue L9;
                          }
                        }
                      } else {
                        var11++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (var8 == var19[var10]) {
                    var19[var10] = var9;
                    var10++;
                    continue L4;
                  } else {
                    var10++;
                    continue L4;
                  }
                }
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final int a(int param0, byte param1, int param2, byte[] param3, int param4, byte[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param1 > 71) {
            break L0;
          } else {
            ((kra) this).field_b = null;
            break L0;
          }
        }
        if (param2 != 0) {
          var7 = 0;
          param2 = param2 + param4;
          var8 = param0;
          L1: while (true) {
            L2: {
              var9 = param3[var8];
              if (0 <= var9) {
                var7++;
                break L2;
              } else {
                var7 = ((kra) this).field_b[var7];
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((kra) this).field_b[var7];
                if (-1 < (((kra) this).field_b[var7] ^ -1)) {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param2 > param4) {
                    var7 = 0;
                    break L4;
                  } else {
                    break L3;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if ((64 & var9) == 0) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((kra) this).field_b[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((kra) this).field_b[var7];
                if (0 <= ((kra) this).field_b[var7]) {
                  break L6;
                } else {
                  param4++;
                  param5[param4] = (byte)var10;
                  if (param4 < param2) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if (-1 != (var9 & 32)) {
                  var7 = ((kra) this).field_b[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((kra) this).field_b[var7];
                if (((kra) this).field_b[var7] >= 0) {
                  break L8;
                } else {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param4 < param2) {
                    var7 = 0;
                    break L8;
                  } else {
                    break L3;
                  }
                }
              }
              L9: {
                if (0 == (var9 & 16)) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((kra) this).field_b[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((kra) this).field_b[var7];
                if (-1 < (((kra) this).field_b[var7] ^ -1)) {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param4 < param2) {
                    var7 = 0;
                    break L10;
                  } else {
                    break L3;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if ((var9 & 8) != 0) {
                  var7 = ((kra) this).field_b[var7];
                  break L11;
                } else {
                  var7++;
                  break L11;
                }
              }
              L12: {
                var10 = ((kra) this).field_b[var7];
                if (-1 >= (((kra) this).field_b[var7] ^ -1)) {
                  break L12;
                } else {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param4 >= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L12;
                  }
                }
              }
              L13: {
                if ((4 & var9) != 0) {
                  var7 = ((kra) this).field_b[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                var10 = ((kra) this).field_b[var7];
                if (0 <= ((kra) this).field_b[var7]) {
                  break L14;
                } else {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param4 < param2) {
                    var7 = 0;
                    break L14;
                  } else {
                    break L3;
                  }
                }
              }
              L15: {
                if ((var9 & 2) != -1) {
                  var7 = ((kra) this).field_b[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              L16: {
                var10 = ((kra) this).field_b[var7];
                if (-1 <= ((kra) this).field_b[var7]) {
                  break L16;
                } else {
                  param4++;
                  param5[param4] = (byte)(var10 ^ -1);
                  if (param2 > param4) {
                    var7 = 0;
                    break L16;
                  } else {
                    return -param0 + var8 + 1;
                  }
                }
              }
              L17: {
                if ((1 & var9) != 0) {
                  var7 = ((kra) this).field_b[var7];
                  break L17;
                } else {
                  var7++;
                  break L17;
                }
              }
              var10 = ((kra) this).field_b[var7];
              if (((kra) this).field_b[var7] < 0) {
                param4++;
                param5[param4] = (byte)(var10 ^ -1);
                if (param4 >= param2) {
                  break L3;
                } else {
                  var7 = 0;
                  var8++;
                  continue L1;
                }
              } else {
                var8++;
                continue L1;
              }
            }
            return -param0 + var8 + 1;
          }
        } else {
          return 0;
        }
    }

    static {
    }
}
