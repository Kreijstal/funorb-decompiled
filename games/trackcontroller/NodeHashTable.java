/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeHashTable {
    static int field_h;
    static int field_e;
    private IntrusiveNode[] buckets;
    private IntrusiveNode field_d;
    static String field_a;
    private int field_f;
    static int field_g;
    private int bucketCount;
    private IntrusiveNode field_j;
    static int[] field_k;
    static String field_i;

    final IntrusiveNode get(int param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = TrackController.field_F ? 1 : 0;
        if (param0 != 8434) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var4 = this.buckets[(int)((long)(this.bucketCount - 1) & param1)];
        this.field_j = var4.next;
        while (var4 != this.field_j) {
          if (~param1 == ~this.field_j.key) {
            var5 = this.field_j;
            this.field_j = this.field_j.next;
            return var5;
          }
          this.field_j = this.field_j.next;
        }
        this.field_j = null;
        return null;
    }

    final static void a(byte param0, int param1, BitmapFont param2, String param3, va param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = 0;
          if (param0 > -111) {
            return;
          }
          var6 = -1;
          for (var7 = 1; var7 < param3.length(); var7++) {
            var8 = param3.charAt(var7);
            if (var8 == 60) {
              var6 = param4.field_b[0] + ((var5_int >> 8) + param2.stringWidth(param3.substring(0, var7)));
            }
            if (var6 != -1) {
              param4.field_b[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param4.field_b[var7] = param4.field_b[0] + ((var5_int >> 8) + param2.stringWidth(param3.substring(0, 1 + var7)) - param2.charWidth((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("id.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final IntrusiveNode next(byte param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        var3 = TrackController.field_F ? 1 : 0;
        if (this.field_f > 0 &&
          this.buckets[this.field_f - 1] != this.field_d) {
          var2 = this.field_d;
          this.field_d = var2.next;
          return var2;
        }
        do {
          if (this.bucketCount <= this.field_f) {
            if (param0 == 91) {
              return null;
            }
            field_e = -86;
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var2 = this.buckets[fieldTemp$0].next;
        } while (this.buckets[-1 + this.field_f] == var2);
        this.field_d = var2.next;
        return var2;
    }

    final void put(boolean param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.previous) {
            param2.unlink(-38);
          }
          var5 = this.buckets[(int)((long)(this.bucketCount - 1) & param1)];
          param2.next = var5;
          if (param0) {
            this.field_f = 37;
          }
          param2.previous = var5.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param1;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "id.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode first(int param0) {
        if (param0 > -34) {
          this.first(16);
        }
        this.field_f = 0;
        return this.next((byte) 91);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
          return;
        }
        field_i = null;
        field_k = null;
    }

    NodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_f = 0;
        this.buckets = new IntrusiveNode[param0];
        this.bucketCount = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_e = 200;
        field_a = "Mouse over an icon for details";
        field_k = new int[8192];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$1fdf1ca47e3f(int param0, int param1, BitmapFont param2, String param3, va param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = 0;
          if (param0 > -111) {
            return;
          }
          var6 = -1;
          for (var7 = 1; var7 < param3.length(); var7++) {
            var8 = param3.charAt(var7);
            if (var8 == 60) {
              var6 = param4.field_b[0] + ((var5_int >> 8) + param2.stringWidth(param3.substring(0, var7)));
            }
            if (var6 != -1) {
              param4.field_b[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param4.field_b[var7] = param4.field_b[0] + ((var5_int >> 8) + param2.stringWidth(param3.substring(0, 1 + var7)) - param2.charWidth((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("id.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }
}
