/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ObjectHistoryBuffer extends IntrusiveNode {
    static String field_l;
    static RgbSprite ninjaCharacterSprite;
    static int[] field_k;
    static String field_j;
    static RgbSprite[][] arcticCapsSprites;
    static int[] field_p;
    int latestIndex;
    private Object[] entries;
    private int capacity;

    public static void a(int param0) {
        field_j = null;
        arcticCapsSprites = (RgbSprite[][]) null;
        ninjaCharacterSprite = null;
        field_p = null;
        if (param0 <= 36) {
          return;
        }
        field_l = null;
        field_k = null;
    }

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (1 == param1) {
            var10 = param3[param0];
            var4 = var10;
            if (var4 != null) {
              stackIn_10_0 = var10.toString();
              return stackIn_10_0;
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param0 + param1;
          if (param2 != 19166) {
            stackIn_13_0 = (String) null;
            return stackIn_13_0;
          }
          var5 = 0;
          for (var6_int = param0; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param3[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param0; var7 < var4_int; var7++) {
            var8 = param3[var7];
            if (var8 == null) {
              discarded$3 = var6.append("null");
            } else {
              discarded$4 = var6.append(var8);
            }
          }
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("ao.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final Object get(int index, int obfuscationGuard) {
        if (this.latestIndex < index) {
          throw new RuntimeException("State in future " + this.latestIndex + " " + index);
        }
        int var3 = 80 / ((11 - obfuscationGuard) / 35);
        if (1 + (this.latestIndex - this.capacity) > index) {
          throw new RuntimeException("State erased " + index + ". Lastest entry: " + this.latestIndex);
        }
        return this.entries[index % this.capacity];
    }

    final void append(Object value, byte obfuscationGuard) {
        int nextIndex = 0;
        try {
          if (obfuscationGuard != -39) {
            this.append(((Object[]) (this.entries[8]))[13], ((byte[]) (this.entries[1]))[9]);
          }
          nextIndex = this.latestIndex + 1;
          this.latestIndex = this.latestIndex + 1;
          this.entries[nextIndex % this.capacity] = value;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ao.A(" + (value != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    ObjectHistoryBuffer(int capacity) {
        this.latestIndex = -1;
        this.capacity = capacity;
        this.entries = new Object[this.capacity];
    }

    static {
        field_l = "Show all private chat";
        field_k = new int[]{8, 14, 15, 16, 43};
        field_j = "You have not yet unlocked this option for use.";
    }
}
