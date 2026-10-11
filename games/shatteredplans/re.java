/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static int[] field_d;
    private bc field_c;
    private bc field_e;
    static qr[] field_g;
    static int field_b;
    private ol field_f;
    static qr field_h;
    static int field_a;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 0) {
          String[] var6 = (String[]) null;
          re.a((String) null, -43, (String[]) null);
        }
        return (int)((double)(-param0 + param3) * wm.a(param2, (byte) 114, param1)) + param0;
    }

    final static void a(java.awt.Canvas param0, boolean param1) {
        pr.a((java.awt.Component) ((Object) param0), -9194);
        if (param1) {
          return;
        }
        try {
          wk.a((byte) -58, (java.awt.Component) ((Object) param0));
          if (aj.field_b != null) {
            aj.field_b.a((java.awt.Component) ((Object) param0), !param1 ? true : false);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "re.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
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
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var5 < var3_int; var5++) {
                if (dk.a((byte) -83, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!go.a(0, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = ma.a((CharSequence) ((Object) var7_ref_String), 2);
              var4 = var4 + (param2[var8].length() - var5 + var6_int);
              continue;
            }
            break;
          }
          if (param1 != 4371) {
            field_g = (qr[]) null;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              stackIn_30_0 = var6.toString();
              return stackIn_30_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (dk.a((byte) 115, param0.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param0.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!go.a(0, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = ma.a((CharSequence) ((Object) var9), 2);
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("re.C(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final dp a(byte param0, int param1) {
        byte[] var4 = null;
        dp var3 = (dp) (this.field_f.a((long)param1, 0));
        if (param0 != 47) {
          return (dp) null;
        }
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_c.a(1, -1, 32767 & param1);
        } else {
          var4 = this.field_e.a(1, param0 - 48, param1);
        }
        var3 = new dp();
        if (var4 != null) {
          var3.a(new ob(var4), 0);
        }
        if (32768 <= param1) {
          var3.e((byte) -117);
        }
        this.field_f.a((long)param1, var3, (byte) -108);
        return var3;
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 <= 105) {
          return;
        }
        field_h = null;
    }

    re(int param0, bc param1, bc param2, wr param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_f = new ol(64);
        try {
          this.field_e = param1;
          this.field_c = param2;
          if (null != this.field_e) {
            this.field_e.a(1, -26268);
          }
          if (this.field_c != null) {
            this.field_c.a(1, -26268);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("re.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static bi[] a(bi[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        bi var3 = null;
        int var4 = 0;
        bi[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].field_x = 0;
            var3.field_t = 0;
            param0[var2_int].field_o = param0[var2_int].field_z;
            param0[var2_int].field_p = param0[var2_int].field_w;
          }
          if (param1 <= 32) {
            re.a((byte) 21);
          }
          stackIn_7_0 = (bi[]) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("re.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = 64;
    }
}
