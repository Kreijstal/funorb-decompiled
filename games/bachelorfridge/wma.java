/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wma {
    static int field_b;
    private int field_a;
    private int field_e;
    private eo field_f;
    private long field_d;
    private eo field_c;
    private eo[] field_g;

    final eo a(long param0, byte param1) {
        eo var4 = null;
        eo var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        ((wma) this).field_d = param0;
        var4 = ((wma) this).field_g[(int)((long)(-1 + ((wma) this).field_e) & param0)];
        ((wma) this).field_c = var4.field_m;
        if (param1 == -87) {
          L0: while (true) {
            if (var4 != ((wma) this).field_c) {
              if (~param0 == ~((wma) this).field_c.field_h) {
                var5 = ((wma) this).field_c;
                ((wma) this).field_c = ((wma) this).field_c.field_m;
                return var5;
              } else {
                ((wma) this).field_c = ((wma) this).field_c.field_m;
                continue L0;
              }
            } else {
              ((wma) this).field_c = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(eo param0, int param1, long param2) {
        eo var5 = null;
        try {
            if (!(null == param0.field_i)) {
                param0.b(0);
            }
            var5 = ((wma) this).field_g[(int)((long)(-1 + ((wma) this).field_e) & param2)];
            param0.field_i = var5.field_i;
            param0.field_m = var5;
            param0.field_i.field_m = param0;
            if (param1 != 91) {
                eo discarded$0 = ((wma) this).a(47);
            }
            param0.field_m.field_i = param0;
            param0.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "wma.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final eo b(byte param0) {
        ((wma) this).field_a = 0;
        if (param0 != -73) {
            return null;
        }
        return ((wma) this).a(-25177);
    }

    final static void c(byte param0) {
        ru.field_d[44] = 71;
        ru.field_d[93] = 43;
        ru.field_d[92] = 74;
        ru.field_d[46] = 72;
        ru.field_d[61] = 27;
        ru.field_d[59] = 57;
        ru.field_d[520] = 59;
        ru.field_d[222] = 58;
        ru.field_d[192] = 28;
        ru.field_d[45] = 26;
        ru.field_d[47] = 73;
        ru.field_d[91] = 42;
    }

    final eo a(int param0) {
        int var3 = 0;
        eo var4 = null;
        eo var35 = null;
        eo var36 = null;
        eo var37 = null;
        eo var38 = null;
        eo var41 = null;
        var3 = BachelorFridge.field_y;
        if (param0 == -25177) {
          if (((wma) this).field_a > 0) {
            if (((wma) this).field_g[((wma) this).field_a - 1] == ((wma) this).field_f) {
              L0: while (true) {
                if (((wma) this).field_e > ((wma) this).field_a) {
                  int fieldTemp$5 = ((wma) this).field_a;
                  ((wma) this).field_a = ((wma) this).field_a + 1;
                  var38 = ((wma) this).field_g[fieldTemp$5].field_m;
                  if (((wma) this).field_g[((wma) this).field_a + -1] != var38) {
                    ((wma) this).field_f = var38.field_m;
                    return var38;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var41 = ((wma) this).field_f;
              ((wma) this).field_f = var41.field_m;
              return var41;
            }
          } else {
            L1: while (true) {
              if (((wma) this).field_e > ((wma) this).field_a) {
                int fieldTemp$6 = ((wma) this).field_a;
                ((wma) this).field_a = ((wma) this).field_a + 1;
                var37 = ((wma) this).field_g[fieldTemp$6].field_m;
                if (((wma) this).field_g[((wma) this).field_a + -1] != var37) {
                  ((wma) this).field_f = var37.field_m;
                  return var37;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          eo discarded$7 = ((wma) this).a(72);
          if (((wma) this).field_a > 0) {
            if (((wma) this).field_g[((wma) this).field_a - 1] != ((wma) this).field_f) {
              var35 = ((wma) this).field_f;
              ((wma) this).field_f = var35.field_m;
              return var35;
            } else {
              L2: while (true) {
                if (((wma) this).field_e > ((wma) this).field_a) {
                  int fieldTemp$8 = ((wma) this).field_a;
                  ((wma) this).field_a = ((wma) this).field_a + 1;
                  var36 = ((wma) this).field_g[fieldTemp$8].field_m;
                  if (((wma) this).field_g[((wma) this).field_a + -1] != var36) {
                    ((wma) this).field_f = var36.field_m;
                    return var36;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (((wma) this).field_e > ((wma) this).field_a) {
                int fieldTemp$9 = ((wma) this).field_a;
                ((wma) this).field_a = ((wma) this).field_a + 1;
                var4 = ((wma) this).field_g[fieldTemp$9].field_m;
                if (((wma) this).field_g[((wma) this).field_a + -1] != var4) {
                  ((wma) this).field_f = var4.field_m;
                  return var4;
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

    final eo a(byte param0) {
        eo var2 = null;
        eo var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (null != ((wma) this).field_c) {
          var2 = ((wma) this).field_g[(int)(((wma) this).field_d & (long)(((wma) this).field_e - 1))];
          L0: while (true) {
            if (var2 == ((wma) this).field_c) {
              if (param0 != -31) {
                eo discarded$2 = ((wma) this).a(-83L, (byte) 79);
                ((wma) this).field_c = null;
                return null;
              } else {
                ((wma) this).field_c = null;
                return null;
              }
            } else {
              if (((wma) this).field_d == ((wma) this).field_c.field_h) {
                var3 = ((wma) this).field_c;
                ((wma) this).field_c = ((wma) this).field_c.field_m;
                return var3;
              } else {
                ((wma) this).field_c = ((wma) this).field_c.field_m;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    wma(int param0) {
        int var2 = 0;
        eo var3 = null;
        ((wma) this).field_a = 0;
        ((wma) this).field_g = new eo[param0];
        ((wma) this).field_e = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            eo dupTemp$2 = new eo();
            var3 = dupTemp$2;
            ((wma) this).field_g[var2] = dupTemp$2;
            var3.field_m = var3;
            var3.field_i = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
