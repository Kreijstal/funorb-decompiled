/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jl implements Iterator {
    static float field_e;
    static String field_c;
    static nc field_h;
    static int field_d;
    static int field_f;
    static od[] field_g;
    private ec field_b;
    private ec field_a;
    private ik field_i;

    public static void a(int param0) {
        String discarded$0 = null;
        field_c = null;
        field_g = null;
        field_h = null;
        if (param0 != 0) {
            discarded$0 = jl.a(true, 59, false, true);
        }
    }

    public final void remove() {
        if (!(null != this.field_a)) {
            throw new IllegalStateException();
        }
        this.field_a.a(97);
        this.field_a = null;
    }

    public final boolean hasNext() {
        return this.field_b != this.field_i.field_f;
    }

    public final Object next() {
        ec var1 = this.field_b;
        if (var1 == this.field_i.field_f) {
            var1 = null;
            this.field_b = null;
        } else {
            this.field_b = var1.field_i;
        }
        this.field_a = var1;
        return var1;
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (param1 <= -69) {
          if (!param3) {
            if (param0) {
              L0: {
                var4 += 2;
                if (param2) {
                  var4++;
                  break L0;
                } else {
                  break L0;
                }
              }
              return dd.field_d[var4];
            } else {
              L1: {
                if (param2) {
                  var4++;
                  break L1;
                } else {
                  break L1;
                }
              }
              return dd.field_d[var4];
            }
          } else {
            var4 += 4;
            if (!param0) {
              L2: {
                if (param2) {
                  var4++;
                  break L2;
                } else {
                  break L2;
                }
              }
              return dd.field_d[var4];
            } else {
              L3: {
                var4 += 2;
                if (param2) {
                  var4++;
                  break L3;
                } else {
                  break L3;
                }
              }
              return dd.field_d[var4];
            }
          }
        } else {
          return (String) null;
        }
    }

    jl(ik param0) {
        this.field_a = null;
        try {
            this.field_i = param0;
            this.field_b = this.field_i.field_f.field_i;
            this.field_a = null;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "This game has been updated! Please reload this page.";
    }
}
