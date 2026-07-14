/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mla extends rqa {
    static llb field_q;
    static String field_o;
    static float[] field_s;
    static float[] field_p;
    static String field_r;

    final static asb a(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        try {
            fo var6 = null;
            IOException var6_ref = null;
            fo var7 = null;
            ga var8 = null;
            asb stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            asb stackOut_14_0 = null;
            try {
              L0: {
                var6 = null;
                if (gia.field_k.field_d == null) {
                  break L0;
                } else {
                  cba.field_e = new gdb(gia.field_k.field_d, 5200, 0);
                  gia.field_k.field_d = null;
                  var6 = new fo(255, cba.field_e, new gdb(gia.field_k.field_t, 12000, 0), 2097152);
                  break L0;
                }
              }
              L1: {
                var7 = null;
                if (null == cba.field_e) {
                  break L1;
                } else {
                  L2: {
                    if (null == btb.field_d) {
                      btb.field_d = new gdb[gia.field_k.field_l.length];
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (null == btb.field_d[param4]) {
                      btb.field_d[param4] = new gdb(gia.field_k.field_l[param4], 12000, 0);
                      gia.field_k.field_l[param4] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var7 = new fo(param4, cba.field_e, btb.field_d[param4], 2097152);
                  break L1;
                }
              }
              L4: {
                var8 = ho.field_a.a(param4, 5, var6, var7, param3);
                if (!param1) {
                  break L4;
                } else {
                  var8.b((byte) -82);
                  break L4;
                }
              }
              L5: {
                if (param2 <= -48) {
                  break L5;
                } else {
                  asb discarded$2 = mla.a(false, false, 36, false, -48, -32);
                  break L5;
                }
              }
              stackOut_14_0 = new asb((fnb) (Object) var8, param0, param5);
              stackIn_15_0 = stackOut_14_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_15_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          mla.a(-123);
          field_q = null;
          field_o = null;
          field_r = null;
          field_p = null;
          field_s = null;
          return;
        } else {
          field_q = null;
          field_o = null;
          field_r = null;
          field_p = null;
          field_s = null;
          return;
        }
    }

    final static int a(String param0, ds param1, int param2) {
        int var3 = 0;
        byte[] var4 = null;
        CharSequence var5 = null;
        if (param2 > -56) {
          return 66;
        } else {
          var3 = param1.field_e;
          var5 = (CharSequence) (Object) param0;
          var4 = hi.a(var5, 96);
          param1.b((byte) 124, var4.length);
          param1.field_e = param1.field_e + eob.field_o.b(var4.length, var4, param1.field_h, 104, param1.field_e, 0);
          return -var3 + param1.field_e;
        }
    }

    mla(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        oq.field_E = param0[0].a(93);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_s = new float[16384];
        field_o = "Spinning blade";
        field_p = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; -16385 < (var2 ^ -1); var2++) {
            field_p[var2] = (float)Math.sin(var0 * (double)var2);
            field_s[var2] = (float)Math.cos(var0 * (double)var2);
        }
        field_r = "This is your RuneScape clan if you have one.";
    }
}
