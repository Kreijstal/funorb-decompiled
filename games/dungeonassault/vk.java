/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_e;
    String[] field_c;
    int field_d;
    boolean field_a;
    String field_g;
    static String field_h;
    static String field_b;
    boolean field_f;

    final static b a(Throwable param0, String param1) {
        b var2 = null;
        if (!(param0 instanceof b)) {
          var2 = new b(param0, param1);
        } else {
          var2 = (b) ((Object) param0);
          var2.field_c = var2.field_c + ' ' + param1;
        }
        return var2;
    }

    final static boolean a(int param0) {
        if (param0 != 22084) {
          field_b = (String) null;
          if (kh.field_n < 10) {
            return false;
          }
          if (dk.field_c >= 13) {
            return true;
          }
          return false;
        }
        if (kh.field_n < 10) {
          return false;
        }
        if (dk.field_c >= 13) {
          return true;
        }
        return false;
    }

    final static vk a(byte param0, String param1) {
        RuntimeException var2 = null;
        vk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vk stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -126) {
            stackIn_2_0 = (vk) null;
            return stackIn_2_0;
          }
          if (wd.field_d == ql.field_f) {
            stackIn_5_0 = null;
            return (vk) (stackIn_5_0);
          }
          if (wd.field_d == dh.field_b &&
            param1.equals(bf.field_o)) {
            wd.field_d = sp.field_e;
            stackIn_9_0 = ll.field_p;
            return stackIn_9_0;
          }
          wd.field_d = ql.field_f;
          bf.field_o = param1;
          ll.field_p = null;
          stackIn_11_0 = null;
          return (vk) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("vk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -31) {
          return;
        }
        d.field_f = false;
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != 75) {
          return;
        }
        field_h = null;
    }

    vk(boolean param0) {
        this.field_a = param0 ? true : false;
    }

    static {
        field_h = "Type your age in years";
        field_b = "This female demon sports a manic smile and a sadistic look in her wide, wild eyes. She uses her sharp claws to rend flesh and takes pleasure in death.";
    }
}
