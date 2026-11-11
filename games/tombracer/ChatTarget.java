/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ChatTarget {
    static int field_a;
    static String field_c;
    static ScrollPane field_b;

    abstract ChatChannelType getChannelType(byte param0);

    public static void releaseStatics(int param0) {
        field_c = null;
        field_b = null;
        int var1 = 69 / ((param0 + 67) / 32);
    }

    final static void a(int param0, double param1, int param2, int param3, double param4) {
        int var8;
        var8 = TombRacer.field_G ? 1 : 0;
        if (~WallCrusherComponent.field_H != param2) {
          if (param3 == 0) {
            vn.field_a = null;
            WallCrusherComponent.field_H = param3;
            IntNode.field_h = param1;
            if (TextSpewerBehaviour.field_o == 0 &&
              0 < param0) {
              jla.field_z = new IntrusiveDeque();
            } else {
              if (param0 == 0) {
                jla.field_z = null;
              }
            }
          } else {
            WallCrusherComponent.field_H = param3;
            IntNode.field_h = param1;
            if (TextSpewerBehaviour.field_o != 0) {
              if (param0 == 0) {
                jla.field_z = null;
              }
            } else {
              if (0 < param0) {
                jla.field_z = new IntrusiveDeque();
              } else {
                if (param0 == 0) {
                  jla.field_z = null;
                }
              }
            }
          }
        } else {
          if (param3 > 0) {
            vn.field_a = new IntrusiveDeque();
            WallCrusherComponent.field_H = param3;
            IntNode.field_h = param1;
            if (TextSpewerBehaviour.field_o == 0 &&
              0 < param0) {
              jla.field_z = new IntrusiveDeque();
            } else {
              if (param0 == 0) {
                jla.field_z = null;
              }
            }
          } else {
            if (param3 == 0) {
              vn.field_a = null;
            }
            WallCrusherComponent.field_H = param3;
            IntNode.field_h = param1;
            if (TextSpewerBehaviour.field_o != 0) {
              if (param0 == 0) {
                jla.field_z = null;
              }
            } else {
              if (0 < param0) {
                jla.field_z = new IntrusiveDeque();
              } else {
                if (param0 == 0) {
                  jla.field_z = null;
                }
              }
            }
          }
        }
        RotaterMountComponent.field_J = param4;
        TextSpewerBehaviour.field_o = param0;
    }

    abstract void write(PacketBuffer param0, boolean param1);

    static {
        field_c = "<%0> has resigned.";
    }
}
