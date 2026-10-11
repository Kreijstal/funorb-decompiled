/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gj implements Iterable {
    static db[] field_f;
    private wl field_e;
    static volatile int field_a;
    static int field_b;
    int field_d;
    wl[] field_c;

    final static aa a(byte param0, String param1) {
        String var2 = null;
        aa var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_12_0 = null;
        aa stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = wizardrun.field_H;
        try {
          if (null == lj.field_f) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            stackIn_7_0 = null;
            return (aa) (stackIn_7_0);
          }
          if (param0 != -116) {
            field_b = -125;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = ta.a(-60, var6);
          if (var2 == null) {
            stackIn_12_0 = null;
            return (aa) (stackIn_12_0);
          }
          var3 = (aa) (lj.field_f.a((long)var2.hashCode(), (byte) 104));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_mb);
            var4 = ta.a(-51, var7);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (aa) (lj.field_f.a(false));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("gj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new wh(this));
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = wizardrun.field_H;
        var2 = 0;
        var3 = jd.field_f;
        if (5 > var3) {
          var2 = var3 * var3 * 8192 / 1100;
        } else {
          if (var3 < 105) {
            var2 = (var3 * 16384 - 40960) / 220;
            var4 = 1;
            var5 = 0;
            if (param1 == 3) {
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
            if (6 == param1) {
              var4 = 1;
              var5 = -1;
            }
            if (param1 == 7) {
              var4 = -1;
              var5 = -1;
            } else {
              if (param1 == 8) {
                var4 = -1;
                var5 = -1;
              }
            }
            if (param1 == 11) {
              var4 = -1;
            }
            if (param1 == 12) {
              var4 = -1;
              var5 = -1;
            }
            if (13 == param1) {
              var4 = 1;
              var5 = -1;
            }
            if (param0 != 115) {
              field_a = -119;
            }
            if (param1 == 14) {
              var4 = -1;
              var5 = 1;
            }
            if (param1 == 15) {
              var4 = 1;
              var5 = 1;
            }
            cg.field_m = f.a(var4 * var2, var5 * var2, 24268);
            return;
          }
          if (var3 < 120) {
            var3 = 120 - var3;
            var2 = 8192 - var3 * (var3 * 8192) / 3300;
          }
        }
        var4Lifetime1 = 1;
        var5Lifetime1 = 0;
        if (param1 == 3) {
          var4Lifetime1 = -1;
        }
        if (param1 == 1) {
          var5Lifetime1 = 1;
        }
        if (param1 == 4) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        if (param1 == 5) {
          var5Lifetime1 = 1;
          var4Lifetime1 = -1;
        }
        if (6 == param1) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param1 == 7) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        } else {
          if (param1 == 8) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
        }
        if (param1 == 11) {
          var4Lifetime1 = -1;
        }
        if (param1 == 12) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (13 == param1) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param0 != 115) {
          field_a = -119;
        }
        if (param1 == 14) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param1 == 15) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        cg.field_m = f.a(var4Lifetime1 * var2, var5Lifetime1 * var2, 24268);
    }

    final static aa a(String param0, int param1) {
        String var2 = null;
        aa var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        aa stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        aa stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = wizardrun.field_H;
        try {
          if (param1 != -30782) {
            stackIn_3_0 = (aa) null;
            return stackIn_3_0;
          }
          if (null == wl.field_f) {
            stackIn_6_0 = null;
            return (aa) (stackIn_6_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = ta.a(-55, var6);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (aa) (wl.field_f.a((long)var2.hashCode(), (byte) 124));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_mb);
            var4 = ta.a(param1 + 30710, var7);
            if (var4 == null) {
              var4 = var3.field_mb;
            }
            if (!var4.equals(var2)) {
              var3 = (aa) (wl.field_f.a(false));
              continue;
            }
            break;
          }
          stackIn_18_0 = var3;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("gj.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= 70) {
          return;
        }
        String var2 = (String) null;
        gj.a((byte) -10, (String) null);
    }

    final wl a(boolean param0, long param1) {
        wl var4;
        wl var5;
        int var6;
        wl var5Lifetime1;
        var6 = wizardrun.field_H;
        var4 = this.field_c[(int)(param1 & (long)(-1 + this.field_d))];
        this.field_e = var4.field_b;
        if (!param0) {
          while (true) {
            if (var4 == this.field_e) {
              this.field_e = null;
              return null;
            }
            if (param1 != this.field_e.field_e) {
              this.field_e = this.field_e.field_b;
              continue;
            }
            break;
          }
          var5 = this.field_e;
          this.field_e = this.field_e.field_b;
          return var5;
        }
        gj.a((byte) 61, -95);
        while (true) {
          if (var4 == this.field_e) {
            this.field_e = null;
            return null;
          }
          if (param1 != this.field_e.field_e) {
            this.field_e = this.field_e.field_b;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_e;
        this.field_e = this.field_e.field_b;
        return var5Lifetime1;
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 <= 21) {
          return;
        }
        try {
          param0.addMouseListener(tc.field_m);
          param0.addMouseMotionListener(tc.field_m);
          param0.addFocusListener(tc.field_m);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "gj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(long param0, wl param1, byte param2) {
        if (null != param1.field_c) {
          param1.a(false);
        }
        wl var5 = this.field_c[(int)((long)(-1 + this.field_d) & param0)];
        param1.field_c = var5.field_c;
        if (param2 > -84) {
          return;
        }
        try {
          param1.field_b = var5;
          param1.field_c.field_b = param1;
          param1.field_e = param0;
          param1.field_b.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "gj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private gj() throws Throwable {
        throw new Error();
    }

    static {
        field_a = -1;
        field_b = 0;
    }
}
