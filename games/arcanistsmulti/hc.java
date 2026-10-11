/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    private String field_b;
    static String field_d;
    private boolean field_c;
    static db field_i;
    static String field_g;
    static int[] field_e;
    static String field_a;
    static boolean field_f;
    static db field_h;

    hc(String param0) {
        this(param0, false);
    }

    final static String b(byte param0) {
        if (param0 >= -105) {
          field_d = (String) null;
          if (sk.field_a != in.field_Gb) {
            return vh.field_o;
          }
          return kf.field_a;
        }
        if (sk.field_a != in.field_Gb) {
          return vh.field_o;
        }
        return kf.field_a;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 != 27901) {
                field_f = true;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(nm.a(param0, var2, -31843), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("hc.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    hc(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = param0;
          stackIn_4_1 = (param1);
          this.field_c = stackIn_4_1;
          if (this.field_b == null) {
            this.field_b = "";
          }
          if (this.field_b.length() != 0) {
            return;
          }
          this.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("hc.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 == -1) {
          return hb.field_Gb == sk.field_a ? true : false;
        }
        field_a = (String) null;
        return hb.field_Gb == sk.field_a ? true : false;
    }

    final String b(int param0) {
        int var2 = -73 % ((19 - param0) / 42);
        return this.field_b;
    }

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 == -60) {
          field_e = null;
          field_g = null;
          field_i = null;
          return;
        }
        hc.a((byte) -54);
        field_e = null;
        field_g = null;
        field_i = null;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        return this.field_c;
    }

    static {
        field_d = "Location";
        field_i = new db();
        field_g = "You can only cast this spell once per turn";
        field_a = "Character's Spells";
        field_h = new db();
    }
}
