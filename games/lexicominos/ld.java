/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends kf {
    private int field_F;
    private ma field_E;
    static String field_G;

    public static void j(int param0) {
        field_G = null;
        if (param0 != 6977) {
            field_G = (String) null;
        }
    }

    final boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 44) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ld.LA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final String b(int param0) {
        if (param0 <= 121) {
            ld.i(55);
            if (!(!this.field_m)) {
                return this.field_E.a((byte) 102);
            }
            return null;
        }
        if (!(!this.field_m)) {
            return this.field_E.a((byte) 102);
        }
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        de discarded$2 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        String var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              var3 = new byte[var2_int];
              if (param0 >= 70) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = ld.a((Throwable) null, (String) null);
                break L1;
              }
            }
            o.a(param1, 0, var3, 0, var2_int);
            stackOut_2_0 = (byte[]) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ld.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void i(int param0) {
        if (param0 != -29115) {
            return;
        }
        ni.a(-125, 4);
    }

    final void a(byte param0, w param1, int param2, int param3) {
        try {
            this.field_F = this.field_F + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ld.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    ld(ma param0) {
        try {
            this.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        sc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        db var15 = null;
        db var16 = null;
        db var17 = null;
        db var18 = null;
        db var19 = null;
        db var20 = null;
        db var23 = null;
        db var24 = null;
        db var27 = null;
        db var28 = null;
        db var29 = null;
        db var30 = null;
        db var31 = null;
        db var32 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          L0: {
            var5 = (this.field_j >> 1403155361) + this.field_t + param2;
            var6 = this.field_o + (param1 + (this.field_v >> 1762056929));
            var8 = this.field_E.b((byte) 116);
            if (jj.field_e == var8) {
              var18 = be.field_b[0];
              var9 = var18.field_r << -1398745791;
              var10 = var18.field_x << -73343423;
              if (dd.field_f != null) {
                if (var9 > dd.field_f.field_p) {
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  if (var11 == 0) {
                    var18.a(112, 144, var18.field_r << 1644659268, var18.field_x << -981984796, -this.field_F << -342434070, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var18.field_r + var5, -var18.field_x + var6, 256);
                    if (var11 != 0) {
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    de.a(dd.field_f, 6);
                    lf.a();
                    var18.a(112, 144, var18.field_r << 1644659268, var18.field_x << -981984796, -this.field_F << -342434070, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var18.field_r + var5, -var18.field_x + var6, 256);
                    if (var11 != 0) {
                      if (ni.field_b != var8) {
                        if (rh.field_p == var8) {
                          L1: {
                            var29 = be.field_b[1];
                            var29.d(-(var29.field_p >> 2079400193) + var5, var6 + -(var29.field_u >> 1839068961), 256);
                            if (var11 == 0) {
                              break L1;
                            } else {
                              var30 = be.field_b[2];
                              var30.d(var5 - (var30.field_p >> 1089906849), var6 + -(var30.field_u >> -374179007), 256);
                              break L1;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var30 = be.field_b[2];
                        var30.d(var5 - (var30.field_p >> 1089906849), var6 + -(var30.field_u >> -374179007), 256);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (dd.field_f.field_u >= var10) {
                    de.a(dd.field_f, 6);
                    lf.a();
                    var18.a(112, 144, var18.field_r << 1644659268, var18.field_x << -981984796, -this.field_F << -342434070, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var18.field_r + var5, -var18.field_x + var6, 256);
                    if (var11 != 0) {
                      if (ni.field_b != var8) {
                        if (rh.field_p == var8) {
                          L2: {
                            var27 = be.field_b[1];
                            var27.d(-(var27.field_p >> 2079400193) + var5, var6 + -(var27.field_u >> 1839068961), 256);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              var28 = be.field_b[2];
                              var28.d(var5 - (var28.field_p >> 1089906849), var6 + -(var28.field_u >> -374179007), 256);
                              break L2;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        var28 = be.field_b[2];
                        var28.d(var5 - (var28.field_p >> 1089906849), var6 + -(var28.field_u >> -374179007), 256);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L3: {
                      dd.field_f = new db(var9, var10);
                      de.a(dd.field_f, param0 ^ -117);
                      if (var11 == 0) {
                        break L3;
                      } else {
                        de.a(dd.field_f, 6);
                        lf.a();
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        var18.a(112, 144, var18.field_r << 1644659268, var18.field_x << -981984796, -this.field_F << -342434070, 4096);
                        pd.a(-22949);
                        dd.field_f.d(-var18.field_r + var5, -var18.field_x + var6, 256);
                        if (ni.field_b == var8) {
                          break L5;
                        } else {
                          if (rh.field_p == var8) {
                            var23 = be.field_b[1];
                            var23.d(-(var23.field_p >> 2079400193) + var5, var6 + -(var23.field_u >> 1839068961), 256);
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      var24 = be.field_b[2];
                      var24.d(var5 - (var24.field_p >> 1089906849), var6 + -(var24.field_u >> -374179007), 256);
                      break L4;
                    }
                    return;
                  }
                }
              } else {
                L6: {
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  if (var11 == 0) {
                    break L6;
                  } else {
                    de.a(dd.field_f, 6);
                    lf.a();
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    var18.a(112, 144, var18.field_r << 1644659268, var18.field_x << -981984796, -this.field_F << -342434070, 4096);
                    pd.a(-22949);
                    dd.field_f.d(-var18.field_r + var5, -var18.field_x + var6, 256);
                    if (ni.field_b == var8) {
                      break L8;
                    } else {
                      if (rh.field_p == var8) {
                        var19 = be.field_b[1];
                        var19.d(-(var19.field_p >> 2079400193) + var5, var6 + -(var19.field_u >> 1839068961), 256);
                        if (var11 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  var20 = be.field_b[2];
                  var20.d(var5 - (var20.field_p >> 1089906849), var6 + -(var20.field_u >> -374179007), 256);
                  break L7;
                }
                return;
              }
            } else {
              if (be.field_q != var8) {
                break L0;
              } else {
                L9: {
                  L10: {
                    var15 = be.field_b[0];
                    var9 = var15.field_r << -1398745791;
                    var10 = var15.field_x << -73343423;
                    if (dd.field_f == null) {
                      break L10;
                    } else {
                      if (var9 > dd.field_f.field_p) {
                        break L10;
                      } else {
                        if (dd.field_f.field_u >= var10) {
                          de.a(dd.field_f, 6);
                          lf.a();
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  dd.field_f = new db(var9, var10);
                  de.a(dd.field_f, param0 ^ -117);
                  if (var11 == 0) {
                    break L9;
                  } else {
                    de.a(dd.field_f, 6);
                    lf.a();
                    break L9;
                  }
                }
                var15.a(112, 144, var15.field_r << 1644659268, var15.field_x << -981984796, -this.field_F << -342434070, 4096);
                pd.a(-22949);
                dd.field_f.d(-var15.field_r + var5, -var15.field_x + var6, 256);
                if (var11 == 0) {
                  return;
                } else {
                  L11: {
                    L12: {
                      if (ni.field_b == var8) {
                        break L12;
                      } else {
                        if (rh.field_p == var8) {
                          var16 = be.field_b[1];
                          var16.d(-(var16.field_p >> 2079400193) + var5, var6 + -(var16.field_u >> 1839068961), 256);
                          if (var11 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    var17 = be.field_b[2];
                    var17.d(var5 - (var17.field_p >> 1089906849), var6 + -(var17.field_u >> -374179007), 256);
                    break L11;
                  }
                  return;
                }
              }
            }
          }
          if (ni.field_b != var8) {
            if (rh.field_p != var8) {
              return;
            } else {
              L13: {
                var31 = be.field_b[1];
                var31.d(-(var31.field_p >> 2079400193) + var5, var6 + -(var31.field_u >> 1839068961), 256);
                if (var11 == 0) {
                  break L13;
                } else {
                  var32 = be.field_b[2];
                  var32.d(var5 - (var32.field_p >> 1089906849), var6 + -(var32.field_u >> -374179007), 256);
                  break L13;
                }
              }
              return;
            }
          } else {
            var32 = be.field_b[2];
            var32.d(var5 - (var32.field_p >> 1089906849), var6 + -(var32.field_u >> -374179007), 256);
            return;
          }
        } else {
          return;
        }
    }

    final static de a(Throwable param0, String param1) {
        de var2 = null;
        if (!(param0 instanceof de)) {
            var2 = new de(param0, param1);
        } else {
            var2 = (de) ((Object) param0);
            var2.field_a = var2.field_a + ' ' + param1;
        }
        return var2;
    }

    static {
        field_G = "Player";
    }
}
