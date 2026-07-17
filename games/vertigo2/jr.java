/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr implements Runnable {
    volatile boolean field_b;
    volatile boolean field_a;
    static wp field_e;
    static int[] field_f;
    jj field_c;
    volatile dd[] field_d;

    final static String[] a(byte param0, char param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        Object stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) (Object) param2;
            var3_int = gb.a((byte) -49, param1, var10);
            if (param0 == -9) {
              var4 = new String[var3_int - -1];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                if (var3_int <= var7) {
                  var4[var3_int] = param2.substring(var6);
                  stackOut_10_0 = (String[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param1 == param2.charAt(var8)) {
                      int incrementValue$2 = var5;
                      var5++;
                      var4[incrementValue$2] = param2.substring(var6, var8);
                      var6 = var8 - -1;
                      var7++;
                      continue L1;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("jr.C(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    public final void run() {
        int var1_int = 0;
        dd var2 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        ((jr) this).field_b = true;
        try {
            while (!((jr) this).field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((jr) this).field_d[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.b();
                    }
                }
                um.a(true, 10L);
                Object var5 = null;
                e.a(((jr) this).field_c, (Object) null, -29785);
            }
        } catch (Exception exception) {
            Object var6 = null;
            ke.a((Throwable) (Object) exception, (String) null, 0);
        } finally {
            ((jr) this).field_b = false;
        }
    }

    final static void a(int param0, int param1) {
        li var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        nf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (nf) (Object) ki.field_a.a((byte) 100);
            L1: while (true) {
              if (var4 == null) {
                var2 = mo.field_h.a((byte) 100);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    hm.d(0, param0);
                    var2 = mo.field_h.b(41);
                    continue L2;
                  }
                }
              } else {
                jc.a(-14499, param0, var4);
                var4 = (nf) (Object) ki.field_a.b(71);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2_ref, "jr.D(" + param0 + 44 + 2 + 41);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 > -55) {
            jr.a((byte) 3);
        }
        field_f = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cr stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        cr stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        cr stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        cr stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        cr stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        cr stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_9_0 = 0;
        cr stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        cr stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        cr stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        cr stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        cr stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        cr stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          qg.field_G = bi.field_e;
          om.field_D = bi.field_j;
          km.i(202);
          qo.field_D.a(0, 14017, ca.field_h.field_Fb, 0, -2 + (-40 + ca.field_h.field_db));
          bf.field_c.a(86, il.field_k.field_Fb, r.field_f, 0, 0);
          var1 = 2 + r.field_f;
          stackOut_0_0 = im.field_j;
          stackOut_0_1 = 94;
          stackOut_0_2 = il.field_k.field_Fb;
          stackOut_0_3 = il.field_k.field_db;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (!db.field_S) {
            stackOut_2_0 = (cr) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (cr) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = var1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (cr) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = stackIn_3_2;
          stackOut_3_3 = stackIn_3_3 + -stackIn_3_4;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          if (db.field_S) {
            stackOut_5_0 = (cr) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = var1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            break L1;
          } else {
            stackOut_4_0 = (cr) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            break L1;
          }
        }
        L2: {
          ((cr) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, 0);
          po.b((byte) -52);
          vb.field_j.a(123, ca.field_h.field_Fb, 40, ca.field_h.field_db + -40, 0);
          qn.field_s.a(121, ud.field_A.field_Fb, 30, 0, 0);
          ja.field_b.a(115, ud.field_A.field_Fb, -30 + (-2 + ud.field_A.field_db + -40), 30, 0);
          po.field_a.a(72, 68, 30, 5, 5);
          mn.field_n.a(82, 78, 30, 5, 75);
          ve.field_f.a(73, 48, 30, 5, 155);
          var2 = 52 / ((param0 - 27) / 42);
          ok.field_b.a(78, 48, 30, 5, 205);
          if (db.field_S) {
            stackOut_8_0 = 250;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 200;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var3 = stackIn_9_0;
          tp.field_Nb.a(98, 363 + -var3, 30, 5, var3 + 5);
          sa.field_b.a(72, -365 + (-5 + (ud.field_A.field_Fb - 5)), 30, 5, 370);
          uk.field_v.a(37, 2, re.field_k, -5 + (ja.field_b.field_db - 37), 5, ja.field_b.field_Fb - 10, 3124);
          var4 = (ud.field_A.field_Fb - -2) / 2;
          b.field_h.a(125, -2 + var4, 40, -40 + ud.field_A.field_db, 0);
          if (db.field_S) {
            break L3;
          } else {
            var4 = 0;
            break L3;
          }
        }
        la.field_f.a(74, ud.field_A.field_Fb - var4, 40, -40 + ud.field_A.field_db, var4);
    }

    jr() {
        ((jr) this).field_d = new dd[2];
        ((jr) this).field_a = false;
        ((jr) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new wp();
    }
}
