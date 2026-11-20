/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Camera2D {
    float worldCenterY;
    int screenOriginX;
    int screenOriginY;
    float scale;
    int[] worldBounds;
    float worldCenterX;

    final float worldToScreenXFloat(int param0, int param1) {
        int var3 = 79 % ((-79 - param1) / 43);
        return ((float)param0 - this.worldCenterX) * this.scale + (float)this.screenOriginX;
    }

    final int worldToScreenX(int param0, byte param1) {
        if (param1 > 111) {
          return (int)((float)this.screenOriginX + ((float)param0 - this.worldCenterX) * this.scale);
        }
        return 61;
    }

    final float worldToScreenYFloat(int param0, int param1) {
        if (param0 != 0) {
          return -0.3560704290866852f;
        }
        return (float)this.screenOriginY + ((float)param1 - this.worldCenterY) * this.scale;
    }

    final int screenToWorldY(int param0, int param1) {
        if (param0 == 0) {
          return (int)(this.worldCenterY + (float)(param1 - this.screenOriginY) / this.scale);
        }
        this.screenOriginX = 3;
        return (int)(this.worldCenterY + (float)(param1 - this.screenOriginY) / this.scale);
    }

    final int worldToScreenY(boolean param0, int param1) {
        if (param0) {
          return (int)(this.scale * ((float)param1 - this.worldCenterY) + (float)this.screenOriginY);
        }
        this.worldToScreenYFloat(-13, 119);
        return (int)(this.scale * ((float)param1 - this.worldCenterY) + (float)this.screenOriginY);
    }

    final int screenToWorldX(boolean param0, int param1) {
        if (param0) {
          return (int)(this.worldCenterX + (float)(-this.screenOriginX + param1) / this.scale);
        }
        this.worldCenterX = -2.1542797088623047f;
        return (int)(this.worldCenterX + (float)(-this.screenOriginX + param1) / this.scale);
    }

    public Camera2D() {
        this.worldBounds = new int[4];
        this.screenOriginY = 240;
        this.scale = 0.001953125f;
        this.worldCenterY = 0.0f;
        this.worldCenterX = 0.0f;
        this.screenOriginX = 320;
    }

    final void updateWorldBounds(int param0, int param1, int param2, int param3, int param4) {
        if (param2 <= -9) {
          this.worldBounds[0] = this.screenToWorldX(true, param1);
          this.worldBounds[1] = this.screenToWorldX(true, param3);
          this.worldBounds[2] = this.screenToWorldY(0, param4);
          this.worldBounds[3] = this.screenToWorldY(0, param0);
          return;
        }
        this.worldCenterY = 0.1839497685432434f;
        this.worldBounds[0] = this.screenToWorldX(true, param1);
        this.worldBounds[1] = this.screenToWorldX(true, param3);
        this.worldBounds[2] = this.screenToWorldY(0, param4);
        this.worldBounds[3] = this.screenToWorldY(0, param0);
    }

    static {
    }
}
