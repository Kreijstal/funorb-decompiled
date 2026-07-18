/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    private int field_d;
    static bk field_e;
    private qb field_i;
    private qb field_g;
    static int[] field_a;
    private int field_j;
    private qb[] field_f;
    static int field_b;
    static kc field_k;
    static ej field_h;
    static bk field_c;

    final qb b(int param0) {
        if (param0 >= -31) {
            return null;
        }
        ((vb) this).field_j = 0;
        return ((vb) this).a(true);
    }

    public static void a(int param0) {
        field_k = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_h = null;
    }

    final qb a(boolean param0) {
        int var3 = 0;
        qb var4 = null;
        qb var5 = null;
        qb var36 = null;
        qb var37 = null;
        qb var38 = null;
        qb var39 = null;
        qb var42 = null;
        var3 = Main.field_T;
        if (param0) {
          if (((vb) this).field_j > 0) {
            if (((vb) this).field_f[((vb) this).field_j + -1] != ((vb) this).field_i) {
              var42 = ((vb) this).field_i;
              ((vb) this).field_i = var42.field_d;
              return var42;
            } else {
              L0: while (true) {
                if (((vb) this).field_j < ((vb) this).field_d) {
                  int fieldTemp$4 = ((vb) this).field_j;
                  ((vb) this).field_j = ((vb) this).field_j + 1;
                  var4 = ((vb) this).field_f[fieldTemp$4].field_d;
                  var39 = var4;
                  if (var4 == ((vb) this).field_f[((vb) this).field_j - 1]) {
                    continue L0;
                  } else {
                    ((vb) this).field_i = var39.field_d;
                    return var39;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L1: while (true) {
              if (((vb) this).field_j < ((vb) this).field_d) {
                int fieldTemp$5 = ((vb) this).field_j;
                ((vb) this).field_j = ((vb) this).field_j + 1;
                var4 = ((vb) this).field_f[fieldTemp$5].field_d;
                var38 = var4;
                if (var4 == ((vb) this).field_f[((vb) this).field_j - 1]) {
                  continue L1;
                } else {
                  ((vb) this).field_i = var38.field_d;
                  return var38;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          ((vb) this).field_g = null;
          if (((vb) this).field_j > 0) {
            if (((vb) this).field_f[((vb) this).field_j + -1] != ((vb) this).field_i) {
              var36 = ((vb) this).field_i;
              ((vb) this).field_i = var36.field_d;
              return var36;
            } else {
              L2: while (true) {
                if (((vb) this).field_j < ((vb) this).field_d) {
                  int fieldTemp$6 = ((vb) this).field_j;
                  ((vb) this).field_j = ((vb) this).field_j + 1;
                  var4 = ((vb) this).field_f[fieldTemp$6].field_d;
                  var37 = var4;
                  if (var4 == ((vb) this).field_f[((vb) this).field_j - 1]) {
                    continue L2;
                  } else {
                    ((vb) this).field_i = var37.field_d;
                    return var37;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (((vb) this).field_j < ((vb) this).field_d) {
                int fieldTemp$7 = ((vb) this).field_j;
                ((vb) this).field_j = ((vb) this).field_j + 1;
                var4 = ((vb) this).field_f[fieldTemp$7].field_d;
                var5 = var4;
                if (var4 == ((vb) this).field_f[((vb) this).field_j - 1]) {
                  continue L3;
                } else {
                  ((vb) this).field_i = var5.field_d;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final void a(long param0, byte param1, qb param2) {
        qb var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2.field_a == null) {
                break L1;
              } else {
                param2.c(106);
                break L1;
              }
            }
            L2: {
              var5 = ((vb) this).field_f[(int)((long)(-1 + ((vb) this).field_d) & param0)];
              param2.field_d = var5;
              param2.field_a = var5.field_a;
              param2.field_a.field_d = param2;
              param2.field_d.field_a = param2;
              param2.field_e = param0;
              if (param1 >= 24) {
                break L2;
              } else {
                qb discarded$2 = ((vb) this).a(true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("vb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static void a(byte param0) {
        Main.field_G = 0;
        ti.field_a = -1;
        t.field_e = null;
        k.field_b = false;
        p.field_k = -1;
    }

    final qb a(boolean param0, long param1) {
        qb var4 = null;
        qb var5 = null;
        int var6 = 0;
        Object var7 = null;
        qb var8 = null;
        qb var9 = null;
        var6 = Main.field_T;
        if (!param0) {
          var8 = ((vb) this).field_f[(int)(param1 & (long)(((vb) this).field_d - 1))];
          var4 = var8;
          ((vb) this).field_g = var8.field_d;
          L0: while (true) {
            if (var4 == ((vb) this).field_g) {
              ((vb) this).field_g = null;
              return null;
            } else {
              if (~((vb) this).field_g.field_e == ~param1) {
                var5 = ((vb) this).field_g;
                ((vb) this).field_g = ((vb) this).field_g.field_d;
                return var5;
              } else {
                ((vb) this).field_g = ((vb) this).field_g.field_d;
                continue L0;
              }
            }
          }
        } else {
          var7 = null;
          ((vb) this).a(47L, (byte) 72, (qb) null);
          var9 = ((vb) this).field_f[(int)(param1 & (long)(((vb) this).field_d - 1))];
          var4 = var9;
          ((vb) this).field_g = var9.field_d;
          L1: while (true) {
            if (var4 == ((vb) this).field_g) {
              ((vb) this).field_g = null;
              return null;
            } else {
              if (~((vb) this).field_g.field_e == ~param1) {
                var5 = ((vb) this).field_g;
                ((vb) this).field_g = ((vb) this).field_g.field_d;
                return var5;
              } else {
                ((vb) this).field_g = ((vb) this).field_g.field_d;
                continue L1;
              }
            }
          }
        }
    }

    vb(int param0) {
        int var2 = 0;
        qb var3 = null;
        ((vb) this).field_j = 0;
        ((vb) this).field_f = new qb[param0];
        ((vb) this).field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            qb dupTemp$2 = new qb();
            var3 = dupTemp$2;
            ((vb) this).field_f[var2] = dupTemp$2;
            var3.field_d = var3;
            var3.field_a = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{65527, 65528};
        field_e = new bk();
        field_c = new bk();
    }
}
