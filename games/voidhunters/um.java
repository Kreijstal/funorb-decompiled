/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    private byte[] field_a;
    static int[] field_c;
    private boolean field_d;
    private int field_b;

    final byte[] b(int param0) {
        byte[] var3 = null;
        if (this.field_d) {
          var3 = this.field_a;
          byte[] var2 = var3;
          this.field_a = null;
          return var3;
        }
        if (param0 != -30223) {
          this.field_a = (byte[]) null;
          return null;
        }
        return null;
    }

    final void a(ds param0, int param1, boolean param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = param0.h(90);
          if (param2) {
            System.out.println("data_len received: " + var4_int + " (hex " + Integer.toHexString(var4_int) + ")");
          }
          if (this.field_d ||
            null == this.field_a ||
            this.field_a.length != var4_int) {
            if (param2) {
              System.out.println("allocating new buffer");
            }
            this.field_b = 0;
            this.field_d = false;
            this.field_a = new byte[var4_int];
          }
          var5 = param0.h(90);
          if (param2) {
            System.out.println("offset received: " + var5 + " (hex " + Integer.toHexString(var5) + ")");
          }
          if (param2 &&
            this.field_b != var5) {
            throw new IllegalStateException("had received " + this.field_b + ", got offset " + var5 + " total len: " + var4_int);
          }
          var6 = param0.e(1869);
          if (param2) {
            System.out.println("Receiving: " + var6);
          }
          param0.a(var5, this.field_a, (byte) -59, var6);
          this.field_b = this.field_b + var6;
          if (this.field_a.length <= this.field_b) {
            this.field_d = true;
          }
          if (param2 &&
            this.field_d) {
            System.out.println("Ready!");
          }
          if (param1 > 68) {
            return;
          }
          field_c = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("um.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 100) {
          return;
        }
        field_c = null;
    }

    final int c(int param0) {
        if (param0 != 0) {
          return -31;
        }
        if (this.field_d) {
          return 0;
        }
        if (null != this.field_a) {
          return this.field_b * 100 / this.field_a.length;
        }
        return 0;
    }

    static {
        field_c = new int[8192];
    }
}
