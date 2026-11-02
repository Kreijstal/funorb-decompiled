/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nha {
    static IndexedSprite field_a;
    static String field_d;
    static vr field_c;
    static String field_b;
    static gba field_e;

    final static void a(int param0, bga param1, byte param2) {
        BitPacketBuffer var6 = null;
        int var4 = 0;
        try {
          var6 = sja.field_fb;
          BitPacketBuffer var3 = var6;
          var6.writeCipheredByte(param0, (byte) 110);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(1, 0);
          if (param1.field_g != null) {
            var6.writeByte(param1.field_g.length, 0);
            var6.a(0, -72, param1.field_g.length, param1.field_g);
          } else {
            var6.writeByte(0, 0);
          }
          var6.a(var4, 19);
          var6.position = var6.position - 4;
          if (param2 >= -22) {
            bga var5 = (bga) null;
            nha.a(-98, (bga) null, (byte) 0);
          }
          param1.field_i = var6.readInt(-76);
          var6.writeLengthByte((byte) 117, var6.position - var4);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nha.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -18307) {
          nha.a(91, -69, -16, true, -30, -112);
        }
        field_b = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        var10 = BachelorFridge.field_y;
        try {
          if (param2 <= ha.field_n &&
            an.field_q <= param1) {
            if (param4 < DualLinkNode.field_l) {
              var6_int = 0;
              param4 = DualLinkNode.field_l;
            } else {
              if (param4 <= pw.field_x) {
                var6_int = 1;
              } else {
                var6_int = 0;
                param4 = pw.field_x;
              }
            }
            if (param5 < DualLinkNode.field_l) {
              param5 = DualLinkNode.field_l;
              var7 = 0;
            } else {
              if (pw.field_x < param5) {
                var7 = 0;
                param5 = pw.field_x;
              } else {
                var7 = 1;
              }
            }
            if (param2 < an.field_q) {
              param2 = an.field_q;
            } else {
              incrementValue$0 = param2;
              param2++;
              hba.a(param0, param4, tj.field_b[incrementValue$0], 7, param5);
            }
            if (ha.field_n >= param1) {
              incrementValue$1 = param1;
              param1--;
              hba.a(param0, param4, tj.field_b[incrementValue$1], 7, param5);
            } else {
              param1 = ha.field_n;
            }
            if (var6_int != 0 &&
              var7 != 0) {
              for (var8 = param2; var8 <= param1; var8++) {
                var12 = tj.field_b[var8];
                var11 = var12;
                var9 = var11;
                var12[param5] = param0;
                var9[param4] = param0;
              }
            } else {
              if (var6_int != 0) {
                for (var8 = param2; param1 >= var8; var8++) {
                  tj.field_b[var8][param4] = param0;
                }
              } else {
                if (var7 != 0) {
                  for (var8 = param2; var8 <= param1; var8++) {
                    tj.field_b[var8][param5] = param0;
                  }
                }
              }
            }
          }
          if (!param3) {
            field_b = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var6), "nha.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_b = "Menu";
        field_d = "Unable to delete friend - system busy";
    }
}
