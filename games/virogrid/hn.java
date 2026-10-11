/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hn extends l {
    static String[] field_i;
    static String field_p;
    int field_j;
    static int field_h;
    static il field_x;
    static int field_q;
    int[] field_o;
    static String field_u;
    int field_l;
    int field_k;
    static String field_s;
    int field_r;
    int field_m;
    static int field_w;
    static String field_n;
    int field_t;
    int field_g;
    static int[][] field_v;

    final static void a(int param0, boolean param1) {
        km stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        km stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        km stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        km stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        km stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        km stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        km stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        km stackIn_46_0 = null;
        boolean stackIn_47_1 = false;
        km stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        km stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        uk.a(df.field_f, 6, -640 + df.field_e >> 1, df.field_e + 640 >> 1, 0);
        if (param0 != -1781) {
          return;
        }
        if (kh.field_d > 0) {
          if (ak.field_e != null) {
            ak.field_e.b(fd.field_y.field_tb, 0);
          }
          stackIn_9_0 = fd.field_y;
          stackIn_10_1 = (param1) && (!ao.field_Gb);
          ((km) (Object) stackIn_9_0).a(stackIn_10_1, 24960);
          stackIn_13_0 = hg.field_p;
          stackIn_14_1 = (param1) && (!ao.field_Gb);
          ((km) (Object) stackIn_13_0).a(stackIn_14_1, 24960);
        }
        if (0 < field_h) {
          if (ak.field_e == null) {
            stackIn_20_0 = ao.field_Eb;
            stackIn_21_1 = (param1) && (!ad.field_h);
            ((km) (Object) stackIn_20_0).a(stackIn_21_1, 24960);
            stackIn_24_0 = dm.field_r;
            stackIn_25_1 = (param1) && (!ad.field_h);
            ((km) (Object) stackIn_24_0).a(stackIn_25_1, 24960);
          } else {
            ak.field_e.b(ao.field_Eb.field_tb, 0);
            stackIn_29_0 = ao.field_Eb;
            stackIn_30_1 = (param1) && (!ad.field_h);
            ((km) (Object) stackIn_29_0).a(stackIn_30_1, 24960);
            stackIn_33_0 = dm.field_r;
            stackIn_34_1 = (param1) && (!ad.field_h);
            ((km) (Object) stackIn_33_0).a(stackIn_34_1, 24960);
          }
        } else {
          if (th.field_z > 0) {
            if (ak.field_e == null) {
              stackIn_42_0 = ao.field_Eb;
              stackIn_43_1 = (param1) && (!ad.field_h);
              ((km) (Object) stackIn_42_0).a(stackIn_43_1, 24960);
              stackIn_46_0 = dm.field_r;
              stackIn_47_1 = (param1) && (!ad.field_h);
              ((km) (Object) stackIn_46_0).a(stackIn_47_1, 24960);
            } else {
              ak.field_e.b(ao.field_Eb.field_tb, 0);
              stackIn_51_0 = ao.field_Eb;
              stackIn_52_1 = (param1) && (!ad.field_h);
              ((km) (Object) stackIn_51_0).a(stackIn_52_1, 24960);
              stackIn_55_0 = dm.field_r;
              stackIn_56_1 = (param1) && (!ad.field_h);
              ((km) (Object) stackIn_55_0).a(stackIn_56_1, 24960);
            }
          }
        }
        ai.a(true);
    }

    public static void a(byte param0) {
        field_v = (int[][]) null;
        field_x = null;
        field_p = null;
        if (param0 == -9) {
          field_u = null;
          field_i = null;
          field_n = null;
          field_s = null;
          return;
        }
        hn.c(true);
        field_u = null;
        field_i = null;
        field_n = null;
        field_s = null;
    }

    final static int c(boolean param0) {
        if (!param0) {
          return 1900 + new Date().getYear();
        }
        field_p = (String) null;
        return 1900 + new Date().getYear();
    }

    final static boolean a(eh param0, int param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 109) {
            hn.c(false);
          }
          var5 = param0.a(param1, param2, 0);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          d.a((byte) -47, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("hn.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private hn() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new String[3];
        field_p = "Click or press F10 to open Quick Chat";
        field_u = "Unpacking sound effects";
        field_s = "Respect";
    }
}
