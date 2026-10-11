/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static String field_a;
    static String field_d;
    static ut field_e;
    static boolean field_c;
    static int field_b;

    public static void a(boolean param0) {
        try {
          field_a = null;
          field_d = null;
          field_e = null;
          if (param0) {
            tt.a(60, (byte[]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "tt.B(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        gg stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        gg stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        gg var6 = null;
        String var7 = null;
        gg var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        gg var6Lifetime1;
        var9 = Kickabout.field_G;
        try {
          var1 = un.field_e;
          var2 = var1.h((byte) -115);
          if (var2 == 0) {
            if (ni.field_m == null) {
              ni.field_m = new em(128);
              ou.field_y = 0;
            }
            stackIn_12_0 = (var1.h((byte) -110) != 1) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.a(-118);
            if (var3_int != 0) {
              var5 = var1.a(-95);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = fm.a(var4_ref_String, 145);
            var7 = var1.a(-113);
            var8 = mo.a(0, (CharSequence) ((Object) var4_ref_String));
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = fm.a(var7, 145);
              if (var6 != null) {
                ni.field_m.a(var6, (byte) -4, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new gg();
              ni.field_m.a(var6, (byte) -4, (long)var8.hashCode());
              fieldTemp$0 = ou.field_y;
              ou.field_y = ou.field_y + 1;
              var6.field_Cb = fieldTemp$0;
              qn.field_b.a(var6, 3);
            }
            var6.field_Eb = var7;
            var6.field_yb = var5;
            var6.field_Gb = var4_ref_String;
            return;
          }
          if (1 != var2) {
            if (var2 == 2) {
              if (1 == ts.field_d) {
                ts.field_d = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (2 == ts.field_d) {
                ts.field_d = 1;
              }
              return;
            }
            if (var2 == 4) {
              ts.field_d = 1;
              var3 = var1.a(111);
              bh.field_h = ((String) (var3)).intern();
              var4 = var1.h((byte) -115);
              en.a(var4, -1);
              return;
            }
            bd.a("F1: " + tr.b(0), (Throwable) null, 1);
            lr.b((byte) -116);
            if (param0 <= 38) {
              field_e = (ut) null;
            }
            return;
          }
          if (kw.field_b == null) {
            kw.field_b = new em(128);
            bc.field_d = 0;
          }
          var3Lifetime1 = var1.a(-126);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.a(34);
          var5Lifetime1 = var1.a(-112);
          var6Lifetime1 = tr.a(var4_ref_StringLifetime1, (byte) 40);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = tr.a(var5Lifetime1, (byte) 40);
            if (null != var6Lifetime1) {
              kw.field_b.a(var6Lifetime1, (byte) -4, (long)mo.a(0, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new gg();
            kw.field_b.a(var6Lifetime1, (byte) -4, (long)mo.a(0, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode());
            fieldTemp$1 = bc.field_d;
            bc.field_d = bc.field_d + 1;
            var6Lifetime1.field_Cb = fieldTemp$1;
            ne.field_I.a(var6Lifetime1, 3);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Eb = var5Lifetime1;
          var6Lifetime1.field_zb = (String) (var3Lifetime1);
          var6Lifetime1.field_Gb = var4_ref_StringLifetime1;
          var6Lifetime1.c((byte) -109);
          var7_ref = (gg) (ne.field_I.g(24009));
          L17: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var7_ref) {
              stackIn_61_0 = var7_ref;
              stackIn_61_1 = -21;
              stackIn_61_2 = var6Lifetime1;
              decompiledFrameRemainder0 = (var9 == 0);
              if ((decompiledFrameRemainder0) &&
                (po.$cfr$intArgs$a$d1a766881558(stackIn_61_0, stackIn_61_1, stackIn_61_2))) {
                var7_ref = (gg) (ne.field_I.c(33));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == var7_ref) {
                break L17;
              }
              stackIn_61_0 = var7_ref;
              stackIn_61_1 = 16737894;
              stackIn_61_2 = var6Lifetime1;
            }
            ug.a(stackIn_61_0, stackIn_61_1, stackIn_61_2);
            if (var9 == 0) {
              return;
            }
            break;
          }
          ne.field_I.a(var6Lifetime1, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "tt.A(" + param0 + ')');
        }
    }

    final static uo a(int param0, byte[] param1) {
        uo var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        uo stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12015) {
            tt.a(8, (byte[]) null);
          }
          if (param1 == null) {
            stackIn_5_0 = null;
            return (uo) (stackIn_5_0);
          }
          var2 = new uo(param1, aq.field_f, fc.field_g, ku.field_c, lo.field_j, pq.field_O);
          tk.h((byte) -82);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("tt.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_d = "You need <%0> to buy this pitch.";
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_b = 70;
    }
}
