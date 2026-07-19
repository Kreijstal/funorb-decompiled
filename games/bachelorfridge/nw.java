/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nw extends td {
    static String field_r;
    static String field_t;
    static kv[] field_p;
    static String field_s;
    static String field_q;

    nw(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_n = param3;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nw.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        cja var4 = null;
        cja stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cja stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = this.field_h.a(57, param0);
              var4 = new cja(this.field_g, new nq(var3));
              var4.field_s = this.field_k;
              var4.field_u = this.field_n;
              if (param1 == 3) {
                break L1;
              } else {
                field_p = (kv[]) null;
                break L1;
              }
            }
            var4.field_q = 2 * kla.a(4, param0.field_w, param1 ^ -2147483645) + 6;
            stackOut_2_0 = (cja) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("nw.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_3_0);
    }

    public static void c(boolean param0) {
        if (param0) {
          nw.a(false, false, (byte) -101);
          field_t = null;
          field_s = null;
          field_p = null;
          field_r = null;
          field_q = null;
          return;
        } else {
          field_t = null;
          field_s = null;
          field_p = null;
          field_r = null;
          field_q = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        String var4 = (String) null;
        vma.a((byte) -6, param0, param1, (String) null);
        int var3 = -72 / ((-21 - param2) / 58);
    }

    final static void a(vr param0, byte param1) {
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        lu var3 = null;
        byte[] var4 = null;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        lu var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var13 = param0.a((byte) 123, "MoveTable.csv", "");
              var8 = var13;
              var4 = var8;
              var2 = var4;
              var9 = new lu(var13);
              wca.a((byte) -121);
              vi.b(16);
              ln.f(-93);
              hba.c(7);
              kma.d(param1 + -109);
              lg.c(8);
              li.e(-117);
              mk.a((byte) -43);
              ut.c(-22021);
              ev.a((byte) 80);
              if (param1 == 2) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            lka.field_E = qs.a(false, var9);
            hga.a(true, var13);
            var14 = param0.a((byte) 123, "UnlockTable.csv", "");
            var10 = var14;
            var5 = var10;
            var2 = var5;
            qh.a((byte) -104);
            bj.a(var14, (byte) 22);
            lg.a(-92);
            var15 = param0.a((byte) 123, "UnlockerTable.csv", "");
            var11 = var15;
            var6 = var11;
            var2 = var6;
            sp.a(var15, param1 ^ -5);
            var16 = param0.a((byte) 123, "CreatureTable.csv", "");
            var12 = var16;
            var7 = var12;
            var2 = var7;
            var3 = new lu(var16);
            qs.b(false);
            an.a(var16, -49);
            wv.a((byte) -73, var16);
            fi.field_m = null;
            me.field_t = null;
            du.field_a = null;
            oi.field_v = null;
            dl.field_h = null;
            cma.field_x = null;
            id.field_i = null;
            ng.field_f = null;
            cw.field_zb = null;
            eo.field_f = null;
            i.field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("nw.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    static {
        field_r = "Mute this player for 48 hours";
        field_t = "Click on a creature or its portrait to select it.";
        field_s = "TAB - hide chat temporarily";
        field_q = "Password is valid";
    }
}
