/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    private ResourceArchive field_d;
    static tf field_i;
    static String[] field_b;
    private to field_h;
    static String[] field_k;
    static int field_a;
    static mh field_e;
    private ResourceArchive field_j;
    static RgbSprite chocolateFarSprite;
    static int[] field_g;
    static mh field_c;

    final wd a(int param0, boolean param1) {
        byte[] var4 = null;
        wd var3 = (wd) (this.field_h.a((long)param0, param1));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 32768) {
          var4 = this.field_j.takeFile(param0, 1, 4);
        } else {
          var4 = this.field_d.takeFile(param0 & 32767, 1, 4);
        }
        var3 = new wd();
        if (var4 != null) {
          var3.a(new PacketBuffer(var4), -3);
        }
        if (param0 >= 32768) {
          var3.g(-126);
          this.field_h.a(84, var3, (long)param0);
          if (!param1) {
            this.a(120, false);
            return var3;
          }
          return var3;
        }
        this.field_h.a(84, var3, (long)param0);
        if (param1) {
          return var3;
        }
        this.a(120, false);
        return var3;
    }

    final static boolean a(ResourceArchive param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 45) {
            field_i = (tf) null;
          }
          stackIn_3_0 = param0.ensureAllGroupsAvailable(96);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rg.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_e = null;
        field_c = null;
        chocolateFarSprite = null;
        field_b = null;
        field_k = null;
        if (param0 != 64) {
          rg.a(-104);
        }
    }

    rg(int param0, ResourceArchive param1, ResourceArchive param2, bp param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = new to(64);
        try {
          this.field_j = param1;
          this.field_d = param2;
          if (this.field_j != null) {
            this.field_j.getFileCapacity(-123, 1);
          }
          if (this.field_d == null) {
            return;
          }
          this.field_d.getFileCapacity(-124, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rg.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_a = 22;
        field_i = new tf();
        field_g = new int[4];
    }
}
