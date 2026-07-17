/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends va {
    private e field_x;
    static String field_t;
    static String field_u;
    private e[] field_w;
    static mp field_v;

    final void a(byte param0, er param1) {
        e[] var7 = null;
        int var4 = 0;
        e var5_ref_e = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        try {
            var7 = ((mq) this).field_w;
            e[] var3 = var7;
            for (var4 = 0; var7.length > var4; var4++) {
                var5_ref_e = var7[var4];
                if (!(var5_ref_e == null)) {
                    var5_ref_e.field_h = param1;
                }
            }
            int var5 = -101 % ((-16 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "mq.GA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        RuntimeException decompiledCaughtException = null;
        var25 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = param1;
              var8 = param3 * param3;
              if (!param0) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var9 = param1 * param1;
                var10 = var9 << 1;
                var11 = var8 << 1;
                var12 = param1 << 1;
                var13 = var8 * (1 + -var12) + var10;
                var14 = var9 - (-1 + var12) * var11;
                var15 = var8 << 2;
                var16 = var9 << 2;
                var17 = var10 * (3 + (var6_int << 1));
                var18 = (-3 + (var7 << 1)) * var11;
                var19 = var16 * (1 + var6_int);
                var20 = var15 * (-1 + var7);
                if (ua.field_e > param4) {
                  break L3;
                } else {
                  if (~cj.field_D <= ~param4) {
                    var21 = pk.a((byte) -14, ib.field_a, param5 + param3, ap.field_e);
                    var22 = pk.a((byte) -14, ib.field_a, -param3 + param5, ap.field_e);
                    ki.a(-86, var22, vl.field_e[param4], var21, param2);
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              break L2;
            }
            L4: while (true) {
              if (var7 <= 0) {
                break L0;
              } else {
                L5: {
                  if (var13 >= 0) {
                    break L5;
                  } else {
                    L6: while (true) {
                      if (var13 >= 0) {
                        break L5;
                      } else {
                        var13 = var13 + var17;
                        var14 = var14 + var19;
                        var6_int++;
                        var19 = var19 + var16;
                        var17 = var17 + var16;
                        continue L6;
                      }
                    }
                  }
                }
                L7: {
                  if (var14 < 0) {
                    var14 = var14 + var19;
                    var13 = var13 + var17;
                    var17 = var17 + var16;
                    var19 = var19 + var16;
                    var6_int++;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var14 = var14 + -var18;
                  var13 = var13 + -var20;
                  var20 = var20 - var15;
                  var18 = var18 - var15;
                  var7--;
                  var21 = param4 + -var7;
                  var22 = param4 - -var7;
                  if (var22 < ua.field_e) {
                    break L8;
                  } else {
                    if (var21 <= cj.field_D) {
                      L9: {
                        var23 = pk.a((byte) -14, ib.field_a, param5 - -var6_int, ap.field_e);
                        var24 = pk.a((byte) -14, ib.field_a, param5 + -var6_int, ap.field_e);
                        if (ua.field_e <= var21) {
                          ki.a(-85, var24, vl.field_e[var21], var23, param2);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      if (cj.field_D < var22) {
                        break L8;
                      } else {
                        ki.a(-76, var24, vl.field_e[var22], var23, param2);
                        continue L4;
                      }
                    } else {
                      continue L4;
                    }
                  }
                }
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var6, "mq.IA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void b(boolean param0) {
        int var2 = 0;
        L0: {
          var2 = Vertigo2.field_L ? 1 : 0;
          if (!ln.field_d.field_i) {
            if ((ln.field_d.field_D.field_t & 1 << ln.field_d.field_B) == 0) {
              if (ln.field_d.field_D.field_t != 0) {
                sl.field_q[12] = en.field_c;
                break L0;
              } else {
                if ((1 << ln.field_d.field_B | ln.field_d.field_h) != -1 + (1 << ln.field_d.field_D.field_z)) {
                  sl.field_q[12] = fq.field_f;
                  break L0;
                } else {
                  sl.field_q[12] = ii.field_A;
                  break L0;
                }
              }
            } else {
              sl.field_q[12] = ho.field_a;
              break L0;
            }
          } else {
            if ((1 << ln.field_d.field_B & ln.field_d.field_D.field_t) != 0) {
              sl.field_q[12] = hi.field_p;
              break L0;
            } else {
              if (ln.field_d.field_D.field_t == 0) {
                if ((1 << ln.field_d.field_B | ln.field_d.field_h) == -1 + (1 << ln.field_d.field_D.field_z)) {
                  sl.field_q[12] = kd.field_B;
                  break L0;
                } else {
                  sl.field_q[12] = oq.field_H;
                  break L0;
                }
              } else {
                sl.field_q[12] = bh.field_H;
                break L0;
              }
            }
          }
        }
    }

    private final void a(byte param0, boolean param1, mq param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        e var5 = null;
        e var6 = null;
        int var7 = 0;
        e stackIn_8_0 = null;
        e stackIn_9_0 = null;
        e stackIn_10_0 = null;
        e stackIn_10_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_7_0 = null;
        e stackOut_9_0 = null;
        e stackOut_9_1 = null;
        e stackOut_8_0 = null;
        e stackOut_8_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 39) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            L2: {
              super.a(16777215, (va) (Object) param2);
              if (!param1) {
                qq.a((Object[]) (Object) ((mq) this).field_w, 0, (Object[]) (Object) param2.field_w, 0, 6);
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (6 <= var4_int) {
                    break L2;
                  } else {
                    L4: {
                      var5 = ((mq) this).field_w[var4_int];
                      if (var5 == null) {
                        param2.field_w[var4_int] = null;
                        break L4;
                      } else {
                        L5: {
                          var6 = param2.field_w[var4_int];
                          stackOut_7_0 = (e) var5;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (var6 != null) {
                            stackOut_9_0 = (e) (Object) stackIn_9_0;
                            stackOut_9_1 = (e) var6;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            break L5;
                          } else {
                            e dupTemp$13 = new e();
                            param2.field_w[var4_int] = dupTemp$13;
                            stackOut_8_0 = (e) (Object) stackIn_8_0;
                            stackOut_8_1 = (e) dupTemp$13;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            break L5;
                          }
                        }
                        ((e) (Object) stackIn_10_0).a(stackIn_10_1, 16777215);
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("mq.B(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static void c(int param0) {
        gk.field_a[44] = 71;
        gk.field_a[91] = 42;
        gk.field_a[59] = 57;
        gk.field_a[222] = 58;
        gk.field_a[520] = 59;
        gk.field_a[192] = 28;
        gk.field_a[92] = 74;
        gk.field_a[46] = 72;
        gk.field_a[45] = 26;
        gk.field_a[93] = 43;
        gk.field_a[47] = 73;
        gk.field_a[61] = 27;
        if (param0 != 1) {
            mq.c(-54);
        }
    }

    final static void a(java.math.BigInteger param0, ed param1, java.math.BigInteger param2, int param3, ed param4) {
        try {
            if (param3 != 12) {
                Object var6 = null;
                mq.a((java.math.BigInteger) null, (ed) null, (java.math.BigInteger) null, 66, (ed) null);
            }
            qp.a(param2, param0, param4.field_p, 0, param4.field_u, (byte) 63, param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "mq.MA(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, er[] param1, boolean param2) {
        int var4_int = 0;
        if (param2) {
            return;
        }
        try {
            var4_int = param0;
            if (((mq) this).field_w[var4_int] == null) {
                ((mq) this).field_w[var4_int] = new e();
            }
            ((mq) this).field_w[param0].field_m = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "mq.JA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(er[] param0, byte param1) {
        e[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        e var5 = null;
        int var6 = 0;
        e[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var7 = ((mq) this).field_w;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                L2: {
                  if (param1 >= 21) {
                    break L2;
                  } else {
                    field_t = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_m = param0;
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("mq.KA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    mq(mq param0, boolean param1) {
        this();
        try {
            param0.a((byte) 77, param1, (mq) this);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "mq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        RuntimeException var6 = null;
        e var7 = null;
        e var9 = null;
        d var10 = null;
        e var11 = null;
        e var12 = null;
        e var13 = null;
        e var14 = null;
        iq stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        iq stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof d) {
                stackOut_2_0 = (iq) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (iq) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (d) (Object) stackIn_3_0;
              jb.a(param3.field_t + param4, param3.field_o + param1 - -param3.field_n, param3.field_o + param1, -30486, param3.field_s + (param3.field_t + param4));
              if (var10 != null) {
                param0 = param0 & var10.field_F;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = ((mq) this).field_w[0];
              ((mq) this).field_x.a(-21151);
              var7.a((mq) this, param1, param3, -123, param4, ((mq) this).field_x);
              if (var10 != null) {
                L4: {
                  if (var10.field_G) {
                    var11 = ((mq) this).field_w[1];
                    if (var11 == null) {
                      break L4;
                    } else {
                      var11.a((mq) this, param1, param3, -73, param4, ((mq) this).field_x);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (!var10.field_p) {
                  break L3;
                } else {
                  L5: {
                    var12 = ((mq) this).field_w[3];
                    if (var10.field_A == 0) {
                      break L5;
                    } else {
                      if (var12 != null) {
                        var12.a((mq) this, param1, param3, -116, param4, ((mq) this).field_x);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = ((mq) this).field_w[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a((mq) this, param1, param3, -77, param4, ((mq) this).field_x);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param3.f(125)) {
                var13 = ((mq) this).field_w[5];
                if (var13 != null) {
                  var13.a((mq) this, param1, param3, -93, param4, ((mq) this).field_x);
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (param2) {
                break L7;
              } else {
                e discarded$1 = ((mq) this).a(-104, 1);
                break L7;
              }
            }
            L8: {
              if (!param0) {
                var14 = ((mq) this).field_w[4];
                if (var14 != null) {
                  var14.a((mq) this, param1, param3, -113, param4, ((mq) this).field_x);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            ((mq) this).field_x.a(param3, param1, 1, param4, (mq) this);
            ln.d(-28558);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("mq.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, mp param1, int param2, cc param3, int param4, int param5, int param6, int param7, int param8, mp param9, byte param10, int param11, int param12, int param13, int param14, cc param15, int param16, int param17, int param18, mp param19, int param20) {
        RuntimeException var21 = null;
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param10 > 14) {
                break L1;
              } else {
                mq.a(true, -13, -58, 72, 60, -124);
                break L1;
              }
            }
            nb.a(param11, param3, param15, (byte) -99);
            ar.a(param13, (byte) 77, param14, param5, param18);
            tn.a(param20, param8, 55);
            vd.a(param4, param9, 1516482162, param17, param12, param1);
            tr.a(param2, param0, param19, -25220);
            pb.a((byte) -26, param7, param16, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var21;
            stackOut_4_1 = new StringBuilder().append("mq.C(").append(param0).append(44);
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param9 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param10).append(44).append(param11).append(44).append(param12).append(44).append(param13).append(44).append(param14).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param15 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param16).append(44).append(param17).append(44).append(param18).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param19 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param20 + 41);
        }
    }

    final e a(int param0, int param1) {
        if (param1 != 6216) {
            field_v = null;
        }
        e dupTemp$0 = new e();
        ((mq) this).field_w[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public mq() {
        ((mq) this).field_w = new e[6];
        ((mq) this).field_x = new e();
        e dupTemp$0 = new e();
        ((mq) this).field_w[0] = dupTemp$0;
        e var1 = dupTemp$0;
        var1.a(-21151);
    }

    final static String a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_4_0 = new String(var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3[-var4 + var2_int - 1] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("mq.FA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 0 + 41);
        }
        return stackIn_5_0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_t = null;
        field_v = null;
        field_u = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Loading...";
        field_u = "Try changing the '<%0>' setting.";
    }
}
