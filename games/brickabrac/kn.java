/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends DualLinkNode {
    boolean field_A;
    int[] field_x;
    static int field_z;
    static String[] field_E;
    String field_D;
    static int field_y;
    char[] field_u;
    static volatile boolean livePointerChanged;
    int[] field_v;
    char[] field_w;

    private final void a(int param0, PacketBuffer param1, int param2) {
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char stackIn_10_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char stackIn_17_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 <= 59) {
            field_z = -79;
          }
          if (1 == param2) {
            this.field_D = param1.readCp1252String(-1);
          } else {
            if (param2 == 2) {
              var4_int = param1.readUnsignedByte(255);
              this.field_x = new int[var4_int];
              this.field_w = new char[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_x[var5] = param1.readUnsignedShort(65280);
                var6 = param1.readByte(true);
                stackIn_9_0 = this.field_w;
                stackIn_9_1 = var5;
                if (0 == var6) {
                  stackIn_10_2 = (char)0;
                } else {
                  stackIn_10_2 = cq.a((byte) -112, (byte) var6);
                }
                stackIn_9_0[stackIn_9_1] = stackIn_10_2;
              }
            } else if (param2 == 3) {
              var4_int = param1.readUnsignedByte(255);
              this.field_u = new char[var4_int];
              this.field_v = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_v[var5] = param1.readUnsignedShort(65280);
                var6 = param1.readByte(true);
                stackIn_16_0 = this.field_u;
                stackIn_16_1 = var5;
                if (0 == var6) {
                  stackIn_17_2 = (char)0;
                } else {
                  stackIn_17_2 = cq.a((byte) -11, (byte) var6);
                }
                stackIn_16_0[stackIn_16_1] = stackIn_17_2;
              }
            } else {
              if (param2 == 4) {
                this.field_A = true;
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("kn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_E = null;
        if (param0 <= 44) {
          kn.a((byte) -32);
        }
    }

    final void a(PacketBuffer param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != -29539) {
            field_E = (String[]) null;
          }
          while (true) {
            var3_int = param0.readUnsignedByte(255);
            if (0 == var3_int) {
              return;
            }
            this.a(104, param0, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kn.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
          if (11 == AchievementIcon.field_j) {
            mk.a(-1);
          }
          if (!param0) {
            kn.a((byte) -116);
          }
          bf.a(ri.field_N, 8192, ep.field_a, LevelCompleteScreen.field_C);
          ck.a(param1, 0, 14209, 0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "kn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(byte param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        int var2Lifetime1;
        if (param0 >= -86) {
          java.awt.Canvas var4 = (java.awt.Canvas) null;
          kn.a(false, (java.awt.Canvas) null);
        }
        if (null != this.field_v) {
          for (var2 = 0; var2 < this.field_v.length; var2++) {
            this.field_v[var2] = LevelSelectScreen.d(this.field_v[var2], 32768);
          }
        }
        if (this.field_x != null) {
          var5 = 0;
          var2Lifetime1 = var5;
          while (var5 < this.field_x.length) {
            this.field_x[var5] = LevelSelectScreen.d(this.field_x[var5], 32768);
            var5++;
          }
        }
    }

    kn() {
        this.field_A = false;
    }

    static {
        livePointerChanged = false;
    }
}
