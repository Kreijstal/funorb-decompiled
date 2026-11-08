/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends TextButton {
    private ValidationProvider field_T;
    static String field_M;
    static String field_I;
    private int field_H;
    static IntrusiveDequeCursor field_J;
    static String field_K;
    static Js5ArchiveManager field_O;
    static String field_R;
    static String field_N;
    static String[] field_P;
    static int field_S;
    static int field_Q;
    static String field_L;

    public static void releaseStatics(byte param0) {
        field_K = null;
        field_O = null;
        field_N = null;
        if (param0 < -89) {
          field_L = null;
          field_R = null;
          field_J = null;
          field_M = null;
          field_I = null;
          field_P = null;
          return;
        }
        field_O = (Js5ArchiveManager) null;
        field_L = null;
        field_R = null;
        field_J = null;
        field_M = null;
        field_I = null;
        field_P = null;
    }

    final String getTooltip(boolean param0) {
        if (this.field_w) {
          return this.field_T.getValidationMessage(26146);
        }
        if (!param0) {
          return null;
        }
        field_N = (String) null;
        return null;
    }

    final void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        try {
          this.field_H = this.field_H + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "mk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        ValidationState var8;
        int var9;
        int var10;
        int var11;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        Sprite var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        super.drawLayer((byte) -58, param1, param2, param3);
        if (param0 >= -52) {
          return;
        }
        if (param2 != 0) {
          return;
        }
        var5 = param1 + (this.field_n + (this.field_v >> 1));
        var6 = this.field_j + param3 + (this.field_k >> 1);
        var8 = this.field_T.getValidationState(-116);
        if (da.field_f == var8) {
          var16 = qk.field_lb[0];
          var9 = var16.field_n << 1;
          var10 = var16.field_w << 1;
          if (ArchiveIndex.field_o == null) {
            ArchiveIndex.field_o = new Sprite(var9, var10);
            fk.setSpriteRasterTarget(ArchiveIndex.field_o, -23095);
          } else {
            if (ArchiveIndex.field_o.field_q < var9) {
              ArchiveIndex.field_o = new Sprite(var9, var10);
              fk.setSpriteRasterTarget(ArchiveIndex.field_o, -23095);
            } else {
              if (var10 <= ArchiveIndex.field_o.field_y) {
                fk.setSpriteRasterTarget(ArchiveIndex.field_o, -23095);
                SoftwareRasterizer.clear();
              } else {
                ArchiveIndex.field_o = new Sprite(var9, var10);
                fk.setSpriteRasterTarget(ArchiveIndex.field_o, -23095);
              }
            }
          }
          var16.drawRotatedAboutPivot(112, 144, var16.field_n << 4, var16.field_w << 4, -this.field_H << 10, 4096);
          oo.popClipState(-15405);
          ArchiveIndex.field_o.drawAdditive(var5 - var16.field_n, var6 - var16.field_w, 256);
          return;
        }
        if (var8 != IsaacCipher.field_c) {
          if (ra.field_k == var8) {
            var14 = qk.field_lb[2];
            var14.drawAdditive(-(var14.field_q >> 1) + var5, -(var14.field_y >> 1) + var6, 256);
            return;
          }
          if (CacheEntry.field_s != var8) {
            return;
          }
          var13 = qk.field_lb[1];
          var13.drawAdditive(-(var13.field_q >> 1) + var5, -(var13.field_y >> 1) + var6, 256);
          return;
        }
        var15 = qk.field_lb[0];
        var9Lifetime1 = var15.field_n << 1;
        var10Lifetime1 = var15.field_w << 1;
        if (ArchiveIndex.field_o == null) {
          ArchiveIndex.field_o = new Sprite(var9Lifetime1, var10Lifetime1);
          fk.setSpriteRasterTarget(ArchiveIndex.field_o, -23095);
        } else {
          if (ArchiveIndex.field_o.field_q < var9Lifetime1) {
            ArchiveIndex.field_o = new Sprite(var9Lifetime1, var10Lifetime1);
            fk.setSpriteRasterTarget(ArchiveIndex.field_o, -23095);
          } else {
            if (var10Lifetime1 <= ArchiveIndex.field_o.field_y) {
              fk.setSpriteRasterTarget(ArchiveIndex.field_o, -23095);
              SoftwareRasterizer.clear();
            } else {
              ArchiveIndex.field_o = new Sprite(var9Lifetime1, var10Lifetime1);
              fk.setSpriteRasterTarget(ArchiveIndex.field_o, -23095);
            }
          }
        }
        var15.drawRotatedAboutPivot(112, 144, var15.field_n << 4, var15.field_w << 4, -this.field_H << 10, 4096);
        oo.popClipState(-15405);
        ArchiveIndex.field_o.drawAdditive(var5 - var15.field_n, var6 - var15.field_w, 256);
    }

    final boolean focusNext(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    mk(ValidationProvider param0) {
        try {
          this.field_T = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = "Decline invitation to <%0>'s game";
        field_K = "You are offering an unrated rematch.";
        field_M = "Minions can only be summoned when the summoning circle is green; you cannot summon over terrain or too far away from yourself.<br>Click to summon your Imps!";
        field_J = new IntrusiveDequeCursor();
        field_R = "This spell explodes five seconds after being cast, allowing you to bounce it off the terrain to hit those hard to reach targets. Try destroying one of the three targets in the arena.";
        field_N = "Select the Arcane Arrow spell below.";
        field_P = new String[]{"By rating", "By win percentage"};
        field_Q = 10;
        field_L = "Toggle mouseover help";
    }
}
