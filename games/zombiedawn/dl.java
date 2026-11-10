/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    private IntrusiveNode field_g;
    static String[] field_h;
    private IntrusiveNode[] field_d;
    static String field_b;
    static String[] field_a;
    private int field_k;
    private IntrusiveNode field_j;
    static int field_f;
    private int field_i;
    static int field_c;
    static String field_e;

    final static boolean a(boolean param0) {
        if (param0) {
          dl.a(-127, -88, 106);
          return ic.field_U;
        }
        return ic.field_U;
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 == -974314864) {
          field_h = null;
          return;
        }
        dl.a(-16, -82, 52);
        field_h = null;
    }

    final void a(int param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.next != null) {
            param2.unlink(-27598);
          }
          var5 = this.field_d[(int)((long)(-1 + this.field_i) & param1)];
          param2.next = var5.next;
          param2.previous = var5;
          param2.next.previous = param2;
          param2.key = param1;
          param2.previous.next = param2;
          if (param0 <= -95) {
            return;
          }
          field_c = -96;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("dl.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final IntrusiveNode b(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var8;
        IntrusiveNode var11;
        var3 = ZombieDawn.field_J;
        if (0 >= this.field_k) {
          do {
            if (this.field_k >= this.field_i) {
              var2 = -85 % ((param0 - 65) / 34);
              return null;
            }
            fieldTemp$1 = this.field_k;
            this.field_k = this.field_k + 1;
            var4 = this.field_d[fieldTemp$1].previous;
          } while (this.field_d[this.field_k - 1] == var4);
          this.field_j = var4.previous;
          return var4;
        }
        if (this.field_d[this.field_k - 1] != this.field_j) {
          var11 = this.field_j;
          this.field_j = var11.previous;
          return var11;
        }
        do {
          if (this.field_k >= this.field_i) {
            var2 = -85 % ((param0 - 65) / 34);
            return null;
          }
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          var8 = this.field_d[fieldTemp$0].previous;
        } while (this.field_d[this.field_k - 1] == var8);
        this.field_j = var8.previous;
        return var8;
    }

    final static int[] a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3 = rd.a(true, param2);
        int var4 = WorldObject.cosFixed(1311979239, param2);
        if (param0 == 0) {
          var5 = rd.a(true, param1);
          var6 = WorldObject.cosFixed(1311979239, param1);
          var7 = (int)((long)var5 * (long)var3 >> 16);
          var8 = (int)((long)var3 * (long)var6 >> 16);
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        return (int[]) null;
    }

    final IntrusiveNode a(long param0, int param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = ZombieDawn.field_J;
        var4 = this.field_d[(int)((long)(this.field_i - 1) & param0)];
        if (param1 < 41) {
          return (IntrusiveNode) null;
        }
        this.field_g = var4.previous;
        while (true) {
          if (var4 == this.field_g) {
            this.field_g = null;
            return null;
          }
          if (~param0 != ~this.field_g.key) {
            this.field_g = this.field_g.previous;
            continue;
          }
          break;
        }
        var5 = this.field_g;
        this.field_g = this.field_g.previous;
        return var5;
    }

    final IntrusiveNode a(byte param0) {
        if (param0 == -113) {
          this.field_k = 0;
          return this.b((byte) -56);
        }
        this.field_i = 55;
        this.field_k = 0;
        return this.b((byte) -56);
    }

    dl(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_k = 0;
        this.field_i = param0;
        this.field_d = new IntrusiveNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_c = 66;
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
