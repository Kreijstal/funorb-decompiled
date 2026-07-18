/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends hl {
    static hg field_v;
    private ai field_s;
    static int field_t;
    private ai[] field_y;
    static sb field_w;
    static of field_u;
    static String field_z;
    static ci field_x;

    final void a(km param0, int param1) {
        ai[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ai var5 = null;
        int var6 = 0;
        ai[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            var7 = ((nj) this).field_y;
            var3 = var7;
            if (param1 == -4755) {
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 != null) {
                      var5.field_k = param0;
                      var4++;
                      break L2;
                    } else {
                      var4++;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("nj.K(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        RuntimeException var6 = null;
        ai var7 = null;
        ai var9 = null;
        fb var10 = null;
        ai var11 = null;
        ai var12 = null;
        ai var13 = null;
        ai var14 = null;
        mf stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof fb) {
                stackOut_2_0 = (mf) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (mf) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (fb) (Object) stackIn_3_0;
              cf.b(param4.field_C + (param4.field_r + param2), param4.field_y + (param1 + param4.field_u), param4.field_r + param2, 80, param4.field_u + param1);
              if (var10 == null) {
                break L2;
              } else {
                param3 = param3 & var10.field_H;
                break L2;
              }
            }
            L3: {
              var7 = ((nj) this).field_y[0];
              ((nj) this).field_s.a((byte) 102);
              var7.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  if (!var10.field_I) {
                    break L4;
                  } else {
                    var11 = ((nj) this).field_y[1];
                    if (var11 == null) {
                      break L4;
                    } else {
                      var11.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                      break L4;
                    }
                  }
                }
                if (var10.field_w) {
                  L5: {
                    var12 = ((nj) this).field_y[3];
                    if (var10.field_q == 0) {
                      break L5;
                    } else {
                      if (var12 == null) {
                        break L5;
                      } else {
                        var12.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                        break L3;
                      }
                    }
                  }
                  var9 = ((nj) this).field_y[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (param4.d((byte) -67)) {
                var13 = ((nj) this).field_y[5];
                if (var13 != null) {
                  var13.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            if (param0 >= 58) {
              L7: {
                if (param3) {
                  break L7;
                } else {
                  var14 = ((nj) this).field_y[4];
                  if (var14 == null) {
                    break L7;
                  } else {
                    var14.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    break L7;
                  }
                }
              }
              ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
              int discarded$1 = 28773;
              fd.a();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("nj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    final static int b() {
        return bd.field_d;
    }

    final static void a(byte param0, p param1) {
        int var2_int = 0;
        try {
            jb.field_b = param1.f(674914976) << 5;
            var2_int = param1.i(-93);
            jb.field_b = jb.field_b + (var2_int >> 3);
            l.field_o = (7 & var2_int) << 18;
            l.field_o = l.field_o + (param1.f(674914976) << 2);
            var2_int = param1.i(-96);
            gm.field_c = 2064384 & var2_int << 15;
            l.field_o = l.field_o + (var2_int >> 6);
            gm.field_c = gm.field_c + (param1.i(-106) << 7);
            var2_int = param1.i(-120);
            sl.field_e = var2_int << 16 & 65536;
            gm.field_c = gm.field_c + (var2_int >> 1);
            sl.field_e = sl.field_e + param1.f(674914976);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "nj.N(" + 20 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public nj() {
        ((nj) this).field_y = new ai[6];
        ((nj) this).field_s = new ai();
        ai dupTemp$0 = new ai();
        ((nj) this).field_y[0] = dupTemp$0;
        ai var1 = dupTemp$0;
        var1.a((byte) 102);
    }

    final static void a(int param0, String param1, float param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          ka.field_o = param2;
          ih.field_T = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("nj.A(").append(-20).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ')');
        }
    }

    public static void c() {
        field_z = null;
        field_v = null;
        field_w = null;
        field_u = null;
        field_x = null;
    }

    nj(nj param0, boolean param1) {
        this();
        try {
            param0.a(param1, (byte) 110, (nj) this);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "nj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, km[] param1) {
        ai[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ai var5 = null;
        int var6 = 0;
        ai[] var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            var7 = ((nj) this).field_y;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                L2: {
                  if (param0 == -6) {
                    break L2;
                  } else {
                    field_z = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    var4++;
                    var4++;
                    break L3;
                  } else {
                    var5.field_e = param1;
                    var4++;
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
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("nj.H(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static void a(km[] param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          bl.field_d = new le(param0);
          tn.field_m = param3;
          tm.field_d = param2;
          bi.a(115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("nj.J(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -17 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            qi.field_o.field_db = param1;
            fm.field_V = true;
            var2_int = ph.field_j.field_e;
            var3 = ph.field_j.field_i;
            var4 = qi.field_o.field_xb.b(param1, 272, qi.field_o.field_K);
            var5 = -(var4 / 2) + 7 + (var3 / 2 - 110);
            la.field_c.a((-320 + var2_int) / 2, 320, -2147483648, -(var5 * 2) + var3 - 120, var5);
            la.field_c.field_Ab = wh.a(-82, la.field_c.field_pb, 3, 11579568, 8421504, 2105376);
            qi.field_o.a(24, -24 + la.field_c.field_M + -24, -2147483648, -20 + la.field_c.field_pb - 24, 16);
            of.field_i.a(120, 80, -2147483648, 24, la.field_c.field_pb - 44);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "nj.L(" + -101 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, String param4, int param5, String param6) {
        vg var7 = null;
        RuntimeException var7_ref = null;
        vg var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var7 = new vg(param1);
            var8 = new vg(param4);
            stackOut_0_0 = da.a(param2, var7, param6, var8, param5, (byte) -70, param3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("nj.B(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0, int param1, km[] param2) {
        int var4_int = param1;
        if (param0 != -32) {
            return;
        }
        try {
            if (((nj) this).field_y[var4_int] == null) {
                ((nj) this).field_y[var4_int] = new ai();
            }
            ((nj) this).field_y[param1].field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "nj.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, byte param1, nj param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ai var5 = null;
        ai var6 = null;
        int var7 = 0;
        ai stackIn_9_0 = null;
        ai stackIn_10_0 = null;
        ai stackIn_11_0 = null;
        ai stackIn_11_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ai stackOut_8_0 = null;
        ai stackOut_10_0 = null;
        ai stackOut_10_1 = null;
        ai stackOut_9_0 = null;
        ai stackOut_9_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            super.a((hl) (Object) param2, -1053);
            if (!param0) {
              ne.a((Object[]) (Object) ((nj) this).field_y, 0, (Object[]) (Object) param2.field_y, 0, 6);
              return;
            } else {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= 6) {
                  break L0;
                } else {
                  L2: {
                    var5 = ((nj) this).field_y[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (var5 != null) {
                      L3: {
                        var6 = param2.field_y[var4_int];
                        stackOut_8_0 = (ai) var5;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var6 != null) {
                          stackOut_10_0 = (ai) (Object) stackIn_10_0;
                          stackOut_10_1 = (ai) var6;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          break L3;
                        } else {
                          ai dupTemp$33 = new ai();
                          param2.field_y[var4_int] = dupTemp$33;
                          stackOut_9_0 = (ai) (Object) stackIn_9_0;
                          stackOut_9_1 = (ai) dupTemp$33;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          break L3;
                        }
                      }
                      ((ai) (Object) stackIn_11_0).a(stackIn_11_1, (byte) -103);
                      var4_int++;
                      break L2;
                    } else {
                      param2.field_y[var4_int] = null;
                      var4_int++;
                      break L2;
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("nj.M(").append(param0).append(',').append(110).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final ai a(int param0, int param1) {
        if (param0 <= 59) {
          field_u = null;
          ai dupTemp$4 = new ai();
          ((nj) this).field_y[param1] = dupTemp$4;
          return dupTemp$4;
        } else {
          ai dupTemp$5 = new ai();
          ((nj) this).field_y[param1] = dupTemp$5;
          return dupTemp$5;
        }
    }

    final static void a(boolean param0, int param1, String param2, boolean param3) {
        bo.a((byte) 123);
        jh.field_e.i(0);
        um.field_b = new wf(pi.field_a, (String) null, dk.field_g, param0, param3);
        try {
            field_w = new sb(jh.field_e, (mf) (Object) um.field_b);
            jh.field_e.b((mf) (Object) field_w, (byte) -75);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "nj.F(" + param0 + ',' + 2 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new hg(13, 0, 1, 0);
        field_u = new of(1);
        field_z = "Unfortunately you are not eligible to create an account.";
    }
}
