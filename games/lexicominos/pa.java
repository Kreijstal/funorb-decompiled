/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static db field_a;
    static int field_d;
    static String field_c;
    static String field_b;

    final static boolean a(int param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 65) {
            stackIn_7_0 = (param0 == (-param0 & param0));
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "pa.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        try {
          field_a = null;
          field_c = null;
          field_b = null;
          if (param0 != 2) {
            field_d = -126;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "pa.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        th var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        hc var5_ref = null;
        hc var6 = null;
        String var6_ref = null;
        hc var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var1 = ig.field_a;
          var2 = var1.d(true);
          if (var2 == 0) {
            if (null == cl.field_P) {
              cl.field_P = new he(128);
              sc.field_b = 0;
            }
            stackIn_11_0 = (var1.d(true) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.c(false);
            if (var3_int != 0) {
              var1.c(false);
            }
            var5_ref = cj.a((byte) 114, var4_ref_String);
            var6_ref = var1.c(false);
            var7_ref = ck.a((CharSequence) ((Object) var4_ref_String), (byte) -48);
            if (null == var7_ref) {
              var7_ref = var4_ref_String;
            }
            if (var5_ref == null) {
              var5_ref = cj.a((byte) -109, var6_ref);
              if (var5_ref != null) {
                cl.field_P.a(var5_ref, (long)var7_ref.hashCode(), (byte) 64);
              }
            }
            if (null == var5_ref) {
              var5_ref = new hc();
              cl.field_P.a(var5_ref, (long)var7_ref.hashCode(), (byte) 64);
              fieldTemp$1 = sc.field_b;
              sc.field_b = sc.field_b + 1;
              var5_ref.field_hb = fieldTemp$1;
              fk.field_i.b(param0 + 86, var5_ref);
            }
            var5_ref.field_R = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (2 == var2) {
              if (1 == vl.field_b) {
                vl.field_b = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (vl.field_b == 2) {
                vl.field_b = 1;
              }
              return;
            }
            if (4 == var2) {
              vl.field_b = 1;
              var3 = var1.c(false);
              ji.field_b = ((String) (var3)).intern();
              var4 = var1.d(true);
              wh.a(var4, (byte) 63);
              return;
            }
            uj.a("F1: " + qj.h(-124), (Throwable) null, param0 ^ 14);
            ck.$cfr$intArgs$b$e683eeaaf5b5(-45);
            if (param0 != 15) {
              pa.b(35);
            }
            return;
          }
          if (null == pf.field_n) {
            pf.field_n = new he(128);
            ad.field_c = 0;
          }
          var3Lifetime1 = var1.c(false);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.c(false);
          var5 = var1.c(false);
          var6 = sg.a((byte) 71, var4_ref_StringLifetime1);
          if (null == var6) {
            var6 = sg.a((byte) 126, var5);
            if (var6 != null) {
              pf.field_n.a(var6, (long)ck.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) -48).hashCode(), (byte) 64);
            }
          }
          if (var6 == null) {
            var6 = new hc();
            pf.field_n.a(var6, (long)ck.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) -48).hashCode(), (byte) 64);
            fieldTemp$0 = ad.field_c;
            ad.field_c = ad.field_c + 1;
            var6.field_hb = fieldTemp$0;
            ec.field_e.b(105, var6);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_jb = (String) (var3Lifetime1);
          var6.field_R = var4_ref_StringLifetime1;
          var6.b((byte) -117);
          var7 = (hc) (ec.field_e.a(true));
          while (var7 != null) {
            if (bl.a((byte) 111, var7, var6)) {
              var7 = (hc) (ec.field_e.f(2));
              if (var8 == 0) {
                continue;
              }
            }
            break;
          }
          if (null != var7) {
            vf.a(var7, param0 - 15, var6);
            if (var8 == 0) {
              return;
            }
          }
          ec.field_e.b(114, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "pa.B(" + param0 + ')');
        }
    }

    static {
        field_d = 15;
        field_b = "To server list";
        field_c = "Cancel";
    }
}
