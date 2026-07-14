/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static kb field_d;
    static String field_b;
    static ld field_a;
    static hj field_c;

    final static String a(int[] param0, int param1, String param2) {
        if (param1 > -118) {
          field_b = null;
          return sd.a(pe.field_d, new String[4], true);
        } else {
          return sd.a(pe.field_d, new String[4], true);
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -24) {
          jh.a(-125);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void b(int param0) {
        if (param0 > 67) {
            return;
        }
        field_d = null;
    }

    final static void a(hj param0, byte param1, float param2, int[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = HoldTheLine.field_D;
        gf.a();
        gf.a(param3, 0, param3.length);
        gf.c();
        if (param1 > 46) {
          if (gf.d()) {
            L0: {
              var4 = gf.field_g;
              if (var4 < 0) {
                var4 = 0;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              var5 = gf.field_b;
              if (tc.field_j > var5) {
                break L1;
              } else {
                var5 = -1 + tc.field_j;
                break L1;
              }
            }
            L2: {
              var6 = gf.field_a;
              if ((var6 ^ -1) > -1) {
                var6 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (tc.field_c > var6) {
                break L3;
              } else {
                var6 = tc.field_c - 1;
                break L3;
              }
            }
            var7 = var4 % param0.field_s;
            var8 = var6 % param0.field_y;
            var9 = var6 * tc.field_j + var4;
            var10 = param0.field_s * var8 + var7;
            var11 = -var7 + param0.field_s;
            var12 = var5 + -var4;
            L4: while (true) {
              var12--;
              if (var12 >= 0) {
                var13 = tc.field_b[var9] & 16711680;
                var14 = tc.field_b[var9] & 65280;
                var15 = 255 & tc.field_b[var9];
                var16 = param0.field_z[var10] & 16711680;
                var17 = 65280 & param0.field_z[var10];
                var18 = param0.field_z[var10] & 255;
                var19 = var13 - -(int)(param2 * (float)(var16 + -var13));
                var20 = var14 - -(int)((float)(-var14 + var17) * param2);
                var21 = (int)((float)(var18 - var15) * param2) + var15;
                tc.field_b[var9] = kc.a(kc.a(pk.a(65280, var20), pk.a(16711680, var19)), pk.a(255, var21));
                var9++;
                var10++;
                var11--;
                if (var11 == 0) {
                  var10 = var8 * param0.field_s;
                  var11 = param0.field_s;
                  continue L4;
                } else {
                  continue L4;
                }
              } else {
                L5: while (true) {
                  if (!gf.d()) {
                    return;
                  } else {
                    L6: {
                      var4 = gf.field_g;
                      if (var4 < 0) {
                        var4 = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var5 = gf.field_b;
                      if (tc.field_j > var5) {
                        break L7;
                      } else {
                        var5 = -1 + tc.field_j;
                        break L7;
                      }
                    }
                    L8: {
                      var6 = gf.field_a;
                      if ((var6 ^ -1) > -1) {
                        var6 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (tc.field_c > var6) {
                        break L9;
                      } else {
                        var6 = tc.field_c - 1;
                        break L9;
                      }
                    }
                    var7 = var4 % param0.field_s;
                    var8 = var6 % param0.field_y;
                    var9 = var6 * tc.field_j + var4;
                    var10 = param0.field_s * var8 + var7;
                    var11 = -var7 + param0.field_s;
                    var12 = var5 + -var4;
                    L10: while (true) {
                      var12--;
                      if (var12 < 0) {
                        continue L5;
                      } else {
                        var13 = tc.field_b[var9] & 16711680;
                        var14 = tc.field_b[var9] & 65280;
                        var15 = 255 & tc.field_b[var9];
                        var16 = param0.field_z[var10] & 16711680;
                        var17 = 65280 & param0.field_z[var10];
                        var18 = param0.field_z[var10] & 255;
                        var19 = var13 - -(int)(param2 * (float)(var16 + -var13));
                        var20 = var14 - -(int)((float)(-var14 + var17) * param2);
                        var21 = (int)((float)(var18 - var15) * param2) + var15;
                        tc.field_b[var9] = kc.a(kc.a(pk.a(65280, var20), pk.a(16711680, var19)), pk.a(255, var21));
                        var9++;
                        var10++;
                        var11--;
                        if (var11 == 0) {
                          var10 = var8 * param0.field_s;
                          var11 = param0.field_s;
                          continue L10;
                        } else {
                          continue L10;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          field_d = null;
          if (!gf.d()) {
            return;
          } else {
            L11: {
              var4 = gf.field_g;
              if (var4 < 0) {
                var4 = 0;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var5 = gf.field_b;
              if (tc.field_j > var5) {
                break L12;
              } else {
                var5 = -1 + tc.field_j;
                break L12;
              }
            }
            L13: {
              var6 = gf.field_a;
              if ((var6 ^ -1) > -1) {
                var6 = 0;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (tc.field_c > var6) {
                break L14;
              } else {
                var6 = tc.field_c - 1;
                break L14;
              }
            }
            var7 = var4 % param0.field_s;
            var8 = var6 % param0.field_y;
            var9 = var6 * tc.field_j + var4;
            var10 = param0.field_s * var8 + var7;
            var11 = -var7 + param0.field_s;
            var12 = var5 + -var4;
            L15: while (true) {
              var12--;
              if (var12 < 0) {
                L16: while (true) {
                  if (!gf.d()) {
                    return;
                  } else {
                    L17: {
                      var4 = gf.field_g;
                      if (var4 < 0) {
                        var4 = 0;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      var5 = gf.field_b;
                      if (tc.field_j > var5) {
                        break L18;
                      } else {
                        var5 = -1 + tc.field_j;
                        break L18;
                      }
                    }
                    L19: {
                      var6 = gf.field_a;
                      if ((var6 ^ -1) > -1) {
                        var6 = 0;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (tc.field_c > var6) {
                        break L20;
                      } else {
                        var6 = tc.field_c - 1;
                        break L20;
                      }
                    }
                    var7 = var4 % param0.field_s;
                    var8 = var6 % param0.field_y;
                    var9 = var6 * tc.field_j + var4;
                    var10 = param0.field_s * var8 + var7;
                    var11 = -var7 + param0.field_s;
                    var12 = var5 + -var4;
                    L21: while (true) {
                      var12--;
                      if (var12 < 0) {
                        continue L16;
                      } else {
                        var13 = tc.field_b[var9] & 16711680;
                        var14 = tc.field_b[var9] & 65280;
                        var15 = 255 & tc.field_b[var9];
                        var16 = param0.field_z[var10] & 16711680;
                        var17 = 65280 & param0.field_z[var10];
                        var18 = param0.field_z[var10] & 255;
                        var19 = var13 - -(int)(param2 * (float)(var16 + -var13));
                        var20 = var14 - -(int)((float)(-var14 + var17) * param2);
                        var21 = (int)((float)(var18 - var15) * param2) + var15;
                        tc.field_b[var9] = kc.a(kc.a(pk.a(65280, var20), pk.a(16711680, var19)), pk.a(255, var21));
                        var9++;
                        var10++;
                        var11--;
                        if (var11 == 0) {
                          var10 = var8 * param0.field_s;
                          var11 = param0.field_s;
                          continue L21;
                        } else {
                          continue L21;
                        }
                      }
                    }
                  }
                }
              } else {
                var13 = tc.field_b[var9] & 16711680;
                var14 = tc.field_b[var9] & 65280;
                var15 = 255 & tc.field_b[var9];
                var16 = param0.field_z[var10] & 16711680;
                var17 = 65280 & param0.field_z[var10];
                var18 = param0.field_z[var10] & 255;
                var19 = var13 - -(int)(param2 * (float)(var16 + -var13));
                var20 = var14 - -(int)((float)(-var14 + var17) * param2);
                var21 = (int)((float)(var18 - var15) * param2) + var15;
                tc.field_b[var9] = kc.a(kc.a(pk.a(65280, var20), pk.a(16711680, var19)), pk.a(255, var21));
                var9++;
                var10++;
                var11--;
                if (var11 == 0) {
                  var10 = var8 * param0.field_s;
                  var11 = param0.field_s;
                  continue L15;
                } else {
                  continue L15;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        L0: {
          nd.field_l = param0 >> -136667228 & 3;
          if (2 < nd.field_l) {
            nd.field_l = 2;
            break L0;
          } else {
            break L0;
          }
        }
        m.field_a = (param0 & 14) >> 1017758114;
        if ((m.field_a ^ -1) >= -3) {
          pe.field_f = param0 & 3;
          if (2 >= pe.field_f) {
            if (param1 == 61) {
              return;
            } else {
              field_a = null;
              return;
            }
          } else {
            pe.field_f = 2;
            if (param1 == 61) {
              return;
            } else {
              field_a = null;
              return;
            }
          }
        } else {
          m.field_a = 2;
          pe.field_f = param0 & 3;
          if (2 < pe.field_f) {
            pe.field_f = 2;
            if (param1 == 61) {
              return;
            } else {
              field_a = null;
              return;
            }
          } else {
            if (param1 == 61) {
              return;
            } else {
              field_a = null;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new kb(2);
        field_b = "<img=8>, <img=7>, <img=9>";
    }
}
