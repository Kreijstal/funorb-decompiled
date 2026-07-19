/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_e;
    static String field_a;
    gi field_c;
    static String field_d;
    private gi field_h;
    static int[] field_b;
    static int field_f;
    static he[] field_g;

    final void a(int param0, gi param1) {
        try {
            if (param1.field_b != null) {
                param1.a(-16175);
            }
            if (param0 < 16) {
                field_b = (int[]) null;
            }
            param1.field_b = this.field_c;
            param1.field_e = this.field_c.field_e;
            param1.field_b.field_e = param1;
            param1.field_e.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "vd.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void g(int param0) {
        gi var2 = null;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        L0: while (true) {
          var2 = this.field_c.field_e;
          if (this.field_c != var2) {
            var2.a(-16175);
            continue L0;
          } else {
            L1: {
              if (param0 == 255) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            this.field_h = null;
            return;
          }
        }
    }

    final static String f(int param0) {
        int var1 = 35 % ((param0 - 40) / 41);
        if (!(fk.field_q != hg.field_ub)) {
            return ue.field_d;
        }
        if (!(lc.field_h != hg.field_ub)) {
            return cm.field_I;
        }
        if (!ib.field_f.a(false)) {
            return cm.field_I;
        }
        return qf.field_c;
    }

    final gi h(int param0) {
        gi var2 = this.field_c.field_e;
        if (!(var2 != this.field_c)) {
            this.field_h = null;
            return null;
        }
        if (param0 != -11151) {
            gi var3 = (gi) null;
            this.a((gi) null, 53);
        }
        this.field_h = var2.field_e;
        return var2;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_b = (int[]) null;
        }
        field_g = null;
        field_a = null;
        field_d = null;
        field_e = null;
    }

    final gi a(byte param0) {
        int var3 = 63 / ((-55 - param0) / 48);
        gi var2 = this.field_c.field_b;
        if (var2 == this.field_c) {
            return null;
        }
        var2.a(-16175);
        return var2;
    }

    final gi e(int param0) {
        gi var2 = this.field_h;
        if (!(this.field_c != var2)) {
            this.field_h = null;
            return null;
        }
        if (param0 != 0) {
            gi var3 = (gi) null;
            this.a((gi) null, 20);
        }
        this.field_h = var2.field_e;
        return var2;
    }

    final gi d(int param0) {
        gi var2 = this.field_c.field_e;
        if (this.field_c == var2) {
            return null;
        }
        var2.a(-16175);
        if (param0 != 180479896) {
            this.field_c = (gi) null;
        }
        return var2;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        pj.field_E = param1;
        if (param2) {
            field_a = (String) null;
        }
        b.field_h = param0;
        a.field_i = param3;
    }

    final void a(gi param0, int param1) {
        nh[] discarded$0 = null;
        try {
            if (param1 != 255) {
                discarded$0 = vd.b((byte) 99);
            }
            if (null != param0.field_b) {
                param0.a(-16175);
            }
            param0.field_b = this.field_c.field_b;
            param0.field_e = this.field_c;
            param0.field_b.field_e = param0;
            param0.field_e.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "vd.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 30430) {
            field_d = (String) null;
        }
        return this.field_c.field_e == this.field_c ? true : false;
    }

    final gi b(int param0) {
        if (param0 != 2850) {
            field_g = (he[]) null;
        }
        gi var2 = this.field_c.field_b;
        if (this.field_c == var2) {
            this.field_h = null;
            return null;
        }
        this.field_h = var2.field_b;
        return var2;
    }

    final static nh[] b(byte param0) {
        nh[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var21 = null;
        int[] var22 = null;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var1 = new nh[bd.field_M];
          if (param0 == -22) {
            break L0;
          } else {
            field_g = (he[]) null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (bd.field_M <= var2) {
            oc.a((byte) -21);
            return var1;
          } else {
            var3 = qa.field_J[var2] * gf.field_o[var2];
            var21 = a.field_e[var2];
            if (!bd.field_O[var2]) {
              var10 = new int[var3];
              var22 = var10;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new nh(oe.field_b, ih.field_K, kh.field_i[var2], vi.field_b[var2], gf.field_o[var2], qa.field_J[var2], var22);
                  var2++;
                  continue L1;
                } else {
                  var10[var6] = aj.field_a[rk.a(255, (int) var21[var6])];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var15 = ll.field_o[var2];
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var17 = new int[var3];
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L3: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (nh) ((Object) new pg(oe.field_b, ih.field_K, kh.field_i[var2], vi.field_b[var2], gf.field_o[var2], qa.field_J[var2], var17));
                  var2++;
                  continue L1;
                } else {
                  var6_ref_int__[var7] = li.a(rk.a(255, (int) var15[var7]) << 180479896, aj.field_a[rk.a((int) var21[var7], 255)]);
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public vd() {
        this.field_c = new gi();
        this.field_c.field_b = this.field_c;
        this.field_c.field_e = this.field_c;
    }

    final gi c(int param0) {
        int var2 = -110 % ((param0 - -42) / 40);
        gi var3 = this.field_h;
        if (this.field_c == var3) {
            this.field_h = null;
            return null;
        }
        this.field_h = var3.field_b;
        return var3;
    }

    final static StringBuilder a(char param0, StringBuilder param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.length();
              param1.setLength(param2);
              if (!param3) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (param2 <= var5) {
                stackOut_6_0 = (StringBuilder) (param1);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param1.setCharAt(var5, param0);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("vd.J(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = "Names cannot start or end with space or underscore";
        field_d = "Create";
        field_b = new int[1];
        field_f = 66;
    }
}
