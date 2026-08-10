/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class di extends v implements se {
    static int field_i;
    private lb field_k;
    static String field_l;
    static String field_j;
    static int field_h;

    final String b(byte param0) {
        if (param0 != 22) {
            return (String) null;
        }
        return this.a(this.field_k.field_s, 426);
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 24685) {
          if (this.field_k.field_s != null) {
            if (this.field_k.field_s.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          this.b((byte) 69);
          if (this.field_k.field_s == null) {
            return true;
          } else {
            L0: {
              if (this.field_k.field_s.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final ud f(int param0) {
        int var2 = -119 / ((-30 - param0) / 56);
        return this.a(-120, this.field_k.field_s);
    }

    public final void a(int param0, lb param1) {
        try {
            this.a(52);
            if (param0 != -12230) {
                this.b(30);
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "di.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String a(String param0, int param1);

    public final void b(int param0, lb param1) {
        try {
            if (param0 >= -23) {
                di.c((byte) -43);
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "di.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    di(lb param0) {
        try {
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 != 73) {
            return;
        }
        field_j = null;
    }

    abstract ud a(int param0, String param1);

    static {
        field_l = "Orb coins: <%0>";
        field_j = "Age:";
    }
}
