/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is {
    static boolean field_b;
    static boolean field_a;
    private static String field_z;

    final static int a(byte param0, int param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        gb.field_i = 0;
        AccountCreationDialog.field_Gb = null;
        js.field_a = null;
        if (param0 != -94) {
          is.a((byte) -54, 83);
        }
        int var2 = IntList.field_i;
        IntList.field_i = StatusMessagePanel.field_D;
        if (param1 == 51) {
          TertiaryLinkNode.field_o.field_p = 2;
          StatusMessagePanel.field_D = var2;
          TertiaryLinkNode.field_o.field_a = TertiaryLinkNode.field_o.field_a + 1;
          if (TertiaryLinkNode.field_o.field_a < 2) {
            if (2 <= TertiaryLinkNode.field_o.field_a &&
              param1 == 50) {
              return 5;
            }
            if (TertiaryLinkNode.field_o.field_a < 4) {
              return -1;
            }
            return 1;
          }
          if (param1 == 51) {
            return 2;
          }
          if (2 <= TertiaryLinkNode.field_o.field_a &&
            param1 == 50) {
            return 5;
          }
          if (TertiaryLinkNode.field_o.field_a < 4) {
            return -1;
          }
          return 1;
        }
        if (50 == param1) {
          TertiaryLinkNode.field_o.field_p = 5;
          StatusMessagePanel.field_D = var2;
          TertiaryLinkNode.field_o.field_a = TertiaryLinkNode.field_o.field_a + 1;
          if (TertiaryLinkNode.field_o.field_a < 2) {
            if (2 <= TertiaryLinkNode.field_o.field_a &&
              param1 == 50) {
              return 5;
            }
            if (TertiaryLinkNode.field_o.field_a < 4) {
              return -1;
            }
            return 1;
          }
          if (param1 == 51) {
            return 2;
          }
          if (2 <= TertiaryLinkNode.field_o.field_a &&
            param1 == 50) {
            return 5;
          }
          if (TertiaryLinkNode.field_o.field_a < 4) {
            return -1;
          }
          return 1;
        }
        TertiaryLinkNode.field_o.field_p = 1;
        StatusMessagePanel.field_D = var2;
        TertiaryLinkNode.field_o.field_a = TertiaryLinkNode.field_o.field_a + 1;
        if (TertiaryLinkNode.field_o.field_a < 2) {
          if (2 <= TertiaryLinkNode.field_o.field_a &&
            param1 == 50) {
            return 5;
          }
          if (TertiaryLinkNode.field_o.field_a >= 4) {
            return 1;
          }
          return -1;
        }
        if (param1 == 51) {
          return 2;
        }
        if (2 <= TertiaryLinkNode.field_o.field_a &&
          param1 == 50) {
          return 5;
        }
        if (TertiaryLinkNode.field_o.field_a < 4) {
          return -1;
        }
        return 1;
    }

    static {
        field_z = "is.A(";
    }
}
