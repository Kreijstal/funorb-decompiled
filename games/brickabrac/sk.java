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
        ((sk) this).field_K = 256;
    }

    final static void a(String[] args, int param1, oi param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var17 = null;
        qj stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        qj stackIn_6_0 = null;
        boolean stackIn_6_1 = false;
        qj stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        qj stackIn_8_0 = null;
        boolean stackIn_8_1 = false;
        qj stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj stackOut_4_0 = null;
        boolean stackOut_4_1 = false;
        qj stackOut_5_0 = null;
        boolean stackOut_5_1 = false;
        qj stackOut_6_0 = null;
        boolean stackOut_6_1 = false;
        qj stackOut_7_0 = null;
        boolean stackOut_7_1 = false;
        int stackOut_7_2 = 0;
        qj stackOut_8_0 = null;
        boolean stackOut_8_1 = false;
        int stackOut_8_2 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            fj.field_Ub = null;
            ep.field_i = 23;
            fp.field_z = 57;
            od.field_c = 13;
            og.field_Wb = 3;
            hg.field_e = 51550 + (hi.field_w.b(102) << 16);
            ek.field_kb = 72;
            qm.field_a = 40;
            tm.field_g = 11;
            var6_int = (1 << param3) - 1;
            var16 = new int[param3];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var7 = var10;
            var8 = 0;
            L1: while (true) {
              if (param3 <= var8) {
                L2: {
                  L3: {
                    int discarded$1 = 0;
                    var17 = id.a(hi.field_w);
                    pe.field_o = new qj(args, -1, var6_int, param2, var16, var17);
                    pe.field_o.a((byte) 119, param1);
                    pe.field_o.field_q = true;
                    stackOut_4_0 = pe.field_o;
                    stackOut_4_1 = pe.field_o.field_s;
                    stackIn_8_0 = stackOut_4_0;
                    stackIn_8_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (kb.field_Yb < 2) {
                      break L3;
                    } else {
                      stackOut_5_0 = (qj) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_8_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (param3 != 1) {
                        break L3;
                      } else {
                        stackOut_6_0 = (qj) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (!qg.field_t) {
                          break L3;
                        } else {
                          stackOut_7_0 = (qj) (Object) stackIn_7_0;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_9_2 = stackOut_7_2;
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_8_0 = (qj) (Object) stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                }
                stackIn_9_0.field_s = stackIn_9_1 | stackIn_9_2 != 0;
                ng.a(param4, 103, -1);
                break L0;
              } else {
                var7[var8] = hi.field_w.b(97);
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("sk.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (args == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 44 + param4 + 44 + -12665 + 41);
        }
    }

    final static void i(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (hd.field_d != null) {
              L1: {
                if (!(lp.field_rb instanceof km)) {
                  break L1;
                } else {
                  ((km) (Object) lp.field_rb).d((byte) 79);
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
                  field_J = null;
                  break L3;
                }
              }
              L4: {
                if (!eb.field_l) {
                  break L4;
                } else {
                  fj.field_Ub = null;
                  lp.field_wb.c((byte) -121);
                  var13 = mk.field_b;
                  var11 = var13;
                  var9 = var11;
                  var7 = var9;
                  var4 = var7;
                  var1 = var4;
                  var2 = 0;
                  L5: while (true) {
                    if (var2 >= 8) {
                      var14 = pl.field_b;
                      var12 = var14;
                      var10 = var12;
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
                          var14[var6] = 0;
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      var13[var2] = 0;
                      var2++;
                      continue L5;
                    }
                  }
                }
              }
              L7: {
                if (dp.field_y) {
                  int discarded$4 = 7;
                  eq.a();
                  int discarded$5 = 119;
                  bf.a();
                  uc.e(-94);
                  dp.field_y = false;
                  break L7;
                } else {
                  break L7;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1_ref, "sk.B(" + param0 + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param2 != 0) {
            return;
        }
        if (!(((sk) this).field_E != null)) {
            return;
        }
        if (!(0 != ((sk) this).field_K)) {
            return;
        }
        if (!(256 != ((sk) this).field_K)) {
            ((sk) this).field_E.a(param0 + ((sk) this).field_w, param1 - -((sk) this).field_o, param2, (byte) -11);
            return;
        }
        jp var6 = new jp(((sk) this).field_E.field_t, ((sk) this).field_E.field_s);
        fc.a(-113, var6);
        ((sk) this).field_E.a(0, 0, param2, param3);
        sc.b(param3 ^ 119);
        var6.b(param1 + ((sk) this).field_o, param0 - -((sk) this).field_w, ((sk) this).field_K);
    }

    public static void a() {
        field_J = null;
        field_G = null;
    }

    final static l a(byte param0, kl param1) {
        l var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        l stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_0_0 = null;
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
            var2 = new l(param1, (nm) (Object) param1);
            var3 = 30 % ((param0 - 58) / 43);
            wd.field_v.a((nm) (Object) var2, (byte) 3);
            ob.field_J.b((qd) (Object) param1);
            stackOut_0_0 = (l) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("sk.A(").append(param0).append(44);
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
          throw qb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    sk(oc param0) {
        super(param0.field_o, param0.field_w, param0.field_t, param0.field_s, (ub) null, (uh) null);
        try {
            param0.a(((sk) this).field_s, 0, 0, (byte) -119, ((sk) this).field_t);
            ((sk) this).field_K = 256;
            ((sk) this).field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "sk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
