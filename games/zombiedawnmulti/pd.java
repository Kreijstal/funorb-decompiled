/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    private ja[] field_d;
    static String field_f;
    static cj field_b;
    static String field_a;
    static String field_e;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_a = null;
        int var1 = 100 / ((param0 + 82) / 37);
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 12018) {
          return;
        }
        s.a(param0, 0, this.field_d, param1, param3, param2);
    }

    final static int a(int param0) {
        if (param0 != -27486) {
          return -94;
        }
        return hp.a((byte) 99, g.field_a, 256) << 16 | hp.a((byte) -91, g.field_a, 256) << 8 | hp.a((byte) -97, g.field_a, 256);
    }

    final static boolean a(long param0, String param1, int param2) {
        ml var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 2) {
            var5 = (byte[]) null;
            pd.a((byte) 9, (byte[]) null);
          }
          var4 = dn.a(param1, false);
          if (var4 != null &&
            var4.field_Nb != null) {
            return true;
          }
          stackIn_10_0 = (mh.field_c != null) && (vm.a(param0, (byte) -81) != null);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("pd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    pd(ja[] param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        k var16 = null;
        k var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var16 = new k(param1);
          var17 = var16;
          var17.field_j = -2 + param1.length;
          qc.field_v = var17.d((byte) 69);
          ll.field_h = new boolean[qc.field_v];
          qj.field_o = new int[qc.field_v];
          k.field_i = new int[qc.field_v];
          if (param0 <= 82) {
            field_e = (String) null;
          }
          vf.field_b = new byte[qc.field_v][];
          oq.field_w = new int[qc.field_v];
          qp.field_t = new byte[qc.field_v][];
          vj.field_p = new int[qc.field_v];
          var17.field_j = param1.length - 7 - 8 * qc.field_v;
          ie.field_nb = var17.d((byte) 69);
          hj.field_a = var17.d((byte) 69);
          var3 = 1 + (var17.g(31365) & 255);
          for (var4 = 0; var4 < qc.field_v; var4++) {
            k.field_i[var4] = var16.d((byte) 69);
          }
          for (var4Lifetime1 = 0; qc.field_v > var4Lifetime1; var4Lifetime1++) {
            qj.field_o[var4Lifetime1] = var17.d((byte) 69);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < qc.field_v; var4Lifetime2++) {
            oq.field_w[var4Lifetime2] = var17.d((byte) 69);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < qc.field_v; var4Lifetime3++) {
            vj.field_p[var4Lifetime3] = var17.d((byte) 69);
          }
          var17.field_j = -(var3 * 3) - 4 + (param1.length - 8 * qc.field_v);
          tp.field_t = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            tp.field_t[var4Lifetime4] = var17.e(128);
            if (tp.field_t[var4Lifetime4] == 0) {
              tp.field_t[var4Lifetime4] = 1;
            }
          }
          var17.field_j = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < qc.field_v; var4Lifetime5++) {
            var5 = oq.field_w[var4Lifetime5];
            var6 = vj.field_p[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            qp.field_t[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            vf.field_b[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.g(31365);
            stackIn_24_0 = -1;
            stackIn_24_1 = ~(1 & var11);
            if (stackIn_24_0 == stackIn_24_1) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.d(-249699580);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.d(-249699580);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_33_0 = var10;
                  if (var13 == -1) {
                    stackIn_34_1 = 0;
                  } else {
                    stackIn_34_1 = 1;
                  }
                  var10 = stackIn_33_0 | stackIn_34_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var17.d(-249699580);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.d(-249699580);
                    var9[var12 + var5 * var13] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (var14 == -1) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            ll.field_h[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("pd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_f = "This is your RuneScape clan if you have one.";
        field_a = "Waiting for extra data";
        field_e = "Press TAB to chat or F10 to open Quick Chat.";
        field_c = 67;
    }
}
