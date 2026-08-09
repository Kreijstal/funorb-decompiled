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
            param0.a(param1, (mj) (this), 126);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, qb param1) {
        vc[] var3 = null;
        int var4 = 0;
        vc var5 = null;
        int var6 = 0;
        vc[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7 = this.field_q;
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
                    break L2;
                  } else {
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
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("mj.AA(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void a(byte param0, int param1, qb[] param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (!(null != this.field_q[var4_int])) {
                this.field_q[var4_int] = new vc();
            }
            int var5 = -59 / ((28 - param0) / 32);
            this.field_q[param1].field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mj.EA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        tm.field_d.a(param1, true);
        if (param0 != -6578) {
            mj.a(-82, true);
        }
    }

    public static void a(byte param0) {
        int var1 = -101 % ((16 - param0) / 59);
        field_z = null;
        field_v = null;
        field_x = null;
        field_y = null;
        field_s = null;
        field_u = null;
    }

    final void a(qb[] param0, int param1) {
        vc[] var3 = null;
        int var4 = 0;
        vc var5 = null;
        int var6 = 0;
        vc[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7 = this.field_q;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var7.length <= var4) {
                if (param1 == -23165) {
                  break L0;
                } else {
                  this.field_t = (vc) null;
                  return;
                }
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    var5.field_b = param0;
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
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("mj.GA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte param1, byte[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -110 % ((54 - param1) / 44);
            stackIn_1_0 = db.a(param0, false, param2, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("mj.W(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final vc a(byte param0, int param1) {
        vc dupTemp$2 = null;
        vc dupTemp$3 = null;
        if (param0 >= -21) {
          field_s = (kc) null;
          dupTemp$2 = new vc();
          this.field_q[param1] = dupTemp$2;
          return dupTemp$2;
        } else {
          dupTemp$3 = new vc();
          this.field_q[param1] = dupTemp$3;
          return dupTemp$3;
        }
    }

    private final void a(boolean param0, mj param1, int param2) {
        vc dupTemp$2 = null;
        int var4_int = 0;
        vc var5 = null;
        vc var6 = null;
        int var7 = 0;
        vc stackIn_11_0 = null;
        vc stackIn_12_0 = null;
        vc stackIn_12_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param1, 1881);
            if (param2 >= 113) {
              if (param0) {
                var4_int = 0;
                L1: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var5 = this.field_q[var4_int];
                      if (var5 != null) {
                        L3: {
                          var6 = param1.field_q[var4_int];
                          stackIn_11_0 = (vc) (var5);

                          if (var6 == null) {
                            dupTemp$2 = new vc();
                            param1.field_q[var4_int] = dupTemp$2;
                            stackIn_12_0 = (vc) ((Object) stackIn_11_0);
                            stackIn_12_1 = (vc) (dupTemp$2);
                            break L3;
                          } else {
                            stackIn_12_0 = (vc) ((Object) stackIn_11_0);
                            stackIn_12_1 = (vc) (var6);
                            break L3;
                          }
                        }
                        ((vc) (Object) stackIn_12_0).a(stackIn_12_1, false);
                        break L2;
                      } else {
                        param1.field_q[var4_int] = null;
                        break L2;
                      }
                    }
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                sf.a(this.field_q, 0, param1.field_q, 0, 6);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("mj.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public mj() {
        this.field_q = new vc[6];
        this.field_t = new vc();
        vc dupTemp$0 = new vc();
        this.field_q[0] = dupTemp$0;
        vc var1 = dupTemp$0;
        var1.a(-17238);
    }

    final static void a(int param0, cg param1, int param2, int param3, dn param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ne var12 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ArcanistsMulti.a(param2 ^ -26334, (int[]) null, param4, param1.field_Tb, param1.field_Nb, -1, -1, param1.field_Qb, param1);
            eo.field_c.a((byte) 72, true);
            eo.field_c.a(0, (int[]) null, 13);
            eo.field_c.d(param2 + 5549);
            var12 = eo.field_c;
            var8 = param3;
            var9 = param6;
            var10 = param0;
            var11 = param5;
            var12.field_l.a(var10, var11, -29466, var9, var8);
            if (param2 == 3) {
              break L0;
            } else {
              mj.a((byte) -95);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("mj.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        qm stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        vc var7 = null;
        vc var9 = null;
        qb[] var10 = null;
        ag var11 = null;
        vc var12 = null;
        vc var13 = null;
        vc var14 = null;
        vc var15 = null;
        try {
          L0: {
            L1: {
              if (!(param0 instanceof ag)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (qm) (param0);
                break L1;
              }
            }
            L2: {
              var11 = (ag) ((Object) stackIn_3_0);
              if (param1 == 5592405) {
                break L2;
              } else {
                var10 = (qb[]) null;
                this.a((byte) 33, 29, (qb[]) null);
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
              var7 = this.field_q[0];
              this.field_t.a(-17238);
              var7.a(param0, param3, this.field_t, (mj) (this), -2147483648, param2);
              if (var11 == null) {
                break L4;
              } else {
                L5: {
                  if (!var11.field_z) {
                    break L5;
                  } else {
                    var12 = this.field_q[1];
                    if (var12 == null) {
                      break L5;
                    } else {
                      var12.a(param0, param3, this.field_t, (mj) (this), param1 ^ -2141891243, param2);
                      break L5;
                    }
                  }
                }
                if (!var11.field_w) {
                  break L4;
                } else {
                  L6: {
                    var13 = this.field_q[3];
                    if (var11.field_t == 0) {
                      break L6;
                    } else {
                      if (var13 != null) {
                        var13.a(param0, param3, this.field_t, (mj) (this), param1 + 2141891243, param2);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = this.field_q[2];
                  if (var9 == null) {
                    break L4;
                  } else {
                    var9.a(param0, param3, this.field_t, (mj) (this), -2147483648, param2);
                    break L4;
                  }
                }
              }
            }
            L7: {
              if (!param0.d(-2116)) {
                break L7;
              } else {
                var14 = this.field_q[5];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param0, param3, this.field_t, (mj) (this), -2147483648, param2);
                  break L7;
                }
              }
            }
            L8: {
              if (param4) {
                break L8;
              } else {
                var15 = this.field_q[4];
                if (var15 == null) {
                  break L8;
                } else {
                  var15.a(param0, param3, this.field_t, (mj) (this), param1 + 2141891243, param2);
                  break L8;
                }
              }
            }
            this.field_t.a(param3, (mj) (this), (byte) 110, param0, param2);
            oo.c(-15405);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var6);

            stackIn_29_1 = new StringBuilder().append("mj.A(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_x = "Rechargeable spell";
        field_v = "Loading sound effects";
        field_u = new db();
        field_p = -1;
        field_y = "Win %";
    }
}
