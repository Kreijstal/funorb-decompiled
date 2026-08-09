/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String[] field_d;
    private int field_h;
    private int field_j;
    int field_i;
    static mf field_c;
    private ah field_a;
    private int field_e;
    static String field_g;
    private int field_f;
    static mh field_k;
    private boolean field_b;

    final boolean a(int param0, char param1, int param2) {
        int var4 = 107 / ((0 - param2) / 63);
        if (99 == param0) {
            this.field_i = this.field_i + 1;
            this.field_b = true;
        } else {
            if (!((param0 ^ -1) != -99)) {
                this.field_i = this.field_i - 1;
                this.field_b = true;
            }
        }
        if (this.field_i < 0 || this.field_i >= this.field_f) {
            this.field_i = -1;
            this.field_b = false;
            return true;
        }
        return false;
    }

    final static jp[] a(jp param0, int param1) {
        jp[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        jp[] var4 = null;
        jp[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = 48 / ((param1 - 55) / 32);
            var4 = new jp[9];
            var2 = var4;
            var4[4] = param0;
            stackIn_1_0 = (jp[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2_ref);

            stackIn_4_1 = new StringBuilder().append("jf.F(");

            if (param0 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void d(int param0) {
        if (param0 != -99) {
            field_g = (String) null;
        }
        ii var1 = (ii) ((Object) fr.field_M.a(127));
        if (!(var1 != null)) {
            var1 = new ii();
        }
        var1.a(lb.field_l, lb.field_i, lb.field_c, lb.field_d, param0 ^ 194, lb.field_f, lb.field_b, lb.field_j);
        hi.field_v.a(var1, (byte) 3);
    }

    final static mp a(int param0, String param1) {
        String var2 = null;
        mp var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        mp stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (tf.field_d != null) {
              L1: {
                var7 = (CharSequence) ((Object) param1);
                var2 = gb.a(var7, 85);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param1;
                  break L1;
                }
              }
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  var6 = (String) null;
                  jf.a(-82, (String) null);
                  break L2;
                }
              }
              var3 = (mp) ((Object) tf.field_d.a((long)var2.hashCode(), -1));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var8 = (CharSequence) ((Object) var3.field_Rb);
                    var4 = gb.a(var8, param0 + 55);
                    if (var4 == null) {
                      var4 = var3.field_Rb;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (!var4.equals(var2)) {
                    var3 = (mp) ((Object) tf.field_d.a((byte) -43));
                    continue L3;
                  } else {
                    stackIn_16_0 = (mp) (var3);
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("jf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_16_0;
    }

    final void b(int param0) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var3 = 26 % ((param0 - 50) / 56);
        q var2 = this.field_a.field_m[this.field_h];
        int var4 = var2.field_c;
        int var5 = var2.field_a;
        for (var6 = 0; var6 < this.field_f; var6++) {
            if (!(this.field_i != var6)) {
                nb.a(-111, var5, var4, cm.field_r[var6]);
                ik.field_f[var6].f(var4, var5 - 1, 256);
            }
            da.field_E[var6].c(var4, var5);
            var5 = var5 + (20 - -da.field_E[var6].field_z);
        }
    }

    final void a(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        q var7;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (this.field_a.field_h.field_j != this.field_h) {
            this.field_e = -1;
            this.field_b = false;
            this.field_j = -1;
            this.field_i = -1;
            break L0;
          } else {
            L1: {
              L2: {
                var7 = this.field_a.field_m[this.field_h];
                if (!this.field_b) {
                  break L2;
                } else {
                  if (pq.field_k != this.field_e) {
                    break L2;
                  } else {
                    if (this.field_j != po.field_a) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var3 = var7.field_c;
              var4 = var7.field_a;
              var5 = 0;
              L3: while (true) {
                if (this.field_f <= var5) {
                  break L1;
                } else {
                  if (!da.field_E[var5].d(var3, var4, pq.field_k, po.field_a)) {
                    var4 = var4 + (da.field_E[var5].field_z + 20);
                    var5++;
                    continue L3;
                  } else {
                    this.field_i = var5;
                    break L1;
                  }
                }
              }
            }
            this.field_e = pq.field_k;
            this.field_j = po.field_a;
            break L0;
          }
        }
        L4: {
          if (param0 > 84) {
            break L4;
          } else {
            this.field_h = 25;
            break L4;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_d = null;
        field_c = null;
        field_k = null;
        field_g = null;
    }

    final void c(int param0) {
        this.field_i = param0 + this.field_f;
        this.field_j = po.field_a;
        this.field_e = pq.field_k;
        this.field_b = true;
    }

    final void a(byte param0) {
        this.field_b = true;
        this.field_j = po.field_a;
        if (param0 <= 32) {
            return;
        }
        this.field_e = pq.field_k;
        this.field_i = 0;
    }

    jf(ah param0, int param1, int param2) {
        this.field_i = -1;
        try {
            this.field_f = param2;
            this.field_h = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new String[]{"Levels"};
        field_g = "Quit";
    }
}
