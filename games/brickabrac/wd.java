/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends DualLinkNode {
    int[] field_u;
    private int[][] field_A;
    private int[] field_B;
    private String[] field_y;
    static NodeDeque field_v;
    static mh field_E;
    static mh[] field_F;
    static String field_D;
    static String field_x;
    static int field_z;
    static mh field_w;
    static mf field_C;

    final void g(int param0) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        int var2Lifetime1;
        if (null != this.field_u) {
          for (var2 = 0; var2 < this.field_u.length; var2++) {
            this.field_u[var2] = ud.d(this.field_u[var2], 32768);
          }
        }
        var2Lifetime1 = 122 % ((param0 + 60) / 61);
    }

    public static void f(int param0) {
        field_F = null;
        field_E = null;
        field_x = null;
        field_v = null;
        field_C = null;
        field_D = null;
        field_w = null;
        if (param0 != 32463) {
          wd.f(-119);
        }
    }

    final String h(int param0) {
        int var3 = 0;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_y) {
          return "";
        }
        StringBuilder discarded$15 = var5.append(this.field_y[0]);
        if (param0 != -3) {
          return (String) null;
        }
        for (var3 = 1; var3 < this.field_y.length; var3++) {
          discarded$16 = var2.append("...");
          discarded$17 = var5.append(this.field_y[var3]);
        }
        return var2.toString();
    }

    private final void a(int param0, int param1, PacketBuffer param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != -3) {
            this.field_B = (int[]) null;
          }
          if (param0 != 1) {
            if (param0 == 2) {
              var4_int = param2.readUnsignedByte(255);
              this.field_u = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_u[var5] = param2.readUnsignedShort(65280);
              }
            } else if (param0 == 3) {
              var4_int = param2.readUnsignedByte(255);
              this.field_B = new int[var4_int];
              this.field_A = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param2.readUnsignedShort(65280);
                var7 = Ball.a(var6, (byte) 84);
                if (var7 != null) {
                  this.field_B[var5] = var6;
                  array$0 = new int[var7.field_g];
                  this.field_A[var5] = array$0;
                  for (var8 = 0; var7.field_g > var8; var8++) {
                    this.field_A[var5][var8] = param2.readUnsignedShort(65280);
                  }
                }
              }
            } else {
              if (param0 != 4) {
                return;
              }
            }
          } else {
            this.field_y = qb.a((byte) -63, param2.readCp1252String(-1), '<');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("wd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
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
          if (param1 != -3) {
            this.g(-2);
          }
          while (true) {
            var3_int = param0.readUnsignedByte(255);
            if (var3_int == 0) {
              return;
            }
            this.a(var3_int, -3, param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wd.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, mh param2) {
        nn var9 = null;
        RgbSprite var11 = null;
        String var10 = null;
        nn var12 = null;
        RgbSprite var14 = null;
        String var13 = null;
        nn var15 = null;
        RgbSprite var17 = null;
        String var16 = null;
        nn var18 = null;
        RgbSprite var20 = null;
        String var19 = null;
        nn var21 = null;
        RgbSprite var23 = null;
        String var22 = null;
        nn var24 = null;
        RgbSprite var26 = null;
        String var25 = null;
        nn var27 = null;
        String var28 = null;
        nn var30 = null;
        RgbSprite var32 = null;
        String var31 = null;
        nn var33 = null;
        RgbSprite var35 = null;
        String var34 = null;
        int var6 = 0;
        int var7 = 0;
        RgbSprite var29 = null;
        RgbSprite var29Lifetime1;
        RgbSprite var29Lifetime2;
        RgbSprite var29Lifetime3;
        RgbSprite var29Lifetime4;
        RgbSprite var29Lifetime5;
        RgbSprite var29Lifetime6;
        SpriteGeometry.a(param1, param2, (mm) null, (int[]) null, (String) null, -1, (byte) -58, 0L, (String) null);
        if (param1 == 0) {
          var9 = bm.field_d;
          var11 = ef.field_b[0];
          var29 = var11;
          var29Lifetime2 = var11;
          var10 = ro.field_m;
          var9.field_d.a(var10, 108, 11, var11);
          var12 = bm.field_d;
          var14 = ef.field_b[1];
          var29Lifetime3 = var14;
          var29Lifetime4 = var14;
          var13 = eo.field_l;
          var12.field_d.a(var13, 105, 12, var14);
          var15 = bm.field_d;
          var17 = ef.field_b[2];
          var29Lifetime5 = var17;
          var29Lifetime6 = var17;
          var16 = co.field_e;
          var15.field_d.a(var16, 112, 13, var17);
        }
        if (1 == param1) {
          var18 = bm.field_d;
          var20 = ef.field_b[0];
          var19 = LegacyUtf8Decoder.field_a;
          var18.field_d.a(var19, param0 ^ 864, 11, var20);
          var21 = bm.field_d;
          var23 = ef.field_b[1];
          var22 = DualLinkNode.field_m;
          var21.field_d.a(var22, 123, 12, var23);
          var24 = bm.field_d;
          var26 = ef.field_b[2];
          var25 = kg.field_b;
          var24.field_d.a(var25, param0 ^ 843, 13, var26);
        }
        if (param1 == 2) {
          var27 = bm.field_d;
          var29Lifetime1 = ef.field_b[0];
          var28 = ObjectHistoryBuffer.field_l;
          var27.field_d.a(var28, param0 - 686, 11, var29Lifetime1);
          var30 = bm.field_d;
          var32 = ef.field_b[1];
          var31 = lg.field_M;
          var30.field_d.a(var31, param0 - 720, 12, var32);
          var33 = bm.field_d;
          var35 = ef.field_b[2];
          var34 = ac.field_b;
          var33.field_d.a(var34, param0 - 708, 13, var35);
        }
        nn var36 = bm.field_d;
        int var4 = param2.field_Eb;
        int var5 = param2.field_db;
        if (param0 != 784) {
          return;
        }
        try {
          var6 = param2.field_Ib;
          var7 = param2.field_cb;
          var36.field_d.a(var5, -124, var7, var6, var4);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wd.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    wd() {
    }

    static {
        field_v = new NodeDeque();
        field_D = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_x = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
