/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pk implements Iterable {
    static String field_b;
    static String field_f;
    private IntrusiveNode field_e;
    int field_d;
    IntrusiveNode[] field_c;
    static IndexedSprite[] field_a;
    static String field_g;

    final static Sprite[] a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        Sprite[] var1 = new Sprite[h.field_J];
        if (param0 >= -106) {
          field_f = (String) null;
        }
        for (var2 = 0; var2 < h.field_J; var2++) {
          var3 = jg.field_p[var2] * ho.field_i[var2];
          var4 = ln.field_I[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = ph.field_c[NameValidator.bitAnd((int) var4[var6], 255)];
          }
          var1[var2] = new Sprite(pb.field_g, gn.field_a, hl.field_l[var2], SectorCacheStore.field_d[var2], jg.field_p[var2], ho.field_i[var2], var5);
        }
        CanvasRasterBuffer.a(-18229);
        return var1;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new jf(this));
    }

    final void a(byte param0, IntrusiveNode param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param1.previous != null) {
            param1.unlink(true);
          }
          if (param0 > -17) {
            pk.releaseStatics(75);
          }
          var5 = this.field_c[(int)(param2 & (long)(-1 + this.field_d))];
          param1.previous = var5.previous;
          param1.next = var5;
          param1.previous.next = param1;
          param1.next.previous = param1;
          param1.key = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "pk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 != -14987) {
          field_a = (IndexedSprite[]) null;
        }
        field_b = null;
    }

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var5 = -25 / ((param0 - 51) / 52);
        IntrusiveNode var4 = this.field_c[(int)((long)(this.field_d - 1) & param1)];
        this.field_e = var4.next;
        while (this.field_e != var4) {
          if (~param1 == ~this.field_e.key) {
            var6 = this.field_e;
            this.field_e = this.field_e.next;
            return var6;
          }
          this.field_e = this.field_e.next;
        }
        this.field_e = null;
        return null;
    }

    pk(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_c = new IntrusiveNode[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    final static IndexedSprite[] a(String param0, int param1, String param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.c(param0, -91);
          if (param1 != 0) {
            field_b = (String) null;
          }
          var5 = param3.a(param2, (byte) 96, var4_int);
          stackIn_3_0 = ko.a(var4_int, (byte) 126, var5, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pk.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_f = "From <%0>: ";
        field_b = "Makes you and your minions extra bouncy and able to freeze the sea";
        field_g = "Underdark spells focus on stealing health and turning minions into zombies.";
    }
}
