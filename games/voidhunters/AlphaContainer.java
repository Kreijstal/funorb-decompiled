/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaContainer extends UiSingleChildContainer {
    static Widget field_w;
    int alpha;

    AlphaContainer(UiComponent param0) {
        super(param0.x, param0.y, param0.width, param0.height, (UiRenderer) null, (UiListener) null);
        try {
          param0.setBounds(0, this.width, this.height, 1, 0);
          this.child = param0;
          this.alpha = 256;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "qpb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int getTeamColor(boolean param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        var3 = 16777215;
        var4 = param1;
        if (var4 == 0) {
          var3 = 60159;
        } else {
          if (var4 == 1) {
            var3 = 13421619;
          } else {
            if (2 == var4) {
              var3 = 3394611;
            } else {
              if (3 == var4) {
                var3 = 14540253;
              } else {
                if (var4 == 4) {
                  var3 = 13894143;
                } else {
                  if (var4 == 5) {
                    var3 = 3460236;
                  } else {
                    if (var4 == 6) {
                      var3 = 3422668;
                    } else {
                      if (var4 == 7) {
                        var3 = 15372852;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (param2 != 13894143) {
          return -77;
        }
        if (param0) {
          var3 = (16711422 & var3 | 13421772) << 1;
        }
        return var3;
    }

    public AlphaContainer() {
        super(0, 0, 0, 0, (UiRenderer) null, (UiListener) null);
        this.alpha = 256;
    }

    public static void clearSharedReferences(boolean param0) {
        field_w = null;
        if (!param0) {
          field_w = (Widget) null;
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        Sprite var7;
        Sprite var8;
        if (param1 != 0) {
          return;
        }
        if (null == this.child) {
          return;
        }
        if (param2 > 47) {
          if (this.alpha == 0) {
            return;
          }
          if (256 == this.alpha) {
            this.child.drawLayer(param0 + this.x, param1, 74, param3 + this.y);
            return;
          }
          var8 = new Sprite(this.child.width, this.child.height);
          SetTorpedoEnergyUsed.pushSpriteRasterTarget(117, var8);
          this.child.drawLayer(0, param1, 115, 0);
          SoftwareRasterStateRestorer.popRasterState((byte) 124);
          var8.drawAlpha(param0 + this.x, this.y + param3, this.alpha);
          return;
        }
        AlphaContainer.getTeamColor(false, 44, 54);
        if (this.alpha == 0) {
          return;
        }
        if (256 == this.alpha) {
          this.child.drawLayer(param0 + this.x, param1, 74, param3 + this.y);
          return;
        }
        var7 = new Sprite(this.child.width, this.child.height);
        SetTorpedoEnergyUsed.pushSpriteRasterTarget(117, var7);
        this.child.drawLayer(0, param1, 115, 0);
        SoftwareRasterStateRestorer.popRasterState((byte) 124);
        var7.drawAlpha(param0 + this.x, this.y + param3, this.alpha);
        return;
    }

    static {
    }
}
