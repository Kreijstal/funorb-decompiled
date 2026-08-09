/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    o field_a;
    static String field_e;
    static km[] field_d;
    static String field_b;
    static String field_c;
    static boolean[][] field_g;
    static int field_f;
    private o field_h;

    final o g(int param0) {
        o var2 = this.field_a.field_h;
        if (param0 != -18110) {
            o var3 = (o) null;
            this.b((o) null, (byte) -57);
        }
        if (!(var2 != this.field_a)) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_h;
        return var2;
    }

    final o a(boolean param0) {
        if (!param0) {
            jc.d(73);
        }
        o var2 = this.field_h;
        if (this.field_a == var2) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_c;
        return var2;
    }

    final static void a(int param0) {
        String var3 = null;
        if (null != i.field_c) {
            var3 = i.field_c;
            String var1 = var3;
            nj.a((byte) -101, oc.a(vh.field_a, new String[]{var3}, (byte) -121));
            i.field_c = null;
        }
        if (param0 != -26285) {
            String var2 = (String) null;
            jc.a(-114, (String) null, (byte) -108);
        }
    }

    final o f(int param0) {
        o var2 = this.field_a.field_h;
        if (param0 != 1184188328) {
            this.field_h = (o) null;
        }
        if (this.field_a == var2) {
            return null;
        }
        var2.c(-2193);
        return var2;
    }

    final static km[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        km[] var10;
        km[] var11_ref_km__;
        int var11;
        int var12;
        km var13;
        int var14;
        int var15;
        var15 = Chess.field_G;
        var9 = param6 - (-param1 - param4);
        var10 = new km[]{new km(var9, var9), new km(param0, var9), new km(var9, var9), new km(var9, param0), new km(64, 64), new km(var9, param0), new km(var9, var9), new km(param0, var9), new km(var9, var9)};
        var11_ref_km__ = var10;
        var12 = param8;
        L0: while (true) {
          if (var11_ref_km__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= param6) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= param6) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= param0) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= param0 >> 1567522209) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (param4 <= var12) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_x[(-1 + (-var12 + var9)) * param0 + var11] = param7;
                                var10[3].field_x[var11 * var9 - (1 + (-var9 - -var12))] = param7;
                                var10[7].field_x[var11 + var12 * param0] = param7;
                                var10[5].field_x[var12 + var9 * var11] = param7;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 < param6) {
                            var10[7].field_x[var11 + (-var12 + (var9 - 1)) * param0] = param2;
                            var10[5].field_x[var11 * var9 + var9 - 1 + -var12] = param2;
                            var10[1].field_x[var11 + var12 * param0] = param5;
                            var10[3].field_x[var12 + var9 * var11] = param5;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 > var12) {
                        var10[0].field_x[var12 + var9 * var11] = param5;
                        var10[0].field_x[var11 + var9 * var12] = param5;
                        if (-var11 + var9 > var12) {
                          var10[2].field_x[var12 + var11 * var9] = param5;
                          var10[6].field_x[var12 * var9 + var11] = param5;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var12 < var9) {
                    var10[6].field_x[var9 * (var9 - var11 + -1) + var12] = param2;
                    var10[8].field_x[var12 + var9 * (-1 + (var9 - var11))] = param2;
                    var10[2].field_x[var9 * var12 - (var11 + (1 + -var9))] = param2;
                    var10[8].field_x[-var11 + (-1 + var9 + var9 * var12)] = param2;
                    var12++;
                    continue L8;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_km__[var12];
            var14 = 0;
            L9: while (true) {
              if (var14 >= var13.field_x.length) {
                var12++;
                continue L0;
              } else {
                var13.field_x[var14] = param3;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final boolean h(int param0) {
        int var2 = -86 / ((65 - param0) / 48);
        return this.field_a.field_h == this.field_a ? true : false;
    }

    final static void a(int param0, String param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var3_int = -95 % ((param2 - 19) / 49);
              cf.field_Nb = false;
              bc.field_d = false;
              if (null == ua.field_d) {
                break L1;
              } else {
                if (ua.field_d.field_P) {
                  L2: {
                    var4 = 1;
                    if (param0 != 8) {
                      break L2;
                    } else {
                      L3: {
                        param0 = 2;
                        if (dk.field_g) {
                          param1 = td.field_r;
                          break L3;
                        } else {
                          param1 = s.field_R;
                          break L3;
                        }
                      }
                      um.field_b.a(pi.field_a, 20);
                      break L2;
                    }
                  }
                  L4: {
                    if ((param0 ^ -1) == -11) {
                      var4 = 0;
                      oj.a(124);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var4 == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (!bc.field_d) {
                          break L6;
                        } else {
                          param1 = oc.a(aj.field_b, new String[]{param1}, (byte) -92);
                          break L6;
                        }
                      }
                      L7: {
                        if (ag.field_e) {
                          param1 = rd.field_a;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ua.field_d.a(param0, param1, (byte) 33);
                      break L5;
                    }
                  }
                  if (param0 == 256) {
                    break L1;
                  } else {
                    if ((param0 ^ -1) != -11) {
                      if (dk.field_g) {
                        break L1;
                      } else {
                        um.field_b.g((byte) -14);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("jc.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != -31) {
            return;
        }
        field_c = null;
        field_e = null;
        field_g = (boolean[][]) null;
        field_d = null;
        field_b = null;
    }

    final o b(o param0, byte param1) {
        o var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        o stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = this.field_a.field_h;
                break L1;
              }
            }
            if (var3 == this.field_a) {
              this.field_h = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 23 / ((param1 - -78) / 35);
              this.field_h = var3.field_h;
              stackIn_8_0 = (o) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("jc.N(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (o) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Chess.field_G;
        if ((sl.field_a ^ -1) > -1) {
          return;
        } else {
          L0: {
            if (param1 == -117) {
              break L0;
            } else {
              field_c = (String) null;
              break L0;
            }
          }
          L1: {
            var3 = -135 + param2;
            var4 = -35 + param0;
            var5 = 256;
            if ((sl.field_a ^ -1) > -76) {
              var5 = (sl.field_a << -229179608) / 75;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((sl.field_a ^ -1) < -201) {
              var5 = (-sl.field_a + 250 << 1016168008) / 50;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            tl.a((byte) -67, gf.field_f);
            nh.a();
            wb.b();
            di.k(9);
            if (var5 < 256) {
              wb.b(0, 0, wb.field_h, wb.field_c, 0, -var5 + 256);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            fd.a(28773);
            if (-151 >= (sl.field_a ^ -1)) {
              v.field_i.b(15 + var3, var4 + 10, var5);
              break L4;
            } else {
              gf.field_f.c(var3, var4);
              break L4;
            }
          }
          L5: {
            var6 = sl.field_a - 125;
            if (-1 <= (var6 ^ -1)) {
              break L5;
            } else {
              if (50 <= var6) {
                break L5;
              } else {
                if ((var6 ^ -1) <= -21) {
                  if ((var6 ^ -1) <= -31) {
                    var7 = (50 - var6) * 256 / 20;
                    tg.field_u.d(var3, var4, var7);
                    break L5;
                  } else {
                    tg.field_u.d(var3, var4, 256);
                    break L5;
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  tg.field_u.d(var3, var4, var7);
                  break L5;
                }
              }
            }
          }
          L6: {
            var6 = -140 + sl.field_a;
            if ((var6 ^ -1) >= -1) {
              break L6;
            } else {
              L7: {
                var7 = 256;
                if (-21 >= (var6 ^ -1)) {
                  break L7;
                } else {
                  var7 = var6 * 256 / 20;
                  break L7;
                }
              }
              re.field_u.b(var3 - -15, var4 - -10, var5 * var7 >> 1184188328);
              break L6;
            }
          }
          return;
        }
    }

    final void a(o param0, int param1) {
        try {
            if (param1 < 68) {
                field_g = (boolean[][]) null;
            }
            if (param0.field_c != null) {
                param0.c(-2193);
            }
            param0.field_h = this.field_a.field_h;
            param0.field_c = this.field_a;
            param0.field_c.field_h = param0;
            param0.field_h.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "jc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final o a(byte param0) {
        o var2 = this.field_h;
        if (this.field_a == var2) {
            this.field_h = null;
            return null;
        }
        if (param0 >= -90) {
            jc.d(9);
        }
        this.field_h = var2.field_h;
        return var2;
    }

    final o c(int param0) {
        o var2 = this.field_a.field_c;
        if (var2 == this.field_a) {
            return null;
        }
        var2.c(-2193);
        if (param0 < 42) {
            return (o) null;
        }
        return var2;
    }

    final void a(o param0, byte param1) {
        try {
            if (!(param0.field_c == null)) {
                param0.c(-2193);
            }
            param0.field_h = this.field_a;
            int var3_int = 69 % ((param1 - 28) / 56);
            param0.field_c = this.field_a.field_c;
            param0.field_c.field_h = param0;
            param0.field_h.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "jc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final o b(int param0) {
        o var2 = this.field_a.field_c;
        if (this.field_a == var2) {
            this.field_h = null;
            return null;
        }
        if (param0 != 28937) {
            return (o) null;
        }
        this.field_h = var2.field_c;
        return var2;
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == kb.field_O) {
                break L1;
              } else {
                kb.field_O.field_Y.a(param1, -1);
                break L1;
              }
            }
            L2: {
              if (param0 >= 88) {
                break L2;
              } else {
                field_b = (String) null;
                break L2;
              }
            }
            L3: {
              if (hn.field_u == null) {
                break L3;
              } else {
                hn.field_u.field_Q.a(param1, -1);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("jc.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void e(int param0) {
        o var2;
        int var3;
        var3 = Chess.field_G;
        L0: while (true) {
          var2 = this.field_a.field_h;
          if (var2 != this.field_a) {
            var2.c(param0 + 28830);
            continue L0;
          } else {
            if (param0 == -31023) {
              this.field_h = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    public jc() {
        this.field_a = new o();
        this.field_a.field_h = this.field_a;
        this.field_a.field_c = this.field_a;
    }

    static {
        field_e = "Rating";
        field_c = "Set up new unrated game";
        field_b = "<%0> has not yet unlocked this option for use.";
    }
}
