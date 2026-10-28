/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static PcmSample field_c;
    static int field_g;
    static int[] field_e;
    static int field_b;
    static int field_f;
    static int field_a;
    static PcmSampleStream field_d;

    public static void releaseStatics(int guard) {
        field_d = null;
        if (guard < 115) {
          gi var2 = (gi) null;
          vi.a((gi) null, 47);
        }
        field_c = null;
        field_e = null;
    }

    final static void a(gi param0, int param1) {
        String stackIn_24_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (param1 != 3) {
            return;
          }
          for (int var2_int = 0; var2_int < 3; var2_int++) {
            ResourceArchive.field_l[var2_int] = 0;
          }
          for (int var2_intLifetime1 = 0; var2_intLifetime1 < LoginStage.field_b; var2_intLifetime1++) {
            if (IterableNodeHashTable.field_d[var2_intLifetime1].field_a == param0.field_a) {
              int dupTemp$3 = IterableNodeHashTable.field_d[var2_intLifetime1].b(param1 ^ 83);
              ResourceArchive.field_l[dupTemp$3] = ResourceArchive.field_l[dupTemp$3] + 1;
            }
          }
          int dupTemp$0 = param0.b(108);
          ResourceArchive.field_l[dupTemp$0] = ResourceArchive.field_l[dupTemp$0] + 1;
          int var2_intLifetime2 = 0;
          for (int var3 = 0; LoginStage.field_b > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (IterableNodeHashTable.field_d[var3].field_a == param0.field_a) {
              int var4 = IterableNodeHashTable.field_d[var3].b(47);
              if (ResourceArchive.field_l[var4] > ReflectionCheck.field_k) {
                ResourceArchive.field_l[var4] = ResourceArchive.field_l[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              int incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              IterableNodeHashTable.field_d[incrementValue$2] = IterableNodeHashTable.field_d[var3];
            }
          }
          LoginStage.field_b = var2_intLifetime2;
          int fieldTemp$1 = LoginStage.field_b;
          LoginStage.field_b = LoginStage.field_b + 1;
          IterableNodeHashTable.field_d[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var2;
          StringBuilder stackIn_23_1 = new StringBuilder().append("vi.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, String param1, TextLayoutLine param2, BitmapFont param3, boolean param4) {
        String stackIn_23_2 = null;
        String stackIn_26_2 = null;
        String stackIn_29_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (param4) {
            vi.releaseStatics(-80);
          }
          int var5_int = 0;
          int var6 = -1;
          for (int var7 = 1; param1.length() > var7; var7++) {
            int var8 = param1.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + param2.insertionX[0] + param3.stringWidth(param1.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param0;
              }
              param2.insertionX[var7] = param2.insertionX[0] + ((var5_int >> 8) + param3.stringWidth(param1.substring(0, 1 + var7))) - param3.charAdvance((char) var8);
            } else {
              param2.insertionX[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var5;
          StringBuilder stackIn_22_1 = new StringBuilder().append("vi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          StringBuilder stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_f = 2;
    }
}
