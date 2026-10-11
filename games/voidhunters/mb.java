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
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)(var3 >> 24);
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)(var3 >> 16);
        if (param1 == 1724347896) {
          fieldTemp$2 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$2] = (byte)(var3 >> 8);
          fieldTemp$3 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$3] = (byte)var3;
          return;
        }
        field_i = false;
        int fieldTemp$4 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$4] = (byte)(var3 >> 8);
        int fieldTemp$5 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$5] = (byte)var3;
    }

    mb(int param0) {
        super(param0);
    }

    final void a(float param0, int param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = jaclib.memory.Stream.floatToRawIntBits(param0);
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)var3;
        if (param1 == 1059949744) {
          fieldTemp$1 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$1] = (byte)(var3 >> 8);
          fieldTemp$2 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$2] = (byte)(var3 >> 16);
          fieldTemp$3 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$3] = (byte)(var3 >> 24);
          return;
        }
    }

    final static void a(int param0, ml param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ml var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          for (var2_int = 0; var2_int < 4; var2_int++) {
            var3 = new ml(29);
            var3.a(param0 ^ -1688588311, 0, new ml(24));
            param1.a(1, var2_int, var3);
          }
          if (param0 == -1688588312) {
            return;
          }
          mb.f((byte) 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("mb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void h(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            if (param1 < 88) {
              return;
            }
            ia.a(new Object[]{new Integer(param0)}, vpa.b((byte) -107), "resizing", (byte) 88);
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_i = false;
        field_k = new String[]{"Move ship<br>Strafe<br>Fire weapons<br>Pick up scrap<br>Zoom the camera<br><br>Hold <col=ffaa00>shift</col> to access the command ring containing special orders such as repair mode.", "How to play<br><br>Build a custom ship out of scrap components, and fight others in a variety of game modes. Practice assembling awesome ships and fighting against computer-controlled opponents in sandbox mode, and jump into multiplayer when you feel ready.", "Combat<br><br>Aim and fire your weapons using the <col=ffaa00>left mouse button</col><br>Keep an eye on your energy meter in the lower right corner of the screen. Firing weapons deplete it, and if it hits zero you will be defenceless until it fully recharges.", "Building a Ship<br><br>Control your tractor beam using the <col=ffaa00>right mouse button</col><br>Pull scrap components from the battlefield and attach them to your ship. Attach additional hull pieces to increase the size of your ship and protect your core chassis.", "Blueprints<br><br>You can save your ship's blueprint in your databanks by pressing <savekey>. At any point, you can give your ship's AI control of the tractor beam and let it attempt to rebuild your blueprint by pressing <loadkey>. It will use any appropriate components nearby."};
    }
}
