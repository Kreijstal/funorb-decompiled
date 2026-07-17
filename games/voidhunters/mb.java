/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends ds {
    static String[] field_k;
    static boolean field_i;
    static int field_j;

    public static void f() {
        field_k = null;
    }

    final void b(float param0, int param1) {
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$6 = ((mb) this).field_e;
        ((mb) this).field_e = ((mb) this).field_e + 1;
        ((mb) this).field_h[fieldTemp$6] = (byte)(var3 >> 24);
        int fieldTemp$7 = ((mb) this).field_e;
        ((mb) this).field_e = ((mb) this).field_e + 1;
        ((mb) this).field_h[fieldTemp$7] = (byte)(var3 >> 16);
        if (param1 != 1724347896) {
          field_i = false;
          int fieldTemp$8 = ((mb) this).field_e;
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[fieldTemp$8] = (byte)(var3 >> 8);
          int fieldTemp$9 = ((mb) this).field_e;
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[fieldTemp$9] = (byte)var3;
          return;
        } else {
          int fieldTemp$10 = ((mb) this).field_e;
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[fieldTemp$10] = (byte)(var3 >> 8);
          int fieldTemp$11 = ((mb) this).field_e;
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[fieldTemp$11] = (byte)var3;
          return;
        }
    }

    mb(int param0) {
        super(param0);
    }

    final void a(float param0, int param1) {
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$4 = ((mb) this).field_e;
        ((mb) this).field_e = ((mb) this).field_e + 1;
        ((mb) this).field_h[fieldTemp$4] = (byte)var3;
        if (param1 != 1059949744) {
          return;
        } else {
          int fieldTemp$5 = ((mb) this).field_e;
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[fieldTemp$5] = (byte)(var3 >> 8);
          int fieldTemp$6 = ((mb) this).field_e;
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[fieldTemp$6] = (byte)(var3 >> 16);
          int fieldTemp$7 = ((mb) this).field_e;
          ((mb) this).field_e = ((mb) this).field_e + 1;
          ((mb) this).field_h[fieldTemp$7] = (byte)(var3 >> 24);
          return;
        }
    }

    final static void a(int param0, ml param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ml var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 4) {
                break L0;
              } else {
                var3 = new ml(29);
                var3.a(1, 0, new ml(24));
                param1.a(1, var2_int, var3);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("mb.A(").append(-1688588312).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static void h(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 >= 88) {
                  Object discarded$1 = ia.a(new Object[1], vpa.b((byte) -107), "resizing", (byte) 88);
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
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
