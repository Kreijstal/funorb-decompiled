/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class eb extends td {
    static String field_q;
    static String field_r;
    static int field_t;
    static String field_s;
    static int[] field_p;

    eb(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            ((eb) this).field_n = param3;
            ((eb) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "eb.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        tba var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var18 = 0;
        aga var19 = null;
        int[][] var23 = null;
        Object stackIn_3_0 = null;
        tba stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        tba stackOut_14_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            var19 = ((eb) this).field_h.a(21, param0);
            var4 = new tba(((eb) this).field_g, new nq(var19));
            var4.field_q = ((eb) this).field_k;
            var4.field_s = ((eb) this).field_n;
            var23 = var4.e(6);
            var6 = 17;
            var7 = 17;
            var8 = var6 - 1 >> 1;
            var9 = -1 + var7 >> 1;
            var10 = 0;
            var11 = 0;
            if (param1 == 3) {
              L1: while (true) {
                if (var11 >= var6) {
                  stackOut_14_0 = (tba) var4;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  var12 = 0;
                  L2: while (true) {
                    if (var12 >= var7) {
                      var11++;
                      continue L1;
                    } else {
                      if (1 == var23[var11][var12]) {
                        L3: {
                          var13 = -var8 - (-var11 - ((eb) this).field_k);
                          var14 = -var9 - (-var12 - ((eb) this).field_n);
                          if (var13 < 0) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var12++;
                        continue L2;
                      } else {
                        var12++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ii) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("eb.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return (ii) (Object) stackIn_15_0;
    }

    final static void a() {
        RuntimeException var2 = null;
        int var2_int = 0;
        kr var2_ref = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        fea stackIn_14_0 = null;
        String stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        fea stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        fea stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        RuntimeException decompiledCaughtException = null;
        fea stackOut_13_0 = null;
        String stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        fea stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        fea stackOut_14_0 = null;
        String stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            ps.field_q.d(0, 0);
            var2_int = 0;
            L1: while (true) {
              if (8 <= var2_int) {
                L2: {
                  qm.field_d.a(true, 7802);
                  jha.field_g.c(ak.field_t, 22, 146, 16370176, -1);
                  hfa.field_z.c(ak.field_t, 22, 146, 65793, -1);
                  if (mg.field_m.field_a >= dea.field_n) {
                    fba.field_a.a(48 + bw.field_a.field_kb, 4 + bw.field_a.field_rb);
                    if (bw.field_a.field_T) {
                      bn.field_h.a(48 + bw.field_a.field_kb, bw.field_a.field_rb + 4);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    hfa.field_z.a(vka.field_r, bw.field_a.field_kb - -(bw.field_a.field_sb >> 1), 4 + bw.field_a.field_rb - -(bw.field_a.field_p >> 1), 16204, -1);
                    jha.field_g.a(vka.field_r, bw.field_a.field_kb + (bw.field_a.field_sb >> 1), 4 + ((bw.field_a.field_p >> 1) + bw.field_a.field_rb), 16777215, -1);
                    break L2;
                  }
                }
                L3: {
                  stackOut_13_0 = jha.field_g;
                  stackOut_13_1 = ow.field_n;
                  stackOut_13_2 = 530;
                  stackOut_13_3 = 446;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  if (!lfa.field_l.field_T) {
                    stackOut_15_0 = (fea) (Object) stackIn_15_0;
                    stackOut_15_1 = (String) (Object) stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = stackIn_15_3;
                    stackOut_15_4 = 16777215;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    stackIn_16_4 = stackOut_15_4;
                    break L3;
                  } else {
                    stackOut_14_0 = (fea) (Object) stackIn_14_0;
                    stackOut_14_1 = (String) (Object) stackIn_14_1;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = stackIn_14_3;
                    stackOut_14_4 = 16699649;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    break L3;
                  }
                }
                L4: {
                  ((fea) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, -1);
                  hfa.field_z.a(ow.field_n, 530, 446, 16204, -1);
                  ug.field_q.a(true, 7802);
                  if (null != qg.field_b.field_z) {
                    dg.a(ug.field_q.field_kb, ug.field_q.field_rb, ug.field_q.field_sb + ug.field_q.field_kb, ug.field_q.field_p + ug.field_q.field_rb);
                    var2_ref = (kr) (Object) qg.field_b.field_z.b((byte) 90);
                    L5: while (true) {
                      if (var2_ref == null) {
                        dg.c();
                        break L4;
                      } else {
                        jha.field_g.c(Integer.toString(var2_ref.field_yb.field_g), ug.field_q.field_kb - (-var2_ref.field_kb + -28), qg.field_b.field_rb + 32 + (ug.field_q.field_rb - -var2_ref.field_rb), 16777215, -1);
                        hfa.field_z.c(Integer.toString(var2_ref.field_yb.field_g), 28 + var2_ref.field_kb + ug.field_q.field_kb, qg.field_b.field_rb + (32 + (var2_ref.field_rb + ug.field_q.field_rb)), 65793, -1);
                        var2_ref = (kr) (Object) qg.field_b.field_z.c(0);
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  jha.field_g.c(hka.field_g, 452, 306, 65793, -1);
                  int discarded$3 = 1;
                  var4 = lga.a(true, new String[1], vla.field_u);
                  jha.field_g.b(var4, 600, 306, 16699649, -1);
                  hfa.field_z.b(var4, 600, 306, 65793, -1);
                  jha.field_g.c(jla.field_c, 452, 400, 65793, -1);
                  int discarded$4 = 1;
                  var5 = lga.a(true, new String[1], vla.field_u);
                  jha.field_g.b(var5, 600, 400, 16699649, -1);
                  hfa.field_z.b(var5, 600, 400, 65793, -1);
                  lma.field_y.a(412, 161);
                  gha.field_b.a(412, 441);
                  lma.field_y.a(598, 166);
                  gha.field_b.a(598, 271);
                  if (!um.a(true)) {
                    int discarded$5 = 1;
                    kla.b();
                    break L6;
                  } else {
                    break L6;
                  }
                }
                break L0;
              } else {
                L7: {
                  L8: {
                    jf.field_l.a(14 + var2_int * 77, 89);
                    if (se.field_s[var2_int].field_T) {
                      break L8;
                    } else {
                      if (baa.field_Q - 1 == var2_int) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  dr.field_p.a(77 * var2_int + 14, 89);
                  break L7;
                }
                nw.field_p[var2_int].e(77 * var2_int + 36, 91);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "eb.C(" + 1 + 44 + 36 + 41);
        }
    }

    public static void c() {
        field_s = null;
        field_q = null;
        field_r = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Turn <%0> / <%1>";
        field_r = "Try out your first battle! If you wish to skip this section, click here.  <br><col=BBFF00> Next</col>";
        field_s = "Invalid date";
        field_p = new int[8192];
    }
}
