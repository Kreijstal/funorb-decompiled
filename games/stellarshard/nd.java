/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends ig {
    static String field_F;

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
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
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        L0: {
          var24 = stellarshard.field_B;
          var6 = param5 * param5;
          if (param4 <= -17) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        L1: {
          var7 = -param5 + param1;
          var8 = param5 + param1;
          var9 = -param5 + param3;
          var10 = param5 + param3;
          if (ti.field_e <= var9) {
            break L1;
          } else {
            var9 = ti.field_e;
            break L1;
          }
        }
        L2: {
          if (var8 > ti.field_l) {
            var8 = ti.field_l;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var7 >= ti.field_f) {
            break L3;
          } else {
            var7 = ti.field_f;
            break L3;
          }
        }
        L4: {
          if (ti.field_c >= var10) {
            break L4;
          } else {
            var10 = ti.field_c;
            break L4;
          }
        }
        var28 = ti.field_a;
        var27 = var28;
        var26 = var27;
        var25 = var26;
        var11 = var25;
        var16 = var7;
        L5: while (true) {
          if (var8 <= var16) {
            return;
          } else {
            var17 = var9;
            L6: while (true) {
              if (var17 >= var10) {
                var16++;
                continue L5;
              } else {
                var13 = var17 + -param3;
                var14 = -param1 + var16;
                var15 = var14 * var14 + var13 * var13;
                if (var15 < var6) {
                  L7: {
                    if (-1 != var15) {
                      break L7;
                    } else {
                      var15 = 1;
                      break L7;
                    }
                  }
                  L8: {
                    var12 = ti.field_i * var16 + var17;
                    if (-1 > param0) {
                      var28 = var27;
                      var18 = -param0 + 256 - (-param0 + 256) * var15 / var6;
                      break L8;
                    } else {
                      var18 = 256 + (param0 * var15 / var6 + -param0);
                      break L8;
                    }
                  }
                  L9: {
                    var28 = var27;
                    var19 = var28[var12];
                    var20 = var19 >> 936421040 & 255;
                    var21 = 255 & var19 >> -1408045752;
                    var22 = 255 & var19;
                    if (0 < var18) {
                      if (var18 < 256) {
                        L10: {
                          var23 = var18;
                          if (var23 > (param2 & 16711680) >> -1981368688) {
                            var23 = 255 & param2 >> 983477680;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (var20 < var23) {
                            var20 = var20 + (((16711680 & param2) >> 65821168) - var23);
                            break L11;
                          } else {
                            var20 = (16711680 & param2) >> 604543088;
                            break L11;
                          }
                        }
                        L12: {
                          var23 = var18;
                          if (var23 <= (255 & param2 >> 213272872)) {
                            break L12;
                          } else {
                            var23 = 255 & param2 >> -548883000;
                            break L12;
                          }
                        }
                        L13: {
                          if (var21 >= var23) {
                            var21 = (65280 & param2) >> -1043324760;
                            break L13;
                          } else {
                            var21 = var21 + (-var23 + (param2 >> -945904056 & 255));
                            break L13;
                          }
                        }
                        L14: {
                          var23 = var18;
                          if (var23 > (param2 & 255)) {
                            var23 = param2 & 255;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        if (var22 < var23) {
                          var22 = var22 + (-var23 + (param2 & 255));
                          break L9;
                        } else {
                          var22 = 255 & param2;
                          break L9;
                        }
                      } else {
                        var11[var12] = vf.b(vf.b(var21 << -223308248, var20 << 1690415472), var22);
                        var17++;
                        continue L6;
                      }
                    } else {
                      var21 = 255 & param2 >> 60185896;
                      var22 = 255 & param2;
                      var20 = (param2 & 16711680) >> 701134032;
                      break L9;
                    }
                  }
                  var11[var12] = vf.b(vf.b(var21 << -223308248, var20 << 1690415472), var22);
                  var17++;
                  continue L6;
                } else {
                  var17++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    private nd(String param0, lf param1) {
        this(param0, n.field_i.field_b, param1);
        ((nd) this).field_u = n.field_i.field_j;
    }

    public static void h(int param0) {
        field_F = null;
        int var1 = -67 / ((-44 - param0) / 44);
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = stellarshard.field_B;
        ti.g(param3, param1, 1 + param0, 10000536);
        ti.g(param3, param2 + param1, 1 + param0, 12105912);
        int var5 = 1;
        int var6 = param2;
        if (param4 >= -76) {
            field_F = null;
        }
        if (ti.field_f > param1 + var5) {
            var5 = ti.field_f + -param1;
        }
        if (!(param1 + var6 <= ti.field_l)) {
            var6 = -param1 + ti.field_l;
        }
        for (var7 = var5; var6 > var7; var7++) {
            var8 = 48 * var7 / param2 + 152;
            var9 = var8 | (var8 << 830799432 | var8 << -1819394672);
            ti.field_a[ti.field_i * (param1 - -var7) - -param3] = var9;
            ti.field_a[param0 + (var7 + param1) * ti.field_i + param3] = var9;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        ah.a((java.awt.Component) (Object) param1, false);
        sl.a((java.awt.Component) (Object) param1, (byte) 103);
        if (param0 != -26621) {
            Object var3 = null;
        }
        if (!(og.field_c == null)) {
            og.field_c.a(24186, (java.awt.Component) (Object) param1);
        }
    }

    final static void g(int param0) {
        try {
            if (null != e.field_a) {
                try {
                    e.field_a.a(0L, 0);
                    e.field_a.a(24, ae.field_N.field_k, -1, ae.field_N.field_r);
                } catch (Exception exception) {
                }
            }
            if (param0 != -26923) {
                return;
            }
            ae.field_N.field_k = ae.field_N.field_k + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((nd) this).field_z = !((nd) this).field_z ? true : false;
        super.a(param0, param1, param2, 107);
        if (param3 < 39) {
            Object var6 = null;
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        if (param1 == -35) {
          L0: while (true) {
            L1: {
              if (var5 >= var4) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var2 = var2 * 37L;
                    var6 = param0.charAt(var5);
                    if (var6 < 65) {
                      break L3;
                    } else {
                      if (var6 <= 90) {
                        var2 = var2 + (long)(1 + (var6 - 65));
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var6 < 97) {
                      break L4;
                    } else {
                      if (var6 > 122) {
                        break L4;
                      } else {
                        var2 = var2 + (long)(-96 + var6);
                        break L2;
                      }
                    }
                  }
                  if (var6 < 48) {
                    break L2;
                  } else {
                    if (var6 <= 57) {
                      var2 = var2 + (long)(27 - (-var6 + 48));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var2 >= 177917621779460413L) {
                  break L1;
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
            L5: while (true) {
              L6: {
                if ((var2 % 37L ^ -1L) != -1L) {
                  break L6;
                } else {
                  if (var2 == 0L) {
                    break L6;
                  } else {
                    var2 = var2 / 37L;
                    continue L5;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return 24L;
        }
    }

    private nd(String param0, uk param1, lf param2) {
        super(param0, param1, param2);
        ((nd) this).field_u = n.field_i.field_j;
    }

    nd(String param0, lf param1, boolean param2) {
        this(param0, param1);
        ((nd) this).field_z = param2 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Anomaly detected";
    }
}
