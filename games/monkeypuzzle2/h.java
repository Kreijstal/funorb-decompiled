/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    private boolean field_c;
    private boolean field_d;
    static int field_b;
    static int field_a;
    static String field_f;
    private String field_e;

    final boolean b(int param0) {
        int var2 = 12 / ((-44 - param0) / 59);
        return ((h) this).field_c;
    }

    final static void a(int param0, boolean param1) {
        L0: {
          if (!qb.field_b) {
            break L0;
          } else {
            if (fd.field_o[param0]) {
              break L0;
            } else {
              if ((ck.field_b ^ -1) > -1) {
                fd.field_o[param0] = param1;
                uj.field_h = 1;
                ck.field_b = param0;
                jk.field_u = 0;
                return;
              } else {
                break L0;
              }
            }
          }
        }
    }

    final void b(int param0, boolean param1) {
        ((h) this).field_c = param1 ? true : false;
        if (param0 != 16564) {
            ((h) this).field_d = true;
        }
        ((h) this).field_d = true;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            h.a(-89, 11, 65, false, -65, -84, -84, (le) null);
        }
        return ((h) this).field_d;
    }

    final static kc a(int param0, boolean param1, String param2, String param3) {
        CharSequence var8 = null;
        long var4 = 0L;
        int var6 = 103 / ((param0 - -4) / 54);
        String var7 = null;
        if (param3.indexOf('@') != -1) {
            var7 = param3;
        } else {
            var8 = (CharSequence) (Object) param3;
            var4 = sd.a(37, var8);
        }
        return sk.a(param2, var4, param1, true, var7);
    }

    public static void a(byte param0) {
        int var1 = -106 / ((36 - param0) / 34);
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        param0 = ((-1431655765 & param0) >>> 1881365889) + (1431655765 & param0);
        param0 = (param0 & 858993459) + ((param0 & -858993459) >>> -1793960350);
        param0 = 252645135 & param0 - -(param0 >>> 1269921124);
        param0 = param0 + (param0 >>> -1079646840);
        if (param1 < 98) {
            field_a = 83;
        }
        param0 = param0 + (param0 >>> 151476976);
        return param0 & 255;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, le param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        le var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param2 < ge.field_a) {
            param6 = param6 - (-param2 + ge.field_a);
            param2 = ge.field_a;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 - -param6 > ge.field_j) {
            param6 = ge.field_j + -param2;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ge.field_f > param5) {
            param4 = param4 - (-param5 + ge.field_f);
            param5 = ge.field_f;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (ge.field_k >= param4 + param5) {
            break L3;
          } else {
            param4 = ge.field_k - param5;
            break L3;
          }
        }
        L4: {
          if (param6 >= -1) {
            break L4;
          } else {
            if (-1 >= param4) {
              break L4;
            } else {
              L5: {
                if (!param3) {
                  break L5;
                } else {
                  int discarded$1 = h.a(31, (byte) 107);
                  break L5;
                }
              }
              var21 = param7.d();
              var32 = ge.field_i;
              var10 = ge.field_h;
              var11 = ge.field_g;
              var30 = new int[4];
              ge.b(var30);
              param7.e();
              ge.c(var30[0], var30[1], var30[2], var30[3]);
              var13 = param5 * param7.field_k + param2;
              var14 = -param6 + param7.field_k;
              var31 = var21.field_s;
              var28 = var31;
              var25 = var28;
              var22 = var25;
              var15 = var22;
              var16 = param5;
              L6: while (true) {
                if (var16 >= param5 + param4) {
                  var21.c(-param7.field_r, -param7.field_q);
                  ge.a(var32, var10, var11);
                  ge.a(var30);
                  return;
                } else {
                  var17 = param2;
                  L7: while (true) {
                    if (param2 + param6 <= var17) {
                      var13 = var13 + var14;
                      var16++;
                      continue L6;
                    } else {
                      var18 = var31[var13];
                      if (var18 != 0) {
                        L8: {
                          L9: {
                            if ((var17 ^ -1) >= -1) {
                              break L9;
                            } else {
                              if (var15[-1 + var13] == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if ((var16 ^ -1) >= -1) {
                              break L10;
                            } else {
                              if (0 == var15[-param7.field_k + var13]) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (param7.field_k - 1 <= var17) {
                              break L11;
                            } else {
                              if (-1 == (var15[var13 + 1] ^ -1)) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (param7.field_j + -1 > var16) {
                            if (var15[var13 + param7.field_k] == 0) {
                              break L8;
                            } else {
                              var13++;
                              var17++;
                              continue L7;
                            }
                          } else {
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                        ge.f(var17, var16, param0, param1);
                        var13++;
                        var17++;
                        continue L7;
                      } else {
                        var13++;
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((h) this).field_e;
    }

    h(String param0) {
        ((h) this).field_c = false;
        ((h) this).field_d = false;
        ((h) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Waiting for extra data";
    }
}
