/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq {
    short[] field_j;
    short[] field_m;
    byte[] field_a;
    private static short[] field_c;
    short[] field_k;
    private static short[] field_n;
    private static short[] field_h;
    private static short[] field_b;
    private static byte[] field_e;
    short[] field_d;
    nk field_f;
    short[] field_l;
    int field_i;
    private static short[] field_g;

    public static void a() {
        field_c = null;
        field_h = null;
        field_n = null;
        field_b = null;
        field_g = null;
        field_e = null;
    }

    rq(byte[] param0, nk param1) {
        Exception var3 = null;
        uia var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        uia var14 = null;
        Throwable decompiledCaughtException = null;
        ((rq) this).field_f = null;
        ((rq) this).field_i = 0;
        ((rq) this).field_f = param1;
        try {
          L0: {
            var14 = new uia(param0);
            var4 = new uia(param0);
            int discarded$1 = var14.h(255);
            var14.field_h = var14.field_h + 2;
            var5 = var14.h(255);
            var6 = 0;
            var7 = -1;
            var8 = -1;
            var4.field_h = var14.field_h + var5;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var5) {
                if (var4.field_h == param0.length) {
                  ((rq) this).field_i = var6;
                  ((rq) this).field_m = new short[var6];
                  ((rq) this).field_l = new short[var6];
                  ((rq) this).field_k = new short[var6];
                  ((rq) this).field_d = new short[var6];
                  ((rq) this).field_j = new short[var6];
                  ((rq) this).field_a = new byte[var6];
                  var13 = 0;
                  var9 = var13;
                  L2: while (true) {
                    if (var13 >= var6) {
                      break L0;
                    } else {
                      ((rq) this).field_m[var13] = field_c[var13];
                      ((rq) this).field_l[var13] = field_h[var13];
                      ((rq) this).field_k[var13] = field_n[var13];
                      ((rq) this).field_d[var13] = field_b[var13];
                      ((rq) this).field_j[var13] = field_g[var13];
                      ((rq) this).field_a[var13] = field_e[var13];
                      var13++;
                      continue L2;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                L3: {
                  var10 = ((rq) this).field_f.field_h[var9];
                  if (var10 != 0) {
                    break L3;
                  } else {
                    var7 = var9;
                    break L3;
                  }
                }
                L4: {
                  var11 = var14.h(255);
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
                      L7: {
                        field_c[var6] = (short)var9;
                        var12 = 0;
                        if (var10 == 3) {
                          break L7;
                        } else {
                          if (var10 != 10) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var12 = 128;
                      break L6;
                    }
                    L8: {
                      if ((var11 & 1) == 0) {
                        field_h[var6] = (short)var12;
                        break L8;
                      } else {
                        field_h[var6] = (short)var4.f((byte) -128);
                        break L8;
                      }
                    }
                    L9: {
                      if ((var11 & 2) == 0) {
                        field_n[var6] = (short)var12;
                        break L9;
                      } else {
                        field_n[var6] = (short)var4.f((byte) -128);
                        break L9;
                      }
                    }
                    L10: {
                      if ((var11 & 4) == 0) {
                        field_b[var6] = (short)var12;
                        break L10;
                      } else {
                        field_b[var6] = (short)var4.f((byte) -128);
                        break L10;
                      }
                    }
                    L11: {
                      L12: {
                        field_e[var6] = (byte)(var11 >>> 3 & 3);
                        if (var10 == 2) {
                          break L12;
                        } else {
                          if (var10 != 9) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      field_h[var6] = (short)(field_h[var6] << 2 & 16383);
                      field_n[var6] = (short)(field_n[var6] << 2 & 16383);
                      field_b[var6] = (short)(field_b[var6] << 2 & 16383);
                      break L11;
                    }
                    L13: {
                      L14: {
                        field_g[var6] = (short) -1;
                        if (var10 == 1) {
                          break L14;
                        } else {
                          if (var10 == 2) {
                            break L14;
                          } else {
                            if (var10 != 3) {
                              if (var10 == 5) {
                                break L13;
                              } else {
                                if (var10 == 7) {
                                  break L13;
                                } else {
                                  if (var10 == 9) {
                                    break L13;
                                  } else {
                                    if (var10 == 10) {
                                      break L13;
                                    } else {
                                      if (var10 != 8) {
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      if (var7 <= var8) {
                        break L13;
                      } else {
                        field_g[var6] = (short)var7;
                        var8 = var7;
                        break L13;
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
          L15: {
            var3 = (Exception) (Object) decompiledCaughtException;
            ((rq) this).field_i = 0;
            break L15;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new short[500];
        field_e = new byte[500];
        field_n = new short[500];
        field_h = new short[500];
        field_g = new short[500];
        field_b = new short[500];
    }
}
