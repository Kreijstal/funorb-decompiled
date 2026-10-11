/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tsa extends ksa {
    String field_d;
    int field_e;
    static int field_h;
    int field_g;
    ij field_f;

    public final String toString() {
        if (this.field_e == hpa.field_p) {
          return "Method{" + this.field_d + "}";
        }
        if (fwa.field_h == this.field_e) {
          return "Number{" + this.field_d + "}";
        }
        if (io.field_p == this.field_e) {
          return "Boolean{" + this.field_d + "}";
        }
        if (this.field_e == ek.field_o) {
          return "Char{" + this.field_d + "}";
        }
        if (dla.field_d == this.field_e) {
          return "String{" + this.field_d + "}";
        }
        if (this.field_e == wdb.field_vb) {
          return "ArgStart";
        }
        if (ua.field_o == this.field_e) {
          return "ArgEnd";
        }
        if (jwa.field_l != this.field_e) {
          return "Unknown";
        }
        return "ArgComma";
    }

    final nc a(byte param0, rqa[] param1) throws gva, ojb {
        int incrementValue$0 = 0;
        nc stackIn_3_0 = null;
        nc stackIn_10_0 = null;
        nc stackIn_16_0 = null;
        nc stackIn_19_0 = null;
        nc stackIn_23_0 = null;
        nc stackIn_25_0 = null;
        nc stackIn_29_0 = null;
        nc stackIn_35_0 = null;
        nc stackIn_39_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        nc[] var7 = null;
        nc[] var8 = null;
        String var9 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 <= 60) {
            stackIn_3_0 = (nc) null;
            return stackIn_3_0;
          }
          try {
            if (this.field_e == hpa.field_p) {
              var7 = new nc[this.field_f.c(3)];
              var8 = var7;
              var4 = 0;
              var5 = (tsa) (this.field_f.d(0));
              while (var5 != null) {
                incrementValue$0 = var4;
                var4++;
                var7[incrementValue$0] = var5.a((byte) 96, param1);
                var5 = (tsa) (this.field_f.a((byte) 69));
              }
              stackIn_10_0 = fjb.a(this.field_d, var8, param1, (byte) -124);
              return stackIn_10_0;
            }
            if (this.field_e == fwa.field_h) {
              var3_int = Character.toLowerCase(this.field_d.charAt(this.field_d.length() - 1));
              if (var3_int == 102) {
                stackIn_16_0 = new nc(Float.valueOf(this.field_d).floatValue());
                return stackIn_16_0;
              }
              if (var3_int == 108) {
                stackIn_19_0 = new nc(Long.parseLong(this.field_d.substring(0, -1 + this.field_d.length())));
                return stackIn_19_0;
              }
              if (-1 != this.field_d.indexOf('.')) {
                stackIn_23_0 = new nc(Double.valueOf(this.field_d).doubleValue());
                return stackIn_23_0;
              }
              stackIn_25_0 = new nc(Integer.parseInt(this.field_d));
              return stackIn_25_0;
            }
            if (io.field_p == this.field_e) {
              stackIn_29_0 = new nc(this.field_d.equals("true"));
              return stackIn_29_0;
            }
            if (this.field_e == ek.field_o) {
              var9 = this.field_d.substring(1, this.field_d.length() - 1);
              if (var9.length() != 1) {
                throw new gva("Invalid char value: " + var9);
              }
              stackIn_35_0 = new nc(var9.charAt(0));
              return stackIn_35_0;
            }
            if (dla.field_d == this.field_e) {
              stackIn_39_0 = new nc(this.field_d.substring(1, this.field_d.length() - 1));
              return stackIn_39_0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (NumberFormatException) (Object) decompiledCaughtException;
            throw new gva("NumberFormatException on: " + this.field_d);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_45_0 = var3_ref;
          stackIn_45_1 = new StringBuilder().append("tsa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    tsa(int param0, int param1, String param2) {
        try {
          this.field_d = param2;
          this.field_e = param0;
          this.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tsa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    tsa(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    static {
        field_h = -1;
    }
}
