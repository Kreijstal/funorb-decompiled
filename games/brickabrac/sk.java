/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends h {
    static String field_G;
    static jp[] field_J;
    static int field_I;
    int field_K;
    static int field_H;

    public sk() {
        super(0, 0, 0, 0, (ub) null, (uh) null);
        this.field_K = 256;
    }

    final static void a(String[] args, int param1, oi param2, int param3, boolean param4, int param5) {
        qj stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        qj stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var15 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              fj.field_Ub = null;
              ep.field_i = 23;
              fp.field_z = 57;
              od.field_c = 13;
              if (param5 == -12665) {
                break L1;
              } else {
                sk.a(122);
                break L1;
              }
            }
            og.field_Wb = 3;
            hg.field_e = 51550 + (hi.field_w.b(102) << 463076464);
            ek.field_kb = 72;
            qm.field_a = 40;
            tm.field_g = 11;
            var6_int = (1 << param3) - 1;
            var12 = new int[param3];
            var10 = var12;
            var7 = var10;
            var8 = 0;
            L2: while (true) {
              if (param3 <= var8) {
                L3: {
                  L4: {
                    var15 = id.a(hi.field_w, false);
                    pe.field_o = new qj(args, -1, var6_int, param2, var12, var15);
                    pe.field_o.a((byte) 119, param1);
                    pe.field_o.field_q = true;
                    stackIn_10_0 = pe.field_o;

                    stackIn_10_1 = pe.field_o.field_s;

                    if (kb.field_Yb < 2) {
                      break L4;
                    } else {
                      stackIn_10_0 = (qj) ((Object) stackIn_10_0);

                      if (param3 != 1) {
                        break L4;
                      } else {
                        stackIn_10_0 = (qj) ((Object) stackIn_10_0);

                        if (!qg.field_t) {
                          break L4;
                        } else {
                          stackIn_11_0 = (qj) ((Object) stackIn_10_0);
                          stackIn_11_1 = stackIn_10_1;
                          stackIn_11_2 = 1;
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_11_0 = (qj) ((Object) stackIn_10_0);
                  stackIn_11_1 = stackIn_10_1;
                  stackIn_11_2 = 0;
                  break L3;
                }
                stackIn_11_0.field_s = stackIn_11_1 | stackIn_11_2 != 0;
                ng.a(param4, 103, -1);
                break L0;
              } else {
                var7[var8] = hi.field_w.b(97);
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("sk.E(");

            if (args == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void i(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (hd.field_d != null) {
              L1: {
                if (!(lp.field_rb instanceof km)) {
                  break L1;
                } else {
                  ((km) ((Object) lp.field_rb)).d((byte) 79);
                  break L1;
                }
              }
              L2: {
                lp.field_rb = hd.field_d;
                hd.field_d = null;
                kh.field_a = 0;
                if (!cc.field_G) {
                  break L2;
                } else {
                  cc.field_G = false;
                  pe.field_o = null;
                  break L2;
                }
              }
              L3: {
                if (param0 <= -112) {
                  break L3;
                } else {
                  field_J = (jp[]) null;
                  break L3;
                }
              }
              L4: {
                if (!eb.field_l) {
                  break L4;
                } else {
                  fj.field_Ub = null;
                  lp.field_wb.c((byte) -121);
                  var9 = mk.field_b;
                  var7 = var9;
                  var4 = var7;
                  var1 = var4;
                  var2 = 0;
                  L5: while (true) {
                    if (var2 >= 8) {
                      var10 = pl.field_b;
                      var8 = var10;
                      var5 = var8;
                      var1 = var5;
                      var6 = 0;
                      var2 = var6;
                      L6: while (true) {
                        if (8 <= var6) {
                          eb.field_l = false;
                          break L4;
                        } else {
                          var10[var6] = 0;
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      var9[var2] = 0;
                      var2++;
                      continue L5;
                    }
                  }
                }
              }
              L7: {
                if (dp.field_y) {
                  eq.a(7);
                  bf.a((byte) 119);
                  uc.e(-94);
                  dp.field_y = false;
                  break L7;
                } else {
                  break L7;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "sk.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param2 != 0) {
            return;
        }
        if (!(this.field_E != null)) {
            return;
        }
        if (!(0 != this.field_K)) {
            return;
        }
        if (!(256 != this.field_K)) {
            this.field_E.a(param0 + this.field_w, param1 - -this.field_o, param2, (byte) -11);
            return;
        }
        jp var6 = new jp(this.field_E.field_t, this.field_E.field_s);
        fc.a(-113, var6);
        this.field_E.a(0, 0, param2, param3);
        sc.b(param3 ^ 119);
        var6.b(param1 + this.field_o, param0 - -this.field_w, this.field_K);
    }

    public static void a(int param0) {
        if (param0 != 51550) {
            field_G = (String) null;
        }
        field_J = null;
        field_G = null;
    }

    final static l a(byte param0, kl param1) {
        l var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        l stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new l(param1, param1);
            var3 = 30 % ((param0 - 58) / 43);
            wd.field_v.a(var2, (byte) 3);
            ob.field_J.b(param1);
            stackIn_1_0 = (l) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2_ref);

            stackIn_4_1 = new StringBuilder().append("sk.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    sk(oc param0) {
        super(param0.field_o, param0.field_w, param0.field_t, param0.field_s, (ub) null, (uh) null);
        try {
            param0.a(this.field_s, 0, 0, (byte) -119, this.field_t);
            this.field_K = 256;
            this.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "sk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
