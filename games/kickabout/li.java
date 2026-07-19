/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String[] field_c;
    Object field_d;
    static String field_f;
    static String field_e;
    static hd field_a;
    boolean field_b;
    static int field_h;
    static int[] field_g;

    final static void a(int param0, byte param1) {
        if (param1 < 8) {
            li.a((byte) -49);
            ms.a(0, param0);
            return;
        }
        ms.a(0, param0);
    }

    public final String toString() {
        if (this.field_b) {
            return rm.a(this.field_d, (byte) 117) + "{" + this.field_d + "}";
        }
        if (!(null != this.field_d)) {
            return "null";
        }
        return this.field_d.toString();
    }

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        String var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              np.field_Jb.a(new nq(param1), 3);
              if (param0 == 2009) {
                break L1;
              } else {
                var3 = (String) null;
                li.a(79, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("li.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final long a(boolean param0) {
        if (this.field_d instanceof Long) {
          return ((Long) (this.field_d)).longValue();
        } else {
          if (!(this.field_d instanceof Integer)) {
            if (!(this.field_d instanceof Short)) {
              if (this.field_d instanceof Byte) {
                return ((Byte) (this.field_d)).longValue();
              } else {
                if (this.field_d instanceof Double) {
                  return ((Double) (this.field_d)).longValue();
                } else {
                  if (param0) {
                    if (this.field_d instanceof Float) {
                      return ((Float) (this.field_d)).longValue();
                    } else {
                      throw new ClassCastException();
                    }
                  } else {
                    field_a = (hd) null;
                    if (this.field_d instanceof Float) {
                      return ((Float) (this.field_d)).longValue();
                    } else {
                      throw new ClassCastException();
                    }
                  }
                }
              }
            } else {
              return ((Short) (this.field_d)).longValue();
            }
          } else {
            return ((Integer) (this.field_d)).longValue();
          }
        }
    }

    final int b(int param0) {
        if (param0 == -30368) {
          if (this.field_d instanceof Integer) {
            return ((Integer) (this.field_d)).intValue();
          } else {
            return (int)this.a(true);
          }
        } else {
          field_h = -65;
          if (this.field_d instanceof Integer) {
            return ((Integer) (this.field_d)).intValue();
          } else {
            return (int)this.a(true);
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ((Boolean) (this.field_d)).booleanValue();
    }

    final byte a(int param0) {
        if (param0 != 0) {
            this.field_d = (Object) null;
            if (!(!(this.field_d instanceof Byte))) {
                return ((Byte) (this.field_d)).byteValue();
            }
            return (byte)(int)this.a(true);
        }
        if (!(!(this.field_d instanceof Byte))) {
            return ((Byte) (this.field_d)).byteValue();
        }
        return (byte)(int)this.a(true);
    }

    public static void a(byte param0) {
        String var2 = null;
        field_c = null;
        field_f = null;
        if (param0 > -101) {
          var2 = (String) null;
          li.a(121, (String) null);
          field_g = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_g = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    li(int param0) {
        this.field_d = new Integer(param0);
        this.field_b = true;
    }

    li(byte param0) {
        this.field_d = new Byte(param0);
        this.field_b = true;
    }

    li(long param0) {
        this.field_d = new Long(param0);
        this.field_b = true;
    }

    li(boolean param0) {
        this.field_d = new Boolean(param0);
        this.field_b = true;
    }

    li(float param0) {
        this.field_d = new Float(param0);
        this.field_b = true;
    }

    li(double param0) {
        this.field_d = new Double(param0);
        this.field_b = true;
    }

    li(char param0) {
        this.field_d = new Character(param0);
        this.field_b = true;
    }

    li(Object param0) {
        try {
            this.field_b = false;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "This pitch is locked. To unlock the <%0>, first buy the <%1>.";
        field_f = "All games";
        field_g = new int[8192];
        field_h = 0;
    }
}
