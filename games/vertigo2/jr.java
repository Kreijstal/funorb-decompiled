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
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param2);
            var3_int = gb.a((byte) -49, param1, var10);
            if (param0 == -9) {
              var4 = new String[var3_int - -1];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                if (var3_int <= var7) {
                  var4[var3_int] = param2.substring(var6);
                  stackIn_11_0 = (String[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param1 == param2.charAt(var8)) {
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$1] = param2.substring(var6, var8);
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
              stackIn_3_0 = (String[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("jr.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    public final void run() {
        int var1_int = 0;
        dd var2 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        this.field_b = true;
        try {
            while (!this.field_a) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = this.field_d[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.b();
                    }
                }
                um.a(true, 10L);
                Object var5 = (Object) null;
                e.a(this.field_c, (Object) null, -29785);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            ke.a((Throwable) ((Object) exception), (String) null, 0);
        } finally {
            this.field_b = false;
        }
    }

    final static void a(int param0, int param1) {
        li var2 = null;
        int var3 = 0;
        nf var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (nf) ((Object) ki.field_a.a((byte) 100));
            L1: while (true) {
              if (var4 == null) {
                var2 = mo.field_h.a((byte) 100);
                L2: while (true) {
                  if (var2 == null) {
                    L3: {
                      if (param1 == 2) {
                        break L3;
                      } else {
                        field_e = (wp) null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    hm.d(0, param0);
                    var2 = mo.field_h.b(41);
                    continue L2;
                  }
                }
              } else {
                jc.a(-14499, param0, var4);
                var4 = (nf) ((Object) ki.field_a.b(71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2_ref), "jr.D(" + param0 + ',' + param1 + ')');
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
        qg.field_G = bi.field_e;
        om.field_D = bi.field_j;
        km.i(202);
        qo.field_D.a(0, 14017, ca.field_h.field_Fb, 0, -2 + (-40 + ca.field_h.field_db));
        bf.field_c.a(86, il.field_k.field_Fb, r.field_f, 0, 0);
        int var1 = 2 + r.field_f;
        im.field_j.a(94, il.field_k.field_Fb, il.field_k.field_db + -(db.field_S ? var1 : 0), !db.field_S ? 0 : var1, 0);
        po.b((byte) -52);
        vb.field_j.a(123, ca.field_h.field_Fb, 40, ca.field_h.field_db + -40, 0);
        qn.field_s.a(121, ud.field_A.field_Fb, 30, 0, 0);
        ja.field_b.a(115, ud.field_A.field_Fb, -30 + (-2 + ud.field_A.field_db + -40), 30, 0);
        po.field_a.a(72, 68, 30, 5, 5);
        mn.field_n.a(82, 78, 30, 5, 75);
        ve.field_f.a(73, 48, 30, 5, 155);
        int var2 = 52 / ((param0 - 27) / 42);
        ok.field_b.a(78, 48, 30, 5, 205);
        int var3 = !db.field_S ? 200 : 250;
        tp.field_Nb.a(98, 363 + -var3, 30, 5, var3 + 5);
        sa.field_b.a(72, -365 + (-5 + (ud.field_A.field_Fb - 5)), 30, 5, 370);
        uk.field_v.a(37, 2, re.field_k, -5 + (ja.field_b.field_db + -5 + -32), 5, ja.field_b.field_Fb - 10, 3124);
        int var4 = (ud.field_A.field_Fb - -2) / 2;
        b.field_h.a(125, -2 + var4, 40, -40 + ud.field_A.field_db, 0);
        if (!db.field_S) {
            var4 = 0;
        }
        la.field_f.a(74, ud.field_A.field_Fb - var4, 40, -40 + ud.field_A.field_db, var4);
    }

    jr() {
        this.field_d = new dd[2];
        this.field_a = false;
        this.field_b = false;
    }

    static {
        field_e = new wp();
    }
}
