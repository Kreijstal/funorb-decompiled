/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    int field_e;
    int field_f;
    ci field_i;
    int field_j;
    int field_c;
    ci field_n;
    int field_g;
    static bk field_s;
    ci field_r;
    int field_d;
    private int field_k;
    static aj field_a;
    ci field_h;
    int field_l;
    private boolean field_b;
    ee field_o;
    ci field_m;
    static java.awt.Color field_p;
    static td field_q;

    private final void a(int param0, String param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var16 = Main.field_T;
        try {
          L0: {
            L1: {
              var5_int = ((aj) this).field_j + ((aj) this).field_l;
              var6 = ((aj) this).field_e + ((aj) this).field_f;
              var7 = ((aj) this).field_c;
              if (-1 != var7) {
                break L1;
              } else {
                var7 = ((aj) this).field_o.field_x + ((aj) this).field_o.field_s;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var8 = vj.field_l >> -1389862974;
                  var9 = ((aj) this).field_o.a(param1);
                  var10 = ((aj) this).field_o.field_x + ((aj) this).field_o.field_s;
                  var12 = 53 % ((param3 - 76) / 36);
                  var11 = 1;
                  if (var9 > var8) {
                    break L4;
                  } else {
                    if (param1.indexOf("<br>") != -1) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (~var9 < ~var8) {
                      break L6;
                    } else {
                      var13 = var8;
                      if (var16 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var14 = var9 / var8;
                  var13 = (var9 % var8 - -var14 - 1) / var14 * 2 + var8;
                  break L5;
                }
                L7: {
                  if (null == ma.field_d) {
                    ma.field_d = new String[16];
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var11 = ((aj) this).field_o.a(param1, new int[1], ma.field_d);
                var9 = 0;
                var10 = var10 + (var11 - 1) * var7;
                var14 = 0;
                L8: while (true) {
                  if (var14 >= var11) {
                    break L3;
                  } else {
                    var15 = ((aj) this).field_o.a(ma.field_d[var14]);
                    stackOut_18_0 = ~var15;
                    stackOut_18_1 = ~var9;
                    stackIn_26_0 = stackOut_18_0;
                    stackIn_26_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (var16 != 0) {
                      break L2;
                    } else {
                      L9: {
                        if (stackIn_19_0 < stackIn_19_1) {
                          var9 = var15;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var14++;
                      if (var16 == 0) {
                        continue L8;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              var13 = param2;
              stackOut_25_0 = var5_int + var13 + var9;
              stackOut_25_1 = vj.field_l;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              break L2;
            }
            L10: {
              if (stackIn_26_0 <= stackIn_26_1) {
                break L10;
              } else {
                var13 = -var5_int + -var9 + vj.field_l;
                break L10;
              }
            }
            L11: {
              var14 = 32 + (param0 - ((aj) this).field_o.field_q);
              if (var6 + (var10 + var14) > vj.field_g) {
                var14 = param0 - var10 - var6;
                break L11;
              } else {
                break L11;
              }
            }
            vj.b(var13, var14, var9 + var5_int, var10 + var6, ((aj) this).field_g);
            vj.c(1 + var13, var14 - -1, -2 + var5_int + var9, var10 + var6 + -2, ((aj) this).field_d);
            int discarded$1 = ((aj) this).field_o.a(param1, ((aj) this).field_l + var13, ((aj) this).field_e + var14, var9, var10, ((aj) this).field_k, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var5;
            stackOut_34_1 = new StringBuilder().append("aj.I(").append(param0).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L12;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            vj.e(param2, param0, param1, param5, param3);
            if (param4 != 0) {
                ((aj) this).a(-29, (ee) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "aj.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 43) {
                break L1;
              } else {
                aj.a(42);
                break L1;
              }
            }
            field_p = null;
            field_a = null;
            field_q = null;
            field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "aj.A(" + param0 + ')');
        }
    }

    final static qk a(int param0, int param1) {
        RuntimeException var2 = null;
        qk stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        qk stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                qk discarded$2 = aj.a(38, 2);
                break L1;
              }
            }
            stackOut_3_0 = lf.a(true, false, 1, param1, (byte) -70, false);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "aj.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void b(int param0, String param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((aj) this).field_o.a(param1);
              var6 = ((aj) this).field_o.field_q - -((aj) this).field_o.field_x;
              var7 = param2;
              if (~vj.field_l > ~(var7 - -var5_int - -6)) {
                var7 = vj.field_l + -var5_int - 6;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = param0 + -((aj) this).field_o.field_q - -32;
              if (6 + (var6 + var8) <= vj.field_g) {
                break L2;
              } else {
                var8 = -6 + vj.field_g + -var6;
                break L2;
              }
            }
            var9 = 32 / ((-25 - param3) / 44);
            vj.b(var7, var8, 6 + var5_int, var6 + 6, ((aj) this).field_k);
            vj.c(1 + var7, var8 + 1, var5_int + 4, var6 + 4, ((aj) this).field_d);
            ((aj) this).field_o.b(param1, 3 + var7, ((aj) this).field_o.field_q + 3 + var8, ((aj) this).field_k, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("aj.F(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, ee param1) {
        RuntimeException var3 = null;
        ek var3_ref = null;
        nd var4 = null;
        kc[] var5 = null;
        si var6 = null;
        nd var6_ref = null;
        int var7_int = 0;
        nd var7 = null;
        nd var8 = null;
        kc[] var9 = null;
        kc[] var10 = null;
        nd var11 = null;
        nd var12 = null;
        kc var13 = null;
        nd var14 = null;
        int var15 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var15 = Main.field_T;
        try {
          L0: {
            var3_ref = new ek(param1, 2, 2, 2236962, 1, 1, 1, param1.field_x + param1.field_s + 2);
            ((aj) this).field_h = (ci) (Object) var3_ref;
            var3_ref.field_h = 16777215;
            var4 = new nd();
            var3_ref.a((ek) (Object) var4, (byte) 113);
            ((aj) this).field_e = 3;
            ((aj) this).field_l = 3;
            ((aj) this).field_k = 15658734;
            var4.field_l = 15658734;
            ((aj) this).field_c = -1;
            ((aj) this).field_g = 15658734;
            ((aj) this).field_j = 3;
            ((aj) this).field_d = 5592405;
            ((aj) this).field_o = param1;
            ((aj) this).field_f = 3;
            var4.field_o = 11711154;
            oc discarded$10 = var4.a((byte) -1, 0).c(15658734, (byte) 52).a(fb.a(18457, 8947848, 10066329, 7829367), true);
            oc discarded$11 = var4.a((byte) -1, 1).a(fb.a(18457, 11184810, 10066329, 13421772), true);
            oc discarded$12 = var4.a((byte) -1, 3).a(fb.a(18457, 8947848, 7829367, 10066329), true).b(1, (byte) -51).a(1, -99);
            var5 = new kc[9];
            var6 = new si(32, 32);
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6.field_r.length >= ~var7_int) {
                    break L3;
                  } else {
                    var6.field_r[var7_int] = 1077952576;
                    var7_int++;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5[4] = (kc) (Object) var6;
                oc discarded$13 = var4.a((byte) -1, 4).a(true, (byte) -74).a(var5, true);
                oc discarded$14 = var4.a((byte) -1, 5).a(wf.a(0, 1, 0, 0, 65793), true).a(true, (byte) -104).c(-1, (byte) 73);
                ((aj) this).field_i = (ci) (Object) var4;
                break L2;
              }
              var6_ref = new nd(var4, true);
              var6_ref.field_i = 0;
              var7 = new nd(var4, true);
              var7.field_i = 0;
              var7.a(we.a(102, 8947848), -120);
              oc discarded$15 = var7.a((byte) -1, 1).a(we.a(param0 + 48, 11184810), true).c(2236962, (byte) 48);
              ((aj) this).field_m = (ci) (Object) new db(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
              ug discarded$16 = new ug(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
              tb discarded$17 = new tb(param1, 16777215, param0, 125269879, 4473924, 3, 268435455);
              var8 = new nd();
              var3_ref.a((ek) (Object) var8, (byte) -101);
              oc discarded$18 = var8.a((byte) -1, 0).a(fb.a(18457, 15658734, 7829367, 10066329), true).c(1118481, (byte) 68).a(-1, (byte) -118);
              oc discarded$19 = var8.a((byte) -1, 4).a(true, (byte) -93).a(var5, true);
              ((aj) this).field_r = (ci) (Object) var8;
              var9 = new kc[9];
              var9[4] = new kc(2, 1);
              var10 = new kc[9];
              var10[4] = new kc(1, 2);
              var9[4].field_r = new int[]{6710886, 7829367};
              var10[4].field_r = new int[]{6710886, 7829367};
              var11 = new nd();
              var12 = new nd();
              var11.a(true, 0, var9);
              var12.a(true, 0, var10);
              var13 = new kc(7, 4);
              var13.field_r = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
              var14 = new nd(var4, true);
              var14.a(var13.b(), (byte) -78);
              var13.d();
              var14 = new nd(var4, true);
              var14.a(var13.b(), (byte) -103);
              var13.d();
              var14 = new nd(var4, true);
              var14.a(var13.b(), (byte) -53);
              var13.d();
              var14 = new nd(var4, true);
              var14.a(var13, (byte) 109);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("aj.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            vj.a(param2, param3, param5, param4, param0, param6);
            if (param1 != 10066329) {
                ((aj) this).field_g = -24;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "aj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        Object stackOut_2_0 = null;
        var5 = Main.field_T;
        try {
          L0: {
            if (param0 == 92) {
              L1: {
                L2: {
                  var1_ref = "(" + ni.field_d + " " + hc.field_f + " " + sb.field_a + ") " + pd.field_l;
                  if (al.field_a > 0) {
                    var1_ref = var1_ref + ":";
                    var2 = 0;
                    L3: while (true) {
                      if (al.field_a <= var2) {
                        break L2;
                      } else {
                        stackOut_9_0 = var1_ref + ' ';
                        stackIn_24_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              var1_ref = stackIn_10_0;
                              var3 = 255 & rd.field_j.field_g[var2];
                              var4 = var3 >> 1535326116;
                              if (var4 < 10) {
                                break L5;
                              } else {
                                var4 += 55;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4 += 48;
                            break L4;
                          }
                          L6: {
                            L7: {
                              var3 = var3 & 15;
                              if (var3 >= 10) {
                                break L7;
                              } else {
                                var3 += 48;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 += 55;
                            break L6;
                          }
                          var1_ref = var1_ref + (char)var4;
                          var1_ref = var1_ref + (char)var3;
                          var2++;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                stackOut_23_0 = (String) var1_ref;
                stackIn_24_0 = stackOut_23_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "aj.B(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    public aj() {
        ((aj) this).field_b = true;
    }

    final void a(int param0, byte param1, String param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -53) {
                break L1;
              } else {
                ((aj) this).a(-126, (ee) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((aj) this).field_b) {
                  break L3;
                } else {
                  this.b(param3, param2, param0, (byte) -115);
                  if (Main.field_T == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.a(param3, param2, param0, (byte) 115);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("aj.G(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new bk();
        field_p = new java.awt.Color(10040319);
        field_q = new td();
    }
}
