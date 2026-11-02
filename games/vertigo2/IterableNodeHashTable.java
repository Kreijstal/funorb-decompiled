/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static ll field_d;
    int field_c;
    IntrusiveNode[] field_f;
    private IntrusiveNode field_g;
    static lb field_e;
    static UiWidget[] field_h;
    static UiWidget field_a;
    static UiWidget field_b;

    final static int b(boolean param0) {
        if (!param0) {
          IterableNodeHashTable.b(false);
        }
        return (int)(1000000000L / sl.field_w);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_h = null;
        field_b = null;
        if (param0) {
          field_b = (UiWidget) null;
        }
        field_d = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int[] var22 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var16Lifetime1;
        int var16Lifetime2;
        var18 = Vertigo2.field_L ? 1 : 0;
        try {
          var12 = pk.a((byte) -14, cj.field_D, param6, ua.field_e);
          var13 = pk.a((byte) -14, cj.field_D, param5, ua.field_e);
          var14 = pk.a((byte) -14, ib.field_a, param3, ap.field_e);
          var15 = pk.a((byte) -14, ib.field_a, param4, ap.field_e);
          if (param1 >= -122) {
            field_h = (UiWidget[]) null;
          }
          var8_int = pk.a((byte) -14, cj.field_D, param0 + param6, ua.field_e);
          var9 = pk.a((byte) -14, cj.field_D, -param0 + param5, ua.field_e);
          for (var16 = var12; var16 < var8_int; var16++) {
            ki.a(-111, var14, vl.field_e[var16], var15, param7);
          }
          for (var16Lifetime1 = var13; var9 < var16Lifetime1; var16Lifetime1--) {
            ki.a(-75, var14, vl.field_e[var16Lifetime1], var15, param7);
          }
          var10 = pk.a((byte) -14, ib.field_a, param0 + param3, ap.field_e);
          var11 = pk.a((byte) -14, ib.field_a, -param0 + param4, ap.field_e);
          for (var16Lifetime2 = var8_int; var9 >= var16Lifetime2; var16Lifetime2++) {
            var22 = vl.field_e[var16Lifetime2];
            ki.a(-107, var14, var22, var10, param7);
            ki.a(-81, var10, var22, var11, param2);
            ki.a(-123, var11, var22, var15, param7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var8), "el.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final IntrusiveNode get(long param0, byte param1) {
        IntrusiveNode var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        IntrusiveNode var4 = this.field_f[(int)(param0 & (long)(this.field_c - 1))];
        if (param1 < 22) {
          return (IntrusiveNode) null;
        }
        this.field_g = var4.previous;
        while (this.field_g != var4) {
          if (this.field_g.key == param0) {
            var5 = this.field_g;
            this.field_g = this.field_g.previous;
            return var5;
          }
          this.field_g = this.field_g.previous;
        }
        this.field_g = null;
        return null;
    }

    final void put(long param0, IntrusiveNode param1, int param2) {
        IntrusiveNode var5 = null;
        try {
          if (param1.next != null) {
            param1.unlink(2);
          }
          var5 = this.field_f[(int)((long)(this.field_c - 1) & param0)];
          param1.previous = var5;
          param1.next = var5.next;
          param1.next.previous = param1;
          if (param2 <= 74) {
            IterableNodeHashTable.b(false);
          }
          param1.previous.next = param1;
          param1.key = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "el.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(byte param0) {
        int var1 = -92 / ((-8 - param0) / 56);
        return -pk.field_o + qp.field_d;
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_f = new IntrusiveNode[param0];
        this.field_c = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
        field_d = new ll();
    }
}
