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
        field_c = null;
        field_g = null;
        field_h = null;
        if (param0 != 0) {
            String discarded$0 = jl.a(true, 59, false, true);
        }
    }

    public final void remove() {
        if (!(null != ((jl) this).field_a)) {
            throw new IllegalStateException();
        }
        ((jl) this).field_a.a(97);
        ((jl) this).field_a = null;
    }

    public final boolean hasNext() {
        return ((jl) this).field_b != ((jl) this).field_i.field_f;
    }

    public final Object next() {
        ec var1 = ((jl) this).field_b;
        if (var1 == ((jl) this).field_i.field_f) {
            var1 = null;
            ((jl) this).field_b = null;
        } else {
            ((jl) this).field_b = var1.field_i;
        }
        ((jl) this).field_a = var1;
        return (Object) (Object) var1;
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
          return null;
        }
    }

    jl(ik param0) {
        ((jl) this).field_a = null;
        ((jl) this).field_i = param0;
        ((jl) this).field_b = ((jl) this).field_i.field_f.field_i;
        ((jl) this).field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This game has been updated! Please reload this page.";
    }
}
