/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wk implements Iterator {
    private ij field_e;
    private be field_d;
    static int field_b;
    static String[] field_c;
    private ij field_a;

    public final boolean hasNext() {
        return this.field_e != this.field_d.field_f;
    }

    public static void a(boolean param0) {
        if (param0) {
            String var2 = (String) null;
            wk.a((String) null, true, (String) null, false);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public final void remove() {
        if (this.field_a == null) {
            throw new IllegalStateException();
        }
        this.field_a.a(1);
        this.field_a = null;
    }

    final static void a(String param0, boolean param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        String var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jd.field_G = param0;
              ig.field_p = param2;
              ke.a(no.field_i, param1, -13);
              if (!param3) {
                break L1;
              } else {
                var5 = (String) null;
                wk.a((String) null, true, (String) null, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wk.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    public final Object next() {
        Object var1 = this.field_e;
        if (var1 != this.field_d.field_f) {
            this.field_e = ((ij) (var1)).field_j;
        } else {
            var1 = null;
            this.field_e = null;
        }
        this.field_a = (ij) (var1);
        return var1;
    }

    wk(be param0) {
        this.field_a = null;
        try {
            this.field_d = param0;
            this.field_e = this.field_d.field_f.field_j;
            this.field_a = null;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"idle", "", "", "", "walk", "", "", "", "cross_arms", "tap_foot", null, "wave", "push_rock_up", "punch_ball", null, "sticky_feet", "prod_spider_playertile", null, "prod_spider_spidertile", null, "death_crushed", "death_blown_up", "death_got_by_spider"};
    }
}
