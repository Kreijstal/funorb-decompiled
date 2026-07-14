/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kh {
    static String field_e;
    static String field_a;
    static u field_g;
    static String field_c;
    vd[] field_f;
    static boolean field_b;
    static ll field_d;

    final int a(String param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        var5 = 0;
        var6 = param1 ? 1 : 0;
        var7 = param0.length();
        var8 = 0;
        L0: while (true) {
          if (var8 >= var7) {
            if (var5 <= 0) {
              return 0;
            } else {
              return (param2 + -param3 << 1829190408) / var5;
            }
          } else {
            var9 = param0.charAt(var8);
            if (var9 != 60) {
              if (var9 != 62) {
                if (var6 == 0) {
                  if (32 == var9) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var8++;
                continue L0;
              }
            } else {
              var6 = 1;
              var8++;
              continue L0;
            }
          }
        }
    }

    private final static void a(ec param0, ec param1, int param2, int param3, int param4, int param5) {
        kg.field_h = param1;
        vf.field_s = param0;
        ic.field_a = param5;
        if (param4 != -1) {
            return;
        }
        uk.field_d = param2;
        f.field_h = param3;
    }

    final int a(byte param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 20 % ((param0 - 4) / 53);
            if (((kh) this).field_f == null) {
              break L1;
            } else {
              if (-1 > (((kh) this).field_f.length ^ -1)) {
                stackOut_4_0 = ((kh) this).field_f[((kh) this).field_f.length - 1].field_e + -((kh) this).field_f[0].field_g;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        vd var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = 65 % ((param0 - 1) / 45);
        for (var4 = 0; ((kh) this).field_f.length > var4; var4++) {
            var5 = ((kh) this).field_f[var4];
            if (var5.field_f.length > param1) {
                return var4;
            }
            param1 = param1 - (-1 + var5.field_f.length);
        }
        return ((kh) this).field_f.length;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 14) {
            break L0;
          } else {
            var5 = null;
            kh.a((byte) 126, (java.awt.Canvas) null, true);
            break L0;
          }
        }
        L1: {
          if (10 <= ih.field_f) {
            if (!rl.d(true)) {
              de.b();
              n.a(320, 240, param0 + -13);
              kn.a(param1, (byte) -101, 0, 0);
              break L1;
            } else {
              if (fj.field_j != 0) {
                eg.a(param1, (byte) -39);
                break L1;
              } else {
                la.a(param2, false, (byte) -72);
                kn.a(param1, (byte) -97, 0, 0);
                break L1;
              }
            }
          } else {
            L2: {
              var3 = 0;
              if (hj.field_d) {
                var3 = 1;
                hj.field_d = false;
                break L2;
              } else {
                break L2;
              }
            }
            io.a(qj.field_h, bb.b((byte) -126), var3 != 0, tl.c((byte) -77), -6885);
            break L1;
          }
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        vd[] var3 = null;
        int var4 = 0;
        vd var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 >= 13) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null != ((kh) this).field_f) {
            var3 = ((kh) this).field_f;
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(-121);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = ArcanistsMulti.field_G ? 1 : 0;
        de.f(param1, param2, param0 - -1, 10000536);
        de.f(param1, param3 + param2, param0 - -1, 12105912);
        int var5 = 1;
        if (!(var5 + param2 >= de.field_c)) {
            var5 = -param2 + de.field_c;
        }
        int var7 = 63 / ((param4 - 26) / 52);
        int var6 = param3;
        if (var6 + param2 > de.field_k) {
            var6 = de.field_k + -param2;
        }
        for (var8 = var5; var6 > var8; var8++) {
            var9 = 152 - -(var8 * 48 / param3);
            var10 = var9 << 1640750568 | var9 << 1287141424 | var9;
            de.field_l[param1 + de.field_e * (param2 + var8)] = var10;
            de.field_l[de.field_e * (param2 + var8) + param1 - -param0] = var10;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 6481) {
            field_g = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, ec param9, int param10, int param11, dj param12, int param13, ec param14, int param15, dj param16, int param17, ec param18, int param19) {
        if (!param8) {
            field_e = null;
        }
        vd.field_c = param12;
        ob.field_T = param16;
        ib.a(param4, param6, param10, param11, 109);
        sk.a(param14, -28995, param2, param17);
        kh.a(param9, param18, param7, param3, -1, param1);
        ho.a((byte) 101, param0, param5);
        kn.a(param13, param19, param15, (byte) -43);
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        vd var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          if (null == ((kh) this).field_f) {
            break L0;
          } else {
            if (((kh) this).field_f.length == 0) {
              break L0;
            } else {
              if (((kh) this).field_f[0].field_g <= param0) {
                if (param0 > ((kh) this).field_f[((kh) this).field_f.length + -1].field_e) {
                  return -1;
                } else {
                  if ((((kh) this).field_f.length ^ -1) != -2) {
                    L1: {
                      var4 = 0;
                      if (param2) {
                        break L1;
                      } else {
                        field_e = null;
                        break L1;
                      }
                    }
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= ((kh) this).field_f.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((kh) this).field_f[var5];
                          if (param0 < var6.field_g) {
                            break L3;
                          } else {
                            if (var6.field_e >= param0) {
                              var7 = var6.a(param1, 31);
                              if (0 == (var7 ^ -1)) {
                                return -1;
                              } else {
                                return var4 - -var7;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_f.length - 1);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((kh) this).field_f[0].a(param1, 122);
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        vd var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        vd[] var7 = ((kh) this).field_f;
        vd[] var3 = var7;
        for (var4 = param1; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(param0 >= var5.field_f.length)) {
                return var5.field_f[param0];
            }
            param0 = param0 - (var5.field_f.length - 1);
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Waiting for music";
        field_a = "Elapsed time";
    }
}
