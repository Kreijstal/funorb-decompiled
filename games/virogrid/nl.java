/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends aj {
    static int field_x;
    private jj[] field_w;
    static String field_v;
    private jj field_y;
    static int field_u;

    final void a(byte param0, mg param1) {
        jj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        jj var5 = null;
        int var6 = 0;
        Object var7 = null;
        jj[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var8 = ((nl) this).field_w;
            var3 = var8;
            var4 = 0;
            L1: while (true) {
              if (var8.length <= var4) {
                L2: {
                  if (param0 < -113) {
                    break L2;
                  } else {
                    var7 = null;
                    ((nl) this).a((byte) -103, (mg) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 != null) {
                    var5.field_c = param1;
                    break L3;
                  } else {
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("nl.A(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final void a(mg[] param0, int param1) {
        jj[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        jj var5 = null;
        int var6 = 0;
        Object var7 = null;
        jj[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var8 = ((nl) this).field_w;
            var3 = var8;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var8.length) {
                L2: {
                  if (param1 == 4) {
                    break L2;
                  } else {
                    var7 = null;
                    nl.a(38, (String[]) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 != null) {
                    var5.field_k = param0;
                    break L3;
                  } else {
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("nl.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void a(java.math.BigInteger param0, jc param1, jc param2, java.math.BigInteger param3) {
        try {
            int discarded$0 = 0;
            bl.a(0, param1.field_l, param0, param2, param1.field_g, param3);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "nl.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
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
            var2 = param0.getParameter("username");
            if (param1 == 17574) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var3 = (CharSequence) (Object) var2;
                  if (jc.a(var3, (byte) -126) == 0L) {
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("nl.H(");
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
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        jj var7 = null;
        jj var9 = null;
        tg var10 = null;
        jj var11 = null;
        jj var12 = null;
        jj var13 = null;
        jj var14 = null;
        fi stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        fi stackOut_1_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof tg)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (fi) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (fi) param1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (tg) (Object) stackIn_3_0;
              uk.a(param1.field_m + param3 + param1.field_u, 6, param0 + param1.field_l, param1.field_g + param0 + param1.field_l, param3 + param1.field_u);
              if (var10 != null) {
                param2 = param2 & var10.field_C;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = ((nl) this).field_w[0];
              ((nl) this).field_y.a(31749);
              var7.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (!var10.field_z) {
                    break L4;
                  } else {
                    var11 = ((nl) this).field_w[1];
                    if (var11 != null) {
                      var11.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!var10.field_p) {
                  break L3;
                } else {
                  L5: {
                    var12 = ((nl) this).field_w[3];
                    if (var10.field_i == 0) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
                        break L3;
                      }
                    }
                  }
                  var9 = ((nl) this).field_w[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (param1.f(true)) {
                var13 = ((nl) this).field_w[5];
                if (var13 != null) {
                  var13.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
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
                var14 = ((nl) this).field_w[4];
                if (var14 != null) {
                  var14.a(param3, (nl) this, (byte) -12, ((nl) this).field_y, param1, param0);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              ((nl) this).field_y.a(param1, param4 ^ -23296, (nl) this, param3, param0);
              if (param4 == -23294) {
                break L8;
              } else {
                ((nl) this).field_y = null;
                break L8;
              }
            }
            ai.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("nl.E(").append(param0).append(',');
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
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null == tk.field_b) {
                break L1;
              } else {
                tk.field_b.field_H.a(param1, (byte) 72);
                break L1;
              }
            }
            L2: {
              if (null != qi.field_c) {
                qi.field_c.field_F.a(param1, (byte) 56);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == -22063) {
                break L3;
              } else {
                var3 = null;
                nl.a((java.applet.Applet) null, 68);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("nl.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final void a(int param0, mg[] param1, byte param2) {
        int var4_int = 0;
        if (param2 >= -119) {
            return;
        }
        try {
            var4_int = param0;
            if (((nl) this).field_w[var4_int] == null) {
                ((nl) this).field_w[var4_int] = new jj();
            }
            ((nl) this).field_w[param0].field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "nl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final jj a(byte param0, int param1) {
        if (param0 < 77) {
            field_v = null;
        }
        jj dupTemp$0 = new jj();
        ((nl) this).field_w[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final static int b() {
        return (qe.field_m << 2) + (ca.field_D << 4) - -el.field_t;
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 < 119) {
            nl.c(46);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, boolean param11) {
        wc.field_g = null;
        int discarded$0 = 59;
        qk.b();
        int discarded$1 = 15;
        int discarded$2 = 11;
        int discarded$3 = 14;
        int discarded$4 = 0;
        int discarded$5 = 0;
        param0 = mc.a(13, param0);
        int discarded$6 = 16777215;
        ha.a(11, param10, param11, 104, true, 16777215, param8, param5, param0);
        eg.a(param8, -98, param10);
        ac.a(param8, -1, 0, param0);
    }

    public nl() {
        ((nl) this).field_w = new jj[6];
        ((nl) this).field_y = new jj();
        jj dupTemp$0 = new jj();
        ((nl) this).field_w[0] = dupTemp$0;
        jj var1 = dupTemp$0;
        var1.a(31749);
    }

    private final void a(int param0, boolean param1, nl param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        jj var5 = null;
        jj var6 = null;
        int var7 = 0;
        jj stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        jj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        jj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        jj stackIn_12_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        jj stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        jj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        jj stackOut_11_2 = null;
        jj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        jj stackOut_10_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(0, (aj) (Object) param2);
              if (param1) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((nl) this).field_w[var4_int];
                      if (var5 != null) {
                        L4: {
                          var6 = param2.field_w[var4_int];
                          stackOut_9_0 = (jj) var5;
                          stackOut_9_1 = 13598;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var6 == null) {
                            jj dupTemp$25 = new jj();
                            param2.field_w[var4_int] = dupTemp$25;
                            stackOut_11_0 = (jj) (Object) stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = (jj) dupTemp$25;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            break L4;
                          } else {
                            stackOut_10_0 = (jj) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = (jj) var6;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            break L4;
                          }
                        }
                        ((jj) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2);
                        break L3;
                      } else {
                        param2.field_w[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                ek.a((Object[]) (Object) ((nl) this).field_w, 0, (Object[]) (Object) param2.field_w, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("nl.C(").append(3).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    nl(nl param0, boolean param1) {
        this();
        try {
            param0.a(3, param1, (nl) this);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "nl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_u = 0;
    }
}
