/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wca {
    String field_f;
    private int field_m;
    private int field_i;
    private int field_j;
    kga field_g;
    private int field_d;
    String field_a;
    static int field_n;
    int field_b;
    int[] field_c;
    String field_h;
    int field_e;
    int[] field_l;
    si field_k;

    final int a(pd param0, int param1, boolean[] param2) {
        int var4_int = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        try {
          for (var4_int = param1; this.field_c.length > var4_int; var4_int++) {
            if (var4_int != 1 &&
              var4_int != 4 &&
              var4_int != 7 &&
              10 != var4_int &&
              !param2[var4_int] &&
              fw.field_h[this.field_c[var4_int]].equals(param0)) {
              var5 = (var4_int + 2) / 3;
              if (0 == var5) {
                stackIn_12_0 = var4_int;
                return stackIn_12_0;
              }
              if (param2[var5 * 3 - 2]) {
                stackIn_15_0 = var4_int;
                return stackIn_15_0;
              }
            }
          }
          stackIn_18_0 = -1;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("wca.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final int a(int param0, pd param1, boolean[] param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        boolean[] var5 = null;
        try {
          if (this.field_k.field_b != 7) {
            if (this.field_k.field_b == 6) {
              if (gma.field_e[this.field_j].field_b == gfa.field_a[param1.field_a].field_k.field_b &&
                !param2[1]) {
                stackIn_23_0 = 0;
                return stackIn_23_0;
              }
              if (fw.field_h[this.field_m].equals(param1) &&
                !param2[4]) {
                stackIn_27_0 = 1;
                return stackIn_27_0;
              }
            } else {
              if (gfa.field_a[param1.field_a].field_k.field_b == gma.field_e[this.field_j].field_b &&
                !param2[1]) {
                stackIn_19_0 = 0;
                return stackIn_19_0;
              }
              if (gfa.field_a[param1.field_a].field_k.field_b == gma.field_e[this.field_m].field_b &&
                !param2[4]) {
                stackIn_17_0 = 1;
                return stackIn_17_0;
              }
            }
          } else {
            if (fw.field_h[this.field_j].equals(param1) &&
              !param2[1]) {
              stackIn_4_0 = 0;
              return stackIn_4_0;
            }
            if (fw.field_h[this.field_m].equals(param1) &&
              !param2[4]) {
              stackIn_8_0 = 1;
              return stackIn_8_0;
            }
          }
          if (fw.field_h[this.field_i].equals(param1) &&
            !param2[7]) {
            stackIn_37_0 = 2;
            return stackIn_37_0;
          }
          if (fw.field_h[this.field_d].equals(param1) &&
            !param2[10]) {
            stackIn_35_0 = 3;
            return stackIn_35_0;
          }
          if (param0 < 2) {
            var5 = (boolean[]) null;
            this.a(-53, (pd) null, (boolean[]) null);
          }
          stackIn_41_0 = -1;
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("wca.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        oha var10;
        oha var11;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        if (param4 >= 61) {
          var10 = al.a(-72, param3);
          var6 = var10.field_h;
          var7 = var10.field_a;
          var8 = var10.field_l;
          if (param0) {
            hh.field_b[var6].e(5 + param2, param1 + 5);
            if (1 != var8 &&
              2 != var8 &&
              3 == var8) {
            }
            if (1 != var7) {
              if (var7 != 2) {
                return;
              }
              if (!hl.a((byte) 104, var10.field_j)) {
                return;
              }
            }
            if (var8 >= 1) {
              us.field_c.a(param2 + 11, param1);
            }
            if (var8 >= 2) {
              us.field_c.a(18 + param2, 3 + param1);
            }
            if (var8 >= 3) {
              us.field_c.a(21 + param2, 10 + param1);
            }
            return;
          }
          hh.field_b[var6].a(5 + param2, param1 + 5, 128);
          if (1 != var8 &&
            2 != var8 &&
            3 == var8) {
          }
          if (1 != var7) {
            if (var7 != 2) {
              return;
            }
            if (!hl.a((byte) 104, var10.field_j)) {
              return;
            }
          }
          if (var8 >= 1) {
            us.field_c.a(param2 + 11, param1);
          }
          if (var8 >= 2) {
            us.field_c.a(18 + param2, 3 + param1);
          }
          if (var8 >= 3) {
            us.field_c.a(21 + param2, 10 + param1);
          }
          return;
        }
        wca.a((byte) 117);
        var11 = al.a(-72, param3);
        var6Lifetime1 = var11.field_h;
        var7Lifetime1 = var11.field_a;
        var8Lifetime1 = var11.field_l;
        if (!param0) {
          hh.field_b[var6Lifetime1].a(5 + param2, param1 + 5, 128);
          if (1 == var8Lifetime1) {
            if (1 != var7Lifetime1) {
              if (var7Lifetime1 != 2) {
                return;
              }
              if (!hl.a((byte) 104, var11.field_j)) {
                return;
              }
            }
            if (var8Lifetime1 >= 1) {
              us.field_c.a(param2 + 11, param1);
            }
            if (var8Lifetime1 >= 2) {
              us.field_c.a(18 + param2, 3 + param1);
            }
            if (var8Lifetime1 >= 3) {
              us.field_c.a(21 + param2, 10 + param1);
            }
            return;
          }
          if (2 != var8Lifetime1 &&
            3 == var8Lifetime1) {
          }
          if (1 != var7Lifetime1) {
            if (var7Lifetime1 != 2) {
              return;
            }
            if (!hl.a((byte) 104, var11.field_j)) {
              return;
            }
          }
          if (var8Lifetime1 >= 1) {
            us.field_c.a(param2 + 11, param1);
          }
          if (var8Lifetime1 >= 2) {
            us.field_c.a(18 + param2, 3 + param1);
          }
          if (var8Lifetime1 >= 3) {
            us.field_c.a(21 + param2, 10 + param1);
          }
          return;
        }
        hh.field_b[var6Lifetime1].e(5 + param2, param1 + 5);
        if (1 != var8Lifetime1 &&
          2 != var8Lifetime1 &&
          3 != var8Lifetime1) {
          if (1 != var7Lifetime1) {
            if (var7Lifetime1 != 2) {
              return;
            }
            if (!hl.a((byte) 104, var11.field_j)) {
              return;
            }
          }
          if (var8Lifetime1 >= 1) {
            us.field_c.a(param2 + 11, param1);
          }
          if (var8Lifetime1 >= 2) {
            us.field_c.a(18 + param2, 3 + param1);
          }
          if (var8Lifetime1 >= 3) {
            us.field_c.a(21 + param2, 10 + param1);
          }
          return;
        }
        if (1 != var7Lifetime1) {
          if (var7Lifetime1 != 2) {
            return;
          }
          if (!hl.a((byte) 104, var11.field_j)) {
            return;
          }
          if (var8Lifetime1 >= 1) {
            us.field_c.a(param2 + 11, param1);
          }
        } else {
          if (var8Lifetime1 < 1) {
            if (var8Lifetime1 >= 2) {
              us.field_c.a(18 + param2, 3 + param1);
            }
            if (var8Lifetime1 < 3) {
              return;
            }
            us.field_c.a(21 + param2, 10 + param1);
            return;
          }
          us.field_c.a(param2 + 11, param1);
        }
        if (var8Lifetime1 >= 2) {
          us.field_c.a(18 + param2, 3 + param1);
        }
        if (var8Lifetime1 >= 3) {
          us.field_c.a(21 + param2, 10 + param1);
        }
        return;
    }

    public final boolean equals(Object param0) {
        wca var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == param0) {
            return true;
          }
          if (param0 == null) {
            return false;
          }
          if (this.getClass() != param0.getClass()) {
            return false;
          }
          var2 = (wca) (param0);
          if (this.field_b == var2.field_b) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("wca.equals(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final int hashCode() {
        int var1 = 1;
        var1 = this.field_b + 31 * var1;
        return var1;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          if (param0 > -59) {
            wca.a((byte) 26);
          }
          dl.field_h = new js(16);
          for (var1_int = 0; var1_int < ol.field_l.length; var1_int++) {
            dl.field_h.a((long)ol.field_l[var1_int].hashCode(), (byte) -55, new ji(var1_int));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "wca.C(" + param0 + ')');
        }
    }

    wca(int param0, String param1, String param2, int[] param3, int[] param4, int param5, kga param6, String param7) {
        Random discarded$0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.field_f = param1;
          this.field_h = param2;
          this.field_g = param6;
          this.field_b = param0;
          this.field_a = param7;
          this.field_k = fw.field_h[this.field_b].field_g;
          discarded$0 = new Random((long)param0);
          this.field_c = param4;
          this.field_e = param5;
          this.field_j = this.field_c[1];
          this.field_l = param3;
          this.field_m = this.field_c[4];
          this.field_d = this.field_c[10];
          this.field_i = this.field_c[7];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("wca.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param7 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
