/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends qe {
    private aaa field_c;
    private tla field_d;

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_16_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (dp.a(123, param1.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (!sqa.a((CharSequence) ((Object) var7_ref_String), -3)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (62 != param1.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = jb.a((CharSequence) ((Object) var7_ref_String), (byte) 70);
              var4 = var4 + (param2[var8].length() + (-var5 + var6_int));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          if (param0 < 81) {
            stackIn_16_0 = (String) null;
            return stackIn_16_0;
          }
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_30_0 = var6.toString();
              return stackIn_30_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (dp.a(113, param1.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!sqa.a((CharSequence) ((Object) var9), -3)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param1.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = jb.a((CharSequence) ((Object) var9), (byte) 70);
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("gl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
          this.field_d = (tla) null;
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, kl param2) {
        try {
          this.field_a.a(true, param2);
          this.field_a.d(1, param0);
          if (param1 != 32221) {
            this.field_c = (aaa) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gl.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        String var5 = (String) null;
        ag.a(param0, param1, false, (String) null);
        if (param2 < 87) {
          String[] var4 = (String[]) null;
          gl.$cfr$intArgs$a$53ce4ab4c593(-98, (String) null, (String[]) null);
        }
    }

    final void b(boolean param0, int param1) {
        if (param1 <= 77) {
          this.field_c = (aaa) null;
        }
    }

    final void a(int param0, int param1, int param2) {
        float stackIn_5_0 = 0.0f;
        int stackIn_8_0 = 0;
        float var4;
        float var5;
        float var6;
        int var7;
        int var8;
        int var9;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param2 <= 117) {
          this.a(true);
        }
        var4 = -0.0005000000237487257f * (float)((param0 & 3) + 1);
        var5 = 0.0005000000237487257f * (float)((3 & param0 >> 3) + 1);
        stackIn_5_0 = ((64 & param0) == 0) ? 0.00048828125f : 0.0009765625f;
        var6 = stackIn_5_0;
        stackIn_8_0 = ((param0 & 128) == 0) ? 0 : 1;
        var7 = stackIn_8_0;
        this.field_a.e(1, true);
        if (var7 == 0) {
          ka.field_b[2] = var6;
          ka.field_b[0] = 0.0f;
          ka.field_b[3] = 0.0f;
          ka.field_b[1] = 0.0f;
        } else {
          ka.field_b[3] = 0.0f;
          ka.field_b[1] = 0.0f;
          ka.field_b[0] = var6;
          ka.field_b[2] = 0.0f;
        }
        jaggl.OpenGL.glTexGenfv(8192, 9474, ka.field_b, 0);
        ka.field_b[2] = 0.0f;
        ka.field_b[1] = var6;
        ka.field_b[0] = 0.0f;
        ka.field_b[3] = var4 * (float)this.field_a.field_Oc % 1.0f;
        jaggl.OpenGL.glTexGenfv(8193, 9474, ka.field_b, 0);
        if (!this.field_c.field_g) {
          var8 = (int)(16.0f * (var5 * (float)this.field_a.field_Oc));
          this.field_a.a(true, this.field_c.field_i[var8 % 16]);
        } else {
          ka.field_b[3] = var5 * (float)this.field_a.field_Oc % 1.0f;
          ka.field_b[1] = 0.0f;
          ka.field_b[2] = 0.0f;
          ka.field_b[0] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, ka.field_b, 0);
        }
        this.field_a.e(0, true);
    }

    final void a(boolean param0) {
        this.field_d.a(4864, '\001');
        if (param0) {
          return;
        }
        this.field_a.e(1, true);
        this.field_a.a(true, (kl) null);
        this.field_a.e(0, !param0 ? true : false);
    }

    gl(cka param0, aaa param1) {
        super(param0);
        try {
          this.field_c = param1;
          this.field_d = new tla(param0, 2);
          this.field_d.a((byte) 6, 0);
          this.field_a.e(1, true);
          if (this.field_c.field_g) {
            jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
            jaggl.OpenGL.glEnable(3170);
          }
          jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
          jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          this.field_a.e(0, true);
          this.field_d.b((byte) 77);
          this.field_d.a((byte) 6, 1);
          this.field_a.e(1, true);
          if (this.field_c.field_g) {
            jaggl.OpenGL.glDisable(3170);
          }
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          this.field_a.e(0, true);
          this.field_d.b((byte) 10);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_d.a(4864, '\0');
        int var3 = -99 / ((56 - param1) / 48);
        if (this.field_c.field_g) {
          this.field_a.e(1, true);
          this.field_a.a(true, this.field_c.field_a);
          this.field_a.e(0, true);
        }
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$53ce4ab4c593(int param0, String param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_16_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (dp.a(123, param1.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (!sqa.a((CharSequence) ((Object) var7_ref_String), -3)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (62 != param1.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = jb.a((CharSequence) ((Object) var7_ref_String), (byte) 70);
              var4 = var4 + (param2[var8].length() + (-var5 + var6_int));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          if (param0 < 81) {
            stackIn_16_0 = (String) null;
            return stackIn_16_0;
          }
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_30_0 = var6.toString();
              return stackIn_30_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (dp.a(113, param1.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!sqa.a((CharSequence) ((Object) var9), -3)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param1.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = jb.a((CharSequence) ((Object) var9), (byte) 70);
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("gl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }
}
