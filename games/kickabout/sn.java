/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sn {
    static ut field_k;
    private u field_h;
    static hu field_a;
    static int[] field_f;
    static String[] field_b;
    static String field_e;
    static hu field_i;
    private iw field_d;
    static String field_j;
    static Vector field_g;
    static byte[] field_c;

    final boolean a(byte param0) {
        if (null != this.field_h) {
          if (this.field_h.a((byte) 70)) {
            this.field_d = this.field_h.b(0);
            if (param0 >= -78) {
              return false;
            } else {
              this.field_h = null;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != -1316) {
          field_f = (int[]) null;
          field_a = null;
          field_g = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_i = null;
          field_e = null;
          field_k = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_i = null;
          field_e = null;
          field_k = null;
          return;
        }
    }

    sn(ma param0) {
        try {
            java.net.URL var2 = null;
            java.net.MalformedURLException var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = param0.getCodeBase();
                    if (var2 == null) {
                      break L1;
                    } else {
                      this.field_h = new u(oo.field_c, new java.net.URL(var2, "motd"), 100000);
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  this.field_h = null;
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("sn.<init>(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final iw a(boolean param0) {
        if (param0) {
            field_a = (hu) null;
            return this.field_d;
        }
        return this.field_d;
    }

    static {
        field_f = new int[4];
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_j = "Owner";
        field_c = new byte[]{(byte)3, (byte)2, (byte)2, (byte)2};
    }
}
