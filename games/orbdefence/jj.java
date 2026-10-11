/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends kj {
    int field_A;
    static String field_B;

    final static String a(int param0, long param1) {
        StringBuilder var14 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = OrbDefence.field_D ? 1 : 0;
        long var4Lifetime1;
        long var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        if (param1 <= 0L) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (0L == param1 % 37L) {
          return null;
        }
        int var3 = 0;
        if (param0 == 14461) {
          var4 = param1;
          while (var4 != 0L) {
            var4 = var4 / 37L;
            var3++;
          }
          var14 = new StringBuilder(var3);
          while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = nk.field_r[(int)(-(param1 * 37L) + var7)];
            if (var9 == 95) {
              var10 = var14.length() - 1;
              var14.setCharAt(var10, Character.toUpperCase(var14.charAt(var10)));
              var9 = 160;
            }
            discarded$0 = var14.append((char) var9);
          }
          var14.reverse();
          var14.setCharAt(0, Character.toUpperCase(var14.charAt(0)));
          return var14.toString();
        }
        java.applet.Applet var12 = (java.applet.Applet) null;
        jj.a((String) null, (byte) -111, (java.applet.Applet) null);
        var4Lifetime1 = param1;
        while (var4Lifetime1 != 0L) {
          var4Lifetime1 = var4Lifetime1 / 37L;
          var3++;
        }
        StringBuilder var13 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7Lifetime1 = param1;
          param1 = param1 / 37L;
          var9Lifetime1 = nk.field_r[(int)(-(param1 * 37L) + var7Lifetime1)];
          if (var9Lifetime1 == 95) {
            var10Lifetime1 = var13.length() - 1;
            var13.setCharAt(var10Lifetime1, Character.toUpperCase(var13.charAt(var10Lifetime1)));
            var9Lifetime1 = 160;
          }
          discarded$1 = var13.append((char) var9Lifetime1);
        }
        var13.reverse();
        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
        return var13.toString();
    }

    final void a(int param0, int param1, int param2, int param3) {
        hj var5 = null;
        if (param1 != 0) {
          return;
        }
        if (this.field_y == null) {
          return;
        }
        if (0 == this.field_A) {
          return;
        }
        if (this.field_A != 256) {
          var5 = new hj(this.field_y.field_m, this.field_y.field_r);
          de.a(-128, var5);
          this.field_y.a(0, param1, param2, 0);
          oc.g((byte) -105);
          var5.a(this.field_s + param3, param0 + this.field_n, this.field_A);
          return;
        }
        this.field_y.a(this.field_n + param0, param1, 1048575, this.field_s + param3);
    }

    jj(pj param0) {
        super(param0.field_s, param0.field_n, param0.field_m, param0.field_r, (td) null, (ag) null);
        try {
          param0.a(0, 0, this.field_r, (byte) -90, this.field_m);
          this.field_A = 256;
          this.field_y = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public jj() {
        super(0, 0, 0, 0, (td) null, (ag) null);
        this.field_A = 256;
    }

    public static void k(int param0) {
        if (param0 != 37) {
          return;
        }
        field_B = null;
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          int var4 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var3 = new java.net.URL(param2.getCodeBase(), param0);
              var3 = f.a(param2, var3, -95);
              var4 = 106 / ((param1 + 46) / 47);
              ke.a(var3.toString(), true, (byte) -100, param2);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var3_ref2;
            stackIn_6_1 = new StringBuilder().append("jj.G(");
            if (param0 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String l(int param0) {
        if (null == gb.field_h) {
          return "";
        }
        if (param0 < -94) {
          return gb.field_h;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        jj.a((String) null, (byte) 69, (java.applet.Applet) null);
        return gb.field_h;
    }

    static {
        field_B = "Waiting for graphics";
    }
}
