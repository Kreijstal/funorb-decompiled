/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ioa extends rqa {
    static dja field_q;
    static int field_o;
    static int field_p;

    final static short[] a(short[] param0, int param1, int param2) {
        short[] var3 = null;
        Object var4 = null;
        short[] var5 = null;
        if (param1 <= 70) {
          var4 = null;
          short[] discarded$2 = ioa.a((short[]) null, -85, 57);
          var5 = new short[param2];
          var3 = var5;
          cua.a(param0, 0, var5, 0, param2);
          return var5;
        } else {
          var5 = new short[param2];
          var3 = var5;
          cua.a(param0, 0, var5, 0, param2);
          return var5;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        nl var3 = null;
        int var4 = 0;
        nl var8 = null;
        nl var9 = null;
        gd var10 = null;
        ana var11 = null;
        gd var12 = null;
        gd var12_ref = null;
        ana var13 = null;
        if (kba.field_a == null) {
          return;
        } else {
          var8 = ohb.a(param0, -26, param1);
          var9 = var8;
          if (param2 < -31) {
            if (var9 == null) {
              L0: {
                var4 = param0;
                if ((fbb.field_j[param0] ^ -1) >= -2) {
                  break L0;
                } else {
                  var4 = hob.a(jp.field_Jc, fbb.field_j[param0], 123) + param0;
                  break L0;
                }
              }
              var12 = fa.field_d[var4];
              var13 = lha.a(-102, var12);
              var13.field_e.d(-1);
              var3 = new nl();
              var3.field_h = true;
              var3.field_d = var13;
              var3.field_l = param1;
              var3.field_g = false;
              var3.field_k = param0;
              gtb.field_d.b(-10258, (ksa) (Object) var3);
              return;
            } else {
              var9.field_h = true;
              return;
            }
          } else {
            field_q = null;
            if (var9 == null) {
              L1: {
                var4 = param0;
                if ((fbb.field_j[param0] ^ -1) >= -2) {
                  break L1;
                } else {
                  var4 = hob.a(jp.field_Jc, fbb.field_j[param0], 123) + param0;
                  break L1;
                }
              }
              var10 = fa.field_d[var4];
              var12_ref = var10;
              var12_ref = var10;
              var11 = lha.a(-102, var10);
              var11.field_e.d(-1);
              var3 = new nl();
              var3.field_h = true;
              var3.field_d = var11;
              var3.field_l = param1;
              var3.field_g = false;
              var3.field_k = param0;
              gtb.field_d.b(-10258, (ksa) (Object) var3);
              return;
            } else {
              var9.field_h = true;
              return;
            }
          }
        }
    }

    public static void e(byte param0) {
        field_q = null;
        if (param0 != -102) {
            ioa.e((byte) -93);
        }
    }

    ioa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(148, 90));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_o = 10;
        field_q = (dja) (Object) new fr();
    }
}
