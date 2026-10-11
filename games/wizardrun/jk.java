/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    boolean field_d;
    static bh field_a;
    static int field_e;
    int field_b;
    boolean field_f;
    static char[] field_c;

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_53_0 = false;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_52_0;
        mg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        aa var5 = null;
        String var5_ref = null;
        String var6 = null;
        aa var6_ref = null;
        String var7 = null;
        aa var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = wizardrun.field_H;
        try {
          if (!param0) {
            return;
          }
          var1 = nk.field_N;
          var2 = var1.f(255);
          if (0 == var2) {
            if (wl.field_f == null) {
              wl.field_f = new jd(128);
              hj.field_e = 0;
            }
            stackIn_14_0 = (var1.f(255) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.d(0);
            if (var3_int != 0) {
              var1.d(0);
            }
            var5 = gj.a(var4_ref_String, -30782);
            var6 = var1.d(0);
            var7 = ta.a(-127, (CharSequence) ((Object) var4_ref_String));
            if (var7 == null) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = gj.a(var6, -30782);
              if (null != var5) {
                wl.field_f.a(var5, (long)var7.hashCode(), 122);
              }
            }
            if (null == var5) {
              var5 = new aa();
              wl.field_f.a(var5, (long)var7.hashCode(), 112);
              fieldTemp$0 = hj.field_e;
              hj.field_e = hj.field_e + 1;
              var5.field_ob = fieldTemp$0;
              bd.field_a.a(var5, false);
            }
            var5.field_mb = var4_ref_String;
            return;
          }
          if (1 != var2) {
            if (var2 == 2) {
              if (jg.field_k == 1) {
                jg.field_k = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (jg.field_k == 2) {
                jg.field_k = 1;
              }
              return;
            }
            if (var2 != 4) {
              rg.a((Throwable) null, "F1: " + ni.c(6), -562);
              ql.a(-91);
              return;
            }
            jg.field_k = 1;
            var3 = var1.d(0);
            me.field_d = ((String) (var3)).intern();
            var4 = var1.f(255);
            qb.a((byte) 52, var4);
            return;
          }
          if (null == lj.field_f) {
            lj.field_f = new jd(128);
            kh.field_h = 0;
          }
          var3Lifetime1 = var1.d(0);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.d(0);
          var5_ref = var1.d(0);
          var6_ref = gj.a((byte) -116, var4_ref_StringLifetime1);
          if (var6_ref == null) {
            var6_ref = gj.a((byte) -116, var5_ref);
            if (var6_ref != null) {
              lj.field_f.a(var6_ref, (long)ta.a(-78, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), 125);
            }
          }
          if (null == var6_ref) {
            var6_ref = new aa();
            lj.field_f.a(var6_ref, (long)ta.a(-57, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), 107);
            fieldTemp$1 = kh.field_h;
            kh.field_h = kh.field_h + 1;
            var6_ref.field_ob = fieldTemp$1;
            qk.field_g.a(var6_ref, false);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_jb = (String) (var3Lifetime1);
          var6_ref.field_mb = var4_ref_StringLifetime1;
          var6_ref.a(false);
          var7_ref = (aa) (qk.field_g.b((byte) 80));
          L15: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var7_ref) {
              stackOut_52_0 = tl.a(var6_ref, var7_ref, -1);
              stackIn_60_0 = stackOut_52_0 ? 1 : 0;
              stackIn_53_0 = stackOut_52_0;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_53_0)) {
                var7_ref = (aa) (qk.field_g.d(8192));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7_ref == null) {
                break L15;
              }
              stackIn_60_0 = 74;
            }
            u.$cfr$intArgs$a$894bb1585d61(stackIn_60_0, var7_ref, var6_ref);
            if (var8 == 0) {
              return;
            }
            break;
          }
          qk.field_g.a(var6_ref, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1_ref), "jk.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        try {
          field_c = null;
          field_a = null;
          int var1_int = 5 / ((-70 - param0) / 36);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "jk.A(" + param0 + ')');
        }
    }

    jk() {
        try {
          this.field_d = false;
          this.field_f = false;
          this.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "jk.<init>()");
        }
    }

    static {
        field_a = new bh(4, 1, 1, 1);
        field_c = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
