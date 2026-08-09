/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class go {
    static hl field_d;
    static int[] field_b;
    private java.util.zip.Inflater field_f;
    static boolean field_c;
    static String field_e;
    static tb field_a;
    static de field_g;

    public static void b(byte param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 57) {
            field_g = (de) null;
        }
    }

    final static void a(byte param0) {
        int var1;
        L0: {
          if ((jj.field_a ^ -1) > -225) {
            var1 = jj.field_a % 32;
            ve.a(32 + jj.field_a + -var1, param0 + -27);
            break L0;
          } else {
            ve.a(256, 51);
            break L0;
          }
        }
        if (param0 != 127) {
          field_g = (de) null;
          return;
        } else {
          return;
        }
    }

    final static ng a(boolean param0, int param1, ah param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ng stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ng stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = param2.a(0, param1);
            var3 = var4;
            if (param0) {
              if (var4 != null) {
                stackIn_7_0 = new ng(var4);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ng) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("go.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ng) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void c(byte param0) {
        ah var2;
        L0: {
          hi.field_a = false;
          if (null != gl.field_o) {
            gl.field_o.i(20424);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 != sf.field_d) {
            hi.b(-77);
            break L1;
          } else {
            break L1;
          }
        }
        d.field_e = 0;
        if (param0 != 42) {
          var2 = (ah) null;
          go.a(false, 4, (ah) null);
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            dc.field_e.field_jb = param1;
            hm.field_b = true;
            var2_int = pk.field_O.field_h;
            var3 = pk.field_O.field_j;
            if (param0 != -105) {
                field_e = (String) null;
            }
            var4 = dc.field_e.field_Ib.b(param1, 272, dc.field_e.field_Q);
            var5 = -(var4 / 2) + 7 + var3 / 2 + -110;
            t.field_q.a((byte) -117, 320, var5, -(2 * var5) + -120 + var3, (-320 + var2_int) / 2);
            t.field_q.field_Eb = ah.a(2105376, 3, 8421504, param0 ^ -121, 11579568, t.field_q.field_R);
            dc.field_e.a((byte) -92, -48 + t.field_q.field_Hb, 16, -24 + t.field_q.field_R + -20, 24);
            wb.field_a.a((byte) -124, 80, -20 + (t.field_q.field_R - 24), 24, 120);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "go.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, byte[] param1, bh param2) {
        try {
            try {
                if (param2.field_u[param2.field_t] != 31 || param2.field_u[1 + param2.field_t] != -117) {
                    throw new RuntimeException("");
                }
                if (!(null != this.field_f)) {
                    this.field_f = new java.util.zip.Inflater(true);
                }
                try {
                    if (param0 < 70) {
                        field_g = (de) null;
                    }
                    this.field_f.setInput(param2.field_u, param2.field_t - -10, -10 + -param2.field_t + (-8 + param2.field_u.length));
                    this.field_f.inflate(param1);
                } catch (Exception exception) {
                    this.field_f.reset();
                    throw new RuntimeException("");
                }
                this.field_f.reset();
            } catch (RuntimeException runtimeException) {
                throw oi.a((Throwable) ((Object) runtimeException), "go.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private go(int param0, int param1, int param2) {
    }

    public go() {
        this(-1, 1000000, 1000000);
    }

    static {
        field_e = "Invite";
    }
}
