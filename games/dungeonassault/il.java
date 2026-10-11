/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int[] field_d;
    static String field_b;
    static bn field_c;
    static int field_a;
    private Object field_e;

    final cn a(int param0) {
        try {
          cn stackIn_6_0 = null;
          Throwable decompiledCaughtException = null;
          IllegalAccessException var2 = null;
          java.lang.reflect.InvocationTargetException var2_ref = null;
          Object[] var3 = null;
          if (this.field_e instanceof cn) {
            return (cn) (this.field_e);
          }
          try {
            if (param0 != 16) {
              this.field_e = (Object) null;
            }
            var3 = (Object[]) null;
            stackIn_6_0 = (cn) (hd.field_e.invoke(this.field_e, (Object[]) null));
            return stackIn_6_0;
          } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IllegalAccessException) (Object) decompiledCaughtException;
          } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
          }
          return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = DungeonAssault.field_K;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (pp.a(-63, param1)) {
            return true;
          }
          var8 = wk.field_f;
          var7 = var8;
          var6 = var7;
          var2 = var6;
          for (var3 = 0; var8.length > var3; var3++) {
            var4 = var8[var3];
            if (~param1 == ~var4) {
              return true;
            }
          }
          var2Lifetime1 = ul.field_c;
          for (var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 == var4Lifetime1) {
              return true;
            }
          }
          if (param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "il.C(" + param0 + ',' + param1 + ')');
        }
    }

    il(cn param0) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          IllegalAccessException var2 = null;
          java.lang.reflect.InvocationTargetException var2_ref = null;
          InstantiationException var2_ref2 = null;
          RuntimeException var2_ref3 = null;
          try {
            this.field_e = param0;
            if (hd.field_h != null) {
              ql.field_e[0] = param0;
              try {
                this.field_e = hd.field_h.newInstance(ql.field_e);
                return;
              } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (IllegalAccessException) (Object) decompiledCaughtException;
                return;
              } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                return;
              } catch (java.lang.InstantiationException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var2_ref2 = (InstantiationException) (Object) decompiledCaughtException;
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var2_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref3;
            stackIn_11_1 = new StringBuilder().append("il.<init>(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 <= 103) {
          field_d = (int[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_b = "Most dungeon rooms contain rats scavenging for food. The rats in this room are much, much larger and do more than scavenge.";
        field_c = null;
        field_d = new int[]{15, 15, 16};
    }
}
