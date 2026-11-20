/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class InheritedWidgetStyle extends WidgetStyleNode {
    private int field_z;
    private BitmapFont field_V;
    private Sprite field_P;
    private int field_E;
    private Sprite field_cb;
    private int field_U;
    static int[] field_W;
    private int field_eb;
    private int field_J;
    private boolean field_G;
    private Sprite[] field_Z;
    private boolean field_O;
    private boolean field_db;
    private Sprite field_K;
    private int field_S;
    private boolean field_C;
    private boolean field_M;
    private int field_w;
    private Sprite field_F;
    private Sprite[] field_Q;
    private String field_bb;
    private Sprite[] field_B;
    private int field_A;
    private Sprite field_R;
    private int field_T;
    private int field_y;
    private int field_H;
    private int field_D;
    private int field_t;
    private String field_u;
    static Sprite field_N;
    private boolean field_ab;
    private int field_fb;
    private Sprite[] field_Y;
    private int field_I;
    private int field_L;
    private int field_X;
    private Sprite[] field_v;
    private int field_x;

    final static Sprite getPlaceholderSprite(int param0, byte param1, int param2) {
        Sprite var3;
        int var4;
        int var5;
        Sprite var3Lifetime1;
        var5 = HoldTheLine.field_D;
        var3 = (Sprite) (ProxySocketConnector.field_j.first((byte) 126));
        while (var3 != null) {
          if (var3.width == param0 &&
            param2 == var3.height) {
            return var3;
          }
          var3 = (Sprite) (ProxySocketConnector.field_j.next((byte) 114));
        }
        var3Lifetime1 = new Sprite(param0, param2);
        var4 = param0 * param2;
        while (0 < var4) {
          var4--;
          var3Lifetime1.pixels[var4] = 1;
        }
        JagexLogoRenderer.pushSpriteRaster(-74, var3Lifetime1);
        if (param1 > -37) {
          return (Sprite) null;
        }
        if (128 < param2) {
          LoadProgressDialog.field_hb.draw(param0 - 128 >> 1, -128 + param2 >> 1);
        } else {
          LoadProgressDialog.field_hb.drawDownscaledBlended(-(param2 * 3 / 4) + param0 >> 1, 0, 3 * param2 / 4, param2);
        }
        ProxySocketConnector.field_j.addLast((byte) -121, var3Lifetime1);
        MarkerSliderRenderer.restoreRasterTarget(-1);
        return var3Lifetime1;
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = -105 % ((param0 - 37) / 49);
        field_N = null;
        field_W = null;
    }

    final static void paintRasterBuffer(java.awt.Canvas param0, int param1, boolean param2, int param3) {
        java.awt.Graphics var4 = null;
        if (!param2) {
          InheritedWidgetStyle.clearSharedReferences((byte) -49);
        }
        try {
          var4 = param0.getGraphics();
          SocialListProtocol.field_c.draw(param1, param3, var4, 34);
          var4.dispose();
        } catch (Exception exception) {
          param0.repaint();
        }
    }

    final static void drawNineSlice(Sprite[] param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = HoldTheLine.field_D;
        try {
          if (param0 == null) {
            return;
          }
          if (param3 > 0 &&
            param1 > 0) {
            if (param0[3] == null) {
              stackIn_9_0 = 0;
            } else {
              stackIn_9_0 = param0[3].canvasWidth;
            }
            var6_int = stackIn_9_0;
            if (param0[5] == null) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param0[5].canvasWidth;
            }
            var7 = stackIn_12_0;
            if (null == param0[1]) {
              stackIn_15_0 = 0;
            } else {
              stackIn_15_0 = param0[1].canvasHeight;
            }
            var8 = stackIn_15_0;
            if (param0[7] != null) {
              stackIn_18_0 = param0[7].canvasHeight;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param4 + param3;
            var11 = param5 + param1;
            var12 = param4 + var6_int;
            if (!param2) {
              return;
            }
            var13 = var10 - var7;
            var14 = var8 + param5;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param4 + var6_int * param3 / (var6_int + var7);
              var16 = param4 + var6_int * param3 / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            SoftwareRasterizer.saveClip(AccountTermsPanel.field_L);
            if (var19 < var18) {
              var19 = param1 * var8 / (var8 + var9) + param5;
              var18 = param1 * var8 / (var8 + var9) + param5;
            }
            if (null != param0[0]) {
              SoftwareRasterizer.intersectClip(param4, param5, var16, var18);
              param0[0].draw(param4, param5);
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
            }
            if (null != param0[2]) {
              SoftwareRasterizer.intersectClip(var17, param5, var10, var18);
              param0[2].draw(var13, param5);
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
            }
            if (null != param0[6]) {
              SoftwareRasterizer.intersectClip(param4, var19, var16, var11);
              param0[6].draw(param4, var15);
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
            }
            if (null != param0[8]) {
              SoftwareRasterizer.intersectClip(var17, var19, var10, var11);
              param0[8].draw(var13, var15);
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
            }
            if (null != param0[1] &&
              param0[1].canvasWidth != 0) {
              SoftwareRasterizer.intersectClip(var16, param5, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param0[1].canvasWidth) {
                param0[1].draw(var20, param5);
              }
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
            }
            if (null != param0[7] &&
              param0[7].canvasWidth != 0) {
              SoftwareRasterizer.intersectClip(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param0[7].canvasWidth) {
                param0[7].draw(var20Lifetime1, var15);
              }
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
            }
            if (null != param0[3] &&
              0 != param0[3].canvasHeight) {
              SoftwareRasterizer.intersectClip(param4, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param0[3].canvasHeight) {
                param0[3].draw(param4, var20Lifetime2);
              }
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
            }
            if (param0[5] != null &&
              0 != param0[5].canvasHeight) {
              SoftwareRasterizer.intersectClip(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param0[5].canvasHeight) {
                param0[5].draw(var13, var20Lifetime3);
              }
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
            }
            if (param0[4] != null &&
              param0[4].canvasWidth != 0 &&
              0 != param0[4].canvasHeight) {
              SoftwareRasterizer.intersectClip(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param0[4].canvasHeight) {
                for (var21 = var12; var21 < var13; var21 = var21 + param0[4].canvasWidth) {
                  param0[4].draw(var21, var20Lifetime4);
                }
              }
              SoftwareRasterizer.restoreClip(AccountTermsPanel.field_L);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("hi.N(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    InheritedWidgetStyle(long param0, InheritedWidgetStyle param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static BlobReadRequest requestBlobRead(int param0, int param1) {
        BlobReadRequest var2 = null;
        if (param1 < -51) {
          var2 = new BlobReadRequest();
          SpriteLayoutUtilities.field_d.addLast((byte) -104, var2);
          PlayerDataProtocol.sendBlobReadRequest(param0, 51);
          return var2;
        }
        return (BlobReadRequest) null;
    }

    private final void inheritStyleProperties(InheritedWidgetStyle param0, int param1) {
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            if (null != param0.field_cb) {
              this.field_cb = param0.field_cb;
            }
            if (!param0.field_G) {
              this.field_G = param0.field_G;
            }
            if (null != param0.field_u) {
              this.field_u = param0.field_u;
            }
            if (param0.field_Y != null) {
              this.field_Y = param0.field_Y;
            }
            if (-2147483648 != param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (256 != param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_H != 0) {
              this.field_H = param0.field_H;
            }
            if (param0.field_eb != 0) {
              this.field_eb = param0.field_eb;
            }
            if (param0.field_O) {
              this.field_O = param0.field_O;
            }
            if (param0.field_z >= 0) {
              this.field_z = param0.field_z;
            }
            if (null != param0.field_v) {
              this.field_v = param0.field_v;
            }
            if (param0.field_t >= 0) {
              this.field_t = param0.field_t;
            }
            if (param0.field_db) {
              this.field_db = param0.field_db;
            }
            if (param0.field_M) {
              this.field_M = param0.field_M;
            }
            if (null != param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (param0.field_T != 0) {
              this.field_T = param0.field_T;
            }
            if (param0.field_y != -2147483648) {
              this.field_y = param0.field_y;
            }
            if (param0.field_S != 0) {
              this.field_S = param0.field_S;
            }
            if (param0.field_X >= 0) {
              this.field_X = param0.field_X;
            }
            if (param0.field_A != 0) {
              this.field_A = param0.field_A;
            }
            if (param0.field_Z != null) {
              this.field_Z = param0.field_Z;
            }
            if (-2147483648 != param0.field_D) {
              this.field_D = param0.field_D;
            }
            if (param0.field_P != null) {
              this.field_P = param0.field_P;
            }
            if (param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (param0.field_L >= 0) {
              this.field_L = param0.field_L;
            }
            if (param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (null != param0.field_V) {
              this.field_V = param0.field_V;
            }
            if (param0.field_E != -2147483648) {
              this.field_E = param0.field_E;
            }
            if (param0.field_B != null) {
              this.field_B = param0.field_B;
            }
            if (param0.field_K != null) {
              this.field_K = param0.field_K;
            }
            if (-2147483648 != param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (-2147483648 != param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (param0.field_I != 0) {
              this.field_I = param0.field_I;
            }
            if (null != param0.field_R) {
              this.field_R = param0.field_R;
            }
            if (param0.field_bb != null) {
              this.field_bb = param0.field_bb;
            }
            if (param0.field_Q != null) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_fb != 0) {
              this.field_fb = param0.field_fb;
            }
          }
          var3_int = 32 % ((38 - param1) / 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("hi.O(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    final static float findRoadParameter(int param0, float param1, int param2, RoadSegment[] param3, int param4, Point2i param5, int param6) {
        int var8 = 0;
        float stackIn_8_0 = 0.0f;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        float stackIn_36_0 = 0.0f;
        float stackIn_45_0 = 0.0f;
        float stackIn_48_0 = 0.0f;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var9 = 0;
        RoadSegment var10 = null;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        Object var20 = null;
        CurvedRoadSegment var20_ref = null;
        Object var21 = null;
        StraightRoadSegment var21_ref = null;
        var20 = null;
        var21 = null;
        var19 = HoldTheLine.field_D;
        try {
          if (param2 == 0) {
            param0 = param0 * 2;
          }
          var7_int = (int)param1;
          param0++;
          if (param0 > param3.length) {
            param0 = param3.length;
          }
          if (param4 != -24659) {
            stackIn_8_0 = 1.185455083847046f;
            return stackIn_8_0;
          }
          for (var8 = 0; param0 > var8; var8++) {
            stackIn_13_0 = var7_int;
            if (0 == param2) {
              if (var8 % 2 != 1) {
                stackIn_16_1 = -(var8 / 2);
              } else {
                stackIn_16_1 = (1 + var8) / 2;
              }
            } else {
              stackIn_16_1 = param2 * var8;
            }
            var9 = stackIn_13_0 + stackIn_16_1;
            if (param3.length <= var9) {
              var9 = var9 - param3.length;
            }
            if (var9 < 0) {
              var9 = var9 + param3.length;
            }
            var10 = param3[var9];
            if (-var10.layer + param6 <= 1 &&
              -1 <= param6 - var10.layer) {
              if (var10 instanceof StraightRoadSegment) {
                var21_ref = (StraightRoadSegment) (var10);
                var12 = (float)(param5.x - var21_ref.start.x);
                var13 = (float)(-var21_ref.start.y + param5.y);
                var14 = var21_ref.offsetDirectionY * var12 - var13 * var21_ref.offsetDirectionX;
                if (!(0.0f > var14) &&
                  !(var21_ref.segmentLength < var14)) {
                  var15 = var14 / var21_ref.segmentLength;
                  var16 = var12 * var21_ref.offsetDirectionX + var13 * var21_ref.offsetDirectionY;
                  var17 = (float)var21_ref.leftCollisionOffsetAt(var15, 0);
                  var18 = (float)var21_ref.rightCollisionOffsetAt(96, var15);
                  if (var17 <= var16 &&
                    var16 <= var18) {
                    stackIn_45_0 = var15 + (float)var9;
                    return stackIn_45_0;
                  }
                }
              } else {
                var20_ref = (CurvedRoadSegment) (var10);
                var12 = (float)(-var20_ref.center.x + param5.x);
                var13 = (float)(-var20_ref.center.y + param5.y);
                var14 = (float)var20_ref.leftCollisionRadius;
                var15 = (float)var20_ref.rightCollisionRadius;
                if (var20_ref.startAngle > var20_ref.endAngle) {
                  var15 = (float)var20_ref.leftCollisionRadius;
                  var14 = (float)var20_ref.rightCollisionRadius;
                }
                var16 = var12 * var12 + var13 * var13;
                if (!(var16 < var14 * var14) &&
                  !(var16 > var15 * var15)) {
                  var17 = BoundaryIntersection.angleBetweenPoints(var20_ref.center, param5, false);
                  var18 = var20_ref.parameterAtAngle(var17, (byte) 72);
                  if (var18 >= 0.0f &&
                    1.0f >= var18) {
                    stackIn_36_0 = var18 + (float)var9;
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
          stackIn_48_0 = -1.0f;
          return stackIn_48_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_51_0 = var7;
          stackIn_51_1 = new StringBuilder().append("hi.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean readServerBytes(int param0, byte param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (RoadStripRenderer.field_e.position >= param0) {
            return true;
          }
          if (null == IterableSecondaryNodeDeque.field_h) {
            return false;
          }
          try {
            if (param1 != 40) {
              field_W = (int[]) null;
            }
            var2_int = IterableSecondaryNodeDeque.field_h.available(false);
            if (var2_int > 0) {
              if (var2_int > param0 - RoadStripRenderer.field_e.position) {
                var2_int = -RoadStripRenderer.field_e.position + param0;
              }
              IterableSecondaryNodeDeque.field_h.readFully(RoadStripRenderer.field_e.payload, var2_int, RoadStripRenderer.field_e.position, 125);
              MenuHitTesting.field_b = BoundaryLoopTracer.monotonicTimeMillis(-1);
              RoadStripRenderer.field_e.position = RoadStripRenderer.field_e.position + var2_int;
              if (param0 > RoadStripRenderer.field_e.position) {
                return false;
              }
              RoadStripRenderer.field_e.position = 0;
              return true;
            }
            if (var2_int >= 0 &&
              ImageProducerRasterBuffer.millisSinceServerActivity(101) <= 30000L) {
              return false;
            }
            ServerConnectionState.closeServerConnection(-28036);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            ServerConnectionState.closeServerConnection(-28036);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private InheritedWidgetStyle(long param0, InheritedWidgetStyle param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_G = true;
        this.field_J = -2147483648;
        this.field_U = -2147483648;
        this.field_C = false;
        this.field_w = 256;
        this.field_y = -2147483648;
        this.field_D = -2147483648;
        this.field_z = -1;
        this.field_E = -2147483648;
        this.field_t = -1;
        this.field_X = -1;
        this.field_L = -1;
        this.field_x = -2147483648;
        try {
          this.key = param0;
          this.inheritStyleProperties(param1, -114);
          if (param6 != null) {
            this.field_bb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("hi.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_W = new int[4];
    }
}
