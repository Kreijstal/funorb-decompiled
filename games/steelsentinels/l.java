/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class l implements Iterator {
    static String field_a;
    static String field_f;
    static tg field_i;
    private IntrusiveNode field_h;
    static ql field_e;
    static int field_g;
    private q field_d;
    private int field_b;
    private IntrusiveNode field_c;

    final static void a(em param0, byte param1) {
        try {
          int var2_int = -112 % ((-14 - param1) / 32);
          ll.field_e.a(param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "l.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(IndexedSprite[] param0, ResourceArchive param1, String[] param2, int[] param3, int param4, String[] param5, String[][] param6, int param7, ResourceArchive param8, byte param9, String[][] param10, RgbSprite[][] param11, ResourceArchive param12, byte[] param13, RgbSprite[][] param14, boolean param15, int[] param16, int param17, String[] param18, byte[] param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        byte[] var21 = null;
        try {
          oh.a(param3, false, param8, param0, param12);
          lb.a((byte) 109, param8);
          if (param9 != 94) {
            var21 = (byte[]) null;
            l.a((IndexedSprite[]) null, (ResourceArchive) null, (String[]) null, (int[]) null, 58, (String[]) null, (String[][]) null, -8, (ResourceArchive) null, (byte) -10, (String[][]) null, (RgbSprite[][]) null, (ResourceArchive) null, (byte[]) null, (RgbSprite[][]) null, true, (int[]) null, 95, (String[]) null, (byte[]) null);
          }
          oh.a(param7, param16, param5, param10, param2, param9 ^ 94, param6, param4, param11, param14, param17, param18, param13, param19, param8);
          vl.a(param8, param1, param15, -119);
          rm.b((byte) -115);
          bf.m(854);
          sb.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("l.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param12 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param13 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param14 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param19 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = SteelSentinels.obfuscationControl;
        if (this.field_d.field_j[this.field_b - 1] != this.field_c) {
          return true;
        }
        while (this.field_d.field_e > this.field_b) {
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          if (this.field_d.field_j[fieldTemp$0].next != this.field_d.field_j[-1 + this.field_b]) {
            this.field_c = this.field_d.field_j[this.field_b - 1].next;
            return true;
          }
          this.field_c = this.field_d.field_j[-1 + this.field_b];
        }
        return false;
    }

    public final void remove() {
        if (this.field_h == null) {
          throw new IllegalStateException();
        }
        this.field_h.unlink(4);
        this.field_h = null;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = SteelSentinels.obfuscationControl;
        if (this.field_d.field_j[this.field_b - 1] != this.field_c) {
          var4 = this.field_c;
          this.field_c = var4.next;
          this.field_h = var4;
          return var4;
        }
        do {
          if (this.field_d.field_e <= this.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var3 = this.field_d.field_j[fieldTemp$0].next;
        } while (var3 == this.field_d.field_j[this.field_b - 1]);
        this.field_h = var3;
        this.field_c = var3.next;
        return var3;
    }

    private final void a(int param0) {
        this.field_b = 1;
        if (param0 == 29329) {
          this.field_h = null;
          this.field_c = this.field_d.field_j[0].next;
          return;
        }
        field_i = (tg) null;
        this.field_h = null;
        this.field_c = this.field_d.field_j[0].next;
    }

    public static void a(byte param0) {
        if (param0 == 22) {
          field_i = null;
          field_f = null;
          field_e = null;
          field_a = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        l.a((IndexedSprite[]) null, (ResourceArchive) null, (String[]) null, (int[]) null, 96, (String[]) null, (String[][]) null, -31, (ResourceArchive) null, (byte) 116, (String[][]) null, (RgbSprite[][]) null, (ResourceArchive) null, (byte[]) null, (RgbSprite[][]) null, true, (int[]) null, -127, (String[]) null, (byte[]) null);
        field_i = null;
        field_f = null;
        field_e = null;
        field_a = null;
    }

    l(q param0) {
        this.field_h = null;
        try {
          this.field_d = param0;
          this.a(29329);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "<%0> got careless";
        field_f = "Jump:";
        field_g = -1;
    }
}
