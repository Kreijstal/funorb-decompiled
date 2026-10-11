/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends gg {
    int field_n;
    static String field_j;
    int field_m;
    static String[] field_h;
    int field_l;
    int field_i;
    int field_o;
    li field_k;

    public static void a(int param0) {
        try {
          field_h = null;
          field_j = null;
          if (param0 != 26333) {
            li.a(-110);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "li.A(" + param0 + ')');
        }
    }

    final static void d(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        ia stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        jd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ia var5_ref = null;
        ia var6 = null;
        String var6_ref = null;
        ia var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          var1 = te.field_N;
          var2 = var1.j(255);
          if (var2 == 0) {
            if (null == lc.field_m) {
              lc.field_m = new jh(128);
              kj.field_O = 0;
            }
            stackIn_11_0 = (var1.j(255) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.h(20);
            if (var3_int != 0) {
              var1.h(31);
            }
            var5_ref = ug.a(var4_ref_String, 113);
            var6_ref = var1.h(105);
            var7_ref = jg.a((CharSequence) ((Object) var4_ref_String), -2);
            if (null == var7_ref) {
              var7_ref = var4_ref_String;
            }
            if (var5_ref == null) {
              var5_ref = ug.a(var6_ref, 115);
              if (var5_ref != null) {
                lc.field_m.a((long)var7_ref.hashCode(), (byte) -109, var5_ref);
              }
            }
            if (var5_ref == null) {
              var5_ref = new ia();
              lc.field_m.a((long)var7_ref.hashCode(), (byte) -109, var5_ref);
              fieldTemp$1 = kj.field_O;
              kj.field_O = kj.field_O + 1;
              var5_ref.field_jb = fieldTemp$1;
              vb.field_h.a(var5_ref, -7044);
            }
            var5_ref.field_ib = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (1 == lh.field_p) {
                lh.field_p = 2;
              }
              return;
            }
            if (param0 < 116) {
              li.a(-55);
            }
            if (3 == var2) {
              if (lh.field_p == 2) {
                lh.field_p = 1;
              }
              return;
            }
            if (var2 != 4) {
              hi.a((Throwable) null, "F1: " + oc.a(false), 1);
              je.a(false);
              return;
            }
            lh.field_p = 1;
            var3 = var1.h(37);
            qa.field_r = ((String) (var3)).intern();
            var4 = var1.j(255);
            pk.a((byte) -48, var4);
            return;
          }
          if (ok.field_a == null) {
            ok.field_a = new jh(128);
            ng.field_c = 0;
          }
          var3Lifetime1 = var1.h(55);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.h(75);
          var5 = var1.h(56);
          var6 = mc.a(var4_ref_StringLifetime1, (byte) 105);
          if (var6 == null) {
            var6 = mc.a(var5, (byte) 105);
            if (var6 != null) {
              ok.field_a.a((long)jg.a((CharSequence) ((Object) var4_ref_StringLifetime1), -2).hashCode(), (byte) -109, var6);
            }
          }
          if (null == var6) {
            var6 = new ia();
            ok.field_a.a((long)jg.a((CharSequence) ((Object) var4_ref_StringLifetime1), -2).hashCode(), (byte) -109, var6);
            fieldTemp$0 = ng.field_c;
            ng.field_c = ng.field_c + 1;
            var6.field_jb = fieldTemp$0;
            va.field_f.a(var6, -7044);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_gb = (String) (var3Lifetime1);
          var6.field_ib = var4_ref_StringLifetime1;
          var6.c(10);
          var7 = (ia) (va.field_f.a((byte) 51));
          L6: while (true) {
            if (var7 != null) {
              stackIn_56_0 = var6;
              if (var8 != 0) {
                break L6;
              }
              if (je.a(stackIn_56_0, var7, true)) {
                var7 = (ia) (va.field_f.b(-40));
                continue;
              }
            }
            stackIn_56_0 = var7;
            break;
          }
          if (stackIn_56_0 == null) {
            va.field_f.a(var6, -7044);
            if (var8 == 0) {
              return;
            }
          }
          ha.a(var6, (byte) 51, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "li.B(" + param0 + ')');
        }
    }

    li(int param0, int param1, int param2, int param3, int param4) {
        try {
          this.field_i = param4;
          this.field_m = param3;
          this.field_o = param1;
          this.field_l = param0;
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "li.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_h = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = "Loading extra data";
    }
}
