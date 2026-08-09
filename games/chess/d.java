/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends ci {
    static String field_Lb;
    private ci[] field_Kb;
    static boolean field_Gb;
    static char field_Ib;
    int field_Hb;
    static byte[] field_Jb;
    private ci field_Fb;
    private ci[] field_Eb;
    static dk field_Mb;

    final static boolean a(boolean param0) {
        sk.field_p = param0 ? true : false;
        ma.field_E = ud.a(2) + 15000L;
        return (rm.field_Q ^ -1) == -12 ? true : false;
    }

    final static void a(vl param0, int param1, vl param2, jk param3, java.awt.Component param4, boolean param5, byte param6) {
        try {
            md.a(param1, param5, 10);
            mh.field_d = md.a(param3, param4, 0, 22050);
            kn.field_F = md.a(param3, param4, 1, 2048);
            h.field_s = new lb();
            kn.field_F.b(h.field_s);
            fk.field_q = param2;
            fk.field_q.a(64 * bc.field_b / 80, (byte) -100);
            mh.field_d.b(fk.field_q);
            if (param6 > -21) {
                field_Mb = (dk) null;
            }
            ka.field_a = param0;
            ka.field_a.a(lf.field_S * 64 / 80, (byte) -100);
            h.field_s.a(ka.field_a);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "d.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        ci dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var7 = Chess.field_G;
        var4 = param0;
        L0: while (true) {
          if (this.field_Eb.length <= var4) {
            this.field_Fb.a(0, this.field_M, param0 ^ -2147483648, this.field_pb + -param2, param2);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= this.field_Kb.length) {
                return;
              } else {
                this.field_Kb[var8].a(param1, -(2 * param1) + this.field_Fb.field_M, -2147483648, -(param1 * 2) + this.field_Fb.field_pb, param1);
                if (var8 != this.field_Hb) {
                  dupTemp$0 = this.field_Kb[var8];
                  dupTemp$0.field_mb = dupTemp$0.field_mb + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = this.field_M * var4 / this.field_Eb.length;
            var6 = (1 + var4) * this.field_M / this.field_Eb.length;
            this.field_Eb[var4].field_mb = var5;
            this.field_Eb[var4].field_V = 0;
            this.field_Eb[var4].field_M = -var5 + var6;
            this.field_Eb[var4].field_pb = param2;
            var4++;
            continue L0;
          }
        }
    }

    d(long param0, ci param1, String[] param2, ci param3, ci[] param4, int param5) {
        super(param0, (ci) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        ci var9 = null;
        int var11 = 0;
        try {
          L0: {
            this.field_Eb = new ci[param2.length];
            this.field_Fb = new ci(0L, param3);
            this.field_Kb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                this.a((byte) 127, this.field_Fb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    this.field_Hb = param5;
                    this.field_Eb[param5].field_gb = true;
                    break L0;
                  } else {
                    this.field_Fb.a((byte) 126, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new ci(0L, param1);
                var9.field_db = param2[var8_int];
                this.field_Eb[var8_int] = var9;
                this.a((byte) 124, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("d.<init>(").append(param0).append(',');

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


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
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
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final void f(byte param0) {
        ci dupTemp$0 = null;
        ci dupTemp$1 = null;
        int var2;
        int var3;
        java.awt.Component var4;
        var3 = Chess.field_G;
        var2 = 0;
        L0: while (true) {
          if (this.field_Eb.length <= var2) {
            L1: {
              if (param0 == 109) {
                break L1;
              } else {
                var4 = (java.awt.Component) null;
                d.a((vl) null, -126, (vl) null, (jk) null, (java.awt.Component) null, false, (byte) 69);
                break L1;
              }
            }
            return;
          } else {
            if ((this.field_Hb ^ -1) != (var2 ^ -1)) {
              if (this.field_Eb[var2].field_L != 0) {
                this.field_Eb[this.field_Hb].field_gb = false;
                dupTemp$0 = this.field_Kb[this.field_Hb];
                dupTemp$0.field_mb = dupTemp$0.field_mb + 10000;
                this.field_Hb = var2;
                this.field_Eb[var2].field_gb = true;
                dupTemp$1 = this.field_Kb[var2];
                dupTemp$1.field_mb = dupTemp$1.field_mb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static void l(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 465918340) {
                break L1;
              } else {
                field_Ib = '';
                break L1;
              }
            }
            var1_int = ge.field_eb[0];
            var2 = 1;
            L2: while (true) {
              if (var2 >= ge.field_eb.length) {
                break L0;
              } else {
                var3 = ge.field_eb[var2];
                ne.a(ve.field_Hb, var2 << 465918340, ve.field_Hb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "d.B(" + param0 + ')');
        }
    }

    final static void a(byte param0, ld param1) {
        int var2_int = 0;
        ld var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            if (param1.field_n != null) {
              L1: {
                L2: {
                  if (0 != param1.field_e) {
                    break L2;
                  } else {
                    if (-1 == (param1.field_q ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= qf.field_c) {
                    break L1;
                  } else {
                    L4: {
                      var3 = ik.field_i[var2_int];
                      if (-3 != (var3.field_k ^ -1)) {
                        break L4;
                      } else {
                        if (param1.field_e != var3.field_e) {
                          break L4;
                        } else {
                          if (var3.field_q != param1.field_q) {
                            break L4;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1.field_l != null) {
                  ca.field_i = param1.field_l;
                  a.field_f = param1.field_m;
                  v.field_b = param1.field_i;
                  hn.field_s = param1.field_k;
                  break L5;
                } else {
                  break L5;
                }
              }
              var2_int = 79 / ((92 - param0) / 33);
              ml.a((byte) 90, param1);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("d.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void k(int param0) {
        int var1 = -83 % ((-59 - param0) / 40);
        field_Jb = null;
        field_Lb = null;
        field_Mb = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -14 / ((param0 - -10) / 47);
        this.field_V = param1;
        this.field_M = param2;
        this.field_pb = param6;
        this.field_mb = param3;
        this.a(0, param4, param5);
    }

    static {
        field_Lb = "Add name";
    }
}
