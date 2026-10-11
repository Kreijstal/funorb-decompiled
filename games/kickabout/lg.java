/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lg implements l {
    static ut field_a;
    static String field_c;
    private long field_b;

    abstract rv a(boolean param0);

    final static byte[] a(Object param0, boolean param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        pf var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param0 instanceof byte[]) {
            var3 = (byte[]) (param0);
            if (param1) {
              stackIn_9_0 = vq.a(70, var3);
              return stackIn_9_0;
            }
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          if (param0 instanceof pf) {
            var4 = (pf) (param0);
            stackIn_13_0 = var4.a(2);
            return stackIn_13_0;
          }
          if (param2 == 18828) {
            throw new IllegalArgumentException();
          }
          stackIn_16_0 = (byte[]) null;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("lg.W(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final String b(int param0) {
        if (this.a((byte) -28)) {
          return null;
        }
        if (param0 > -23) {
          field_c = (String) null;
          if (nj.a(37) >= (350L + this.field_b)) {
            return this.e(-1);
          }
          return null;
        }
        if (nj.a(37) >= (350L + this.field_b)) {
          return this.e(-1);
        }
        return null;
    }

    public final rv c(int param0) {
        if (this.a((byte) -28)) {
          return os.field_l;
        }
        if (nj.a(-104) < 350L + this.field_b) {
          return mn.field_c;
        }
        if (param0 == -24407) {
          return this.a(false);
        }
        field_a = (ut) null;
        return this.a(false);
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 != 350) {
          return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 79) {
            var3 = (Object) null;
            lg.a((Object) null, true, -58);
          }
          if (param0 != null &&
            param0.length() >= aq.field_c &&
            param0.length() <= ko.field_c) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("lg.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0) {
        this.field_b = nj.a(-122);
        int var2 = 76 % ((42 - param0) / 58);
    }

    final static js a(int param0, int param1) {
        if (param0 == -1) {
          return (js) ((Object) um.field_e);
        }
        if (param0 == -2) {
          return (js) ((Object) sr.field_l);
        }
        if (param1 != 24939) {
          return (js) null;
        }
        if (param0 == -3) {
          return (js) ((Object) new kt());
        }
        if (param0 == -5) {
          return (js) ((Object) new e());
        }
        if (0 > param0) {
          throw new IllegalStateException();
        }
        return (js) ((Object) rn.a(-118, param0));
    }

    abstract String e(int param0);

    static {
        field_c = "Records";
        field_a = new ut(926, 1374);
    }
}
