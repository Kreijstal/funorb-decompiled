/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private ne field_i;
    private ne[] field_h;
    static String field_e;
    private int field_n;
    static int field_k;
    private ne field_d;
    private int field_g;
    static String field_f;
    static int field_c;
    static ec field_b;
    static mb field_j;
    static boolean field_a;
    static int[] field_m;
    static int field_l;

    final static void a(int param0, int param1, int param2, cn param3, int param4, int param5) {
        try {
            param3.h(param4, param5);
            db.field_v.b(Integer.toString(param0), 20 + param4, (param3.field_v + la.field_b.field_H >> 1) + param5, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wa.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    final ne a(long param0, int param1) {
        ne var4 = null;
        ne var5 = null;
        int var6 = 0;
        ne var7 = null;
        ne var8 = null;
        var6 = DungeonAssault.field_K;
        if (param1 == 8) {
          var7 = ((wa) this).field_h[(int)((long)(-1 + ((wa) this).field_n) & param0)];
          var4 = var7;
          ((wa) this).field_d = var7.field_e;
          L0: while (true) {
            if (((wa) this).field_d == var4) {
              ((wa) this).field_d = null;
              return null;
            } else {
              if (~((wa) this).field_d.field_h != ~param0) {
                ((wa) this).field_d = ((wa) this).field_d.field_e;
                continue L0;
              } else {
                var5 = ((wa) this).field_d;
                ((wa) this).field_d = ((wa) this).field_d.field_e;
                return var5;
              }
            }
          }
        } else {
          field_b = null;
          var8 = ((wa) this).field_h[(int)((long)(-1 + ((wa) this).field_n) & param0)];
          var4 = var8;
          ((wa) this).field_d = var8.field_e;
          L1: while (true) {
            if (((wa) this).field_d == var4) {
              ((wa) this).field_d = null;
              return null;
            } else {
              if (~((wa) this).field_d.field_h != ~param0) {
                ((wa) this).field_d = ((wa) this).field_d.field_e;
                continue L1;
              } else {
                var5 = ((wa) this).field_d;
                ((wa) this).field_d = ((wa) this).field_d.field_e;
                return var5;
              }
            }
          }
        }
    }

    final ne a(boolean param0) {
        if (!param0) {
            field_l = -108;
            ((wa) this).field_g = 0;
            return ((wa) this).a(4318);
        }
        ((wa) this).field_g = 0;
        return ((wa) this).a(4318);
    }

    public static void c(int param0) {
        field_b = null;
        field_m = null;
        field_j = null;
        field_f = null;
        field_e = null;
    }

    final static void a(int param0, cn param1) {
        try {
            if (param0 < 116) {
                field_m = null;
            }
            ol.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wa.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int[] b(int param0) {
        if (param0 != -1) {
            int[] discarded$0 = wa.b(20);
            return new int[8];
        }
        return new int[8];
    }

    final ne a(int param0) {
        int var3 = 0;
        ne var4 = null;
        ne var7 = null;
        ne var8 = null;
        var3 = DungeonAssault.field_K;
        if (0 >= ((wa) this).field_g) {
          if (param0 != 4318) {
            return null;
          } else {
            L0: while (true) {
              if (((wa) this).field_g < ((wa) this).field_n) {
                int fieldTemp$2 = ((wa) this).field_g;
                ((wa) this).field_g = ((wa) this).field_g + 1;
                var8 = ((wa) this).field_h[fieldTemp$2].field_e;
                if (((wa) this).field_h[((wa) this).field_g + -1] != var8) {
                  ((wa) this).field_i = var8.field_e;
                  return var8;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          if (((wa) this).field_h[((wa) this).field_g - 1] != ((wa) this).field_i) {
            var7 = ((wa) this).field_i;
            ((wa) this).field_i = var7.field_e;
            return var7;
          } else {
            if (param0 != 4318) {
              return null;
            } else {
              L1: while (true) {
                if (((wa) this).field_g < ((wa) this).field_n) {
                  int fieldTemp$3 = ((wa) this).field_g;
                  ((wa) this).field_g = ((wa) this).field_g + 1;
                  var4 = ((wa) this).field_h[fieldTemp$3].field_e;
                  if (((wa) this).field_h[((wa) this).field_g + -1] != var4) {
                    ((wa) this).field_i = var4.field_e;
                    return var4;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        }
    }

    final void a(ne param0, int param1, long param2) {
        ne var5 = null;
        try {
            if (null != param0.field_a) {
                param0.a(false);
            }
            var5 = ((wa) this).field_h[(int)(param2 & (long)(((wa) this).field_n + -1))];
            param0.field_a = var5.field_a;
            param0.field_e = var5;
            param0.field_a.field_e = param0;
            if (param1 != 12460) {
                field_e = null;
            }
            param0.field_e.field_a = param0;
            param0.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wa.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    wa(int param0) {
        int var2 = 0;
        ne var3 = null;
        ((wa) this).field_g = 0;
        ((wa) this).field_h = new ne[param0];
        ((wa) this).field_n = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            ne dupTemp$2 = new ne();
            var3 = dupTemp$2;
            ((wa) this).field_h[var2] = dupTemp$2;
            var3.field_a = var3;
            var3.field_e = var3;
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
        field_e = "Account created successfully!";
        field_f = "You have never raided a dungeon.";
        field_k = 5;
        field_c = -1;
    }
}
