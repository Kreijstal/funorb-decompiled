/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RotatedSpriteSheetAsset {
    private RotatedSpriteCache[] field_d;
    private boolean field_c;
    static QuickChatDynamicCommand field_a;
    private int field_b;
    private String field_f;
    private boolean field_e;

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        int var1 = 80 % ((param0 - 73) / 32);
    }

    final static int getCourseGraphicsLoadProgress(byte param0, CourseDefinition param1) {
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        CourseDefinition var6 = null;
        var5 = HoldTheLine.field_D;
        try {
          if (param1.field_r) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param1.field_j == null) {
            stackIn_8_0 = 0;
            return stackIn_8_0;
          }
          if (param0 < 6) {
            var6 = (CourseDefinition) null;
            RotatedSpriteSheetAsset.getCourseGraphicsLoadProgress((byte) 14, (CourseDefinition) null);
          }
          var2_int = 0;
          if (0 != param1.field_o) {
            if (param1.field_o == 1) {
              if (AccountCreationForm.field_F.isLoaded((byte) 10)) {
                var2_int += 16;
              }
              if (ProxySocketConnector.field_h.isLoaded((byte) 10)) {
                var2_int += 16;
              }
            } else {
              if (2 != param1.field_o) {
                if (param1.field_o == 3) {
                  if (BitwiseIntegerOperations.field_b.isLoaded((byte) 10)) {
                    var2_int += 16;
                  }
                  if (MarkerSliderRenderer.field_b.isLoaded((byte) 10)) {
                    var2_int += 16;
                  }
                } else {
                  if (4 != param1.field_o) {
                    if (5 != param1.field_o) {
                      if (param1.field_o == 6) {
                        if (DialWidget.field_Q.isLoaded((byte) 10)) {
                          var2_int += 16;
                        }
                        if (ValidationState.field_e.isLoaded((byte) 10)) {
                          var2_int += 16;
                        }
                      }
                    } else {
                      if (BoundaryIntersection.field_i.isLoaded((byte) 10)) {
                        var2_int += 16;
                      }
                      if (BitwiseIntegerOperations.field_b.isLoaded((byte) 10)) {
                        var2_int += 16;
                      }
                    }
                  } else {
                    if (MarkerSliderRenderer.field_b.isLoaded((byte) 10)) {
                      var2_int += 16;
                    }
                    if (BoundaryIntersection.field_i.isLoaded((byte) 10)) {
                      var2_int += 16;
                    }
                  }
                }
              } else {
                if (AccountCreationForm.field_F.isLoaded((byte) 10)) {
                  var2_int += 16;
                }
                if (IterableSecondaryNodeDeque.field_a.isLoaded((byte) 10)) {
                  var2_int += 16;
                }
              }
            }
          } else {
            if (SecondaryNodeDeque.field_h.isLoaded((byte) 10)) {
              var2_int += 16;
            }
            if (ValidationState.field_e.isLoaded((byte) 10)) {
              var2_int += 16;
            }
          }
          var3 = 0;
          for (var4 = 0; param1.field_j.length > var4; var4++) {
            if (param1.field_j[var4].field_c) {
              var3++;
            }
          }
          var2_int = var2_int + var3 * 224 / param1.field_j.length;
          stackIn_62_0 = var2_int;
          return stackIn_62_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_65_0 = var2;
          stackIn_65_1 = new StringBuilder().append("kg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    final RotatedSpriteCache[] getRotatedSprites(int param0) {
        Sprite[] var2;
        int var3;
        int var4;
        Sprite[] var5;
        int var3Lifetime1;
        Sprite[] var2Lifetime1;
        var4 = HoldTheLine.field_D;
        if (param0 == 16) {
          if (this.field_d != null) {
            return this.field_d;
          }
          var5 = ShadedRoadStripRenderer.loadSpritesByName(this.field_f, -120);
          var2 = var5;
          if (var2 == null) {
            return this.field_d;
          }
          this.field_d = new RotatedSpriteCache[var5.length];
          for (var3 = 0; var5.length > var3; var3++) {
            this.field_d[var3] = new RotatedSpriteCache(var5[var3], this.field_b, this.field_c, this.field_e);
          }
          return this.field_d;
        }
        this.field_d = (RotatedSpriteCache[]) null;
        if (this.field_d != null) {
          return this.field_d;
        }
        var5 = ShadedRoadStripRenderer.loadSpritesByName(this.field_f, -120);
        var2Lifetime1 = var5;
        if (var2Lifetime1 == null) {
          return this.field_d;
        }
        this.field_d = new RotatedSpriteCache[var5.length];
        for (var3Lifetime1 = 0; var5.length > var3Lifetime1; var3Lifetime1++) {
          this.field_d[var3Lifetime1] = new RotatedSpriteCache(var5[var3Lifetime1], this.field_b, this.field_c, this.field_e);
        }
        return this.field_d;
    }

    RotatedSpriteSheetAsset(String param0) {
        try {
          this.field_d = null;
          this.field_b = 4096;
          this.field_c = false;
          this.field_f = param0;
          this.field_e = false;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    RotatedSpriteSheetAsset(String param0, boolean param1, boolean param2) {
        try {
          this.field_f = param0;
          this.field_d = null;
          this.field_b = 4096;
          this.field_e = param2 ? true : false;
          this.field_c = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = new QuickChatDynamicCommand(9, 0, 4, 1);
    }
}
