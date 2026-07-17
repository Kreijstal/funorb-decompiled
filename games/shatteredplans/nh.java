/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends me {
    static bc field_l;
    private int field_k;
    private int[] field_n;
    static volatile long field_m;
    private int[] field_o;
    static int field_p;

    final static void a(java.applet.Applet param0, int param1, int param2, byte param3, String[] param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              hn.field_d = param0.getParameter("overxgames");
              if (hn.field_d == null) {
                hn.field_d = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ja.field_j = param0.getParameter("overxachievements");
              if (null == ja.field_j) {
                ja.field_j = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param0.getParameter("currency");
              if (var6 == null) {
                break L3;
              } else {
                if (!go.a(0, (CharSequence) (Object) var6)) {
                  break L3;
                } else {
                  int discarded$2 = ma.a((CharSequence) (Object) var6, param3 + 5);
                  break L3;
                }
              }
            }
            L4: {
              ge.field_l = new bi[param4.length];
              if (param3 == -3) {
                break L4;
              } else {
                nh.b((byte) -94);
                break L4;
              }
            }
            var7 = 0;
            L5: while (true) {
              if (var7 >= param4.length) {
                break L0;
              } else {
                ge.field_l[var7] = new bi(317, 34);
                var7++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6_ref;
            stackOut_16_1 = new StringBuilder().append("nh.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + 16777215 + 41);
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 >= -72) {
            return false;
        }
        return param1 >= 0 ? true : false;
    }

    final fs[] b(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5_int = 0;
        fs[] var5 = null;
        int var6 = 0;
        double var6_double = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            var10 = null;
            nh.a(-33, (nq) null, 126, 13, -76, 49, (String) null, true, -106, 108, -72, 85);
            break L0;
          }
        }
        if (null == ((nh) this).field_g) {
          var2 = 0;
          var3 = 1.7976931348623157e+308;
          var5_int = 0;
          L1: while (true) {
            if (var5_int >= ((nh) this).field_i.length) {
              if (var2 != 0) {
                var5 = new fs[var2];
                var6 = 0;
                L2: while (true) {
                  if (((nh) this).field_i.length <= var6) {
                    return var5;
                  } else {
                    if (((nh) this).field_n[var6] != 0) {
                      var7 = (double)(((nh) this).field_k + -((nh) this).field_o[var6]) / (double)((nh) this).field_n[var6];
                      if (var7 == var3) {
                        var2--;
                        var5[var2] = ((nh) this).field_i[var6];
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new fs[]{};
              }
            } else {
              if (((nh) this).field_n[var5_int] != 0) {
                if (((nh) this).field_o[var5_int] != 0) {
                  var6_double = (double)(((nh) this).field_k - ((nh) this).field_o[var5_int]) / (double)((nh) this).field_n[var5_int];
                  if (var3 == var6_double) {
                    var2++;
                    var5_int++;
                    continue L1;
                  } else {
                    if (var3 > var6_double) {
                      var3 = var6_double;
                      var2 = 1;
                      var5_int++;
                      continue L1;
                    } else {
                      var5_int++;
                      continue L1;
                    }
                  }
                } else {
                  var5_int++;
                  continue L1;
                }
              } else {
                var5_int++;
                continue L1;
              }
            }
          }
        } else {
          return ((nh) this).field_g;
        }
    }

    final void a(ob param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((nh) this).field_k = param0.a(16711680);
            if (param1 == -109) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= ((nh) this).field_o.length) {
                  break L0;
                } else {
                  ((nh) this).field_o[var3_int] = param0.a(16711680);
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("nh.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, nq param1, int param2, int param3, int param4, int param5, String param6, boolean param7, int param8, int param9, int param10, int param11) {
        RuntimeException var12 = null;
        bi var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              cl.a(param5, param8, -22466, param0, param9, param4, param2, param3, param11);
              param1.c(param6, param5 + (param0 >> 1), param3 + (param1.field_J + param9 >> 1), 16777215, param10);
              if (param7) {
                var13 = new bi(param0, param9);
                bs.a(var13, 98);
                param1.c(param6, (param0 >> 1) + 1, param9 - -param1.field_J >> 1, 16777215, -1);
                param1.c(param6, (param0 >> 1) + -1, param1.field_J + param9 >> 1, 16777215, -1);
                param1.c(param6, param0 >> 1, (param9 - -param1.field_J >> 1) + 1, 16777215, -1);
                param1.c(param6, param0 >> 1, -1 - -(param1.field_J + param9 >> 1), 16777215, -1);
                cg.i(0);
                var13.c(param5, param3, 64);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var12 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var12;
            stackOut_4_1 = new StringBuilder().append("nh.K(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 41);
        }
    }

    nh(fs[] param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        ((nh) this).field_k = 0;
        try {
          L0: {
            ((nh) this).field_o = new int[((nh) this).field_i.length];
            ((nh) this).field_n = new int[((nh) this).field_i.length];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= ((nh) this).field_i.length) {
                break L0;
              } else {
                ((nh) this).field_n[var2_int] = 3;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("nh.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public static void b(byte param0) {
        field_l = null;
        if (param0 != 59) {
            field_m = -92L;
        }
    }

    final int b(boolean param0) {
        if (param0) {
            boolean discarded$0 = nh.a((byte) 114, 82);
        }
        return cc.field_n * ((nh) this).field_o.length + rs.field_Cb.field_J;
    }

    final boolean a(dc param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ln var5_ref_ln = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        sd var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, (byte) 116)) {
              L1: {
                if (((nh) this).field_k == 0) {
                  var3_int = param0.field_g.field_e.length / ((nh) this).field_i.length;
                  var4 = 0;
                  L2: while (true) {
                    L3: {
                      if (hp.field_k.length <= var4) {
                        break L3;
                      } else {
                        if (md.field_J[var4] != var3_int) {
                          var4++;
                          continue L2;
                        } else {
                          ((nh) this).field_k = hp.field_k[var4];
                          break L3;
                        }
                      }
                    }
                    if (((nh) this).field_k != 0) {
                      break L1;
                    } else {
                      throw new RuntimeException("No points settings for galaxy size of " + var3_int + " stars per player.");
                    }
                  }
                } else {
                  break L1;
                }
              }
              var3_int = 0;
              L4: while (true) {
                if (var3_int >= ((nh) this).field_i.length) {
                  L5: {
                    if (param1 >= 23) {
                      break L5;
                    } else {
                      var8 = null;
                      boolean discarded$1 = ((nh) this).a((dc) null, (byte) -96);
                      break L5;
                    }
                  }
                  var3_int = 0;
                  var4 = 0;
                  var5 = 0;
                  L6: while (true) {
                    if (var5 >= ((nh) this).field_o.length) {
                      if (var3_int == 0) {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0 != 0;
                      } else {
                        ((nh) this).field_g = new fs[var3_int];
                        var9 = 0;
                        var5 = var9;
                        L7: while (true) {
                          if (((nh) this).field_i.length <= var9) {
                            stackOut_51_0 = 1;
                            stackIn_52_0 = stackOut_51_0;
                            break L0;
                          } else {
                            L8: {
                              if (((nh) this).field_o[var9] != var4) {
                                break L8;
                              } else {
                                var3_int--;
                                ((nh) this).field_g[var3_int] = ((nh) this).field_i[var9];
                                break L8;
                              }
                            }
                            var9++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      if ((1 << var5 & param0.field_w) == 0) {
                        L9: {
                          if (((nh) this).field_k > ((nh) this).field_o[var5]) {
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var5++;
                        continue L6;
                      } else {
                        ((nh) this).field_o[var5] = -1;
                        var5++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  ((nh) this).field_n[var3_int] = 0;
                  var10 = (sd) (Object) ((nh) this).field_i[var3_int].field_i.d(0);
                  L10: while (true) {
                    if (var10 == null) {
                      ((nh) this).field_o[var3_int] = ((nh) this).field_o[var3_int] + ((nh) this).field_n[var3_int];
                      var3_int++;
                      continue L4;
                    } else {
                      var5_ref_ln = var10.j(18229);
                      L11: while (true) {
                        if (var5_ref_ln == null) {
                          var10 = (sd) (Object) ((nh) this).field_i[var3_int].field_i.a((byte) -71);
                          continue L10;
                        } else {
                          L12: {
                            L13: {
                              var6 = var5_ref_ln.field_L;
                              if (var6 == 0) {
                                break L13;
                              } else {
                                if (1 != var6) {
                                  if (2 != var6) {
                                    if (var6 == 3) {
                                      ((nh) this).field_n[var3_int] = ((nh) this).field_n[var3_int] + 3;
                                      break L12;
                                    } else {
                                      var5_ref_ln = var10.h(-23410);
                                      continue L11;
                                    }
                                  } else {
                                    ((nh) this).field_n[var3_int] = ((nh) this).field_n[var3_int] + 2;
                                    break L12;
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                            ((nh) this).field_n[var3_int] = ((nh) this).field_n[var3_int] + 1;
                            break L12;
                          }
                          var5_ref_ln = var10.h(-23410);
                          continue L11;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var3;
            stackOut_53_1 = new StringBuilder().append("nh.F(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L14;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L14;
            }
          }
          throw r.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 44 + param1 + 41);
        }
        return stackIn_52_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        vh.field_b = param2;
        fe.field_A = param3;
        we.field_c = param0;
        if (param4 != 2) {
            return;
        }
        sp.field_r = param1;
    }

    final void a(byte param0, dc param1, kq param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var4_int = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7_int = 0;
        fs[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10_int = 0;
        fs[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        qk[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != ((nh) this).field_k) {
                break L1;
              } else {
                var4_int = param1.field_g.field_e.length / ((nh) this).field_i.length;
                var5 = 0;
                L2: while (true) {
                  L3: {
                    if (var5 >= hp.field_k.length) {
                      break L3;
                    } else {
                      if (md.field_J[var5] != var4_int) {
                        var5++;
                        continue L2;
                      } else {
                        ((nh) this).field_k = hp.field_k[var5];
                        break L3;
                      }
                    }
                  }
                  if (((nh) this).field_k != 0) {
                    break L1;
                  } else {
                    throw new RuntimeException("No points settings for galaxy size of " + var4_int + " stars per player.");
                  }
                }
              }
            }
            var34 = new int[((nh) this).field_i.length];
            var29 = var34;
            var24 = var29;
            var18 = var24;
            var16 = var18;
            var36 = var16;
            var31 = var36;
            var26 = var31;
            var20 = var26;
            var4_array = var20;
            var5 = 0;
            L4: while (true) {
              if (var5 >= var34.length) {
                L5: {
                  var5 = 0;
                  if (param0 < -9) {
                    break L5;
                  } else {
                    nh.a(56, -93, 96, 4, 73);
                    break L5;
                  }
                }
                var35 = ((nh) this).field_o;
                var30 = var35;
                var25 = var30;
                var19 = var25;
                var17 = var19;
                var6 = var17;
                var7_int = 0;
                L6: while (true) {
                  if (var35.length <= var7_int) {
                    L7: {
                      if (var5 > 0) {
                        lh.a((byte) -93, var4_array, (int[]) ((nh) this).field_o.clone());
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var23 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[1]))};
                    var7 = new fs[((nh) this).field_i.length];
                    var38 = new int[((nh) this).field_i.length];
                    var33 = var38;
                    var28 = var33;
                    var22 = var28;
                    var8 = var22;
                    var37 = new int[((nh) this).field_i.length];
                    var32 = var37;
                    var27 = var32;
                    var21 = var27;
                    var9 = var21;
                    var10_int = 0;
                    L8: while (true) {
                      if (((nh) this).field_i.length <= var10_int) {
                        L9: {
                          L10: {
                            var10 = ((nh) this).b(0);
                            if (null != ((nh) this).field_g) {
                              break L10;
                            } else {
                              if (0 != var10.length) {
                                var12 = var10[0].field_x;
                                var13 = (double)(-((nh) this).field_o[var12] + ((nh) this).field_k) / (double)((nh) this).field_n[var12];
                                var11 = (int)Math.ceil(var13);
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var11 = 0;
                          break L9;
                        }
                        param2.a(((nh) this).field_k, var7, var37, var38, var10, var23, (byte) -47, var11);
                        break L0;
                      } else {
                        var7[var10_int] = ((nh) this).field_i[var36[var10_int]];
                        var8[var10_int] = ((nh) this).field_o[var36[var10_int]];
                        var9[var10_int] = ((nh) this).field_n[var36[var10_int]];
                        var10_int++;
                        continue L8;
                      }
                    }
                  } else {
                    var8_int = var35[var7_int];
                    var5 = var5 + var8_int;
                    var7_int++;
                    continue L6;
                  }
                }
              } else {
                var34[var5] = var5;
                var5++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("nh.I(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          L12: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
    }

    final void a(int param0, ob param1) {
        int var3_int = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            param1.e(11135, ((nh) this).field_k);
            for (var3_int = 0; var3_int < ((nh) this).field_o.length; var3_int++) {
                param1.e(11135, ((nh) this).field_o[var3_int]);
            }
            var3_int = 23 / ((-72 - param0) / 45);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "nh.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0L;
        field_p = 0;
    }
}
