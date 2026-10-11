/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hh implements Iterator {
    static String field_b;
    private gb field_d;
    private gb field_c;
    private rj field_a;

    public final boolean hasNext() {
        return this.field_a.field_e != this.field_d;
    }

    public final void remove() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (this.field_c == null) {
            throw new IllegalStateException();
          }
          this.field_c.e(0);
          this.field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "hh.remove()");
        }
    }

    public static void b(byte param0) {
        try {
          field_b = null;
          if (param0 <= 41) {
            field_b = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "hh.D(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        la var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        ve var5_ref = null;
        ve var6 = null;
        String var6_ref = null;
        ve var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 != 128) {
            field_b = (String) null;
          }
          var1 = ne.field_a;
          var2 = var1.h(param0 ^ 16255);
          if (0 == var2) {
            if (ug.field_cb == null) {
              ug.field_cb = new bj(128);
              jc.field_c = 0;
            }
            stackIn_15_0 = (var1.h(16383) != 1) ? 0 : 1;
            var3_int = stackIn_15_0;
            var4_ref_String = var1.g(0);
            if (var3_int != 0) {
              var1.g(0);
            }
            var5_ref = nj.a((byte) 125, var4_ref_String);
            var6_ref = var1.g(0);
            var7_ref = r.a((CharSequence) ((Object) var4_ref_String), -11133);
            if (var7_ref == null) {
              var7_ref = var4_ref_String;
            }
            if (var5_ref == null) {
              var5_ref = nj.a((byte) 124, var6_ref);
              if (var5_ref != null) {
                ug.field_cb.a(var5_ref, (long)var7_ref.hashCode(), param0 ^ -182);
              }
            }
            if (var5_ref == null) {
              var5_ref = new ve();
              ug.field_cb.a(var5_ref, (long)var7_ref.hashCode(), param0 ^ 240);
              fieldTemp$1 = jc.field_c;
              jc.field_c = jc.field_c + 1;
              var5_ref.field_R = fieldTemp$1;
              pb.field_d.a((byte) -111, var5_ref);
            }
            var5_ref.field_jb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (q.field_a == 1) {
                q.field_a = 2;
              }
              return;
            }
            if (3 == var2) {
              if (q.field_a == 2) {
                q.field_a = 1;
              }
              return;
            }
            if (var2 != 4) {
              hb.a((Throwable) null, 0, "F1: " + jc.b(77));
              lj.a((byte) 118);
              return;
            }
            q.field_a = 1;
            var3 = var1.g(param0 ^ 128);
            la.field_q = ((String) (var3)).intern();
            var4 = var1.h(16383);
            hj.a((byte) 100, var4);
            return;
          }
          if (ag.field_d == null) {
            ag.field_d = new bj(128);
            ei.field_o = 0;
          }
          var3Lifetime1 = var1.g(0);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.g(0);
          var5 = var1.g(0);
          var6 = ob.a(param0 - 218, var4_ref_StringLifetime1);
          if (var6 == null) {
            var6 = ob.a(param0 - 78, var5);
            if (var6 != null) {
              ag.field_d.a(var6, (long)r.a((CharSequence) ((Object) var4_ref_StringLifetime1), -11133).hashCode(), param0 - 189);
            }
          }
          if (var6 == null) {
            var6 = new ve();
            ag.field_d.a(var6, (long)r.a((CharSequence) ((Object) var4_ref_StringLifetime1), -11133).hashCode(), -105);
            fieldTemp$0 = ei.field_o;
            ei.field_o = ei.field_o + 1;
            var6.field_R = fieldTemp$0;
            oj.field_d.a((byte) -97, var6);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_ib = (String) (var3Lifetime1);
          var6.field_jb = var4_ref_StringLifetime1;
          var6.a(-104);
          var7 = (ve) (oj.field_d.b(2));
          while (var7 != null) {
            if (aj.a(true, var7, var6)) {
              var7 = (ve) (oj.field_d.a(10));
              if (var8 == 0) {
                continue;
              }
            }
            break;
          }
          if (var7 == null) {
            oj.field_d.a((byte) -106, var6);
            if (var8 == 0) {
              return;
            }
          }
          lj.a(var7, var6, -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "hh.B(" + param0 + ')');
        }
    }

    public final Object next() {
        Object var1 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1 = this.field_d;
          if (var1 != this.field_a.field_e) {
            this.field_d = ((gb) (var1)).field_k;
            if (TrackController.field_F) {
              var1 = null;
              this.field_d = null;
            }
          } else {
            var1 = null;
            this.field_d = null;
          }
          this.field_c = (gb) (var1);
          stackIn_6_0 = var1;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (var1), "hh.next()");
        }
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        String var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vg.field_o) {
            throw new IllegalStateException();
          }
          if (null != kb.field_a) {
            kb.field_a.t(20252);
          }
          if (param0 <= 45) {
            return;
          }
          var1 = uj.a(-119);
          ra.field_y = new rl(var1, (String) null, true, false, false);
          gl.field_E.d((byte) -120, re.field_g);
          re.field_g.b(ra.field_y, -82);
          re.field_g.o(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) runtimeException), "hh.C(" + param0 + ')');
        }
    }

    hh(rj param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = null;
        try {
          this.field_a = param0;
          this.field_d = this.field_a.field_e.field_k;
          this.field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("hh.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (rl.field_N == 10 ||
            !ij.b(1)) {
            nj.a(-27958);
            rl.field_N = 11;
          }
          qh.field_i = true;
          if (param0 != -28717) {
            hh.b(-61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "hh.A(" + param0 + ')');
        }
    }

    static {
        field_b = "Create a free account to start using this feature";
    }
}
