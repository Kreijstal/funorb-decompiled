/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ai {
    int[] field_b;
    byte[] field_J;
    int field_r;
    int field_n;
    int[][] field_z;
    int field_m;
    int[] field_y;
    static Random field_d;
    int field_I;
    int field_s;
    int field_j;
    int field_i;
    int[] field_w;
    byte[][] field_h;
    int field_D;
    byte[] field_t;
    int field_H;
    int field_v;
    byte[] field_o;
    byte field_G;
    int field_F;
    byte[] field_k;
    int field_g;
    int field_l;
    static int field_x;
    int field_K;
    int[][] field_E;
    byte[] field_p;
    boolean[] field_q;
    boolean[] field_f;
    byte[] field_a;
    static String field_C;
    int field_c;
    int[] field_u;
    static ak field_A;
    int[][] field_B;
    static int[] field_e;

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          if (!we.a(true, 5832, param1)) {
            return false;
          }
          var2_int = 0;
          if (param0 >= -125) {
            ai.a((byte) 125);
          }
          while (param1.length() > var2_int) {
            if (!vf.a((byte) -3, param1.charAt(var2_int))) {
              return false;
            }
            var2_int++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ai.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param1 == 6) {
          if (uo.field_j <= 0) {
            if (!jg.a((byte) 58)) {
              var2 = 1;
              if (vh.field_c != null) {
                return;
              }
              if (dg.field_a) {
                bq.a(param0, (byte) -89, var2);
              }
              return;
            }
            var2 = 0;
          } else {
            if (vh.field_c == null) {
              ib.field_f = wo.a(mc.field_k, 150, 480, 0, 640, 0);
            } else {
              ib.field_f = vh.field_c.b(false);
              ah.a(2, (byte) 114);
            }
            if (ib.field_f == null) {
              var2 = 3;
            } else {
              var2 = 2;
              he.a(0, ib.field_f);
            }
          }
        } else {
          field_C = (String) null;
          if (uo.field_j <= 0) {
            if (!jg.a((byte) 58)) {
              var2 = 1;
            } else {
              var2 = 0;
            }
          } else {
            if (vh.field_c == null) {
              ib.field_f = wo.a(mc.field_k, 150, 480, 0, 640, 0);
            } else {
              ib.field_f = vh.field_c.b(false);
              ah.a(2, (byte) 114);
            }
            if (ib.field_f == null) {
              var2 = 3;
            } else {
              var2 = 2;
              he.a(0, ib.field_f);
            }
          }
        }
        if (vh.field_c != null) {
          return;
        }
        if (dg.field_a) {
          bq.a(param0, (byte) -89, var2);
        }
    }

    public static void a(byte param0) {
        field_C = null;
        if (param0 == -92) {
          field_A = null;
          field_e = null;
          field_d = null;
          return;
        }
        field_C = (String) null;
        field_A = null;
        field_e = null;
        field_d = null;
    }

    ai() {
        this.field_b = new int[257];
        this.field_y = new int[6];
        this.field_h = new byte[6][258];
        this.field_I = 0;
        this.field_z = new int[6][258];
        this.field_J = new byte[18002];
        this.field_l = 0;
        this.field_E = new int[6][258];
        this.field_w = new int[16];
        this.field_p = new byte[18002];
        this.field_u = new int[256];
        this.field_f = new boolean[256];
        this.field_t = new byte[4096];
        this.field_a = new byte[256];
        this.field_B = new int[6][258];
        this.field_q = new boolean[16];
    }

    static {
        field_x = 9;
        field_d = new Random();
        field_C = "Unable to add friend - system busy";
        field_e = new int[8192];
    }
}
