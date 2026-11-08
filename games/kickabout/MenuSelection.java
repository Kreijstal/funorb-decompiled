/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuSelection {
    static int[] field_f;
    private boolean field_g;
    static String field_j;
    private int field_i;
    private int field_b;
    private int field_h;
    private int field_d;
    int selectedIndex;
    int itemCount;
    static String field_k;
    static int field_c;

    public static void releaseStatics(byte param0) {
        if (param0 != -22) {
          MenuSelection.a(-29, -114, 127L);
        }
        field_k = null;
        field_j = null;
        field_f = null;
    }

    final static void a(int param0, int param1, long param2) {
        if (param0 < 57) {
          field_f = (int[]) null;
        }
        CipherPacketBuffer var4 = FootballerAiOverlaySupport.field_d;
        var4.b(param1, (byte) 120);
        var4.field_n = var4.field_n + 1;
        int var5 = var4.field_n;
        var4.writeByte(126, 7);
        var4.writeLong(param2, -1781890008);
        var4.backpatchByteLength(62, -var5 + var4.field_n);
    }

    final void a(int param0, int param1, int param2) {
        if (this.itemCount <= param1) {
          throw new IllegalArgumentException();
        }
        if (this.itemCount <= param2) {
          throw new IllegalArgumentException();
        }
        if (param0 != -21174) {
          this.field_b = -2;
        }
        this.field_b = 0;
        this.field_h = 0;
        if (0 != WidgetContainer.field_A) {
          this.field_g = true;
          this.field_i = WidgetContainer.field_A;
          this.field_h = WidgetContainer.field_A;
          this.selectedIndex = param2;
          this.field_d = PlayerArchetypeSortCriterion.field_q;
        }
        if (this.field_i != 0 &&
          FootballerAgent.field_p != 0) {
          if (0 >= this.field_d) {
            this.field_d = RasterGlowSupport.field_b;
          }
          this.field_d = this.field_d - 1;
        }
        if (WidgetContainer.field_A == 0 &&
          FootballerAgent.field_p == 0) {
          this.field_i = 0;
        }
        if (this.field_i == 0 && (this.field_g ||
          BytePlusOneCommand.field_C)) {
          if (param1 < 0) {
            if (this.field_g) {
              this.selectedIndex = -1;
            }
          } else {
            if (param1 != this.selectedIndex) {
            }
            this.field_g = true;
            this.selectedIndex = param1;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          return false;
        }
        return this.field_i != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.field_g = param3 ? true : false;
        this.field_i = param1;
        if (!this.field_g) {
          this.selectedIndex = param2;
        } else {
          this.selectedIndex = param0;
        }
    }

    final void handleArrowKeys(int param0, boolean param1) {
        this.field_b = 0;
        this.field_h = 0;
        if (0 == this.field_i &&
          FixedQuaternion.field_e == 96) {
          if (0 >= this.selectedIndex) {
            this.selectedIndex = this.itemCount;
          }
          this.field_g = false;
          this.selectedIndex = this.selectedIndex - 1;
        }
        if (!param1) {
          this.b(-93);
        }
        if (0 == this.field_i) {
          this.field_b = FixedQuaternion.field_e;
        }
        if (this.field_i == 0 &&
          97 == FixedQuaternion.field_e) {
          this.selectedIndex = this.selectedIndex + 1;
          if (this.selectedIndex >= this.itemCount) {
            this.selectedIndex = 0;
          }
          this.field_g = false;
        }
        if (this.field_i == 0 && (98 == FixedQuaternion.field_e ||
          99 == FixedQuaternion.field_e)) {
          if (this.selectedIndex < 0) {
            this.selectedIndex = param0;
          }
          this.field_g = false;
        }
    }

    final void selectIndex(byte param0, int param1) {
        if (param0 != 68) {
          return;
        }
        if (this.field_i == 0) {
          this.field_g = false;
          this.selectedIndex = param1;
        }
    }

    final boolean c(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != -1) {
          return true;
        }
        stackIn_8_0 = (this.field_h != 0) || (this.field_b == 84) || (this.field_b == 83);
        return stackIn_8_0;
    }

    final void d(int param0) {
        this.field_b = 0;
        this.field_h = 0;
        if (this.field_i == 0) {
          this.field_b = FixedQuaternion.field_e;
        }
        if (0 == this.field_i &&
          FixedQuaternion.field_e == 98) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.field_g = false;
        }
        if (param0 < 89) {
          return;
        }
        if (0 == this.field_i &&
          FixedQuaternion.field_e == 99) {
          this.selectedIndex = this.selectedIndex + 1;
          this.field_g = false;
          if (this.itemCount <= this.selectedIndex) {
            this.selectedIndex = 0;
          }
        }
    }

    final void b(int param0) {
        this.field_h = 0;
        this.field_b = 0;
        if (param0 != -99) {
          this.field_h = 117;
        }
        if (0 == this.field_i) {
          this.field_b = FixedQuaternion.field_e;
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        if (param2 != -127) {
          this.handleArrowKeys(-68, true);
        }
        this.field_g = param0 ? true : false;
        this.field_i = 0;
        if (this.field_g) {
          this.selectedIndex = param1;
        }
    }

    MenuSelection(int param0) {
        this.field_g = false;
        this.selectedIndex = 0;
        this.itemCount = param0;
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_j = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_k = "Search Results";
        field_f = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
          var4 = (long)((var0 << 1) - 1);
          var6 = (long)(1 + (var0 << 1));
          var2 = (int)((var4 * var4 >> 18) - 32768L);
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          if (var3 >= field_f.length) {
            var3 = field_f.length - 1;
          }
          for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
            field_f[var1] = var0;
          }
        }
        field_c = 20;
    }
}
