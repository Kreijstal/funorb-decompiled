/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterator {
    private rf field_a;
    static int[] field_e;
    private ek field_b;
    private int field_c;
    private rf field_d;

    final static void b(int param0) {
        qb.b(-1);
        ic.field_a = true;
        if (param0 <= 63) {
          wh.a(false);
          tc.field_x = true;
          ti.field_b.l(26756);
          sc.a(false, (byte) 118, ui.field_n);
          return;
        } else {
          tc.field_x = true;
          ti.field_b.l(26756);
          sc.a(false, (byte) 118, ui.field_n);
          return;
        }
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2;
        var2 = StarCannon.field_A;
        if (this.field_a == this.field_b.field_a[this.field_c + -1]) {
          L0: while (true) {
            if (this.field_b.field_c > this.field_c) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              if (this.field_b.field_a[fieldTemp$1].field_a != this.field_b.field_a[this.field_c + -1]) {
                this.field_a = this.field_b.field_a[-1 + this.field_c].field_a;
                return true;
              } else {
                this.field_a = this.field_b.field_a[this.field_c + -1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(int param0) {
        this.field_a = this.field_b.field_a[0].field_a;
        this.field_c = 1;
        if (param0 != -17399) {
          this.a(-19);
          this.field_d = null;
          return;
        } else {
          this.field_d = null;
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        wh.a(124, (java.net.URL) null, (java.applet.Applet) null);
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 127) {
              L1: {
                var3 = null;
                var4 = null;
                if (null == qi.field_b) {
                  break L1;
                } else {
                  if (qi.field_b.equals(param2.getParameter("settings"))) {
                    break L1;
                  } else {
                    var3 = qi.field_b;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  }
                }
              }
              L2: {
                if (null == vk.field_v) {
                  break L2;
                } else {
                  if (!vk.field_v.equals(param2.getParameter("session"))) {
                    var4 = vk.field_v;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_11_0 = ig.a((String) (var3), -1, (String) (var4), param1, 1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = var3;

            stackIn_14_1 = new StringBuilder().append("wh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_11_0;
        }
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        rf var1;
        int var2;
        var2 = StarCannon.field_A;
        if (this.field_b.field_a[this.field_c + -1] == this.field_a) {
          L0: while (true) {
            if (this.field_b.field_c > this.field_c) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              var1 = this.field_b.field_a[fieldTemp$1].field_a;
              if (this.field_b.field_a[-1 + this.field_c] == var1) {
                continue L0;
              } else {
                this.field_d = var1;
                this.field_a = var1.field_a;
                return var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_a;
          this.field_d = var1;
          this.field_a = var1.field_a;
          return var1;
        }
    }

    public final void remove() {
        if (this.field_d == null) {
            throw new IllegalStateException();
        }
        this.field_d.b(4);
        this.field_d = null;
    }

    wh(ek param0) {
        this.field_d = null;
        try {
            this.field_b = param0;
            this.a(-17399);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
