/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fkb extends ksa {
    int field_k;
    static tjb field_m;
    int field_v;
    gd field_y;
    cja field_g;
    int field_o;
    int field_r;
    int field_h;
    static String field_z;
    int field_l;
    int field_u;
    int field_i;
    int field_w;
    sd field_n;
    int field_f;
    int field_e;
    int field_p;
    int field_d;
    int field_q;
    int field_x;
    fga field_j;
    int field_t;
    int field_s;

    final static int a(int param0, byte param1) {
        if (param1 == -121) {
          if (li.field_i) {
            return de.a(param0, 300).field_e;
          } else {
            return ita.a(param0, param1 ^ -8013).field_A;
          }
        } else {
          field_z = (String) null;
          if (li.field_i) {
            return de.a(param0, 300).field_e;
          } else {
            return ita.a(param0, param1 ^ -8013).field_A;
          }
        }
    }

    final void c(int param0) {
        this.field_y = null;
        if (param0 != 25804) {
          field_z = (String) null;
          this.field_j = null;
          this.field_g = null;
          this.field_n = null;
          return;
        } else {
          this.field_j = null;
          this.field_g = null;
          this.field_n = null;
          return;
        }
    }

    public static void d(int param0) {
        if (param0 != -25815) {
            fkb.d(-108);
            field_m = null;
            field_z = null;
            return;
        }
        field_m = null;
        field_z = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = VoidHunters.field_G;
        try {
            omb.field_p.a(-103);
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                sga.field_o[var1_int] = 0L;
            }
            if (param0 != 2096) {
                field_m = (tjb) null;
            }
            for (var1_int = 0; -33 < (var1_int ^ -1); var1_int++) {
                fm.field_b[var1_int] = 0L;
            }
            dn.field_p = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fkb.D(" + param0 + ')');
        }
    }

    fkb() {
    }

    final static void a(int param0, Object param1, File param2) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            FileOutputStream var3 = null;
            IOException var3_ref = null;
            RuntimeException var3_ref2 = null;
            ObjectOutputStream var4 = null;
            SecurityException var4_ref = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = new FileOutputStream(param2);
                    var4 = new ObjectOutputStream((OutputStream) ((Object) var3));
                    if (param0 > 36) {
                      var4.writeObject(param1);
                      var4.close();
                      var3.close();
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3_ref = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      param2.delete();
                      break L2;
                    }
                  } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var4_ref = (SecurityException) (Object) decompiledCaughtException;
                    return;
                  }
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var3_ref2);

                stackIn_11_1 = new StringBuilder().append("fkb.A(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_z = "Remove clicked object";
    }
}
