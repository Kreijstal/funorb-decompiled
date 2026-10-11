/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends ia {
    static String field_q;
    private jf field_n;
    static IndexedSprite[] field_r;
    static String field_o;
    private jf field_p;

    final vd a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        vd stackIn_4_0 = null;
        vd stackIn_7_0 = null;
        vd stackIn_10_0 = null;
        vd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_p.field_y.toLowerCase();
          var4 = param0.toLowerCase();
          if (param1 != -1) {
            var5 = (String) null;
            vm.b((String) null, 32);
          }
          if (var4.length() == 0) {
            stackIn_4_0 = fa.field_d;
            return stackIn_4_0;
          }
          if (!lk.a(var4, (byte) 62, var3)) {
            stackIn_7_0 = fa.field_d;
            return stackIn_7_0;
          }
          if (!this.b(1, param0)) {
            stackIn_12_0 = vf.field_b;
            return stackIn_12_0;
          }
          stackIn_10_0 = fa.field_d;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("vm.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            vm.d((byte) 43);
          }
          var3 = this.field_n.field_y.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (0 >= var4.length()) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("vm.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_p.field_y.toLowerCase();
          var4 = param1.toLowerCase();
          if (0 == var4.length()) {
            return null;
          }
          var5 = var4;
          if (mn.a(-30157, var5)) {
            stackIn_6_0 = el.field_Zb;
            return stackIn_6_0;
          }
          if (vm.b(var5, 109)) {
            stackIn_10_0 = ua.field_u;
            return stackIn_10_0;
          }
          if (eb.b(var5, 29974)) {
            stackIn_14_0 = pc.field_s;
            return stackIn_14_0;
          }
          if (param0 != 100) {
            stackIn_17_0 = (String) null;
            return stackIn_17_0;
          }
          if (this.b(1, param1)) {
            stackIn_20_0 = ej.field_z;
            return stackIn_20_0;
          }
          if (var6.length() <= 0) {
            stackIn_35_0 = tm.field_b;
            return stackIn_35_0;
          }
          if (nj.a(var5, 300, var6)) {
            stackIn_24_0 = pd.field_R;
            return stackIn_24_0;
          }
          if (fj.a(var6, -7036, var5)) {
            stackIn_28_0 = CipherPacketBuffer.field_C;
            return stackIn_28_0;
          }
          if (!Projectile.a(var5, true, var6)) {
            stackIn_33_0 = el.field_Zb;
            return stackIn_33_0;
          }
          stackIn_31_0 = pd.field_R;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("vm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    vm(jf param0, jf param1, jf param2) {
        super(param0);
        try {
          this.field_p = param1;
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "vm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        int var1 = 56 % ((param0 - 10) / 37);
        field_o = null;
        field_q = null;
        field_r = null;
    }

    final static void a(int param0, int param1, rh param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        CipherPacketBuffer var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = mm.field_g;
          var6.writeCipheredOpcode(param0, (byte) -117);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte((byte) 108, 1);
          if (param2.field_r != null) {
            var6.writeByte((byte) 125, param2.field_r.length);
            var6.writeBytes(param2.field_r.length, (byte) -122, 0, param2.field_r);
          } else {
            var6.writeByte((byte) 113, 0);
          }
          var6.f(-101, var4);
          var6.position = var6.position - 4;
          param2.field_x = var6.readInt(0);
          var6.b((byte) 101, var6.position - var4);
          if (param1 < -38) {
            return;
          }
          var5 = (String) null;
          vm.b((String) null, 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vm.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean b(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        var4 = SteelSentinels.obfuscationControl;
        try {
          for (var2_int = 0; param0.length() > var2_int; var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!kf.a((char) var3, (byte) -59) &&
              !oa.a(-4278, (char) var3)) {
              return true;
            }
          }
          var3Lifetime1 = 49 / ((param1 + 23) / 51);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("vm.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = "A highscore of <%0> has been achieved!";
        field_o = "<%1> was too close to a missile intercepted by <%0>";
    }
}
