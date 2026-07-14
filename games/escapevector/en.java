/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    private int[] field_b;
    static String field_a;
    static String field_g;
    boolean field_c;
    private jh field_m;
    private cn field_f;
    private int[] field_j;
    boolean field_h;
    static int field_k;
    static cn field_i;
    static long field_l;
    static hh field_d;
    static String field_e;

    final int[] a(int param0, byte param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var12 = EscapeVector.field_A;
          if (aj.b(-101)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (var3 == 0) {
            break L1;
          } else {
            if (((en) this).field_h) {
              break L1;
            } else {
              if (!((en) this).field_c) {
                break L1;
              } else {
                ((en) this).b((byte) -128);
                break L1;
              }
            }
          }
        }
        if (this.e(127, param0)) {
          var20 = this.c(param0, (byte) -122);
          var18 = var20;
          var16 = var18;
          var14 = var16;
          var4 = var14;
          if (var4 != null) {
            var5 = this.a(10999, param0);
            var19 = new int[var5];
            var17 = var19;
            var15 = var17;
            var13 = var15;
            var6 = var13;
            var7 = 0;
            L2: while (true) {
              if (var19.length <= var7) {
                var7 = 0;
                var8 = 0;
                L3: while (true) {
                  if (var20.length <= var7) {
                    L4: {
                      if (param1 <= -2) {
                        break L4;
                      } else {
                        field_e = null;
                        break L4;
                      }
                    }
                    return var6;
                  } else {
                    var9 = 0;
                    L5: while (true) {
                      if ((var9 ^ -1) <= -33) {
                        var7++;
                        continue L3;
                      } else {
                        if (this.a(1, var7, var20, var9)) {
                          var11 = 32 * var7 + var9;
                          var19[var8] = var11;
                          var8++;
                          if (var8 == var5) {
                            return var6;
                          } else {
                            var9++;
                            continue L5;
                          }
                        } else {
                          var9++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var19[var7] = -1;
                var7++;
                continue L2;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        ci var4 = this.b(param1, false);
        if (!(var4 != null)) {
            return false;
        }
        if (param2 != 0) {
            field_d = null;
        }
        return var4.a(param0, (byte) -100);
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_i = null;
        field_g = null;
    }

    final int c(int param0, int param1) {
        int var3 = ((en) this).a(param0, true);
        if (!(param0 != 0)) {
            return var3;
        }
        int var4 = this.d(param0, param1);
        var3 = var3 - var4;
        return var3;
    }

    private final int a(boolean param0, int param1, int[] param2, int[] param3) {
        if (param1 >= param3.length) {
            if (param1 >= param2.length) {
                return 0;
            }
        }
        if (param0) {
            ((en) this).field_j = null;
        }
        if (param1 >= param3.length) {
            return param2[param1];
        }
        if (param1 >= param2.length) {
            return param3[param1];
        }
        return this.c((byte) -101, param3[param1], param2[param1]);
    }

    private final int a(int[] param0, int param1, int param2, int[] param3) {
        if (param2 >= param0.length) {
            if (param2 >= param3.length) {
                return 0;
            }
        }
        if (!(param0.length > param2)) {
            return param3[param2];
        }
        int var5 = 53 % ((70 - param1) / 39);
        if (param3.length <= param2) {
            return param0[param2];
        }
        return this.b((byte) -116, param0[param2], param3[param2]);
    }

    final void b(byte param0) {
        if (aj.b(-97)) {
            return;
        }
        if (!(!((en) this).field_h)) {
            return;
        }
        int var2 = 95 / ((-79 - param0) / 45);
        if (!(null != ((en) this).field_m)) {
            ((en) this).field_m = tg.b(4, 126);
            ((en) this).field_c = false;
            ((en) this).field_h = false;
        }
    }

    private final void a(byte param0, int[] param1) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        if (param0 != -82) {
            return;
        }
        if (!(param1 != null)) {
            return;
        }
        if (!(((en) this).field_j != null)) {
            ((en) this).field_j = param1;
            return;
        }
        int[] var7 = ((en) this).field_j;
        int[] var3 = var7;
        int var4 = 0;
        if (!(var7 == null)) {
            var4 = var7.length;
        }
        if (param1 != null) {
            if (param1.length > var4) {
                var4 = param1.length;
            }
        }
        ((en) this).field_j = new int[var4];
        for (var5 = 0; var5 < var4; var5++) {
            ((en) this).field_j[var5] = this.a(false, var5, param1, var7);
        }
    }

    private final int b(byte param0, int param1, int param2) {
        int var4 = -35 / ((param0 - 28) / 45);
        return (param2 ^ -1) & param1;
    }

    private final boolean e(int param0, int param1) {
        if (param0 <= 120) {
            return true;
        }
        if (-1 == (param1 ^ -1)) {
            return true;
        }
        if (1 != param1) {
            return false;
        }
        return true;
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        if (param1 != 38) {
            field_a = null;
        }
        if (!(!param0.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (param0.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "S"))) {
            return Short.TYPE;
        }
        if (param0.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (param0.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param0);
    }

    private final ci b(int param0, boolean param1) {
        if (-1 < (param0 ^ -1)) {
            return null;
        }
        if (jb.field_l.length <= param0) {
            return null;
        }
        if (param1) {
            field_k = -102;
        }
        return jb.field_l[param0];
    }

    final ed b(int param0, int param1) {
        ci var3 = null;
        L0: {
          if (param1 >= 98) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          var3 = this.b(param0, false);
          if (var3 == null) {
            break L1;
          } else {
            if (null != var3.field_e) {
              return var3.field_e;
            } else {
              break L1;
            }
          }
        }
        return qh.field_l;
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        if (((en) this).a(param3, (byte) -127, 1)) {
            return;
        }
        if (!(((en) this).a(param2, (byte) -127, 1))) {
            return;
        }
        if (param0 > -127) {
            return;
        }
        int var7 = param3;
        int var8 = param3 ^ 255;
        oe var9 = ma.field_a;
        if (var9 == null) {
            return;
        }
        var9.a(param1, false, var7, var8);
    }

    private final void a(int[] param0, int param1) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        if (!(param0 != null)) {
            return;
        }
        if (!(((en) this).field_b != null)) {
            ((en) this).field_b = new int[param0.length];
            return;
        }
        if (param1 != -20915) {
            ((en) this).field_j = null;
        }
        int[] var7 = ((en) this).field_b;
        int[] var3 = var7;
        int var4 = 0;
        if (var7 != null) {
            var4 = var7.length;
        }
        if (param0 != null) {
            if (param0.length > var4) {
                var4 = param0.length;
            }
        }
        ((en) this).field_b = new int[var4];
        for (var5 = 0; var4 > var5; var5++) {
            ((en) this).field_b[var5] = this.a(var7, 118, var5, param0);
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var4 = EscapeVector.field_A;
        int var3 = 1;
        while (param0 < -2) {
            if (!(-1 == (1 & param0))) {
                var3 = var3 * param1;
            }
            param1 = param1 * param1;
            param0 = param0 >> 1;
        }
        if (param2 != -1) {
            return -53;
        }
        if (-2 == (param0 ^ -1)) {
            return param1 * var3;
        }
        return var3;
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int var5 = !aj.b(-116) ? 1 : 0;
        if (var5 != 0) {
            if (!((en) this).field_h) {
                if (((en) this).field_c) {
                    ((en) this).b((byte) 118);
                }
            }
        }
        if (((en) this).a(param2, (byte) -128, 1)) {
            return false;
        }
        if (!this.a(param3, param2, param0 + -54)) {
            return false;
        }
        this.a((byte) -47, 1, param2);
        this.a((byte) -47, 0, param2);
        nk.b(param2, -128);
        if (param0 != 54) {
            return true;
        }
        int[] var8 = pl.d(126);
        int[] var7 = var8;
        int[] var6 = var7;
        if (var6 != null) {
            // if_icmpne L132
        } else {
            return false;
        }
        ((en) this).field_f.a(-12328, (hg) (Object) new qd(param2, param1, var8[0], var8[1], var8[2], var8[3]));
        return true;
    }

    final void d(byte param0, int param1, int param2) {
        int var5 = 0;
        mb var6 = null;
        int var7 = EscapeVector.field_A;
        if (null == jb.field_i) {
            return;
        }
        if (param0 > -63) {
            ((en) this).field_c = false;
        }
        mb[] var8 = jb.field_i;
        mb[] var4 = var8;
        for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 == null) {
                return;
            }
            var6.a(11827, param1, param2);
        }
    }

    final void e(int param0) {
        if (aj.b(-123)) {
            return;
        }
        if (!(!((en) this).field_h)) {
            return;
        }
        if (!(((en) this).field_m != null)) {
            return;
        }
        if (param0 != -19636) {
            return;
        }
        if (!(((en) this).field_m.field_h)) {
            return;
        }
        if (!((en) this).field_m.field_g) {
            this.a((byte) -82, ((en) this).field_m.field_i);
            this.a(((en) this).field_m.field_i, -20915);
            ((en) this).field_c = false;
            ((en) this).field_m = null;
            ((en) this).field_h = true;
        } else {
            ((en) this).field_h = false;
            ((en) this).field_m = null;
            ((en) this).field_c = true;
        }
    }

    final static void a(mf param0, int param1) {
        int var2 = 0;
        var2 = param1;
        if (param0.a(0, da.field_d[var2])) {
          sl.field_b[var2][0] = fe.a("tutorial", param0, "layer0", true);
          uj.field_a = sl.field_b[var2][0];
          sl.field_b[var2][2] = fe.a("tutorial", param0, "layer2", true);
          uf.field_e = fe.a("tutorial", param0, "edge_exit_left", true);
          wa.field_b = fe.a("tutorial", param0, "edge_exit_right", true);
          dg.field_r = fe.a("tutorial", param0, "edge_inner_bottom", true);
          ej.field_e = fe.a("tutorial", param0, "edge_inner_bottom_left", true);
          q.field_G = fe.a("tutorial", param0, "edge_inner_bottom_right", true);
          n.field_l = fe.a("tutorial", param0, "edge_inner_left", true);
          cj.field_a = fe.a("tutorial", param0, "edge_inner_right", true);
          mj.field_f = fe.a("tutorial", param0, "edge_inner_top", true);
          bf.field_T = fe.a("tutorial", param0, "edge_inner_top_left", true);
          kn.field_h = fe.a("tutorial", param0, "edge_inner_top_right", true);
          wa.field_e = fe.a("tutorial", param0, "edge_outer", true);
          qf.field_d = fe.a("tutorial", param0, "exitbg", true);
          c.field_n = fe.a("tutorial", param0, "panel", true);
          gm.field_a = fe.a("tutorial", param0, "platform", true);
          tk.field_a[var2] = fe.a("tutorial", param0, "texture", true);
          fa.field_c[var2] = true;
          return;
        } else {
          return;
        }
    }

    final boolean f(int param0, int param1) {
        if (param1 != 1) {
            this.b((byte) 92, -90, -126, -118);
        }
        ci var3 = this.b(param0, false);
        if (var3 == null) {
            return true;
        }
        return var3.field_h;
    }

    final static void a(byte param0, long param1) {
        int var3 = -51 / ((param0 - 41) / 34);
        if (!(0L < param1)) {
            return;
        }
        if (-1L == (param1 % 10L ^ -1L)) {
            ae.a(-1L + param1, (byte) 118);
            ae.a(1L, (byte) 118);
        } else {
            ae.a(param1, (byte) 118);
        }
    }

    final void a(byte param0) {
        this.b((byte) -128, 1, 0, 18);
        this.b((byte) -128, 1, 1, 19);
        this.b((byte) -128, 1, 2, 20);
        this.b((byte) -128, 1, 3, 21);
        int var2 = 9 / ((-27 - param0) / 41);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        if (!(((en) this).field_b != null)) {
            return;
        }
        if (!param0) {
            int discarded$0 = ((en) this).a(42, false);
        }
        for (var2 = 0; ((en) this).field_b.length > var2; var2++) {
            ((en) this).field_b[var2] = 0;
        }
    }

    final int a(int param0, boolean param1) {
        if (!(0 != param0)) {
            return this.b((byte) 119, ((en) this).field_b);
        }
        if (!param1) {
            ((en) this).field_f = null;
        }
        if ((param0 ^ -1) != -2) {
            return 0;
        }
        return 32;
    }

    private final int c(byte param0, int param1, int param2) {
        if (param0 > -95) {
            ((en) this).field_m = null;
        }
        return param1 | param2;
    }

    final void c(int param0, int param1, int param2) {
        jk[] var4 = null;
        int var5 = 0;
        jk var6 = null;
        int var7 = 0;
        jk[] var8 = null;
        var7 = EscapeVector.field_A;
        if (jb.field_k != null) {
          var8 = jb.field_k;
          var4 = var8;
          var5 = param0;
          L0: while (true) {
            if (var8.length <= var5) {
              return;
            } else {
              var6 = var8[var5];
              if (var6 != null) {
                var6.a((byte) 106, param2, param1);
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int[] c(int param0, byte param1) {
        if (param0 == 0) {
            return ((en) this).field_b;
        }
        if ((param0 ^ -1) == -2) {
            return ((en) this).field_j;
        }
        int var3 = 7 % ((param1 - -78) / 38);
        return null;
    }

    private final boolean c(byte param0) {
        if (param0 >= -115) {
            field_i = null;
        }
        return null != ((en) this).field_m ? true : false;
    }

    private final int a(int param0, int param1) {
        if (-1 == (param1 ^ -1)) {
            return this.b((byte) 118, ((en) this).field_b);
        }
        if (param0 != 10999) {
            return 106;
        }
        if (param1 != 1) {
            return 0;
        }
        return this.b((byte) 114, ((en) this).field_j);
    }

    private final int d(int param0, int param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        L0: {
          var8 = EscapeVector.field_A;
          var3 = 0;
          if (param1 == 1) {
            break L0;
          } else {
            ((en) this).field_m = null;
            break L0;
          }
        }
        var4 = jb.field_z;
        var5 = 0;
        L1: while (true) {
          if (var4.length <= var5) {
            return var3;
          } else {
            var6 = var4[var5];
            if (!((en) this).a(var6, (byte) -128, param0)) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int[] param2, int param3) {
        int var5 = param2[param1];
        int var6 = param0 << param3;
        return -1 != (var6 & var5 ^ -1) ? true : false;
    }

    private final void a(int param0, boolean param1, int[] param2, int param3) {
        int var5 = param2[param3];
        int var6 = 1 << param0;
        var5 = var5 | var6;
        if (param1) {
            ((en) this).d((byte) 123, 114, -50);
        }
        param2[param3] = var5;
    }

    final boolean b(int param0) {
        int var2 = 25 / ((9 - param0) / 54);
        return this.a(10999, 0) > 0 ? true : false;
    }

    private final void a(byte param0, int param1, int param2) {
        int var6 = 0;
        if (!(this.e(122, param1))) {
            return;
        }
        int[] var7 = this.c(param1, (byte) -16);
        int[] var4 = var7;
        if (var7 == null) {
            return;
        }
        if (param0 != -47) {
            ((en) this).field_m = null;
        }
        int var5 = param2 / 32;
        if (-1 >= (var5 ^ -1)) {
            if (!(var5 < var7.length)) {
                return;
            }
            var6 = param2 % 32;
            if (0 > var6) {
                return;
            }
            this.a(var6, false, var7, var5);
            return;
        }
    }

    final boolean b(int param0, byte param1) {
        if (param1 <= 21) {
            field_k = -22;
        }
        ci var3 = this.b(param0, false);
        if (!(var3 != null)) {
            return true;
        }
        return var3.field_f;
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        fd var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_32_0 = null;
        int stackIn_36_0 = 0;
        String stackIn_36_1 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        fd stackIn_43_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_35_0 = 0;
        String stackOut_35_1 = null;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        fd stackOut_42_0 = null;
        fd stackOut_41_0 = null;
        L0: {
          var10 = EscapeVector.field_A;
          var1 = hi.field_o;
          var2 = param0;
          if (2 == f.field_j) {
            var3_long = -bd.field_k + td.b(128);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 > var2) {
              var2 = 0;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (s.field_I.length <= var3) {
            return;
          } else {
            L2: {
              var4 = jj.field_a[var3];
              if ((var4 ^ -1) <= -1) {
                if (var4 != cb.field_c.field_h) {
                  var5 = gd.field_X;
                  break L2;
                } else {
                  var5 = pc.field_d;
                  break L2;
                }
              } else {
                var5 = lh.field_e;
                break L2;
              }
            }
            L3: {
              var6 = s.field_I[var3];
              if (2 != f.field_j) {
                break L3;
              } else {
                if (1 == var2) {
                  L4: {
                    if (tg.field_nb.length >= qm.field_f.length) {
                      stackOut_17_0 = tg.field_nb.length;
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      stackOut_16_0 = qm.field_f.length;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_18_0;
                    if (tb.field_G.length > nn.field_i.length) {
                      stackOut_20_0 = tb.field_G.length;
                      stackIn_21_0 = stackOut_20_0;
                      break L5;
                    } else {
                      stackOut_19_0 = nn.field_i.length;
                      stackIn_21_0 = stackOut_19_0;
                      break L5;
                    }
                  }
                  L6: {
                    var8 = stackIn_21_0;
                    if (6 > var3) {
                      break L6;
                    } else {
                      if (var3 >= var7 + 6) {
                        break L6;
                      } else {
                        L7: {
                          if (-var7 + var3 + (-6 + tg.field_nb.length) < 0) {
                            stackOut_25_0 = "";
                            stackIn_26_0 = stackOut_25_0;
                            break L7;
                          } else {
                            stackOut_24_0 = tg.field_nb[-var7 + (tg.field_nb.length + var3) - 6];
                            stackIn_26_0 = stackOut_24_0;
                            break L7;
                          }
                        }
                        var6_ref = stackIn_26_0;
                        break L6;
                      }
                    }
                  }
                  if (var7 + 7 > var3) {
                    break L3;
                  } else {
                    if (var3 >= var7 + 7 - -var8) {
                      break L3;
                    } else {
                      L8: {
                        if (-var7 + (-7 + var3) < nn.field_i.length) {
                          stackOut_31_0 = nn.field_i[-var7 + (var3 - 7)];
                          stackIn_32_0 = stackOut_31_0;
                          break L8;
                        } else {
                          stackOut_30_0 = "";
                          stackIn_32_0 = stackOut_30_0;
                          break L8;
                        }
                      }
                      var6_ref = stackIn_32_0;
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            L9: {
              if (1 != var4) {
                break L9;
              } else {
                var6_ref = Integer.toString(var2);
                break L9;
              }
            }
            L10: {
              stackOut_35_0 = param0 ^ 94;
              stackOut_35_1 = (String) var6_ref;
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              if (-1 > var4) {
                stackOut_37_0 = stackIn_37_0;
                stackOut_37_1 = (String) (Object) stackIn_37_1;
                stackOut_37_2 = 0;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                stackIn_38_2 = stackOut_37_2;
                break L10;
              } else {
                stackOut_36_0 = stackIn_36_0;
                stackOut_36_1 = (String) (Object) stackIn_36_1;
                stackOut_36_2 = 1;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_38_2 = stackOut_36_2;
                break L10;
              }
            }
            L11: {
              var7 = ee.a(stackIn_38_0, stackIn_38_1, stackIn_38_2 != 0);
              var8 = rn.field_e - (var7 >> -2014354495);
              if (var4 >= 0) {
                L12: {
                  var1 = var1 + hn.field_s;
                  if (var4 != cb.field_c.field_h) {
                    stackOut_42_0 = of.field_g;
                    stackIn_43_0 = stackOut_42_0;
                    break L12;
                  } else {
                    stackOut_41_0 = gf.field_e;
                    stackIn_43_0 = stackOut_41_0;
                    break L12;
                  }
                }
                L13: {
                  var9 = stackIn_43_0;
                  if (var9 != null) {
                    var9.a(-fe.field_k + var8, var1, -96, var7 + (fe.field_k << 1475024961), (field_k << -1946318271) + ok.field_a);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var1 = var1 + field_k;
                break L11;
              } else {
                break L11;
              }
            }
            if (0 <= var4) {
              pb.field_e.a(var6_ref, var8, var1 - -he.field_x, var5, -1);
              var1 = var1 + (ok.field_a + (hn.field_s + field_k));
              var3++;
              continue L1;
            } else {
              nb.field_a.a(var6_ref, var8, var1 - -vk.field_t, var5, -1);
              var1 = var1 + je.field_b;
              var3++;
              continue L1;
            }
          }
        }
    }

    en() {
        ((en) this).field_f = new cn();
        int var1 = 1;
        ((en) this).field_j = new int[var1];
        ((en) this).field_b = new int[var1];
        ((en) this).field_f = new cn();
        ((en) this).field_h = false;
        ((en) this).field_c = false;
    }

    final boolean a(int param0, byte param1, int param2) {
        if (!(this.e(127, param2))) {
            return false;
        }
        int[] var7 = this.c(param2, (byte) -14);
        int[] var4 = var7;
        if (!(var7 != null)) {
            return false;
        }
        int var5 = param0 / 32;
        if (param1 > -124) {
            field_d = null;
        }
        var7 = var4;
        if (0 <= var5) {
            // if_icmple L81
        } else {
            return false;
        }
        int var6 = param0 % 32;
        if (var6 < 0) {
            return false;
        }
        return this.a(1, var5, var7, var6);
    }

    final void d(int param0) {
        qd var2 = null;
        int var3 = 0;
        L0: {
          var3 = EscapeVector.field_A;
          if (this.c((byte) -123)) {
            ((en) this).e(-19636);
            break L0;
          } else {
            break L0;
          }
        }
        if (((en) this).field_h) {
          L1: while (true) {
            var2 = (qd) (Object) ((en) this).field_f.c(-20245);
            if (var2 != null) {
              sc.a(var2, 4, 1);
              continue L1;
            } else {
              L2: {
                if (param0 == -32464) {
                  break L2;
                } else {
                  ci discarded$1 = this.b(22, true);
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final int b(byte param0, int[] param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        if (param1 == null) {
            return 0;
        }
        int var3 = 0;
        int[] var4 = param1;
        if (param0 <= 106) {
            ((en) this).field_c = false;
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var3 = var3 + ej.a(858993459, var6);
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = "Your email address is used to identify this account";
        field_i = new cn();
        field_e = "Level score: ";
    }
}
