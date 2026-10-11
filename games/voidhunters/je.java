/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static aba field_c;
    private mkb field_a;
    private mkb field_d;
    private vca field_b;

    final void a(boolean param0) {
        this.field_a.a(-108);
        if (param0) {
          je.b((byte) -55);
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = jwa.a(false, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (fg.a(var4.charAt(0), 104)) {
                return false;
              }
              if (fg.a(var4.charAt(var4.length() - 1), 26)) {
                return false;
              }
              var5 = 0;
              for (var6 = 0; param1.length() > var6; var6++) {
                var7 = param1.charAt(var6);
                if (!fg.a((char) var7, 46)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (0 < var5) {
                return false;
              }
              if (param0 != -31) {
                je.a((byte) 82);
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("je.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != 117) {
          je.b((byte) -3);
        }
    }

    final static void a(byte param0) {
        lsa var1 = (lsa) (vfa.field_p.d(0));
        if (param0 <= 108) {
          je.b((byte) -96);
        }
        if (var1 == null) {
          ifb.l(-116);
          return;
        }
        faa var2 = qga.field_b;
        var2.h(62);
        var2.h(90);
        var2.h(60);
        var2.h(93);
        var1.b(-3846);
    }

    final void a(int param0, pf param1) {
        try {
          this.field_a.a(param0, 786336, 97);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "je.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    je(pf param0) {
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        jaclib.memory.Buffer var9 = null;
        int var5Lifetime1;
        try {
          param0.a(10, new qma[]{new qma(new pb[]{pb.field_k, pb.field_d, pb.field_l}), new qma(pb.field_g)});
          this.field_a = param0.a(true, 3);
          this.field_d = param0.a(false, 3);
          this.field_d.a(12, 393168, 119);
          this.field_b = param0.a((byte) -19, false);
          this.field_b.a(25427, 49146);
          var7 = this.field_b.a((byte) -30, true);
          if (var7 != null) {
            var8 = param0.a(var7, false);
            if (jaclib.memory.Stream.a()) {
              for (var4_int = 0; var4_int < 8191; var4_int++) {
                var5 = var4_int * 4;
                var8.b(var5);
                var8.b(var5 + 1);
                var8.b(var5 + 2);
                var8.b(var5 + 2);
                var8.b(3 + var5);
                var8.b(var5);
              }
            } else {
              for (var4_int = 0; 8191 > var4_int; var4_int++) {
                var5 = 4 * var4_int;
                var8.a(var5);
                var8.a(var5 + 1);
                var8.a(var5 + 2);
                var8.a(2 + var5);
                var8.a(var5 + 3);
                var8.a(var5);
              }
            }
            var8.b();
            this.field_b.b(-93);
          }
          var9 = this.field_d.a(true, (byte) 41);
          if (var9 != null) {
            var4 = param0.a(var9, false);
            if (jaclib.memory.Stream.a()) {
              for (var5Lifetime1 = 0; var5Lifetime1 < 8191; var5Lifetime1++) {
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
                var4.b(0.0f);
                var4.b(-1.0f);
                var4.b(0.0f);
              }
            } else {
              for (var5Lifetime1 = 0; var5Lifetime1 < 8191; var5Lifetime1++) {
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
                var4.a(0.0f);
                var4.a(-1.0f);
                var4.a(0.0f);
              }
            }
            var4.b();
            this.field_d.b(-20836);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("je.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_c = new aba();
    }
}
