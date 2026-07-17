/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends jm {
    static kc field_z;
    private vc[] field_q;
    static String field_x;
    static int field_r;
    static kc field_s;
    static String field_v;
    private vc field_t;
    static db field_u;
    static boolean field_w;
    static String field_y;
    static int field_p;

    mj(mj param0, boolean param1) {
        this();
        try {
            int discarded$0 = 126;
            param0.a(param1, (mj) this);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, qb param1) {
        vc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        vc var5 = null;
        int var6 = 0;
        vc[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7 = ((mj) this).field_q;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_d = param1;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("mj.AA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(byte param0, int param1, qb[] param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (!(null != ((mj) this).field_q[var4_int])) {
                ((mj) this).field_q[var4_int] = new vc();
            }
            int var5 = -59 / ((28 - param0) / 32);
            ((mj) this).field_q[param1].field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mj.EA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        tm.field_d.a(param1, true);
        if (param0 != -6578) {
            mj.a(-82, true);
        }
    }

    public static void a() {
        int var1 = 0;
        field_z = null;
        field_v = null;
        field_x = null;
        field_y = null;
        field_s = null;
        field_u = null;
    }

    final void a(qb[] param0, int param1) {
        vc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        vc var5 = null;
        int var6 = 0;
        vc[] var7 = null;
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7 = ((mj) this).field_q;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (param1 == -23165) {
                  break L0;
                } else {
                  ((mj) this).field_t = null;
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    var4++;
                    var4++;
                    break L2;
                  } else {
                    var5.field_b = param0;
                    var4++;
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("mj.GA(");
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
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    final static int a(int param0, byte param1, byte[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        try {
          L0: {
            var3_int = -110 % ((54 - param1) / 44);
            stackOut_0_0 = db.a(param0, false, param2, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("mj.W(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final vc a(byte param0, int param1) {
        if (param0 >= -21) {
          field_s = null;
          vc dupTemp$4 = new vc();
          ((mj) this).field_q[param1] = dupTemp$4;
          return dupTemp$4;
        } else {
          vc dupTemp$5 = new vc();
          ((mj) this).field_q[param1] = dupTemp$5;
          return dupTemp$5;
        }
    }

    private final void a(boolean param0, mj param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        vc var5 = null;
        vc var6 = null;
        int var7 = 0;
        vc stackIn_10_0 = null;
        vc stackIn_11_0 = null;
        vc stackIn_12_0 = null;
        vc stackIn_12_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc stackOut_9_0 = null;
        vc stackOut_11_0 = null;
        vc stackOut_11_1 = null;
        vc stackOut_10_0 = null;
        vc stackOut_10_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            super.a((jm) (Object) param1, 1881);
            if (param0) {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= 6) {
                  break L0;
                } else {
                  L2: {
                    var5 = ((mj) this).field_q[var4_int];
                    if (var5 != null) {
                      L3: {
                        var6 = param1.field_q[var4_int];
                        stackOut_9_0 = (vc) var5;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var6 == null) {
                          vc dupTemp$25 = new vc();
                          param1.field_q[var4_int] = dupTemp$25;
                          stackOut_11_0 = (vc) (Object) stackIn_11_0;
                          stackOut_11_1 = (vc) dupTemp$25;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          break L3;
                        } else {
                          stackOut_10_0 = (vc) (Object) stackIn_10_0;
                          stackOut_10_1 = (vc) var6;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          break L3;
                        }
                      }
                      ((vc) (Object) stackIn_12_0).a(stackIn_12_1, false);
                      var4_int++;
                      break L2;
                    } else {
                      param1.field_q[var4_int] = null;
                      var4_int++;
                      break L2;
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              sf.a((Object[]) (Object) ((mj) this).field_q, 0, (Object[]) (Object) param1.field_q, 0, 6);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("mj.CA(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 126 + 41);
        }
    }

    public mj() {
        ((mj) this).field_q = new vc[6];
        ((mj) this).field_t = new vc();
        vc dupTemp$0 = new vc();
        ((mj) this).field_q[0] = dupTemp$0;
        vc var1 = dupTemp$0;
        var1.a(-17238);
    }

    final static void a(int param0, cg param1, int param2, int param3, dn param4, int param5, int param6) {
        ne var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        try {
          ArcanistsMulti.a(-26335, (int[]) null, param4, param1.field_Tb, param1.field_Nb, -1, -1, param1.field_Qb, (kc) (Object) param1);
          eo.field_c.a((byte) 72, true);
          eo.field_c.a(0, (int[]) null, 13);
          eo.field_c.d(5552);
          var7 = eo.field_c;
          var8 = param3;
          var9 = param6;
          var10 = 0;
          var11 = 0;
          var7.field_l.a(var10, var11, -29466, var9, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("mj.DA(").append(0).append(44);
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
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(3).append(44).append(param3).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 44 + param6 + 41);
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        vc var7 = null;
        vc var9 = null;
        Object var10 = null;
        ag var11 = null;
        vc var12 = null;
        vc var13 = null;
        vc var14 = null;
        vc var15 = null;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof ag)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (qm) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (qm) param0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (ag) (Object) stackIn_3_0;
              if (param1 == 5592405) {
                break L2;
              } else {
                var10 = null;
                ((mj) this).a((byte) 33, 29, (qb[]) null);
                break L2;
              }
            }
            L3: {
              da.a(param0.field_v + param0.field_n + param2, param0.field_j + param3 - -param0.field_k, 127, param0.field_n + param2, param3 + param0.field_j);
              if (var11 != null) {
                param4 = param4 & var11.field_B;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = ((mj) this).field_q[0];
              ((mj) this).field_t.a(-17238);
              var7.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
              if (var11 == null) {
                break L4;
              } else {
                L5: {
                  if (!var11.field_z) {
                    break L5;
                  } else {
                    var12 = ((mj) this).field_q[1];
                    if (var12 == null) {
                      break L5;
                    } else {
                      var12.a(param0, param3, ((mj) this).field_t, (mj) this, param1 ^ -2141891243, param2);
                      break L5;
                    }
                  }
                }
                if (!var11.field_w) {
                  break L4;
                } else {
                  L6: {
                    var13 = ((mj) this).field_q[3];
                    if (var11.field_t == 0) {
                      break L6;
                    } else {
                      if (var13 != null) {
                        var13.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = ((mj) this).field_q[2];
                  if (var9 == null) {
                    break L4;
                  } else {
                    var9.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                    break L4;
                  }
                }
              }
            }
            L7: {
              if (!param0.d(-2116)) {
                break L7;
              } else {
                var14 = ((mj) this).field_q[5];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                  break L7;
                }
              }
            }
            L8: {
              if (param4) {
                break L8;
              } else {
                var15 = ((mj) this).field_q[4];
                if (var15 == null) {
                  break L8;
                } else {
                  var15.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                  break L8;
                }
              }
            }
            ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
            oo.c(-15405);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("mj.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Rechargeable spell";
        field_v = "Loading sound effects";
        field_u = new db();
        field_p = -1;
        field_y = "Win %";
    }
}
