/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj extends ug {
    private boolean field_nb;
    private String field_mb;
    static String field_hb;
    private boolean field_jb;
    private String field_ib;
    static int[] field_lb;
    private ib field_kb;

    public static void h(byte param0) {
        field_lb = null;
        if (param0 >= -64) {
          jj.$cfr$intArgs$a$81305413f30a(-108, true);
          field_hb = null;
          return;
        }
        field_hb = null;
    }

    jj(sh param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_ib = param1;
          if (this.field_ib != null) {
            var3_int = fd.field_k.b(this.field_ib, 260, fd.field_k.field_C);
            this.a(-68, var3_int + 150, 300);
          }
          this.field_kb = new ib(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_kb.field_N = true;
          this.field_jb = false;
          this.field_nb = false;
          this.b(this.field_kb, 10);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static in a(byte param0, boolean param1) {
        int var2 = -100 / ((param0 - 80) / 42);
        in var3 = new in(true);
        var3.field_i = param1 ? true : false;
        return var3;
    }

    final void a(int param0, boolean param1, float param2, String param3) {
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -57) {
            field_lb = (int[]) null;
          }
          stackIn_4_0 = this.field_nb;
          if (param1) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if ((stackIn_4_0 ? 1 : 0) != stackIn_5_1) {
            this.field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
            this.field_mb = param3;
            return;
          }
          stackIn_10_1 = (param1);
          this.field_nb = stackIn_10_1;
          if (this.field_nb) {
            this.field_kb.a(8405024, false, 4210752);
            this.field_kb.field_N = true;
          } else {
            this.field_kb.a(2113632, false, 4210752);
            if (this.field_jb) {
              this.field_kb.field_N = false;
            }
          }
          this.field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
          this.field_mb = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("jj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1) {
        try {
          int var2 = 0;
          int var3_int = 0;
          IOException var3 = null;
          Throwable decompiledCaughtException = null;
          if (e.field_c.field_n >= param0) {
            return true;
          }
          if (null == kl.field_G) {
            return false;
          }
          var2 = -103 % ((param1 + 39) / 37);
          try {
            var3_int = kl.field_G.c((byte) -79);
            if (0 >= var3_int) {
              if (0 > var3_int) {
                dc.d(125);
                return false;
              }
              if (la.h(118) <= 30000L) {
                return false;
              }
              dc.d(125);
              return false;
            }
            if (-e.field_c.field_n + param0 < var3_int) {
              var3_int = param0 - e.field_c.field_n;
            }
            kl.field_G.a(e.field_c.field_m, -77, var3_int, e.field_c.field_n);
            m.field_b = ri.a(-3);
            e.field_c.field_n = e.field_c.field_n + var3_int;
            if (param0 > e.field_c.field_n) {
              return false;
            }
            e.field_c.field_n = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (IOException) (Object) decompiledCaughtException;
            dc.d(111);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, byte param1, int param2) {
        super.b(param0, (byte) -112, param2);
        fd.field_k.b(this.field_mb, param0 + (this.field_F >> 1), param2 + 103, 16777215, -1);
        if (param1 < -58) {
          if (this.field_ib != null) {
            fn.b(20 + param0, param2 + 120 - 7, 260, 8421504);
            fd.field_k.a(this.field_ib, param0 + 20, param2 + 128, 260, 100, 16777215, -1, 1, 0, fd.field_k.field_C);
          }
          return;
        }
        this.field_ib = (String) null;
        if (this.field_ib != null) {
          fn.b(20 + param0, param2 + 120 - 7, 260, 8421504);
          fd.field_k.a(this.field_ib, param0 + 20, param2 + 128, 260, 100, 16777215, -1, 1, 0, fd.field_k.field_C);
        }
    }

    final void i(byte param0) {
        int var2 = -38 % ((67 - param0) / 57);
        this.field_kb.field_N = false;
        this.field_jb = true;
    }

    static {
        field_hb = "Passwords must be between 5 and 20 letters and numbers";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static in $cfr$intArgs$a$81305413f30a(int param0, boolean param1) {
        int var2 = -100 / ((param0 - 80) / 42);
        in var3 = new in(true);
        var3.field_i = param1 ? true : false;
        return var3;
    }
}
