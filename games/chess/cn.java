/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cn implements Iterable {
    static String field_a;
    l field_c;
    static ok field_b;
    static String field_e;
    static String field_d;
    static int field_g;
    static int field_f;

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Chess.field_G;
        var2 = 0;
        var3 = sl.field_a;
        if (var3 < 5) {
          var2 = 8192 * (var3 * var3) / 1100;
          var4 = 1;
          var5 = 0;
          if (3 == param1) {
            var4 = -1;
          }
          if (param1 == 1) {
            var5 = 1;
          }
          if (param1 == 4) {
            var4 = 1;
            var5 = 1;
          }
          if (param1 == 5) {
            var5 = 1;
            var4 = -1;
          }
          if (param1 == 6) {
            var4 = 1;
            var5 = -1;
          }
          if (param1 == 7) {
            var4 = -1;
            var5 = -1;
          } else {
            if (8 == param1) {
              var4 = -1;
              var5 = -1;
            }
          }
        } else {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
            var4 = 1;
            var5 = 0;
            if (3 == param1) {
              var4 = -1;
            }
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 4) {
              var4 = 1;
              var5 = 1;
            }
            if (param1 == 5) {
              var5 = 1;
              var4 = -1;
            }
            if (param1 == 6) {
              var4 = 1;
              var5 = -1;
            }
            if (param1 == 7 ||
              8 == param1) {
              var4 = -1;
              var5 = -1;
            }
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = -(var3 * var3 * 8192 / 3300) + 8192;
              var4 = 1;
              var5 = 0;
              if (3 == param1) {
                var4 = -1;
              }
              if (param1 == 1) {
                var5 = 1;
              }
              if (param1 == 4) {
                var4 = 1;
                var5 = 1;
              }
              if (param1 == 5) {
                var5 = 1;
                var4 = -1;
              }
              if (param1 == 6) {
                var4 = 1;
                var5 = -1;
              }
              if (param1 == 7 ||
                8 == param1) {
                var4 = -1;
                var5 = -1;
              }
              if (11 == param1) {
                var4 = -1;
              }
              if (12 == param1) {
                var4 = -1;
                var5 = -1;
              }
              if (param1 == 13) {
                var5 = -1;
                var4 = 1;
              }
              if (param0 != 25) {
                cn.b(114);
              }
              if (param1 == 14) {
                var4 = -1;
                var5 = 1;
              }
              if (param1 == 15) {
                var4 = 1;
                var5 = 1;
              }
              ua.field_b = mm.a(var2 * var4, -1, var5 * var2);
              return;
            }
            var4 = 1;
            var5 = 0;
            if (3 == param1) {
              var4 = -1;
            }
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 4) {
              var4 = 1;
              var5 = 1;
            }
            if (param1 == 5) {
              var5 = 1;
              var4 = -1;
            }
            if (param1 == 6) {
              var4 = 1;
              var5 = -1;
            }
            if (param1 == 7) {
              var4 = -1;
              var5 = -1;
            } else {
              if (8 == param1) {
                var4 = -1;
                var5 = -1;
              }
            }
          }
        }
        if (11 == param1) {
          var4 = -1;
        }
        if (12 == param1) {
          var4 = -1;
          var5 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param0 != 25) {
          cn.b(114);
        }
        if (param1 == 14) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 15) {
          var4 = 1;
          var5 = 1;
        }
        ua.field_b = mm.a(var2 * var4, -1, var5 * var2);
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 7043) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static ci a(int param0) {
        if (param0 != 11520) {
          cn.b(-30);
          return jg.k(110);
        }
        return jg.k(110);
    }

    final static void a(int param0, boolean param1) {
        uh.field_m.a(false, param1);
        jg var2 = ol.field_O;
        if (param0 == 16384) {
          if (var2 != null) {
            var2.a(true, uh.field_m.field_wb, uh.field_m.field_U);
          }
          return;
        }
    }

    final void a(l param0, boolean param1) {
        try {
          if (param1) {
            this.iterator();
          }
          if (null != param0.field_m) {
            param0.d(-1);
          }
          param0.field_p = this.field_c;
          param0.field_m = this.field_c.field_m;
          param0.field_m.field_p = param0;
          param0.field_p.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "cn.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final l c(int param0) {
        l var2 = this.field_c.field_p;
        if (param0 != -14336) {
          field_g = 116;
          if (var2 != this.field_c) {
            var2.d(-1);
            return var2;
          }
          return null;
        }
        if (var2 != this.field_c) {
          var2.d(-1);
          return var2;
        }
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new hc(this));
    }

    cn() {
        this.field_c = new l();
        this.field_c.field_m = this.field_c;
        this.field_c.field_p = this.field_c;
    }

    static {
        field_a = "Achievements";
        field_e = "Click or press F10 to open Quick Chat";
        field_d = "More suggestions";
    }
}
