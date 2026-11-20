/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VehicleDefinition {
    int halfWidth;
    int maxHealth;
    int physicsModel;
    float field_f;
    float centerOfMassHeight;
    float field_q;
    float field_n;
    float rearAxleDistance;
    float frontAxleDistance;
    static int field_D;
    int field_d;
    float field_w;
    float field_s;
    float field_m;
    float momentOfInertia;
    float field_H;
    int halfLength;
    RotatedSpriteAsset shadowAsset;
    private float field_N;
    float field_I;
    float field_J;
    float field_e;
    NamedSoundEffect field_u;
    RotatedSpriteCache sprite;
    RotatedSpriteAsset spriteAsset;
    float field_A;
    float maxSlipAngle;
    float corneringStiffness;
    float field_x;
    RotatedSpriteCache shadowSprite;
    float field_E;
    float field_B;
    float field_r;
    NamedSoundEffect field_L;
    float wheelbase;
    float field_p;
    static int field_t;
    boolean field_o;
    float mass;
    float field_c;

    final static void a(fb param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        IsaacPacketBuffer var7 = IsaacPacketBuffer.field_p;
        IsaacPacketBuffer var8 = var7;
        var8.writeCipheredOpcode((byte) 33, param1);
        var8.position = var8.position + 1;
        if (param2 <= 94) {
          return;
        }
        try {
          var4 = var8.position;
          var8.writeByte(111, 1);
          var8.writeShort(-652561784, param0.field_u);
          var8.writeShort(-652561784, param0.field_j);
          var8.writeShort(-652561784, param0.field_t);
          var8.writeInt((byte) -58, param0.field_q);
          var8.writeInt((byte) -58, param0.field_p);
          var8.writeInt((byte) -58, param0.field_o);
          var8.writeInt((byte) -58, param0.field_k);
          var8.writeByte(111, param0.field_r.length);
          for (var5 = 0; var5 < param0.field_r.length; var5++) {
            var7.writeInt((byte) -58, param0.field_r[var5]);
          }
          var8.appendCrc32(var4, (byte) 110);
          var8.backpatchByteLength(-268435456, var8.position - var4);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "dn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    VehicleDefinition(int param0) {
        int var2;
        var2 = param0;
        if (var2 == 1) {
          this.physicsModel = 0;
          this.halfLength = 12;
          this.mass = 1500.0f;
          this.halfWidth = 6;
          this.wheelbase = (float)this.halfLength * 2.0f / 3.5f;
          this.field_N = (float)this.halfWidth * 2.0f / 3.5f;
          this.frontAxleDistance = this.wheelbase / 2.0f;
          this.rearAxleDistance = -this.frontAxleDistance + this.wheelbase;
          this.maxSlipAngle = 0.5f;
          this.centerOfMassHeight = 0.10000000149011612f;
          this.shadowAsset = al.field_a[1];
          this.field_w = 6.0f;
          this.field_B = 0.0f;
          this.field_A = 15.0f;
          this.field_J = 13.0f;
          this.field_L = DialogLayer.field_G.field_d;
          this.momentOfInertia = (this.wheelbase * this.wheelbase + this.field_N * this.field_N) * this.mass / 12.0f;
          this.field_x = 0.5f;
          this.field_E = 0.5f;
          this.spriteAsset = al.field_a[0];
          this.field_r = 1.0f;
          this.field_o = false;
          this.field_e = 0.0f;
          this.field_s = 4800.0f;
          this.corneringStiffness = 12.0f / this.maxSlipAngle;
          this.field_u = DialogLayer.field_G.field_e;
          this.field_n = 0.5f;
          this.field_I = 6.0f;
          this.field_H = 0.0f;
          this.field_f = 0.5f;
          this.field_m = 4.0f;
          this.field_c = -16.0f;
          this.field_d = 15;
          this.field_q = 0.5f;
          this.field_p = 3.0f;
        } else {
          if (var2 == 0) {
            this.mass = 1450.0f;
            this.halfLength = 12;
            this.halfWidth = 6;
            this.physicsModel = 0;
            this.wheelbase = (float)this.halfLength * 2.0f / 3.5f;
            this.field_N = 2.0f * (float)this.halfWidth / 3.5f;
            this.frontAxleDistance = this.wheelbase / 2.0f;
            this.centerOfMassHeight = 0.10000000149011612f;
            this.maxSlipAngle = 0.5f;
            this.rearAxleDistance = -this.frontAxleDistance + this.wheelbase;
            this.field_H = 0.0f;
            this.field_q = 0.5f;
            this.momentOfInertia = (this.field_N * this.field_N + this.wheelbase * this.wheelbase) * this.mass / 12.0f;
            this.field_c = -9.0f;
            this.field_L = ArchiveIndex.field_r.field_d;
            this.field_J = 13.0f;
            this.field_B = 0.0f;
            this.field_r = 1.0f;
            this.field_n = 0.5f;
            this.spriteAsset = IterableSecondaryNodeDeque.field_c[0];
            this.field_x = 0.5f;
            this.field_p = 3.0f;
            this.field_s = 5000.0f;
            this.field_I = 6.0f;
            this.field_E = 0.5f;
            this.field_f = 0.5f;
            this.corneringStiffness = 12.0f / this.maxSlipAngle;
            this.field_o = false;
            this.field_w = 6.0f;
            this.field_A = 10.0f;
            this.shadowAsset = IterableSecondaryNodeDeque.field_c[1];
            this.field_d = 15;
            this.field_u = ArchiveIndex.field_r.field_e;
            this.field_e = 0.0f;
            this.field_m = 4.0f;
          } else {
            if (var2 == 3) {
              this.halfLength = 12;
              this.halfWidth = 6;
              this.mass = 2000.0f;
              this.physicsModel = 0;
              this.wheelbase = (float)this.halfLength * 2.0f / 3.5f;
              this.field_N = 2.0f * (float)this.halfWidth / 3.5f;
              this.frontAxleDistance = this.wheelbase / 2.0f;
              this.rearAxleDistance = -this.frontAxleDistance + this.wheelbase;
              this.centerOfMassHeight = 0.10000000149011612f;
              this.maxSlipAngle = 0.4000000059604645f;
              this.field_E = 0.5f;
              this.spriteAsset = jg.field_o[0];
              this.field_o = false;
              this.field_d = 15;
              this.field_e = 0.0f;
              this.field_f = 0.20000000298023224f;
              this.field_c = -8.0f;
              this.momentOfInertia = this.mass * (this.field_N * this.field_N + this.wheelbase * this.wheelbase) / 12.0f;
              this.field_r = 0.699999988079071f;
              this.field_n = 1.0f;
              this.field_m = 0.5f;
              this.field_A = 10.0f;
              this.field_s = 6000.0f;
              this.field_u = te.field_c.field_e;
              this.field_J = 5.0f;
              this.field_I = 4.0f;
              this.field_L = te.field_c.field_d;
              this.field_w = 10.0f;
              this.field_p = 3.0f;
              this.field_B = 40.0f;
              this.field_x = 0.6000000238418579f;
              this.shadowAsset = jg.field_o[1];
              this.field_q = 0.8999999761581421f;
              this.field_H = 0.0f;
              this.corneringStiffness = 12.0f / this.maxSlipAngle;
            } else {
              if (var2 == 2) {
                this.mass = 1000.0f;
                this.halfWidth = 6;
                this.halfLength = 12;
                this.physicsModel = 0;
                this.field_N = 2.0f * (float)this.halfWidth / 3.5f;
                this.wheelbase = (float)this.halfLength * 2.0f / 3.5f;
                this.frontAxleDistance = this.wheelbase / 2.0f;
                this.centerOfMassHeight = 0.10000000149011612f;
                this.rearAxleDistance = -this.frontAxleDistance + this.wheelbase;
                this.maxSlipAngle = 0.30000001192092896f;
                this.field_E = 0.5f;
                this.field_p = 3.0f;
                this.field_u = hm.field_a.field_e;
                this.field_q = 0.5f;
                this.field_f = 0.30000001192092896f;
                this.field_A = 5.0f;
                this.field_s = 8000.0f;
                this.field_m = 0.5f;
                this.field_H = 0.0f;
                this.spriteAsset = FadingDialog.field_K[0];
                this.field_B = 40.0f;
                this.field_c = -16.0f;
                this.shadowAsset = FadingDialog.field_K[1];
                this.field_w = 5.0f;
                this.field_e = 0.0f;
                this.field_n = 1.0f;
                this.field_d = 15;
                this.field_o = true;
                this.field_I = 4.0f;
                this.corneringStiffness = 12.0f / this.maxSlipAngle;
                this.momentOfInertia = (this.wheelbase * this.wheelbase + this.field_N * this.field_N) * this.mass / 12.0f;
                this.field_L = hm.field_a.field_d;
                this.field_x = 0.6000000238418579f;
                this.field_J = 3.0f;
                this.field_r = 0.4000000059604645f;
              } else {
                if (var2 == 4) {
                  this.halfWidth = 6;
                  this.physicsModel = 2;
                  this.halfLength = 12;
                  this.mass = 800.0f;
                  this.wheelbase = (float)this.halfLength * 2.0f / 3.5f;
                  this.field_N = (float)this.halfWidth * 2.0f / 3.5f;
                  this.field_p = 3.0f;
                  this.field_B = 50.0f;
                  this.field_s = 4750.0f;
                  this.field_x = 0.75f;
                  this.field_A = 50.0f;
                  this.field_d = 15;
                  this.momentOfInertia = this.mass * (this.wheelbase * this.wheelbase + this.field_N * this.field_N) / 12.0f;
                  this.field_n = 0.5f;
                  this.field_m = 0.5f;
                  this.field_o = true;
                  this.field_E = 1.0f;
                  this.centerOfMassHeight = 0.10000000149011612f;
                  this.rearAxleDistance = 0.25f * this.wheelbase;
                  this.spriteAsset = GrowableObjectList.field_a[0];
                  this.field_f = 0.30000001192092896f;
                  this.field_L = ValidationIndicator.field_H.field_d;
                  this.field_r = 1.0f;
                  this.field_w = 15.0f;
                  this.field_u = ValidationIndicator.field_H.field_e;
                  this.corneringStiffness = 80.0f;
                  this.field_I = 4.0f;
                  this.field_e = 15.0f;
                  this.shadowAsset = GrowableObjectList.field_a[1];
                  this.field_H = 0.0f;
                  this.field_c = -16.0f;
                  this.frontAxleDistance = 0.5f * this.wheelbase;
                  this.field_q = 0.5f;
                  this.maxSlipAngle = 0.75f;
                  this.field_J = 4.0f;
                } else {
                  if (5 == var2) {
                    this.physicsModel = 1;
                    this.halfWidth = 12;
                    this.mass = 5500.0f;
                    this.halfLength = 12;
                    this.field_N = 2.0f * (float)this.halfWidth / 3.5f;
                    this.wheelbase = 2.0f * (float)this.halfLength / 3.5f;
                    this.frontAxleDistance = this.wheelbase / 2.0f;
                    this.corneringStiffness = 80.0f;
                    this.rearAxleDistance = -this.frontAxleDistance + this.wheelbase;
                    this.centerOfMassHeight = 0.10000000149011612f;
                    this.maxSlipAngle = 0.5f;
                    this.field_B = 0.0f;
                    this.field_J = 2.0f;
                    this.shadowAsset = GameAppletShell.field_j[1];
                    this.field_q = 0.5f;
                    this.spriteAsset = GameAppletShell.field_j[0];
                    this.field_u = OpacityWidget.field_G.field_e;
                    this.field_L = OpacityWidget.field_G.field_d;
                    this.field_e = 10.0f;
                    this.field_o = false;
                    this.field_p = 3.0f;
                    this.field_x = this.maxSlipAngle;
                    this.field_f = this.maxSlipAngle;
                    this.momentOfInertia = (this.wheelbase * this.wheelbase + this.field_N * this.field_N) * this.mass / 12.0f;
                    this.field_c = -12.0f;
                    this.field_H = 0.0f;
                    this.field_w = 10.0f;
                    this.field_d = 15;
                    this.field_n = 0.5f;
                    this.field_E = 1.0f;
                    this.field_m = 0.5f;
                    this.field_A = 10.0f;
                    this.field_I = 2.0f;
                    this.field_r = 0.800000011920929f;
                    this.field_s = 18500.0f;
                  } else {
                    if (var2 == 6) {
                      this.halfLength = 12;
                      this.mass = 1500.0f;
                      this.physicsModel = 0;
                      this.halfWidth = 6;
                      this.field_N = (float)this.halfWidth * 2.0f / 3.5f;
                      this.wheelbase = 2.0f * (float)this.halfLength / 3.5f;
                      this.frontAxleDistance = this.wheelbase / 2.0f;
                      this.rearAxleDistance = this.wheelbase - this.frontAxleDistance;
                      this.centerOfMassHeight = 0.10000000149011612f;
                      this.maxSlipAngle = 0.5f;
                      this.field_r = 0.5f;
                      this.field_o = false;
                      this.momentOfInertia = (this.wheelbase * this.wheelbase + this.field_N * this.field_N) * this.mass / 12.0f;
                      this.field_H = 0.0f;
                      this.field_w = 5.5f;
                      this.field_q = 0.5f;
                      this.field_m = 4.0f;
                      this.field_c = 12.0f;
                      this.field_d = 15;
                      this.shadowAsset = LinkWidgetRenderer.field_b[1];
                      this.field_p = 3.0f;
                      this.field_f = 0.5f;
                      this.field_I = 6.0f;
                      this.field_A = 10.0f;
                      this.field_x = 0.5f;
                      this.field_n = 0.5f;
                      this.field_e = 0.0f;
                      this.spriteAsset = LinkWidgetRenderer.field_b[0];
                      this.field_u = RaceSetupMenu.field_s.field_e;
                      this.corneringStiffness = 12.0f / this.maxSlipAngle;
                      this.field_s = 10000.0f;
                      this.field_B = 0.0f;
                      this.field_E = 0.5f;
                      this.field_J = 13.0f;
                      this.field_L = RaceSetupMenu.field_s.field_d;
                    } else {
                      if (var2 != 7) {
                        throw new RuntimeException();
                      }
                      this.halfWidth = 6;
                      this.physicsModel = 0;
                      this.mass = 1800.0f;
                      this.halfLength = 12;
                      this.field_N = 2.0f * (float)this.halfWidth / 3.5f;
                      this.wheelbase = (float)this.halfLength * 2.0f / 3.5f;
                      this.frontAxleDistance = this.wheelbase / 2.0f;
                      this.maxSlipAngle = 0.5f;
                      this.centerOfMassHeight = 0.10000000149011612f;
                      this.rearAxleDistance = -this.frontAxleDistance + this.wheelbase;
                      this.field_o = false;
                      this.field_B = 0.0f;
                      this.field_m = 4.0f;
                      this.field_L = MusicPatch.field_n.field_d;
                      this.field_I = 6.0f;
                      this.shadowAsset = BufferedRandomAccessFile.field_h[1];
                      this.momentOfInertia = this.mass * (this.wheelbase * this.wheelbase + this.field_N * this.field_N) / 12.0f;
                      this.field_r = 0.75f;
                      this.field_u = MusicPatch.field_n.field_e;
                      this.field_A = 10.0f;
                      this.field_J = 13.0f;
                      this.field_n = 0.5f;
                      this.field_p = 3.0f;
                      this.field_d = 15;
                      this.field_e = 0.0f;
                      this.field_s = 8000.0f;
                      this.corneringStiffness = 12.0f / this.maxSlipAngle;
                      this.field_c = 14.0f;
                      this.field_f = 0.5f;
                      this.field_q = 0.5f;
                      this.field_E = 0.5f;
                      this.field_w = 7.5f;
                      this.spriteAsset = BufferedRandomAccessFile.field_h[0];
                      this.field_H = 0.0f;
                      this.field_x = 0.5f;
                    }
                  }
                }
              }
            }
          }
        }
        this.maxHealth = 5000;
    }

    static {
        field_D = 20;
    }
}
