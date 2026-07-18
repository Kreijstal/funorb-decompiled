/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static int[] field_f;
    t field_k;
    int field_t;
    int field_u;
    t field_j;
    t field_h;
    t field_e;
    private int field_n;
    int field_q;
    static h field_l;
    int field_p;
    t field_g;
    static bl field_o;
    int field_a;
    private boolean field_r;
    static int field_b;
    static String field_i;
    oh field_c;
    int field_m;
    static int[] field_s;
    int field_d;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 != 10066329) {
            return;
        }
        ll.c(param6, param0, param2, param5, param4, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 <= 73) {
            return;
        }
        ll.e(param5, param4, param1, param2, param3);
    }

    private final void a(String param0, boolean param1, int param2, int param3) {
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var15 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((rd) this).field_d + ((rd) this).field_p;
              var6 = ((rd) this).field_m - -((rd) this).field_q;
              var7 = ((rd) this).field_u;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((rd) this).field_c.field_G - -((rd) this).field_c.field_u;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = ll.field_d >> 2;
                var9 = ((rd) this).field_c.a(param0);
                var10 = ((rd) this).field_c.field_u + ((rd) this).field_c.field_G;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (param0.indexOf("<br>") == -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null == nf.field_g) {
                  nf.field_g = new String[16];
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 > var8) {
                  var13 = var9 / var8;
                  var12 = var8 - -((var9 % var8 + (var13 - 1)) / var13 * 2);
                  break L5;
                } else {
                  var12 = var8;
                  break L5;
                }
              }
              var11 = ((rd) this).field_c.a(param0, new int[1], nf.field_g);
              var10 = var10 + (var11 + -1) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((rd) this).field_c.a(nf.field_g[var13]);
                    if (var14 > var9) {
                      var9 = var14;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param3;
              if (var9 + var12 - -var5_int <= ll.field_d) {
                break L8;
              } else {
                var12 = ll.field_d + (-var9 - var5_int);
                break L8;
              }
            }
            L9: {
              var13 = 32 + (-((rd) this).field_c.field_H + param2);
              if (var6 + var13 + var10 > ll.field_k) {
                var13 = -var6 + -var10 + param2;
                break L9;
              } else {
                break L9;
              }
            }
            ll.f(var12, var13, var5_int + var9, var10 - -var6, ((rd) this).field_a);
            ll.c(1 + var12, var13 - -1, var5_int + (var9 - 2), var10 + (var6 - 2), ((rd) this).field_t);
            int discarded$1 = ((rd) this).field_c.a(param0, var12 - -((rd) this).field_p, ((rd) this).field_m + var13, var9, var10, ((rd) this).field_n, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("rd.D(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + true + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, String param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((rd) this).field_r) {
                this.a(false, param1, param2, param3);
                break L1;
              } else {
                this.a(param3, true, param2, param1);
                break L1;
              }
            }
            L2: {
              if (param0 == -86) {
                break L2;
              } else {
                ((rd) this).field_n = -89;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("rd.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static void a(int param0) {
        vk var1 = (vk) (Object) ea.field_t.b(2);
        if (var1 == null) {
            lj.a((byte) 114);
            return;
        }
        la var2 = ne.field_a;
        int discarded$0 = var2.e((byte) 113);
        int discarded$1 = var2.e((byte) 113);
        int discarded$2 = var2.e((byte) 113);
        int discarded$3 = var2.e((byte) 113);
        var1.a(-33);
    }

    final static int a(int param0, boolean param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (36 < param3) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_36_0 = var6;
                        stackIn_37_0 = stackOut_36_0;
                        break L0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param2.charAt(var8);
                          if (var8 != 0) {
                            break L4;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                break L3;
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (48 > var9) {
                              break L6;
                            } else {
                              if (var9 > 57) {
                                break L6;
                              } else {
                                var9 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (65 > var9) {
                              break L7;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (97 > var9) {
                              break L8;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param3 <= var9) {
                          throw new NumberFormatException();
                        } else {
                          L9: {
                            if (var4_int == 0) {
                              break L9;
                            } else {
                              var9 = -var9;
                              break L9;
                            }
                          }
                          var10 = param3 * var6 - -var9;
                          if (var6 == var10 / param3) {
                            var5 = 1;
                            var6 = var10;
                            break L3;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("rd.B(").append(8058).append(',').append(true).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L10;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param3 + ')');
        }
        return stackIn_37_0;
    }

    private final void a(boolean param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = ((rd) this).field_c.a(param3);
            var6 = ((rd) this).field_c.field_H + ((rd) this).field_c.field_u;
            var7 = param1;
            if (ll.field_d < 6 + (var7 - -var5_int)) {
                var7 = -6 + (-var5_int + ll.field_d);
            }
            var8 = param2 - (((rd) this).field_c.field_H + -32);
            if (6 + var6 + var8 > ll.field_k) {
                var8 = -var6 + ll.field_k - 6;
            }
            ll.f(var7, var8, var5_int - -6, 6 + var6, ((rd) this).field_n);
            ll.c(var7 + 1, 1 + var8, var5_int + 4, var6 - -4, ((rd) this).field_t);
            ((rd) this).field_c.c(param3, var7 + 3, 3 + var8 + ((rd) this).field_c.field_H, ((rd) this).field_n, -1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "rd.F(" + false + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, oh param1) {
        RuntimeException var3 = null;
        gi var4 = null;
        qj[] var5 = null;
        gi var6 = null;
        int var7_int = 0;
        gi var7 = null;
        gi var8 = null;
        qj[] var9 = null;
        qj[] var10 = null;
        gi var11 = null;
        gi var12 = null;
        qj var13 = null;
        gi var14 = null;
        int var15 = 0;
        d var16 = null;
        ic var17 = null;
        d var18 = null;
        gi var19 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var15 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var17 = new ic(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_G - -param1.field_u));
            var17.field_i = 16777215;
            ((rd) this).field_k = (t) (Object) var17;
            var4 = new gi();
            var17.a(-19397, (ic) (Object) var4);
            var4.field_j = 11711154;
            ((rd) this).field_d = 3;
            ((rd) this).field_a = 15658734;
            ((rd) this).field_m = 3;
            ((rd) this).field_n = 15658734;
            ((rd) this).field_q = 3;
            ((rd) this).field_c = param1;
            ((rd) this).field_p = 3;
            var4.field_c = 15658734;
            ((rd) this).field_t = 5592405;
            ((rd) this).field_u = -1;
            qi discarded$10 = var4.a((byte) 118, 0).a(15658734, false).a(param0 ^ 13421731, qe.a(8947848, 7829367, 10066329, param0 + -13421771));
            qi discarded$11 = var4.a((byte) 118, 1).a(param0 + -13421653, qe.a(11184810, 13421772, 10066329, param0 ^ 13421773));
            qi discarded$12 = var4.a((byte) 118, 3).a(125, qe.a(8947848, 10066329, 7829367, 1)).a(255, 1).a((byte) 85, 1);
            var5 = new qj[9];
            var16 = new d(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= var18.field_z.length) {
                var5[4] = (qj) (Object) var18;
                qi discarded$13 = var4.a((byte) 118, 4).a(true, 19749).a(param0 ^ 13421758, var5);
                qi discarded$14 = var4.a((byte) 118, 5).a(113, qi.a(65793, 0, (byte) 116, 0, 0)).a(true, 19749).a(-1, false);
                ((rd) this).field_h = (t) (Object) var4;
                var6 = new gi(var4, true);
                var6.field_f = 0;
                var7 = new gi(var4, true);
                var7.field_f = 0;
                var7.a(-75, re.a((byte) 125, 8947848));
                qi discarded$15 = var7.a((byte) 118, 1).a(124, re.a((byte) 121, 11184810)).a(2236962, false);
                ((rd) this).field_j = (t) (Object) new ij(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                gh discarded$16 = new gh(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                jd discarded$17 = new jd(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new gi();
                var17.a(param0 + -13441169, (ic) (Object) var8);
                qi discarded$18 = var8.a((byte) 118, 0).a(112, qe.a(15658734, 10066329, 7829367, 1)).a(1118481, false).b(-1, 113);
                qi discarded$19 = var8.a((byte) 118, 4).a(true, 19749).a(110, var5);
                ((rd) this).field_e = (t) (Object) var8;
                var9 = new qj[9];
                var10 = new qj[9];
                var9[4] = new qj(2, 1);
                var10[4] = new qj(1, 2);
                var9[4].field_z = new int[]{6710886, 7829367};
                var10[4].field_z = new int[]{6710886, 7829367};
                var11 = new gi();
                var12 = new gi();
                var11.a(0, var9, (byte) -33);
                var12.a(0, var10, (byte) -33);
                var13 = new qj(7, 4);
                var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, param0, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new gi(var4, true);
                var14.a(var13.b(), -112);
                var13.d();
                var14 = new gi(var4, true);
                var14.a(var13.b(), param0 ^ -13421731);
                var13.d();
                var14 = new gi(var4, true);
                var14.a(var13.b(), -116);
                var13.d();
                var19 = new gi(var4, true);
                var19.a(var13, -119);
                break L0;
              } else {
                var16.field_z[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("rd.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_s = null;
        field_o = null;
        field_l = null;
        field_i = null;
    }

    final static void a(jf param0, int param1, int param2) {
        la var3 = ra.field_C;
        var3.c(7, 7);
        var3.a(param0.field_m, (byte) -89);
        try {
            var3.a(param0.field_k, (byte) -114);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "rd.E(" + (param0 != null ? "{...}" : "null") + ',' + 4 + ',' + 7 + ')');
        }
    }

    public rd() {
        ((rd) this).field_r = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{1, 2, 3, 5, 2, 3, 5, 10, 1, 2, 3, 5, 3};
        field_o = new bl("email");
        field_s = new int[8192];
        field_i = "Discard";
    }
}
