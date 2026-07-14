/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends ds {
    static String[] field_k;
    static boolean field_i;
    static int field_j;

    public static void f(byte param0) {
        field_k = null;
        if (param0 > -92) {
            field_i = false;
        }
    }

    final void b(float param0, int param1) {
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param0);
        ((mb) this).field_e = ((mb) this).field_e + 1;
        ((mb) this).field_h[((mb) this).field_e] = (byte)(var3 >> 1724347896);
        ((mb) this).field_e = ((mb) this).field_e + 1;
        ((mb) this).field_h[((mb) this).field_e] = (byte)(var3 >> 1059949744);
        if (param1 != 1724347896) {
          field_i = false;
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[((mb) this).field_e] = (byte)(var3 >> -1688588312);
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[((mb) this).field_e] = (byte)var3;
          return;
        } else {
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[((mb) this).field_e] = (byte)(var3 >> -1688588312);
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[((mb) this).field_e] = (byte)var3;
          return;
        }
    }

    mb(int param0) {
        super(param0);
    }

    final void a(float param0, int param1) {
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param0);
        ((mb) this).field_e = ((mb) this).field_e + 1;
        ((mb) this).field_h[((mb) this).field_e] = (byte)var3;
        if (param1 != 1059949744) {
          return;
        } else {
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[((mb) this).field_e] = (byte)(var3 >> 1556848168);
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[((mb) this).field_e] = (byte)(var3 >> 126953520);
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[((mb) this).field_e] = (byte)(var3 >> -1646179976);
          return;
        }
    }

    final static void a(int param0, ml param1) {
        int var2 = 0;
        ml var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        var2 = 0;
        L0: while (true) {
          if (-5 >= (var2 ^ -1)) {
            if (param0 != -1688588312) {
              mb.f((byte) 4);
              return;
            } else {
              return;
            }
          } else {
            var3 = new ml(29);
            var3.a(param0 ^ -1688588311, 0, new ml(24));
            param1.a(1, var2, var3);
            var2++;
            continue L0;
          }
        }
    }

    final static void h(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param1 >= 88) {
                Object discarded$1 = ia.a(new Object[1], vpa.b((byte) -107), "resizing", (byte) 88);
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_k = new String[]{"Move ship<br>Strafe<br>Fire weapons<br>Pick up scrap<br>Zoom the camera<br><br>Hold <col=ffaa00>shift</col> to access the command ring containing special orders such as repair mode.", "How to play<br><br>Build a custom ship out of scrap components, and fight others in a variety of game modes. Practice assembling awesome ships and fighting against computer-controlled opponents in sandbox mode, and jump into multiplayer when you feel ready.", "Combat<br><br>Aim and fire your weapons using the <col=ffaa00>left mouse button</col><br>Keep an eye on your energy meter in the lower right corner of the screen. Firing weapons deplete it, and if it hits zero you will be defenceless until it fully recharges.", "Building a Ship<br><br>Control your tractor beam using the <col=ffaa00>right mouse button</col><br>Pull scrap components from the battlefield and attach them to your ship. Attach additional hull pieces to increase the size of your ship and protect your core chassis.", "Blueprints<br><br>You can save your ship's blueprint in your databanks by pressing <savekey>. At any point, you can give your ship's AI control of the tractor beam and let it attempt to rebuild your blueprint by pressing <loadkey>. It will use any appropriate components nearby."};
    }
}
