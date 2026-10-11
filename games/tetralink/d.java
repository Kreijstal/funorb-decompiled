/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class d implements vm {
    static int field_j;
    private long field_d;
    static ah field_i;
    static String field_g;
    static byte[][] field_f;
    static int field_h;
    static int field_b;
    static String field_a;
    static int field_e;
    static String[][] field_c;

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = TetraLink.field_J;
          try {
            if (kn.field_e) {
              return true;
            }
            if (param0 != -17840) {
              field_c = (String[][]) null;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (ii.a((byte) 122, "getcookies", param1));
              var4 = hi.a(var3, ';', 783);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("d.M(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean c(byte param0) {
        if (param0 <= 32) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          d.a(114, (java.applet.Applet) null);
          if (null == sj.field_g) {
            return hi.field_a ? true : false;
          }
          return true;
        }
        if (null != sj.field_g) {
          return true;
        }
        if (!hi.field_a) {
          return false;
        }
        return true;
    }

    public final jk c(int param0) {
        if (this.b(13074)) {
          return an.field_a;
        }
        if (param0 > -7) {
          return (jk) null;
        }
        if (!(k.a(0) >= 350L + this.field_d)) {
          return pm.field_b;
        }
        return this.a(false);
    }

    public final void a(int param0) {
        this.field_d = k.a(0);
        if (param0 < 117) {
          d.b((byte) 100);
        }
    }

    public final String a(byte param0) {
        if (this.b(param0 + 13147)) {
          return null;
        }
        if (param0 != -73) {
          field_e = -50;
          if (350L + this.field_d <= k.a(0)) {
            return this.e(0);
          }
          return null;
        }
        if (350L + this.field_d <= k.a(0)) {
          return this.e(0);
        }
        return null;
    }

    public static void b(byte param0) {
        field_c = (String[][]) null;
        if (param0 == 6) {
          field_i = null;
          field_a = null;
          field_g = null;
          field_f = (byte[][]) null;
          return;
        }
        d.d(112);
        field_i = null;
        field_a = null;
        field_g = null;
        field_f = (byte[][]) null;
    }

    abstract jk a(boolean param0);

    final static void d(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TetraLink.field_J;
        try {
          var5 = ug.field_bb;
          var1 = var5;
          if (param0 > -65) {
            field_g = (String) null;
          }
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "d.J(" + param0 + ')');
        }
    }

    abstract String e(int param0);

    static {
        field_g = "Asking to join <%0>'s game...";
        field_f = new byte[1000][];
        field_a = "Close";
        field_e = 0;
        field_c = new String[][]{new String[]{"120", "90", "60", "45", "30", "20", "10"}};
    }
}
