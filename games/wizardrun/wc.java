/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int field_c;
    private int field_g;
    String field_h;
    int field_i;
    int[] field_l;
    int field_d;
    static IntegerSyntaxHelpers field_j;
    static Sprite field_f;
    static int field_k;
    private long field_e;
    private String field_b;
    private boolean field_a;

    final static int a(int param0, int param1, int param2) {
        if (param0 != 29292) {
          field_j = (IntegerSyntaxHelpers) null;
        }
        if (ToggleButton.field_H == null) {
          return -1;
        }
        if (param2 >= GzipDecompressor.field_c && ToggleButton.field_H.width + GzipDecompressor.field_c > param2 && LoginForm.field_L <= param1 &&
          !(LoginForm.field_L + ToggleButton.field_H.height <= param1)) {
          return 0;
        }
        if (param2 >= IndexedSpriteArrayFactory.field_f && param2 < IndexedSpriteArrayFactory.field_f + ToggleButton.field_H.width && param1 >= ProxyAuthenticationException.field_b &&
          !(ToggleButton.field_H.height + ProxyAuthenticationException.field_b <= param1)) {
          return 1;
        }
        return -1;
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != 2) {
          field_j = (IntegerSyntaxHelpers) null;
        }
    }

    final int a(byte param0) {
        if (!this.field_a && (this.field_i != 2 ||
          this.field_g <= 0)) {
          if (param0 != 102) {
            this.field_i = -108;
          }
          if (~LevelData.field_e == ~this.field_e) {
            return 1;
          }
          if (DisplayNameValidator.field_k == 2 &&
            aa.a(this.field_b, (byte) -85)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    wc(boolean param0) {
        this.field_i = ByteStorage.field_e;
        this.field_g = RadixParsingHelpers.field_a;
        this.field_a = DisplayModeInfo.field_a;
        this.field_c = NodeHashTableIterator.field_g;
        this.field_h = vl.field_f;
        this.field_d = QuickChatPhraseDefinition.field_r;
        this.field_b = LevelData.field_b;
        if (!param0) {
          this.field_l = null;
        } else {
          this.field_l = PasswordValidator.field_m;
        }
        this.field_e = RadialSelectorWidget.field_N;
    }

    static {
    }
}
