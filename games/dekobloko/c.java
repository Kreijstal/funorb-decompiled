/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    int field_q;
    static ck field_i;
    int field_h;
    private boolean field_e;
    int field_o;
    mm field_p;
    int field_c;
    static vj field_r;
    gl field_b;
    int field_d;
    int field_n;
    gl field_l;
    int field_f;
    gl field_g;
    gl field_a;
    gl field_k;
    private int field_j;
    static ck[] field_m;

    public static void a(int param0) {
        field_m = null;
        if (param0 != 23302) {
            return;
        }
        field_r = null;
        field_i = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        hk.a(param6, param1, param3, param4, param5, param2);
        int var8 = -40 / ((param0 - -68) / 42);
    }

    final static void a(byte param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!fd.field_d.startsWith("win")) {
                    break L1;
                  } else {
                    if (fc.a((byte) -19, param1)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L2: {
                    param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    if (param0 > 72) {
                      break L2;
                    } else {
                      field_m = (ck[]) null;
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  qb.a((Throwable) null, 16408, "MGR1: " + param1);
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var4_ref);

                stackIn_11_1 = new StringBuilder().append("c.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, mm param1) {
        al discarded$3 = null;
        qj discarded$4 = null;
        ck dupTemp$5 = null;
        RuntimeException runtimeException = null;
        bc var4 = null;
        ck[] var5 = null;
        bc var6 = null;
        int var7_int = 0;
        bc var7 = null;
        bc var8 = null;
        ck[] var9 = null;
        ck[] var10 = null;
        bc var11 = null;
        bc var12 = null;
        ck var13 = null;
        bc var14 = null;
        int var15 = 0;
        ld var16 = null;
        a var17 = null;
        ld var18 = null;
        bc var19 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var17 = new a(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_K + param1.field_R);
                        var17.field_q = 16777215;
                        this.field_k = (gl) ((Object) var17);
                        var4 = new bc();
                        var17.a(-12253, var4);
                        var4.field_c = 11711154;
                        var4.field_v = 15658734;
                        this.field_h = 3;
                        this.field_p = param1;
                        this.field_j = 15658734;
                        this.field_n = -1;
                        this.field_c = 3;
                        this.field_f = 5592405;
                        this.field_o = 15658734;
                        this.field_d = 3;
                        this.field_q = 3;
                        var4.a(0, 117).a(15658734, (byte) 106).a(120, fl.a(7829367, 8947848, 10066329, 32140));
                        var4.a(1, param0 ^ 13421780).a(-50, fl.a(13421772, 11184810, 10066329, 32140));
                        var4.a(3, 101).a(121, fl.a(10066329, 8947848, 7829367, 32140)).c(-1, 1).a(1, -2147483648);
                        var5 = new ck[9];
                        var16 = new ld(32, 32);
                        var18 = var16;
                        var7_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var18.field_D.length <= var7_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var16.field_D[var7_int] = 1077952576;
                        var7_int++;
                        if (var15 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5[4] = (ck) ((Object) var16);
                        var4.a(4, 25).a(param0 + -13438370, true).a(113, var5);
                        var4.a(5, 44).a(param0 ^ 13421739, ta.a(false, 0, 65793, 0, 0)).a(param0 + -13438370, true).a(-1, (byte) 106);
                        this.field_b = (gl) ((Object) var4);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = new bc(var4, true);
                        var6.field_f = 0;
                        var7 = new bc(var4, true);
                        var7.field_f = 0;
                        var7.a(qm.a(9, 8947848), false);
                        var7.a(1, 95).a(-128, qm.a(9, 11184810)).a(2236962, (byte) 106);
                        this.field_a = (gl) ((Object) new kk(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
                        discarded$3 = new al(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                        discarded$4 = new qj(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                        var8 = new bc();
                        var17.a(-12253, var8);
                        var8.a(0, 78).a(param0 ^ -13421740, fl.a(10066329, 15658734, 7829367, param0 + -13389632)).a(1118481, (byte) 106).b(-83, -1);
                        var8.a(4, param0 ^ 13421812).a(-16598, true).a(-27, var5);
                        this.field_l = (gl) ((Object) var8);
                        var9 = new ck[9];
                        var9[4] = new ck(2, 1);
                        var10 = new ck[9];
                        var10[4] = new ck(1, 2);
                        dupTemp$5 = var9[4];
                        dupTemp$5.field_D = new int[]{6710886, 7829367};
                        var10[4].field_D = new int[]{6710886, 7829367};
                        var11 = new bc();
                        var12 = new bc();
                        var11.a(119, var9, 0);
                        var12.a(param0 ^ 13421750, var10, 0);
                        var13 = new ck(7, 4);
                        var13.field_D = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, param0, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                        var14 = new bc(var4, true);
                        var14.a(var13.c(), 2);
                        var13.d();
                        var14 = new bc(var4, true);
                        var14.a(var13.c(), 2);
                        var13.d();
                        var14 = new bc(var4, true);
                        var14.a(var13.c(), 2);
                        var13.d();
                        var19 = new bc(var4, true);
                        var19.a(var13, 2);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (runtimeException);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("c.G(").append(param0).append(',');
                    stackIn_10_1 = stackIn_11_1;
                    if (param1 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            if (param0 >= 50) {
              L1: {
                var5_int = this.field_p.a(param1);
                var6 = this.field_p.field_K + this.field_p.field_C;
                var7 = param2;
                if (hk.field_j < var7 + (var5_int - -6)) {
                  var7 = -var5_int + (hk.field_j + -6);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var8 = 32 + (-this.field_p.field_C + param3);
                if (hk.field_i >= var8 - (-var6 + -6)) {
                  break L2;
                } else {
                  var8 = -6 + hk.field_i - var6;
                  break L2;
                }
              }
              hk.f(var7, var8, var5_int + 6, 6 + var6, this.field_j);
              hk.a(1 + var7, var8 - -1, var5_int - -4, 4 + var6, this.field_f);
              this.field_p.a(param1, var7 + 3, var8 - (-3 + -this.field_p.field_C), this.field_j, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("c.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 111 % ((param4 - -23) / 54);
        hk.b(param2, param1, param0, param5, param3);
    }

    private final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_c + this.field_d;
              var6 = this.field_h + this.field_q;
              var7 = this.field_n;
              if (var7 == -1) {
                var7 = this.field_p.field_K + this.field_p.field_R;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == 16521) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var8 = hk.field_j >> 631180802;
                      var9 = this.field_p.a(param2);
                      var10 = this.field_p.field_R + this.field_p.field_K;
                      var11 = 1;
                      if (var9 > var8) {
                        break L5;
                      } else {
                        if (-1 == param2.indexOf("<br>")) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var8 < var9) {
                          break L7;
                        } else {
                          var12 = var8;
                          if (var15 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = var9 / var8;
                      var12 = var8 + 2 * ((-1 + (var9 % var8 - -var13)) / var13);
                      break L6;
                    }
                    L8: {
                      if (el.field_L == null) {
                        el.field_L = new String[16];
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var11 = this.field_p.a(param2, new int[]{var12}, el.field_L);
                    var10 = var10 + (-1 + var11) * var7;
                    var9 = 0;
                    var13 = 0;
                    L9: while (true) {
                      if (var11 <= var13) {
                        break L4;
                      } else {
                        var14 = this.field_p.a(el.field_L[var13]);
                        var17 = var9 ^ -1;
                        var16 = var14 ^ -1;
                        if (var15 != 0) {
                          if (var16 > var17) {
                            break L3;
                          } else {
                            break L2;
                          }
                        } else {
                          L10: {
                            if (var16 >= var17) {
                              break L10;
                            } else {
                              var9 = var14;
                              break L10;
                            }
                          }
                          var13++;
                          if (var15 == 0) {
                            continue L9;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var12 = param0;
                  if (var5_int + var12 + var9 > hk.field_j) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
                var12 = hk.field_j + (-var9 + -var5_int);
                break L2;
              }
              L11: {
                var13 = 32 + param3 + -this.field_p.field_C;
                if (hk.field_i >= var13 - (-var10 + -var6)) {
                  break L11;
                } else {
                  var13 = -var6 + (param3 - var10);
                  break L11;
                }
              }
              hk.f(var12, var13, var5_int + var9, var10 - -var6, this.field_o);
              hk.a(1 + var12, 1 + var13, var5_int + (var9 - 2), var10 - (-var6 + 2), this.field_f);
              this.field_p.a(param2, this.field_c + var12, this.field_q + var13, var9, var10, this.field_j, -1, 0, 0, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("c.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public c() {
        this.field_e = true;
    }

    final void a(String param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_e) {
                  break L2;
                } else {
                  this.a(param3, 16521, param0, param2);
                  if (!client.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.a(param1 ^ -55, param0, param3, param2);
              break L1;
            }
            if (param1 == -1) {
              break L0;
            } else {
              this.a(124, 123, -118, 6, (byte) -71, 127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("c.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_r = new vj();
    }
}
