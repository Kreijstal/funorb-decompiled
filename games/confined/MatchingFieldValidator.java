/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingFieldValidator extends TextFieldValidator {
    private EditableTextField field_l;
    static PrimaryNodeDeque field_k;
    static int[] field_m;
    static RgbSprite field_j;
    static String field_h;
    static PcmSample field_i;

    final static void a(int param0, int param1, bj param2) {
        CipherPacketBuffer var8 = null;
        CipherPacketBuffer var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        try {
          var8 = vh.field_a;
          var9 = var8;
          var9.writeCipheredByte(true, param0);
          var9.position = var9.position + 1;
          var4 = var9.position;
          var9.writeByte(96, 1);
          var9.writeShort(param2.field_p, 8);
          var9.writeShort(param2.field_r, 8);
          var9.writeShort(param2.field_x, 8);
          var9.writeInt(-97, param2.field_n);
          var9.writeInt(-101, param2.field_u);
          var9.writeInt(-108, param2.field_o);
          var9.writeInt(-83, param2.field_t);
          var9.writeByte(107, param2.field_s.length);
          if (param1 < 35) {
            bj var7 = (bj) null;
            MatchingFieldValidator.a(-61, -11, (bj) null);
          }
          for (var5 = 0; param2.field_s.length > var5; var5++) {
            var8.writeInt(-91, param2.field_s[var5]);
          }
          var9.appendCrc32(26199, var4);
          var9.backpatchByteLength(25859, -var4 + var9.position);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "lf.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String getValidationMessage(String param0, boolean param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_l)).getFieldValidator((byte) -9);
            if (var3 != null) {
              if (var3.getValidationStatus(-3621) == TextHotspotBounds.field_q &&
                !param0.equals(this.field_l.field_B)) {
                stackIn_6_0 = IntrusiveDeque.field_d;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.getValidationMessage((byte) 68);
              return stackIn_8_0;
            }
          }
          if (!param1) {
            MatchingFieldValidator.e(71);
          }
          if (param0.equals(this.field_l.field_B)) {
            return null;
          }
          stackIn_14_0 = IntrusiveDeque.field_d;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("lf.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    MatchingFieldValidator(EditableTextField param0, EditableTextField param1) {
        super(param0);
        try {
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "lf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fi getValidationStatus(byte param0, String param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        fi stackIn_2_0 = null;
        fi stackIn_8_0 = null;
        fi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -44) {
            stackIn_2_0 = (fi) null;
            return stackIn_2_0;
          }
          if (this.field_l instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_l)).getFieldValidator((byte) -9);
            if (var3 != null &&
              var3.getValidationStatus(-3621) != TextHotspotBounds.field_q) {
              stackIn_8_0 = fb.field_e;
              return stackIn_8_0;
            }
          }
          if (param1.equals(this.field_l.field_B)) {
            stackIn_12_0 = TextHotspotBounds.field_q;
          } else {
            stackIn_12_0 = fb.field_e;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("lf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          var1 = tf.field_p;
          synchronized (var1) {
            ic.field_b = lh.field_b;
            cg.field_d = cg.field_d + 1;
            if (0 > ab.field_a) {
              for (var2 = 0; var2 < 112; var2++) {
                mc.field_e[var2] = false;
              }
              ab.field_a = ResourceArchive.field_g;
            } else {
              while (ResourceArchive.field_g != ab.field_a) {
                var2 = on.field_f[ResourceArchive.field_g];
                ResourceArchive.field_g = 1 + ResourceArchive.field_g & 127;
                if (0 <= var2) {
                  mc.field_e[var2] = true;
                  continue;
                }
                mc.field_e[~var2] = false;
              }
            }
            if (param0 != -84) {
              field_i = (PcmSample) null;
            }
            lh.field_b = ModalDialog.field_W;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw TextLineMetrics.a((Throwable) ((Object) var1_ref), "lf.B(" + param0 + ')');
        }
    }

    public static void e(int param0) {
        field_h = null;
        field_j = null;
        field_i = null;
        if (param0 < 15) {
          MatchingFieldValidator.c((byte) 83);
        }
        field_m = null;
        field_k = null;
    }

    static {
        field_m = new int[]{5, 18, 39, 52};
        field_k = new PrimaryNodeDeque();
        field_h = "Special energy weapons";
    }
}
