/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    short[] field_c;
    private static short[] field_m;
    short[] field_a;
    short[] field_n;
    int field_k;
    private byte[] field_d;
    short[] field_l;
    private static byte[] field_h;
    private static short[] field_b;
    short[] field_i;
    private static short[] field_e;
    private static short[] field_f;
    private static short[] field_j;
    ij field_g;

    public static void a() {
        field_e = null;
        field_j = null;
        field_b = null;
        field_f = null;
        field_m = null;
        field_h = null;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_k) {
            return;
          } else {
            L1: {
              var4 = this.field_i[var3];
              if (this.field_g.field_n[var4] == 0) {
                break L1;
              } else {
                if (this.field_g.field_n[var4] == 1) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            this.field_c[var3] = (short)(this.field_c[var3] * param0 / param1);
            this.field_a[var3] = (short)(this.field_a[var3] * param0 / param1);
            this.field_l[var3] = (short)(this.field_l[var3] * param0 / param1);
            var3++;
            continue L0;
          }
        }
    }

    cm(byte[] param0, ij param1) {
        int discarded$1 = 0;
        Exception var3 = null;
        kg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kg var14 = null;
        Throwable decompiledCaughtException = null;
        this.field_g = null;
        this.field_k = -1;
        this.field_g = param1;
        try {
          L0: {
            var14 = new kg(param0);
            var4 = new kg(param0);
            discarded$1 = var14.c(32);
            var14.field_n = var14.field_n + 2;
            var5 = var14.c(32);
            var6 = 0;
            var7 = -1;
            var8 = -1;
            var4.field_n = var14.field_n + var5;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var5) {
                if (var4.field_n == param0.length) {
                  this.field_k = var6;
                  this.field_i = new short[var6];
                  this.field_c = new short[var6];
                  this.field_a = new short[var6];
                  this.field_l = new short[var6];
                  this.field_n = new short[var6];
                  this.field_d = new byte[var6];
                  var13 = 0;
                  var9 = var13;
                  L2: while (true) {
                    if (var13 >= var6) {
                      break L0;
                    } else {
                      this.field_i[var13] = field_e[var13];
                      this.field_c[var13] = field_j[var13];
                      this.field_a[var13] = field_b[var13];
                      this.field_l[var13] = field_f[var13];
                      this.field_n[var13] = field_m[var13];
                      this.field_d[var13] = field_h[var13];
                      var13++;
                      continue L2;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                L3: {
                  var10 = this.field_g.field_n[var9];
                  if (var10 != 0) {
                    break L3;
                  } else {
                    var7 = var9;
                    break L3;
                  }
                }
                L4: {
                  var11 = var14.c(32);
                  if (var11 <= 0) {
                    break L4;
                  } else {
                    L5: {
                      if (var10 != 0) {
                        break L5;
                      } else {
                        var8 = var9;
                        break L5;
                      }
                    }
                    L6: {
                      field_e[var6] = (short)var9;
                      var12 = 0;
                      if (var10 != 3) {
                        break L6;
                      } else {
                        var12 = 128;
                        break L6;
                      }
                    }
                    L7: {
                      if ((var11 & 1) == 0) {
                        field_j[var6] = (short)var12;
                        break L7;
                      } else {
                        field_j[var6] = (short)var4.b(1647);
                        break L7;
                      }
                    }
                    L8: {
                      if ((var11 & 2) == 0) {
                        field_b[var6] = (short)var12;
                        break L8;
                      } else {
                        field_b[var6] = (short)var4.b(1647);
                        break L8;
                      }
                    }
                    L9: {
                      if ((var11 & 4) == 0) {
                        field_f[var6] = (short)var12;
                        break L9;
                      } else {
                        field_f[var6] = (short)var4.b(1647);
                        break L9;
                      }
                    }
                    L10: {
                      field_h[var6] = (byte)(var11 >>> 3 & 3);
                      if (var10 != 2) {
                        break L10;
                      } else {
                        field_j[var6] = (short)(((field_j[var6] & 255) << 3) + (field_j[var6] >> 8 & 7));
                        field_b[var6] = (short)(((field_b[var6] & 255) << 3) + (field_b[var6] >> 8 & 7));
                        field_f[var6] = (short)(((field_f[var6] & 255) << 3) + (field_f[var6] >> 8 & 7));
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        field_m[var6] = (short)-1;
                        if (var10 == 1) {
                          break L12;
                        } else {
                          if (var10 == 2) {
                            break L12;
                          } else {
                            if (var10 != 3) {
                              if (var10 == 5) {
                                break L11;
                              } else {
                                if (var10 != 7) {
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      if (var7 <= var8) {
                        break L11;
                      } else {
                        field_m[var6] = (short)var7;
                        var8 = var7;
                        break L11;
                      }
                    }
                    var6++;
                    break L4;
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = (Exception) (Object) decompiledCaughtException;
            this.field_k = 0;
            break L13;
          }
        }
    }

    static {
        field_m = new short[500];
        field_h = new byte[500];
        field_b = new short[500];
        field_f = new short[500];
        field_j = new short[500];
        field_e = new short[500];
    }
}
