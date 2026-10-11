/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends me {
    static int field_j;
    static int field_h;
    private String field_m;
    static int field_i;
    static int field_n;
    static String field_k;
    private String field_l;

    final static void b(int param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        PartInstruction[] var2 = null;
        PartInstruction var4 = null;
        int var5 = 0;
        int var6 = 0;
        PartInstruction[] var7 = null;
        PartInstruction[] var8 = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          lc.field_f = false;
          qf.field_b = false;
          qh.field_Wb = false;
          GameplayController.field_I = false;
          bm.field_Q = false;
          if (param0 != 50) {
            return;
          }
          vc.field_d = false;
          Projectile.field_lb = false;
          bf.field_Gb = false;
          var8 = new PartInstruction[]{};
          var7 = hl.field_v.a(var8, -21636, 4095);
          var2 = var7;
          for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            if (null != var4.attachedPart &&
              var4.attachedPart.componentId == 89) {
              qh.field_Wb = true;
              lc.field_f = true;
            } else {
              if (null != var4.attachedPart &&
                var4.attachedPart.componentId == 66) {
                qh.field_Wb = true;
              } else {
                if (null != var4.attachedPart &&
                  76 == var4.attachedPart.componentId) {
                  qh.field_Wb = true;
                } else {
                  if (null != var4.attachedPart &&
                    83 != var4.attachedPart.componentId &&
                    (var4.attachedPart.field_Q & 1008) != 0) {
                    qh.field_Wb = true;
                    var5 = ja.a(var4.attachedPart.componentId, false);
                    switch (var5) {
                      case 9:
                      default:
                        if (11 != var5 &&
                          12 != var5) {
                          if (var5 != 13 &&
                            14 != var5 &&
                            15 != var5 &&
                            var5 != 16 &&
                            var5 != 17 &&
                            18 != var5 &&
                            var5 != 19) {
                            if (var5 != 9) {
                              break;
                            }
                            qf.field_b = true;
                            break;
                          }
                          GameplayController.field_I = true;
                          break;
                        }
                        vc.field_d = true;
                        bf.field_Gb = true;
                        break;
                      case 8:
                        if (var4.attachedPart.componentId == 47) {
                          bm.field_Q = true;
                        }
                        vc.field_d = true;
                        break;
                      case 7:
                        Projectile.field_lb = true;
                        vc.field_d = true;
                        bm.field_Q = true;
                        break;
                      case 0:
                        vc.field_d = true;
                        Projectile.field_lb = true;
                        break;
                      case 1:
                        Projectile.field_lb = true;
                        break;
                    }
                  }
                }
              }
            }
          }
          if (dc.field_g == 8 &&
            !GameplayController.field_I) {
            rc.a(false);
          }
          ef.field_b = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "on.E(" + param0 + ')');
        }
    }

    final void a(PacketBuffer param0, boolean param1) {
        try {
          param0.a(13588, this.field_m);
          param0.a(this.field_l, (byte) -83);
          if (param1) {
            on.b(114);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "on.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static pc a(em param0, int param1) {
        pc var2 = null;
        RuntimeException var2_ref = null;
        pc stackIn_2_0 = null;
        pc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -48) {
            stackIn_2_0 = (pc) null;
            return stackIn_2_0;
          }
          var2 = new pc(param0, param0);
          mm.field_b.addLast(3, var2);
          ll.field_e.b(param0);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("on.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final dj a(byte param0) {
        if (param0 < 47) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.a((PacketBuffer) null, true);
        }
        return ArticulatedPart.field_F;
    }

    public static void b(byte param0) {
        if (param0 != -116) {
          return;
        }
        field_k = null;
    }

    on(String param0, String param1) {
        try {
          this.field_m = param0;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "on.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 50;
    }
}
