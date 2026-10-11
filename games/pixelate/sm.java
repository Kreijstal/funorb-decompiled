/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends fa {
    int[] field_o;
    static String field_n;
    static boolean field_l;
    int field_p;
    static ak field_m;
    static String field_k;

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            return true;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_4_0 = eq.field_Hb.equals(dh.a(var3, (byte) 72));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sm.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3;
        Object var4;
        Object var5;
        String var6;
        CharSequence var7;
        CharSequence var8;
        int var3Lifetime1;
        Object var4Lifetime1;
        Object var5Lifetime1;
        String var6Lifetime1;
        if (param2 != 0) {
          field_l = true;
          if (he.field_f == null) {
            return;
          }
          var3 = he.field_f.b(-126, param1);
          if (var3 == 0) {
            return;
          }
          if (2 == var3 &&
            he.field_f.field_cb != null &&
            !he.field_f.field_cb.equals("")) {
            if (91 != he.field_f.field_cb.charAt(0)) {
              var7 = (CharSequence) ((Object) he.field_f.field_cb);
              var4 = dh.a(var7, (byte) 26);
            } else {
              var4 = he.field_f.field_cb;
            }
            var5 = null;
            if (il.field_e == 0) {
              var5 = jf.a((String) (var4), param0, (byte) 108);
            }
            if (il.field_e == 1) {
              var5 = ff.a(param0, (String) (var4), (byte) -106);
            }
            if (il.field_e == 2) {
              var5 = mj.a(-34, (String) (var4), param0);
            }
            if (il.field_e == 3) {
              var5 = aq.a((String) (var4), param0, (String) (var4), -20867);
              var4 = var5;
              var4 = var5;
            }
            if (var5 != null) {
              var6 = (String) null;
              ti.a(0, (String) null, (String) (var4), (byte) -59, 2, (String) (var5));
            }
          }
          he.field_f = null;
          il.field_e = -1;
          return;
        }
        if (he.field_f == null) {
          return;
        }
        var3Lifetime1 = he.field_f.b(-126, param1);
        if (var3Lifetime1 == 0) {
          return;
        }
        if (2 != var3Lifetime1) {
          he.field_f = null;
          il.field_e = -1;
          return;
        }
        if (he.field_f.field_cb == null) {
          he.field_f = null;
          il.field_e = -1;
          return;
        }
        if (he.field_f.field_cb.equals("")) {
          he.field_f = null;
          il.field_e = -1;
          return;
        }
        if (91 != he.field_f.field_cb.charAt(0)) {
          var8 = (CharSequence) ((Object) he.field_f.field_cb);
          var4Lifetime1 = dh.a(var8, (byte) 26);
        } else {
          var4Lifetime1 = he.field_f.field_cb;
        }
        var5Lifetime1 = null;
        if (il.field_e == 0) {
          var5Lifetime1 = jf.a((String) (var4Lifetime1), param0, (byte) 108);
        }
        if (il.field_e == 1) {
          var5Lifetime1 = ff.a(param0, (String) (var4Lifetime1), (byte) -106);
        }
        if (il.field_e == 2) {
          var5Lifetime1 = mj.a(-34, (String) (var4Lifetime1), param0);
        }
        if (il.field_e == 3) {
          var5Lifetime1 = aq.a((String) (var4Lifetime1), param0, (String) (var4Lifetime1), -20867);
        }
        if (var5Lifetime1 == null) {
          he.field_f = null;
          il.field_e = -1;
          return;
        }
        var6Lifetime1 = (String) null;
        ti.a(0, (String) null, (String) (var4Lifetime1), (byte) -59, 2, (String) (var5Lifetime1));
        he.field_f = null;
        il.field_e = -1;
        return;
    }

    public static void a(byte param0) {
        field_m = null;
        field_k = null;
        field_n = null;
        if (param0 >= -99) {
          sm.a((byte) -113);
        }
    }

    private sm() throws Throwable {
        throw new Error();
    }

    static {
        field_l = false;
        field_k = "(1 player wants to join)";
        field_n = "Please select an option in the '<%0>' row.";
    }
}
