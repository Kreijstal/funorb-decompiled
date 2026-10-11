/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wj {
    static int[] field_o;
    static String[] field_n;

    th(rj param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, 3917) == ol.field_h) {
            stackIn_3_0 = mh.field_H;
            return stackIn_3_0;
          }
          if (param0 == 1) {
            return null;
          }
          field_n = (String[]) null;
          stackIn_7_0 = null;
          return (String) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("th.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param0) {
          th.f((byte) 42);
          if (48 > param1) {
            if (param1 >= 65 &&
              param1 <= 90) {
              return true;
            }
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 57) {
            return true;
          }
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_28_0;
        }
        if (48 > param1) {
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_64_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 < 65) {
          if (param1 < 97) {
            return false;
          }
          if (param1 > 122) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (param1 <= 122);
        return stackIn_50_0;
    }

    final na a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        na stackIn_3_0 = null;
        na stackIn_8_0 = null;
        na stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!ra.a(var4, (byte) -128)) {
            stackIn_3_0 = ol.field_h;
            return stackIn_3_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = vi.a(90, var5);
          if (var3_int > 0 &&
            130 >= var3_int) {
            if (param1 != 3917) {
              th.f((byte) 97);
            }
            stackIn_12_0 = wj.field_i;
            return stackIn_12_0;
          }
          stackIn_8_0 = ol.field_h;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("th.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != -107) {
          field_o = (int[]) null;
        }
    }

    static {
        field_o = new int[5];
        field_n = new String[]{"Welcome! To complete this level, clear all the monkeys before the glowing line touches anything! <br><br>Clear nuts and monkeys by matching their colours. When<br>three monkeys or nuts of the same colour touch, they'll fall off the vines.<br><br>There is a bonus for completing the level quickly.<br><br>Use the <img=0> and <img=1> arrow keys to aim and <img=3> fire. Press <img=4> to pause the game.<br><br>", "Silver nuts are very heavy. They will drag anything they connect to downwards, so you need to be careful. Silver nuts cannot be cleared. To get rid of them, clear the colours they are attached to.<br><br>", "Spiderwebs are sticky - only nuts of the same colour as the spider do not get stuck in them. Spiders can be cleared in the same way monkeys can. When you clear the spider it will take its web with it.<br><br>", "Blocks are solid and cannot be removed. You will need to clear all the monkeys before the glowing line reaches a block, or you will lose the level. Nuts will bounce off blocks, so use this to reach monkeys in difficult areas.<br><br>", "Crumbly blocks will break if a nut hits them, so you can destroy them before the glowing line reaches them. You can still use them to deflect one nut.<br><br>"};
    }
}
