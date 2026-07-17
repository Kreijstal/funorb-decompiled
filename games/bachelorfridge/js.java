/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js {
    private int field_a;
    private bw[] field_b;
    private bw field_c;
    private int field_e;
    private bw field_d;

    final bw c(int param0) {
        bw var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == -21446) {
          L0: {
            if (((js) this).field_a <= 0) {
              break L0;
            } else {
              if (((js) this).field_d == ((js) this).field_b[-1 + ((js) this).field_a]) {
                break L0;
              } else {
                var2 = ((js) this).field_d;
                ((js) this).field_d = var2.field_b;
                return var2;
              }
            }
          }
          L1: while (true) {
            if (((js) this).field_a < ((js) this).field_e) {
              int fieldTemp$4 = ((js) this).field_a;
              ((js) this).field_a = ((js) this).field_a + 1;
              var2 = ((js) this).field_b[fieldTemp$4].field_b;
              if (((js) this).field_b[((js) this).field_a - 1] != var2) {
                ((js) this).field_d = var2.field_b;
                return var2;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          bw discarded$5 = ((js) this).a(false, -79L);
          if (((js) this).field_a > 0) {
            if (((js) this).field_d == ((js) this).field_b[-1 + ((js) this).field_a]) {
              L2: while (true) {
                if (((js) this).field_a < ((js) this).field_e) {
                  int fieldTemp$6 = ((js) this).field_a;
                  ((js) this).field_a = ((js) this).field_a + 1;
                  var2 = ((js) this).field_b[fieldTemp$6].field_b;
                  if (((js) this).field_b[((js) this).field_a - 1] != var2) {
                    ((js) this).field_d = var2.field_b;
                    return var2;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var2 = ((js) this).field_d;
              ((js) this).field_d = var2.field_b;
              return var2;
            }
          } else {
            L3: while (true) {
              if (((js) this).field_a < ((js) this).field_e) {
                int fieldTemp$7 = ((js) this).field_a;
                ((js) this).field_a = ((js) this).field_a + 1;
                var2 = ((js) this).field_b[fieldTemp$7].field_b;
                if (((js) this).field_b[((js) this).field_a - 1] != var2) {
                  ((js) this).field_d = var2.field_b;
                  return var2;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final void a(long param0, byte param1, bw param2) {
        bw var5 = null;
        try {
            if (!(null == param2.field_e)) {
                param2.a(false);
            }
            var5 = ((js) this).field_b[(int)((long)(-1 + ((js) this).field_e) & param0)];
            param2.field_b = var5;
            param2.field_e = var5.field_e;
            param2.field_e.field_b = param2;
            param2.field_b.field_e = param2;
            param2.field_c = param0;
            int var6 = 41 / ((param1 - 13) / 45);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "js.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final bw a(boolean param0, long param1) {
        bw var4 = null;
        bw var5 = null;
        int var6 = 0;
        bw var7 = null;
        bw var8 = null;
        var6 = BachelorFridge.field_y;
        if (param0) {
          var7 = ((js) this).field_b[(int)(param1 & (long)(((js) this).field_e + -1))];
          var4 = var7;
          ((js) this).field_c = var7.field_b;
          L0: while (true) {
            if (var4 != ((js) this).field_c) {
              if (((js) this).field_c.field_c != param1) {
                ((js) this).field_c = ((js) this).field_c.field_b;
                continue L0;
              } else {
                var5 = ((js) this).field_c;
                ((js) this).field_c = ((js) this).field_c.field_b;
                return var5;
              }
            } else {
              ((js) this).field_c = null;
              return null;
            }
          }
        } else {
          js.a(93);
          var8 = ((js) this).field_b[(int)(param1 & (long)(((js) this).field_e + -1))];
          var4 = var8;
          ((js) this).field_c = var8.field_b;
          L1: while (true) {
            if (var4 != ((js) this).field_c) {
              if (((js) this).field_c.field_c != param1) {
                ((js) this).field_c = ((js) this).field_c.field_b;
                continue L1;
              } else {
                var5 = ((js) this).field_c;
                ((js) this).field_c = ((js) this).field_c.field_b;
                return var5;
              }
            } else {
              ((js) this).field_c = null;
              return null;
            }
          }
        }
    }

    final bw b(int param0) {
        ((js) this).field_a = 0;
        if (param0 != -13023) {
            bw discarded$0 = ((js) this).b(45);
            return ((js) this).c(-21446);
        }
        return ((js) this).c(-21446);
    }

    final static void a(int param0) {
        jea.field_c = new ofa(qaa.field_d, mda.field_c, sm.field_s, qs.field_m, (sna) (Object) nr.field_v, dla.field_k);
        int var1 = -49 % ((param0 - 46) / 59);
    }

    js(int param0) {
        int var2 = 0;
        bw var3 = null;
        ((js) this).field_a = 0;
        ((js) this).field_b = new bw[param0];
        ((js) this).field_e = param0;
        for (var2 = 0; param0 > var2; var2++) {
            bw dupTemp$0 = new bw();
            var3 = dupTemp$0;
            ((js) this).field_b[var2] = dupTemp$0;
            var3.field_e = var3;
            var3.field_b = var3;
        }
    }

    static {
    }
}
