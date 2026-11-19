/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends IntrusiveNode {
    int field_i;
    static String field_q;
    int[][] field_p;
    boolean field_j;
    long[][] field_k;
    static go[] field_o;
    int field_n;
    String[][] field_m;
    int field_l;

    public static void clearSharedReferences(int param0) {
        field_o = null;
        field_q = null;
        if (param0 > -66) {
          field_q = (String) null;
        }
    }

    final static void a(int param0, int param1, Sprite param2, boolean param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = HoldTheLine.field_D;
        try {
          var6_int = (param5 - param1 << 8) / param2.field_o;
          var7 = (param1 << 8) + var6_int * param2.field_u;
          param0 = param0 + param2.field_x;
          param4 = param4 + param2.field_u;
          var8 = param4 + param0 * SoftwareRasterizer.field_j;
          var9 = 0;
          if (!param3) {
            jg.clearSharedReferences(13);
          }
          var10 = param2.field_y;
          var11 = param2.field_s;
          var12 = -var11 + SoftwareRasterizer.field_j;
          if (param0 < SoftwareRasterizer.field_a) {
            var14 = -param0 + SoftwareRasterizer.field_a;
            var9 = var9 + var14 * var11;
            var8 = var8 + SoftwareRasterizer.field_j * var14;
            var10 = var10 - var14;
            param0 = SoftwareRasterizer.field_a;
          }
          var13 = 0;
          if (param4 < SoftwareRasterizer.field_d) {
            var14Lifetime1 = -param4 + SoftwareRasterizer.field_d;
            var11 = var11 - var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            param4 = SoftwareRasterizer.field_d;
          }
          if (SoftwareRasterizer.field_i < var10 + param0) {
            var10 = var10 - (var10 + (param0 - SoftwareRasterizer.field_i));
          }
          if (var11 + param4 > SoftwareRasterizer.field_e) {
            var14Lifetime2 = param4 + (var11 - SoftwareRasterizer.field_e);
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (0 < var11 &&
            0 < var10) {
            for (param0 = -var10; param0 < 0; param0++) {
              var14Lifetime3 = var7;
              for (param4 = -var11; param4 < 0; param4++) {
                var15 = var14Lifetime3 >> 8;
                var16 = -var15 + 256;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param2.field_z[incrementValue$0];
                  if (var17 != 0) {
                    if (var15 <= 255) {
                      var18 = SoftwareRasterizer.field_b[var8];
                      var19 = 16711935 & var16 * (16711935 & var18) + (var17 & 16711935) * var15 >> 8;
                      SoftwareRasterizer.field_b[var8] = var19 + LoginChoicePanel.a(65280, LoginChoicePanel.a(var18, 65280) * var16 + LoginChoicePanel.a(65280, var17) * var15 >> 8);
                    } else {
                      SoftwareRasterizer.field_b[var8] = var17;
                    }
                  }
                  var8++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("jg.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(rd param0, ei param1, byte param2) {
        int var20 = 0;
        int var27 = 0;
        Point2i var3 = null;
        Point2i var4 = null;
        uh var6 = null;
        uh var7 = null;
        vj var8 = null;
        vj var9 = null;
        float var12 = 0.0f;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        Object var17 = null;
        vj var17_ref = null;
        Object var18 = null;
        vj var18_ref = null;
        int var19 = 0;
        float var22 = 0.0f;
        int var23_int = 0;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        int var28 = 0;
        Vector2f var29 = null;
        Vector2f var30 = null;
        Point2i var31 = null;
        Point2i var32 = null;
        Point2i var33 = null;
        uh var34 = null;
        uh var35 = null;
        vj var36 = null;
        Object var37 = null;
        gj var37_ref = null;
        Object var40 = null;
        Object var46 = null;
        vj var61 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        float var16 = 0.0f;
        float var23 = 0.0f;
        uh var38 = null;
        uh var39 = null;
        Vector2f var41 = null;
        Vector2f var42 = null;
        Point2i var43 = null;
        Point2i var44 = null;
        Point2i var45 = null;
        TrackBoundary var46_ref = null;
        Vector2f var47 = null;
        Vector2f var48 = null;
        Point2i var49 = null;
        Point2i var50 = null;
        Point2i var51 = null;
        uh var52 = null;
        uh var53 = null;
        Vector2f var54 = null;
        Vector2f var55 = null;
        Point2i var56 = null;
        Point2i var57 = null;
        Point2i var58 = null;
        uh var59 = null;
        uh var60 = null;
        Point2i var3Lifetime1;
        Point2i var4Lifetime1;
        var17 = null;
        var18 = null;
        var40 = null;
        var37 = null;
        var46 = null;
        var28 = HoldTheLine.field_D;
        try {
          var34 = o.a((byte) -115);
          var6 = var34;
          var35 = o.a((byte) -113);
          var7 = var35;
          var8 = (vj) (param1.field_b[-1 + param1.field_e]);
          var9 = (vj) (param1.field_b[0]);
          var31 = var8.a(0);
          var29 = wb.a(var8, var9, 3251);
          var30 = new Vector2f(var29);
          var29.scale((float)param0.field_c, -1);
          var30.scale((float)param0.field_h, -1);
          var32 = new Point2i(var31);
          var3 = var32;
          var32.translate(var29, (byte) 98);
          var33 = new Point2i(var31);
          var4 = var33;
          var33.subtractVector(var30, -13201);
          var34.a(var32.x, (byte) 64);
          var34.a(var32.y, (byte) 127);
          var35.a(var33.x, (byte) 71);
          var35.a(var33.y, (byte) 68);
          var12 = fb.a(param1, (byte) 115);
          var13 = (int)(var12 / param0.field_k) + 1;
          var14 = var12 / (float)(var13 * param0.field_i);
          var15 = var14;
          var17_ref = (vj) (param1.field_b[param1.field_e - 1]);
          var18_ref = (vj) (param1.field_b[0]);
          var19 = 0;
          if (param2 < 14) {
            field_o = (go[]) null;
          }
          for (var20 = 0; var20 < param1.field_e; var20++) {
            var36 = var18_ref;
            var17_ref = var36;
            var61 = (vj) (param1.field_b[(1 + var20) % param1.field_e]);
            if (var17_ref instanceof TrackBoundary) {
              var46_ref = (TrackBoundary) (var36);
              var47 = var46_ref.g(-1).perpendicular((byte) 77);
              var48 = new Vector2f(var47);
              var47.scale((float)param0.field_c, -1);
              var48.scale((float)param0.field_h, -1);
              var22 = var14 / var46_ref.f(50);
              var16 = var15 / var46_ref.f(50);
              var23 = var46_ref.f(50);
              while (var23 > var15) {
                var49 = var46_ref.a(false, var16);
                var50 = new Point2i(var49);
                var3Lifetime1 = var50;
                var50.translate(var47, (byte) 89);
                var51 = new Point2i(var49);
                var4Lifetime1 = var51;
                var51.subtractVector(var48, -13201);
                var6.a(var50.x, (byte) 100);
                var6.a(var50.y, (byte) 63);
                var7.a(var51.x, (byte) 106);
                var7.a(var51.y, (byte) 89);
                if (var36.field_p) {
                  param0.a(var6.a(-77), var19, (byte) -65, var7.a(-60));
                }
                var19++;
                var52 = o.a((byte) -112);
                var6 = var52;
                var53 = o.a((byte) -125);
                var7 = var53;
                var52.a(var50.x, (byte) 97);
                var52.a(var50.y, (byte) 82);
                var53.a(var51.x, (byte) 71);
                var23 = var23 - var15;
                var16 = var16 + var22;
                var53.a(var51.y, (byte) 109);
                var15 = var14;
              }
              var56 = var46_ref.field_s;
              var54 = wb.a(var46_ref, var61, 3251);
              var55 = new Vector2f(var54);
              var54.scale((float)param0.field_c, -1);
              var55.scale((float)param0.field_h, -1);
              var57 = new Point2i(var56);
              var3Lifetime1 = var57;
              var57.translate(var54, (byte) 126);
              var58 = new Point2i(var56);
              var4Lifetime1 = var58;
              var58.subtractVector(var55, -13201);
              var6.a(var57.x, (byte) 95);
              var6.a(var57.y, (byte) 92);
              var7.a(var58.x, (byte) 71);
              var15 = var15 - var23;
              var7.a(var58.y, (byte) 106);
            } else {
              var37_ref = (gj) (var36);
              var22 = var37_ref.f(50);
              var23_int = (int)(var22 / 5.0f) + 1;
              var24 = var22 / (float)var23_int;
              var25 = (var37_ref.field_w - var37_ref.field_r) / (float)var23_int;
              var26 = var25 + var37_ref.field_r;
              for (var27 = 1; var23_int >= var27; var27++) {
                if (var37_ref.field_r > var37_ref.field_w) {
                  var3Lifetime1 = new Point2i((int)((double)var37_ref.field_t.x + (double)(param0.field_h + var37_ref.field_u) * Math.cos((double)var26)), (int)((double)var37_ref.field_t.y - (double)(param0.field_h + var37_ref.field_u) * Math.sin((double)var26)));
                  var4Lifetime1 = new Point2i((int)((double)var37_ref.field_t.x + (double)(-param0.field_c + var37_ref.field_u) * Math.cos((double)var26)), (int)((double)var37_ref.field_t.y - (double)(var37_ref.field_u - param0.field_c) * Math.sin((double)var26)));
                } else {
                  var3Lifetime1 = new Point2i((int)((double)var37_ref.field_t.x + (double)(-param0.field_h + var37_ref.field_u) * Math.cos((double)var26)), (int)((double)var37_ref.field_t.y - (double)(-param0.field_h + var37_ref.field_u) * Math.sin((double)var26)));
                  var4Lifetime1 = new Point2i((int)((double)var37_ref.field_t.x + (double)(var37_ref.field_u + param0.field_c) * Math.cos((double)var26)), (int)((double)var37_ref.field_t.y - (double)(var37_ref.field_u + param0.field_c) * Math.sin((double)var26)));
                }
                var26 = var26 + var25;
                var6.a(var3Lifetime1.x, (byte) 74);
                var6.a(var3Lifetime1.y, (byte) 94);
                var7.a(var4Lifetime1.x, (byte) 106);
                var15 = var15 - var24;
                var7.a(var4Lifetime1.y, (byte) 104);
                if (var15 <= 0.0f) {
                  if (var37_ref.field_p) {
                    param0.a(var6.a(-97), var19, (byte) -79, var7.a(-90));
                  }
                  var38 = o.a((byte) 78);
                  var6 = var38;
                  var15 = var15 + var14;
                  var19++;
                  var39 = o.a((byte) 55);
                  var7 = var39;
                  var38.a(var3Lifetime1.x, (byte) 71);
                  var38.a(var3Lifetime1.y, (byte) 69);
                  var39.a(var4Lifetime1.x, (byte) 101);
                  var39.a(var4Lifetime1.y, (byte) 72);
                }
              }
              var43 = var37_ref.a(0);
              var41 = wb.a(var37_ref, var61, 3251);
              var42 = new Vector2f(var41);
              var41.scale((float)param0.field_c, -1);
              var42.scale((float)param0.field_h, -1);
              var44 = new Point2i(var43);
              var3Lifetime1 = var44;
              var44.translate(var41, (byte) 117);
              var45 = new Point2i(var43);
              var4Lifetime1 = var45;
              var45.subtractVector(var42, -13201);
              var6.a(var44.x, (byte) 103);
              var6.a(var44.y, (byte) 75);
              var7.a(var45.x, (byte) 93);
              var7.a(var45.y, (byte) 65);
            }
            if (var36.field_p) {
              param0.a(var6.a(-88), var19, (byte) -127, var7.a(-57));
            }
            var59 = o.a((byte) 68);
            var60 = o.a((byte) -109);
            var59.a(var3Lifetime1.x, (byte) 68);
            var59.a(var3Lifetime1.y, (byte) 75);
            var60.a(var4Lifetime1.x, (byte) 82);
            var60.a(var4Lifetime1.y, (byte) 115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_33_0 = var3_ref;
          stackIn_33_1 = new StringBuilder().append("jg.B(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (~(7 & param1) != param0) {
          var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 + var2;
        return var3;
    }

    jg() {
    }

    static {
        field_q = "EXCLUSIVE";
    }
}
