/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wa extends n implements sg {
    static String field_qb;
    private eg field_yb;
    static boolean[] field_pb;
    static ge field_xb;
    static int[] field_rb;
    static int[] field_sb;
    private boolean field_ub;
    private boolean field_ob;
    private boolean field_wb;
    private ek field_vb;
    private boolean field_tb;

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 > 9) {
              if (param0 == 13) {
                this.o(77);
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_8_0 = super.a(param0, param1, (byte) 80, param3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("wa.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final void o(int param0) {
        if (this.field_K) {
          this.field_K = false;
          if (param0 == 77) {
            if (!this.field_tb) {
              if (this.field_ob) {
                al.c(false);
                return;
              } else {
                return;
              }
            } else {
              n.g((byte) -118);
              return;
            }
          } else {
            this.field_wb = true;
            if (!this.field_tb) {
              if (!this.field_ob) {
                return;
              } else {
                al.c(false);
                return;
              }
            } else {
              n.g((byte) -118);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void m(int param0) {
        sj var2;
        ng var3;
        this.field_vb.b(23927, 2121792, 4210752);
        var2 = new sj((wa) (this), this.field_yb, bk.field_n);
        var2.a(15, param0 + 2070, kj.field_E);
        if (param0 != 13) {
          var3 = (ng) null;
          this.a((ng) null, -19, -53, 4, true);
          this.c(0, var2);
          return;
        } else {
          this.c(0, var2);
          return;
        }
    }

    public void a(ng param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        ng var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param4) {
              break L0;
            } else {
              var7 = (ng) null;
              this.a((ng) null, -14, -19, -46, true);
              break L0;
            }
          }
          if (this.field_wb) {
            fk.a(true, 3);
            this.o(77);
            return;
          } else {
            ob.a("tochangedisplayname.ws", gi.b(12476), (byte) 43);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("wa.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void n(int param0) {
        int var1 = -93 / ((param0 - -20) / 44);
        field_pb = null;
        field_qb = null;
        field_xb = null;
        field_sb = null;
        field_rb = null;
    }

    final void a(boolean param0, String param1, int param2) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        sj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        sj stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        String stackIn_15_3;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        sj var6 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.field_ub) {
              L1: {
                stackIn_5_0 = this;

                if (!param0) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((wa) (this)).field_ub = stackIn_6_1 != 0;
                stackIn_8_0 = this;

                if (256 != param2) {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              L3: {
                ((wa) (this)).field_wb = stackIn_9_1 != 0;
                this.field_vb.b(23927, 8405024, 4210752);
                var6 = new sj((wa) (this), this.field_yb, param1);
                var4 = var6;
                if (param2 == 5) {
                  var6.a(11, 2083, te.field_c);
                  var6.a(17, 2083, ph.field_f);
                  break L3;
                } else {
                  if (-257 != (param2 ^ -1)) {
                    L4: {
                      stackIn_14_0 = (sj) (var6);

                      stackIn_14_1 = -1;

                      stackIn_14_2 = 2083;

                      if (this.field_tb) {
                        stackIn_15_0 = (sj) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = qb.field_e;
                        break L4;
                      } else {
                        stackIn_15_0 = (sj) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = b.field_R;
                        break L4;
                      }
                    }
                    ((sj) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3);
                    break L3;
                  } else {
                    var6.a((byte) 46, (gg) (this), qb.field_e);
                    break L3;
                  }
                }
              }
              L5: {
                if (param2 != 3) {
                  if (-5 != (param2 ^ -1)) {
                    if (-7 == (param2 ^ -1)) {
                      var6.a(9, 2083, qc.field_b);
                      break L5;
                    } else {
                      if (-10 != (param2 ^ -1)) {
                        break L5;
                      } else {
                        var6.a((byte) 46, (gg) (this), vj.field_e);
                        break L5;
                      }
                    }
                  } else {
                    var6.a(8, 2083, le.field_d);
                    break L5;
                  }
                } else {
                  var6.a(7, 2083, aj.field_a);
                  break L5;
                }
              }
              this.c(0, var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("wa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    wa(si param0, eg param1, String param2, boolean param3, boolean param4) {
        super(param0, new sj((wa) null, param1, param2), 77, 10, 10);
        try {
            this.field_tb = param3 ? true : false;
            this.field_ob = param4 ? true : false;
            this.field_wb = false;
            this.field_yb = param1;
            this.field_ub = false;
            this.field_vb = new ek(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_vb.field_L = true;
            this.a(0, this.field_vb);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_pb = null;
        field_qb = "Waiting for extra data";
        field_sb = new int[6];
        field_rb = new int[4];
    }
}
