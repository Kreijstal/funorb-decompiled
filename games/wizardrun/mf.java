/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mf extends r implements fj {
    static String[] field_g;
    static byte[][] field_j;
    static int[] field_h;
    private og field_i;

    abstract ok a(int param0, String param1);

    public final void a(int param0, og param1) {
        try {
          if (param0 > -111) {
            this.b((byte) -122);
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "mf.IA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean b(int param0) {
        if (param0 != 7245) {
          this.b(-4);
          if (null != this.field_i.field_k) {
            return this.field_i.field_k.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_i.field_k) {
          return true;
        }
        if (this.field_i.field_k.length() != 0) {
          return false;
        }
        return true;
    }

    abstract String a(String param0, int param1);

    final ok b(boolean param0) {
        if (!param0) {
          return (ok) null;
        }
        return this.a(-1, this.field_i.field_k);
    }

    public static void e(int param0) {
        field_h = null;
        if (param0 > 18) {
          field_j = (byte[][]) null;
          field_g = null;
          return;
        }
        kl var2 = (kl) null;
        mf.a((String) null, (String) null, (kl) null, (byte) 23);
        field_j = (byte[][]) null;
        field_g = null;
    }

    final String b(byte param0) {
        if (param0 < -12) {
          return this.a(this.field_i.field_k, -1);
        }
        og var3 = (og) null;
        this.a(-1, (og) null);
        return this.a(this.field_i.field_k, -1);
    }

    public final void a(og param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 5) {
            this.field_i = (og) null;
            this.a((byte) -112);
          } else {
            this.a((byte) -112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mf.FA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static db a(String param0, String param1, kl param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        db stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 91 / ((-19 - param3) / 54);
          var4_int = param2.b(-1, param0);
          var6 = param2.a(var4_int, param1, -11986);
          stackIn_1_0 = of.a(param2, var6, (byte) -128, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("mf.CA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    mf(og param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = new int[8192];
    }
}
