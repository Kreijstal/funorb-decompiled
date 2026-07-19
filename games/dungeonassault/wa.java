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
            db.field_v.b(Integer.toString(param0), 20 + param4, (param3.field_v + la.field_b.field_H >> 1075709729) + param5, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "wa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final ne a(long param0, int param1) {
        ne var4 = null;
        ne var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        if (param1 == 8) {
          var4 = this.field_h[(int)((long)(-1 + this.field_n) & param0)];
          this.field_d = var4.field_e;
          L0: while (true) {
            if (this.field_d == var4) {
              this.field_d = null;
              return null;
            } else {
              if ((this.field_d.field_h ^ -1L) != (param0 ^ -1L)) {
                this.field_d = this.field_d.field_e;
                continue L0;
              } else {
                var5 = this.field_d;
                this.field_d = this.field_d.field_e;
                return var5;
              }
            }
          }
        } else {
          field_b = (ec) null;
          var4 = this.field_h[(int)((long)(-1 + this.field_n) & param0)];
          this.field_d = var4.field_e;
          L1: while (true) {
            if (this.field_d == var4) {
              this.field_d = null;
              return null;
            } else {
              if ((this.field_d.field_h ^ -1L) != (param0 ^ -1L)) {
                this.field_d = this.field_d.field_e;
                continue L1;
              } else {
                var5 = this.field_d;
                this.field_d = this.field_d.field_e;
                return var5;
              }
            }
          }
        }
    }

    final ne a(boolean param0) {
        if (!param0) {
            field_l = -108;
            this.field_g = 0;
            return this.a(4318);
        }
        this.field_g = 0;
        return this.a(4318);
    }

    public static void c(int param0) {
        field_b = null;
        field_m = null;
        field_j = null;
        if (param0 != 23413) {
            cn var2 = (cn) null;
            wa.a(-5, (cn) null);
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    final static void a(int param0, cn param1) {
        try {
            if (param0 < 116) {
                field_m = (int[]) null;
            }
            ol.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "wa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] b(int param0) {
        int[] discarded$0 = null;
        if (param0 != -1) {
            discarded$0 = wa.b(20);
            return new int[8];
        }
        return new int[8];
    }

    final ne a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        ne var4 = null;
        ne var7 = null;
        ne var8 = null;
        var3 = DungeonAssault.field_K;
        if (0 >= this.field_g) {
          if (param0 != 4318) {
            return (ne) null;
          } else {
            L0: while (true) {
              if (this.field_g < this.field_n) {
                fieldTemp$2 = this.field_g;
                this.field_g = this.field_g + 1;
                var8 = this.field_h[fieldTemp$2].field_e;
                if (this.field_h[this.field_g + -1] != var8) {
                  this.field_i = var8.field_e;
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
          if (this.field_h[this.field_g - 1] != this.field_i) {
            var7 = this.field_i;
            this.field_i = var7.field_e;
            return var7;
          } else {
            if (param0 != 4318) {
              return (ne) null;
            } else {
              L1: while (true) {
                if (this.field_g < this.field_n) {
                  fieldTemp$3 = this.field_g;
                  this.field_g = this.field_g + 1;
                  var4 = this.field_h[fieldTemp$3].field_e;
                  if (this.field_h[this.field_g + -1] != var4) {
                    this.field_i = var4.field_e;
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
            var5 = this.field_h[(int)(param2 & (long)(this.field_n + -1))];
            param0.field_a = var5.field_a;
            param0.field_e = var5;
            param0.field_a.field_e = param0;
            if (param1 != 12460) {
                field_e = (String) null;
            }
            param0.field_e.field_a = param0;
            param0.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "wa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    wa(int param0) {
        ne dupTemp$2 = null;
        int var2 = 0;
        ne var3 = null;
        this.field_g = 0;
        this.field_h = new ne[param0];
        this.field_n = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new ne();
            var3 = dupTemp$2;
            this.field_h[var2] = dupTemp$2;
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
        field_e = "Account created successfully!";
        field_f = "You have never raided a dungeon.";
        field_k = 5;
        field_c = -1;
    }
}
