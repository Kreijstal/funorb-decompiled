/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rqa extends fh {
    String field_l;
    String field_k;
    Class[] field_n;
    static int[] field_m;

    public static void a(boolean param0) {
        field_m = null;
        if (!param0) {
          field_m = (int[]) null;
        }
    }

    public final String toString() {
        return this.field_l;
    }

    final boolean a(boolean param0, String param1, nc[] param2) {
        int var4_int = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Class var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          if (!this.field_k.equals(param1)) {
            return false;
          }
          if (param2.length != this.field_n.length) {
            return false;
          }
          if (!param0) {
            field_m = (int[]) null;
          }
          for (var4_int = 0; var4_int < this.field_n.length; var4_int++) {
            if (param2[var4_int].field_a) {
              var5 = sna.a(param2[var4_int].field_b, (byte) 124);
              if (var5 == Boolean.TYPE &&
                this.field_n[var4_int] != Boolean.TYPE) {
                return false;
              }
              if (var5 == Character.TYPE &&
                this.field_n[var4_int] != Character.TYPE) {
                return false;
              }
              if (ke.a(var5, 24145) &&
                !ke.a(this.field_n[var4_int], 24145)) {
                return false;
              }
            } else {
              if (!this.field_n[var4_int].isInstance(param2[var4_int].field_b)) {
                return false;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("rqa.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    rqa(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        try {
          this.field_k = param0;
          this.field_n = param1;
          var7 = new StringBuilder(this.field_k).append('(');
          var8 = var7;
          for (var5 = 0; var5 < this.field_n.length; var5++) {
            discarded$18 = var7.append(wp.a(this.field_n[var5], false));
            if (var5 < -1 + this.field_n.length) {
              discarded$19 = var8.append(", ");
            }
          }
          discarded$28 = var8.append(')');
          if (param2 != null) {
            discarded$29 = var8.append("     <col=ffaaff>" + param2 + "</col>");
          }
          this.field_l = var8.toString();
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract nc a(nc[] param0, int param1);

    static {
        field_m = new int[5];
    }
}
