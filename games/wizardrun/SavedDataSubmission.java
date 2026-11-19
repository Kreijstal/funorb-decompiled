/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SavedDataSubmission extends IntrusiveNode {
    int crc;
    static IntrusiveDeque field_l;
    byte[] payload;
    static int field_j;

    final static char decodeCp1252Byte(byte param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        var2 = 255 & param1;
        if (param0 < -11) {
          if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
          if (var2 < 128) {
            return (char)var2;
          }
          if (var2 >= 160) {
            return (char)var2;
          }
          var3 = LoginChoicePanel.field_G[-128 + var2];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
          return (char)var2;
        }
        field_j = 101;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (var2 >= 160) {
          return (char)var2;
        }
        var3Lifetime1 = LoginChoicePanel.field_G[-128 + var2];
        if (var3Lifetime1 == 0) {
          var3Lifetime1 = 63;
        }
        var2Lifetime1 = var3Lifetime1;
        return (char)var2Lifetime1;
    }

    final static void showDisplayNameForm(int param0) {
        if (param0 == -3870) {
          if (FriendEntry.field_lb != null) {
            FriendEntry.field_lb.closeProgressDialog(-27697);
          }
          LabeledField.field_G = new DisplayNameForm();
          KeyboardShutdownHelpers.field_f.transitionToContent(LabeledField.field_G, -128);
          return;
        }
        field_l = (IntrusiveDeque) null;
        if (FriendEntry.field_lb != null) {
          FriendEntry.field_lb.closeProgressDialog(-27697);
        }
        LabeledField.field_G = new DisplayNameForm();
        KeyboardShutdownHelpers.field_f.transitionToContent(LabeledField.field_G, -128);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          IsaacPacketBuffer var2 = (IsaacPacketBuffer) null;
          SavedDataSubmission.readMeshMaterials(35, (IsaacPacketBuffer) null);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static MeshMaterial[] readMeshMaterials(int param0, IsaacPacketBuffer param1) {
        int var5 = 0;
        int var2_int = 0;
        int var3 = 0;
        MeshMaterial[] var4 = null;
        MeshMaterial var6_ref_ca = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        MeshMaterial[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = wizardrun.field_H;
        try {
          var2_int = param1.readBits(8, -11719);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (MeshMaterial[]) (stackIn_3_0);
          }
          var3 = param1.readBits(param0, -11719);
          var4 = new MeshMaterial[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!IntHashTable.a((byte) -55, param1)) {
              var6 = param1.readBits(GameApplet.a(var5 - 1, true), -11719);
              var4[var5] = var4[var6];
            } else {
              var6_ref_ca = new MeshMaterial();
              param1.readBits(24, -11719);
              param1.readBits(24, -11719);
              var6_ref_ca.color = param1.readBits(24, param0 - 11731);
              param1.readBits(9, -11719);
              param1.readBits(12, -11719);
              param1.readBits(12, param0 ^ -11723);
              param1.readBits(12, -11719);
              var4[var5] = var6_ref_ca;
            }
          }
          stackIn_12_0 = var4;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ie.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private SavedDataSubmission() throws Throwable {
        throw new Error();
    }

    static {
        field_l = new IntrusiveDeque();
    }
}
